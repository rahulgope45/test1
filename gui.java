import javax.swing.JOptionPane;

public class gui{
    public static void main(String[]args){


        //basic gui program where we are going to make a box

       String name = JOptionPane.showInputDialog("whats your name");
       JOptionPane.showMessageDialog(null, "Hello "+name);

       int age = Integer.parseInt( JOptionPane.showInputDialog("whats your age"));
       JOptionPane.showMessageDialog(null, "You are "+age+" old");


       double height = Double.parseDouble(JOptionPane.showInputDialog("whats your height"));
       JOptionPane.showMessageDialog(null, "You are "+height+" tall");
    }
}