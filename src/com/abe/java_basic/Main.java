package com.abe.java_basic;

import java.util.Arrays;
import java.util.List;

import com.abe.java_basic.ref.Student;

public class Main {
	public static void main(String args[]) throws InterruptedException {

		List<String> names = Arrays.asList("Abe", "Tanaka", "Kamemoto");
		
		List<Student> students = names.stream()
									.map(Student::new)
									.toList();
		
		System.out.println(students);
	}

}
