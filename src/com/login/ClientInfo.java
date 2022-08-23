package com.login;

public class ClientInfo {
private void clientDetails(String name) {
	System.out.println("Employee name is :" + "\t" + name);
}
private void clientDetails(String email, int empId) {
	System.out.println("Empolyee email is :" + email + "\n" + "Empoloyee id is :" + empId);
}
private void clientDetails(int id, char gender) {
    System.out.println("Employee id is :" + id + "\n" + "Empolyee gender is :" + gender);
}
private void clientDetails(float salary) {
	System.out.println("Employee salary is :" +"\t" + salary);
}
private void clientDetails(long mobile) {
	System.out.println("Employee mobile is :" + mobile);
}
private void cilentDetails(char gender, int id) {
	System.out.println("Emoloyee gender is :" +gender + "\n" + "Emolyee id is :"+ id);
}
public static void main(String[] args) {
	ClientInfo a = new ClientInfo();
	a.clientDetails("hexa");
	a.clientDetails("vignesh65@gmail.com", 58545454);
	a.clientDetails(258256, 'f');
	a.clientDetails(555555f);
	a.clientDetails(85265);
	a.cilentDetails('m',454522);
	
}
}
