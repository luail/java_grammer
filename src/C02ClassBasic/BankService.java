package C02ClassBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankService {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("서비스번호를 입력하세요. 1.개설, 2.조회, 3.입금, 4.출금, 5.송금");
            int input = Integer.parseInt(sc.nextLine());
            if (input == 1) {
                System.out.println("계좌번호를 입력하세요.");
                String number = sc.nextLine();
                System.out.println("계좌에 넣을 금액을 입력하세요.");
                int money = Integer.parseInt(sc.nextLine());
                new BankAcounts(number, money);
                System.out.println("계좌개설을 완료하였습니다.");
            }
        }
    }
}
class BankAcounts {
    public static Map<String, BankAcounts> myBank = new HashMap<>();
    static int static_id = 0;
    private String acNumber;
    private int balance;
    private int id;

    public BankAcounts(String Number, int balance) {
        this.acNumber = Number;
        this.balance = balance;
        this.id = static_id;
        static_id++;
        myBank.put(Number, new BankAcounts(Number, balance));
    }

    public String getAcNumber() {
        return acNumber;
    }

    public int getBalance() {
        return balance;
    }

    public static Map<String, BankAcounts> getMyBank() {
        return myBank;
    }
}

