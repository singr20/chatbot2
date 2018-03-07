import java.util.*;

/**
 * Raunaq Singh and David Huang
 * Our bot responds to calculation quieries as the fastest calculator in existence.
 * Keywords: +, -, /, *, plus, minus, divided by, times
 * We chose these keywords because they are the most common ways to refer to the four most common math operations. 
 */
public class chatbot
{
    /**
     * Get a default greeting
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello. Did you know I am the world's fastest calculator? Try me.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "Testing";
        int firstNum = 0;
        int secondNum = 0;
        response = getRandomResponse();
        
        if(findKeyword(statement, "fuck", 0) > -1){
            
        }
        
        if(findKeyword(statement, "I want", 0) > -1){
            statement = statement.replaceAll("[.^:,!?]","");
            response = "Would you really be happy if you had " + statement.substring(7) + "?";
        }
        
        if(findKeyword(statement, "I", 0) > -1 && findKeyword(statement, "you", 0) > -1){
            String middle = statement.substring(findKeyword(statement, "I", 0) + 1, findKeyword(statement, "you", 0));
            middle = middle.substring(1,middle.length()-1);
            if(middle.indexOf(" ") == -1) // make sure that between I and you there is only 1 word
                response = "Why do you " + middle + " me?";
        }
        
        if(findKeyword(statement, "+", 0) > -1){
            String statement2 = " " + statement + " ";
            statement2 = statement2.replaceAll("[.^:,!?]","");
            for(int i = statement2.indexOf("+") - 2; i > 0; i --){
                if(statement2.substring(i-1,i).equals(" ")){
                    firstNum = Integer.parseInt(statement2.substring(i,statement2.indexOf("+") - 1));
                    break;
                }
            }
            for(int i = statement2.indexOf("+") + 2; i < statement2.length(); i++){
                if(statement2.substring(i,i+1).equals(" ")){
                    secondNum = Integer.parseInt(statement2.substring(statement2.indexOf("+") + 2,i));
                    break;
                }
            }
            
            int sum = firstNum + secondNum;
            response = "" + sum;
        }
        
        if(findKeyword(statement, "plus", 0) > -1){
            String statement2 = " " + statement + " ";
            statement2 = statement2.replaceAll("[.^:,!?]","");
            for(int i = statement2.indexOf("plus") - 2; i > 0; i --){
                if(statement2.substring(i-1,i).equals(" ")){
                    firstNum = Integer.parseInt(statement2.substring(i,statement2.indexOf("plus") - 1));
                    break;
                }
            }
            for(int i = statement2.indexOf("plus") + 5; i < statement2.length(); i++){
                if(statement2.substring(i,i+1).equals(" ")){
                    secondNum = Integer.parseInt(statement2.substring(statement2.indexOf("plus") + 5,i));
                    break;
                }
            }
            
            int sum = firstNum + secondNum;
            response = "" + sum;
        }
        
        if(findKeyword(statement, "-", 0) > -1){
            String statement2 = " " + statement + " ";
            statement2 = statement2.replaceAll("[.^:,!?]","");
            for(int i = statement2.indexOf("-") - 2; i > 0; i --){
                if(statement2.substring(i-1,i).equals(" ")){
                    firstNum = Integer.parseInt(statement2.substring(i,statement2.indexOf("-") - 1));
                    break;
                }
            }
            for(int i = statement2.indexOf("-") + 2; i < statement2.length(); i++){
                if(statement2.substring(i,i+1).equals(" ")){
                    secondNum = Integer.parseInt(statement2.substring(statement2.indexOf("-") + 2,i));
                    break;
                }
            }
            
            int diff = firstNum - secondNum;
            response = "" + diff;
        }
        
        if(findKeyword(statement, "minus", 0) > -1){
            String statement2 = " " + statement + " ";
            statement2 = statement2.replaceAll("[.^:,!?]","");
            for(int i = statement2.indexOf("minus") - 2; i > 0; i --){
                if(statement2.substring(i-1,i).equals(" ")){
                    firstNum = Integer.parseInt(statement2.substring(i,statement2.indexOf("minus") - 1));
                    break;
                }
            }
            for(int i = statement2.indexOf("minus") + 6; i < statement2.length(); i++){
                if(statement2.substring(i,i+1).equals(" ")){
                    secondNum = Integer.parseInt(statement2.substring(statement2.indexOf("minus") + 6,i));
                    break;
                }
            }
            
            int diff = firstNum - secondNum;
            response = "" + diff;
        }
        
        if(findKeyword(statement, "/", 0) > -1){
            String statement2 = " " + statement + " ";
            statement2 = statement2.replaceAll("[.^:,!?]","");
            for(int i = statement2.indexOf("/") - 2; i > 0; i --){
                if(statement2.substring(i-1,i).equals(" ")){
                    firstNum = Integer.parseInt(statement2.substring(i,statement2.indexOf("/") - 1));
                    break;
                }
            }
            for(int i = statement2.indexOf("/") + 2; i < statement2.length(); i++){
                if(statement2.substring(i,i+1).equals(" ")){
                    secondNum = Integer.parseInt(statement2.substring(statement2.indexOf("/") + 2,i));
                    break;
                }
            }
            
            int quot = firstNum/secondNum;
            response = "" + quot;
        }
        
        if(findKeyword(statement, "divided by", 0) > -1){
            String statement2 = " " + statement + " ";
            statement2 = statement2.replaceAll("[.^:,!?]","");
            for(int i = statement2.indexOf("divided by") - 2; i > 0; i --){
                if(statement2.substring(i-1,i).equals(" ")){
                    firstNum = Integer.parseInt(statement2.substring(i,statement2.indexOf("divided by") - 1));
                    break;
                }
            }
            for(int i = statement2.indexOf("divided by") + 11; i < statement2.length(); i++){
                if(statement2.substring(i,i+1).equals(" ")){
                    secondNum = Integer.parseInt(statement2.substring(statement2.indexOf("divided by") + 11,i));
                    break;
                }
            }
            
            int diff = firstNum/secondNum;
            response = "" + diff;
        }
        
        if(findKeyword(statement, "*", 0) > -1){
            String statement2 = " " + statement + " ";
            statement2 = statement2.replaceAll("[.^:,!?]","");
            for(int i = statement2.indexOf("*") - 2; i > 0; i --){
                if(statement2.substring(i-1,i).equals(" ")){
                    firstNum = Integer.parseInt(statement2.substring(i,statement2.indexOf("*") - 1));
                    break;
                }
            }
            for(int i = statement2.indexOf("*") + 2; i < statement2.length(); i++){
                if(statement2.substring(i,i+1).equals(" ")){
                    secondNum = Integer.parseInt(statement2.substring(statement2.indexOf("*") + 2,i));
                    break;
                }
            }
            
            int prod = firstNum * secondNum;
            response = "" + prod;
        }
        
        if(findKeyword(statement, "times", 0) > -1){
            String statement2 = " " + statement + " ";
            statement2 = statement2.replaceAll("[.^:,!?]","");
            for(int i = statement2.indexOf("times") - 2; i > 0; i --){
                if(statement2.substring(i-1,i).equals(" ")){
                    firstNum = Integer.parseInt(statement2.substring(i,statement2.indexOf("times") - 1));
                    break;
                }
            }
            for(int i = statement2.indexOf("times") + 6; i < statement2.length(); i++){
                if(statement2.substring(i,i+1).equals(" ")){
                    secondNum = Integer.parseInt(statement2.substring(statement2.indexOf("times") + 6,i));
                    break;
                }
            }
            
            int diff = firstNum * secondNum;
            response = "" + diff;
        }
        
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        String response = "random";
        return response;
    }

    private int findKeyword(String statement, String goal, int startPos){
        int spot = -1;
        statement = statement.toLowerCase(); 
        statement = statement.replaceAll("[.^:,!?]","");
        goal = goal.toLowerCase(); 

        String word = "";
        if(statement.indexOf(goal) == 0 && statement.length() == goal.length() && spot == -1){
            spot = 0;
        }
        else if(statement.indexOf(goal) == 0 && spot == -1){
            word = statement.substring(statement.indexOf(goal), statement.indexOf(goal) + 1 + goal.length());
            word = word.toLowerCase();
            if(word.equals(goal + " ")){
                spot = statement.indexOf(goal);
            }
            else{
                spot = -1;
            }
        }
        else if(statement.indexOf(goal) == statement.length() - goal.length() && spot == -1){
            word = statement.substring(statement.indexOf(goal) - 1);
            System.out.println(word);
            word.toLowerCase();
            if (word.equals(" " + goal)){
                spot = statement.indexOf(goal);
            }
            else{
                spot = -1;
            }
        }   
        else if(statement.indexOf(goal) != -1 && spot == -1) {
            word = statement.substring(statement.indexOf(goal) - 1, goal.length() + statement.indexOf(goal) + 1);
            word.toLowerCase();
            if (word.equals(" " + goal + " ") || word.equals(" " + goal + ".") ||word.equals(goal + ".")){
                spot = statement.indexOf(goal);
            }
            else{
                spot = -1;
            }
        }

        return spot;

    }
}