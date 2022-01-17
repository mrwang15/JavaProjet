package com.yonyou.day08.bank;

import com.yonyou.day08.bank.ATM;
import com.yonyou.day08.bank.Account;
import com.yonyou.day08.bank.AccountDetails;
import com.yonyou.day08.bank.BankCard;
import com.yonyou.day08.bank.User;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Author 王佳鹏
 * @Date 2022/1/5 18:15
 * @Description
 *  入口
 */
public class Main {

    public static void main(String[] args) {

       ATM atm = new ATM();
            User user = initUser(atm);
            BankCard bankCard = user.insertCard();
            atm.work(bankCard,user);
    }


    /**
     * 初始化银行的账户
     * @param atm atm柜员机
     * @return 返回被初始化的用户
     */
    public static User initUser(ATM atm) {
        System.out.println("===========身份注册===========");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.next();
        System.out.println("请输入性别：");
        String sex = scanner.next();
        System.out.println("请输入身份证号：");
        String idCard = scanner.next();
        System.out.println("请输入电话号码：");
        String tel = scanner.next();
        Account account = atm.getAccount()[0];
        BankCard bankCard = new BankCard(account);
        User user = new User(name, sex, idCard, tel, bankCard);
        System.out.println("您的初始密码为000000，请及时更换密码");
        return user;

    }

}
