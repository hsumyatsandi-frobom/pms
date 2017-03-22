package com.pms.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pms.domain.Member;
import com.pms.jdbc.MemberRowMapper;

public class MemberDaoImpl implements MemberDao {

	@Autowired
	DataSource dataSource;

	public boolean isMember(int loginID, int teamid) {

		List<Member> memberList = new ArrayList<Member>();
		boolean isTeamMem = false;
		String sql = "select * from member where teamid= " + teamid;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		memberList = jdbcTemplate.query(sql, new MemberRowMapper());

		for (Member member : memberList) {

			if (member.getMemberid() == loginID) {
				System.out.println("is team member");
				isTeamMem = true;
			}
		}

		return isTeamMem;
	}

	public boolean isProjMember(int projid, int loginid) {

		List<Member> memberList = new ArrayList<Member>();
		boolean isProjMem = false;
		String sql = "select * from member where projectid= " + projid;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		memberList = jdbcTemplate.query(sql, new MemberRowMapper());

		for (Member member : memberList) {

			if (member.getMemberid() == loginid) {
				System.out.println("is project member");
				isProjMem = true;
			}
		}

		return isProjMem;
	}

}