package design_patterns;

public class Factory {
		public static Bike buildBike(BikeType model){
			 Bike bike = null;
		        switch (model) {
		        case SMALL:
		            bike = new Small();
		            break;
		        case LUXURY:
		            bike = new Luxury();
		            break;
		 
		        default:
		            break;
		        }
		        return bike;
			
		}
}
