package training.day2;
import java.util.Arrays;
import java.util.Comparator;

public class SortingTemplate {

		public static Student[] sortByNameAsc(Student[] students) {
			Arrays.sort(students, new Comparator<Student>() {
					
					public int compare(Student o1, Student o2) {
						return o1.getsName().compareTo((o2.getsName()));
					
					
		}
				
			return students;	
}
			
}
