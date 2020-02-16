package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("today you do your homework and cry maybe");
		case "Monday":
			System.out.println("today is work ;-;");
		case "Tuesday":
			System.out.println("tuesday is the most awkward part of the week. middle of nothing");
		case "Wednesday":
			System.out.println("halfway through the week");
		case "Thursday":
			System.out.println("almost there");
		case "Friday":
			System.out.println("go party");
		case "Saturday":
			System.out.println("for the boys");
		}
	}
}
