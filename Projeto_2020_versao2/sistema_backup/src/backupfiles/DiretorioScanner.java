package backupfiles;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DiretorioScanner {
	private static FileWriter fWriter;
	private static BufferedWriter bWriter;
	
	
	public static void inicializarWriter(File outputFile) {
		try {
			fWriter = new FileWriter(outputFile.getAbsoluteFile());
			bWriter = new BufferedWriter(fWriter);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
