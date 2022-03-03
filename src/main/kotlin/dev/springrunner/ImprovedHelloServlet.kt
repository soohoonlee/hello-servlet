package dev.springrunner

import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(urlPatterns = ["/improved-hello"])
class ImprovedHelloServlet : HttpServlet() {

    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        val requestName = request.getParameter("name")
        val servletName = servletConfig.servletName

        request.setAttribute("requestName", requestName)
        request.setAttribute("servletName", servletName)

        request.getRequestDispatcher("/improved-hello.jsp")
            .forward(request, response)
    }
}