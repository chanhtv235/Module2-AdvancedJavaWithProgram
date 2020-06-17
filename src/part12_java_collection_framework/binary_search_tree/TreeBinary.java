package part12_java_collection_framework.binary_search_tree;

public class TreeBinary {
    NodeTree root;
    TreeBinary(){
        root=null;
    }
    public void deleteKey(int key){
        root=deleteRec(root,key);
    }
    NodeTree deleteRec(NodeTree root, int key){
        if(root==null) return root;
        if (key<root.key){
            root.left=deleteRec(root.left,key);
        }else if(key>root.key){
            root.right=deleteRec(root.right,key);
        }else {
            if(root.left==null)return root.right;
            if (root.right==null)return root.left;
            root.key=minValue(root.right);
            root.right=deleteRec(root.right,root.key);
        }
        return root;
    }
    int minValue(NodeTree root){
        int minv=root.key;
        while (root.left!=null){
            minv=root.left.key;
            root=root.left;
        }
        return minv;
    }
    void insert(int key){
        root=insertRec(root,key);
    }
    NodeTree insertRec(NodeTree root, int key){
        if (root==null){
            root=new NodeTree(key);
            return root;
        }
        if (key<root.key){
            root.left=insertRec(root.left,key);
        }else if (key>root.key){
            root.right=insertRec(root.right,key);
        }
        return root;
    }
    void sort(){
        sortRec(root);
    }
    void sortRec(NodeTree root){
        if (root!=null){
            sortRec(root.left);
            System.out.println(root.key +" ");
            sortRec(root.right);
        }
    }
}
