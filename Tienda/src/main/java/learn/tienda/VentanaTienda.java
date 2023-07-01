
package learn.tienda;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaTienda extends JFrame
{
    public JPanel panel;
    public JLabel etiqueta;
    public int cont = 0, cont2 = 0;
    
    public VentanaTienda()
    {
        this.setSize(500,500);
        setTitle("Tienda");
        setLocationRelativeTo(null);
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes()
    {
        colocarPanel();
        colocarBoton();
    }
    
    private void colocarPanel()
    {
        panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void colocarBoton()
    {
        JButton boton = new JButton();
        boton.setText("Click");
        boton.setBounds(50, 200, 100, 50);
        panel.add(boton);
        
        JButton boton2 = new JButton();
        boton2.setText("Salir");
        boton2.setBounds(200, 200, 100, 50);
        boton2.setOpaque(true);
        boton2.setEnabled(true);
        panel.add(boton2);
        
        etiqueta = new JLabel();
        etiqueta.setBounds(50, 50, 600, 40);
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setBackground(Color.BLACK);
        etiqueta.setFont(new Font ("arial",Font.PLAIN,20));
        panel.add(etiqueta);
        
        ActionListener eventoDeBoton = new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                cont ++;
                switch (cont)
                {
                    case 1:
                        etiqueta.setText("Bien Perro");
                        break;
                        
                    case 2:
                        etiqueta.setText("Bien Perro!");
                        break;
                        
                    case 3:
                        etiqueta.setText("Ya te dije que bien perro");
                        break;
                        
                    case 4:
                        etiqueta.setText("Ya Perro");
                        break;
                        
                    case 5:
                        etiqueta.setText("Chingadamadre! te dije que YA PERRO!");
                        break;
                        
                    case 6:
                        etiqueta.setText("No te cansas Qlei?");
                        break;
                        
                    case 7:
                        etiqueta.setText("Pinche madre weeeee ya cierra!");
                        break;
                        
                    case 8:
                        etiqueta.setText("Me carga el chorizo, siguele y no respondo");
                        boton.setText("Siguele");
                        break;
                        
                    case 9:
                        etiqueta.setText("Che vato, ya me cansé a la verga");
                        break;
                        
                    case 10:
                        etiqueta.setText("Te odio Prro");
                        break;
                        
                    case 11:
                        etiqueta.setText("Hazlo una vez mas, te reto maderfaker!!");
                        break;
                        
                    case 12:
                        etiqueta.setText("QUE LA VERGA! Bye");
                        break;
                        
                    case 13:
                        System.exit(0);
                        break;
                }
            }
        };
        
        ActionListener eventoDeBoton2 = new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                cont2 ++;
                switch (cont2)
                {
                    case 1:
                        etiqueta.setText("Seguro?");
                        break;
                
                
                    case 2:
                        etiqueta.setText("Muy seguro?");
                        break;
                
                
                    case 3:
                        etiqueta.setText("Seras qlo");
                        break;
                        
                    case 4:
                        System.exit(0);
                        break;
                }
            }
        };
        
        boton.addActionListener(eventoDeBoton);
        boton2.addActionListener(eventoDeBoton2);
    }
}
