public class q17
{
    static class Node
    {
        String data;
        Node left, right;
    };

    static Node newNode(String data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    static void printLeafNodes(Node root)
    {

        if (root == null)
            return;

        if (root.left == null && root.right == null)
        {
            System.out.print( root.data +" ");
            return;
        }

        if (root.right != null)
            printLeafNodes(root.right);


        if (root.left != null)
            printLeafNodes(root.left);
    }


    public static void main(String args[])
    {
        Node root = newNode("A");
        root.left = newNode("B");
        root.right = newNode("F");
        root.left.left = newNode("C");
        root.left.right = newNode("E");
        root.right.left = newNode("G");
        root.right.right = newNode("H");
        root.left.left.left = newNode("D");
        root.right.right.right= newNode("K");
        printLeafNodes(root);
    }
}