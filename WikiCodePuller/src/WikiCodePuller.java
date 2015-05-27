import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WikiCodePuller{

	public static void main(String[] args){
		String line = "";
		File file = new File("xss.txt");

		try{
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextLine()){
				line = line + sc.nextLine();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

		//System.out.println(line);

		
		Pattern p = Pattern.compile("<pre>(.+?)</pre>");
		Matcher m = p.matcher(line);
		List<String> xss = new ArrayList<String>();

		while(m.find()){
			xss.add(m.group());
			System.out.println(m.group());
		}
		
	}
}