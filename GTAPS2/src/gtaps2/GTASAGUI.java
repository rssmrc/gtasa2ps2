/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtaps2;

/**
 *
 * @author Marco
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.commons.io.FileUtils;

public class GTASAGUI extends javax.swing.JFrame {

    private String gamedir;
    private boolean silent;
    private boolean skygfx;
    
    public GTASAGUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GTA:SA PC2PS2 (+ Silent Patch)");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setFocusable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/splash.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jTextField1.setFocusable(false);

        jButton1.setText("Open");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBox1.setText("Silent ASI Loader 1.3 + Silent Patch 1.1");

        jCheckBox2.setText("SkyGFX PS2 Atmosphere");

        jButton2.setText("Patch Game");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clean and Fix");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Silent API Loader + Silent Patch is developed by Silent and can be found at: http://www.gtagarage.com/mods/show.php?id=25368\nSkyGFX is developed by The Hero and can be found at: http://gtaforums.com/topic/750681-skygfx-ps2-graphics-for-pc/\n\nThis tool is developed by vegasss. This is just a simple way to install the essential modifications to get that nostalgic feeling of the old PS2 GTA:SA. I am not the author of the mods used in this tool.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jFileChooser1.showDialog(jPanel1, "Pick");
        if(jFileChooser1.getSelectedFile().getAbsolutePath().contains("sa.exe"))
        {
            //selected the right file
            jTextField1.setText(jFileChooser1.getSelectedFile().getAbsolutePath());
            //getting the directory path
            gamedir = jFileChooser1.getSelectedFile().getAbsolutePath().substring(0,jFileChooser1.getSelectedFile().getAbsolutePath().indexOf("gta"));
            
            jButton2.setEnabled(true);
        }
        else
        {
            //alert the user
            jTextField1.setText("Wrong file selected!");
            jButton2.setEnabled(false);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //check user preferences
        if(jCheckBox1.isSelected())
        {
            silent = true;
        }
        else
        {
            silent = false;
        }
        if(jCheckBox2.isSelected())
        {
            skygfx = true;
        }
        else
        {
            skygfx = false;
        }

        //backing up GTA:SA Files
        File bdir = new File(gamedir + "sa_backup");
        bdir.mkdir();
        
        File tmp = new File(gamedir + "gta-sa.exe");
        tmp.renameTo(new File(gamedir+"/sa_backup/gta-sa.exe"));
        tmp = new File(gamedir + "stream.ini");
        tmp.renameTo(new File(gamedir+"/sa_backup/stream.ini"));
        tmp = new File(gamedir + "vorbisFile.dll");
        tmp.renameTo(new File(gamedir+"/sa_backup/vorbisFile.dll"));
        
        //decompress data.zip with mods
        UnzipUtility zippr = new UnzipUtility();
        
        //if user just wants to install the full package
        if(skygfx == true && silent == true)
        {
            try
            {
                zippr.unzip("data.zip", gamedir);
            }
            catch(IOException e)
            {
                //exception handling
            }
        }
        else if(skygfx == true && silent == false)
        {
            bdir = new File(gamedir + "tmp");
            bdir.mkdir();
            
            try
            {
                zippr.unzip("data.zip", gamedir+"tmp");
            }
            catch(IOException e)
            {
                //exception handling
            }
            
            //move only skygfx files and clean up
            tmp = new File(gamedir + "tmp/stream.ini");
            tmp.renameTo(new File(gamedir+"stream.ini"));
            tmp = new File(gamedir + "tmp/skygfx.asi");
            tmp.renameTo(new File(gamedir+"skygfx.asi"));
            tmp = new File(gamedir + "tmp/skygfx1.ini");
            tmp.renameTo(new File(gamedir+"skygfx1.ini"));
            tmp = new File(gamedir + "tmp/skygfx2.ini");
            tmp.renameTo(new File(gamedir+"skygfx2.ini"));
            tmp = new File(gamedir + "tmp/skygfx3.ini");
            tmp.renameTo(new File(gamedir+"skygfx3.ini"));
            tmp = new File(gamedir + "tmp/gta-sa.exe");
            tmp.renameTo(new File(gamedir+"gta-sa.exe"));
            
            try
            {
                FileUtils.deleteDirectory(new File(gamedir + "tmp"));
            }
            catch(IOException e)
            {
                
            }
            
            
        }
        else
        {
            bdir = new File(gamedir + "tmp");
            bdir.mkdir();
            
            try
            {
                zippr.unzip("data.zip", gamedir+"tmp");
            }
            catch(IOException e)
            {
                //exception handling
            }
            
            //move only silent's files
            tmp = new File(gamedir + "tmp/SilentPatchSA.ini");
            tmp.renameTo(new File(gamedir+"SilentPatchSA.ini"));
            tmp = new File(gamedir + "tmp/SilentPatchSA.asi");
            tmp.renameTo(new File(gamedir+"SilentPatchSA.asi"));
            tmp = new File(gamedir + "tmp/vorbisFile.dll");
            tmp.renameTo(new File(gamedir+"vorbisFile.dll"));
            tmp = new File(gamedir + "tmp/vorbisHooked.dll");
            tmp.renameTo(new File(gamedir+"vorbisHooked.dll"));
            tmp = new File(gamedir + "tmp/gta-sa.exe");
            tmp.renameTo(new File(gamedir+"gta-sa.exe"));
            tmp = new File(gamedir + "tmp/script");
            tmp.renameTo(new File(gamedir+"script"));
            tmp = new File(gamedir + "tmp/advanced_plugin_management_example");
            tmp.renameTo(new File(gamedir+"advanced_plugin_management_example"));
            
            try
            {
                FileUtils.deleteDirectory(new File(gamedir + "tmp"));
            }
            catch(IOException e)
            {
                
            }
        }
        
        jOptionPane1.showMessageDialog(this, "Game patched!");
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //gotta clean up all the mess now
        //deleting tons of files
        if(new File(gamedir + "vorbisHooked.dll").exists())
        {
            File tmp = new File(gamedir + "gta-sa.exe");
            tmp.delete();
            tmp = new File(gamedir + "vorbisHooked.dll");
            tmp.delete();
            tmp = new File(gamedir + "vorbisFile.dll");
            tmp.delete();
            tmp = new File(gamedir + "SilentPatchSA.asi");
            tmp.delete();
            tmp = new File(gamedir + "SilentPatchSA.ini");
            tmp.delete();
            tmp = new File(gamedir + "SilentPatchSA.ini");
            tmp.delete();
            try
            {
                FileUtils.deleteDirectory(new File(gamedir + "scripts"));
                FileUtils.deleteDirectory(new File(gamedir + "advanced_plugin_management_example"));
            }
            catch(IOException e)
            {
                
            }
        }
        if(new File(gamedir + "skygfx.asi").exists())
        {
            File tmp = new File(gamedir + "skygfx.asi");
            tmp.delete();
            tmp = new File(gamedir + "skygfx1.ini");
            tmp.delete();
            tmp = new File(gamedir + "skygfx2.ini");
            tmp.delete();
            tmp = new File(gamedir + "skygfx3.ini");
            tmp.delete();
            tmp = new File(gamedir + "stream.ini");
            tmp.delete();
        }
        //recovering original files
        if(new File(gamedir + "sa_backup/gta-sa.exe").exists())
        {
            File tmp = new File(gamedir + "sa_backup/gta-sa.exe");
            tmp.renameTo(new File(gamedir+"gta-sa.exe"));
            tmp = new File(gamedir + "sa_backup/vorbisFile.dll");
            tmp.renameTo(new File(gamedir+"vorbisFile.dll"));
            tmp = new File(gamedir + "sa_backup/stream.ini");
            tmp.renameTo(new File(gamedir+"stream.ini"));
            try
            {
                FileUtils.deleteDirectory(new File(gamedir + "sa_backup"));
                
            }
            catch(IOException e)
            {
                
            }
        }
        
        jOptionPane1.showMessageDialog(this, "GTA:SA Directory is now vanilla clean!");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GTASAGUI().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
