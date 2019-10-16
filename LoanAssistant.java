import javax.swing.*;
import java.awt.Insets;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.text.*;



public class LoanAssistant extends JFrame
{
JLabel lab1 = new JLabel("Loan Balance");
JTextField balancetextf = new JTextField();
JLabel lab2 = new JLabel("Interest Rate");
JTextField interesttextf = new JTextField();
JLabel lab3 = new JLabel("Number of Payments");
JTextField monthstextf = new JTextField();
JLabel analysisLabel = new JLabel();
JTextArea analysisTextArea = new JTextArea();
JButton exitButton = new JButton();
JLabel lab4 = new JLabel("Monthly Payment");
JTextField paymenttextf = new JTextField();
Font myFont = new Font("Arial", Font.PLAIN, 16);
JButton computeButton = new JButton("Compute Monthly Payments");
JButton newLoanButton = new JButton("New Loan Analysis");
JButton monthsButton = new JButton("X");
JButton paymentButton = new JButton("X");
JButton exiButton = new JButton("Exit");
Color lightYellow = new Color(255, 255, 128);
boolean computePayment;
// panel.add(lab1);
// panel.add(lab2);
// panel.add(lab3);
// panel.add(lab4);
public static void main(String args[])
{
// create frame
new LoanAssistant().setVisible(true);
}
public LoanAssistant()
{
// frame constructor
setTitle("Loan Assistant");
setResizable(false);


addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent evt)
{
    exitForm(evt);
}
});
getContentPane().setLayout(new GridBagLayout());
GridBagConstraints c = new GridBagConstraints();

lab1.setFont(myFont);
c.gridx = 0;
c.gridy = 0;
c.anchor = GridBagConstraints.WEST;
c.insets = new Insets(10,10,0,0);
getContentPane().add(lab1,c);

lab2.setFont(myFont);
c.anchor = GridBagConstraints.WEST;
c.gridx = 0;
c.gridy = 1;
c.insets = new Insets(10,10,0,0);
getContentPane().add(lab2,c);

lab3.setFont(myFont);
c.anchor = GridBagConstraints.WEST;
c.gridx = 0;
c.gridy = 2;
c.insets = new Insets(10,10,0,0);
getContentPane().add(lab3,c);

lab4.setFont(myFont);
c.anchor = GridBagConstraints.WEST;
c.gridx = 0;
c.gridy = 3;
c.insets = new Insets(10,10,0,0);
getContentPane().add(lab4,c);

balancetextf.setPreferredSize(new Dimension(100,25));
balancetextf.setHorizontalAlignment(SwingConstants.RIGHT);
c.gridx = 1;
c.gridy =0;
c.insets = new Insets(10, 10, 0, 10);
getContentPane().add(balancetextf,c);

interesttextf.setPreferredSize(new Dimension(100,25));
interesttextf.setHorizontalAlignment(SwingConstants.RIGHT);
c.gridx = 1;
c.gridy =1;
c.insets = new Insets(10, 10, 0, 10);
getContentPane().add(interesttextf,c);

monthstextf.setPreferredSize(new Dimension(100,25));
monthstextf.setHorizontalAlignment(SwingConstants.RIGHT);
c.gridx = 1;
c.gridy =2;
c.insets = new Insets(10, 10, 0, 10);
getContentPane().add(monthstextf,c);
paymenttextf.setPreferredSize(new Dimension(100,25));
paymenttextf.setHorizontalAlignment(SwingConstants.RIGHT);
c.gridx = 1;
c.gridy =3;
c.insets = new Insets(10, 10, 0, 10);
getContentPane().add(paymenttextf,c);

c.gridx = 0;
c.gridy = 4;
c.gridwidth = 2;
c.anchor=GridBagConstraints.CENTER;
c.insets = new Insets(10, 0, 0, 0);
getContentPane().add(computeButton,c);
computeButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
        computeButtonActionPerformed(e);
    }
});
newLoanButton.setEnabled(false);
c.gridx = 0;
c.gridy = 5;
c.gridwidth = 2;
c.insets = new Insets(10, 0, 10 ,0);
getContentPane().add(newLoanButton,c);
// newLoanButton.addActionListener(new ActionListener(){
//     public void ActionPerformed(ActionEvent e) {
//         newLoanButtonActionEventPerformed(e);
//     }
// });

c.gridx = 2;
c.gridy = 2;
c.gridwidth = 1;
monthsButton.setFocusable(false);
c.insets = new Insets(10, 0, 0, 0);
getContentPane().add(monthsButton,c);
monthsButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
        monthsButtonActionPerformed(e);
    }
});

c.gridx = 2;
c.gridy = 3;
c.gridwidth = 1;
c.insets = new Insets(10, 0, 10, 0);
getContentPane().add(paymentButton,c);
paymentButton.setFocusable(false);
paymentButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
        paymentButtonActionPerformed(e);
    }
});

analysisLabel.setFont(myFont);
c.gridx = 3;
c.gridy = 0;
c.anchor = GridBagConstraints.WEST;
c.insets = new Insets(0, 10, 0, 0);
getContentPane().add(analysisLabel,c);

