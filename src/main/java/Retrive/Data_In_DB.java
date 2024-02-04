package Retrive;
import java.io.*;
import java.sql.*;
import java.util.LinkedHashSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.google.gson.Gson;
@WebServlet("/retrive")
public class Data_In_DB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	LinkedHashSet<PojoClass> objecs = new LinkedHashSet<PojoClass>();
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        @SuppressWarnings("unused")
			String nodata="DATA IS NOT THERE IN DATABASE";
	        String equip_id=request.getParameter("equip_id");
	        Connection con;
		con=HelperClass.putConnection();
	try {
		PreparedStatement	pstmt = con.prepareStatement("select * from playground where equip_id="+equip_id+";");
           ResultSet rs = pstmt.executeQuery(); 
	while(rs.next()){    
		PojoClass obj= new PojoClass();
	      obj.setEquip_id(rs.getInt(1));
	      obj.setType(rs.getString(2));
	      obj.setColor(rs.getString(3));
	      obj.setLocation(rs.getString(4));
	      obj.setInstall_date(rs.getDate(5));
	          objecs.add(obj);
	          }}	
catch (SQLException e) {
		e.printStackTrace();
		}String json = new Gson().toJson(objecs);   
  	   	out.print(json);}} 