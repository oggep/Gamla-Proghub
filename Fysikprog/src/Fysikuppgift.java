import java.lang.Math;

public class Fysikuppgift {
 
	
	//static double G = 6.673*(Math.pow"−11"(10);
	static double R = 8.31446;
	static double p_0 = 1000;
	static double C = 299792458;
	static double g_swe = 9.82;
	
	public static void main(String[] args) {
		System.out.println(fahrenheitToCelsius(50));
		System.out.println(kelvinToCelsius(0));
		System.out.println(fluidPressure(FluidTable.H20, 10));
		System.out.println(pressureUnderwater(10));
		System.out.println(kineticEnergy(2, 2));
		System.out.println(potentialEnergy(2, 5));
		System.out.println(fallSpeed(2.5));
		System.out.println(delta(1, 10));
		System.out.println(delta(5, 1));
		System.out.println(volumeToMass(FluidTable.WATER,1));
		System.out.println(volumeToMass(GasTable.AIR,1));
		System.out.println(volumeToMass(SolidTable.IRON,1));
		System.out.println(svtVelocity(10,5));
		System.out.println(svtDistance(10,5));
	}
	/**
	 * This method calculates farenheit to celcius.
	 * @param fahrenheit
	 * @return celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double Celsius = (fahrenheit-32)*5/9;
		return Celsius;
		}
	
	public static double kelvinToCelsius(double kelvin) {
		double kelvinToCelsius = kelvin - 273.15;
		return kelvinToCelsius;
		}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = deep * g_swe * fluid.density;
		return fluidPressure;
		}
	
	public static double pressureUnderwater(double deep) {
		double fluidPressure = deep * g_swe * FluidTable.H20.density;
		return fluidPressure;
		}
	
	public static double kineticEnergy(double mass, double velocity) {
		double kineticEnergy= 0.5 * mass * (Math.pow(velocity, 2));
		return kineticEnergy;
		}
	public static double potentialEnergy(double mass, double height) {
		double potentialEnergy = mass * g_swe * height;
		return potentialEnergy;
		}
	
	public static double fallSpeed(double height) {
		double fallSpeed = (Math.sqrt((2 * height)/ g_swe) * g_swe);
		return fallSpeed;
		}
	public static double delta(double first, double last){
		double delta = last - first;
		return delta;
	}
	public static double volumeToMass(FluidTable fluid, double volume) {
		double volumeToMass = fluid.density * volume;
		return volumeToMass;
	}
	public static double volumeToMass(GasTable gas, double volume) {
		double volumeToMass = gas.density * volume;
		return volumeToMass;
		
	}
	public static double volumeToMass(SolidTable solid, double volume) {
		double volumeToMass = solid.density * volume;
		return volumeToMass;
		
	}
	public static double svtVelocity(double distance, double time) {
		double svtVelocity = distance / time;
		return svtVelocity;
	}
	public static double svtDistance(double velocity, double time) {
		double svtDistance = velocity * time;
		return svtDistance;
	}
}	
