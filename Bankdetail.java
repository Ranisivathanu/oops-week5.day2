package week5.day2;

public class Bankdetail extends SBIloan implements CIBIL,PNB {
    public void creditScore() {
		System.out.println("They have creditScore category ");
		}
public void minimumBalance() {
		System.out.println("They have minimumBalance limit ");
		}
public void cibilScore() {
		System.out.println("They have cibilScore category ");
		}

	@Override
public void bankBalance() {
		System.out.println("They provide bankBalance slip");
		}
   @Override
public void maximumLoanAmount() {
		System.out.println("They have maximumLoanAmount limit ");
		}
	public static void main(String[] args) {
		
		Bankdetail list=new Bankdetail();
		list.creditScore();
		list.minimumBalance();
		list.cibilScore();
		list.maximumLoanAmount();
		list.bankBalance();
		list.ITLoan();


	}

}
