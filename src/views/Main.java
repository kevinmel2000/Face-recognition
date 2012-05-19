package views;

import data.ImageTrainingSetLoader;
import data.PCADataProcessor;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.encog.ml.data.MLDataSet;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
            
            /////////////TEST/////////////////////////////////////////////////////////////
          ImageTrainingSetLoader loader = new ImageTrainingSetLoader();
          loader.setDataProcessor(new PCADataProcessor());
          
          MLDataSet training = loader.loadData("dataSet");
            ////////////////////////////////////////////////////////////////////////
            
            
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLoadAnImage = new JButton("Load an image");
		btnLoadAnImage.setBounds(133, 395, 113, 23);
		frame.getContentPane().add(btnLoadAnImage);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(39, 36, 300, 348);
		frame.getContentPane().add(panel);
		
		JLabel lblYourImage = new JLabel("Your image:");
		lblYourImage.setBounds(144, 11, 69, 14);
		frame.getContentPane().add(lblYourImage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(445, 36, 300, 348);
		frame.getContentPane().add(panel_1);
		
		JLabel lblPersonFound = new JLabel("Person found:");
		lblPersonFound.setBounds(566, 11, 69, 14);
		frame.getContentPane().add(lblPersonFound);
		
		JButton btnFindAPerson = new JButton("Find a person !");
		btnFindAPerson.setBounds(548, 395, 119, 23);
		frame.getContentPane().add(btnFindAPerson);
	}
}