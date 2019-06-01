package semi.dto;

import java.util.Date;

public class doingDTO {
	private int do_seq;
	private String do_classId;
	private String do_userId;
	private String do_status; // ¼ö°­Áß Y/N
	private String do_reviewOk;
	private Date do_date;
	public doingDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public doingDTO(int do_seq, String do_classId, String do_userId, String do_status, String do_reviewOk,
			Date do_date) {
		super();
		this.do_seq = do_seq;
		this.do_classId = do_classId;
		this.do_userId = do_userId;
		this.do_status = do_status;
		this.do_reviewOk = do_reviewOk;
		this.do_date = do_date;
	}
	public int getDo_seq() {
		return do_seq;
	}
	public void setDo_seq(int do_seq) {
		this.do_seq = do_seq;
	}
	public String getDo_classId() {
		return do_classId;
	}
	public void setDo_classId(String do_classId) {
		this.do_classId = do_classId;
	}
	public String getDo_userId() {
		return do_userId;
	}
	public void setDo_userId(String do_userId) {
		this.do_userId = do_userId;
	}
	public String getDo_status() {
		return do_status;
	}
	public void setDo_status(String do_status) {
		this.do_status = do_status;
	}
	public String getDo_reviewOk() {
		return do_reviewOk;
	}
	public void setDo_reviewOk(String do_reviewOk) {
		this.do_reviewOk = do_reviewOk;
	}
	public Date getDo_date() {
		return do_date;
	}
	public void setDo_date(Date do_date) {
		this.do_date = do_date;
	}
	
	
	
	
}
