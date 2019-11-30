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
		System.out.println(svtTime(10,2));
		System.out.println(work(50,10));
		System.out.println(power(1000,2));
		System.out.println(heat(SolidTable.IRON,1,2));
		System.out.println(heat(FluidTable.H20,1,10));
		System.out.println(heat(GasTable.AIR,1,1));
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
	/**
	 * This method calculates kelvin to celcius.
	 * @param kelvin
	 * @return celsius
	 */
	public static double kelvinToCelsius(double kelvin) {
		double kelvinToCelsius = kelvin - 273.15;
		return kelvinToCelsius;
		}
	/**
	 * This method calculates the pressure in diffrent fluids och diffrent deeps
	 * @param fluid
	 * @param deep
	 * @return fluidPressure
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = deep * g_swe * fluid.density;
		return fluidPressure;
		}
	/**
	 * This method calculates the pressure in water under diffrent deeps 
	 * @param water
	 * @param deep
	 * @return fluidPressure
	 */
	public static double pressureUnderwater(double deep) {
		double fluidPressure = deep * g_swe * FluidTable.H20.density;
		return fluidPressure;
		}
	/**
	 * This method calculates the kineticenergy
	 * @param mass
	 * @param velocity
	 * @return kineticEnergy
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double kineticEnergy= 0.5 * mass * (Math.pow(velocity, 2));
		return kineticEnergy;
		}
	/**
	 * This method calculates the kineticenergy
	 * @param mass
	 * @param height
	 * @return potentialEnergy
	 */
	public static double potentialEnergy(double mass, double height) {
		double potentialEnergy = mass * g_swe * height;
		return potentialEnergy;
		}
	/**
	 * This method calculates the fallspeed
	 * @param height
	 * @return fallSpeed
	 */
	public static double fallSpeed(double height) {
		double fallSpeed = (Math.sqrt((2 * height)/ g_swe) * g_swe);
		return fallSpeed;
		}
	/**
	 * This method calculates delta
	 * @param first
	 * @param last
	 * @return delta
	 */
	public static double delta(double first, double last){
		double delta = last - first;
		return delta;
	}
	/**
	 * This method calculates the volume of a fluid to mass
	 * @param fluid
	 * @param volume
	 * @return volumeToMass
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double volumeToMass = fluid.density * volume;
		return volumeToMass;
	}
	/**
	 * This method calculates the volume of a gas to mass
	 * @param gas
	 * @param volume
	 * @return volumeToMass
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		double volumeToMass = gas.density * volume;
		return volumeToMass;
		
	}
	/**
	 * This method calculates the volume of a solid to mass
	 * @param solid
	 * @param volume
	 * @return volumeToMass
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		double volumeToMass = solid.density * volume;
		return volumeToMass;
		
	}
	/**
	 * This method calculates the velocity from distance and time
	 * @param distance
	 * @param time
	 * @return svtVelocity
	 */
	public static double svtVelocity(double distance, double time) {
		double svtVelocity = distance / time;
		return svtVelocity;
	}
	/**
	 * This method calculates the distance from velocity and time
	 * @param velocity
	 * @param time
	 * @return svtDistance
	 */
	public static double svtDistance(double velocity, double time) {
		double svtDistance = velocity * time;
		return svtDistance;
	}
	/**
	 * This method calculates the time from the distance and velocity
	 * @param distance
	 * @param velocity
	 * @return svtTime
	 */
	public static double svtTime(double distance, double velocity) {
		double svtTime = distance / velocity;
		return svtTime;
	}
	/**
	 * This method calculates the work from force and distance
	 * @param force
	 * @param distance
	 * @return work
	 */
	public static double work(double force, double distance) {
		double work = force * distance;
		return work;
	}
	/**
	 * This method calculates the power from work and time
	 * @param work
	 * @param time
	 * @return work
	 */
	public static double power(double work, double time) {
		double power = work / time;
		return power;
	}
	/**
	 * This method calculates the heat on a solid with mass and deltaT
	 * @param heatcapacity
	 * @param mass
	 * @param deltaT
	 * @return heat
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		double heat = solid.heatCapacity * mass * deltaT;
		return heat;
		
	}
	/**
	 * This method calculates the heat on a fluid with mass and deltaT
	 * @param heatcapacity
	 * @param mass
	 * @param deltaT
	 * @return heat
	 */
	public static double heat(FluidTable fluid, double mass, double deltaT) {
		double heat = fluid.heatCapacity * mass * deltaT;
		return heat;
	}
	/**
	 * This method calculates the heat on a gas with mass and deltaT
	 * @param heatcapacity
	 * @param mass
	 * @param deltaT
	 * @return work
	 */
	public static double heat(GasTable gas, double mass, double deltaT) {
		double heat = gas.heatCapacity * mass * deltaT;
		return heat;
	}
	public static double velocityToHeight(double velocity) {
		double velocityToHeight = (Math.pow())
		
	}
}
	
