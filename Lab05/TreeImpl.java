package cvut;


public class TreeImpl implements Tree {

    public Node root;
    public int[] values;
    public String result;


    @Override
    public void setTree(int[] values) {
        this.values = values;
        root = newTree(values, 0, values.length);
    }

    public Node newTree(int[] values, int head, int tail) {
        if(head >= tail){
            return null;
        } else {
            int midIndex = (head + tail)/2;

            NodeImpl node = new NodeImpl(values[midIndex]);

            node.setLeft(newTree(values, head, midIndex));
            node.setRight(newTree(values, midIndex + 1, tail));

            return node;
        }
    }

    @Override
    public Node getRoot() {
        if (this.isEmpty()) {
            return null;
        } else {
            return root;
        }
    }

    @Override
    public String toString() {
        return printTree(root, 0);
    }

    public String printTree(Node root, int depth) {
        if(root == null) {
            return "";
        } else {
            result = "";

            for(int i = 0; i < depth; i++) {
                result += " ";
            }

            int value = root.getValue();

            result += "- " + value + "\n";

            if(root.getLeft() != null) {
                result += printTree(root.getLeft(), depth + 1);
            }

            if(root.getRight() != null) {
                result += printTree(root.getRight(), depth + 1);
            }

            return result;
        }
    }

    public Boolean isEmpty() {
        if(this.values.length == 0) {
            return true;
        } else {
            return false;
        }
    }


}
