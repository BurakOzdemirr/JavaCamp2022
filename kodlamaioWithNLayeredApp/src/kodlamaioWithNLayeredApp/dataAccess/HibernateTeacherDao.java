package kodlamaioWithNLayeredApp.dataAccess;

import kodlamaioWithNLayeredApp.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{

	public void add(Teacher teacher)
	{
		System.out.println("Hibernate ile Veritabanına eklendi.");
	}

}
