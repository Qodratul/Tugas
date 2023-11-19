import javax.swing.JOptionPane;
public class login2 {
		public static void main(String args[]) {
			String username = JOptionPane.showInputDialog("Username:");
			String password = JOptionPane.showInputDialog("Password:");
			if(username != null && password != null
			&& (
				(username.equals("qodri") && password.equals("qodri123")) ||
				(username.equals("qudus") && password.equals("qudus123"))
			)
			)
			{
				JOptionPane.showMessageDialog(null, "You're in");
			} else {
				JOptionPane.showMessageDialog(null, "You're Sus");
			}
		}
}