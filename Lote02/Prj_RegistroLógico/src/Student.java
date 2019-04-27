
public class Student {
	
	private String name;
	private String surname;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	Student() {
		this("", "", 0);
	}
	
	Student(String stdname, String stdsurname, int stdscore) {
		name = stdname;
		surname = stdsurname;
		score = stdscore;
	}
}
