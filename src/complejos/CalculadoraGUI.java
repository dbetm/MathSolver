package complejos;


import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Carlos
 */
public class CalculadoraGUI extends javax.swing.JFrame {
    private Complejo resultado;
    private char ultimaOperacion; 
    private ArrayList<Complejo> datos;

    public CalculadoraGUI() {
        initComponents();
        datos = new ArrayList<Complejo>();
        this.setTitle("Calculadora de números complejos");
        lblAlert.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = grafica.obtenerGrafica();
        jPanel2 = new javax.swing.JPanel();
        Text = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        Resta = new javax.swing.JButton();
        Retroceso = new javax.swing.JButton();
        Multiplicacion = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Conjugado = new javax.swing.JButton();
        Modulo = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        Suma = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        forma = new javax.swing.JComboBox<>();
        raices = new javax.swing.JButton();
        lblAlert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        Text.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setEnabled(false);
        jTextField2.setFocusable(false);
        jTextField2.setOpaque(false);

        Resta.setBackground(new java.awt.Color(51, 51, 51));
        Resta.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Resta.setForeground(new java.awt.Color(255, 255, 255));
        Resta.setText("-");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });

        Retroceso.setBackground(new java.awt.Color(51, 51, 51));
        Retroceso.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Retroceso.setForeground(new java.awt.Color(255, 255, 255));
        Retroceso.setText("^");
        Retroceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetrocesoActionPerformed(evt);
            }
        });

        Multiplicacion.setBackground(new java.awt.Color(51, 51, 51));
        Multiplicacion.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Multiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        Multiplicacion.setText("X");
        Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacionActionPerformed(evt);
            }
        });

        Division.setBackground(new java.awt.Color(51, 51, 51));
        Division.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Division.setForeground(new java.awt.Color(255, 255, 255));
        Division.setText("/");
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });

        Conjugado.setBackground(new java.awt.Color(51, 51, 51));
        Conjugado.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Conjugado.setForeground(new java.awt.Color(255, 255, 255));
        Conjugado.setText("Z'");
        Conjugado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConjugadoActionPerformed(evt);
            }
        });

        Modulo.setBackground(new java.awt.Color(51, 51, 51));
        Modulo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Modulo.setForeground(new java.awt.Color(255, 255, 255));
        Modulo.setText("|Z|");
        Modulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModuloActionPerformed(evt);
            }
        });

        Igual.setBackground(new java.awt.Color(51, 51, 51));
        Igual.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Igual.setForeground(new java.awt.Color(255, 255, 255));
        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Graficar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblMessage.setForeground(new java.awt.Color(244, 7, 7));

        Suma.setBackground(new java.awt.Color(51, 51, 51));
        Suma.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Suma.setForeground(new java.awt.Color(255, 255, 255));
        Suma.setText("+");
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("IR A MENU");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        forma.setBackground(new java.awt.Color(51, 51, 51));
        forma.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        forma.setForeground(new java.awt.Color(255, 255, 255));
        forma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Algebraica", "Trigonometrica", "Exponencial" }));
        forma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formaActionPerformed(evt);
            }
        });

        raices.setBackground(new java.awt.Color(51, 51, 51));
        raices.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        raices.setForeground(new java.awt.Color(255, 255, 255));
        raices.setText("(z)^1/n");
        raices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raicesActionPerformed(evt);
            }
        });

        lblAlert.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAlert.setForeground(new java.awt.Color(253, 55, 55));
        lblAlert.setText("lblAlert");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMessage))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Conjugado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Retroceso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(raices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(forma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(195, 195, 195)))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlert)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMessage)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAlert)
                        .addGap(4, 4, 4)))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Retroceso, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raices, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Conjugado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(Igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // grafica.BorrarGrafica();
        StringToReZImZ Separar = new StringToReZImZ();
        Separar.Separar(Text.getText());
        grafica.agregarGrafica(Text.getText(),Separar.getReZ(),Separar.getImZ());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Botón borrar
        grafica.BorrarGrafica();
        jTextField2.setText("");
        Text.setText("");
        resultado = null;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        // Boton de igual
        Complejo complejo;
        prepararOperacion(ultimaOperacion, true);
        if(ultimaOperacion != 'e') {
            this.Text.setText(Operacion.mostrarNumero(resultado));
            datos.add(resultado);
            resultado = null;
            //this.jTextField2.setText("");

            for(Complejo e:datos){
                grafica.agregarGrafica("Grafica",e.getParteReal(),e.getParteImaginaria());
            }
        }
    }//GEN-LAST:event_IgualActionPerformed

    private void ModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModuloActionPerformed
        this.Text.setText("");
    }//GEN-LAST:event_ModuloActionPerformed

    private void ConjugadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConjugadoActionPerformed
        String conjugado = this.Text.getText();
        this.jTextField2.setText(conjugado);
        this.Text.setText("");
    }//GEN-LAST:event_ConjugadoActionPerformed

     // => DIVISIÓN
    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
        prepararOperacion('/',false);
        ultimaOperacion = '/';
    }//GEN-LAST:event_DivisionActionPerformed

    // => MULTIPLICACIÓN
    private void MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacionActionPerformed
        prepararOperacion('*',false);
        ultimaOperacion = '*';
    }//GEN-LAST:event_MultiplicacionActionPerformed

    private void RetrocesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrocesoActionPerformed
    // potencia     
