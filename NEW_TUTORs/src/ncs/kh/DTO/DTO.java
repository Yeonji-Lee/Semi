package ncs.kh.DTO;

public class DTO {
	UfileDTO udto = new UfileDTO();
	
	private int info_classid_seq;//클래스id
	private String category; //카테고리
	private String intro;//튜터소개
	private int addr1;//우편번호
	private String addr2;//도로명
	private String addr3;//지번
	private String addr4;//상세주소
	private int maxperson;//희망인원
	private int price;//희망금액
	private String title;//제목입력
	private String start;//시작날짜
	private String end;//끝 날짜
	private String explain;//클래스 설명
	private String filePath;
	
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public int getInfo_classid_seq() {
		return info_classid_seq;
	}
	public void setInfo_classid_seq(int info_classid_seq) {
		this.info_classid_seq = info_classid_seq;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public int getAddr1() {
		return addr1;
	}
	public void setAddr1(int addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getAddr3() {
		return addr3;
	}
	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}
	public String getAddr4() {
		return addr4;
	}
	public void setAddr4(String addr4) {
		this.addr4 = addr4;
	}
	public int getMaxperson() {
		return maxperson;
	}
	public void setMaxperson(int maxperson) {
		this.maxperson = maxperson;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	public DTO() {
		super();
	}
	public DTO(int info_classid_seq, String category, String intro, int addr1, String addr2, String addr3, String addr4,
			int maxperson, int price, String title, String start, String end, String explain,  String filePath) {
		super();
		this.info_classid_seq = info_classid_seq;
		this.category = category;
		this.intro = intro;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.addr3 = addr3;
		this.addr4 = addr4;
		this.maxperson = maxperson;
		this.price = price;
		this.title = title;
		this.start = start;
		this.end = end;
		this.explain = explain;
		this.filePath=filePath;
	}
	
	
	

	

}
