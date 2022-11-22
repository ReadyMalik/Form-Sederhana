package com.ready.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JPanel rootPanel;
    private JTextField textNama;
    private JTextField textNIK;
    private JButton buttonSave;
    private JLabel labelHasil;

    public FormBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ambil data dari textNama
               String nama = textNama.getText();
               // Ambil data dari textNIK
               String nik = textNIK.getText();
               // Diproses
               Penduduk pdk = new Penduduk();
               pdk.setNama(nama);
               pdk.setNIK(nik);
               //menampilkan output ke FORM
                labelHasil.setText(pdk.toString());

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
