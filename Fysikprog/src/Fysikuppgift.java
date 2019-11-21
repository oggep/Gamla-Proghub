public class Fysikuppgift {

	
	static double G = 9.82;
	static double R = 8.31446;
	static double p_0 = 1000;
	static double C = 299792458;
	static double g_swe = 9.82;
	
	public static void main(String[] args) {
		System.out.println(fahrenheitToCelsius(50));
		System.out.println(kelvinToCelsius(0));
		System.out.println(fluidPressure(FluidTable.H20,  10));
		System.out.println(PressureUnderwater(10));
	
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		double Celsius = (fahrenheit-32)*5/9;
		return Celsius;
		}
	public static double kelvinToCelsius(double kelvin) {
		double kelvinToCelsius = kelvin - 273.15;
		return kelvinToCelsius;
		}
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = deep * G * fluid.density;
		return fluidPressure;
		}
	public static double PressureUnderwater(double deep) {
		double fluidPressure = deep * G * FluidTable.H20.density;
		return fluidPressure;
		}
	
}	
