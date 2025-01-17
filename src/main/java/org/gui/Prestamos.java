/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.gui;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import org.clases.Biblioteca;
import org.clases.EstadoCuenta;
import static org.clases.EstadoCuenta.*;
import org.clases.Libro;
import org.clases.LibroDigital;
import org.clases.LibroFisico;
import org.clases.Miembro;
import org.clases.Prestamo;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Keloc
 */
public class Prestamos extends javax.swing.JPanel {

    /**
     * Creates new form Prestamos
     */
    private Biblioteca biblio;
    private String fecha;
    private LocalDate now = LocalDate.now();

    public Biblioteca getBiblio() {
        return biblio;
    }

    public void setBiblio(Biblioteca biblio) {
        this.biblio = biblio;
    }
    public Prestamos() {
        initComponents();
        setDate();
    }

    private void setDate(){
        LocalDate nw = now.plusWeeks(1);
        Locale spanishLocale = new Locale("es", "ES");
        setFecha(nw.format(DateTimeFormatter.ofPattern("dd'/'MMMM'/'yyyy", spanishLocale)));
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prestamosIP = new javax.swing.JPanel();
        prestamosTextL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        prestamosTextL1 = new javax.swing.JLabel();
        prestamosTextL2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        libro = new javax.swing.JTextField();
        prestar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(611, 362));

        prestamosIP.setBackground(new java.awt.Color(255, 255, 255));
        prestamosIP.setMinimumSize(new java.awt.Dimension(611, 362));
        prestamosIP.setPreferredSize(new java.awt.Dimension(611, 362));

        prestamosTextL.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        prestamosTextL.setText("Préstamo de libro");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devolucion2.jpg"))); // NOI18N

        prestamosTextL1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prestamosTextL1.setText("ID de usuario");

