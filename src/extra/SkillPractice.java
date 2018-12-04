package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
           skills.skill1();
           skills.skill2();
           skills.skill3();
           skills.skill4();
           skills.skill5();
}

void skill1() {
System.out.println();
System.out.println("Skill 1");
// Use pop-ups for the following.
// Ask the user how many dimes they have
String dime = JOptionPane.showInputDialog("How many dimes do you have?");
int numdime = Integer.parseInt(dime);

// Tell them how many cents they have (hint multiply by 10)
int numcent = numdime * 10;
JOptionPane.showMessageDialog(null, "You have " + numcent + " cents.");

// Ask the user how tall they are (inches)
String inch = JOptionPane.showInputDialog("How tall are you(in inches)?");
int numinch = Integer.parseInt(inch);

// If they are shorter than 36 inches, tell them to eat their Wheaties
if (numinch < 36) {JOptionPane.showMessageDialog(null, "Eat your Wheaties!!!");}

}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console
System.out.println();
System.out.println("Skill 2");
for (int i = 1; i <= 30; i++) {
if (i % 3 == 0) {System.out.println(i);}
}

}

void skill3() { // Get a random number that is less than 20 and print it to the console
System.out.println();
System.out.println("Skill 3");
Random factory = new Random();
int random = factory.nextInt(20);
System.out.println(random);

// Get another random number that is less than 10 and print it to the console
int random2 = factory.nextInt(100);
System.out.println(random2);

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
int d = random - random2;
JOptionPane.showMessageDialog(null, d);

}

void skill4() { 
System.out.println();
System.out.println("Skill 4");
// In a pop-up, ask the user for the city they live in
String city = JOptionPane.showInputDialog("What city do you live in?");

// If they answered "San Diego", tell them they live in America's Finest City
if (city.equalsIgnoreCase("San Diego")) {JOptionPane.showMessageDialog(null, "You are living in America's Finest City!!!");}

// Otherwise, tell them to move to San Diego
else {JOptionPane.showMessageDialog(null, "Move to San Diego!!!");}

// Create a variable - cars - and initialize it to the number of cars your family has. 
String car = JOptionPane.showInputDialog("How many cars does your family has?");
int numcar = Integer.parseInt(car);

// If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
if(numcar < 1) {JOptionPane.showMessageDialog(null, "I bet you use public transportation.");}

// If there is 1 car, use a pop-up to display the make/model of the car
else if(numcar == 1) {JOptionPane.showMessageDialog(null, "Is it a Honda?");}

// If there is more than 1 car, use a pop-up to display how many wheels the cars have between them.
else if(numcar > 1) {JOptionPane.showMessageDialog(null, "You have " + numcar * 4 + " wheels.");}

}

void skill5() { 
System.out.println();
System.out.println("Skill 5");
// In a pop-up, ask the user for the name of their school
String school = JOptionPane.showInputDialog("What school are you going to?");

// In another pop-up, tell the user, that their school is a fantastic school. 
// You must include the name of the school in the message.
JOptionPane.showMessageDialog(null, school + " is a good school.");

}
}