/*
 * ⠄⠄⠄⢰⣧⣼⣯⠄⣸⣠⣶⣶⣦⣾⠄⠄⠄⠄⡀⠄⢀⣿⣿⠄⠄⠄⢸⡇⠄⠄
 * ⠄⠄⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿⠄
 * ⠄⠄⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿⠄
 * ⠄⠄⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⠄
 * ⠄⢀⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋⣰
 * ⠄⣼⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀⣤           Creador: Limni Jafet Morales Morales
 * ⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿⡗           Versión: 3.1
 * ⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄           Fecha De Creación: 26/03/21
 * ⢸⣿⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄
 * ⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃⠄
 * ⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄⠄
 * ⠄⠄⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄⠄
 * ⠄⠄⠄⠄⠈⠛⢿⣿⣿⣿⠁⠞⢿⣿⣿⡄⢿⣿⡇⣸⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄
 * ⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣾⣦⡙⠻⣷⣾⣿⠃⠿⠋⠁⠄⠄⠄⠄⠄⢀⣠⣴
 * ⣿⣿⣿⣶⣶⣮⣥⣒⠲⢮⣝⡿⣿⣿⡆⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⣠⣴⣿⣿⣿
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Propuesta {

//Interfaz grafica de usuario

    private JFrame ventana;
    private JPanel panelC;
    private JLabel labelOne, labelTwo;
    private JButton bot1, bot2;
    private int x,y;
    private Random alea;

    //Posición del botón y dimensiones
    public static final int posX = 350;
    public static final int posY = 250;
    public static final int tamX  = 100;
    public static final int tamY  = 30;

// Constructor que inicializa los componentes

    public Propuesta() {
        ventana = new JFrame();
        panelC = new JPanel();
        labelOne = new JLabel();
        labelTwo = new JLabel();
        bot1 = new JButton();
        bot2 = new JButton();
        alea = new Random();
        this.atributos();
        this.armado();
        this.escuchas();
        this.lanzar_IGU();
    }

// Atributos de los componentes

    public void atributos() {
        ventana.setSize(550, 400);
        ventana.setResizable(true);
        panelC.setLayout(null);
        bot1.setText("No");
        bot1.setBounds(posX, posY, tamX, tamY);
        //botón2
        bot2.setText("Si");
        bot2.setBounds(115,posY, tamX, tamY);
        bot2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bot2){
                    JOptionPane.showMessageDialog(null,"Sabia que dirías que si");
                }
                System.exit(0);
            }
        });
        //label 1
        labelOne.setText("¿Quieres Ser Mi Novia?");
        labelOne.setBounds(70,75,450,30);
        labelOne.setFont(new Font("Courier New", 1,30));
        //label 2
        labelTwo.setText("By: Jafet_Morales");
        labelTwo.setBounds(5,330,450,30);
        labelTwo.setFont(new Font("Courier new",1,16));
    }

// Metodo que añade los atributos al panel, posteriormente a la ventana

    public void armado() {
        ventana.add(panelC);
        panelC.add(bot1);
        panelC.add(bot2);
        panelC.add(labelOne);
        panelC.add(labelTwo);
    }

// Asignar los "escuchas"

    public void escuchas() {
        BotonEscucha_Raton esc_b = new BotonEscucha_Raton();
        PanelEscucha_Raton esc_p = new PanelEscucha_Raton();
        panelC.addMouseListener(esc_p);
        bot1.addMouseListener(esc_b);
    }

    public void lanzar_IGU() {
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    private class BotonEscucha_Raton implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e)  { }
        @Override
        public void mousePressed(MouseEvent e)  { }
        @Override
        public void mouseReleased(MouseEvent e) { }
        @Override
        public void mouseEntered(MouseEvent e) {
            x = alea.nextInt(450);
            y = alea.nextInt(300);
            bot1.setBounds(x,y,tamX,tamY);
        }
        @Override
        public void mouseExited(MouseEvent e) { }
    }

    private class PanelEscucha_Raton implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e)  { }
        @Override
        public void mousePressed(MouseEvent e)  { }
        @Override
        public void mouseReleased(MouseEvent e) { }
        @Override
        public void mouseEntered(MouseEvent e)  { }
        @Override
        public void mouseExited(MouseEvent e) {
            bot1.setBounds(posX,posY, tamX, tamY);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new Propuesta();
            }
        });
    }
}

