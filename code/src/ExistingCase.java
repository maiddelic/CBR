import java.util.ArrayList;

public class ExistingCase extends Case {
	public final int effort;

	protected ExistingCase(String projName, String category,
			ArrayList<String> language, int teamSize, double systemSize,
			int requirements, int complexity, int budget, int effort) {
		super(projName, category, language, teamSize, systemSize, requirements,
				complexity, budget);
		this.effort = effort;
	}
}
