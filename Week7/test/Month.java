
public class Month {

	int monthNumber;
	
	
	public Month (int monthNumber)
	{
		this.monthNumber=monthNumber;
	}
	
	public int getDays(int monthNumber)
	{
		int days = 0;
		
		switch (monthNumber)
		{
		
		case 1: days = 31;
				break;
				
		case 2: days = 28;
				break;
				
		case 3: days = 31;
				break;
				
		case 4: days = 30;
				break;
				
		case 5: days = 31;
				break;
				
		case 6: days = 30;
				break;
		
		case 7: days = 31;
				break;
		
		case 8: days = 31;
				break;
		
		case 9: days = 30;
				break;
		
		case 10: days = 31;
				break;
		
		case 11: days = 30;
				break;
		
		case 12: days = 31;
				break;
			
		}
		
		
		return days;
	}
	
}
