package Mood;


public class MoodAnylizer {

		//static Scanner sc=new Scanner(System.in);
		static String usermood;

		 public MoodAnylizer(String usermood){
				// TODO Auto-generated constructor stub
				//super();
			 this.usermood=usermood;
			}
		 
		 
	 
		public static void main(String[] args)  {
			// TODO Auto-generated method stub
	      
			MoodAnylizer mood = new  MoodAnylizer(null);
	         try {
	        	 
	         
			 if(mood.usermood.contains("i am in sad mood"))
			 {
				 System.out.println("sad");
			 }
			 else
			 {
				 System.out.println("i am happy");
			 }
	         }
	         catch(NullPointerException e)
	         {
	        	 e.printStackTrace();
	        	 System.out.println("it sad to be happy");
	         }
		
		}

	}


