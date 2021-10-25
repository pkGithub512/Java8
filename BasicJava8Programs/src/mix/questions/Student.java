package mix.questions;

import java.util.List;

public class Student {

	int studentId;
	String studentName;
	List<Exams> exams;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Exams> getExams() {
		return exams;
	}
	public void setExams(List<Exams> exams) {
		this.exams = exams;
	}
	public Student(int studentId, String studentName, List<Exams> exams) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.exams = exams;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", exams=" + exams + "]";
	}
	
}

class Exams{
	int id;
	String examName;
	String examMarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getExamMarks() {
		return examMarks;
	}
	public void setExamMarks(String examMarks) {
		this.examMarks = examMarks;
	}
	@Override
	public String toString() {
		return "Exams [id=" + id + ", examName=" + examName + ", examMarks=" + examMarks + "]";
	}
	
}