public class StoreToRent {
    private final double INTEREST_RATE = 0.25;
    private boolean loanRequired;
    private double loanAmount;
    private int loanPaymentTerm;

    public StoreToRent(boolean loanRequired, double loanAmount, int loanPaymentTerm) {
        this.loanRequired = loanRequired;
        this.loanAmount = loanAmount;
        this.loanPaymentTerm = loanPaymentTerm;
    }

    public double getINTEREST_RATE() {
        return INTEREST_RATE;
    }

    public boolean isLoanRequired() {
        return loanRequired;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getLoanPaymentTerm() {
        return loanPaymentTerm;
    }

    public double calculateLoanFinancing() {
        if (loanRequired) {
            return (loanAmount * (1 + INTEREST_RATE)) / loanPaymentTerm;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Parent class toString()";
    }

    public void enterStoreDetails() {
        // 这里可以添加输入店铺详情的逻辑
    }
}    