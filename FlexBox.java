/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexbox;

/**
 *
 * @author Jon
 */
public class FlexBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //width, length, height
        Type1 box1 = new Type1(2, 4, 4, 1, true, 1);
        box1.printCost();
        System.out.println(box1.basicCost);
        System.out.println(box1.costMod);
        
        Type2 box2 = new Type2(2, 4, 4, 2, 1, true, 1);
        box2.printCost();
        System.out.println(box2.basicCost);
        System.out.println(box2.costMod);
        
        
    }
    
}
