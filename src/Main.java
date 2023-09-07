
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.*;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

// I set the four parties as integers to be added at the end.

        int Democrat = 0;
        int Republican = 0;
        int Independent = 0;
        int Green = 0;
// each question carries a different point system depending on the response.
        int A = 1;
        int B = 1;
        int C = 0;
        int D = 1;
        int E = 1;

// Set the questions to be inputted by user to empty strings and used the scanner to hold the responses.

        String question1 = "";
        String question2 = "";
        String question3 = "";
        String question4 = "";
        String question5 = "";
        String question6 = "";
        String question7 = "";
        String question8 = "";
        String question9 = "";
        String question10 = "";
        String question11 = "";
        String question12 = "";


//Start of program and instructions.

        System.out.println("Welcome to the Political Poll! \n Press Enter to Continue ");
        Scanner scan = new Scanner(System.in);
        String enter = scan.nextLine();

        System.out.println("Make a selection: A, B, C, D, E");

//The block of code that asks the user the question and gives various options.
        //--------------Question 1--------------------------------


        System.out.println("US Law Enforcement needs reform? ");
        System.out.println("A: Completely Agree");
        System.out.println("B: Somewhat Agree");
        System.out.println("C: Neutral");
        System.out.println("D: Somewhat Disagree");
        System.out.println("E: Completely Disagree");

        question1 = scan.nextLine();
