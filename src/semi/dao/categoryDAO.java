package semi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import semi.dto.CategoryDTO;
import semi.dto.classInfoDTO;

public class categoryDAO {

	public Connection getConnection() throws Exception {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //맥북 : 49161
		String user = "semi";
		String password = "semi";
		return DriverManager.getConnection(url, user, password);
	}

	
	public List<CategoryDTO> getInfoBySelect(String select, int start, int end) throws Exception {
		String sql = "select row_number() over(order by "+select+") as rown, info_classid, info_title, info_addr, info_avgstar, info_price, info_img1, info_img2, info_img3 from (select row_number() over(order by info_avgstar desc) as rown, classinfo.* from classinfo) where rown between ? and ?";
		Connection con = this.getConnection();	
		PreparedStatement pstat = con.prepareStatement(sql);
		//pstat.setString(1, select);		
		pstat.setInt(1, start);
		pstat.setInt(2, end);
		ResultSet rs = pstat.executeQuery();
		List<CategoryDTO> list = new ArrayList<>();
		while(rs.next()) {
			CategoryDTO dto = new CategoryDTO();
			dto.setInfo_title(rs.getString("info_title"));
			dto.setInfo_addr(rs.getString("info_addr"));
			dto.setInfo_avgstar(rs.getString("info_avgstar"));
			dto.setInfo_price(rs.getInt("info_price"));
			dto.setInfo_img1(rs.getString("info_img1"));
			dto.setInfo_img2(rs.getString("info_img2"));
			dto.setInfo_img3(rs.getString("info_img3"));
			int classid = rs.getInt("info_classid");
			dto.setInfo_classid(classid);
			//�� �����ο� set
			int count = this.getTotalForCategory(classid);
			dto.setTotalCount(count);
			list.add(dto);
			//Ʃ������ set
			String[] tutor = this.getTutorInfoForCategory(classid);
			dto.setM_nickname(tutor[0]);
			dto.setM_photo(tutor[1]);
		}
		rs.close();
		con.close();
		return list;
	}
	
	public List<CategoryDTO> getInfoByCategory(String select, String category, int start, int end) throws Exception {
		String sql = "select row_number() over(order by "+ select +") as rown, info_classid, info_title, info_addr, info_avgstar, info_price, info_img1, info_img2, info_img3 from (select row_number() over(order by info_classid desc) as rown, classinfo.* "
				+ "from classinfo where info_category=?)  where rown between ? and ? ";
		Connection con = this.getConnection();	
		PreparedStatement pstat = con.prepareStatement(sql);
		pstat.setString(1, category);
		pstat.setInt(2, start);
		pstat.setInt(3, end);
		ResultSet rs = pstat.executeQuery();
		List<CategoryDTO> list = new ArrayList<>();
		while(rs.next()) {
			CategoryDTO dto = new CategoryDTO();
			dto.setInfo_title(rs.getString("info_title"));
			dto.setInfo_addr(rs.getString("info_addr"));
			dto.setInfo_avgstar(rs.getString("info_avgstar"));
			dto.setInfo_price(rs.getInt("info_price"));
			dto.setInfo_img1(rs.getString("info_img1"));
			dto.setInfo_img2(rs.getString("info_img2"));
			dto.setInfo_img3(rs.getString("info_img3"));
			
			int classid = rs.getInt("info_classid");
			//�� �����ο� set
			int count = this.getTotalForCategory(classid);
			dto.setTotalCount(count);
			list.add(dto);
			//Ʃ������ set
			String[] tutor = this.getTutorInfoForCategory(classid);
			dto.setM_nickname(tutor[0]);
			dto.setM_photo(tutor[1]);
		}
		con.close();
		return list;
	}
	
		
	public List<CategoryDTO> getInfoByLocation(String select, String addr, int start, int end) throws Exception {
		String sql = "select row_number() over(order by "+ select +") as rown, info_classid, info_title, info_addr, info_avgstar, info_price, info_img1, info_img2, info_img3 from (select row_number() over(order by info_classid desc) as rown, classinfo.* "
				+ "from classinfo where info_addr like ?)  where rown between ? and ?";
		Connection con = this.getConnection();	
		PreparedStatement pstat = con.prepareStatement(sql);
		pstat.setString(1, "%"+addr+"%");
		pstat.setInt(2, start);
		pstat.setInt(3, end);
		ResultSet rs = pstat.executeQuery();
		List<CategoryDTO> list = new ArrayList<>();
		while(rs.next()) {
			CategoryDTO dto = new CategoryDTO();
			dto.setInfo_title(rs.getString("info_title"));
			dto.setInfo_addr(rs.getString("info_addr"));
			dto.setInfo_avgstar(rs.getString("info_avgstar"));
			dto.setInfo_price(rs.getInt("info_price"));
			dto.setInfo_img1(rs.getString("info_img1"));
			dto.setInfo_img2(rs.getString("info_img2"));
			dto.setInfo_img3(rs.getString("info_img3"));
			
			int classid = rs.getInt("info_classid");
			//�� �����ο� set
			int count = this.getTotalForCategory(classid);
			dto.setTotalCount(count);
			list.add(dto);
			//Ʃ������ set
			String[] tutor = this.getTutorInfoForCategory(classid);
			dto.setM_nickname(tutor[0]);
			dto.setM_photo(tutor[1]);
		}
		con.close();
		return list;
	}

