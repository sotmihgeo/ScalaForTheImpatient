// Type these commands into the REPL, or run scala script.scala

class BankAccount(private var _balance: Int = 0) {
  def balance = _balance

  def deposit(sum: Int) = _balance += sum
  def withdraw(sum: Int) = {
    if (sum <= _balance)
      _balance -= sum
	else
      throw new Exception("balanta negativa...")	
  }	
}

val myAccount = new BankAccount
myAccount.deposit(500)
myAccount.withdraw(300)
println(myAccount.balance)
myAccount.withdraw(300)