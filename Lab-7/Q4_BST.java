/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Vishal Sharma
 */
class BinarySearchTree{
    
    TreeNode root;
    
    
    public BinarySearchTree(){
        
        this.root = null;
    }
    
    public void Insert(int data){
        
        root = Insert(root, data);
    }
    
    
    private TreeNode Insert(TreeNode root, int data){
        
        if(root == null){
            
            root = new TreeNode(data);
            return root;
            
        }
        else if(data < root.data){
            
            root.left = Insert(root.left, data);
            
        }
        else if(data > root.data){
            
            root.right = Insert(root.right, data);
            
        }
        
        return root;
    }
}
public class Q4_BST {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        BinarySearchTree BST = new BinarySearchTree();
        
        int size;
        System.out.print("Enter the size of bst : ");
        size = sc.nextInt();
        int[] BSTarr = new int[size];
        
        
        for (int i = 0; i < size; i++) {
            
            BSTarr[i] = sc.nextInt();
            
        }
        System.out.println(Arrays.toString(BSTarr));
        for (int data: BSTarr) {
            BST.Insert(data);
        }
        Traversal travel = new Traversal(BST.root);
        
        travel.inorder();
    }
}
