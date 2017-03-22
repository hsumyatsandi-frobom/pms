package com.pms.domain;

public class Member {
	private int memberid;

	private int memberrole;

	private int teamid;

	private int userid;

	private int projectid;

	private int projectmemberrole;

	public Member() {

	}

	public Member(int memberid, int memberrole, int teamid, int userid, int projectid, int projectmemberrole) {

		this.memberid = memberid;
		this.memberrole = memberrole;
		this.teamid = teamid;
		this.userid = userid;
		this.projectid = projectid;
		this.projectmemberrole = projectmemberrole;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public int getMemberrole() {
		return memberrole;
	}

	public void setMemberrole(int memberrole) {
		this.memberrole = memberrole;
	}

	public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public int getProjectmemberrole() {
		return projectmemberrole;
	}

	public void setProjectmemberrole(int projectmemberrole) {
		this.projectmemberrole = projectmemberrole;
	}

}