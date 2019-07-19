package training.day2;

import java.util.Arrays;

public class StudentSortyImpl {
	public static void main(String []args){
		
		Student[] students = {
				new Student(101,"hari",44),
				new Student(102,"soura",21),
				new Student(103,"umang",22),
				new Student(103,"himanshu",23),
				new Student(105,"naveen",32)
		};
	}
	
	
	public static boolean isStudentFound(Student []students, int id) {
		
		int arr[] = new int[students.length];
		for(int i=0; i<students.length;i++) {
			arr[i] = students[i].getsId();
		}
		return Arrays.binarySearch(arr, id)> -1;
	}

}
 