package moneycalculatorui;

import java.awt.HeadlessException;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import moneycalculatorui.swing.SwingMoneyDisplay;


public class MainFrame extends  JFrame {

    public MainFrame(){
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setVisible(true);
        setMenuBar(menuBar());
        add(MoneyDisplay()); 
    }

    private MenuBar menuBar() {
        MenuBar menuBar = new MenuBar();
        menuBar.add(operationMenu());
        return menuBar;
    }

    private Menu operationMenu() {
        Menu menu = new Menu("Operation");
        menu.add(calculateOperation());        
        return menu;
    }

    private MenuItem calculateOperation() {
        MenuItem menuItem = new MenuItem("Calculate");
        menuItem.addActionListener(executeCalculate());
        return menuItem;
               
    }

    private ActionListener executeCalculate() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exectue Calculate...");
            }
        };
    }

    private JPanel MoneyDisplay() {
        SwingMoneyDisplay panel = new SwingMoneyDisplay();
        return panel;
    }

    
    
}
