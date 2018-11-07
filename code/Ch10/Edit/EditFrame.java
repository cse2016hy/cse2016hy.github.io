import java.awt.*;
import javax.swing.*;
/** EditFrame displays a text editor with two menus and a text area.  */
public class EditFrame extends JFrame
{ // the EditModel, a subclass of JTextArea, is the ``model'' for the frame:
  private EditModel buffer = new EditModel("", 15, 50);

  /** Constructor  EditFrame  builds the editor interface */
  public EditFrame()
  { // Create the ReplaceFrame, which appears when the user selects ``Replace'':
    ReplaceFrame second_frame = new ReplaceFrame(buffer);
    Container cp = getContentPane();
    cp.setLayout(new BorderLayout());
    JMenuBar mbar = new JMenuBar();
      JMenu file = new JMenu("File");     // defines the  "File"  menu
      file.add(new ClearMenuItem("New", buffer));
      file.add(new QuitMenuItem("Exit"));
    mbar.add(file);    // attach menu to menu bar
      JMenu edit = new JMenu("Edit");     // defines the  "Edit"  menu
      edit.add(new CutMenuItem("Cut", buffer));
      edit.add(new CopyMenuItem("Copy", buffer));
      edit.add(new PasteMenuItem("Paste", buffer));
      edit.addSeparator();
        JMenu search = new JMenu("Search");  // defines the "Search" submenu
        search.add(new FindMenuItem("Find", buffer));
        search.add(new ReplaceMenuItem("Replace", second_frame));
      edit.add(search);
    mbar.add(edit);
    setJMenuBar(mbar);  // attach menu bar to frame
    JScrollPane sp = new JScrollPane(buffer);  // embed into a scroll pane
    cp.add(sp, BorderLayout.CENTER);
    setTitle("EditFrame");
    pack();
    setVisible(true);
  }
}