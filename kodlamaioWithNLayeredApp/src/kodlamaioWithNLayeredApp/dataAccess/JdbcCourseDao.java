package kodlamaioWithNLayeredApp.dataAccess;

import kodlamaioWithNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao{

	public void add(Course course) 
	{
		//sadece ve sadece db erişim kodları buraya yazılır. 
		System.out.println("JDBC ile Veritabanına eklendi.");
	}

}
