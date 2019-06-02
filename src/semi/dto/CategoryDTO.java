package semi.dto;

public class CategoryDTO {
	private int info_classid;
	private String info_title;
	private String info_addr;
	private String info_avgstar;
	private int info_price;
	private String info_img1;
	private String info_img2;
	private String info_img3;
	private int totalcount;
	private String m_nickname;
	private String m_photo;
	public CategoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryDTO(int info_classid, String info_title, String info_addr, String info_avgstar, int info_price,
			String info_img1, String info_img2, String info_img3, int totalcount, String m_nickname, String m_photo) {
		super();
		this.info_classid = info_classid;
		this.info_title = info_title;
		this.info_addr = info_addr;
		this.info_avgstar = info_avgstar;
		this.info_price = info_price;
		this.info_img1 = info_img1;
		this.info_img2 = info_img2;
		this.info_img3 = info_img3;
		this.totalcount = totalcount;
		this.m_nickname = m_nickname;
		this.m_photo = m_photo;
	}
	public int getInfo_classid() {
		return info_classid;
	}
	public void setInfo_classid(int info_classid) {
		this.info_classid = info_classid;
	}
	public String getInfo_title() {
		return info_title;
	}
	public void setInfo_title(String info_title) {
		this.info_title = info_title;
	}
	public String getInfo_addr() {
		return info_addr;
	}
	public void setInfo_addr(String info_addr) {
		this.info_addr = info_addr;
	}
	public String getInfo_avgstar() {
		return info_avgstar;
	}
	public void setInfo_avgstar(String info_avgstar) {
		this.info_avgstar = info_avgstar;
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
	public int getTotalcount() {
		return totalcount;
	}
	public void setTotalcount(int totalCount) {
		this.totalcount = totalCount;
	}
	public String getM_nickname() {
		return m_nickname;
	}
	public void setM_nickname(String m_nickname) {
		this.m_nickname = m_nickname;
	}
	public String getM_photo() {
		return m_photo;
	}
	public void setM_photo(String m_photo) {
		this.m_photo = m_photo;
	}

}