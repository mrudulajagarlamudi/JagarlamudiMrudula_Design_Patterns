package design_patterns;


	public  abstract class Bike {
		public Bike(BikeType model) {
	        this.model = model;
	        arrangeParts();
	    }
	 
	    private void arrangeParts() {

	    }
	 
	  
	    protected abstract void construct();
	 
	    private BikeType model = null;
	 
	    public BikeType getModel() {
	        return model;
	    }
	 
	    public void setModel(BikeType model) {
	        this.model = model;
	    }

}
