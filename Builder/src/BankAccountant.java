// Main purpose is to create loan
class Loan{
    //All the field are private there for no one can create direct loan
    private double loanAmount;
    private double loanRate;
    private int loanPeriod;
    private int guarantees;
    public Loan(){}
    //loan build through the builder
    public Loan(Builder loanBuilder) {
        this.loanAmount = loanBuilder.loanAmount;
        this.loanRate = loanBuilder.loanRate;
        this.loanPeriod = loanBuilder.loanPeriod;
    }
    public String toString() {
        return "Build a Loan with rate "+this.loanRate+"%, period "
                +this.loanPeriod+" month for "+this.loanAmount+"$ ";
    }

    // Abstract builder
    abstract class Builder{
        double loanAmount=0;
        double loanRate=0;
        int loanPeriod=0;
        int guarantees;
        public abstract Loan build();
    }

    // First Concrete builder
    class HouseLoanBuilder extends Builder{
        public HouseLoanBuilder(double loanAmount) {
            this.loanAmount = loanAmount;
        }
        public HouseLoanBuilder loanRate(double loanRate) {
            this.loanRate = loanRate;
            return this;
        }

        public HouseLoanBuilder loanPeriod(int loanPeriod) {
            this.loanPeriod = loanPeriod;
            return this;
        }

        public HouseLoanBuilder guarantees(int guarantees) {
            this.guarantees = guarantees;
            return this;
        }

        @Override
        public Loan build() {
            Loan loan=new Loan(this);
            return loan;
        }
    }

    // Second Concrete builder
    class PersonalLoanBuilder extends Builder{
        public PersonalLoanBuilder(double loanAmount) {
            this.loanAmount = loanAmount;
        }
        public PersonalLoanBuilder loanRate(double loanRate) {
            this.loanRate = loanRate;
            return this;
        }

        public PersonalLoanBuilder loanPeriod(int loanPeriod) {
            this.loanPeriod = loanPeriod;
            return this;
        }
        public PersonalLoanBuilder guarantees(int guarantees) {
            this.guarantees = guarantees;
            return this;
        }
        //Build loan using builder
        @Override
        public Loan build() {
            Loan loan=new Loan(this);
            return loan;
        }
    }
}

// Accountant create loans according to the construction flow of builder
// (There are some mandatory and optional information for loans)
public class BankAccountant {
    public static void main(String[] args) {
        // Create personal loan without guarantees
        Loan loan1=new Loan().new HouseLoanBuilder(10000).loanPeriod(60).loanRate(8).build();
        System.err.println(loan1);
        // Create Housing loan with guarantees
        Loan loan2=new Loan().new PersonalLoanBuilder(250000)
                .loanPeriod(150).loanRate(5).guarantees(2).build();
        System.err.println(loan2);
    }
}