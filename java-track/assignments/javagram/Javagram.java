package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Javagram {
	
	private static Scanner s;

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath;
		Picture picture = null;
		Scanner s = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = s.next();
				
				/*String[] relPathParts = relPath.split(File.separator);
				imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
				*/
				
				imagePath = (dir + "\\" + relPath);
				
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
		// prompt user for filter and validate input
		// pass filter ID int to getFilter, and get an instance of Filter back
		
		Filter filter = null;
		try {
			filter = getFilter();
			
		}
		catch(IllegalArgumentException e) {
			System.out.println("Exception thrown:" + e);
			filter = getFilter();
		}		
		
		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = s.next();
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		} else {
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}	
		
		// close input scanner
		s.close();
	}
	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
	private static Filter getFilter() {
		
		System.out.println("Please Select a Filter: ");
		System.out.println("1. Blue Filter");
		System.out.println("2. Green Filter");
		System.out.println("3. Red Filter");
		
		int selection = s.nextInt();
		
		if(selection < 0 || selection > 3) {
			throw new IllegalArgumentException("Invalid selection, please try again.");
		}
		
		Filter f = null;
		if(selection == 1) {
			f = new BlueFilter();
		} else if(selection == 2) {
			f = new GreenFilter();
		} else {
			f = new RedFilter();
		}
		
		return f;
	}

}