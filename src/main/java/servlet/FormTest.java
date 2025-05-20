package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

@WebServlet("/jsp/FormTest")
public class FormTest extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String company = request.getParameter("company");
        String mail = request.getParameter("e-mail");
        String msg = request.getParameter("msg");
        String[] melmagas = request.getParameterValues("melmaga");
        String requestInformation = request.getParameter("requestInformation");

        String message = null;

        if (name == null || name.isEmpty() || mail == null || mail.isEmpty() || msg == null || msg.isEmpty()) {
            message = "必須項目が未入力です。";
            out.println("<p style='color:red;'>" + message + "</p>");
        }

        if ("yes".equals(requestInformation)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/tyMsg.jsp");
            dispatcher.forward(request, response);
            return;
        }

       Page.header(out);
        out.println("<h2>入力情報を確認してください</h2>");
        out.println("お名前: " + name + "<br>");
        out.println("会社名: " + company + "<br>");
        out.println("メールアドレス: " + mail + "<br>");
        out.println("お問い合わせ内容: " + msg + "<br>");
        out.println("メルマガ種類: ");
        if (melmagas != null) {
            for (String melmaga : melmagas) {
                out.println(melmaga + " ");
            }
        }
        Page.footer(out);
    }
}
