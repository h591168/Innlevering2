package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave1 {

public static void main(String[] args) {
          
        double trinnNull = 0.00;
        double trinnEtt = 0.0093;
        double trinnTo = 0.0241;
        double trinnTre= 0.1152;
        double trinnFire = 0.1452; 
        
        String lønn = showInputDialog("Bruttoinntekt: ");
        int brutto = parseInt(lønn);
        int skattefritt = 164100;
        
        
        
        
        if (brutto <= 164100) {
            double skatt = trinnNull;
            double trinnSkatt = skatt*brutto;
            showMessageDialog(null, "Skattesats: " + skatt + "\n" + "Trinnskatt: " + trinnSkatt);
        
        }
        
        else if (brutto > 164100 && brutto <= 230950) {
            int skattbarLønn = brutto - skattefritt;
            double trinnSkatt = skattbarLønn * trinnEtt;
            
            showMessageDialog(null, "Skattesats: " + trinnEtt + "\n" + "Trinnskatt: " + trinnSkatt);    
        }

        else if (brutto > 230950 && brutto <= 580650) {
            int skattbarLønn = brutto - skattefritt;
            double trinnSkatt = skattbarLønn * trinnTo;
            
            showMessageDialog(null, "Skattesats: " + trinnTo + "\n" + "Trinnskatt: " + trinnSkatt);
        }
        else if (brutto > 580650 && brutto <= 934050) {
            int skattbarLønn = brutto - skattefritt;
            double trinnSkatt = skattbarLønn * trinnTre;
            
            showMessageDialog(null, "Skattesats: " + trinnTre + "\n" + "Trinnskatt: " + trinnSkatt);
        }
        
        else if (brutto > 934050) {
            int skattbarLønn = brutto- skattefritt;
            double trinnSkatt = skattbarLønn * trinnFire;
            
            showMessageDialog(null, "Skattesats: " + trinnFire + "\n" + "Trinnskatt: " + trinnSkatt);
            
        }
}
}
        