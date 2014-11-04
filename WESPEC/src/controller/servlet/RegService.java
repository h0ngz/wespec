package controller.servlet;

import java.io.IOException;
import java.net.URLEncoder;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.vo.Resume;
import model.dao.ResumeDao;

/**
 * ������/�̷� ��� ���� Ŭ����
 * @since 2014.11.02
 * @author wespec.co.kr
 **/

@WebServlet("/Register")
public class RegService extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	/** BOARD DAO */
	private ResumeDao resumeDao = null;
	
    public RegService() {
        super();
    }

	/**
	 * GET ���� �� (�� ��ȸ ���� ��)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
		/*
		// �Ķ����
		String num = request.getParameter("num");
		String pageNum = request.getParameter("pageNum");
		String searchType = request.getParameter("searchType");
		String searchText = request.getParameter("searchText");
		String searchTextUTF8 = new String(searchText.getBytes("ISO-8859-1"), "UTF-8");
		// ��
		BoardModel boardModel = new BoardModel();
		boardModel.setNum(Integer.parseInt(num));
		boardModel.setPageNum(pageNum);
		boardModel.setSearchType(searchType);
		boardModel.setSearchText(searchTextUTF8);
		// �Խù� �� ��ȸ
		this.boardDAO = new BoardDAO();
		boardModel = this.boardDAO.select(boardModel);
		// �Խù� ��ȸ�� ����
		this.boardDAO.updateHit(boardModel);
		// View ���� ��ü ����
		request.setAttribute("boardModel", boardModel);
		// View ������
		RequestDispatcher requestDispatcher =
			request.getRequestDispatcher("/WEB-INF/jsps/board/boardView.jsp");
		requestDispatcher.forward(request, response);
		*/
		
	
	}

}