analysisLabel.setText("Loan Analysis");
analysisTextArea.setFocusable(false);
analysisTextArea.setPreferredSize(new Dimension(250,150));
analysisTextArea.setFont(new Font("Courier New", Font.PLAIN, 14));
analysisTextArea.setEditable(false);
analysisTextArea.setBackground(Color.WHITE);
analysisTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
c.gridx = 3;
c.gridy = 1;
c.gridheight = 4;
c.insets = new Insets(0, 10, 0, 10);
getContentPane().add(analysisTextArea,c);
exitButton.setFocusable(false);
exitButton.setText("Exit");
c.gridx = 3;
c.gridy = 5;
c.anchor=GridBagConstraints.CENTER;
getContentPane().add(exitButton,c); 
exitButton.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
exitButtonActionPerformed(e);
}
});

pack();
Dimension screenSize =
Toolkit.getDefaultToolkit().getScreenSize();
setBounds((int) (0.5 * (screenSize.width - getWidth())), (int) (0.5 * (screenSize.height
- getHeight())), getWidth(), getHeight());
paymentButton.doClick();
//myControl.setFocusable(false);
}
private void exitForm(WindowEvent evt)
{
System.exit(0);
}
private void computeButtonActionPerformed(ActionEvent e)
{
    double balance, interest, payment;
    double loanBalance, finalPayment;
    int months;
    double monthlyInterest, multiplier;
    balance =
    Double.valueOf(balancetextf.getText()).doubleValue();
    interest =
    Double.valueOf(interesttextf.getText()).doubleValue();
    monthlyInterest = interest / 1200;
    // Compute loan payment
    if(computePayment){
    months =
    Integer.valueOf(monthstextf.getText()).intValue();
    multiplier = Math.pow(1 + monthlyInterest, months);
    payment = balance * monthlyInterest * multiplier / (multiplier - 1);
    paymenttextf.setText(new DecimalFormat("0.00").format(payment));
    }
    else{
        payment =
Double.valueOf(paymenttextf.getText()).doubleValue();
months = (int)((Math.log(payment) - Math.log(payment - balance * monthlyInterest))
/ Math.log(1 + monthlyInterest));
monthstextf.setText(String.valueOf(months));
    }
// reset payment prior to analysis to fix at two decimals
payment =
Double.valueOf(paymenttextf.getText()).doubleValue();
// show analysis
analysisTextArea.setText("Loan Balance: $" + new
DecimalFormat("0.00").format(balance));
analysisTextArea.append("\n" + "Interest Rate: " + new
DecimalFormat("0.00").format(interest) + "%");
// process all but last payment
loanBalance = balance;
for (int paymentNumber = 1; paymentNumber <= months - 1; paymentNumber++)
{
loanBalance += loanBalance * monthlyInterest - payment;
}
// find final payment
finalPayment = loanBalance;
if (finalPayment > payment)
{
// apply one more payment
loanBalance += loanBalance * monthlyInterest - payment;
finalPayment = loanBalance;
months++;
monthstextf.setText(String.valueOf(months));
}
analysisTextArea.append("\n\n" + String.valueOf(months - 1) + " Payments of $" + new
DecimalFormat("0.00").format(payment));
analysisTextArea.append("\n" + "Final Payment of: $" + new
DecimalFormat("0.00").format(finalPayment));
analysisTextArea.append("\n" + "Total Payments: $" + new
DecimalFormat("0.00").format((months - 1) * payment + finalPayment));
analysisTextArea.append("\n" + "Interest Paid $" + new
DecimalFormat("0.00").format((months - 1) * payment + finalPayment - balance));
computeButton.setEnabled(false);
newLoanButton.setEnabled(true);
newLoanButton.requestFocus();

}
private void newLoanButtonActionPerformed(ActionEvent e)
{

}
private void monthsButtonActionPerformed(ActionEvent e)
{
    computePayment=false;
    paymentButton.setVisible(true);
    monthsButton.setVisible(false);
    monthstextf.setText("");
    paymenttextf.setBackground(Color.WHITE);
    paymenttextf.setEditable(true);
  paymenttextf.setBackground(lightYellow);
  monthstextf.setEditable(false);
  paymenttextf.setFocusable(true);
  balancetextf.requestFocus();
  computeButton.setText("Compute no of Payments");
}
private void paymentButtonActionPerformed(ActionEvent e)
{
  computePayment=true;
  paymentButton.setVisible(false);
  monthsButton.setVisible(true);
  monthstextf.setEditable(true);
  monthstextf.setFocusable(true);
  paymenttextf.setFocusable(false);
  monthstextf.setBackground(Color.WHITE);
  paymenttextf.setText("");
  paymenttextf.setEditable(false);
  balancetextf.requestFocus();
paymenttextf.setBackground(lightYellow);
computeButton.setText("Compute Monthly Payment");

}
private void exitButtonActionPerformed(ActionEvent e)
{
System.exit(0);
}
}   