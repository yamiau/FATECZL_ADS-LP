import java.io.*;

public class Read {
	public void main(Stats[] stats, int lang) throws IOException {
		
		String fileName = "Latest Logs.txt";
		BufferedReader buffer = new BufferedReader(new FileReader(fileName));
		
		for (int i = 0; i < stats.length; i++) {
			stats[i].setName(buffer.readLine());
			stats[i].setName(buffer.readLine());
				
		}	buffer.close();
	}
}

