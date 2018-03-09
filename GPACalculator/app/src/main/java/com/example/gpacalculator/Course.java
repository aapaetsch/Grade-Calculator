package com.example.gpacalculator;

/**
 * @author Created by Aidan Paetsch
 * @date 03/08/2018
 * Class for a singular course
 */

public class Course {
	private String courseCode;
	private String department;
	private String grade; // X denotes a course that is yet to be graded
	private Integer year; // year of your degree in which a class was taken
	private String user; // who took the course, app can be used for multiple users
	private String semester; // either fall, winter, spring or summer
	
	/**
	* Creates a new Course object
	* @param courseCode -unique ID of the course
	* @param department -department ID the course falls under
	* @param grade -letter grade, can have - or + 
	* @param user -name of the person who took this course
	* @param semester -semester of the year in which the course was taken
	* @param year -year of the degree in which a course is taken
	*/
	public Course(String courseCode, String department, String grade, String user, String semester, Integer year){
		this.courseCode = courseCode;
		this.department = department;
		this.grade = grade;
		this.user = user;
		this.semester = semester;
		this.year = year;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public String getDepartment() {
		return department;
	}

	public String getGrade() {
		return grade;
	}

	public Integer getYear() {
		return year;
	}

	public String getUser() {
		return user;
	}

	public String getSemester() {
		return semester;
	}

	@Override
	public String toString() {
		return "Course{" +
				"courseCode='" + courseCode + '\'' +
				", department='" + department + '\'' +
				", grade='" + grade + '\'' +
				", year=" + year +
				", user='" + user + '\'' +
				", semester='" + semester + '\'' +
				'}';
	}

	// setter for a course, uses the same parameters as course
	public void setCurrentCourse(String courseCode, String department, String grade, String user, String semester, Integer year){
		this.courseCode = courseCode;
		this.department = department;
		this.grade = grade;
		this.user = user;
		this.semester = semester;
		this.year = year;
	}

}
