package StudentManagement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class studentt {
@Id
private int id;
private String name;
private String branch;
private String fees;

public int getId() {
	return id;
}

public studentt() {
	super();
	// TODO Auto-generated constructor stub
}

public studentt(int id,String name, String branch, String fees) {
	super();
	this.id = id;
	this.name = name;
	this.branch = branch;
	this.fees = fees;
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
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getFees() {
	return fees;
}
public void setFees(String fees) {
	this.fees = fees;
}
}
