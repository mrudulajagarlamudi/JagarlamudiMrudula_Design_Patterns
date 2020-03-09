package design_patterns;

	public class Small extends Bike{

		 Small() {
			super(BikeType.SMALL);
			construct();
			// TODO Auto-generated constructor stub
		}
		 public void construct(){
			 System.out.println("Building small Bike");
		 }

}
