import java.io.*;

public class Text {
	void WriteText (Student[] student) throws IOException {
		
		BufferedWriter buffer = new BufferedWriter(new FileWriter("Latest Students.txt"));

		for (int i = 0; i < 3; i++) {
			buffer.write(student[i].getName());
			buffer.newLine();
			buffer.write(student[i].getSurname());
			buffer.newLine();
			buffer.write(Integer.toString(student[i].getScore()));
			buffer.newLine();
		}	buffer.close();
	}
}
