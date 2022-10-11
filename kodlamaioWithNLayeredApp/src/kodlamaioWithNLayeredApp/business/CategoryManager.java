package kodlamaioWithNLayeredApp.business;



import java.util.List;

import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAccess.CategoryDao;
import kodlamaioWithNLayeredApp.entities.Category;

public class CategoryManager {
	
	private  CategoryDao categoryDao;
	private Logger[] loggers;
	

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		
		this.categoryDao = categoryDao;
		this.loggers= loggers;
	}


	public void add(Category category) throws Exception
	{
		if(category.getName()==category.getName()) 
		{
			throw new Exception("Kategori ismi tekrar edemez.");
		}
		
		categoryDao.add(category);
		
		for(Logger logger : loggers)
		{
			logger.log(category.getName());
		}
	}

}
