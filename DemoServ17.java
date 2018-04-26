import java.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DemoServ17 extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        String html="<html>";
        html += "<head></head>";
        html += "<body>";
        html += "<h2>Calculator</h2>";
        html+="<hr/>";
        html += "<form method=post >";
        html += "<table >";
        html += "<tr>";
        html += "<td>Enter A</td>";
        html += "<td><input type=text name=n1  /></td>";
        html += "</tr>";
         html+="<br/>";
        html += "<tr>";
        html += "<td>Enter B</td>";
        html += "<td><input type=text name=n2  /></td>";
        html += "</tr>";
        html += "<tr>";
        html += "<td><input type=submit name=r1 value=ADD /></td>";
        html += "<td><input type=submit name=r1 value=SUB /></td>";
        html += "<td><input type=submit name=r1 value=MUL /></td>";
        html += "<td><input type=submit name=r1 value=DIV /></td>";
        html += "</tr>";          
        html += "<tr>";
        html += "<td>Results</td>";
        html += "<td><input type=text name=t3  /></td>";
        html += "<tr>";
        html += "</table>";
        html += "</form>";
        html += "<hr />";
        html += "</body>";
        html += "</html>";
        pw.println(html);
 }

 public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
          int a=Integer.parseInt(req.getParameter("n1"));
          int b=Integer.parseInt(req.getParameter("n2"));
         String operation=req.getParameter("r1");
             int c=0;
                switch(operation)
               {
                           
                  case "ADD":
                               c=a+b;
                                break;
                  case "SUB":
                               c=a-b;
                                break;
                  case "MUL":
                               c=a*b;
                                break;
                   case "DIV":
                               c=a/b;
                                break;
                       
                  }
    
         res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        String html="<html>";
        html += "<head></head>";
        html += "<body>";
        html += "<h2>Calculator</h2>";
        html+="<hr/>";
        html += "<form method=post >";
        html += "<table >";
        html += "<tr>";
        html += "<td>Enter A</td>";
        html += "<td><input type=text name=n1  value="+a+" /></td>";
        html += "</tr>";
         html+="<br/>";
        html += "<tr>";
        html += "<td>Enter B</td>";
        html += "<td><input type=text name=n2 value="+b+" /></td>";
        html += "</tr>";
        html += "<tr>";
        html += "<td><input type=submit name=r1 value=ADD /></td>";
        html += "<td><input type=submit name=r1 value=SUB /></td>";
        html += "<td><input type=submit name=r1 value=MUL /></td>";
        html += "<td><input type=submit name=r1 value=DIV /></td>";
        html += "</tr>";          
        html += "<tr>";
        html += "<td>Result</td>";

        html += "<td><input type=text name=n3  value="+c+" /></td>";
        html += "<tr>";
        html += "</table>";
        html += "</form>";
        html += "<hr />";
        html += "</body>";
        html += "</html>";
        pw.println(html);

         
                 
     

       }

    



   


     }




