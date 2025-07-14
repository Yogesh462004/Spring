package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Customer;
@Repository("dao")
public class DaoImpl implements Dao {
@Autowired	
private DataSource ds;
private static final String insert="insert into SPRING_CUST values(CNO_SEQ.NEXTVAL,?,?,?,?)";
	@Override
	public int insert(Customer cust) throws Exception {
		int count=0;
		try(
				Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(insert);
				){
			
			ps.setString(1, cust.getName());
			ps.setFloat(2, cust.getBill());
			ps.setFloat(3, cust.getDiscount());
			ps.setFloat(4, cust.getAmount());
			count=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}
