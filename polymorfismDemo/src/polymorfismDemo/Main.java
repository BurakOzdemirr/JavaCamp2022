package polymorfismDemo;

public class Main {

	public static void main(String[] args) {
		// Polymorfism çok biçimlilik demektir. 
		// OLay referans tiplerin birbirinin referansını tutması itibariyle olan durumdur. 
		
	//	BaseLogger[] loggers= new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
	
	//	for (BaseLogger logger:loggers)
	//	{
	//		logger.Log("Log mesajı");
	//	}
	
		
		CustomerManager customerManager= new CustomerManager(new DatabaseLogger());
		customerManager.Add();
		
	}

}
