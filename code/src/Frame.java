import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Label;
import java.util.ArrayList;

import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;


public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private ArrayList<String> languages = new ArrayList<String>();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(17, 62, 61, 16);
		contentPane.add(lblCategory);
		
		textField_1 = new JTextField();
		textField_1.setForeground(UIManager.getColor("Button.darkShadow"));
		textField_1.setBounds(110, 110, 100, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 138, 100, 29);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(UIManager.getColor("Button.background"));
		comboBox.setBounds(110, 83, 100, 27);
		contentPane.add(comboBox);
		
		
		String[] description = { "C++", "Java", "SQL",
			      "Python", "Assembler", "C"};
		JTextField t = new JTextField(15);
		int count = 0;
		for (int i = 0; i < 6; i++){
			comboBox.addItem(description[count++]);
			t.setEditable(false);
}
		
		
		JLabel lblLanguage = new JLabel("Language");
		lblLanguage.setBounds(17, 87, 61, 16);
		contentPane.add(lblLanguage);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(238, 238, 238));
		comboBox_1.setBounds(110, 58, 100, 27);
		contentPane.add(comboBox_1);
		
		JLabel lblTeamSize = new JLabel("Team Size");
		lblTeamSize.setBounds(17, 116, 90, 16);
		contentPane.add(lblTeamSize);
		
		JLabel lblSystemSize = new JLabel("System Size");
		lblSystemSize.setBounds(17, 144, 90, 16);
		contentPane.add(lblSystemSize);
		
		JLabel lblNewPorject = DefaultComponentFactory.getInstance().createTitle("New Project");
		lblNewPorject.setBounds(68, 33, 122, 16);
		contentPane.add(lblNewPorject);
		
		final JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setBounds(400, 62, 100, 21);
		contentPane.add(textPane);
	
		
		final JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBackground(Color.LIGHT_GRAY);
		textPane_1.setBounds(400, 89, 100, 21);
		contentPane.add(textPane_1);
		
		final JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setBackground(Color.LIGHT_GRAY);
		textPane_2.setBounds(400, 117, 100, 21);
		contentPane.add(textPane_2);
		
		final JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setBackground(Color.LIGHT_GRAY);
		textPane_3.setBounds(400, 146, 100, 21);
		contentPane.add(textPane_3);
		
		JLabel lblEffort = new JLabel("Effort");
		lblEffort.setBounds(301, 254, 61, 28);
		contentPane.add(lblEffort);
		
		final JTextPane textPane_6 = new JTextPane();
		textPane_6.setEditable(false);
		textPane_6.setBackground(Color.LIGHT_GRAY);
		textPane_6.setBounds(400, 254, 100, 84);
		contentPane.add(textPane_6);
		
		JLabel lblMostSimularProject = DefaultComponentFactory.getInstance().createTitle("Most Similar Project");
		lblMostSimularProject.setBounds(312, 33, 175, 16);
		contentPane.add(lblMostSimularProject);
		
		JLabel lblPredictedEffort = DefaultComponentFactory.getInstance().createTitle("Predicted Effort");
		lblPredictedEffort.setBounds(17, 321, 120, 16);
		contentPane.add(lblPredictedEffort);
		
		final JTextPane textPane_7 = new JTextPane();
		textPane_7.setEditable(false);
		textPane_7.setBounds(145, 298, 100, 84);
		contentPane.add(textPane_7);
		
		JLabel lblSimilarity = DefaultComponentFactory.getInstance().createTitle("Similarity");
		lblSimilarity.setBounds(17, 399, 120, 16);
		contentPane.add(lblSimilarity);
		
		final JTextPane textPane_8 = new JTextPane();
		textPane_8.setBounds(145, 394, 65, 29);
		contentPane.add(textPane_8);
		
		textField = new JTextField();
		textField.setBounds(110, 165, 100, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblRequierments = new JLabel("Requirements");
		lblRequierments.setBounds(17, 171, 100, 16);
		contentPane.add(lblRequierments);
		
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"10000-15000", "15001-20000", "20001-25000", "25001-30000", "30001-35000"}));
		comboBox_2.setBounds(110, 195, 100, 27);
		contentPane.add(comboBox_2);
		
		JLabel lblBudget = new JLabel("Budget");
		lblBudget.setBounds(17, 199, 100, 16);
		contentPane.add(lblBudget);
		
		JLabel label = new JLabel("Category");
		label.setBounds(301, 62, 61, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Language");
		label_1.setBounds(301, 87, 61, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Team Size");
		label_2.setBounds(301, 116, 90, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("System Size");
		label_3.setBounds(301, 144, 90, 16);
		contentPane.add(label_3);
		
		final JTextPane textPane_4 = new JTextPane();
		textPane_4.setEditable(false);
		textPane_4.setBackground(Color.LIGHT_GRAY);
		textPane_4.setBounds(400, 173, 100, 21);
		contentPane.add(textPane_4);
		
		final JTextPane textPane_5 = new JTextPane();
		textPane_5.setEditable(false);
		textPane_5.setBackground(Color.LIGHT_GRAY);
		textPane_5.setBounds(400, 201, 100, 21);
		contentPane.add(textPane_5);
		
		JLabel label_4 = new JLabel("Requirements");
		label_4.setBounds(301, 171, 100, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Budget");
		label_5.setBounds(301, 199, 100, 16);
		contentPane.add(label_5);
		
		JLabel lblComplexity = new JLabel("Complexity");
		lblComplexity.setBounds(17, 226, 100, 16);
		contentPane.add(lblComplexity);
		
		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_3.setBounds(110, 222, 100, 27);
		contentPane.add(comboBox_3);
		
		//
		String[] description1 = {"Real-Time", "System", "Game",
			      "Utility"};
		JTextField t1 = new JTextField(15);
		int count1 = 0;
		for (int i = 0; i < 4; i++){
		      comboBox_1.addItem(description1[count1++]);
		    t1.setEditable(false);
		}
		
		
		JLabel lblComplexity_1 = new JLabel("Complexity\n");
		lblComplexity_1.setBounds(301, 220, 100, 28);
		contentPane.add(lblComplexity_1);
		
		final JTextPane textPane_9 = new JTextPane();
		textPane_9.setEditable(false);
		textPane_9.setBackground(Color.LIGHT_GRAY);
		textPane_9.setBounds(400, 227, 100, 21);
		contentPane.add(textPane_9);
		
		
		JButton button = new JButton("Similarity");
		button.setBackground(UIManager.getColor("InternalFrame.background"));
		button.addMouseListener(new MouseAdapter() {
			
			/**
			 * HŠr sker allt
			 */
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// ALL IN DATA
				ArrayList<Case> cases = CaseLibrary.loadCases();
				
				languages.add((String) (comboBox.getItemAt(comboBox.getSelectedIndex())));
				String cat = (String) (comboBox_1.getItemAt(comboBox_1.getSelectedIndex()));
				int tSize = Integer.parseInt(textField_1.getText());
				int sSize = Integer.parseInt(textField_2.getText());
				int req = Integer.parseInt(textField.getText());
				int comp = Integer.parseInt((String) comboBox_3.getItemAt(comboBox_3.getSelectedIndex()));
				int budget = comboBox_2.getSelectedIndex()+1;
				
				Case userCase = new UserCase("New Project", cat , languages, tSize,
						sSize, req, comp, budget);
				
				
				
				double similarity = 0;
				ExistingCase bestMatch = null;
				ArrayList<Case> qualifiedCases = new ArrayList<Case>();
				double curSimilarity = 0;
				double totalSimilarity = 0;
				
				for (Case c : cases) {
					curSimilarity = userCase.getSimilarity(c);
					if (curSimilarity > similarity) {
						bestMatch = (ExistingCase) c;
						similarity = curSimilarity;
					}
					if (curSimilarity > 0.5) {
						System.out.println("CBR: Case over 0,5");
						System.out.println(curSimilarity+ " current");
						qualifiedCases.add(c);
						totalSimilarity = totalSimilarity + curSimilarity;
					}
				}
				
				textPane.setText(bestMatch.category); // Category
				textPane_1.setText(bestMatch.language.get(0)); // Language
				textPane_2.setText(Integer.toString(bestMatch.teamSize)); // Team Size
				textPane_3.setText(Double.toString(bestMatch.systemSize)); // System Size
				textPane_4.setText(Integer.toString(bestMatch.requirements)); // Requirements
				
				
				if(bestMatch.budget == 1){
					textPane_5.setText("10000-15000");
				}
				else if(bestMatch.budget == 2){
					textPane_5.setText("15001-20000");
				}
				else if(bestMatch.budget == 3){
					textPane_5.setText("20001-25000");
				}
				else if(bestMatch.budget ==4){
					textPane_5.setText("25001-30000");
				}
				else if(bestMatch.budget == 5){
					textPane_5.setText("30001-35000");
				}
				
				textPane_9.setText(Integer.toString(bestMatch.complexity)); // Complexity
				
				
				//TODO: Predict effort
				
				
				
				double[] caseEffort = new double[qualifiedCases.size()];
				for (int i = 0; i < qualifiedCases.size(); i++) {
					ExistingCase c = (ExistingCase) qualifiedCases.get(i);
					caseEffort[i] = (double) (userCase.systemSize)
							/ (double) (c.systemSize) * (double) (c.effort)
							* c.getSimilarity(userCase) / totalSimilarity;
				}
				double curEffort = 0;
				double predictedEffort = 0;
				for (double effort : caseEffort) {
					predictedEffort = predictedEffort + effort;
					curEffort = effort;
				}
				int eff = (int) curEffort/
						Integer.parseInt(textField_1.getText());
				
				
				textPane_6.setText(Integer.toString(eff) +" PH \n" + Integer.toString(eff/8) +" PD \n" + 
						Integer.toString((eff/8)/5) +" PW \n" + Integer.toString(((eff/8)/5)/4) +" PM \n" 
						+ Integer.toString((((eff/8)/5)/4/11)) +" PY"); 
				
				
				// Predicted effort
					int pred = (int) predictedEffort/
							Integer.parseInt(textField_1.getText());
					
							
					textPane_7.setText(Integer.toString(pred) +" PH \n" + Integer.toString(pred/8) +" PD \n" + 
							Integer.toString((pred/8)/5) +" PW \n" + Integer.toString(((pred/8)/5)/4) +" PM \n" 
								+ Integer.toString((((pred/8)/5)/4/11)) +" PY");
					
					
					/*
					
					System.out.println(Double.toString(predictedEffort/
							Integer.parseInt(textField_1.getText())) +" PH \n");
					
					textPane_7.setText(Double.toString((predictedEffort/
							Integer.parseInt(textField_1.getText()))/5) +" PD \n");
					
					
					System.out.println(Double.toString((predictedEffort/
							Integer.parseInt(textField_1.getText()))/5) +" PD \n");
					
					textPane_7.setText(Double.toString(((predictedEffort/
							Integer.parseInt(textField_1.getText()))/5)/4) +" PW \n");
					
					textPane_7.setText(Double.toString((((predictedEffort/
							Integer.parseInt(textField_1.getText()))/5)/4)/11) +"PM \n");
				 * 
					 */
				double sim =  userCase.getSimilarity(bestMatch)*100;
				textPane_8.setText(Double.toString(sim)); // Similarity
				
				
				
				
				System.out.println(textField_1.getText()); // TEAM SIZE
				System.out.println(textField_2.getText()); //SYSTEM SIZE
				System.out.println(textField.getText()); // REQUIREMENTS
				System.out.println((String) (comboBox.getItemAt(comboBox.getSelectedIndex())));//LANGUAGE
				System.out.println((String) (comboBox_1.getItemAt(comboBox_1.getSelectedIndex())));//CATEGORY
				System.out.println((String) (comboBox_2.getItemAt(comboBox_2.getSelectedIndex())));//Budget
				System.out.println((String) (comboBox_3.getItemAt(comboBox_3.getSelectedIndex())));//Complexity
				
				
			}
		});
		button.setBounds(406, 394, 117, 29);
		contentPane.add(button);
		
		JLabel label_6 = DefaultComponentFactory.getInstance().createLabel("%");
		label_6.setBounds(216, 399, 120, 16);
		contentPane.add(label_6);
		
		
	}	
}
