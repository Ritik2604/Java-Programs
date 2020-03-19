import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class webd extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res){try{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
pw.println("<html>");
pw.println("<body>");
pw.println("<h2> I am sending response of get </h2>");
pw.println("</body>");
pw.println("</html>");
pw.close();}
catch(Exception e){System.out.println(e);}
}
public void doPost(HttpServletRequest req,HttpServletResponse res){try{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
pw.println("<html>");
pw.println("<body>");
pw.println("<h2> i am sending response of post</h2>");
pw.println("</body>");
pw.println("</html>");
pw.close();
}
catch(Exception e){System.out.println(e);}
} 




}