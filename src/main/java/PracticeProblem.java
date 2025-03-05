import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;

public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(readFile("file.txt"));
		System.out.println(readFile("file1.txt"));
		System.out.println(readFile("file2.txt"));
		System.out.println(backwardsReadFile("file.txt"));
		System.out.println(backwardsReadFile("file1.txt"));
		System.out.println(backwardsReadFile("file2.txt"));
	}

	//q1
	public static String readFile(String filename) {
		FileReader fileReader = null;
		String file = "";
		try {
			fileReader = new FileReader(filename);
			int c;
			while ((c = fileReader.read()) != -1) {
				file += (char)c;
		 	}
			return file;
		}
		catch(IOException e) {
			return "wrong";
		}
		finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			}
			catch(IOException e) {
				return "wrong";
			}
		}
		}

	//q2
	public static String backwardsReadFile(String filename2) {
		FileReader fileReader = null;
		ArrayList<Character> charList = new ArrayList<>();
        try {
            fileReader = new FileReader(filename2);
            int c;
            while ((c = fileReader.read()) != -1) {
                charList.add((char)c);
            }
            String reversed = "";
            for (int i = charList.size() - 1; i >= 0; i--) {
                reversed += charList.get(i);
            }
            return reversed;
        } 
		catch(IOException e) {
			return "wrong";
		}
		finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			}
			catch(IOException e) {
				return "wrong";
			}
	}

	}
}
