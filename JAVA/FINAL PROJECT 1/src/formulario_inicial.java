// p1: lineas de comentarios de autor, fecha y descripcion.
//AUTHORS: Andres Felipe Torres lopez & Lina Sanchez ROmero.
//DATE: 01/12/2020.
//DESCRIPTION: Este Software nos muestra por medio de una ventana emergente, un formulario que nos muestra el control
//............ del transporte urbano de una ciudad. Se da a conocer la infomacion  conductor del vehiculo
// ...........(identificación, nombres, licencia, etc) y la informacion del  vehivulo que prestara el servicio
// ...........(placa, fecha de la matricula, numero de puestos y el propietario).

// p2: importar las librerias requeridas.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulario_inicial extends JFrame{
    JButton botton_inicio;
    public formulario_inicial(){
        JLabel l_titulo = new JLabel("Software final de logica de programción");
        l_titulo.setBounds( 200,10,500,20);
        add(l_titulo);
        JLabel l_version = new JLabel("Version 1.0");
        l_version.setBounds(300,300,400,20);

        botton_inicio = new JButton("Empezar");
        botton_inicio.setBounds(250,130,100,40);
        botton_inicio.addActionListener(new botton_click());
        
        add(l_titulo);
        add(l_version);
        add(botton_inicio);

        setTitle("Software final del semestre");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    }

class botton_click implements ActionListener{
    public void actionPerformed (ActionEvent a){
    formulario_principal form_principal = new formulario_principal();
    }


}

