package kodlamaioWithNLayeredApp.dataAccess;

import kodlamaioWithNLayeredApp.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao{

	public void add(Teacher teacher)
	{
		System.out.println("Jdbc ile Veritabanına eklendi.");
	}

}
