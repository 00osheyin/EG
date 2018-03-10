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
public class EGQ2 {

    Node [] nodes = new Node[6];
    Link[] links = new Link[5];
    public static void main(String[] args) {
       
       EGQ2 t = new EGQ2();
       Node[] nodes = t.nodes;
       Link[] links = t.links;
       for (int i =0; i<6;i++){
           t.nodes[i]= new Node(i);
       }
       
       links[0]= new Link(nodes[0],nodes[1]);
       links[1]= new Link(nodes[1],nodes[2]);
       links[2]= new Link(nodes[0],nodes[3]);
       links[3]= new Link(nodes[3],nodes[4]);
       links[4]= new Link(nodes[0],nodes[5]);
       int[] amountOfConnections= new int[6];
      for (int i=0;i<amountOfConnections.length;i++){
          amountOfConnections[i] = t.getConnectionsPerNode(nodes[i]);
          System.out.println(amountOfConnections[i]);
      }
     
    }
    public int getConnectionsPerNode(Node node){
        int amountOfLinks=0;
        for (Link i:links){
            Node[] nodes=i.getNodes();
            for (Node j : nodes){
                if(j.getId()==node.getId()){
                    amountOfLinks++;
                }
            }
        }
        return amountOfLinks;
    }
}
