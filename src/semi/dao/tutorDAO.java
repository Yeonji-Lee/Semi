package semi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import semi.dto.UfileDTO;
import semi.dto.classInfoDTO;



public class tutorDAO {
   classInfoDTO dto = new classInfoDTO();
   UfileDAO udao = new UfileDAO();
   UfileDTO udto = new UfileDTO();
   private Connection getConnection() throws Exception {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "semi";
      String pw = "semi";
      return DriverManager.getConnection(url,user,pw);
   }
   
   
   public int test(classInfoDTO dto)    throws Exception{ 
      //                                                                                             
      String sql = "insert into classinfo values(info_classid_seq.nextval,default,?,?,?,?, ?, ?, ?, ? ,?,  ?, "
      
            + "default,default,default, ? , ? , default,default,default)";
      Connection con = this.getConnection();
      PreparedStatement pstat = con.prepareStatement(sql);
      
   
//      pstat.setString(1, dto.getInfo_tutorid());//1번 튜터아이디
      pstat.setString(1, dto.getInfo_category());//2번 카테고리
      pstat.setString(2, dto.getInfo_title());//3번 타이틀
      pstat.setString(3, dto.getInfo_explain());//4번 클래스설명
      pstat.setString(4, dto.getInfo_intro());//5번 튜터소개
      pstat.setInt(5, dto.getInfo_addr1()); //6번 우편번호
      pstat.setString(6, dto.getInfo_addr2());//7번 도로명
      pstat.setString(7, dto.getInfo_addr3());//8번 지번
      pstat.setString(8, dto.getInfo_addr4());//9번 상세주소
      pstat.setInt(9,  dto.getInfo_maxperson());//10번 희망인원
      pstat.setInt(10,  dto.getInfo_price());//11번 희망금액
//      pstat.setString(12, dto.getInfo_img1());//12번 이미지1
//      pstat.setString(13,  dto.getInfo_img2());//13번 이미지2
//      pstat.setString(14,  dto.getInfo_img3());//14번 이미지3
      pstat.setString(11, dto.getInfo_start());//15번 시작날짜
      pstat.setString(12, dto.getInfo_end());//16번 끝 날짜
//      pstat.setString(17, dto.getInfo_date());//17번 클래스 등록일
//      pstat.setString(18, dto.getInfo_avgstar());//18번 별점통계
//      pstat.setInt(19, dto.getInfo_click());//19번 조회수
      
      int result = pstat.executeUpdate();
      con.commit();
      con.close();
      return result;    
   }
}