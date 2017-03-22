package com.pms.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.pms.dao.MemberDao;

public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memberdao;

	public boolean isMember(int loginID, int teamid) {
		return memberdao.isMember(loginID, teamid);
	}

	public boolean isProjMember(int projID, int loginID) {
		return memberdao.isProjMember(projID, loginID);
	}

}
