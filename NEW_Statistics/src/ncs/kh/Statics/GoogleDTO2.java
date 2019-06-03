package ncs.kh.Statics;

public class GoogleDTO2 {
	
	private String Week;
	private int visit2;
	public String getWeek() {
		return Week;
	}
	public void setWeek(String week) {
		Week = week;
	}
	public int getVisit2() {
		return visit2;
	}
	public void setVisit2(int visit2) {
		this.visit2 = visit2;
	}
	public GoogleDTO2(String week, int visit2) {
		Week = week;
		this.visit2 = visit2;
	}
	public GoogleDTO2() {
		super();
	}
	
	

}
