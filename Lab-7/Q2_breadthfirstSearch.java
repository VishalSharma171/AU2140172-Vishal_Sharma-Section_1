/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Vishal Sharma
 */

class Level_Order_Node {
    int value;
    List<Level_Order_Node> Children;

    
    public Level_Order_Node(int value) {
        
        this.value = value;
        this.Children = new ArrayList<>();
        
    }

    public int getValue() {
        
        return value;
        
    }

    
    public Level_Order_Node addChildren(int value){
        
        Level_Order_Node newChildren = new Level_Order_Node(value);
        Children.add(newChildren);
        return newChildren;
    }

    public List<Level_Order_Node> getChildren(){
        return this.Children;
    }
}

class Breadth_first_traversal{
    
    Level_Order_Node root;

    
    public void level_order (Level_Order_Node root){
        
        Queue<Level_Order_Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            
            Level_Order_Node temp = q.remove();
            System.out.print(temp.value + " ");
            q.addAll(temp.getChildren());
            
        }
    }

}
public class Q2_breadthfirstSearch {
    
    public static void main(String[] args) {
        
         Breadth_first_traversal bfs = new Breadth_first_traversal();
         
        Level_Order_Node root = new Level_Order_Node(10);
        Level_Order_Node Children1 = root.addChildren(50);
        Level_Order_Node Children2 = root.addChildren(500);
        Level_Order_Node Children3 = root.addChildren(150);

        Level_Order_Node children1_children1 = Children1.addChildren(890);
        Level_Order_Node children1_children2 = Children1.addChildren(1000);
        Level_Order_Node children1_children3 = Children1.addChildren(60);

        Level_Order_Node children2_children1 = Children2.addChildren(540);
        Level_Order_Node children2_children2 = Children2.addChildren(30);

        Level_Order_Node children3_children1 = Children3.addChildren(750);

        Level_Order_Node children1_children1_children1 = children1_children1.addChildren(5000);
        Level_Order_Node children1_children1_children2 = children1_children1.addChildren(220);
        Level_Order_Node children1_children1_children3 = children1_children1.addChildren(10);

        bfs.level_order(root);
    }
        
    }
    

