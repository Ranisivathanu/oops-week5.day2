package week5.day2;

public class Automation extends MultipleLangauge implements Language,TestTool {
public void Selenium() {
		 System.out.println("Selenium : It is a computer language");
		}
public void Java() {
		 System.out.println("Java : It is a computer language");
		}

	@Override
public void ruby() {
		 System.out.println("ruby : It is a computer language");
		}
public static void main(String[] args) {
	Automation lang=new Automation();
	lang.Java();
	lang.python();
	lang.ruby();
	lang.Selenium();

	}

}
