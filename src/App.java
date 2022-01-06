public class App {
    public static void main(String[] args) throws Exception {
        // // BINARY TREE
        // BinaryTree bt = new BinaryTree();
        // // no cap
        // int[] nodes = { 7, 12, 4, 8, 6, 13, 14, 78, 24, 2 };

        // for (int n : nodes) {
        //     bt.add(n);
        // }

        // System.out.println(bt);

        // BINARY HEAP
        BinaryHeap bh = new BinaryHeap();

        int[] Nodes = { 1, 12, 3, 24, 7, 19, 1, 50, 16 };

        for(int n : Nodes){
        bh.heap.add(n);
        }

        System.out.println(bh.heap);
    }

}
