import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;


public class Failas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String filePath = "C:\\My Files\\My Cooding\\eclipse-workspace\\projektinio bandymai\\zodziaiAnsi.csv";
		
		//String filePath = "C:\\My Files\\My Cooding\\eclipse-workspace\\projektinio bandymai\\zodziaiUnicode.csv";
		
		String filePath = "C:\\My Files\\My Cooding\\eclipse-workspace\\projektinio bandymai\\zodziaiUTF8.csv";
		
		
		
		String lines = null;

		try (FileReader fr = new FileReader(filePath); BufferedReader br = new BufferedReader(fr)) { //, StandardCharsets.UTF_8

			while ((lines = br.readLine()) != null) {

				//String[] labels = lines.split(",");

				

				System.out.println(lines);

			}
		} catch (Exception e) {
			System.out.println("File not found: " + e.getMessage());
		}
		
		
	}

}
