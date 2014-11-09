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
public class Type1 extends Box{
    
    public Type1(){
    }
    
    public Type1(double width, double length, double height, int grade, boolean sealTop, int quantity){
        super(width, length, height, grade, sealTop, quantity);
        hasSealTop(sealTop);
        basicCost(grade);
    }
    
    public void basicCost(int grade){
    //basic costs of each grade, needs to figure out the formula.
        if (grade == 1)
            basicCost = 0.50;
        else if (grade == 2)
            basicCost = 0.59;
        else if (grade == 3)
            basicCost = 0.70;
        else {
            System.out.println("grade = " + grade);
            errorPrompt += "Incorrect grade.";
            printError();
        }
    }
}
