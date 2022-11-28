import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Brewed implements ActionListener{
	
	private double darkCoffee = 2.5;
	private double mildCoffee = 2.5;
	private double mediumCoffee = 2.5;
	private double decafCoffee = 2.5;
	private double flavouredCoffee = 2.5;
	
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton dark = new JButton("Dark");
	JButton mild = new JButton("Mild");
	JButton medium = new JButton("Medium");
	JButton flavoured = new JButton("Flavoured");
	JButton decaf = new JButton("Decaf");
	
	Brewed(){	
	dark.setBounds(10,80,130,25);
	mild.setBounds(150,80,130,25);
	medium.setBounds(290,80,120,25);
	flavoured.setBounds(420,80,120,25);
	decaf.setBounds(560,80,120,25);
	
	frame.add(dark);
	frame.add(mild);
	frame.add(medium);
	frame.add(flavoured);
	frame.add(decaf);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(1000, 700);
	frame.setLayout(null);
	frame.setVisible(true);
	setUpButtonListeners();

	
}
    public void setUpButtonListeners() {
    	ActionListener buttonListener1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				darkCoffee += darkCoffee; 
			}
    	};
    	
    	ActionListener buttonListener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
    	};
    	ActionListener buttonListener3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
    	};
    	ActionListener buttonListener4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
    	};
    	ActionListener buttonListener5 = new ActionListener() {
    		@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
    	};
    	
    	dark.addActionListener(buttonListener1);  	
    	mild.addActionListener(buttonListener2);  	
    	medium.addActionListener(buttonListener3);  	
    	flavoured.addActionListener(buttonListener4);  	
    	decaf.addActionListener(buttonListener5);  	
    
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

    
}
