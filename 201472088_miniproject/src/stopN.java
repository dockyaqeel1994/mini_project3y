

import java.awt.Color;
import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class stopN extends javax.swing.JFrame 
{
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    
    public static int no;
    public static Set<String> stopWords = new HashSet<String>();
    public static String str2,line,cont,fn;
 // End of variables declaration
    
    public stopN() 
    {
        initComponents();
         
    }

    private void initComponents()//display components 
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(680, 600));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(),
        		"Stopword Removal", javax.swing.border.TitledBorder.CENTER, 
        		javax.swing.border.TitledBorder.DEFAULT_POSITION,
        		new java.awt.Font("Times New Roman", 0, 24), 
        		Color.black));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Input file");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(64, 80, 80, 22);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jPanel1.add(jTextField1);
        jTextField1.setBounds(150, 80, 430, 28);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jButton1.setText("Removal Stopword");
        jButton1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 150, 190, 31);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jButton2.setText("Store Stopword");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(260, 150, 190, 31);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jButton3.setText("Process");
        jButton3.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(450, 150, 140, 31);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), 
        		"File content", javax.swing.border.TitledBorder.CENTER,
        		javax.swing.border.TitledBorder.DEFAULT_POSITION, 
        		new java.awt.Font("Times New Roman", 0, 18),
        		Color.black));
        jPanel2.setOpaque(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(60, 210, 580, 280);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 690, 500);

        //jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collweb.jpg"))); 
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 780, 540);

        pack();
    }//display components 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) //button 1 remove stopword
    {
         try 
         {
/**      String files1;
//           File folder1=new File(fn);
//           File[] list=folder1.listFiles();
//           no=list.length;
//           for(int lf1=0;lf1<list.length;lf1++){
//               if(list[lf1].isFile()){
//                   files1=list[lf1].getName();
*/
             for(int i=0;i<group.no;i++){
            stopWords.add("a");
            stopWords.add("as");
            stopWords.add("and");
            stopWords.add("is");
            stopWords.add("to");
            stopWords.add("all");
            stopWords.add("the");
            stopWords.add("his");
            stopWords.add("or");
            stopWords.add("of");
            stopWords.add("i'm");
            stopWords.add("who's");
            stopWords.add("after");
            stopWords.add("with");
            stopWords.add("what's");
            stopWords.add("there's");
            stopWords.add("you");
            stopWords.add("their");
            stopWords.add("when");
            stopWords.add("going");
            stopWords.add("an");
            stopWords.add("its");
            stopWords.add("are");
            stopWords.add("why");
            stopWords.add("go");
            stopWords.add("w");
            stopWords.add("e");
            stopWords.add("b");
            stopWords.add("these");
            stopWords.add("not");
            stopWords.add("now");
            stopWords.add("s");
            stopWords.add("t");
            stopWords.add("v");
            stopWords.add("at");
            stopWords.add("like");
            stopWords.add("been");
            stopWords.add("me");
            stopWords.add("se");
            stopWords.add("ve");
            stopWords.add("from");
            stopWords.add("so");
            stopWords.add("your");
            stopWords.add("ever");
            stopWords.add("was");
            stopWords.add("there");
            stopWords.add("their");
            stopWords.add("this");
            stopWords.add("them");
            stopWords.add("it's");
            stopWords.add("nt");
            stopWords.add("i");
            stopWords.add("th");
            stopWords.add("they");
            stopWords.add("in");
            stopWords.add("on");
            stopWords.add("it");
            stopWords.add("can");
            stopWords.add("be");
            stopWords.add("he");
            stopWords.add("she");
            stopWords.add("m");
            stopWords.add("wa");
            stopWords.add("ar");
            stopWords.add("however");
            stopWords.add("would");
            stopWords.add("put");
            stopWords.add("other");
            stopWords.add("help");
            stopWords.add("under");
            stopWords.add("while");
            stopWords.add("does");
            stopWords.add("must");
            stopWords.add("leave");
            stopWords.add("out");
            stopWords.add("ha");
            stopWords.add("but");
            stopWords.add("have");
            stopWords.add("has");
            stopWords.add("had");
            stopWords.add("could");
            stopWords.add("if");
            stopWords.add("are");
            stopWords.add("that");
            stopWords.add("by");
            stopWords.add("wasn't");
            stopWords.add("didn't");
            stopWords.add("which");
            stopWords.add("for");
            stopWords.add("what's");
            stopWords.add("which");
            stopWords.add("what");
            stopWords.add("that");
            stopWords.add("we");
            stopWords.add("how");
            stopWords.add("be");
               stopWords.add("");
                  stopWords.add("---");
            System.out.println("removing stop words");
            jTextArea1.append("*****************************************************************************" + "\n");
            jTextArea1.append("After Removing Stop Words" + "\n");
            jTextArea1.append("****************************************************************************" + "\n");
            
            BufferedReader br = new BufferedReader(new FileReader(".//Extract"+i+".txt"));
            File   f2 = new File("./Stopword"+i+".txt");
            String get=br.readLine();
            File n=new File(get);
            jTextField1.setText(n.getAbsolutePath());
            str2 = f2.getPath();
            FileWriter fw22 = new FileWriter(f2);
            BufferedWriter bw1 = new BufferedWriter(fw22);
            
            while ((line = br.readLine()) != null)
            {
                StringTokenizer tokens = new StringTokenizer(line, " </>_.:,'[]^\"0123456789()|%;+-$&#@{}!*?");
                while (tokens.hasMoreTokens()) 
                {
                    cont = tokens.nextToken();
                    if (!stopWords.contains(cont.toLowerCase()))
                    {
                        jTextArea1.append(cont + "\n");
                        bw1.write(cont);
                        bw1.newLine();
                    }
                }
            }
            br.close();
            bw1.flush();
             }
        } catch (Exception e)
         {
            System.out.println(e.getMessage());
        }
    }//button 1 remove stopword

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) // button 2 store stopword  
    {
         try
       {
           for(int i=0;i<group.no;i++)
           {
           String s,s1;    
           int  cnt = 1;
           BufferedReader br = new BufferedReader(new FileReader(".//Stopword"+i+".txt"));
           
            while ((s = br.readLine()) != null) 
            {
        
                StringTokenizer stt = new StringTokenizer(s, ",");
                while (stt.hasMoreTokens()) {
                    s1 = (stt.nextToken());
                  
                   
                   // st.executeUpdate("INSERT INTO `stopwords"+i+"` VALUES (" + cnt + ",'" + s1 + "')");
                    cnt++;
                }
            }
           }
        
            JOptionPane.showMessageDialog(this, "Data is successfully inserted into the database.");
       
       }
       catch (Exception e) 
         {
            System.out.println(e.getMessage());
        }
    }// button 2 store stopword  

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) // button 3 call cluster class 
    {
        clust c=new clust();
        c.setVisible(true);
    }// button 3 call cluster class 

}
