package complejos;


import general.MenuPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Carlos
 */
public class CalculadoraGUI extends javax.swing.JFrame {
    private Complejo resultado;
    private ArrayList<Complejo> datos;
    // Entrada actualizada es auxilar para no operar no perder el valor de entrada
    // cuando está es trigonométrica o exponencial
    private String forma, entradaActualizada;
    private char operacionActual;

    public CalculadoraGUI() {
        initComponents();
        datos = new ArrayList<Complejo>();
        this.setTitle("Calculadora de números complejos");
        lblAlert.setText("");
        forma = (String)cmbForma.getSelectedItem();
        operacionActual = 'n'; // n de ninguna
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = grafica.obtenerGrafica();
        jPanel2 = new javax.swing.JPanel();
        entrada = new javax.swing.JTextField();
        historial = new javax.swing.JTextField();
        btnResta = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnConjugado = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        btnSuma = new javax.swing.JButton();
        btnReturnMain = new javax.swing.JButton();
        cmbForma = new javax.swing.JComboBox<>();
        btnRoots = new javax.swing.JButton();
        lblAlert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        entrada.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });

        historial.setEditable(false);
        historial.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        historial.setEnabled(false);
        historial.setFocusable(false);
        historial.setOpaque(false);

        btnResta.setBackground(new java.awt.Color(51, 51, 51));
        btnResta.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnResta.setForeground(new java.awt.Color(255, 255, 255));
        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnExp.setBackground(new java.awt.Color(51, 51, 51));
        btnExp.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnExp.setForeground(new java.awt.Color(255, 255, 255));
        btnExp.setText("^");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnMulti.setBackground(new java.awt.Color(51, 51, 51));
        btnMulti.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnMulti.setForeground(new java.awt.Color(255, 255, 255));
        btnMulti.setText("X");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnDiv.setBackground(new java.awt.Color(51, 51, 51));
        btnDiv.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnDiv.setForeground(new java.awt.Color(255, 255, 255));
        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnConjugado.setBackground(new java.awt.Color(51, 51, 51));
        btnConjugado.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnConjugado.setForeground(new java.awt.Color(255, 255, 255));
        btnConjugado.setText("Z'");
        btnConjugado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConjugadoActionPerformed(evt);
            }
        });

        btnMod.setBackground(new java.awt.Color(51, 51, 51));
        btnMod.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnMod.setForeground(new java.awt.Color(255, 255, 255));
        btnMod.setText("|Z|");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(51, 51, 51));
        btnIgual.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(51, 51, 51));
        btnBorrar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnGraficar.setBackground(new java.awt.Color(51, 51, 51));
        btnGraficar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnGraficar.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        lblMessage.setForeground(new java.awt.Color(244, 7, 7));

        btnSuma.setBackground(new java.awt.Color(51, 51, 51));
        btnSuma.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(255, 255, 255));
        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnReturnMain.setBackground(new java.awt.Color(51, 51, 51));
        btnReturnMain.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnReturnMain.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnMain.setText("Ir a menú");
        btnReturnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnMainActionPerformed(evt);
            }
        });

        cmbForma.setBackground(new java.awt.Color(51, 51, 51));
        cmbForma.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        cmbForma.setForeground(new java.awt.Color(255, 255, 255));
        cmbForma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Algebraica", "Trigonométrica", "Exponencial" }));
        cmbForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFormaActionPerformed(evt);
            }
        });

        btnRoots.setBackground(new java.awt.Color(51, 51, 51));
        btnRoots.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRoots.setForeground(new java.awt.Color(255, 255, 255));
        btnRoots.setText("(z)^1/n");
        btnRoots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRootsActionPerformed(evt);
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
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAlert)
                                    .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(historial, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnConjugado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnRoots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbForma, 0, 0, Short.MAX_VALUE)
                                                .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(23, 23, 23)
                        .addComponent(lblMessage))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnReturnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lblMessage))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(historial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAlert)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRoots, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnConjugado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBorrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGraficar))
                            .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReturnMain)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*Grafica solo elemento que está en la entrada siempre y cuando este sea válido*/
    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        historial.setText("");
        if(evaluador()) {
            StringToReZImZ Separar = new StringToReZImZ();
            Separar.Separar(entradaActualizada);
            // System.out.println("Parte real: " + Separar.getReZ() + "\n" 
                    // + "Parte imaginaria: " + Separar.getImZ());
            grafica.agregarGrafica(entrada.getText(),Separar.getReZ(),Separar.getImZ());
        }
    }//GEN-LAST:event_btnGraficarActionPerformed
    /* Botón de borrar: Limpia los jTextField (entrada e historial), además
    limpia el arreglo de datos y no grafica nada */
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        entrada.setText("");
        historial.setText("");
        // Para quitar el texto de error previo si existe
        if(!lblAlert.getText().isEmpty()) lblAlert.setText("");
        datos.clear();
        grafica.BorrarGrafica();
    }//GEN-LAST:event_btnBorrarActionPerformed

    // => BOTÓN IGUAL
    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        Complejo complejo;
        boolean bandera = false;
        
        if(operacionActual == '^' && validarEntero(entrada.getText())) {
            resultado = Operacion.potenciar(resultado, Integer.parseInt(entrada.getText()));
            this.historial.setText(this.historial.getText() + entrada.getText());
            entradaActualizada = Operacion.mostrarNumero(resultado);
            this.entrada.setText(obtenerStringForma());
            bandera = true;
        }
        else {
            prepararOperacion(operacionActual);
            if(operacionActual != 'n' && operacionActual != '^') {
                if(forma == "Trigonométrica")
                    this.entrada.setText(Operacion.mostrarFormaTrigonometrica(resultado));
                else if(forma == "Exponencial")
                    this.entrada.setText(Operacion.mostrarFormaExponencial(resultado));
                else this.entrada.setText(Operacion.mostrarNumero(resultado));
                bandera = true;
            }
        }
        
        if(bandera) {
            datos.add(resultado);
            resultado = null;
            operacionActual = 'n';

            for(Complejo e:datos) {
                grafica.agregarGrafica(Operacion.mostrarNumero(e),e.getParteReal(),
                e.getParteImaginaria());
            }
        }
        
    }//GEN-LAST:event_btnIgualActionPerformed

    // => MÓDULO, se obtiene |z| de la entrada
    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        if(evaluador()) {
            float[] parOrdenado = new float[2];
            StringToReZImZ separacion = new StringToReZImZ();
            parOrdenado = separacion.Separar(entradaActualizada);
            Complejo c = new Complejo(parOrdenado[0], parOrdenado[1]);
            historial.setText("Módulo |Z| = " + c.getModulo());
        }
    }//GEN-LAST:event_btnModActionPerformed

    // Obtener el conjugado
    private void btnConjugadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConjugadoActionPerformed
        historial.setText("");
        if(evaluador()) {
            float[] parOrdenado = new float[2];
            StringToReZImZ separacion = new StringToReZImZ();
            parOrdenado = separacion.Separar(entradaActualizada);
            Complejo c = new Complejo(parOrdenado[0], parOrdenado[1]);
            c = Complejo.conjugar(c);
            //System.out.println("Radio es: " + c.getModulo());
            String resultado;
            if(forma == "Trigonométrica") 
                resultado = Operacion.mostrarFormaTrigonometrica(c);
            else if(forma == "Exponencial")
                resultado = Operacion.mostrarFormaExponencial(c);
            else resultado = Operacion.mostrarNumero(c);
            historial.setText("Ans: " + resultado);
        }
    }//GEN-LAST:event_btnConjugadoActionPerformed

     // => DIVISIÓN
    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        operacionActual = '/';
        prepararOperacion('/');
    }//GEN-LAST:event_btnDivActionPerformed

    // => MULTIPLICACIÓN
    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        operacionActual = '*';
        prepararOperacion('*');
    }//GEN-LAST:event_btnMultiActionPerformed

    // => POTENCIA
    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        if(operacionActual == 'n') {
            historial.setText("");
            operacionActual = '^';
            prepararOperacion('^');
        }
    }//GEN-LAST:event_btnExpActionPerformed
    
    // => RESTAR
    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        operacionActual = '-';
        prepararOperacion('-');
    }//GEN-LAST:event_btnRestaActionPerformed

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed
        
    }//GEN-LAST:event_entradaActionPerformed

    private void btnReturnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnMainActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnMainActionPerformed

    
    /* Cambia el valor de forma (nos servirá para saber con que se está trabajando)
    dependiendo del valor que seleccione el usuario. */
    // Automáticamente hace la conversión a la nueva forma seleccionada
    private void cmbFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFormaActionPerformed
        String formaAnterior = forma;
        forma = (String)cmbForma.getSelectedItem();
        
        if(this.entrada.getText() == "") return;
        entradaActualizada = this.entrada.getText();
        
        // Para quitar el texto de error previo si existe
        if(!lblAlert.getText().isEmpty()) lblAlert.setText("");
        
        if(formaAnterior == "Trigonométrica") 
            entradaActualizada = Convertidor.deTrigonometricaAAlgebraica(entradaActualizada);
        else if(formaAnterior == "Exponencial") {
            entradaActualizada = Convertidor.deExponencialAAlgebraica(entradaActualizada);
        }
        
        //Se valida en la forma algebraica
        entradaActualizada = StringToReZImZ.validar(entradaActualizada);
        
        if(entradaActualizada.contains("Error")) {
            lblAlert.setText(entradaActualizada);
            return;
        }
        
        float[] parOrdenado = new float[2];
        StringToReZImZ separacion = new StringToReZImZ();
        parOrdenado = separacion.Separar(entradaActualizada);
        Complejo c = new Complejo(parOrdenado[0], parOrdenado[1]);
        
        if(forma == "Algebraica") {
            this.entrada.setText(Operacion.mostrarNumero(c));
        }
        else if(forma == "Trigonométrica") {
            this.entrada.setText(Operacion.mostrarFormaTrigonometrica(c));
        }
        else if(forma == "Exponencial") {
            this.entrada.setText(Operacion.mostrarFormaExponencial(c));
        }
    }//GEN-LAST:event_cmbFormaActionPerformed

    
    // => RAÍCES
    private void btnRootsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRootsActionPerformed
        if(evaluador()) {
            historial.setText("");
            DialogRaiz r = new DialogRaiz(this, true, entradaActualizada, this);
            r.setLocationRelativeTo(this);
            r.setVisible(true);
        }
    }//GEN-LAST:event_btnRootsActionPerformed

    // => SUMA
    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        operacionActual = '+';
        prepararOperacion('+');
    }//GEN-LAST:event_btnSumaActionPerformed

    // Esta función retorna verdadero si el número complejo introducido es genuino
    private boolean evaluador() {
        boolean respuesta = true;
        entradaActualizada = this.entrada.getText();
        
        if(entradaActualizada == "") return false;
        
        // Para quitar el texto de error previo si existe
        if(!lblAlert.getText().isEmpty()) lblAlert.setText("");
        
        if(forma == "Trigonométrica") 
            entradaActualizada = Convertidor.deTrigonometricaAAlgebraica(entradaActualizada);
        else if(forma == "Exponencial") {
            entradaActualizada = Convertidor.deExponencialAAlgebraica(entradaActualizada);
        }
        
        entradaActualizada = StringToReZImZ.validar(entradaActualizada);
        
        if(entradaActualizada.contains("Error")) {
            lblAlert.setText(entradaActualizada);
            respuesta = false;
        }

        return respuesta;
    }
    
    private void prepararOperacion(char operador) {
        
        if(evaluador()) { // La entrada es válida
            StringToReZImZ separador = new StringToReZImZ();
            //En el evaluador se define entrada actualizada como un string
            // del complejo en la forma algebraica.
            
            // Separamos dicho String
            System.out.println("Entrada actualizada: " + entradaActualizada);
            float[] parOrdenado = separador.Separar(entradaActualizada);
            
            // dos números afectados por una operación
            if(!this.historial.getText().isEmpty() && resultado != null) {
                Complejo complejo = new Complejo(parOrdenado[0], parOrdenado[1]);
                datos.add(complejo);
                resultado = realizarOperacion(operador, resultado, complejo);
            }
            else { // es el primer número introducido
                resultado = new Complejo(parOrdenado[0], parOrdenado[1]);
                datos.add(resultado);
                historial.setText("");
            }
            
            // Limpiamos la entrada y actualizamos el historial
            if(operador != '=') {
                if(operador == 'n') operador = ' ';
                this.historial.setText(this.historial.getText() + "(" + 
                this.entrada.getText() + ") " + operador + " ");
                this.entrada.setText("");
            }
        } 
    }
    
    // Llamado a los métodos para resolver las operaciones básicas
    private Complejo realizarOperacion(char operador, Complejo resultado, Complejo complejo) {
        if(operador == '+') return Operacion.sumar(resultado, complejo);
        else if(operador == '-') return Operacion.restar(resultado, complejo);
        else if(operador == '*') return Operacion.multiplicar(resultado, complejo);
        else return Operacion.dividir(resultado, complejo);
    }
    
    private boolean validarEntero(String cadena) {
	try {
            Integer.parseInt(cadena);
            return true;
	} catch (NumberFormatException nfe){
            return false;
	}
    }
    
    private String obtenerStringForma() {
        String representacion;
        if(forma == "Trigonométrica") 
            representacion = Convertidor.deTrigonometricaAAlgebraica(entradaActualizada);
        else if(forma == "Exponencial")
            representacion = Convertidor.deExponencialAAlgebraica(entradaActualizada);
        else representacion = entradaActualizada;
        
        return representacion;
    }
    
    public void graficarRaices(ArrayList<Complejo> raices) {
        datos.clear();
        datos = raices;
        resultado = null;
        operacionActual = 'n';

        for(Complejo e:datos) {
            grafica.agregarGrafica(Operacion.mostrarFormaExponencial(e),e.getParteReal(),
            e.getParteImaginaria());
        }
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
    
    GraficarC grafica = new GraficarC();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConjugado;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnReturnMain;
    private javax.swing.JButton btnRoots;
    private javax.swing.JButton btnSuma;
    private javax.swing.JComboBox<String> cmbForma;
    private javax.swing.JTextField entrada;
    private javax.swing.JTextField historial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAlert;
    private javax.swing.JLabel lblMessage;
    // End of variables declaration//GEN-END:variables
}
