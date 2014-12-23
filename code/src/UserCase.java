import java.util.ArrayList;

public class UserCase extends Case {

	protected UserCase(String projName, String category,
			ArrayList<String> language, int teamSize, double systemSize,
			int requirements, int complexity, int budget) {
		super(projName, category, language, teamSize, systemSize, requirements,
				complexity, budget);
	}
}
