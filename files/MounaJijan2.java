
import java.io.*;
import java.util.Scanner;

public class MounaJijan2 {
	private static Scanner scanner;

	public static void main(String args[]) {

		// dossier a traité
		String inputfile = "D:\\NB-Bluage-II\\PowerBuilder2Spring4Jdbc\\ws2\\camelCase\\";

		File dir = new File(inputfile);

		File[] files = dir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.toLowerCase().endsWith(".xml");
			}
		});

		if(files != null && files.length> 0)
		for (int i = 0; i < files.length; i++) {
			processFile(files[i]);
		}

	}

	private static void processFile(File file) {
		try {
			scanner = new Scanner(file);
			int count = 1;
			FileWriter fstream1 = null;
			BufferedWriter out = null;
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (line != null && line.contains("<?xml")) {
					if (out != null)
						out.close();
					fstream1 = new FileWriter("D:\\NB-Bluage-II\\PowerBuilder2Spring4Jdbc\\ws2\\camelCase\\"
							+ getBaseName(file.getName()) + "--" + count + ".xml"); // Destination
					out = new BufferedWriter(fstream1);
					count++;
				}
				out.write(line);
				out.newLine();
			}
			if (out != null)
				out.close();

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	public static String getBaseName(String fileName) {
		int index = fileName.lastIndexOf('.');
		if (index == -1) {
			return fileName;
		} else {
			return fileName.substring(0, index);
		}
	}

}
