/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.q2;
/**
 *
 * @author Vlad1
 */
public class Node {
    private int id;
    private int label;
    Node(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setLabel(int label){
        this.label = label;
    }
    public int getLabel(){
        return label;
    }
}
