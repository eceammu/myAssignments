package week3.day1.assignments.abstractionex;

public class Automation  extends MultipleLangauge implements Language,TestTool 
{

	public void Selenium() 
	{
		System.out.println("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation");
		
	}

	public void Java() 
	{
		System.out.println("Java is a high-level, class-based, object-oriented programming language");
		
	}
	public  void ruby()
	{
		System.out.println("Ruby dynamic, open source programming language with a focus on simplicity and productivity");
		
	}
	public  void automationClass()
	{
		System.out.println("This is Automaion Class");
		
	}
	public static void main(String[] args) {
		
		Automation obj=new Automation();
		obj.automationClass();
		obj.python();
		obj.Java();
		obj.ruby();
		obj.Selenium();
		
	}
}
