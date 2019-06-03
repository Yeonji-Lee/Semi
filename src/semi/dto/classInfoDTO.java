package semi.dto;

import java.util.Date;

public class classInfoDTO {
   
   
   private int info_classid_seq;//1 클래스id
   private String info_tutorid;// 2 튜터아이디
   private String info_category; //3 카테고리
   private String info_title;//4 제목
   private String info_explain;//5 클래스 설명
   private String info_intro;//6 튜터소개
   private int info_addr1;//7 우편번호
   private String info_addr2;//8 도로명
   private String info_addr3;//9 지번
   private String info_addr4;//10 상세주소
   private int info_maxperson;//11 희망인원
   private int info_price;//12 희망금액
   private String info_img1; //13 이미지1
   private String info_img2;// 14 이미지2
   private String info_img3; // 15 이미지 3
   private String info_start;//16 시작날짜
   private String info_end;//17 끝 날짜
   private String info_date;//18 클래스 등록일
   private String info_avgstar;//19 별점통계
   private int info_click;//20 클래스 조회 수
public classInfoDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public classInfoDTO(int info_classid_seq, String info_tutorid, String info_category, String info_title,
		String info_explain, String info_intro, int info_addr1, String info_addr2, String info_addr3, String info_addr4,
		int info_maxperson, int info_price, String info_img1, String info_img2, String info_img3, String info_start,
		String info_end, String info_date, String info_avgstar, int info_click) {
	super();
	this.info_classid_seq = info_classid_seq;
	this.info_tutorid = info_tutorid;
	this.info_category = info_category;
	this.info_title = info_title;
	this.info_explain = info_explain;
	this.info_intro = info_intro;
	this.info_addr1 = info_addr1;
	this.info_addr2 = info_addr2;
	this.info_addr3 = info_addr3;
	this.info_addr4 = info_addr4;
	this.info_maxperson = info_maxperson;
	this.info_price = info_price;
	this.info_img1 = info_img1;
	this.info_img2 = info_img2;
	this.info_img3 = info_img3;
	this.info_start = info_start;
	this.info_end = info_end;
	this.info_date = info_date;
	this.info_avgstar = info_avgstar;
	this.info_click = info_click;
}
public int getInfo_classid_seq() {
	return info_classid_seq;
}
public void setInfo_classid_seq(int info_classid_seq) {
	this.info_classid_seq = info_classid_seq;
}
public String getInfo_tutorid() {
	return info_tutorid;
}
public void setInfo_tutorid(String info_tutorid) {
	this.info_tutorid = info_tutorid;
}
public String getInfo_category() {
	return info_category;
}
public void setInfo_category(String info_category) {
	this.info_category = info_category;
}
public String getInfo_title() {
	return info_title;
}
public void setInfo_title(String info_title) {
	this.info_title = info_title;
}
public String getInfo_explain() {
	return info_explain;
}
public void setInfo_explain(String info_explain) {
	this.info_explain = info_explain;
}
public String getInfo_intro() {
	return info_intro;
}
public void setInfo_intro(String info_intro) {
	this.info_intro = info_intro;
}
public int getInfo_addr1() {
	return info_addr1;
}
public void setInfo_addr1(int info_addr1) {
	this.info_addr1 = info_addr1;
}
public String getInfo_addr2() {
	return info_addr2;
}
public void setInfo_addr2(String info_addr2) {
	this.info_addr2 = info_addr2;
}
public String getInfo_addr3() {
	return info_addr3;
}
public void setInfo_addr3(String info_addr3) {
	this.info_addr3 = info_addr3;
}
public String getInfo_addr4() {
	return info_addr4;
}
public void setInfo_addr4(String info_addr4) {
	this.info_addr4 = info_addr4;
}
public int getInfo_maxperson() {
	return info_maxperson;
}
public void setInfo_maxperson(int info_maxperson) {
	this.info_maxperson = info_maxperson;
}
public int getInfo_price() {
	return info_price;
}
public void setInfo_price(int info_price) {
	this.info_price = info_price;
}
public String getInfo_img1() {
	return info_img1;
}
public void setInfo_img1(String info_img1) {
	this.info_img1 = info_img1;
}
public String getInfo_img2() {
	return info_img2;
}
public void setInfo_img2(String info_img2) {
	this.info_img2 = info_img2;
}
public String getInfo_img3() {
	return info_img3;
}
public void setInfo_img3(String info_img3) {
	this.info_img3 = info_img3;
}
public String getInfo_start() {
	return info_start;
}
public void setInfo_start(String info_start) {
	this.info_start = info_start;
}
public String getInfo_end() {
	return info_end;
}
public void setInfo_end(String info_end) {
	this.info_end = info_end;
}
public String getInfo_date() {
	return info_date;
}
public void setInfo_date(String info_date) {
	this.info_date = info_date;
}
public String getInfo_avgstar() {
	return info_avgstar;
}
public void setInfo_avgstar(String info_avgstar) {
	this.info_avgstar = info_avgstar;
}
public int getInfo_click() {
	return info_click;
}
public void setInfo_click(int info_click) {
	this.info_click = info_click;
}
 
   
}