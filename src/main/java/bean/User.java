package bean;

public class User {
private String name;
private String sex;
private String addre;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getAddre() {
	return addre;
}
public void setAddre(String addre) {
	this.addre = addre;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
