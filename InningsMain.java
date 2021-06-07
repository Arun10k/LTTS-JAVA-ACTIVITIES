package com.ltts;

class Innings{
public String teamname;
public String inningsname;
public String runs;
public void displayInningsDetails() {
	System.out.println("Enter the teamname:\n" + teamname + "\nEnter Session\n" + inningsname + "\nEnter Runns\n" + runs );
}
public String getTeamname() {
	return teamname;
}
public void setTeamname(String teamname) {
	this.teamname = teamname;
}
public String getInningsname() {
	return inningsname;
}
public void setInningsname(String inningsname) {
	this.inningsname = inningsname;
}
public String getRuns() {
	return runs;
}
public void setRuns(String string) {
	this.runs = string;
}
}
public class InningsMain {
	public static void main(String[] args) {
		Innings i = new Innings();
		i.setTeamname("Australia");
		i.setInningsname("First");
		i.setRuns("200");
		i.displayInningsDetails();
	}
}




