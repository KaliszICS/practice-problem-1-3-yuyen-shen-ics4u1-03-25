import java.io.*; //required to open files in java
import java.util.Scanner;

class Notes {
	public static void main(String[] args) {
		
		//FileReader

		// FileReader inputStream = null;

		// try {
		// 	inputStream = new FileReader("file.txt");

		// 	int c;

		// 	while ((c = inputStream.read()) != -1) {
		// 		System.out.print((char)c);
		// 	}
		// }
		// catch (IOException e) {
		// 	System.out.println(e);
		// }
		// finally { //close your FileReader
		// 	//finally runs even if the your code stopped during the try
		// 	//function -> returns during the try, finally still runs
		// 	try {
		// 		if (inputStream != null) {
		// 			inputStream.close();
		// 		}
		// 	}
		// 	catch(IOException e) {
		// 		System.out.println(e);
		// 	}
		// }	

		//BufferedReader

		// BufferedReader inputStream = null;

		// try {
		// 	inputStream = new BufferedReader(new FileReader("testfile.txt"));

		// 	String line;
		// 	//when readLine() == null, we have reached the end of the file
		// 	while ((line = inputStream.readLine()) != null) { //does not read newline characters
		// 		System.out.println(line);
		// 	}
		// }
		// catch (IOException e) {
		// 	System.out.println("There was an IOException thrown");
		// }
		// finally {
		// 	try {
		// 		if (inputStream != null) {
		// 			inputStream.close();
		// 		}
		// 	}
		// 	catch (IOException e) {
		// 		System.out.println(e);
		// 	}
		// }

		Scanner s = null;

		try {
			// s = new Scanner(new BufferedReader(new FileReader("testfile.txt")));
			s = new Scanner(new File("file.txt"));

			while (s.hasNext()) { 
				System.out.print(s.next() + " "); //.next stops at punctuation, spaces, and newlines
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		// catch (FileNotFoundException e) {
		// 	System.out.println(e);
		// }
		finally {
			if (s != null) {
				s.close();
			}
		}
		/*
		The scanner read in other data types besides strings
		It can also validate that the information is that data 		
		type before doing so
		hasNextDouble
		nextDouble
		hasNextInt
		nextInt
		hasNextBoolean
		nextBoolean
		nextLine
		*/
	}
}
