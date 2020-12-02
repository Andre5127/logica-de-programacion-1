import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class  formulario_principal extends JFrame { 
    
       public formulario_principal() { 
        setLayout(new BorderLayout());
        // panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Menu principal");
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);
        // panel izquierdo
        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setLayout(new GridLayout(3, 1));
        // boton conductores
        JButton boton_conductores = new JButton("Conductores");
        boton_conductores.setBounds(3, 0, 100, 30);
        boton_conductores.addActionListener(new botton_conductores_click());
        // boton vehiculo
        JButton boton_vehiculos = new JButton("Vehiculos");
        boton_vehiculos.setBounds(3, 0, 100, 30);
        boton_vehiculos.addActionListener(new botton_vehiculos_click());
        // boton acerca de
        JButton boton_AcercaDe = new JButton("Acerca de");
        boton_AcercaDe.setBounds(3, 0, 100, 30);
        boton_AcercaDe.addActionListener(new botton_AcercaDe_click());

        panel_izquierdo.add(boton_AcercaDe);
        panel_izquierdo.add(boton_conductores);
        panel_izquierdo.add(boton_vehiculos);

        add(panel_superior, BorderLayout.NORTH);
        add(panel_izquierdo, BorderLayout.WEST);

        setTitle("Menu principal");
        setVisible(true);
        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
        class botton_conductores_click implements ActionListener {
            public void actionPerformed(ActionEvent a) {
            }
        }
        class botton_vehiculos_click implements ActionListener {
            public void actionPerformed(ActionEvent a) {
            }
        }
        class botton_AcercaDe_click implements ActionListener {
            public void actionPerformed(ActionEvent a) {
            }
        }
    

