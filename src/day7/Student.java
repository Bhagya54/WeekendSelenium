package day7;

public class Student
{
	
	//restricted access
	private int id;
	private String name;
	private int age;
	private String schoolName;
	private String grade;
	private char section;
	private String pancard;
	char gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		if(gender == 'F' || gender == 'M' || gender =='f' || gender=='m') {
		this.gender = gender;
		}
		else {
			System.out.println("invalid gender");
		}
	}
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getGrade() {
		return grade;
	}
	public char getSection() {
		return section;
	}
	
	
	
	/*Access Specifier
	 * >private -- within the class
	 * >default -- within class/outside class(within the package)
	 * >protected -- outside package(inheritance relationship) 
	 * >public -- accessed everywhere with in project
	 * 
	 * 
	 * 
	 */
	
	
	
	
}
