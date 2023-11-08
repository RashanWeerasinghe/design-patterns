
class Loan{
    private double loanAmount;
    private double loanRate;
    private int loanPeriod;
    private int guarantees;

    Loan(Builder builder){

    }

    class abstract Builder{
        double loanAmount;
        double loanRate;
        int loanPeriod;
        int guarantees;

        public abstract Loan Build();
    }
    class HouseLoanBuilder extends Builder{
         public Loan Build(){

         }
    }

    class PersonalLoanBuilder extends Builder{
        double loanAmount;
        double loanRate;
        int loanPeriod;
        int guarantees;

        public void setLoanAmount(double loanAmount) {
            this.loanAmount = loanAmount;
            return this;
        }

        public void setLoanRate(double loanRate) {
            this.loanRate = loanRate;
            return this;
        }

        public void setLoanPeriod(int loanPeriod) {
            this.loanPeriod = loanPeriod;
            return this;
        }

        public void setGuarantees(int guarantees) {
            this.guarantees = guarantees;
            return this;
        }
        public Loan Build(){

        }
    }

}

class Bank{
    public static void main(String[] args) {
        Loan loan=new Loan().
    }

}