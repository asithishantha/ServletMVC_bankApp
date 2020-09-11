import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WithdrawServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String amount = request.getParameter("amount");
        String withdrawed = request.getParameter("withdrawed");


        double intamount=Double.parseDouble(amount);
        double intwithdrawed=Double.parseDouble(withdrawed);


        PrintWriter out = response.getWriter();


        if(intamount<intwithdrawed){

            out.println("<html>");
            out.println("<head>");
            out.println(" <style>");

            out.println(".container {");
            out.println(" position: center;");

            out.println("  margin: 20px;");
            out.println("  max-width: 1400px;");
            out.println("   padding: 16px;");
            out.println("background-color: grey;");
            out.println("  }");

            out.println(" body {");
            out.println("    background-image: url('back.jpg');");
            out.println("   text-align: center;");
            out.println("  }");
            out.println("   </style>");


            out.println("</head>");


            out.println("<body>");
            out.println("<div class=\"container\">");
            out.println("<h1><b>your balance is insufficient for the transaction</b></h1>");

            out.println("<button onclick=\"myFunction5()\">More services</button>\n");

            out.println("<script>");
            out.println("function myFunction5() {");
            out.println(" location.replace(\"http://localhost:8080/bankapp/loginServlet\")");
            out.println("}");
            out.println("</script>");


            out.println("<button onclick=\"myFunction6()\">deposit again</button>\n");

            out.println("<script>");
            out.println("function myFunction6() {");
            out.println(" location.replace(\"http://localhost:8080/bankapp/loginServlet\")");
            out.println("}");
            out.println("</script>");

            out.println("</div>");
            out.println("</body>");



            out.println("</html>");
        }

        else
        {

            double balance= withdraw(intamount, intwithdrawed);
            out.println("<html>");
            out.println("<head>");
            out.println(" <style>");

            out.println(".container {");
            out.println(" position: center;");

            out.println("  margin: 20px;");
            out.println("  max-width: 1400px;");
            out.println("   padding: 16px;");
            out.println("background-color: grey;");
            out.println("  }");

            out.println(" body {");
            out.println("    background-image: url('back.jpg');");
            out.println("   text-align: center;");
            out.println("  }");
            out.println("   </style>");



            out.println("</head>");
            out.println("<body>>");
            out.println("<div class=\"container\">");


            out.println("<h1><b>successfully withdrawed!!!</b></h1>");

            out.println("<h1><b>your current balance is "+ balance+ "</b></h1>");
            out.println("<button onclick=\"myFunction7()\">withdraw again</button>\n");

            out.println("<script>");
            out.println("function myFunction7() {");
            out.println(" location.replace(\"http://localhost:8080/bankapp/withdraw.jsp\")");
            out.println("}");
            out.println("</script>");


            out.println("<button onclick=\"myFunction8()\">deposit again</button>\n");

            out.println("<script>");
            out.println("function myFunction8() {");
            out.println(" location.replace(\"http://localhost:8080/bankapp/depositamount.jsp\")");
            out.println("}");
            out.println("</script>");


            out.println("</div>");
            out.println("</body>");

            out.println("</html>");

        }

    }


    public double withdraw(double intamount, double intwithdrawed) {
        double balance= intamount - intwithdrawed;

        return balance;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
