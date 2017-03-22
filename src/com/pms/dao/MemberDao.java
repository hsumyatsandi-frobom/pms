package com.pms.dao;

public interface MemberDao {

	public boolean isMember(int LoginID, int teamid);

	public boolean isProjMember(int projID, int loginID);

}