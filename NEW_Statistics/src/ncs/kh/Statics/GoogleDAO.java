package ncs.kh.Statics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GoogleDAO {

	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "kh";
		String pw = "kh";
		return DriverManager.getConnection(url,id,pw);
	}
	
	public int insert(String age, int visit) throws Exception{
		String sql = "insert into Chart values(?,?)";
		try(
				Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);
				){
			pstat.setString(1, age);
			pstat.setInt(2, visit);
			int result =pstat.executeUpdate();
			return result;
		}
	}
	
	private PreparedStatement monthGender(Connection con)throws Exception{
		//이 메서드에서 준비를 다 하고 pstat에 넣는거임
		String sql ="select * from MonthGender";
		PreparedStatement pstat = con.prepareStatement(sql);
		return pstat;		
	}
	public List<GoogleDTO> selectMonthGender() throws Exception{
		
		try(
				Connection con = this.getConnection();
				PreparedStatement pstat = this.monthGender(con);
				){
			ResultSet rs = pstat.executeQuery();
			List<GoogleDTO> googledto = new ArrayList<>();
			while(rs.next()) {
				int male = rs.getInt("male");
				int female = rs.getInt("female");
				GoogleDTO dto = new GoogleDTO(male, female);
				googledto.add(dto);
			}
			return googledto;
			
		}
	}
	private PreparedStatement pstatForselect(Connection con)throws Exception{//마이페이지
		//이 메서드에서 준비를 다 하고 pstat에 넣는거임
		String sql ="select * from MonthChart";
		PreparedStatement pstat = con.prepareStatement(sql);
		return pstat;		
	}
	public List<GoogleDTO> selectMonth() throws Exception{
		
		try(
				Connection con = this.getConnection();
				PreparedStatement pstat = this.pstatForselect(con);
				){
			ResultSet rs = pstat.executeQuery();
			List<GoogleDTO> googledto = new ArrayList<>();
			while(rs.next()) {
				String age = rs.getString("age");
				int visit = rs.getInt("visit");
				GoogleDTO dto = new GoogleDTO(age, visit);
				googledto.add(dto);
			}
			return googledto;
			
		}
	}
	
	
	
	
	private PreparedStatement pstatDay(Connection con)throws Exception{
		String sql = "select * from DayChart";
		PreparedStatement pstat = con.prepareStatement(sql);
		return pstat;
	}
	public List<GoogleDTO> selectDay() throws Exception{
		try(
				Connection con = this.getConnection();
				PreparedStatement pstat = this.pstatDay(con);
				){
			ResultSet rs = pstat.executeQuery();
			List<GoogleDTO> googledto = new ArrayList<>();
			while(rs.next()) {
				String time = rs.getString("time");
				int visit = rs.getInt("visit");
				GoogleDTO dto = new GoogleDTO(visit, time);
				googledto.add(dto);
			}return googledto;
		}
	}
	
	
	private PreparedStatement pstatWeek(Connection con)throws Exception{
		String sql = "select * from WeekChart";
		PreparedStatement pstat = con.prepareStatement(sql);
		return pstat;
	}
	public List<GoogleDTO2> selectWeek() throws Exception{
		try(
				Connection con = this.getConnection();
				PreparedStatement pstat = this.pstatWeek(con);
				){
			ResultSet rs = pstat.executeQuery();
			List<GoogleDTO2> googledto = new ArrayList<>();
			while(rs.next()) {
				String week = rs.getString("week");
				int visit2 = rs.getInt("visit2");
				GoogleDTO2 dto = new GoogleDTO2(week, visit2);
				googledto.add(dto);
			}return googledto;
		}
	}
	
	private PreparedStatement pstatWeek2(Connection con)throws Exception{
		String sql = "select * from WeekChart2";
		PreparedStatement pstat = con.prepareStatement(sql);
		return pstat;
	}
	public List<GoogleDTO> selectWeek2() throws Exception{
		try(
				Connection con = this.getConnection();
				PreparedStatement pstat = this.pstatWeek2(con);
				){
			ResultSet rs = pstat.executeQuery();
			List<GoogleDTO> googledto = new ArrayList<>();
			while(rs.next()) {
				String day = rs.getString("day");
				int male = rs.getInt("male");
				int female = rs.getInt("female");
				int age20 = rs.getInt("age20");
				int age30 = rs.getInt("age30");
				int age40 = rs.getInt("age40");
				GoogleDTO dto = new GoogleDTO(day, male, female, age20, age30, age40);
				googledto.add(dto);
			}return googledto;
		}
	}
	
	
}
