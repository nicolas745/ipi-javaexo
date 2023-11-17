package ipi.ecoconception;

public class GoodPractice {
	private String name,field;
	public GoodPractice(String name,String field) {
		this.field = field;
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String getField() {
		return this.field;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String toString() {
		return "";
	}
}
