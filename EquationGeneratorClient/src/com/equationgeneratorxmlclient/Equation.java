package com.equationgeneratorxmlclient;

/**
 * @author LordTusha Forbes
 */

class Equation {
    
    private int leftOperand, rightOperand, results;
    private String operationType;
    
    public Equation() {
        
        this(0, 0, "add");
    }//end no arg constructor*/
    
    public Equation(int leftValue, int rightValue, String type) {
        
        leftOperand = leftValue;
        rightOperand = rightValue;
        
        if (type.equals("add")) {
            
            results = leftOperand + rightOperand;
            operationType = "+";
        }//end if
        else if (type.equals("subtract")) {
            
            results = leftOperand - rightOperand;
            operationType = "-";
        }//end if
        else if (type.equals("multiply")){
            
            results = leftOperand * rightOperand;
            operationType = "x";
        }//end if
    }//end arg constructor
    
    public void setLeftOperand( int leftOperand) {
        
        this.leftOperand = leftOperand;
    }//end setLeftOperand
    
    public int getLeftOperand() {
        
        return leftOperand;
    }//end getLeftOperand
    
    public void setRightOperand(int rightOperand) {
        
        this.rightOperand = rightOperand;
    }//end setRightOperand
    
    public int getRightOperand() {
        
        return rightOperand;
    }//end getRightOperand
    
    public void setResults(int results) {
        
        this.results = results;
    }//end setResults
    
    public int getResults() {
        
        return results;
    }//end getResults
    
    public void setOperationType(String operationType) {
        
        this.operationType = operationType;
    }//end setOperationType
    
    public String getOperationType() {
        
        return operationType;
    }//end getOperationType
    
    public String getLeftHandSide() {
        
        return leftOperand + " " + operationType + " " + rightOperand;
    }//end getLeftHandSide
    
    public String getRightHandSide() {
        
        return "" + results;
    }//end getRightHandSide
    
    public String toString() {
        
        return getLeftHandSide() + " = " + getRightHandSide();
    }//end toString
}//end Equation
