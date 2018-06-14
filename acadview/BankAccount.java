package acadview;

abstract class Account{
	abstract public void getAccno();
	public void accno() {
		
	}
}

  class BankAccount {

                
                   
                public static void main(String[] args) {
                	
                	Account a = new Account() {
                    	
                    	@Override
                    	public void getAccno() {
                    		System.out.println("This Account");
                    	}
                    };
                  
                    BankAccount b = new BankAccount();
                    BankAccount b1 = new BankAccount();
                    
                    
                }
        
}
