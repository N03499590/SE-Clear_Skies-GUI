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

public class Record extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Record frame = new Record();
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
	public Record() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Records");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(323, 30, 53, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnCharteredFlights = new JButton("Chartered Flights");
		btnCharteredFlights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Charter charter = new Charter();
				charter.setVisible(true);
			}
		});
		btnCharteredFlights.setBounds(278, 100, 146, 25);
		contentPane.add(btnCharteredFlights);
		
		JButton btnAircraft = new JButton("Aircraft");
		btnAircraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aircraft plane = new Aircraft();
				plane.setVisible(true);
			}
		});
		btnAircraft.setBounds(278, 125, 146, 25);
		contentPane.add(btnAircraft);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer customer = new Customer();
				customer.setVisible(true);
			}
		});
		btnCustomer.setBounds(278, 300, 146, 25);
		contentPane.add(btnCustomer);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee employee = new Employee();
				employee.setVisible(true);
			}
		});
		btnEmployee.setBounds(278, 175, 146, 25);
		contentPane.add(btnEmployee);
		
		JButton btnModel = new JButton("Model");
		btnModel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Model model = new Model();
				model.setVisible(true);
			}
		});
		btnModel.setBounds(278, 150, 146, 25);
		contentPane.add(btnModel);
		
		JButton btnCrews = new JButton("Crews");
		btnCrews.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Crews crews = new Crews();
				crews.setVisible(true);
			}
		});
		btnCrews.setBounds(278, 200, 146, 25);
		contentPane.add(btnCrews);
		
		JButton btnPilots = new JButton("Pilots");
		btnPilots.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pilots pilots = new Pilots();
				pilots.setVisible(true);
			}
		});
		btnPilots.setBounds(278, 225, 146, 25);
		contentPane.add(btnPilots);
		
		JButton btnRating = new JButton("Rating");
		btnRating.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rating rating = new Rating();
				rating.setVisible(true);
			}
		});
		btnRating.setBounds(278, 250, 146, 25);
		contentPane.add(btnRating);
		
		JButton btnEarnedating = new JButton("Earnedrating");
		btnEarnedating.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Earnedrating earnedrating = new Earnedrating();
				earnedrating.setVisible(true);
			}
		});
		btnEarnedating.setBounds(278, 275, 146, 25);
		contentPane.add(btnEarnedating);
	}
}
