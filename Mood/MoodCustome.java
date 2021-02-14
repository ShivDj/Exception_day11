package Mood;

public class MoodCustome {
	
	
	     String msg;
		
		public MoodCustome(String msg) {
			
			this.msg = msg;
		}

		
		public String analyzeMood() throws MoodException {
			// TODO Auto-generated method stub
			
			try {
				if(msg.equals("sad"))
				{
					return "sad";
				}
				else 
				{
					return "Happy";
				}
			}
				catch(Exception e) {
					throw new MoodException("invalid user input");
					
				}
			}
			
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MoodCustome mood=new MoodCustome("i am ");
	          try {
	        	  System.out.println(mood.analyzeMood());
	        	  
	        		  
	        	  }
	          catch(MoodException e)
	          {
	        	  e.printStackTrace();
	          }
		}
	          
		}

	

