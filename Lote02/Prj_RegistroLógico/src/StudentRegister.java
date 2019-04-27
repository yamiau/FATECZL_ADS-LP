import java.io.*;
import javax.swing.*;

public class StudentRegister {
	public static void main(String args[]) throws IOException {

		int i;
		Student[] student = new Student[3];

		for (i = 0; i < 3; i++) {
			student[i] = new Student();
		}

		for (i = 0; i < 3; i++) {
			student[i].setName(JOptionPane.showInputDialog("Insert the student's name:"));
			student[i].setSurname(JOptionPane.showInputDialog("Insert the student's last name:"));
			student[i].setScore(Integer.parseInt(JOptionPane.showInputDialog("Insert the student's score:")));
		}

		for (i = 0; i < 3; i++) {
			System.out.println("The student " + student[i].getName() + " " + student[i].getSurname() + " has "
					+ student[i].getScore() + " point(s).");
		}

		Text text = new Text();
		text.WriteText(student);

		System.exit(0);
	}
}
