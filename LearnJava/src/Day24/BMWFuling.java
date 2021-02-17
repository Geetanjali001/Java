package Day24;

class BMWFuel extends BMW{
	String FuelType;
	String FuelRate;
	String FuelService;
    public void BMWInfo() {
    	FuelType="Premium";
    	FuelRate="$1.15";
    	FuelService="Petro Canada";	
    }
    public void Display() {
    	System.out.println(FuelType+"\t"+FuelRate+"\t"+FuelService);
    }
}
public class BMWFuling {

}
