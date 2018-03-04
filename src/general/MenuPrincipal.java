package general;

import complejos.CalculadoraGUI;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;

/**
 *
 * @author Onder francisco
 */
public class MenuPrincipal extends javax.swing.JFrame implements Runnable {

    Color a = Color.blue;
    Thread hilo= null;
    JLabel background;
    int contador;

    public MenuPrincipal() {

        initComponents();

        this.start();
        this.setResizable(false);
        this.setLocationRelativeTo(this);

        //Ajustes del background
        background = new JLabel();
        background.setLocation(0,-20);
        background.setSize(this.getWidth(), this.getHeight());
        background.setIcon(new ImageIcon("img/Fondo/FondoA.png"));
        this.add(background);
        background.setVisible(true);

        //Inciciacion de imágenes de botones primarios
        ProyectoUno.setIcon(new ImageIcon("img/Botones/BottonI(Sinseleccionar).png"));
        ProyectoDos.setIcon(new ImageIcon("img/Botones/BottonII(Sinseleccionar).png"));
        ProyectoTres.setIcon(new ImageIcon("img/Botones/BottonIII(Sinseleccionar).png"));

        //Los botones secundarios inician invisibles
        CalcComplejos.setVisible(false);
        B3.setVisible(false);
        B2.setVisible(false);
        C1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProyectoDos = new javax.swing.JButton();
        ProyectoTres = new javax.swing.JButton();
        CalcComplejos = new javax.swing.JButton();
        ProyectoUno = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        B3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ProyectoDos.setBorderPainted(false);
        ProyectoDos.setContentAreaFilled(false);
        ProyectoDos.setPreferredSize(new java.awt.Dimension(100, 60));
        ProyectoDos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ProyectoDosMouseMoved(evt);
            }
        });

        ProyectoTres.setBorderPainted(false);
        ProyectoTres.setContentAreaFilled(false);
        ProyectoTres.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ProyectoTresMouseMoved(evt);
            }
        });

        CalcComplejos.setBackground(new java.awt.Color(0, 0, 0));
        CalcComplejos.setForeground(new java.awt.Color(255, 255, 0));
        CalcComplejos.setText("Complejos");
        CalcComplejos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcComplejosActionPerformed(evt);
            }
        });

        ProyectoUno.setBorderPainted(false);
        ProyectoUno.setContentAreaFilled(false);
        ProyectoUno.setPreferredSize(new java.awt.Dimension(100, 60));
        ProyectoUno.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ProyectoUnoMouseMoved(evt);
            }
        });

        B2.setBackground(new java.awt.Color(0, 0, 0));
        B2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 0));
        B2.setText("Ecuaciones");

        C1.setBackground(new java.awt.Color(0, 0, 0));
        C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C1.setForeground(new java.awt.Color(255, 255, 0));
        C1.setText(" Fourier");

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MathSolve");

        B3.setBackground(new java.awt.Color(0, 0, 0));
        B3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 255, 0));
        B3.setText("Integrales");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(ProyectoUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(CalcComplejos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProyectoDos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProyectoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel1)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ProyectoDos, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(ProyectoUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ProyectoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalcComplejos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProyectoUnoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProyectoUnoMouseMoved
        //La imagen del proyecto uno cambia para que se vea mas grande
        ProyectoUno.setIcon(new ImageIcon("img/Botones/BottonI(Seleccionados).png"));
        //La imagen del proyectodos vuelve a su tamaño original
        ProyectoDos.setIcon(new ImageIcon("img/Botones/BottonII(Sinseleccionar).png"));
        //La imagen del proyectotres vuelve a su tamaño original
        ProyectoTres.setIcon(new ImageIcon("img/Botones/BottonIII(Sinseleccionar).png"));
        CalcComplejos.setVisible(true);
        B3.setVisible(false);
        B2.setVisible(false);
        C1.setVisible(false);
    }//GEN-LAST:event_ProyectoUnoMouseMoved

    private void CalcComplejosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcComplejosActionPerformed
        CalculadoraGUI CC = new CalculadoraGUI();
        CC.setLocationRelativeTo(this);
        CC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CalcComplejosActionPerformed

    private void ProyectoTresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProyectoTresMouseMoved
        //La imagen del proyectouno vuelve a su tamaño original
        ProyectoUno.setIcon(new ImageIcon("img/Botones/BottonI(Sinseleccionar).png"));
        //La imagen del proyectodos vuelve a su tamaño original
        ProyectoDos.setIcon(new ImageIcon("img/Botones/BottonII(Sinseleccionar).png"));
        //La imagen del proyecto tres cambia para que se vea mas grande
        ProyectoTres.setIcon(new ImageIcon("img/Botones/BottonIII(Seleccionar).png"));
        CalcComplejos.setVisible(false);
        B3.setVisible(false);
        B2.setVisible(false);
        C1.setVisible(true);
    }//GEN-LAST:event_ProyectoTresMouseMoved

    //Cuando el puntero esta encima del botón
    private void ProyectoDosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProyectoDosMouseMoved
        //La imagen del proyectouno vuelve a su tamaño original
        ProyectoUno.setIcon(new ImageIcon("img/Botones/BottonI(Sinseleccionar).png"));
        //La imagen del proyecto dos cambia para que se vea mas grande
        ProyectoDos.setIcon(new ImageIcon("img/Botones/BottonII(Seleccionar).png"));
        //La imagen del proyectotres vuelve a su tamaño original
        ProyectoTres.setIcon(new ImageIcon("img/Botones/BottonIII(Sinseleccionar).png"));
        CalcComplejos.setVisible(false);
        B3.setVisible(true);
        B2.setVisible(true);
        C1.setVisible(false);
    }//GEN-LAST:event_ProyectoDosMouseMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton C1;
    private javax.swing.JButton CalcComplejos;
    private javax.swing.JButton ProyectoDos;
    private javax.swing.JButton ProyectoTres;
    private javax.swing.JButton ProyectoUno;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    //El hilo que controla la animacion
    @Override
    public void run() {
         while(hilo.isAlive()) {

            try {
                Thread.sleep(900);
            }catch(InterruptedException e){}
        }
    }

    //Inicia el hilo
    public void start(){
        if(hilo==null){
            hilo= new Thread(this);
            hilo.start();
        }
    }

}
