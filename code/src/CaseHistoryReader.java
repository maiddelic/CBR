import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class CaseHistoryReader {
	public static ArrayList<Case> get() throws IOException {
		//URL url = CaseHistoryReader.class.getClassLoader().getResource("HistoryProjects.txt");
		//System.out.println(url.toString());
		
		FileInputStream stream = new FileInputStream("HistoryProjects.txt");
		DataInputStream in = new DataInputStream(stream);
	    //System.out.println(url.getPath());
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		ArrayList<String> lang = null;
		ArrayList<Case> cases = new ArrayList<Case>();
		int budget = 0, moneyBudget = 0;
		for (String line = br.readLine(); line != null; line = br.readLine()) {
			lang = new ArrayList<String>();
			String[] fields = line.split("\t");
			lang.add(fields[2]);
			moneyBudget =  Integer.parseInt(fields[7]);
			if (moneyBudget <= 15000) budget = 1;
			if (moneyBudget > 15000 && moneyBudget <= 20000) budget = 2;
			if (moneyBudget > 20000 && moneyBudget <= 25000) budget = 3;
			if (moneyBudget > 25000 && moneyBudget <= 30000) budget = 4;
			if (moneyBudget > 30000) budget = 5;
			
			cases.add(new ExistingCase(fields[0], fields[1], lang, Integer.parseInt(fields[3]), 
					Double.parseDouble(fields[4]) / 1000,
					Integer.parseInt(fields[5]), Integer.parseInt(fields[6]),
					budget, Integer.parseInt(fields[8])));
		}
		br.close();
		return cases;
	}
}