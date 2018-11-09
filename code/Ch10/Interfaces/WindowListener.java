import java.awt.event.WindowEvent;

public interface WindowListener
{ public void windowActivated(WindowEvent e);
  public void windowClosed(WindowEvent e);
  public void windowClosing(WindowEvent e);
  public void windowDeactivated(WindowEvent e); 
  public void windowDeiconified(WindowEvent e);
  public void windowIconified(WindowEvent e);
  public void windowOpened(WindowEvent e);
}