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
public class Link {
    Node one;
    Node two;
    int label;
    Link(Node one,Node two){
        this.one=one;
        this.two=two;
    }
    public void setLabel(int label){
        this.label= label;
    } 
    public int getLabel(){
        return this.label;
    }
    public Node[] getNodes(){
        return new Node[]{one,two};
    }
}
