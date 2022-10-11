package kodlamaioWithNLayeredApp.dataAccess;

import kodlamaioWithNLayeredApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	public void add(Category category)
	{
		System.out.println("JDBC ile Kategori, Veritabanına eklendi.");
	}

}
