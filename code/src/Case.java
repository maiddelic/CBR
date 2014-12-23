import java.util.ArrayList;

public abstract class Case {
	public final String projName;
	public final String category;
	public final ArrayList<String> language;
	public final int teamSize;
	public final double systemSize;
	public final int requirements;
	public final int complexity;
	public final int budget;

	protected Case(String projName, String category,
			ArrayList<String> language, int teamSize, double systemSize,
			int requirements, int complexity, int budget) {
		this.projName = projName;
		this.category = category;
		this.language = language;
		this.teamSize = teamSize;
		this.systemSize = systemSize;
		this.requirements = requirements;
		this.complexity = complexity;
		this.budget = budget;
	}

	// similarity-function
	public double getSimilarity(Case c) {
		double similarity = 0;
		
		// Language-similarity
		int langSimPoints = 0, maxLangSimPoints = language.size();
		if (c.language.size() > maxLangSimPoints) {
			maxLangSimPoints = c.language.size();
		}
		for (String s : language) {
			for (String t : c.language) {
				if (s.equals(t)) langSimPoints++;
			}
		}
		double languageValue = (double) (langSimPoints)
				/ (double) (maxLangSimPoints);
		
		// Category-similarity
		double categoryValue = 0;
		if (category == c.category) categoryValue = 1;
		
		// Teamsize-similarity
		int teamDiff = Math.abs(c.teamSize - teamSize);

		double teamSizeValueRoot = (double) (teamDiff)
				/ (double) (CaseLibrary.diffTeamSize);
		double teamSizeValue = teamSizeValueRoot * teamSizeValueRoot;
		
		// System-similarity
		double systemDiff = Math.abs(c.systemSize - systemSize);
		double systemSizeValueRoot = systemDiff / CaseLibrary.diffSystemSize;
		double systemSizeValue = systemSizeValueRoot * systemSizeValueRoot;
		
		// Requirements-similarity
		int requirementsDiff = Math.abs(c.requirements - requirements);
		double requirementsValueRoot = (double) (requirementsDiff)
				/ (double) (CaseLibrary.diffRequirements);
		double requirementsValue = requirementsValueRoot * requirementsValueRoot;
		
		
		// Complexity-similarity
		int complexityDiff = Math.abs(c.complexity - complexity);
		double complexityValueRoot = (double) (complexityDiff)
				/ (double) (CaseLibrary.diffComplexity);
		double complexityValue = complexityValueRoot * complexityValueRoot;
		
		// Budget-similarity
		int budgetDiff = Math.abs(c.budget - budget);
		double budgetValueRoot = (double) (budgetDiff)
				/ (double) (CaseLibrary.diffBudget);
		double budgetValue = budgetValueRoot * budgetValueRoot;
		
		// Similarity!!!
		similarity = 1 - Math.sqrt((languageValue + categoryValue
				+ teamSizeValue + systemSizeValue + requirementsValue + complexityValue + budgetValue) / 7);
		return similarity;
	}

	public String toString() {
		return projName;
	}
}
