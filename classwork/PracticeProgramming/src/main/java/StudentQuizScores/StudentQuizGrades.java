/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package StudentQuizScores;
import SimpleCalculator.UserIO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class StudentQuizGrades {
    private static UserIO io = new UserIO();
    private static Scanner scan = new Scanner(System.in);
    private static final Map<String, ArrayList<Integer>> quizScores = new HashMap<>();
    public static void main(String[] args) {
       
       boolean keepGoing = true;
       int choice = 0;
       while(keepGoing){
           printMenuSelect();
           choice = io.readInt("Select the operation you'd like to do.",1,6);
           switch (choice){
               case 1:
                   io.print("=== List students ===");
                   listAllStudents();
                   break;
               case 2:
                   io.print("=== Add student ===");
                   addStudent();
                   break;
               case 3:
                   io.print("=== Remove student ===");
                   removeStudent();
                   break;
               case 4:
                   io.print("=== List quiz score of a student ===");
                   listStudent();
                   break;
               case 5:
                   io.print("=== View average quiz score of a student ===");
                   avgScore();
                   break;
               case 6:
                   keepGoing = false;
                   break;
               default:  
                   io.print("Invalid int given");
                   break;
              
           }
       }
        
    }
    
    private static void printMenuSelect(){
        io.print("What would you like to do?");
        io.print("1. List all students.");
        io.print("2. Add student.");
        io.print("3. Remove student.");
        io.print("4. List quiz score of a student.");
        io.print("5. View average quiz score of a student.");  
        io.print("6. quit");       
    }
    
    private static void listAllStudents(){
        Set<String> names = quizScores.keySet();
        for (String name : names){
            io.print(name+ " has the following quiz grades:");
            io.print(quizScores.get(name).toString());
            io.print("");
        }
        
    }
    
    private static void addStudent(){
        String name = io.readString("Enter name of student");
        ArrayList<Integer> quizes = new ArrayList<>();
        int quizNum = io.readInt("Enter number of quiz scores to add");
        for (int i = 1; i <= quizNum; i++){
            quizes.add(io.readInt("Enter quiz score #"+i));
        }
        quizScores.put(name,quizes);
    }
    
    private static void removeStudent(){
        String name = io.readString("Enter student name you would like to remove");
        if (null == quizScores.remove(name)){
            io.print("No such entry");
        }else{
            io.print("Successfully removed student "+name);
        }
    }
    
    private static void listStudent(){
        String name = io.readString("Enter name of student");
        io.print(name+ " recieved quiz scores of: "+quizScores.get(name).toString());
    }
    
    private static void avgScore(){
        String name = io.readString("Enter name of student you'd like to see average score: ");
        ArrayList<Integer> quiz = quizScores.get(name);
        int counter = 0;
        int total = 0;
        for (int score : quiz){
            counter++;
            total+=score;
        }
        io.print(name+" got an average score of "+total/counter);
    }
}
