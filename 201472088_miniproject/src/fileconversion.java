

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.rtf.RTFEditorKit;

//import org.apache.pdfbox.cos.COSDocument;


import org.apache.poi.hdf.extractor.WordDocument;

import org.pdfbox.cos.COSDocument;
import org.pdfbox.pdfparser.PDFParser;
import org.pdfbox.pdmodel.PDDocument;
import org.pdfbox.util.PDFTextStripper;



@SuppressWarnings("serial")
public class fileconversion extends javax.swing.JFrame 
{

    // Variables declaration 
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    
    
    StringBuffer sb = new StringBuffer(8192);
    public static String[] ar;
    public static ArrayList<String> cn = new ArrayList();
    public static int fsize;

    public static String fnam;
    // End of variables declaration//

    public fileconversion() //constructor
    {
        initComponents();

    }

    private void initComponents() //	//displayComponents
    {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
      
      
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        addWindowListener(new java.awt.event.WindowAdapter() 
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        
        getContentPane().setLayout(null);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "File Conversion", 
        		javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
        		javax.swing.border.TitledBorder.DEFAULT_POSITION,
        		new java.awt.Font("Times New Roman", 0, 14), Color.BLACK));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton1.setText("Select File");
        jButton1.setOpaque(false);
        
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton1ActionPerformed(evt);
            }
        });
        
        jPanel2.add(jButton1);
        jButton1.setBounds(140, 190, 130, 30);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jPanel2.add(jTextField1);
        jTextField1.setBounds(40, 250, 370, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton2.setText("Extract");
        jButton2.setOpaque(false);
        
        jButton2.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton2ActionPerformed(evt);
            }
        });
        
        jPanel2.add(jButton2);
        jButton2.setBounds(40, 330, 140, 40);

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jList1.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(60, 50, 300, 110);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jLabel1.setForeground(Color.BLACK);
        jLabel1.setText("Choose File Type");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(140, 30, 150, 20);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton3.setText("Process");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(220, 330, 140, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 10, 420, 440);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder
        		(null, "text file content", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
        				javax.swing.border.TitledBorder.DEFAULT_POSITION,
        				new java.awt.Font("Times New Roman", 0, 14),Color.BLACK)); 
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(14, 17, 310, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(440, 20, 330, 430);

        

        pack();
    }	//displayComponents 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) // button 1 Select file 
    {
        try 
        {
            JFileChooser jf = new JFileChooser();
            jf.showOpenDialog(jPanel1);
            String ss = jf.getSelectedFile().getAbsolutePath();
            fnam = jf.getSelectedFile().getAbsolutePath();
            int len = ss.length();
            String sss = "";
            sss = (String) jList1.getSelectedValue().toString();
            String f = ss.substring(len - 4, len);
            
            if (sss.equals(f)) 
            {
                jTextField1.setText(ss);
            } else 
            {
                JOptionPane.showMessageDialog(jPanel1, "Not a Selected File");
            }

        } catch (Exception e) 
        {
            System.out.println("except1 "+e.getMessage());
        }
    }// button 1 end 

    private void formWindowOpened(java.awt.event.WindowEvent evt) //form event file options 
    {
        try 
        {
            cn.add(".doc");
            cn.add(".pdf");
            cn.add(".rft");
            System.out.println("cn=" + cn);
            ar = new String[cn.size()];
            ar = cn.toArray(ar);
            for (String saa : ar) 
            {
                System.out.println("ar=" + saa);
            }
            for (int i = 0; i < ar.length; i++) 
            {
                jList1.setListData(ar);
            }

        } catch (Exception e) {
            System.out.println("Except2 "+e.getMessage());
        }
    }//form event file  options 


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//button 2 Extract
    {
        jTextArea1.setVisible(true);
        try 
        {
            fileconversion rff=new fileconversion();
            FileWriter fs = new FileWriter("./Extract.txt");
            BufferedWriter bw = new BufferedWriter(fs);
            String inp = jTextField1.getText();

            File f = new File(inp);
            fsize = (int) f.length();
            fnam = f.getName();
            System.out.println("Fname in Read:" + fnam);
            if (!f.exists()) {
                System.out.println("Sorry File does not Exists!");
            } else 
            {
                if (f.getName().endsWith(".pdf") || f.getName().endsWith(".PDF")) 
                {
                	
                    jTextArea1.append(rff.pdftotext(inp));
                    bw.write(rff.pdftotext(inp));
                    bw.newLine();
                } else if (f.getName().endsWith(".doc") || f.getName().endsWith(".DOC"))
                {

                    jTextArea1.append(rff.doc2text(inp));
                    bw.write(rff.doc2text(inp));
                    bw.newLine();
                } else if (f.getName().endsWith(".rtf") || f.getName().endsWith(".RTF")) 
                {

                    jTextArea1.append(rff.rtf2text(new FileInputStream(inp)));
                    bw.write(rff.rtf2text(new FileInputStream(inp)));
                    bw.newLine();
                }
                bw.close();
            }
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }


    } //button 2 end 

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//button 3 calls stopword form 
    {
    	stopword st =new stopword();
    	st.setVisible(true);
    } //button 3 end

    public String doc2text(String fileName) throws IOException  //function covert doc to string 
    {
    	WordDocument wd = new WordDocument(fileName);
    	StringWriter docTextWriter = new StringWriter();
    	wd.writeAllText(new PrintWriter(docTextWriter));
    	docTextWriter.close();
    	return docTextWriter.toString();
    }


    public String rtf2text(InputStream is) throws Exception   //function covert rtf to string 
    {
    	DefaultStyledDocument styledDoc = new DefaultStyledDocument();
    	new RTFEditorKit().read(is, styledDoc, 0);
    	return styledDoc.getText(0, styledDoc.getLength());
    }
    public String pdftotext(String fileName)  //function pdf  to string 
    {
    		PDFParser parser = null;
    	    PDDocument pdDoc = null;
    	    COSDocument cosDoc = null;
    	    PDFTextStripper pdfStripper;
    	    String parsedText; 
    	    File f = new File(fileName);
    	
    	try 
    	{
    		parser = new PDFParser(new FileInputStream(f));
    		parser.parse();
    		cosDoc = parser.getDocument();
            pdfStripper = new PDFTextStripper();
            pdDoc = new PDDocument(cosDoc);
            parsedText = pdfStripper.getText(pdDoc);
    		cosDoc.close();
    		pdDoc.close();
    		
    	} catch (Exception e)
    	{
    		System.out.println("An exception occured in parsing the PDF Document.");
    		e.printStackTrace();
    		try {
    			if (cosDoc != null) 
    			{
    				cosDoc.close();
    			}
    			if (pdDoc != null)
    			{
    				pdDoc.close();
    			}
    		} catch (Exception e1) 
    		{
    			e1.printStackTrace();
    		}
    		return null;
    	}
    	System.out.println("Done.");
    	return parsedText;
    }

}//end of class 
