
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/** TextFrame0  creates a frame that displays a text area and a menu  */
public class TextFrame0 extends JFrame
{
  private JTextArea buffer = new JTextArea("", 5, 20);
    // the text area starts with an empty string and has 20 rows,
    //  each of which has 80 columns
  private JMenuItem open = new JMenuItem("Open");
  private JMenuItem save = new JMenuItem("Save");
  private JMenuItem quit = new JMenuItem("Quit");

  /** Constructor  TextFrame0  builds the editor interface */
  public TextFrame0()
  { buffer.setLineWrap(true);
    Container cp = getContentPane();
    cp.setLayout(new BorderLayout());
    JMenuBar mbar = new JMenuBar();   // a menu must be placed onto a menu bar
      JMenu file = new JMenu("File"); // defines the  "File"  menu
      file.add(open);   // add menuitems to menu
      file.add(save); 
      file.add(quit);
    mbar.add(file);     // attach menu to menu bar
    setJMenuBar(mbar);  // attach menu bar to frame

    buffer.setLineWrap(true);
    buffer.setFont(new Font("Courier", Font.PLAIN, 14));
    JScrollPane sp = new JScrollPane(buffer);
    cp.add(buffer, BorderLayout.CENTER);

    setTitle("TextFrame0"); 
    setSize(540, 400); 
    setVisible(true);
  }
}

