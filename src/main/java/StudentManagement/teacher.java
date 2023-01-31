package StudentManagement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class teacher {
@Id
private int id;
private String name;
private String subject;
private String salary;

public teacher(int id,String name, String subject, String salary) {
	super();
	this.id = id;
	this.name = name;
	this.subject = subject;
	this.salary = salary;
}



public teacher() {
	super();
	// TODO Auto-generated constructor stub
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
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
}
