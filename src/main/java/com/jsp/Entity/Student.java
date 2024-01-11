package com.jsp.Entity;
 
import javax.persistence.Entity;
import javax.persistence.Id;
 
@Entity
public class Student {
	@Id
	private int studentUsn;
	private String studentName;
	private String studentCity;

	public int getStudentUsn() {
		return studentUsn;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentUsn(int studentUsn) {
		this.studentUsn = studentUsn;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public Student() {
	}
	public Student(int studentUsn, String studentName, String studentCity) {
		super();
		this.studentUsn = studentUsn;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	@Override
	public String toString() {
		return "Student [studentUsn=" + studentUsn + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}

}