//            ArrayList<String> resultado;
//           StringToReZImZ Separar = new StringToReZImZ();
//           String tx=Text.getText();
//           int i;
//           int j;
//           float[] parOrdenado = Separar.Separar(tx);
//           Complejo comp=new Complejo(parOrdenado[0], parOrdenado[1]);
//         for ( i = 0; i < tx.length(); i++) {
//            if(tx.charAt(i)=='^')break;
//        }
//         for ( j = 0; j < tx.length(); j++) {
//            if(tx.charAt(j)=='/')break;
//        }
//         if(j>i&&j!=tx.length()){
//             for (int k = j; k < tx.length(); k++) {
//                if(tx.charAt(k)=='.'){
//                    System.out.println("Error la raiz debe ser positiva");
//                    break;
//                } 
//             }
////   
//          String ns=JOptionPane.showInputDialog("Escribe el valor de n");
//           int n=Integer.parseInt(ns);
//           resultado=Operacion.sacarRaices(comp, n);
//           System.out.println("Estas son las raices"+resultado);
//         }
//        if(j==tx.length()||j<i){
        StringToReZImZ Separar = new StringToReZImZ();
          String tx=Text.getText();
        prepararOperacion('^',false);
        ultimaOperacion = '^';
       Separar.Separar(Text.getText());
       grafica.agregarGrafica(Text.getText(),Separar.getReZ(),Separar.getImZ());
        //}        
            //Aquí va la Exponenciación
    }//GEN-LAST:event_RetrocesoActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed

    }//GEN-LAST:event_RestaActionPerformed

    private void TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextActionPerformed
        if(!lblMessage.getText().isEmpty()) lblMessage.setText("");
    }//GEN-LAST:event_TextActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formaActionPerformed
        
        int f=0;
           StringToReZImZ Separar = new StringToReZImZ();
       Separar.Separar(Text.getText());
        String m=Text.getText();
        float[] parOrdenado = Separar.Separar(m);
        Complejo complejo = new Complejo(parOrdenado[0], parOrdenado[1]);
        String item=(String) forma.getSelectedItem();
        float ang=complejo.getAngulo();
         float mod=complejo.getModulo();
        for(int i=0;i<50;i++){
            if(m.charAt(i)=='c')f=1;
            if(m.charAt(i)=='e')f=2;
            else f=3;                 
        }
        if(item.equals("Algebraico")&&f==3){
          jTextField2.setText("z="+m);
        }
        if(item.equals("Algebraico")&&f==1){
           jTextField2.setText("z="+mod+"(cos("+ang+")+isen("+ang+"))");
       }
        if(item.equals("Algebraico")&&f==2){
           jTextField2.setText("z="+mod+"(e^i"+ang);
       }
        if(item.equals("Trigonometrica")&&f==1){
          jTextField2.setText("z="+m);
        }
         if(item.equals("Trigonometrica")&&f==3){
          Convertidor.deTrigonometricaAAlgebraica(m);
        }
          if(item.equals("Exponencial")&&f==2){
          jTextField2.setText("z="+m);
        }
          if(item.equals("Exponencial")&&f==3){
          Convertidor.deExponencialAAlgebraica(m);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_formaActionPerformed

    private void raicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raicesActionPerformed
           
            ArrayList<String> resultado;
           StringToReZImZ Separar = new StringToReZImZ();
           String tx=Text.getText();
           float[] parOrdenado = Separar.Separar(tx);
           Complejo comp=new Complejo(parOrdenado[0], parOrdenado[1]);
       
           String ns=JOptionPane.showInputDialog("Escribe el valor de n");
           int n=Integer.parseInt(ns);
           resultado=Operacion.sacarRaices(comp, n);
           System.out.println("Estas son las raices"+resultado);
        // TODO add your handling code here:
    }//GEN-LAST:event_raicesActionPerformed

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
prepararOperacion('+',false);
         ultimaOperacion = '+';
         // TODO add your handling code here:
    }//GEN-LAST:event_SumaActionPerformed

   
    // Esta función retorna verdadero si el número complejo introducido es genuino
    private boolean evaluador() {
        boolean respuesta = true; 
        String entrada = this.Text.getText();
        
        // Para quitar el texto de error previo si existe
        if(!lblAlert.getText().isEmpty()) lblAlert.setText("");
        
        entrada = StringToReZImZ.validar(entrada);
        
        if(entrada.contains("Error")) {
            lblAlert.setText(entrada);
            respuesta = false;
        }

        return respuesta;
    }
    
    private void prepararOperacion(char operador, boolean isEqual) {
        String cadena = this.Text.getText();
        
        if(evaluador()) { // La entrada es válida
            StringToReZImZ separador = new StringToReZImZ();
            float[] parOrdenado = separador.Separar(cadena);
            // dos números afectados por una operación
            if(!this.jTextField2.getText().isEmpty()) {
                Complejo complejo = new Complejo(parOrdenado[0], parOrdenado[1]);
                datos.add(complejo);
                resultado = realizarOperacion(operador, resultado, complejo);
            }
            else { // es el primer número introducido
                resultado = new Complejo(parOrdenado[0], parOrdenado[1]);
                datos.add(resultado);
            }
            // Limpiamos la entrada y actualizamos el historial
            if(isEqual) operador = '=';
            this.jTextField2.setText(this.jTextField2.getText() + "(" + this.Text.getText() 
                    + ") " + operador + " ");
            this.Text.setText("");
            ultimaOperacion = operador;
        }
        else {
            cadena = StringToReZImZ.validar(cadena);
            // Dado que la expresión es inválida mostramos el error en el label
            lblAlert.setText(cadena);
            // si no se puede efectuar la última operación
            ultimaOperacion = 'e';
        }  
    }
    
    private Complejo realizarOperacion(char op, Complejo resultado, Complejo complejo) {
          ArrayList<String> compl;
        if(op == '+') return Operacion.sumar(resultado, complejo);
        else if(op == '-') return Operacion.restar(resultado, complejo);
        else if(op == '*') return Operacion.multiplicar(resultado, complejo);
        else if(op == '/') return Operacion.dividir(resultado, complejo);
              else if(op == '^') {
              if(Text.getText().contains("/")) {
              String Exponentes[] = Text.getText().split("/");
                  int expNumerador = Integer.parseInt(Exponentes[0]); 
                  int expDenominador = Integer.parseInt(Exponentes[1]); 
                 resultado=Operacion.potenciar(resultado,expNumerador);
//                String[] stringArray = list.toArray(new String[0]); 
                  

              
                  compl = Operacion.sacarRaices(resultado, expDenominador);
                  String[] stringArray=compl.toArray(new String[0]);
                  
              }  
              else {
                      
                  return Operacion.potenciar(resultado,Integer.parseInt(Text.getText()));
              }
               return resultado;
        }
       
              else return resultado;
    }
    
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
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGUI().setVisible(true);
            }
        });
    }
    
    GraficarC grafica= new GraficarC();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Conjugado;
    private javax.swing.JButton Division;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Modulo;
    private javax.swing.JButton Multiplicacion;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Retroceso;
    private javax.swing.JButton Suma;
    private javax.swing.JTextField Text;
    private javax.swing.JComboBox<String> forma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblAlert;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JButton raices;
    // End of variables declaration//GEN-END:variables
}
