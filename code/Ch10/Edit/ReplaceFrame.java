
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/** ReplaceFrame shows a frame that helps a user find and replace a string */
public class ReplaceFrame extends JFrame implements ActionListener
{ private EditModel model;
  private JButton replace = new JButton("Replace");
  private JButton clear = new JButton("Clear");
  private JButton close = new JButton("Close");
  private JTextField find_text = new JTextField("", 20);
  private JTextField replace_text = new JTextField("", 20);

  public ReplaceFrame(EditModel my_model)
  { model = my_model;
    Container cp = getContentPane();
    cp.setLayout(new BorderLayout());
    JPanel p1 = new JPanel(new GridLayout(2, 1));
      JPanel p11 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p11.add(new JLabel("From caret, replace "));
        p11.add(find_text);
      p1.add(p11);
      JPanel p12 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p12.add(new JLabel("by "));
        p12.add(replace_text);
      p1.add(p12);
    cp.add(p1, BorderLayout.CENTER);
    JPanel p2 = new JPanel(new FlowLayout());
      p2.add(replace);
      p2.add(clear);
      p2.add(close);
    cp.add(p2, BorderLayout.SOUTH);
    replace.addActionListener(this);
    clear.addActionListener(this);
    close.addActionListener(this);
    setTitle("ReplaceFrame"); 
    pack();
    setVisible(false);
  }

  /** actionPerformed handles all button pushes on this frame 
    * @param e - contains the identity of the button that is pushed */
  public void actionPerformed(ActionEvent e)
  { if ( e.getSource() == close )         // was it the Close button?
       { setVisible(false); }
    else if ( e.getSource() == clear )    // the Clear button?
       { find_text.setText("");
         replace_text.setText("");
       }
    else if ( e.getSource() == replace )  // the Replace button?
       { String find = find_text.getText();
         int location = model.findFromCaret(find); 
         if ( location == -1 )            // string not found?
              { JOptionPane.showMessageDialog(this,
                         "String " + find + " not found");
              }
         else { model.replaceRange(replace_text.getText(),
                                   location, location + find.length()); 
              }
       }
  }
}

