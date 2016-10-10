/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluation2g1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

/**
 *
 * @author DANIEL
 */
public class Statistic extends JFrame{
    private double[] value;
    private int top;
    private JInternalFrame ventana;
    
    private JDesktopPane  mdi;
    private JButton adicionar, ver_calificaciones;
    private JTextField nueva,curso;
    private JScrollBar a,b,c,d;
    
    //--------------------------------------------
    public Statistic ()
    {
        super("promedio");
        setSize(600,400);
        widgets();
        setVisible(true);
    }
    //---------------------------------------------
    private void widgets()
    {
        JPanel p = new JPanel(new GridLayout(1,2));
        JPanel p1 = new JPanel(new GridLayout(1,4));
        JPanel p2 = new JPanel(new GridLayout(6,1));
        
        ventana = new JInternalFrame("promedio ",true,true,true,true);
        
        
        
        mdi = new JDesktopPane();
        adicionar = new JButton("adicionar");
        ver_calificaciones = new JButton("ver calificaciones");
        nueva = new JTextField();
        curso = new JTextField();
        a = new JScrollBar(JScrollBar.VERTICAL,5,0,0,5);
        b = new JScrollBar(JScrollBar.VERTICAL,5,0,0,5);
        c = new JScrollBar(JScrollBar.VERTICAL,5,0,0,5);
        d = new JScrollBar(JScrollBar.VERTICAL,5,0,0,5);
        
        add(mdi);  
        p.add(p2);
        p.add(p1);
           p1.add(a);
           p1.add(b);
           p1.add(c);
           p1.add(d);
           
           p2.add(new JLabel("Nueva Calificacion"));
           p2.add(nueva);
           p2.add(new JLabel("Curso de la Calificacion"));
           p2.add(curso);
           p2.add(adicionar);
           p2.add(ver_calificaciones);
           
        add(p,BorderLayout.CENTER);        
        
  
    }
    //-------------------------------------------------
    public void addValue(double v)
    {
        
    }
    //----------------------------------------------
    public double getAverage()
    {
       return 0;
    }
    //-----------------------------------------------
    public int getCount()
    {
        return 0;
    }
    //-------------------------------------------
    public double getValue (int i)
    {
        return 0;
    }
//---------------------------------------------------
    public static void main(String[] args) {
        new Statistic();
    }
}

