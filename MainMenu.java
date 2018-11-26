import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Main Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(353, 30, 78, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnCharterNewFlight = new JButton("Charter New Flight");
		btnCharterNewFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CharterFlights charter = new CharterFlights();
				charter.setVisible(true);
			}
		});
		btnCharterNewFlight.setBounds(311, 158, 162, 25);
		contentPane.add(btnCharterNewFlight);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI logout = new GUI();
				//logout.setVisible(true);
			}
		});
		btnLogout.setBounds(353, 419, 78, 25);
		contentPane.add(btnLogout);
		
		JButton btnRecords = new JButton("Accessing Records");
		btnRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Record record = new Record();
				record.setVisible(true);
			}
		});
		btnRecords.setBounds(311, 253, 162, 25);
		contentPane.add(btnRecords);
	}

}
