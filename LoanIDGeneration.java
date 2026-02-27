import java.util.UUID;

public class LoanIdGenerator {

    // Method to generate a unique loan ID
    public static String generateLoanId() {
        return "LOAN-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    public static void main(String[] args) {
        String loanId = generateLoanId();
        System.out.println("Generated Loan ID: " + loanId);
    }
}
