import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Charter extends JFrame {

	private JPanel contentPane;
	private JTable Charter_Table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Charter frame = new Charter();
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
	public Charter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCharter = new JLabel("Charter");
		lblCharter.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCharter.setBounds(325, 30, 50, 16);
		contentPane.add(lblCharter);
		
		Charter_Table = new JTable();
		Charter_Table.setBounds(50, 150, 600, 250);
		contentPane.add(Charter_Table);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnView.setBounds(50, 90, 97, 25);
		contentPane.add(btnView);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(301, 90, 97, 25);
		contentPane.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(550, 90, 97, 25);
		contentPane.add(btnDelete);
	}
}
