package ncs.kh.tutor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ncs.kh.DAO.DAO;
import ncs.kh.DTO.DTO;
import ncs.kh.DTO.UfileDTO;


@WebServlet("*.con")
public class tutorCon extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		DAO dao = new DAO();
		DTO dto = new DTO();
		UfileDTO udto = new UfileDTO();
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
			
			dto.setIntro(intro);
			dto.setCategory(category);
			dto.setAddr1(addr1);
			dto.setAddr2(addr2);
			dto.setAddr3(addr3);
			dto.setAddr4(addr4);
			dto.setMaxperson(max);
			dto.setPrice(cash);
			dto.setStart(start);
			dto.setEnd(end);
			dto.setExplain(explain);			
			
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
