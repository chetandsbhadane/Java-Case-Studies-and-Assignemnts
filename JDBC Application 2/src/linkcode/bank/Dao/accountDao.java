package linkcode.bank.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import linkcode.bank.model.Account;

public class accountDao implements AccountInterface{

	Connection con = null;
	public Connection myConnection() {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","997555");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	

	@Override
	public int create(List<Account> accObj) {
		int i=0;
		Account a = accObj.get(0);
		myConnection();
		try {
			PreparedStatement pstate = con.prepareStatement("insert into linkcodebank2 values(?,?,?)");
			pstate.setInt(1, a.getAccNo());
			pstate.setString(2, a.getCustName());
			pstate.setDouble(3, a.getAccBal());
			i = pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
		
	}


	@Override
	public int delete(int accno) {
		int i=0;
		myConnection();
		try {
			PreparedStatement pstate = con.prepareStatement("delete from linkcodebank2 where custId=?");
			pstate.setInt(1, accno);
			i = pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	
	}


	@Override
	public List<Account> search(int accno) {
		int i=0;
		ResultSet result = null;
		List<Account> aLst = null;
		myConnection();
		try {
			PreparedStatement pstate = con.prepareStatement("select * from linkcodebank2 where custId=?");
			pstate.setInt(1, accno);
			result = pstate.executeQuery();
			if(result.next()) {
				aLst = new LinkedList<Account>();
				Account a = new Account(result.getInt(1), result.getString(2), result.getDouble(3));
				aLst.add(a);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return aLst;
		
	}


	@Override
	public List<Account> update(int accno, double accBal) {
		int i=0;
		ResultSet result = null;
		List<Account> aLst = null;
		myConnection();
		try {
			PreparedStatement pstate = con.prepareStatement("update linkcodebank2 set custBal=? where custId=?");
			pstate.setInt(2, accno);
			pstate.setDouble(1, accBal);
			i = pstate.executeUpdate();
			
			PreparedStatement pstate2 = con.prepareStatement("select * from linkcodebank2 where custId=?");
			pstate2.setInt(1, accno);
			result = pstate2.executeQuery();
			if(result.next()) {
				aLst = new LinkedList<Account>();
				System.out.println("hii");
				Account a = new Account(result.getInt(1), result.getString(2), result.getDouble(3));
				aLst.add(a);
				System.out.println("hwllo");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return aLst;
		
	}


	@Override
	public List<Account> displayAllRecords() {
		myConnection();
		List<Account> lst = null;
		String str = "select * from linkcodebank2";
		try {
			Statement stm = con.createStatement();
			ResultSet result = stm.executeQuery(str);
			lst = new LinkedList<Account>();
			while(result.next()) {
				
				lst.add(new Account(result.getInt(1), result.getString(2), result.getDouble(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}

}
