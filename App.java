package tictocApp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class App extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel boardPanel;
	private JPanel[][] boardSquares;
	
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItemStartGame;
	
		public App(int size) {
			super("Tic-Tac-Toe Application");
			this.setSize(500,500);
			this.setLayout(new FlowLayout(FlowLayout.CENTER));
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
			
			boardPanel = new JPanel();
			boardPanel.setPreferredSize(new Dimension(100 * size, 100 * size));
			boardPanel.setBackground(Color.GREEN);
			boardPanel.setLayout(new GridLayout(size,size));
			boardSquares = new JPanel[size][size];
			
			menuBar = new JMenuBar();
			menu = new JMenu("Menu");
			menuItemStartGame = new JMenuItem("Start Game");
			
			menuItemStartGame.addActionListener(e -> startGame());
			
			menuBar.add(menu);
			menu.add(menuItemStartGame);
			
			for(int i = 0; i < size; i++)
				for(int j = 0; j < size; j++) {
					boardSquares[i][j] = new JPanel();
					
					boardSquares[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
					boardSquares[i][j].setBackground(Color.cyan);
					
					boardPanel.add(boardSquares[i][j]);
				}
			
			this.add(boardPanel); 
			this.setJMenuBar(menuBar);
			
			
			this.pack();
			this.repaint();
		}
	
		public void startGame() {
			
		}
		
		
		public static void main(String[] args) {
			App myApp = new App(3);
			
		}
}
