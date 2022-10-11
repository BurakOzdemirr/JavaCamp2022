package kodlamaioWithNLayeredApp.business;

import java.util.List;

import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAccess.CourseDao;
import kodlamaioWithNLayeredApp.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	
		public CourseManager(CourseDao courseDao, Logger[] loggers) {
		
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

		public void add(Course course) throws Exception
		{
			if(course.getPrice()<0)
			{
				throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
			} 
			
			if(course.getName()==course.getName()) 
			{
				throw new Exception("Kurs ismi tekrar edemez.");
			}
			
		
			courseDao.add(course);
			
			for(Logger logger : loggers)
			{
				logger.log(course.getName());
			}
			
		}

	

}
