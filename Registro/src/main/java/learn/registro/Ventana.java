
package learn.registro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Ventana extends JFrame
{
    private JPanel panel;
    private JTextField nombre;
    private JTextField edad;
    private JTextArea area;
    private Controlador controlador;

    public Ventana() 
    {
        this.setSize(800,800);
        setTitle("Lista de personas");
        setLocationRelativeTo(null);
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes()
    {
        colocarPanel();
        colocarEtiquetaNombre();
        colocarCajaNombre();
        colocarCajaEdad();
        colocarAreaTexto();
        colocarBoton();
    }
    
    private void colocarPanel()
    {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void colocarEtiquetaNombre()
    {
        JLabel nombre = new JLabel();
        nombre.setBounds(20, 20, 300, 40);
        nombre.setText("Hola, ingresa un nombre y una edad por favor");
        panel.add(nombre);
    }
    private void colocarCajaNombre()
    {
        nombre = new JTextField();
        nombre.setBounds(50, 70, 100, 30);
        panel.add(nombre);
    }
    
    private void colocarCajaEdad()
    {
        edad = new JTextField();
        edad.setBounds(200, 70, 100, 30);
        panel.add(edad);
    }
    
    private void colocarAreaTexto()
    {
        area = new JTextArea();
        area.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(area);
        scrollPane.setBounds(50, 220, 500, 500);
        panel.add(scrollPane);
    }
    
    public void colocarBoton()
    {
        this.controlador = new Controlador();
        JButton agregar = new JButton();
        agregar.setText("Agregar");
        agregar.setBounds(130, 150, 100, 30);
        panel.add(agregar);
        
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String nombreTexto = nombre.getText();
                int edadTexto = Integer.parseInt(edad.getText());
                
                controlador.crearPersona(nombreTexto, edadTexto);
                area.setText(controlador.listarPersonas());
            }
        };
        agregar.addActionListener(oyente);
    }
    
}