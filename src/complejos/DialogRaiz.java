package complejos;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author dabetm
 */
public class DialogRaiz extends javax.swing.JDialog {

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;
    private Complejo complejo;
    ArrayList<Complejo> raíces;
    private CalculadoraGUI controlador;
    
    public DialogRaiz(java.awt.Frame parent, boolean modal, String Complejo, 
            CalculadoraGUI padre) {
        super(parent, modal);
        this.setResizable(false);
        controlador = padre;
        initComponents();
        StringToReZImZ separador = new StringToReZImZ();
        float[] parOrdenado = new float[2];
        parOrdenado = separador.Separar(Complejo);
        this.jLblAlert.setText("");
        this.jLblAlert1.setText("");
        this.complejo = new Complejo(parOrdenado[0], parOrdenado[1]);
        this.lblComplejo.setText("( "+ Operacion.mostrarNumero(complejo) + " )"); 
        this.lblComplejoTrig.setText(Operacion.mostrarFormaTrigonometrica(complejo));
        this.lblComplejoExp.setText(Operacion.mostrarFormaExponencial(complejo));
        
        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        lblComplejo = new javax.swing.JLabel();
        jTxtNumerador = new javax.swing.JTextField();
        jTxtDenominador = new javax.swing.JTextField();
        btnCalc = new javax.swing.JButton();
        jLblAlert = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtArearesultados = new javax.swing.JTextArea();
        lblComplejoTrig = new javax.swing.JLabel();
        lblComplejoExp = new javax.swing.JLabel();
        jLblAlert1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        okButton.setText("Graficar");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cerrar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        lblComplejo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblComplejo.setText("jLabelComplex");

        jTxtNumerador.setText("1");
        jTxtNumerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumeradorActionPerformed(evt);
            }
        });

        jTxtDenominador.setText("n");

        btnCalc.setText("Calcular raíces");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jLblAlert.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLblAlert.setForeground(new java.awt.Color(220, 55, 55));
        jLblAlert.setText("jLblAlert");

        jTxtArearesultados.setColumns(17);
        jTxtArearesultados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTxtArearesultados.setForeground(new java.awt.Color(57, 205, 103));
        jTxtArearesultados.setRows(5);
        jScrollPane1.setViewportView(jTxtArearesultados);

        lblComplejoTrig.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblComplejoTrig.setText("jLabelComplex");

        lblComplejoExp.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblComplejoExp.setText("jLabelComplex");

        jLblAlert1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLblAlert1.setForeground(new java.awt.Color(220, 55, 55));
        jLblAlert1.setText("jLblAlert");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComplejo)
                    .addComponent(lblComplejoTrig)
                    .addComponent(lblComplejoExp)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(btnCalc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtDenominador, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtNumerador, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblAlert, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblAlert1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTxtNumerador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtDenominador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblAlert1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(jLblAlert)
                        .addGap(82, 82, 82)))
                .addComponent(lblComplejo)
                .addGap(18, 18, 18)
                .addComponent(lblComplejoTrig)
                .addGap(18, 18, 18)
                .addComponent(lblComplejoExp)
                .addGap(18, 18, 18)
                .addComponent(btnCalc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addGap(29, 29, 29))
        );

        getRootPane().setDefaultButton(okButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        controlador.graficarRaices(raíces);
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    // Calcular las raíces
    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        int numerador, denominador;
        
        jLblAlert.setText("");
        jLblAlert1.setText("");
        
        if(validarEntero(jTxtNumerador.getText())) {
            if(validarEntero(jTxtDenominador.getText())) {
                this.btnCalc.setEnabled(false); // deshabilitar el botón
                numerador = Integer.parseInt(jTxtNumerador.getText());
                denominador = Integer.parseInt(jTxtDenominador.getText());
                // Si el numerador es diferente de uno se aplica la potenciación
                if(numerador != 1) {
                    this.complejo = Operacion.potenciar(this.complejo, numerador);
                }
                //Ahora se procede a calcular las n-1 raíces
                raíces = Operacion.sacarRaices(this.complejo, 
                        denominador);
                // Los listamos el text area
                for(Complejo r: raíces) {
                    jTxtArearesultados.append(Operacion.mostrarFormaExponencial(r) + "\n");
                }
            }
            else {
                this.jLblAlert1.setText("<==");
            }
            
        }
        else {
            this.jLblAlert.setText("<==");
        }
    }//GEN-LAST:event_btnCalcActionPerformed

    private void jTxtNumeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumeradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNumeradorActionPerformed
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }
    
    private boolean validarEntero(String cadena) {
	try {
            return Integer.parseInt(cadena) > 0 ? true : false;
	} catch (NumberFormatException nfe){
            return false;
	}
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLblAlert;
    private javax.swing.JLabel jLblAlert1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTxtArearesultados;
    private javax.swing.JTextField jTxtDenominador;
    private javax.swing.JTextField jTxtNumerador;
    private javax.swing.JLabel lblComplejo;
    private javax.swing.JLabel lblComplejoExp;
    private javax.swing.JLabel lblComplejoTrig;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
