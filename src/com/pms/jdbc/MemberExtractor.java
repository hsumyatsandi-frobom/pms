package com.pms.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;

import com.pms.domain.Member;

public class MemberExtractor {

	public Member extractData(ResultSet resultSet) throws SQLException, DataAccessException {

		Member member = new Member();
		member.setMemberid(resultSet.getInt(1));
		member.setMemberrole(resultSet.getInt(2));
		member.setProjectid(resultSet.getInt(3));
		member.setTeamid(resultSet.getInt(4));
		member.setUserid(resultSet.getInt(5));
		member.setProjectmemberrole(resultSet.getInt(6));
		return member;
	}

}
