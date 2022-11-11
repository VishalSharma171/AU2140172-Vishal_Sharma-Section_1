/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Vishal Sharma
 */
class Traversal{
    
    TreeNode root;
    
    public Traversal(TreeNode root){
        
        this.root = root;
    }
    public void inorder(){
        
        if(root == null){
            
            System.out.println("[]");
            return;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> traversal = new ArrayList<>();
        System.out.println("InOrder Traversal: ");

        TreeNode count = root;
        while(count != null || stack.size() > 0){
            while(count != null){
                stack.push(count);
                count = count.left;
            }
            
            count = stack.pop();
            traversal.add(count.data);

            count = count.right;
        }

        print(traversal);
        
    }
    public void preorder(){
        
        if(root == null){
            
            System.out.println("[]");
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> traversal = new ArrayList<>();
        
        System.out.println("PreOrder Traversal: ");

        TreeNode cnt = root;
        while(cnt != null || stack.size() > 0){
            while(cnt != null){
                traversal.add(cnt.data);

                stack.push(cnt);
                cnt = cnt.left;
            }
            
            cnt = stack.pop();
            cnt = cnt.right;
        }

        print(traversal);
    }
    public void PostOrder(){
        
        if(root == null){
            
            System.out.println("[]");
            return;
            
        }
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> travel = new ArrayList<>();
        System.out.println("PostOrder Traversal: ");

        TreeNode count = root;
        while(count != null || stack.size() > 0){
            
            while(count != null){
                
                if(count.right != null){
                    
                    stack.push(count.right);
                    stack.push(count);
                    stack.peek();
                    count = count.left;
                }
                
                else{
                    
                    stack.push(count);
                    count = count.left;
                }
            }
            
            while(count == null){
                count = stack.pop();
                if(stack.size() == 0){
                    travel.add(count.data);

                    count = null;
                    break;
                }
                
                if(count.right != stack.peek()){
                    travel.add(count.data);

                    count = null;
                }
                
                else{
                    
                    TreeNode temp = stack.pop();
                    stack.push(count);
                    count = temp;
                }
            }
        }

        print(travel);
    }
    public void print(ArrayList<Integer> travel){
        
        System.out.print("[");
        for (int i = 0; i < travel.size(); i++) {
            
            if(i == travel.size() - 1){
                
                System.out.print(travel.get(i) + "]\n");
            }
            
            else{
                
                System.out.print(travel.get(i) + ", ");
                
            }
        }
    }
}
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data = data;
    }
    public void left(TreeNode left){
        this.left = left;
    }
    public void right(TreeNode right){
        this.right = right;
    }
}
public class Q1_TreeTraversal {
     public static void main(String[] args) {

        TreeNode A = new TreeNode(10);
        TreeNode B = new TreeNode(20);
        TreeNode C = new TreeNode(30);
        TreeNode D = new TreeNode(40);
        TreeNode E = new TreeNode(50);
        TreeNode F = new TreeNode(60);
        TreeNode G = new TreeNode(70);
        TreeNode H = new TreeNode(80);
        TreeNode I = new TreeNode(90);
        TreeNode J = new TreeNode(100);
        A.left(B);
        A.right(C);
        B.left(D);
        B.right(E);
        C.left(F);
        C.right(G);
        D.right(H);
        F.right(I);
        G.left(J);
        Traversal tree = new Traversal(A);
        tree.inorder();
        tree.preorder();
        tree.PostOrder();
    }
}
