public class Icecream {
	private String flavor;
	private float meltingTemperature;
	private String colour;
	private boolean isAllergic;
	private String mainIngredient;
	
	public Icecream(String flavor, float meltingTemperature,
			String colour, boolean isAllergic, String mainIngredient) {
		this.flavor = flavor;
		this.meltingTemperature = meltingTemperature;
		this.colour = colour;
		this.isAllergic = isAllergic;
		this.mainIngredient = mainIngredient;
	}
	public Icecream () {
		this("",0,"",true,"");
	}
	
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
		
	}
	public float getMeltingTemperature() {
		return meltingTemperature;
	}
	
	public void setMeltingTemperature(float meltingTemperature) {
		this.meltingTemperature = meltingTemperature;
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean getIsAllergic() {
		return isAllergic;
	}
	public void setIsAllergic (boolean isAllergic) {
		this.isAllergic = isAllergic;
	}
	public String getMainIngredient() {
		return mainIngredient;
	}
	public void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
		
	}
	
	public String toString() {
		return "The flavor is " + getFlavor() + "\n" +
				"The temperature of melt is " + getMeltingTemperature() +"\n" +
				"the colour is" + getColour() + "\n" +
				"the algergic" + getIsAllergic() + "\n" +
				"the ingredient" + getMainIngredient();
	}
}
