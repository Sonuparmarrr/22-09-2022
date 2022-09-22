package exercises4.inheritanceinterface.bll;

public class Author {

	
		private String name;
		private String email;
	
	public Author(String name, String email) {
		this.name=name;
		this.email=email;

}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setemail(String email) {
		this.email=email;
		
	}
	@Override
	public String toString() {
		return "Author Name : "+name+" Email :"+email;
	}
}