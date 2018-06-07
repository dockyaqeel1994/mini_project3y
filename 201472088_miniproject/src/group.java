
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.rtf.RTFEditorKit;
import org.apache.poi.hdf.extractor.WordDocument;
import org.pdfbox.cos.COSDocument;
import org.pdfbox.pdfparser.PDFParser;
import org.pdfbox.pdmodel.PDDocument;
import org.pdfbox.util.PDFTextStripper;


public class group extends javax.swing.JFrame 
{

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JList jList1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;

	File f;
	public static String  fn,fnam;
	public static ArrayList<String> cn = new ArrayList();
	public static String[] ar;
	public static int fsize,no;
	public static File folder1;
	StringBuffer sb = new StringBuffer(8192);

	// End of variables declaration


	public group()//constructor
	{
		initComponents();
	}


	private void initComponents()     // display Components
	{

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jScrollPane2 = new javax.swing.JScrollPane();
		jList1 = new javax.swing.JList();
		jLabel2 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setMinimumSize(new java.awt.Dimension(700, 600));
		addWindowListener(new java.awt.event.WindowAdapter() 
		{
			public void windowOpened(java.awt.event.WindowEvent evt)
			{
				formWindowOpened(evt);
			}
		});
		getContentPane().setLayout(null);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), 
				"Select the files", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.DEFAULT_POSITION, 
				new java.awt.Font("Times New Roman", 0, 24), 
				Color.black));
		jPanel1.setOpaque(false);
		jPanel1.setLayout(null);

		jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jPanel2.setOpaque(false);
		jPanel2.setLayout(null);

		jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18));
		jLabel1.setForeground(Color.BLACK);
		jLabel1.setText("Select the folder");
		jPanel2.add(jLabel1);
		jLabel1.setBounds(20, 42, 130, 30);

		jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
		jPanel2.add(jTextField1);
		jTextField1.setBounds(170, 42, 320, 28);

		jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
		jButton1.setText("Browse");
		jButton1.setOpaque(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() 
		{
			public void actionPerformed(java.awt.event.ActionEvent evt) 
			{
				jButton1ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton1);
		jButton1.setBounds(50, 90, 100, 31);

		jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18));
		jButton2.setText("View");
		jButton2.setOpaque(false);
		jButton2.addActionListener(new java.awt.event.ActionListener() 
		{
			public void actionPerformed(java.awt.event.ActionEvent evt) 
			{
				jButton2ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton2);
		jButton2.setBounds(150, 90, 100, 30);

		jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
		jButton3.setText("Extract");
		jButton3.setOpaque(false);
		jButton3.addActionListener(new java.awt.event.ActionListener() 
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				jButton3ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton3);
		jButton3.setBounds(250, 90, 110, 31);

		jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18));
		jButton4.setText("Proceed");
		jButton4.setOpaque(false);
		jButton4.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt) 
			{
				jButton4ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton4);
		jButton4.setBounds(360, 90, 100, 31);

		jPanel1.add(jPanel2);
		jPanel2.setBounds(137, 54, 500, 160);

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jPanel1.add(jScrollPane1);
		jScrollPane1.setBounds(20, 220, 620, 260);

		jScrollPane2.setViewportView(jList1);

		jPanel1.add(jScrollPane2);
		jScrollPane2.setBounds(20, 50, 100, 160);

		getContentPane().add(jPanel1);
		jPanel1.setBounds(10, 0, 670, 510);

		//  jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collweb.jpg")));
		jLabel2.setText("jLabel2");
		getContentPane().add(jLabel2);
		jLabel2.setBounds(0, 0, 680, 500);

		pack();
	}// display Components

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) // button 1 browse
	{
		try
		{
			JFileChooser jfc=new JFileChooser();
			jfc.showOpenDialog(this);
			f=jfc.getSelectedFile();
			fn=f.getParent();
			jTextField1.setText(fn);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(this, e);
		}

	}//button 1 browse

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) //button 2 view 
	{
		try
		{
			String files1;
			File folder=new File(fn);
			File[] list=folder.listFiles();

			for(int lf1=0;lf1<list.length;lf1++)
			{
				if(list[lf1].isFile())
				{
					files1=list[lf1].getName();
					jTextArea1.append(files1+"\n");
				}
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(this, e);
		}
	}//button 2 view 

	private void formWindowOpened(java.awt.event.WindowEvent evt)//formWindowOpened file options 
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

		} catch (Exception e) 
		{
			System.out.println("Except2 "+e.getMessage());
		}
	}//formWindowOpened file options 

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) // button 3 Extract 
	{
		try{
			String files1;
			folder1=new File(fn);
			jTextArea1.setText("");
			File[] list=folder1.listFiles();
			no=list.length;
			for(int lf1=0;lf1<list.length;lf1++)
			{
				if(list[lf1].isFile())
				{
					files1=list[lf1].getName();

					System.out.println("File Name "+files1);

					fileconversion rff=new fileconversion();
					FileWriter fs = new FileWriter("./Extract"+lf1+".txt");
					BufferedWriter bw = new BufferedWriter(fs);
					System.out.println("fn"+fn);
					String inp = fn+"\\"+files1;
					System.out.println("inp"+inp);
					File f = new File(inp);
					fsize = (int) f.length();
					fnam = f.getName();
					System.out.println("===================================================");
					System.out.println("Fname in Read:"+ fnam);
					System.out.println("===================================================");
					if (!f.exists()) 
					{
						System.out.println("Sorry File does not Exists!");
					} else 
					{
						if (f.getName().endsWith(".pdf") || f.getName().endsWith(".PDF")) {
							jTextArea1.append("===========================================");
							jTextArea1.append(rff.pdftotext(inp)+"\n\n");
							jTextArea1.append("===========================================");
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
				}
			}
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}// button 3 Extract 

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) // button 3 Proceed calls stopn class 
	{
		stopN n=new stopN();
		 n.setVisible(true);
	}// button 3 Proceed
	public String doc2text(String fileName) throws IOException //function convert from doc to text
	{
		WordDocument wd = new WordDocument(fileName);
		StringWriter docTextWriter = new StringWriter();
		wd.writeAllText(new PrintWriter(docTextWriter));
		docTextWriter.close();
		return docTextWriter.toString();
	}


	public String rtf2text(InputStream is) throws Exception //function convert from rtf to text
	{
		DefaultStyledDocument styledDoc = new DefaultStyledDocument();
		new RTFEditorKit().read(is, styledDoc, 0);
		return styledDoc.getText(0, styledDoc.getLength());
	}
	public String pdftotext(String fileName)  //function convert from pdf to text
	{
		PDFParser parser;
		String parsedText;
		PDFTextStripper pdfStripper;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;
		File f = new File(fileName);
		try 
		{
			parser = new PDFParser(new FileInputStream(f));
		} catch (Exception e) 
		{
			System.out.println("Unable to open PDF Parser.");
			return null;
		}
		try {
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
			try 
			{
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
	}//function convert from pdf to text

}//end of class 
