package behavioural_patterns;

public class MainTemplate {

		public static void main(String[] args){
			Employee emp = new Programmer();
			emp.CometoWork();
			System.out.println();
			 emp = new Manager();
			 emp.CometoWork();
		}

}
