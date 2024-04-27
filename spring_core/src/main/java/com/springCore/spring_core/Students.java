package com.springCore.spring_core;

public class Students {
	private int studentId;
	private String StudentName;
	private String StudentAddress;

	public Students(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		StudentName = studentName;
		StudentAddress = studentAddress;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		System.out.println("getting student ID");
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("setting student ID");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentAddress() {
		return StudentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", StudentName=" + StudentName + ", StudentAddress="
				+ StudentAddress + "]";
	}
	
	

}
