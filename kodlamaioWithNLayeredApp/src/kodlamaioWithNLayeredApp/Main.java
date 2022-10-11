package kodlamaioWithNLayeredApp;

import kodlamaioWithNLayeredApp.business.CategoryManager;
import kodlamaioWithNLayeredApp.business.CourseManager;
import kodlamaioWithNLayeredApp.business.TeacherManager;
import kodlamaioWithNLayeredApp.core.logging.DatabaseLogger;
import kodlamaioWithNLayeredApp.core.logging.FileLogger;
import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.core.logging.MailLogger;
import kodlamaioWithNLayeredApp.dataAccess.HibernateCourseDao;
import kodlamaioWithNLayeredApp.dataAccess.HibernateTeacherDao;
import kodlamaioWithNLayeredApp.dataAccess.JdbcCategoryDao;
import kodlamaioWithNLayeredApp.entities.Category;
import kodlamaioWithNLayeredApp.entities.Course;
import kodlamaioWithNLayeredApp.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1, "Python", 60);
		Teacher teacher1 = new Teacher(1, "Engin", "Demiroğ");
		Category category1 = new Category(1, "Yazılım");
		
		
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category1);
		
		
		TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao());
		teacherManager.add(teacher1);

	}

}
