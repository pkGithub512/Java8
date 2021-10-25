package mix.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		
		List<Exams> exsms1 = new ArrayList<Exams>();
		List<Exams> exsms2 = new ArrayList<Exams>();
		List<Exams> exsms3 = new ArrayList<Exams>();
		Exams e1 = new Exams();
		e1.setExamMarks("80");
		e1.setExamName("Java");
		e1.setId(1);
		Exams e2 = new Exams();
		e2.setExamMarks("90");
		e2.setExamName("C++");
		e2.setId(2);
		Exams e3 = new Exams();
		e3.setExamMarks("70");
		e3.setExamName("Python");
		e3.setId(3);
		Exams e4 = new Exams();
		e4.setExamMarks("90");
		e4.setExamName("Java");
		e4.setId(4);
		Exams e5 = new Exams();
		e5.setExamMarks("70");
		e5.setExamName("C++");
		e5.setId(5);
		Exams e6 = new Exams();
		e6.setExamMarks("60");
		e6.setExamName("Java");
		e6.setId(6);
		exsms1.add(e1);
		exsms1.add(e2);
		exsms1.add(e3);
		exsms2.add(e4);
		exsms2.add(e5);
		exsms3.add(e6);
		
		Student s1 = new Student(11, "S11", exsms1);
		Student s2 = new Student(22, "S22", exsms2);
		Student s3 = new Student(33, "S33", exsms3);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);studentList.add(s2);studentList.add(s3);
		
		studentList.stream().map(student -> student.getExams().stream().filter(exam -> exam.getExamName().equalsIgnoreCase("Java")).sorted(Collections.reverseOrder()).findFirst().get()).forEach(System.out::println);
		//studentList.stream().map(student -> student.getExams()).flatMap(exam -> StringUtils.
	}
}
