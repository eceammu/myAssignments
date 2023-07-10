package week3.day1.assignments.org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Size Of Desktop is 1280  ×  720      ------>From DESKTOP Class");

	}
	public static void main(String[] args) {
		System.out.println("Single Inheritance Example:");
		Desktop des=new Desktop();
		des.desktopSize();
		des.computerModel();
	}

}
