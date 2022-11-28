import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel welcomeLabel = new JLabel("Hello!");
	JButton brewed = new JButton("Brewed");
	JButton coldBeverages = new JButton("ColdBeverages");
	JButton espressoBar = new JButton("EspressoBar");
	JButton food = new JButton("Food");
	MainWindow(){
	
	
	brewed.setBounds(10,80,130,25);
	brewed.addActionListener(this);
	coldBeverages.setBounds(150,80,130,25);
	espressoBar.setBounds(290,80,120,25);
	food.setBounds(420,80,120,25);
	
	frame.add(brewed);
	frame.add(coldBeverages);
	frame.add(espressoBar);
	frame.add(food);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(1000, 700);
	frame.setLayout(null);
	frame.setVisible(true);


}
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		Brewed brewed = new Brewed();
	

	
//	WelcomePage(String userID){
//		
//		welcomeLabel.setBounds(0,0,200,35);
//		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
//		welcomeLabel.setText("Hello "+userID);
//		
//		frame.add(welcomeLabel);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(420, 420);
//		frame.setLayout(null);
//		frame.setVisible(true);

	}}
