package com.jsp.dao;
 
 
import java.util.List;
 
 
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
 
import com.jsp.Entity.Student;
 
public class StudentDao 
{
 
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int insertStudent(Student student) {
		int i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//Fetching particular record
	public Student  getStudent(int studentUsn) {
		Student student = hibernateTemplate.get(Student.class,studentUsn);
		return student;
	}
	//Fetching all records
	public List<Student> getAllStudent(){
		List<Student> loadAll = (List<Student>) hibernateTemplate.loadAll(Student.class);
		System.out.println("All Objects Fetched");
	return (List<Student>) loadAll;

	}
	@Transactional
	public void delete(int  studentUsn) {
		Student student = hibernateTemplate.get(Student.class, studentUsn);
		System.out.println("Record deleted..!!" +student);
		this.hibernateTemplate.delete(student);	
	}

}