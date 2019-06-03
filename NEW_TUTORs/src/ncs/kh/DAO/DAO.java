package ncs.kh.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import ncs.kh.DTO.DTO;
import ncs.kh.DTO.UfileDTO;

public class DAO {
	DTO dto = new DTO();
	UfileDAO udao = new UfileDAO();
	UfileDTO udto = new UfileDTO();
	private Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String pw = "kh";
		return DriverManager.getConnection(url,user,pw);
	}
	
	
	public int test(DTO dto) 	throws Exception{ 
		//                                                                                      1,2,3,4,5,6,7,8,9,10,11,12  
		String sql = "insert into classinfo values(info_classid_seq.nextval , ?,?,?,?,?,?, ?,?,? , ?,  ?, ?)";
		Connection con = this.getConnection();
		PreparedStatement pstat = con.prepareStatement(sql);
		
		pstat.setString(1,dto.getIntro());//튜터소개, 인자값
		pstat.setString(2,dto.getCategory());//카테고리
		pstat.setInt(3, dto.getAddr1());
		pstat.setString(4, dto.getAddr2());
		pstat.setString(5, dto.getAddr3());
		pstat.setString(6, dto.getAddr4());
		pstat.setInt(7, dto.getMaxperson());
		pstat.setInt(8, dto.getPrice());
		pstat.setString(9, dto.getStart());
		pstat.setString(10, dto.getEnd());
		pstat.setString(11, dto.getExplain());
		pstat.setString(12, dto.getFilePath());
		int result = pstat.executeUpdate();
		con.commit();
		con.close();
		return result;
		
	}
}
