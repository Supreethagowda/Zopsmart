package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fileutils {

	public String getDataFromPropertyFile(String key) throws IOException
	{
		
		FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
		
	}

}