//I used if and else if statements to record and weigh the results of each question.
//Note that the weight of some questions are heavier based on the response to the question.
        if (question1.equalsIgnoreCase ("A") ){
            Green = A++;

        } else if (question1.equalsIgnoreCase("B")){
            Democrat = B++;
        } else if (question1.equalsIgnoreCase("C")) {
            Independent = C;
            Democrat = C;
            Green = C;
            Republican = C;

        } else if (question1.equalsIgnoreCase("D")) {
            Independent = D++;

        } else if (question1.equalsIgnoreCase("E")) {
            Republican = E++;


        }


        //-------------Question 2-----------------------------------

        System.out.println("Climate Change is a real threat? ");
        System.out.println("A: Completely Agree");
        System.out.println("B: Somewhat Agree");
        System.out.println("C: Neutral");
        System.out.println("D: Somewhat Disagree");
        System.out.println("E: Completely Disagree");

        question2 = scan.nextLine();


        if (question2.equalsIgnoreCase("A")){
            Green = A++;

        } else if (question2.equalsIgnoreCase("B")){
            Democrat = B++;
        } else if (question2.equalsIgnoreCase("C")) {
            Independent = C;
            Democrat = C;
            Green = C;
            Republican = C;

        } else if (question2.equalsIgnoreCase("D")) {
            Independent = D++;

        } else if (question2.equalsIgnoreCase("E")) {
            Republican = E++;

        }


        //-------------Question 3-----------------------------------

        System.out.println("We Can Trust our Voting System? ");
        System.out.println("A: Completely Agree");
        System.out.println("B: Somewhat Agree");
        System.out.println("C: Neutral");
        System.out.println("D: Somewhat Disagree");
        System.out.println("E: Completely Disagree");

        question3 = scan.nextLine();


        if (question3.equalsIgnoreCase("A")){
            Green = A++;

        } else if (question3.equalsIgnoreCase("B")){
            Democrat = B++;
        } else if (question3.equalsIgnoreCase("C")) {
            Independent = C;
            Democrat = C;
            Green = C;
            Republican = C;

        } else if (question3.equalsIgnoreCase("D")) {
            Independent = D++;

        } else if (question3.equalsIgnoreCase("E")) {
            Republican = E++;

        }


        //-------------Question 4-----------------------------------

        System.out.println("There needs to be stricter Gun Laws in the US? ");
        System.out.println("A: Completely Agree");
        System.out.println("B: Somewhat Agree");
        System.out.println("C: Neutral");
        System.out.println("D: Somewhat Disagree");
        System.out.println("E: Completely Disagree");

        question4 = scan.nextLine();


        if (question4.equalsIgnoreCase("A")){
            Green = A++;

        } else if (question4.equalsIgnoreCase("B")){
            Democrat = B++;
        } else if (question4.equalsIgnoreCase("C")) {
            Independent = C;
            Democrat = C;
            Green = C;
            Republican = C;

        } else if (question4.equalsIgnoreCase("D")) {
            Independent = D++;

        } else if (question4.equalsIgnoreCase("E")) {
            Republican = E++;

        }

        //-------------Question 5-----------------------------------

        System.out.println("Abortion should be banned in the US? ");
        System.out.println("A: Completely Agree");
        System.out.println("B: Somewhat Agree");
        System.out.println("C: Neutral");
        System.out.println("D: Somewhat Disagree");
        System.out.println("E: Completely Disagree");

        question5 = scan.nextLine();


        if (question5.equalsIgnoreCase("A")){
            Republican = A++;

        } else if (question5.equalsIgnoreCase("B")){
            Independent = B++;
        } else if (question5.equalsIgnoreCase("C")) {
            Independent = C;
            Democrat = C;
            Green = C;
            Republican = C;

        } else if (question5.equalsIgnoreCase("D")) {
            Democrat = D++;

        } else if (question5.equalsIgnoreCase("E")) {
            Green = E++;

        }


        //-------------Question 6-----------------------------------

        System.out.println("The current president/administration is doing a terrible job? ");
        System.out.println("A: Completely Agree");
        System.out.println("B: Somewhat Agree");
        System.out.println("C: Neutral");
        System.out.println("D: Somewhat Disagree");
        System.out.println("E: Completely Disagree");

        question6 = scan.nextLine();


        if (question6.equalsIgnoreCase("A")){
            Republican = A++;

        } else if (question6.equalsIgnoreCase("B")){
            Independent = B++;
        } else if (question6.equalsIgnoreCase("C")) {
            Independent = C;
            Democrat = C;
            Green = C;
            Republican = C;

        } else if (question6.equalsIgnoreCase("D")) {
            Democrat = D++;

        } else if (question6.equalsIgnoreCase("E")) {
            Green = E++;

        }


        //-------------Question 7-----------------------------------

        System.out.println("The US Government should forgive student loans? ");
        System.out.println("A: Completely Agree");
        System.out.println("B: Somewhat Agree");
        System.out.println("C: Neutral");
        System.out.println("D: Somewhat Disagree");
        System.out.println("E: Completely Disagree");

        question7 = scan.nextLine();


        if (question7.equalsIgnoreCase("A")){
            Green = A++;

        } else if (question7.equalsIgnoreCase("B")){
            Democrat = B++;
        } else if (question7.equalsIgnoreCase("C")) {
            Independent = C;
            Democrat = C;
            Green = C;
            Republican = C;

        } else if (question7.equalsIgnoreCase("D")) {
            Independent = D++;

        } else if (question7.equalsIgnoreCase("E")) {
            Republican = E++;

        }


        //-------------Question 8-----------------------------------

        System.out.println("The US Government should phase-out the use of coal for energy? ");
        System.out.println("A: Completely Agree");
        System.out.println("B: Somewhat Agree");
        System.out.println("C: Neutral");
        System.out.println("D: Somewhat Disagree");
        System.out.println("E: Completely Disagree");

        question8 = scan.nextLine();


        if (question8.equalsIgnoreCase("A")){
            Green = A++;

        } else if (question8.equalsIgnoreCase("B")){
            Democrat = B++;
        } else if (question8.equalsIgnoreCase("C")) {
            Independent = C;
            Democrat = C;
            Green = C;
            Republican = C;

        } else if (question8.equalsIgnoreCase("D")) {
            Independent = D++;

        } else if (question8.equalsIgnoreCase("E")) {
            Republican = E++;

        }


        //-------------Question 9-----------------------------------

        System.out.println("Photo ID should be required to vote? ");
        System.out.println("A: Completely Agree");
        System.out.println("B: Somewhat Agree");
        System.out.println("C: Neutral");
        System.out.println("D: Somewhat Disagree");
        System.out.println("E: Completely Disagree");

        question9 = scan.nextLine();


        if (question9.equalsIgnoreCase("A")){
            Republican = A++;

        } else if (question9.equalsIgnoreCase("B")){
            Independent = B++;
        } else if (question9.equalsIgnoreCase("C")) {
            Independent = C;
            Democrat = C;
            Green = C;
            Republican = C;

        } else if (question9.equalsIgnoreCase("D")) {
            Democrat = D++;

        } else if (question9.equalsIgnoreCase("E")) {
            Green = E++;

        }


        //-------------Question 10-----------------------------------

        System.out.println("Foreigners, currently in the US, have the right to vote? ");
        System.out.println("A: Completely Agree");
        System.out.println("B: Somewhat Agree");
        System.out.println("C: Neutral");
        System.out.println("D: Somewhat Disagree");
        System.out.println("E: Completely Disagree");

        question10 = scan.nextLine();


        if (question10.equalsIgnoreCase("A")){
            Green = A++;

        } else if (question10.equalsIgnoreCase("B")){
            Democrat = B++;
        } else if (question10.equalsIgnoreCase("C")) {
            Independent = C;
            Democrat = C;
            Green = C;
            Republican = C;

        } else if (question10.equalsIgnoreCase("D")) {
            Independent = D++;

        } else if (question10.equalsIgnoreCase("E")) {
            Republican = E++;

        }

        //-------------Question 11-----------------------------------


        System.out.println("What political party do you identify with the most? ");
        System.out.println("A: Green");
        System.out.println("B: Democrat");
        System.out.println("C: None of These");
        System.out.println("D: Independent");
        System.out.println("E: Republican");

        question11 = scan.nextLine();


        if (question11.equalsIgnoreCase("A")){
            Green = A + 10;

        } else if (question11.equalsIgnoreCase("B")){
            Democrat = B + 10;
        } else if (question11.equalsIgnoreCase("C")) {
            Independent = C;
            Democrat = C;
            Green = C;
            Republican = C;

        } else if (question11.equalsIgnoreCase("D")) {
            Independent = D + 10;

        } else if (question11.equalsIgnoreCase("E")) {
            Republican = E + 10;

        }


        //-------------Question 12-----------------------------------


        System.out.println("Wh? ");
        System.out.println("A: Green");
        System.out.println("B: Democrat");
        System.out.println("C: None of These");
        System.out.println("D: Independent");
        System.out.println("E: Republican");

        question12 = scan.nextLine();


        if (question12.equalsIgnoreCase("A")){
            Green = A + 10;

        } else if (question12.equalsIgnoreCase("B")){
            Democrat = B + 10;
        } else if (question12.equalsIgnoreCase("C")) {
            Independent = C;
            Democrat = C;
            Green = C;
            Republican = C;

        } else if (question12.equalsIgnoreCase("D")) {
            Independent = D + 10;

        } else if (question12.equalsIgnoreCase("E")) {
            Republican = E + 10;

        }









//This block of code prints the overall results of the poll

        System.out.println("Your Results:\n" + "Highest Score = Political Leaning");
        System.out.println("Democrat: " + Democrat);
        System.out.println("Green: " + Green);
        System.out.println("Independent: " + Independent);
        System.out.println("Republican: " + Republican);

        //This section of code saves the results to file: "Poll Results"
        File file = new File("Poll Results.txt");           //created a File object called file
        FileWriter fw = new FileWriter(file);     //created a Filewriter object called fw
        PrintWriter pw = new PrintWriter(fw);  //created a Printerwriter object called pw
        pw.println("Democrat " + Democrat);
        pw.println("Green " + Green);
        pw.println("Independent " + Independent);
        pw.println("Republican " + Republican);

        pw.close();





    }

    }
