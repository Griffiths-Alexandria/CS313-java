/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloWorld;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import helloWorld.model.FilePostHandler;
import helloWorld.model.Posts;

@WebServlet("/CreatePost")
public class CreatePost extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreatePost() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     *
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     *
     */

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("txtTitle");
        String post = request.getParameter("txtPost");
        String date = request.getParameter("txtDate");
        String username = request.getParameter("txtUsername");
        Posts newPost = new Posts(title, post, date, username);
        
        FilePostHandler handler = new FilePostHandler("list.txt");
        handler.addPost(newPost);
        
        response.sendRedirect("ShowList");
    }

   
}
