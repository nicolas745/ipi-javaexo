package ipi.ecoconception;

public class MaturityLevel {
	private String level;
	private String otherName;
	private int score;
	private String meaning;
	public MaturityLevel(String level, String nom, int score,String meaning) {
		this.level = level;
		this.otherName = nom;
		this.score = score;
		this.meaning =meaning;
	}
	public String getLevel() {
		return this.level;
	}
	public String getOtherName() {
		return this.otherName;
	}
	public int getScore() {
		return this.score;
	}
	public String getMeaning() {
		return this.meaning;
	}
	public void SetLevel(String level) {
		this.level = level;
	}
	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String tostring() {
		return "";
	}
	
}
