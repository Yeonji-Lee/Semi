package ncs.kh.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import ncs.kh.DTO.UfileDTO;

public class UfileDAO {
	private Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String pw = "kh";
		return DriverManager.getConnection(url,user,pw);
	}
	public int insert(UfileDTO dto) throws Exception {
		String sql = "insert into ufile values(ufile_seq.nextval,?,?,?,?)";
		try(
				Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);
				){
			pstat.setString(1,  dto.getServerFileName());
			pstat.setString(2, dto.getOriFileName());
			pstat.setString(3,  dto.getFilePath());
			pstat.setLong(4,  dto.getFileSize());
			int result = pstat.executeUpdate();
			if(result>0)	System.out.println("Ufile.DAO 완료");
			con.commit();
			return result;
		}
	}
	
	public List<UfileDTO> selectAll() throws Exception{
		String sql = "select * from ufile";
		List<UfileDTO> result = new ArrayList<>();
		try(
				Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);
				ResultSet rs = pstat.executeQuery();
				){
			while(rs.next()) {
				UfileDTO dto = new UfileDTO();
				dto.setSeq(rs.getInt("seq"));
				dto.setServerFileName(rs.getString("ServerfileName"));
				dto.setOriFileName(rs.getString("oriFileName"));
				dto.setFilePath(rs.getString("filepath"));
				dto.setFileSize(rs.getLong("filesize"));
				result.add(dto);
			}
			return result;
					
		}
	}

	
	public UfileDTO selectBySeq(int seq) throws Exception{
		String sql = "select * from ufile where seq=?";
		try(
				Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);
				){
			pstat.setInt(1, seq);
			try(ResultSet rs = pstat.executeQuery()){
				if(rs.next()) {
				UfileDTO dto = new UfileDTO();
				dto.setSeq(rs.getInt("seq"));
				dto.setServerFileName(rs.getString("ServerfileName"));
				dto.setOriFileName(rs.getString("oriFileName"));
				dto.setFilePath(rs.getString("filepath"));
				dto.setFileSize(rs.getLong("filesize"));
				return dto;
				}
				return null; //문제가 생겨서 리턴할게 없으면 null을 리턴함
			}
		}
	}
	

	
	
	
}
