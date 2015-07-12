
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class UploadImg
 */
@WebServlet("/UploadImg")
public class UploadImg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int filename = 300;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UploadImg() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload sfu = new ServletFileUpload(factory);

			if (!ServletFileUpload.isMultipartContent(request)) {
				System.out.println("sorry. No image uploaded");
				return;
			}
			// parse request
			List items = sfu.parseRequest(request);

			// get uploaded file
			FileItem img = (FileItem) items.get(0);

			// String path = request.getServletContext().getRealPath("");
			InputStream is = img.getInputStream();

			BufferedImage image = ImageIO.read(is);

			File outputimg = new File(
					"C:\\Users\\Wonder\\Desktop\\"
							+ filename + ".png");
			filename++;
			ImageIO.write(image, "png", outputimg);
			response.sendRedirect("Success.jsp");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
