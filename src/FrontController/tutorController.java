package FrontController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semi.dao.tutorDAO;
import semi.dto.classInfoDTO;




@WebServlet("*.con")
public class tutorController extends HttpServlet {
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String requestURI = request.getRequestURI();
      String contextPath = request.getContextPath();
      String command = requestURI.substring(contextPath.length());
      tutorDAO dao = new tutorDAO();
      classInfoDTO dto = new classInfoDTO();
      request.setCharacterEncoding("UTF-8");
      
      if(command.equals("/tutor.con")) {
         String intro = request.getParameter("intro");
         String category = request.getParameter("down");
         String zipcode = request.getParameter("zipcode");
         int addr1=Integer.parseInt(zipcode);
         String addr2 = request.getParameter("add1");
         String addr3 = request.getParameter("add2");
         String addr4 = request.getParameter("add3");
         String person = request.getParameter("max");
         int max = Integer.parseInt(person);
         String money = request.getParameter("cash");
         int cash = Integer.parseInt(money);
         String start = request.getParameter("startdate");
         String end = request.getParameter("enddate");
         String explain = request.getParameter("explain");
         String title = request.getParameter("inputtitle");
         
         dto.setInfo_category(category);
         dto.setInfo_title(title);
         dto.setInfo_explain(explain);         
         dto.setInfo_intro(intro);
         dto.setInfo_addr1(addr1);
         dto.setInfo_addr2(addr2);
         dto.setInfo_addr3(addr3);
         dto.setInfo_addr4(addr4);
         dto.setInfo_maxperson(max);
         dto.setInfo_price(cash);
         //이미지 1 2 3
//         dto.setString(img1);
//         dto.setString(img2);
         dto.setInfo_start(start);
         dto.setInfo_end(end);
//         등록일
//         별점통계
//         조회수
         
         try {
            int result = dao.test(dto);
            System.out.println("DB등록 됨");
         } catch (Exception e) {
            e.printStackTrace();
         }
         
      }
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
      doGet(request, response);
   }

}