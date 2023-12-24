package Tree.Ex1;

public class SimpleTree {
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;
        public Node(int value){
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }
    }
    private Node root;

    public void insert(int value){
        Node node = new Node(value);

        if(root == null){
            root = node;
            return;
        }

        Node current = root;

        while(true){
            if(value < current.value){
                if(current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else{
                if(current.rightChild == null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }
    public boolean find(int value){
        Node current = root;
        while(current != null) {
            if (value < current.value) {
                current = current.leftChild;
            }else if(value > current.value){
                current = current.rightChild;
            } else{
                return true;
            }
        }
        return false;
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node root){
        // Pre-Order: Root, Left, Right

        if(root == null) return; // base condition

        // root
        System.out.print(root.value + " ");

        // left
        preOrder(root.leftChild);

        // right
        preOrder(root.rightChild);
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node root){
        // In-Order: Left, Root, Right

        if(root == null) return; // base condition

        // left
        inOrder(root.leftChild);

        // root
        System.out.print(root.value + " ");

        // right
        inOrder(root.rightChild);

//        // In-Order: Right, Root, Left
//        // right
//        inOrder(root.rightChild);
//
//        // root
//        System.out.println(root.value);
//
//        // left
//        inOrder(root.leftChild);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node root){
        // Post-Order: Left, Right, Root

        if(root == null) return; // base condition

        // left
        inOrder(root.leftChild);

        // right
        inOrder(root.rightChild);

        // root
        System.out.print(root.value + " ");
    }

    // calculate the height of tree
    public int height(){
        return height(root);
    }
    private int height(Node root){
        if(root == null) return -1;
        if(root.leftChild == null && root.rightChild == null) return 0; // base condition
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }
    public void getNodesAtDistance(int distance){
        getNodesAtDistance(root, distance);
    }
    private void getNodesAtDistance(Node root, int distance){
        if(root == null) return;

        // base condition
        if(distance == 0){
            System.out.print(root.value + " ");
            return;
        }

        getNodesAtDistance(root.leftChild, distance - 1);
        getNodesAtDistance(root.rightChild, distance - 1);
    }

    // breadth first traversal
    public void traversalLevelOrder(){
        for (int i = 0; i <= height(); i++) {
            getNodesAtDistance(i);
            System.out.println();
        }
    }
}
class SimpleTreeTest{
    public static void main(String[] args) {
        SimpleTree simpleTree = new SimpleTree();
        simpleTree.insert(7);
        simpleTree.insert(4);
        simpleTree.insert(9);
        simpleTree.insert(1);
        simpleTree.insert(6);
        simpleTree.insert(8);
        simpleTree.insert(10);

//        System.out.println(simpleTree.find(9));
//        System.out.println(simpleTree.find(15));
//        System.out.println(simpleTree.find(0));

        System.out.println("Depth-first Pre-Order");
        simpleTree.preOrder();
        System.out.println();

        System.out.println("Depth-first In-Order");
        simpleTree.inOrder();
        System.out.println();

        System.out.println("Depth-first Post-Order");
        simpleTree.postOrder();
        System.out.println();

        System.out.println("Height of tree: " + simpleTree.height());

        System.out.println("Depth");
        simpleTree.getNodesAtDistance(2); // depth 2
        System.out.println();

        System.out.println("Breadth first traversal");
        simpleTree.traversalLevelOrder();
    }
}
