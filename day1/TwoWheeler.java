package week1.day1;

public class TwoWheeler {
	
	/*
	 * Assignment-1 This Class is created to declare global variables with
	 * appropriate values
	 */

	public int noOfWheels = 2;
	public short noOfMirrors = 2;
	public long chassisNumber = 2345789012319083L;
	public boolean isPunctured = false;
	public  String bikeName = "Royal Enfield";
	public double runningKM = 65.5;
	
	public static void main (String args[]) {
		TwoWheeler objTw = new TwoWheeler ();
		System.out.println("Number of Wheels in bike is "+objTw.noOfWheels+" ");
		System.out.println("Number of Mirrors in bike is "+objTw.noOfMirrors+" ");
		System.out.println("Chassis Number is "+objTw.chassisNumber+" ");
		System.out.println("Bike Puncture Status is "+objTw.isPunctured+" ");
		System.out.println("Bike Name is "+objTw.bikeName+" ");
		System.out.println("Bike Running KM is "+objTw.runningKM+" ");
	}
	
	
}