	public int getTotalForCategory(int classId) throws Exception {
		String sql = "select count(*) from ClassDoing where do_classId=?";
		Connection con = this.getConnection();
		PreparedStatement pstat = con.prepareStatement(sql);
		
		pstat.setInt(1, classId);
		ResultSet rs = pstat.executeQuery();
		int result = 0;
		if(rs.next()) {
			result = rs.getInt(1);
		}
		con.close();
		return result;
	}
	
	public String[] getTutorInfoForCategory(int classID) throws Exception {
		String sql = "select m_nickname, m_photo from ClassInfo, Member where info_tutorId = m_id and info_classid=?";
		Connection con = this.getConnection();
		PreparedStatement pstat = con.prepareStatement(sql);
		
		pstat.setInt(1, classID);
		ResultSet rs = pstat.executeQuery();
		String[] arr = new String[2];
		if(rs.next()) {
			arr[0] = rs.getString(1);
			arr[1] = rs.getString(2);
		}
		con.close();
		return arr;
	}
	
	public int recordTotalCount() throws Exception {
		String sql = "select count(*) from classinfo";
		Connection con = this.getConnection();
		PreparedStatement pstat = con.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery();
		int result = 0;
		if(rs.next()) {
			result = rs.getInt(1);
		}
		con.close();
		return result;
	}
	
	public int getTotalByMenu(String coloumn, String value) throws Exception {
		String sql = "select count(*) from classinfo where "+ coloumn +" = ?";
		Connection con = this.getConnection();	
		PreparedStatement pstat = con.prepareStatement(sql);
		pstat.setString(1, value);	
		ResultSet rs = pstat.executeQuery();
		int result = 0;
		while(rs.next()) {
			result = rs.getInt(1);
		}
		con.close();
		return result;
	}
	
	public static int recordCountPerPage = 6; 
	public static int pageTotalCount = 0;
	
	public List<String> getNavi(int currentPage, int recordTotalCount) throws Exception {
		System.out.println("��Ż���ڵ�:"+recordTotalCount);
		recordCountPerPage = 6;
		int naviCountPerPage = 3;	
		int pageTotalCount = 0; // ��������� ��
		if(recordTotalCount % recordCountPerPage == 0) {
			pageTotalCount = recordTotalCount / recordCountPerPage;
		}else{
			pageTotalCount = recordTotalCount / recordCountPerPage + 1 ;
		}
		
		// ���������� ���� ���� �� ���� (������ ���� ���� �ۼ��ϴ� ������ �����ڵ�) 
		if(currentPage < 1) {
			currentPage = 1;
		}else if(currentPage > pageTotalCount) {
			currentPage = pageTotalCount;
		}
		int startNavi;
		int endNavi;
		
		startNavi = (currentPage-1)/naviCountPerPage*naviCountPerPage+1; 
		endNavi = startNavi + (naviCountPerPage-1);

		if(endNavi>pageTotalCount) {
			endNavi = pageTotalCount;
		}
//		System.out.println("현재 페이지 : " + currentPage);
//		System.out.println("시작 : " + startNavi);
//		System.out.println("끝 : " + endNavi);

		boolean needPrev = true;
		boolean needNext = true;
		
		if(startNavi == 1) {
			needPrev = false;
		}
		
		if(endNavi == pageTotalCount) {
			needNext = false;
		}
		List<String> list = new ArrayList<String>();
		if(needPrev) {
			list.add("<이전 ");
		}
		for(int i = startNavi ; i <= endNavi ; i++) {
			list.add(i+" ");
		}
		if(needNext) {
			list.add("다음>");
		}
		return list;
	}	

	
}
