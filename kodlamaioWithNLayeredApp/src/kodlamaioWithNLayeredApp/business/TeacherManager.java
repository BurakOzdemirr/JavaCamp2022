package kodlamaioWithNLayeredApp.business;


import kodlamaioWithNLayeredApp.dataAccess.TeacherDao;
import kodlamaioWithNLayeredApp.entities.Teacher;

public class TeacherManager {
	
	private TeacherDao teacherDao;

	
	
	public TeacherManager(TeacherDao teacherDao) {
	
		this.teacherDao = teacherDao;
	}



	public void add(Teacher teacher)
	{
		//JdbcTeacherDao teacherDao= new JdbcTeacherDao();
		teacherDao.add(teacher);
	}

}
