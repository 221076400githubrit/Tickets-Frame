/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.ul;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author 001
 */
public class Ticket extends JFrame{
    //panel
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel hometeamPnl;
    private JPanel awayteamPnl;
    private JPanel pricePnl;
    private JPanel numticketPnl;
    private JPanel amountPnl;
    private JPanel ticketdetailsPnl;
    private JPanel ticketdetailsAndBtnPnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    //label
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel hometeamLbl;
    private JLabel awayteamLbl;
    private JLabel priceLbl;
    private JLabel numticketsLbl;
    private JLabel amountLbl;
    //text field
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField hometeamTxtFld;
    private JTextField awayteamTxtFld;
    private JTextField priceTxtFld;
    private JTextField amountTxtFld;
    //slider
    private JSlider numticketsSld;
    //Button
    private JButton buyBtn;
    private JButton clearBtn;
    private JButton exitBtn;

    public Ticket() {
        //create JFrame
        setTitle("Ticket sales");
        setSize(1500, 1550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        
        //create panel
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
       
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        nameAndSurnamePnl = new JPanel(new GridLayout(2, 1, 1, 1));
        nameAndSurnamePnl.setBorder(new TitledBorder(new LineBorder(Color.blue, 3), "Customer details"));
        
        hometeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayteamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pricePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numticketPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        amountPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        ticketdetailsPnl = new JPanel(new GridLayout(5, 1, 1, 1));
        ticketdetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.blue, 3), "Tickets details"));
        
        ticketdetailsAndBtnPnl = new JPanel(new BorderLayout());
        
        btnPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        mainPnl = new JPanel(new BorderLayout());
        
        //create label
        headingLbl = new JLabel("Soccer Match Tickets");
        headingLbl.setFont(new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 35));
        headingLbl.setForeground(Color.cyan);
        
        nameLbl = new JLabel("Name:       ");
        surnameLbl = new JLabel("Surname: ");
        
        hometeamLbl = new JLabel("Home team: ");
        awayteamLbl = new JLabel("Away team:  ");
        priceLbl = new JLabel("Cost price: R");
        numticketsLbl = new JLabel("Number of tickets required: ");
        amountLbl = new JLabel("Total amount due: R");
        
        //create text field
        nameTxtFld = new JTextField(10);
        nameTxtFld.setFocusable(true);
        
        surnameTxtFld = new JTextField(10);
        
        hometeamTxtFld = new JTextField(10);
        awayteamTxtFld = new JTextField(10);
        priceTxtFld = new JTextField(10);
        
        amountTxtFld = new JTextField("To be calculated later.", 20);
        amountTxtFld.setEditable(false);
        
        //create slider
        numticketsSld = new JSlider(1, 20);
        
        //create buttons
        buyBtn = new JButton("Buy");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //add all component to panel
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
                
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        hometeamPnl.add(hometeamLbl);
        hometeamPnl.add(hometeamTxtFld);
        
        awayteamPnl.add(awayteamLbl);
        awayteamPnl.add(awayteamTxtFld);
        
        pricePnl.add(priceLbl);
        pricePnl.add(priceTxtFld);
        
        numticketPnl.add(numticketsLbl);
        numticketPnl.add(numticketsSld);
        
        amountPnl.add(amountLbl);
        amountPnl.add(amountTxtFld);
        
        ticketdetailsPnl.add(hometeamPnl);
        ticketdetailsPnl.add(awayteamPnl);
        ticketdetailsPnl.add(pricePnl);
        ticketdetailsPnl.add(numticketPnl);
        ticketdetailsPnl.add(amountPnl);
        
        btnPnl.add(buyBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        ticketdetailsAndBtnPnl.add(ticketdetailsPnl, BorderLayout.CENTER);
        ticketdetailsAndBtnPnl.add(btnPnl, BorderLayout.SOUTH);
        
        //add all panels to main panel
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(nameAndSurnamePnl, BorderLayout.CENTER);
        mainPnl.add(ticketdetailsAndBtnPnl, BorderLayout.SOUTH);
        
        //add main panel to frame panel
        add(mainPnl);
        
        pack();
        
        setVisible(true);
    }
    
}
