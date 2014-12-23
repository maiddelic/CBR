import java.io.IOException;
import java.util.ArrayList;

public class CaseLibrary {
	public static int maxTeamSize = 0,minTeamSize = 10000;
	public static int diffTeamSize;

	public static double maxSystemSize = 0, minSystemSize = 10000;
	public static double diffSystemSize;

	public static int maxRequirements = 0, minRequirements = 10000;
	public static int diffRequirements;

	public static int maxComplexity = 0, minComplexity = 5;
	public static int diffComplexity;

	public static int maxBudget = 0, minBudget = 5;
	public static int diffBudget;

	public static ArrayList<Case> loadCases() {
		ArrayList<Case> cases = new ArrayList<Case>();

		try {
			cases = CaseHistoryReader.get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (Case c : cases) {
			if (c.teamSize < minTeamSize)
				minTeamSize = c.teamSize;
			if (c.teamSize > maxTeamSize)
				maxTeamSize = c.teamSize;

			if (c.systemSize < minSystemSize)
				minSystemSize = c.systemSize;
			if (c.systemSize > maxSystemSize)
				maxSystemSize = c.systemSize;

			if (c.requirements < minRequirements)
				minRequirements = c.requirements;
			if (c.requirements > maxRequirements)
				maxRequirements = c.requirements;

			if (c.complexity < minComplexity)
				minComplexity = c.complexity;
			if (c.complexity > maxComplexity)
				maxComplexity = c.complexity;

			if (c.budget < minBudget)
				minBudget = c.budget;
			if (c.budget > maxBudget)
				maxBudget = c.budget;
		}

		diffTeamSize = maxTeamSize - minTeamSize;
		diffSystemSize = maxSystemSize - minSystemSize;
		diffRequirements = maxRequirements - minRequirements;
		diffComplexity = maxComplexity - minComplexity;
		diffBudget = maxBudget - minBudget;
		
		/*System.out.println("CaseLibrary: diffTeamSize: " + diffTeamSize + 
				" diffSystemSize: " + diffSystemSize + 
				" diffRequirements: " + diffRequirements + 
				" diffComplexity: " + diffComplexity + 
				" diffBudget: " + diffBudget);*/

		return cases;
	}
}
