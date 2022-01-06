public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree bt = new BinaryTree();
        //no cap
        int[] nodes = {7, 12, 4, 8, 6, 13, 14, 78, 24, 2};

        for(int n : nodes){
            bt.add(n);
        }

        System.out.println(bt);
    }
}
