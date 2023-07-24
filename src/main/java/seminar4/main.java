package seminar4;

public class main {

    public static void main(String[] args) {

        hashTable<String, Integer> table = new hashTable<>();

        table.add("Hello", 5);
        table.add("Hello1", 15);
        table.add("Hello2", 1);
        table.add("Hello3", 175);

        table.print();

        BinTree btree = new BinTree();

        btree.add(5);
        btree.add(7);
        btree.add(0);
        btree.add(1);
        btree.add(15);

        System.out.println(btree.contain(5));
        System.out.println(btree.contain(7));
        System.out.println(btree.contain(0));
        System.out.println(btree.contain(1));
        System.out.println(btree.contain(15));

    }
}
