/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OdontoSysPantallaAuxiliares;

import OdontoSysControlador.DetalleOrdenControlador;
import OdontoSysControlador.OrdenServicioControlador;
import OdontoSysModelo.DetalleOrden;
import OdontoSysModelo.Odontograma;
import OdontoSysModelo.OrdenServicio;
import OdontoSysModelo.Paciente;
import OdontoSysModelo.Tratamiento;
import OdontoSysModelo.Usuario;
import OdontoSysPantalla.Facturas;
import OdontoSysPantalla.OdontogramaFrame;
import static java.awt.image.ImageObserver.WIDTH;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class OrdenDeServicio extends javax.swing.JFrame {

    /**
     * Creates new form OrdenDeServicio
     */
    public OrdenDeServicio() {
        initComponents();
        jButtonModificarPrecio.setVisible(false);
        
        if(ordenActual == null){        //Llamado desde el odontograma
            obtenerDatos();
            jTextFieldTotal.setText(String.valueOf(formateador.format(totales)));
        }
        else{                        //Llamado desde la factura o desde el buscador de orden
            jButtonGuardar.setVisible(false);
            setearOrden();
            jTextFieldTotal.setText(String.valueOf(formateador.format(totales)));
        }
        
        if(user.getRol().compareTo("Doctor") == 0){
            jButtonFacturar.setVisible(false);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jButtonVerOdontograma = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOrdenServicio = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldOdontograma = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonFacturar = new javax.swing.JButton();
        jLabelFecha = new javax.swing.JLabel();
        jButtonModificarPrecio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(662, 435));
        setMinimumSize(new java.awt.Dimension(662, 435));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Orden de Servicio");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Paciente");

        jTextFieldPaciente.setEditable(false);
        jTextFieldPaciente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Fecha");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Odontograma Cod");

        jTextFieldEstado.setEditable(false);
        jTextFieldEstado.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jButtonVerOdontograma.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButtonVerOdontograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesOdontosys/DienteSanos/diente.png"))); // NOI18N
        jButtonVerOdontograma.setText("Ver");
        jButtonVerOdontograma.setToolTipText("Ver el odontograma asociado");
        jButtonVerOdontograma.setMargin(new java.awt.Insets(2, 5, 2, 5));
        jButtonVerOdontograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerOdontogramaActionPerformed(evt);
            }
        });

        jTableOrdenServicio.setModel(tabla   );
        jTableOrdenServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOrdenServicioMouseClicked(evt);
            }
        });
        jTableOrdenServicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableOrdenServicioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTableOrdenServicioFocusLost(evt);
            }
        });
        jTableOrdenServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableOrdenServicioKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTableOrdenServicio);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Estado");

        jTextFieldOdontograma.setEditable(false);
        jTextFieldOdontograma.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Total");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jButtonCancelar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesOdontosys/DienteSanos/eliminar.png"))); // NOI18N
        jButtonCancelar.setText("Volver");
        jButtonCancelar.setActionCommand("");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonGuardar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesOdontosys/DienteSanos/guardar.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonFacturar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButtonFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesOdontosys/DienteSanos/dinero.png"))); // NOI18N
        jButtonFacturar.setText("Facturar");
        jButtonFacturar.setToolTipText("Crear la factura para esta orden");
        jButtonFacturar.setRolloverEnabled(false);
        jButtonFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFacturarActionPerformed(evt);
            }
        });

        jLabelFecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jButtonModificarPrecio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButtonModificarPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesOdontosys/DienteSanos/modificar.png"))); // NOI18N
        jButtonModificarPrecio.setToolTipText("Modificar precio de servicio");
        jButtonModificarPrecio.setMargin(new java.awt.Insets(2, 5, 2, 5));
        jButtonModificarPrecio.setRolloverEnabled(false);
        jButtonModificarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextFieldOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonVerOdontograma)
                                        .addGap(66, 66, 66)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(5, 5, 5)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonFacturar)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonModificarPrecio)))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonFacturar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jButtonVerOdontograma)
                        .addComponent(jTextFieldOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButtonModificarPrecio)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonGuardar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFacturarActionPerformed
        Facturas.ordenActual = ordenActual;
        Facturas.pacActual = ordenActual.getPaciente();
        Facturas jFrame = new Facturas();
        jFrame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonFacturarActionPerformed

    private void jTableOrdenServicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableOrdenServicioKeyTyped

    }//GEN-LAST:event_jTableOrdenServicioKeyTyped

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        ordenActual = new OrdenServicio();
        obtenerOrden();
        
        ordenActual = OrdenServicioControlador.insertOrdenServicio(ordenActual);
        detOrden = new ArrayList();
        detOrden = obtenerDetalleOrden();
        detOrden = DetalleOrdenControlador.insertDetalle(detOrden);
        if((detOrden != null) && (ordenActual.getIdordenServicio().intValue() > 0)){
            JOptionPane.showMessageDialog(rootPane, "Orden de Servicio insertada correctamente", "Insertar Orden", WIDTH);
            ordenActual = null;
            pacActual = null;
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Orden de Servicio no se pudo insertar", "Insertar Orden", WIDTH);
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTableOrdenServicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableOrdenServicioFocusGained
        if(ordenActual == null){        //Llamado desde el odontograma, todavía sin guardar
            jButtonModificarPrecio.setVisible(true);
        }
    }//GEN-LAST:event_jTableOrdenServicioFocusGained

    private void jButtonModificarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarPrecioActionPerformed
            int n = jTableOrdenServicio.getSelectedRow();
            boolean bandera;
            do{
                try{
                    int nro = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese monto pagado", "Monto", JOptionPane.QUESTION_MESSAGE));
                    jTableOrdenServicio.setValueAt(formateador.format(nro), n, 2);
                    aux.set(n, nro);
                    int total = 0;
                    for(Object i : aux){
                        total = Integer.parseInt(i.toString()) + total;
                    }
                    jTextFieldTotal.setText(formateador.format(total));
                    totales = total;
                    bandera = true;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Sólo se permiten números" , "Monto" , JOptionPane.QUESTION_MESSAGE );
                    bandera = false;
                }
            }while(!bandera);
            
    }//GEN-LAST:event_jButtonModificarPrecioActionPerformed

    private void jTableOrdenServicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableOrdenServicioFocusLost
        jButtonModificarPrecio.setVisible(false);
    }//GEN-LAST:event_jTableOrdenServicioFocusLost

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        jButtonModificarPrecio.setVisible(false);
    }//GEN-LAST:event_formMouseClicked

    private void jTableOrdenServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOrdenServicioMouseClicked
        if(ordenActual == null){
            int fila = jTableOrdenServicio.rowAtPoint(evt.getPoint());
            if (fila > -1){
                jButtonModificarPrecio.setVisible(true);
            }
        }
    }//GEN-LAST:event_jTableOrdenServicioMouseClicked

    private void jButtonVerOdontogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerOdontogramaActionPerformed
        OdontogramaFrame.odon = odonActual;
        OdontogramaFrame.elPaciente = pacActual;
        OdontogramaFrame.elUsuario = user;
        OdontogramaFrame.main(null);
    }//GEN-LAST:event_jButtonVerOdontogramaActionPerformed

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
            java.util.logging.Logger.getLogger(OrdenDeServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenDeServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenDeServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenDeServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdenDeServicio().setVisible(true);
            }
        });
    }
    //Variables
    public static ArrayList<Tratamiento> listDetalles = null;                  //Debe recibir del odontograma padre
    public static Paciente pacActual;                                  //Debe recibir del odontograma padre
    public static Odontograma odonActual;                              //Debe recibir del odontograma padre
    public static OrdenServicio ordenActual = null;
    int totales = 0;
    public static Usuario user = null;                                  //Debe recibir del odontograma padre
    ArrayList<DetalleOrden> detOrden = null;
    DefaultTableModel tabla = new DefaultTableModel(){
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    DecimalFormat formateador = new DecimalFormat("###,###");
    ArrayList aux = new ArrayList();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonFacturar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonModificarPrecio;
    private javax.swing.JButton jButtonVerOdontograma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOrdenServicio;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldOdontograma;
    private javax.swing.JTextField jTextFieldPaciente;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables

    private void obtenerDatos() {
        String pac = pacActual.getNombres() +" "+ pacActual.getApellidos();
        jTextFieldPaciente.setText(pac);
        
        jTextFieldOdontograma.setText(odonActual.getIdodontograma().toString());
        
        Date fecha = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String fec = f.format(fecha);
        jLabelFecha.setText(fec);
        
        jTextFieldEstado.setText("Pendiente");  
        jTextFieldEstado.setEditable(false);
        
        mostrarTabla();
        
        
    }

    private void mostrarTabla() {
        tabla.addColumn("Cod Servicio");
        tabla.addColumn("Descripción");
        tabla.addColumn("Precio");
        
        totales = 0;
                
        for(Tratamiento o : listDetalles){
            Object[] rowData = new Object[3];
            rowData[0] = String.valueOf(o.getServicio().getIdservicio());
            rowData[1] = o.getServicio().getDescripcion();
            rowData[2] = o.getServicio().getPrecio();
            aux.add(o.getServicio().getPrecio());               //Se guardan los precios actuales, se utilizará en 
                                                                //caso de que se cambie el precio            
            totales = Integer.parseInt(rowData[2].toString()) + totales;
            
            tabla.addRow(new Object[]{rowData[0], rowData[1], formateador.format(rowData[2])});
        }       
        jTableOrdenServicio.setModel(tabla);
    }

    
    private void obtenerOrden() {
        ordenActual.setEstado(jTextFieldEstado.getText());
        ordenActual.setFecha(new Date());
        ordenActual.setOdontograma(odonActual);
        ordenActual.setPaciente(pacActual);
    }

    private ArrayList<DetalleOrden> obtenerDetalleOrden() {
        ArrayList<DetalleOrden> nuevaLista = new ArrayList();
        
        for(int x=0;x<jTableOrdenServicio.getRowCount();x++){
            DetalleOrden det = new DetalleOrden();
            det.setOrdenServicio(ordenActual);
            det.setPrecio(Integer.parseInt(aux.get(x).toString()));
            det.setServicio(listDetalles.get(x).getServicio());
            nuevaLista.add(det);
        }
        return nuevaLista;
    }

    private void setearOrden() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = f.format(ordenActual.getFecha());
        jLabelFecha.setText(fecha);
        jTextFieldPaciente.setText(ordenActual.getPaciente().getNombres()+" "+ordenActual.getPaciente().getApellidos());
        jTextFieldOdontograma.setText(ordenActual.getOdontograma().getIdodontograma().toString());
        jTextFieldEstado.setText(ordenActual.getEstado());
        
        ArrayList<DetalleOrden> detalles = new ArrayList();
        detalles = OrdenServicioControlador.BuscarDetalleOrden(ordenActual.getIdordenServicio());
        
        tabla.addColumn("Cod Servicio");
        tabla.addColumn("Descripción");
        tabla.addColumn("Precio");
        for(DetalleOrden d : detalles){            
            Object[] rowData = new Object[3];
            rowData[0] = d.getServicio().getIdservicio();
            rowData[1] = d.getServicio().getDescripcion();
            rowData[2] = d.getPrecio();
            
            totales = d.getPrecio() + totales;
            
            tabla.addRow(rowData);
            jTableOrdenServicio.setValueAt(formateador.format(d.getPrecio()), tabla.getRowCount()-1, 2);
        }       
        jTableOrdenServicio.setEnabled(false);
    }
}
