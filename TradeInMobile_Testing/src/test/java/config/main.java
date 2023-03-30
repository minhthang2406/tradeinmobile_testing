package config;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import create_new_request.create_new_request;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(5, 16, 60));
		contentPane.setBorder(new LineBorder(new Color(73, 8, 91), 3, true));
		//To Free the button inside and user can change the position of jbutton
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnStartTestMvp = new JButton("Start Test MVP");
		btnStartTestMvp.setBounds(154, 49, 139, 25);
		btnStartTestMvp.setVerticalAlignment(SwingConstants.TOP);
		btnStartTestMvp.setForeground(new Color(252, 233, 79));
		btnStartTestMvp.setBackground(new Color(206, 92, 0));
		contentPane.add(btnStartTestMvp);
		
		JLabel lblTradeInMobile = new JLabel("TRADE IN MOBILE AUTOMATED TEST");
		lblTradeInMobile.setForeground(new Color(238, 238, 236));
		lblTradeInMobile.setBounds(96, 12, 255, 25);
		contentPane.add(lblTradeInMobile);
		btnStartTestMvp.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent ev) {
            	create_new_request run = new  create_new_request ();
            	String shellCommand = "java -jar tradeInProd.jar";
            	try {
            		ProcessBuilder builder = new ProcessBuilder("bash", "-c", shellCommand);
          	        builder.redirectErrorStream(true);
          	        Process prc = builder.start();
					run.beforeTest();
					run.Case_001_Create_New_Request();
	            	run.afterTest();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	
            	
            }
        });
	}
}
