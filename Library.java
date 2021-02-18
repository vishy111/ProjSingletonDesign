import java.util.ArrayList;

public class Library {
	public static Library library;
	private ArrayList <Library> libraryList;
	
	private Library() 
	{
		libraryList= Library.getInstance();
	}
	public static Library getInstance()
	{
		if(library == null)
			library = new Library();
		return library;
	}
	public boolean checkoutBook(String bookName)
	{
		
	}
	public boolean checkInBook(String bookName)
	{
		
	}

}
