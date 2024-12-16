package C04Interface.BankService;

public class BankTossService implements BankService{
    @Override
    public void deposit(int money, BankAccount ba) {
        ba.updateBalance(ba.getBalance() + money);
        System.out.println(money + "원 토스로 입금되었습니다.");
        System.out.println("현재 잔액은 " + ba.getBalance() + "원 입니다.");
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        if (ba.getBalance() < money) {
            System.out.println("금액을 다시 확인해주세요.");
        } else {
            ba.updateBalance(ba.getBalance() - money);
            System.out.println(money + "원 토스로 출금되었습니다,.");
            System.out.println("현재 잔액은 " + ba.getBalance() + "원 입니다.");
        }
    }
//    입금시
//    xx원 카카오페이로 입금되었습니다.
//    현재 잔액은 yy원 입니다.

//    출금시
//    xx원 카카오페이로 출금되었습니다.
//    현재 잔액은 yy원 입니다.
}
