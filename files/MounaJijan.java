
import java.io.*;
import java.util.Scanner;

public class MounaJijan {
	public static void main(String args[]) {
		try {
			// Reading file and getting no. of files to be generated
			String inputfile="D:\\NB-Bluage-II\\PowerBuilder2Spring4Jdbc\\ws2\\camelCase\\AFI.SHPMT.001630941.xml";     
			double nol = 2000.0; // No. of lines to be split and saved in each
									// output file.
			File file = new File(inputfile);
			Scanner scanner = new Scanner(file);
			int count = 1;
			
			
			FileWriter fstream1 = null;
			BufferedWriter out = null;
			while (scanner.hasNextLine()) {
				
				String line =  scanner.nextLine();
				if( line!= null && line.contains("<?xml")){
					
					if(out != null) out.close();
					fstream1 = new FileWriter("D:\\NB-Bluage-II\\PowerBuilder2Spring4Jdbc\\ws2\\camelCase\\File" + count + ".xml"); // Destination
					 out = new BufferedWriter(fstream1);

					count++;
				}
				out.write(line);
				out.newLine();

			}
			if(out != null) out.close();

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

	}

}
