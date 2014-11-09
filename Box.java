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
public class Box {
    
    double height;
    double width;
    double length;
    double basicCost;
    int grade;
    double costMod = 0.0;
    int quantity;
    boolean sealTop;
    String errorPrompt = "Error: ";
    
    public Box(){
    }
    
    public Box(double width, double length, double height, int grade, boolean sealTop, int quantity){
    //type 1  
       // if (gradeCheck(grade, 1) && colourCheck(0, 1)){ PUT VALIDATION IN ONE?
            this.width = width;
            this.length = length;
            this.height = height;
            this.sealTop = sealTop;
            this.quantity = quantity;
            this.grade = grade;
            
       // }
    }
    
    public Box(double width, double length, double height, int grade, int colour, boolean sealTop, int quantity){
    //type 2
       //  if (gradeCheck(grade, 2) && colourCheck(colour, 2)){ PUT VALIDATION IN ONE?
            this.width = width;
            this.length = length;
            this.height = height;
            this.sealTop = sealTop;
            this.quantity = quantity;
            this.grade = grade;
      //  }
    }
    
    public Box(double width, double length, double height, int grade, int colour, boolean reinfBottom, boolean reinfCorner, boolean sealTop, int quantity){
    //type 3 - 5    
        this.width = width;
        this.length = length;
        this.height = height;
        this.sealTop = sealTop;
        this.quantity = quantity;
        this.grade = grade;
        
    }
    
    public double area(){
    //calculates the area, assumes flaps overlap.
        double area;
        area = 2 *(height * length); //long sides
        area += 2 * (height * width); //short sides
        area = area + (2 * (width * length)); //bottom & top flaps
        return area;
    }
    
    public void addMod(double mod){
    //allows an int value to be used instead of 0.0x to reduce complexity.
        costMod = costMod + (mod / 100);        
    }
    
    public void basicCost(int grade){
    //basic costs of each grade, needs to figure out the formula.
        if (grade == 1)
            basicCost = 0.50;
        if (grade == 2)
            basicCost = 0.59;
        if (grade == 3)
            basicCost = 0.70;
        if (grade == 4)
            basicCost = 0.92;
        if (grade == 5)
            basicCost = 1.35;
    }
    
    public double cost(){
    //calculates total cost. Basic cost + Modifiers x Area x Quantity
        double cost;
        basicCost = basicCost + (basicCost * costMod);
        cost = (area() * basicCost);
        cost = cost * quantity;
        return cost;
    }
    
    public void printCost(){
    //Prints Cost, can be expanded upon.
        if (cost() == 0.0){
            System.out.println("£N/A");
        }
        else{
            System.out.println("£" +cost());
        }
    }
    
    public boolean gradeCheck(int grade, int type){
    // Checks that the specified GRADE is compatible with the box TYPE
        if(type == 1 && grade >=1 && grade <=3)
            return true;
        else if(type == 2 && grade >=2 && grade <=4)
            return true;
        else if((type == 3 || type == 4) && grade >=2 && grade <=5)
            return true;
        else if(type == 5 && grade >=3 && grade <=5)
            return true;
        else
            System.out.println("Invalid");
            return false;
    }
    
    public boolean colourCheck(int colour, int type){
    //Checks that the specified number of COLOURS is compatible with the box TYPE
        if (type == 1 && colour ==0)
            return true;
        else if (type == 2 && colour == 1) {
            return true;
        }
        else if ((type >= 3 && type <= 5) && colour == 2){
            return true;
        }
        else
            return false;
    }
    
    public void hasSealTop(boolean answer){
        if (answer){
            addMod(6);
        }
    }
    
    public void printError(){
        System.out.println(errorPrompt);
    }
    
}
