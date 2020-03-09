package design_patterns;

	public class TestFactory {
		public static void main(String[] args){
		System.out.println(Factory.buildBike(BikeType.SMALL));
		System.out.println(Factory.buildBike(BikeType.LUXURY));
		
		}
}
