/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.aula;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
 /*
 * @author Alumno
 */
public class Preguntas extends JFrame implements ActionListener, Serializable{
    
    private JButton opc1, opc2, opc3, opc4;
    private JLabel titulo;
    private String[] preguntinis;
    private String[] resp1, resp2, resp3, resp4, resp5, resp6, resp7, resp8, resp9, resp10, resp11, resp12, resp13;
    private String[] resp14, resp15, resp16, resp17, resp18, resp19, resp20, resp21, resp22, resp23, resp24, resp25;
    
    public Preguntas(){
        
        preguntinis = new String[25];
        preguntinis[0] = "1. Modelo economico empleado en el sexenio de Lazaro Cardenas:";
        preguntinis[1] = "2. Aportación a la educación por parte de Lazaro Cardenas:";
        preguntinis[2] = "3. Presidente que reguló la existencia de los partidos politicos:";
        preguntinis[3] = "4. Primer presidente civil de la revolucion mexicana:";
        preguntinis[4] = "5. Modelo economico empleado en el sexenio de Adolfo Ruiz Cortinez:";
        preguntinis[5] = "6. Presidente que logró la devolucion de terrenos como el chamizal:";
        preguntinis[6] = "7. Sexenio presidencial en el que destacó el creciminento económico del país así como la represión autoritaria:";
        preguntinis[7] = "8. Presidente que implementó la campaña de \"Renovación moral\":";
        preguntinis[8] = "9. Sexenio al que fue llamado de \"Crecimiento 0\":";
        preguntinis[9] = "10. Presidente al que se le atribuyen 3 magnicidios:";
        preguntinis[10] = "11. Sexenio presidencial en el que ocurre el \"Error de Diciembre\":";
        preguntinis[11] = "12. Primer presidente del PAN despúes de 70 años de gobierno del PRI:";
        preguntinis[12] = "13. Es una caracteristica del socialismo:";
        preguntinis[13] = "14. Crisis, recesión, depresión, recuperación y auge son fases del ciclo economico _______.";
        preguntinis[14] = "15. Durante la segunda guerra mundial, ¿Cuáles de los siguientes paises pertenecian a los paises aliados?";
        preguntinis[15] = "16. Concepto que permite entender en términos cuantitativos el desenvolvimiento económico de un país:";
        preguntinis[16] = "17. Estado de atraso y dependencia económica";
        preguntinis[17] = "18. ¿Cual de las siguientes opciones integran las variables económicas";
        preguntinis[18] = "19. De acuerdo a los factores de producción, son los recursos naturales como: agua, tierra, etc.";
        preguntinis[19] = "20. Son los bienes que nos sirven para producir otros bienes como maquinaria, equipo, mobiliatio, etc.";
        preguntinis[20] = "21. Es la actividad humana que transforma y adapta la naturaleza:";
        preguntinis[21] = "22. Tipo de economia en la que se da entrada a la inversion y se puede invertir en el extranjero:";
        preguntinis[22] = "23. Forma parte del sector secundario:";
        preguntinis[23] = "24. ¿Cuál oción incluye los tres sectores sociales?";
        preguntinis[24] = "25. Es el proceso por el cual se registra el aumento de la comunicacion e interdependecia entre paises:";
        
        resp1 = new String[4];
        resp1[0] = "Sustitución de importaciones"; 
        resp1[1] = "Desarrollo estabilizador"; 
        resp1[2] = "Neoliberalismo"; 
        resp1[3] = "Crecimiento acelerado"; 
        
        resp2 = new String[4];
        resp2[0] = "La creación del CTM"; 
        resp2[1] = "La creación del IPN"; 
        resp2[2] = "La expropiación petrolera"; 
        resp2[3] = "La creación del INAH";
        
        resp3 = new String[4];
        resp3[0] = "Lázaro Cardenas"; 
        resp3[1] = "Ernesto Zedillo"; 
        resp3[2] = "Lopez Portillo"; 
        resp3[3] = "Manuel Ávila C.";
        
        resp4 = new String[4];
        resp4[0] = "Lopez Portillo"; 
        resp4[1] = "Miguel Alemán Valdés"; 
        resp4[2] = "Manuel Ávila C."; 
        resp4[3] = "Adolfo López Mateos";
        
        resp5 = new String[4];
        resp5[0] = "Desarrollo compartido"; 
        resp5[1] = "Sustitución de importaciones"; 
        resp5[2] = "Crecimiento acelerado"; 
        resp5[3] = "Desarrollo estabilizador";
        
        resp6 = new String[4];
        resp6[0] = "Adolfo López Mateos"; 
        resp6[1] = "Lázaro Cardenas"; 
        resp6[2] = "Miguel de la Madrid"; 
        resp6[3] = "Lopez Portillo";
        
        resp7 = new String[4];
        resp7[0] = "Gustavo Díaz Ordaz"; 
        resp7[1] = "Adolfo López Mateos"; 
        resp7[2] = "Vicente Fox"; 
        resp7[3] = "Miguel de la Madrid";
        
        resp8 = new String[4];
        resp8[0] = ""; 
        resp8[1] = ""; 
        resp8[2] = ""; 
        resp8[3] = "";
        
        resp9 = new String[4];
        resp9[0] = ""; 
        resp9[1] = ""; 
        resp9[2] = ""; 
        resp9[3] = "";
        
        resp10 = new String[4];
        resp10[0] = ""; 
        resp10[1] = ""; 
        resp10[2] = ""; 
        resp10[3] = "";
        
        resp11 = new String[4];
        resp1[0] = ""; 
        resp1[1] = ""; 
        resp1[2] = ""; 
        resp1[3] = "";
        
        resp12 = new String[4];
        resp12[0] = ""; 
        resp12[1] = ""; 
        resp12[2] = ""; 
        resp12[3] = "";
        
        resp13 = new String[4];
        resp13[0] = ""; 
        resp13[1] = ""; 
        resp13[2] = ""; 
        resp13[3] = "";
        
        resp14 = new String[4];
        resp14[0] = ""; 
        resp14[1] = ""; 
        resp14[2] = ""; 
        resp14[3] = "";
        
        resp15 = new String[4];
        resp15[0] = ""; 
        resp15[1] = ""; 
        resp15[2] = ""; 
        resp15[3] = "";
        
        resp16 = new String[4];
        resp16[0] = ""; 
        resp16[1] = ""; 
        resp16[2] = ""; 
        resp16[3] = "";
        
        resp17 = new String[4];
        resp17[0] = ""; 
        resp17[1] = ""; 
        resp17[2] = ""; 
        resp17[3] = "";
        
        resp18 = new String[4];
        resp18[0] = ""; 
        resp18[1] = ""; 
        resp18[2] = ""; 
        resp18[3] = "";
        
        resp19 = new String[4];
        resp19[0] = ""; 
        resp19[1] = ""; 
        resp19[2] = ""; 
        resp19[3] = "";
        
        resp20 = new String[4];
        resp20[0] = ""; 
        resp20[1] = ""; 
        resp20[2] = ""; 
        resp20[3] = "";
        
        resp21 = new String[4];
        resp21[0] = ""; 
        resp21[1] = ""; 
        resp21[2] = ""; 
        resp21[3] = "";
        
        resp22 = new String[4];
        resp22[0] = ""; 
        resp22[1] = ""; 
        resp22[2] = ""; 
        resp22[3] = "";
        
        resp23 = new String[4];
        resp23[0] = ""; 
        resp23[1] = ""; 
        resp23[2] = ""; 
        resp23[3] = "";
        
        resp24 = new String[4];
        resp24[0] = ""; 
        resp24[1] = ""; 
        resp24[2] = ""; 
        resp24[3] = "";
        
        resp25 = new String[4];
        resp25[0] = ""; 
        resp25[1] = ""; 
        resp25[2] = ""; 
        resp25[3] = "";
        
        setLayout(null);
        setBounds(150, 5, 1080, 720);
        this.getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        titulo = new JLabel(preguntinis[6], SwingConstants.CENTER);
        titulo.setFont(new Font("Century Ghotic", Font.BOLD, 20));
        titulo.setBounds(0, 15, 1080, 50);
        titulo.setHorizontalTextPosition(SwingConstants.CENTER);
        add(titulo);
        
        setVisible(true);
    }
    
    public void preguntas(){
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
}
