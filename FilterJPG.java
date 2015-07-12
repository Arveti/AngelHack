
import java.io.File;
   import javax.swing.filechooser.FileFilter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wonder
 */
public class FilterJPG extends FileFilter implements java.io.FileFilter {
    public boolean accept(File f)
       {
       if (f.getName().toLowerCase().endsWith(".jpeg")) return true;
       if (f.getName().toLowerCase().endsWith(".jpg")) return true;
       return false;
       }
     public String getDescription()
       {
       return "JPEG files";
       }
}
