/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa_1;

/**
 *
 * @author jason
 */
public class Usuario_Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Usuario_Administrador
     */
    public Usuario_Administrador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tb_Usuario_Administrador = new javax.swing.JTabbedPane();
        panel1 = new java.awt.Panel();
        jl_Titulo_Libro = new javax.swing.JLabel();
        jl_Descripcion = new javax.swing.JLabel();
        jl_Copias_Disponibles = new javax.swing.JLabel();
        jl_Genero = new javax.swing.JLabel();
        jl_Valor = new javax.swing.JLabel();
        jl_Edicion = new javax.swing.JLabel();
        jl_Autor = new javax.swing.JLabel();
        jl_Publicacion = new javax.swing.JLabel();
        tf_Titulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Descripcion = new javax.swing.JTextArea();
        tf_Copias_Disponibles = new javax.swing.JTextField();
        tf_Genero = new javax.swing.JTextField();
        tf_Valor = new javax.swing.JTextField();
        tf_Edicion = new javax.swing.JTextField();
        tf_Autor = new javax.swing.JTextField();
        jd_Publicacion = new com.toedter.calendar.JDateChooser();
        bt_Agregar = new javax.swing.JButton();
        jl_Puntaje = new javax.swing.JLabel();
        tf_Puntaje = new javax.swing.JTextField();
        panel2 = new java.awt.Panel();
        panel3 = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuario Administrador");

        jl_Titulo_Libro.setText("Titulo");

        jl_Descripcion.setText("Descripcion");

        jl_Copias_Disponibles.setText("Copias Disponibles");

        jl_Genero.setText("Genero");

        jl_Valor.setText("Valor");

        jl_Edicion.setText("Edicion");

        jl_Autor.setText("Autor");

        jl_Publicacion.setText("Año de Publicacion");

        ta_Descripcion.setColumns(20);
        ta_Descripcion.setRows(5);
        jScrollPane1.setViewportView(ta_Descripcion);

        bt_Agregar.setText("Agregar");
        bt_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AgregarMouseClicked(evt);
            }
        });

        jl_Puntaje.setText("Puntaje");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jl_Copias_Disponibles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Copias_Disponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jl_Genero)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jl_Valor)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jl_Edicion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Edicion, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addComponent(jl_Puntaje)
                                .addGap(18, 18, 18)
                                .addComponent(tf_Puntaje))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addComponent(jl_Titulo_Libro)
                                .addGap(18, 18, 18)
                                .addComponent(tf_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addComponent(jl_Autor)
                                .addGap(18, 18, 18)
                                .addComponent(tf_Autor))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addComponent(jl_Publicacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jd_Publicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addComponent(jl_Descripcion)
                                .addGap(46, 46, 46)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(181, 181, 181)
                        .addComponent(bt_Agregar)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_Agregar))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Titulo_Libro)
                            .addComponent(tf_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Descripcion)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Puntaje)
                            .addComponent(tf_Puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Copias_Disponibles)
                            .addComponent(tf_Copias_Disponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Genero)
                            .addComponent(tf_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Valor)
                            .addComponent(tf_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Edicion)
                            .addComponent(tf_Edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Publicacion)
                            .addComponent(jd_Publicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41))
        );

        tb_Usuario_Administrador.addTab("Agregar Libro", panel1);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        tb_Usuario_Administrador.addTab("Modificar Libro", panel2);

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        tb_Usuario_Administrador.addTab("Eliminar Libro", panel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_Usuario_Administrador)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_Usuario_Administrador)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AgregarMouseClicked
        // TODO add your handling code here:
        Libros l = new Libros(tf_Titulo.getText(), ta_Descripcion.getText(), Integer.parseInt(tf_Puntaje.getText()), Integer.parseInt(tf_Copias_Disponibles.getText()), tf_Genero.getText(), Integer.parseInt(tf_Valor.getText()), tf_Edicion.getText(), tf_Autor.getText(), jd_Publicacion.getDate());
    }//GEN-LAST:event_bt_AgregarMouseClicked

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
            java.util.logging.Logger.getLogger(Usuario_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario_Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Agregar;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jd_Publicacion;
    private javax.swing.JLabel jl_Autor;
    private javax.swing.JLabel jl_Copias_Disponibles;
    private javax.swing.JLabel jl_Descripcion;
    private javax.swing.JLabel jl_Edicion;
    private javax.swing.JLabel jl_Genero;
    private javax.swing.JLabel jl_Publicacion;
    private javax.swing.JLabel jl_Puntaje;
    private javax.swing.JLabel jl_Titulo_Libro;
    private javax.swing.JLabel jl_Valor;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private javax.swing.JTextArea ta_Descripcion;
    private javax.swing.JTabbedPane tb_Usuario_Administrador;
    private javax.swing.JTextField tf_Autor;
    private javax.swing.JTextField tf_Copias_Disponibles;
    private javax.swing.JTextField tf_Edicion;
    private javax.swing.JTextField tf_Genero;
    private javax.swing.JTextField tf_Puntaje;
    private javax.swing.JTextField tf_Titulo;
    private javax.swing.JTextField tf_Valor;
    // End of variables declaration//GEN-END:variables
}
