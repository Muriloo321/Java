package model.entities;

import model.exceptions.BusinessException;

public class Account {

    private Integer number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double depMoney){
        balance += depMoney;
    }

    public void withdraw(double depMoney){
        if(depMoney > getBalance()){
            throw new BusinessException("Erro ao sacar: saldo insuficiente");
        }
        if(depMoney > getWithdrawLimit()){
            throw new BusinessException("Erro ao sacar: o saque excede o limite disponível");
        }
        balance -= depMoney;
    }
}
