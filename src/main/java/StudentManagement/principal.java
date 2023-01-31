package StudentManagement;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class principal {
@Id
private int id;
private String name;
private String age;
private String email;
private String phno;
private String password;



public principal() {
	super();
	// TODO Auto-generated constructor stub
}
public principal(String name, String age, String email, String phno, String password) {
	super();
	
	this.name = name;
	this.age = age;
	this.email = email;
	this.phno = phno;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}