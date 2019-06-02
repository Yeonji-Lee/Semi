package FrontController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semi.dao.categoryDAO;
import semi.dto.CategoryDTO;



@WebServlet("*.category")
public class categoryController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String requestURI = request.getRequestURI();
		String ctxPath = request.getContextPath();
		String cmd = requestURI.substring(ctxPath.length());

		categoryDAO dao = new categoryDAO();
		if(cmd.contentEquals("/info.category")) {
			System.out.println("-----------------reset");
			try {
				//페이지네비
				String nowPage = request.getParameter("nowPage");
				System.out.println("nowPage : "+nowPage);
				int currentPage = 0;
				int recordTotalCount = 0;
				if(nowPage==null) {				
					currentPage = 1;
				}else {
					currentPage = Integer.parseInt(nowPage);
				}
				int end = currentPage * categoryDAO.recordCountPerPage;
				int start = (currentPage * categoryDAO.recordCountPerPage) - (categoryDAO.recordCountPerPage - 1);
				System.out.println(start + "start, " + end + "end");

				String select = request.getParameter("select");
				String category = request.getParameter("category");
				String ssCategory = (String) request.getSession().getAttribute("ssCategory");
				String addr = request.getParameter("addr");
				
				if(category == null) {
					category = ssCategory;
				}	
				
				System.out.println(category);
				
				
				List<CategoryDTO> list = null;
				
				System.out.println("select:"+select+" category:"+category+" addr:"+addr);
				
				if(select == null && category.contentEquals("main") || category ==null && addr == null) {
					System.out.println("여기");
					request.getSession().setAttribute("ssCategory", "main");
					list = dao.getInfoBySelect(select, start, end);
					
				}
				
				if (category.contentEquals("main") || category ==null && addr == null) {
					request.getSession().setAttribute("ssCategory", "main");
					list = dao.getInfoBySelect(select, start, end);	
					recordTotalCount = dao.recordTotalCount();
					System.out.println("recordTotalCount:"+recordTotalCount);

					//카테고리
				}else if(addr == null){
					System.out.println("카테고리:"+category);
					System.out.println("select:"+select);
					request.getSession().setAttribute("ssCategory", category);
					list = dao.getInfoByCategory(select, category, start, end);
					recordTotalCount = dao.getTotalByMenu("info_category", category);
					
				}else {	
					request.getSession().setAttribute("ssSelect", select);
					System.out.println("addr"+addr);
					if(addr.equals("se")) {
						addr = "서울";
					}else if(addr.equals("kk")) {
						addr = "경기";
					}else if(addr.equals("ch")) {
						addr = "충청";
					}else if(addr.equals("ks")) {
						addr = "경상";
					}else if(addr.equals("jl")) {
						addr = "전라";
					}else if(addr.equals("kwjj")) {
						addr = "강원제주";
					}
						
					list = dao.getInfoByLocation(select, addr, start, end);
					recordTotalCount = list.size();
				}
				request.setAttribute("list", list);
				System.out.println("리스트사이즈:"+list.size());	

				//네비
				List<String> navi = dao.getNavi(currentPage, recordTotalCount);
				int size = navi.size();
				request.setAttribute("navi", navi);
				request.setAttribute("size", size);

				request.getRequestDispatcher("category.jsp").forward(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
