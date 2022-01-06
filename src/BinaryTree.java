public class BinaryTree {
    Node root;

    //inserting a new node into the binary tree
    public Node insertNode(Node current, int key){
        //checks to see if the current we are trying to insert is null
        if(current == null){
            //return a new instance of the node with the given key
            return new Node(key);
            //if the current key is less than the node we're trying to get
        } else if( key < current.getKey()){ 
            // insert the new node on the left side of the binary tree
            current.setLeftNode(insertNode(current.getLeftNode(), key));
            // if the current key is greater than the node we're trying to get
        }else if(key > current.getKey()){
            //insert the new node on the right side of the binary tree
            current.setRightNode(insertNode(current.getRightNode(), key));
        } else {
            return current;
        }
        return current;
    }

    public void add(int key){
        root = insertNode(root, key);
    }

    //java dum dum need toString
    @Override
    public String toString() {
        return "BinaryTree [root=" + root + "]";
    }
    
}
