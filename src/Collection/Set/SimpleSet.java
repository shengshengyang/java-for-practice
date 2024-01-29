package Collection.Set;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * 自行實踐一些set 的方法
 * @param <E>
 */
public class SimpleSet<E> implements Set<E> {
    private Object[] elements;
    private int size = 0;

    public SimpleSet() {
        elements = new Object[10];  // 初始容量設為 10
    }

    @Override
    public boolean add(E e) {
        if (!contains(e)) {
            if (size == elements.length) {
                increaseCapacity();  // 如果陣列滿了，增加容量
            }
            elements[size++] = e;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    private void increaseCapacity() {
        Object[] newElements = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    // 其他必須實現的方法（如 remove, size, iterator 等）在此省略

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                return (E) elements[currentIndex++];
            }

            // iterator 的 remove 方法在此省略
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    // ... 省略其他方法的實現 ...
}
