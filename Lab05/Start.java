package cvut;


public class Start {

    public static void main(String[] args) {

        TreeImpl tree = new TreeImpl();
        tree.setTree(new int[] {1, 2, 3, 4, 5, 6, 7});
        System.out.println(tree.toString());
    }
}