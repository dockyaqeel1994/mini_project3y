

import java.awt.Color;
import java.util.*;


public class clust extends javax.swing.JFrame 
{
    // Variables declaration 
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
 
   // Statement st;
   // ResultSet rs,rs2;
    public static ArrayList ar=new ArrayList();
    public static ArrayList ar2=new ArrayList();
    public static int no;
    // End of variables declaration

    public clust() //constructor 
    {
        initComponents();
    }

    private void initComponents() //display components 
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), 
        		"Clustering", javax.swing.border.TitledBorder.CENTER,
        		javax.swing.border.TitledBorder.DEFAULT_POSITION,
        		new java.awt.Font("Times New Roman", 0, 24), 
        		Color.BLACK));
        jPanel1.setForeground(Color.BLACK);
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jLabel1.setForeground(Color.BLACK);
        jLabel1.setText("Original Document ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 50, 170, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jLabel2.setForeground(Color.BLACK);
        jLabel2.setText("Comparitive Document");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 50, 180, 22);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jButton1.setText("Cluster");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(530, 190, 140, 31);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(60, 100, 166, 370);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(310, 100, 166, 370);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Reduce");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(530, 250, 140, 31);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 750, 500);

       // jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collweb.jpg")));
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 780, 520);

        pack();
    }//display components 
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) //button 1 cluster 
    {
/**
    	try
    	{
    		int i=0,j=0;
    		rs=st.executeQuery("select words from stopwords");
    		while(rs.next()){
    			jTextArea1.append(rs.getString(1)+"\n");
    			ar.add(rs.getString(1));
    			i++;
    		}
    		for(int z=0;z<group.no;z++)
    		{
    			rs2=st.executeQuery("select words from stopwords"+z);
    			while(rs2.next())
    			{
    				//System.out.print(rs2.getString(1));
    				jTextArea2.append(rs2.getString(1)+"\n");
    				ar2.add(rs2.getString(1));
    				j++;
    			}

    		}

    	}
    	catch(Exception e)
    	{
    		System.out.println("Excep2 "+e);
    	}
    	*/
    } //button 1 cluster 

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) //button 2 calls reduce class
    {
     
       // reduce r=new reduce();
        //r.setVisible(true);
    }//button 2 calls reduce 

  

}
