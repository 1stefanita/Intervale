import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

 class Interval1 {
	  private double min;
	    private double max;
	    private int nrTestate = 0;
	    private int nrTestateContinute = 0;

	    public Interval1(Double min, Double max) {
	        this.min = min;
	        this.max = max;
	        this.nrTestate = 0;
	        this.nrTestateContinute = 0;
	    }

	    public void testNumber(Double number) {
	        nrTestate++;
	        if (number >= min && number <= max) {
	            nrTestateContinute++;
	        }
	    }

	    public double procentaj() {
	        if (nrTestate == 0) {
	            return 0; 
	        }
	        return (double) nrTestateContinute / nrTestate * 100;
	    }
	    public String toString() {
	        return "[" + min + " , " + max + "]";
	    }
	   


public class Interval {
	public static void main(String[] args) {
		try{
	
			BufferedReader reader = new BufferedReader(new FileReader("interval.dat")); // "C:\JAVAProgramare\Curs4\in.data.txt"
			BufferedReader reader2 = new BufferedReader(new FileReader("numere.dat"));
			FileWriter writer= new FileWriter("statistica.dat");
			
		
			writer.close();
			reader.close();
			reader2.close();


		}catch(IOException e) {
			System.out.println("NU exista acest fisier sa nu l pot accesa ");
			
		}
	}

}
