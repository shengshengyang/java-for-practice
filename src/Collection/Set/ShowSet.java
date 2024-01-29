package Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ShowSet {
    
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Cherry");
        treeSet.add("Banana");
        treeSet.add("Apple");
        // 自動升序排序
        System.out.println("-----TreeSet-----");
        for(String fruit : treeSet){
            System.out.println(fruit);
        }

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        // 迭代將按照添加順序
        System.out.println("-----LinkedHashSet-----");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }


        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Cherry");
        hashSet.add("Banana");
        hashSet.add("Apple");
        // 迭代可能不會按照添加順序
        System.out.println("-----HashSet-----");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

    }


}
