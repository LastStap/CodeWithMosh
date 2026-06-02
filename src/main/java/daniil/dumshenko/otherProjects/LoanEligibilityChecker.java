package daniil.dumshenko.otherProjects;

public class LoanEligibilityChecker {

    public String checkEligibility(int age, double annualIncome, double existingDebt) {
        if (annualIncome == 0) return "False input: income cannot be 0";
        double debtToIncomeRatio = existingDebt / annualIncome;

        if (age >= 18 && age <= 65 && annualIncome >= 30_000 && debtToIncomeRatio < 0.4) {
            return "Approved";
        } else return "Rejected";
    }
}
