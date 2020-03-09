package design_patterns;

	public class Luxury extends Bike{
		 Luxury() {
			super(BikeType.LUXURY);
			construct();
			// TODO Auto-generated constructor stub
		}

		public void construct(){
			System.out.println("Building luxury Bike");
			
		}
}
