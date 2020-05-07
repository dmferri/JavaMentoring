package util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
	File file = new File("C:/Users/DaniloMadrugaFerri/Desktop/data.dat");
	public String content;	
	{
		try (FileOutputStream fop = new FileOutputStream(file)) {
			if (!file.exists()) {
				file.createNewFile();
			}
			byte[] contentInBytes = content.getBytes();
			fop.write(contentInBytes);
			fop.flush();
			fop.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}