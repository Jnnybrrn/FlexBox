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
public class Type345 extends Box {
    
    boolean reinfBot;
    boolean reinfCorn;
    
    public Type345(double width, double length, double height, int grade, int colour, boolean reinfBottom, boolean reinfCorner, boolean sealTop, int quantity){
        super(width, length, height, grade, colour, reinfBottom, reinfCorner, sealTop, quantity);
        addMod(15); //2 colours
        hasSealTop(sealTop);
        basicCost(grade);
        reinfBot = reinfBottom;
        reinfCorn = reinfCorner;
        
    }
    
    public void basicCost(int grade){
    //basic costs of each grade, needs to figure out the formula.
        if (grade == 2)
            if (reinfBot && reinfCorn){
                errorPrompt += "Incorrect grade.";
                printError();
            }
            else {
                basicCost = 0.59;
            }
        else if (grade == 3)
            basicCost = 0.70;
        else if (grade == 4)
            basicCost = 0.92;
        else if (grade == 5)
            basicCost = 1.35;
        else {
            errorPrompt += "Incorrect grade.";
            printError();
        }
    }
}
