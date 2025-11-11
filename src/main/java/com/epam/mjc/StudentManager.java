package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws CustomException {
      try {
        return Student.getValueOf(studentID);
      } catch (Exception e) {
        throw new CustomException("Could not find student with ID 1000");
      }

  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    for (int i = 0; i < IDs.length; i++) {
      try {
      Student student = manager.find(IDs[i]);
        System.out.println("Student name " + student.getName());
      } catch (IllegalArgumentException e) {
        System.out.println("Could not find student with ID 1000");
      }
    }

  }
}