        prestamosTextL2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prestamosTextL2.setText("ISBN del libro:");

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libroActionPerformed(evt);
            }
        });

        prestar.setBackground(new java.awt.Color(51, 51, 255));
        prestar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prestar.setForeground(new java.awt.Color(255, 255, 255));
        prestar.setText("Prestar");
        prestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout prestamosIPLayout = new javax.swing.GroupLayout(prestamosIP);
        prestamosIP.setLayout(prestamosIPLayout);
        prestamosIPLayout.setHorizontalGroup(
            prestamosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prestamosIPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(prestamosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prestamosIPLayout.createSequentialGroup()
                        .addComponent(prestamosTextL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(337, 337, 337))
                    .addGroup(prestamosIPLayout.createSequentialGroup()
                        .addGroup(prestamosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prestamosTextL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(prestamosIPLayout.createSequentialGroup()
                                .addGroup(prestamosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(libro)
                                    .addComponent(usuario)
                                    .addComponent(prestamosTextL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)))
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(61, 61, 61))
        );
        prestamosIPLayout.setVerticalGroup(
            prestamosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prestamosIPLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(prestamosTextL)
                .addGap(6, 6, 6)
                .addGroup(prestamosIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prestamosIPLayout.createSequentialGroup()
                        .addComponent(prestamosTextL1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(prestamosTextL2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(libro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(prestar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(prestamosIPLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prestamosIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(prestamosIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_libroActionPerformed

    private void prestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestarActionPerformed
        String IDlibro = libro.getText();
        String IDusuario = usuario.getText();
        int indexLibro=-1;
        int indexMiembro=-1;
        
        try {
            if(libro.getText().isEmpty()||usuario.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        }else{
            if(usuario.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Por favor ingrese su ID de usuario, si aún no tiene uno, favor de generarlo en la pestaña 'Usuarios'");
            }else{
                String usuarioActual="";
                //buscar usuario por ID
                for(int i=0;i<biblio.getMiembroLista().tamanio(); i++){
                    System.out.println("Id en la lista: "+biblio.getMiembroLista().Obtener(i).getID());
                    System.out.println("Id ingreaado: "+IDusuario);
                    String m = "";
                    if(IDusuario.equals(biblio.getMiembroLista().Obtener(i).getID())){
                        usuarioActual=IDusuario;
                        indexMiembro = i;
                    }
                }
                if(usuarioActual!=""){
                    String ISBNactual="";
                    
                //buscar libro por ISBN
                    for(int i=0;i<biblio.getCatalogo().getListaLibros().tamanio(); i++){
                        if(IDlibro.equals(biblio.getCatalogo().getListaLibros().Obtener(i).getISBN())){
                            ISBNactual=IDlibro;
                            indexLibro=i;
                        }
                    }
                    if(ISBNactual!=""){
                        File logsP = new File("src/main/java/org/persistencia/logsP.ser");
                        File prestamosActivos = new File("src/main/java/org/persistencia/prestamosActivos.ser");
                        FileOutputStream preActOut = new FileOutputStream(prestamosActivos);
                        ObjectOutputStream paOut = new ObjectOutputStream(preActOut);
                        FileOutputStream lOut= new FileOutputStream(logsP);
                        ObjectOutputStream logsOut = new ObjectOutputStream(lOut);
                        if(biblio.getCatalogo().getListaLibros().Obtener(indexLibro) instanceof LibroFisico){
                            //verificar disponibilidad
                            LibroFisico libro = (LibroFisico) biblio.getCatalogo().getListaLibros().Obtener(indexLibro);
                            Miembro miembro = biblio.getMiembroLista().Obtener(indexMiembro);
                            if(libro.getCantidad()>0){
                                //hacer prestamo libro fisico
                                if (miembro.getEstado().equals(ACTIVA)){
                                    File logs = new File("src/main/java/org/persistencia/logs.txt");
                                    FileWriter fw = new FileWriter(logs, true);
                                    PrintWriter pw = new PrintWriter(fw, true);
                                    libro.setCantidad(libro.getCantidad()-1);
                                    Prestamo p = new Prestamo(libro,fecha, miembro);
                                    p.setDate(now);
                                    miembro.getPrestamosActivos().Agregar(p);
                                    miembro.getHistorialPrestamos().Agregar(p);
                                    biblio.getOperaciones().Agregar(p);
                                    biblio.getActivos().Agregar(p);
                                    pw.print(p.mostrar()+"\n");
                                    logsOut.writeObject(biblio.getOperaciones());
                                    paOut.writeObject(biblio.getActivos());
                                    JOptionPane.showMessageDialog(null, "¡Prestamo realizado satisfactoriamente!");
                                } else if(miembro.getEstado().equals(CONGELADA)){
                                    JOptionPane.showMessageDialog(null, "La cuenta esta congelada, por favor realizar los pagos correspondientes para reactivarla");
                                } else {
                                    JOptionPane.showMessageDialog(null, "La cuenta ha sido cerrada y será eliminada proximamente, si se desea recuperarla se deberán realizar los pagos correspondientes y una cuota extra");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Libro no disponible :(");
                            }
                        }else{
                            //hacer préstamo libro digital
                            LibroDigital libro = (LibroDigital) biblio.getCatalogo().getListaLibros().Obtener(indexLibro);
                            Miembro miembro = biblio.getMiembroLista().Obtener(indexMiembro);
                            if (miembro.getEstado().equals(ACTIVA)){
                                File logs = new File("src/main/java/org/persistencia/logs.txt");
                                FileWriter fw = new FileWriter(logs, true);
                                PrintWriter pw = new PrintWriter(fw, true);
                                Prestamo p = new Prestamo(libro,fecha, miembro);
                                p.setDate(now);
                                miembro.getPrestamosActivos().Agregar(p);
                                miembro.getHistorialPrestamos().Agregar(p);
                                biblio.getOperaciones().Agregar(p);
                                biblio.getActivos().Agregar(p);
                                pw.print(p.mostrar()+"\n");
                                logsOut.writeObject(biblio.getOperaciones());
                                paOut.writeObject(biblio.getActivos());
                                JOptionPane.showMessageDialog(null, "¡Prestamo realizado satisfactoriamente!");
                            } else if(miembro.getEstado().equals(CONGELADA)){
                                JOptionPane.showMessageDialog(null, "La cuenta esta congelada, por favor realizar los pagos correspondientes para reactivarla");
                            } else {
                                JOptionPane.showMessageDialog(null, "La cuenta ha sido cerrada, si se desea recuperarla se deberán realizar los pagos correspondientes y una cuota extra");
                            }
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Libro no encontardo, verifique que ingresó el ISBN correctamente");

                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Usuario no encontardo, si aún no tiene ID, favor de generarlo en la pestaña 'Usuarios'");
                    //.
                    }
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_prestarActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField libro;
    private javax.swing.JPanel prestamosIP;
    private javax.swing.JLabel prestamosTextL;
    private javax.swing.JLabel prestamosTextL1;
    private javax.swing.JLabel prestamosTextL2;
    private javax.swing.JButton prestar;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
