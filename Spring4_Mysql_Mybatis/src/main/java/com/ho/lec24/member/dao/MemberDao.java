
package com.ho.lec24.member.dao;
  
import java.beans.PropertyVetoException; 
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.List;
 
import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate; 
import org.springframework.jdbc.core.PreparedStatementSetter; 
import org.springframework.jdbc.core.RowMapper; 
//import org.springframework.jdbc.datasource.DriverManagerDataSource; 
import org.springframework.stereotype.Repository;

import com.ho.lec24.member.Member;
 
 
@Repository 
public class MemberDao implements IMemberDao {

	@Override
	public int memberInsert(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member memberSelect(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memberUpdate(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberDelete(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

  }
 