
import java.awt.Color;



@SuppressWarnings("serial")
public class Home extends javax.swing.JFrame 
{
	// Variables declaration 
	  	private javax.swing.JButton jButton1;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	   	    
    public Home() //constructor
    {
        initComponents();
    }


    private void initComponents() //display components
    {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton1.setText("Next");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(440, 270, 100, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(Color.BLACK);
        jLabel1.setText("FILE CONVERSION AND PREPROCESSING");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 70, 490, 33);

       //jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collweb.jpg"))); 
        jLabel2.setIcon(new javax.swing.ImageIcon("/img/collweb.jpg") );
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 590, 360);

        pack();
    }// display components

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) //button 1 loads fileconversion form
    {
       fileconversion f=new fileconversion();
       f.setVisible(true);
       
    }

 
}//end of class 
