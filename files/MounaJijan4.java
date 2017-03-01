import java.io.*;
import java.util.Scanner;

public class MounaJijan {
	private static Scanner scanner;

	public static void main(String args[]) {
		try {
			// Reading file and getting no. of files to be generated
			String inputfile="D:\\NB-Bluage-II\\PowerBuilder2Spring4Jdbc\\ws2\\camelCase\\AFI.SHPMT.001630941.xml";     
			// output file.
			File file = new File(inputfile);
			scanner = new Scanner(file);
			int count = 1;
			
			
			FileWriter fstream1 = null;
			BufferedWriter out = null;
			while (scanner.hasNextLine()) {
				
				String line =  scanner.nextLine();
				if( line!= null && line.contains("<?xml")){
					
					String lineDoctype = scanner.nextLine();
					String nameFile = lineDoctype.split(" ")[1];
			
					if(out != null) out.close();
					fstream1 = new FileWriter("D:\\NB-Bluage-II\\PowerBuilder2Spring4Jdbc\\ws2\\camelCase\\" + nameFile + ".xml"); // Destination
					 out = new BufferedWriter(fstream1);

					 out.write(line);
					 out.newLine();
					 out.write(lineDoctype);
					 out.newLine();
					 continue;
				}
				out.write(line);
				out.newLine();

			}
			if(out != null) out.close();

			
			   if(file.renameTo(new File("D:\\NB-Bluage-II\\PowerBuilder2Spring4Jdbc\\ws2\\" + file.getName()))){
		    		System.out.println("File is moved successful!");
		    	   }else{
		    		System.out.println("File is failed to move!");
		    	   }
			
			   
			   System.out.println("FINISH");
			
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

	}

}
