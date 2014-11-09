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
public class Type2 extends Box {
        
    public Type2(){
    }
    
    public Type2(double width, double length, double height, int grade, int colour, boolean sealTop, int quantity){
        super(width, length, height, grade, colour, sealTop, quantity);
        addMod(12); // for the one colour
        hasSealTop(sealTop);
        basicCost(grade);
    }
    
     public void basicCost(int grade){
    //basic costs of each grade, needs to figure out the formula.
        if (grade == 2)
            basicCost = 0.59;
        else if (grade == 3)
            basicCost = 0.70;
        else if (grade == 4)
            basicCost = 0.92;
        else
            errorPrompt += "Incorrect grade.";
            printError();
        }
    

    
}
