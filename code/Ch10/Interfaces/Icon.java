import java.awt.*;

public interface Icon
{ public int getIconHeight();
  public int getIconWidth();
  public void paintIcon(Component c, Graphics g, int x, int y);
}
