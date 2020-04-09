package com.zipcode.moneymanager.WebMVC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public  class Account extends DAO<AccountData> {

    // ID, CustomerName, Email, AccountNumber, AccountType
    private AccountData accountData;
    private static final String GET_ALL = "SELECT * FROM myNewDB.AccountData";
    private static final String GET_ONE = "SELECT * FROM myNewDB.AccountData WHERE id = ?";
    private static final String INSERT = "INSERT INTO myNewDB.AccountData" +
            "(ID, CustomerName, Email, AccountNumber, AccountType)" +
            "VALUES(?,?,?,?,?)";

    public Account(AccountData accountData) {
        this.accountData = accountData;
    }


    public AccountData getAccountData() {
        return accountData;
    }

    public Account(Connection connection) {
        super(connection);
    }


    public void deposit(float amount) {
        updateBalance(getBalance() + amount);

    }

    public boolean withdraw(int amount) {
        if (canWithdraw(amount)) {
            updateBalance(getBalance() - amount);
            return true;
        } else {
            return false;
        }
    }

    protected boolean canWithdraw(int amount) {
        return getBalance() >= amount;
    }

    public float getBalance() {
        return accountData.getBalance();
    }


    private void updateBalance(float newBalance) {
        accountData = new AccountData(accountData.getId(), accountData.getName(), accountData.getEmail(),
                newBalance, accountData.getTypeAccount());
    }

    //@Override
    public AccountData findByID(int id) {
        // ID, CustomerName, Email, AccountNumber, AccountType
        //AccountData accountData = null;
        try {
            PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(GET_ONE);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                accountData = new AccountData(
                        resultSet.getInt("ID"),
                        resultSet.getString("CustomerName"),
                        resultSet.getString("Email"),
                        resultSet.getInt("AccountNumber"),
                        resultSet.getString("AccountType")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountData;
    }

    public ArrayList<AccountData> findAll() {
        ArrayList<AccountData> accountDataList = new ArrayList<AccountData>();
        try {
            PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(GET_ALL);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                AccountData acData = new AccountData(
                        resultSet.getInt("ID"),
                        resultSet.getString("CustomerName"),
                        resultSet.getString("Email"),
                        resultSet.getInt("AccountNumber"),
                        resultSet.getString("AccountType")
                );
                accountDataList.add(acData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountDataList;
    }

    public AccountData create(AccountData accData) {
        AccountData accountData = null;
        try {
            PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(INSERT);
            ps.setInt(1, accData.getId());
            ps.setString(2, accData.getName());
            ps.setString(3, accData.getEmail());
            ps.setInt(4, accData.getAccountNumber());
            ps.setString(5, accData.getTypeAccount());
            ps.executeUpdate();

            ArrayList<AccountData> accDataList = findAll();
            accountData = accDataList.get(accDataList.size() - 1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountData;
    }


}
