package com.pms.services;

public interface MemberService {

	public boolean isMember(int loginId, int teamid);

	public boolean isProjMember(int projID, int loginID);

}
