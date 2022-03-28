package user.form.model;

public class User {
 private String name;
 private String surname;
 private String address;
 private String idCard;
public User(String name, String surname, String address, String idCard) {
	this.name = name;
	this.surname = surname;
	this.address = address;
	this.idCard = idCard;
}
public User() {
}
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getIdCard() {
	return idCard;
}
public void setIdCard(String idCard) {
	this.idCard = idCard;
}
@Override
public String toString() {
	return "User [name=" + name + ", surname=" + surname + ", address=" + address + ", idCard=" + idCard + "]";
}
 
}
