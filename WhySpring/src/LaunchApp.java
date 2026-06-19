import services.Devops;
import services.AIengineering;
import services.Icourse;
import services.SystemDesign;

class LaunchApp
{
	 public static void main()
		   {
			 Devops d1 = new Devops();
			 AIengineering a1 = new AIengineering();
			 SystemDesign s1 = new SystemDesign(); //dependent
			 
			// DI ===> injecting dependent object into target object..
			// setter injection 
			 
			 Telusko t1 = new Telusko(a1); //target
			 
			 t1.setCourse(d1);
//			 
//			 int age = 15;
//			 age = 16;
//			 
			 Boolean status = t1.buyCourse(1000);
			 if(status)
			 {
				 System.out.println("Payment done successfully");
			 }
			 else
			 {
				 System.out.println("Payment failed");
			 }
			 
		   }
}