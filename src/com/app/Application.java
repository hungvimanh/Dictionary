/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import com.object.Word;
import api.text.speech.google.Speak;
import api.google.translate.EnglishVietnamese;
import database.AcessDatabase;
import database.ExecuteDatabase;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Hung Vi Manh
 */
public class Application extends JFrame {

    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 600;
    private final ImageIcon img = new ImageIcon("image/icon.png");

    public static ArrayList<Word> words = new ArrayList<>();
    public ExecuteDatabase executeDatabase = new ExecuteDatabase();
    public Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    public Toolkit toolkit = this.getToolkit();
    public Dimension dimension = toolkit.getScreenSize();

    public Application() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jp_Search = new javax.swing.JPanel();
        bt_search = new javax.swing.JButton();
        tf_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_search = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_search = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_return1 = new javax.swing.JButton();
        bt_add = new javax.swing.JButton();
        bt_change = new javax.swing.JButton();
        bt_del = new javax.swing.JButton();
        bt_speak = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jp_Text = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bt_trans = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_text_output = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_text_input = new javax.swing.JTextArea();
        return2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jp_add = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_add = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta_add = new javax.swing.JTextArea();
        bt_added = new javax.swing.JButton();
        bt_add_clear1 = new javax.swing.JButton();
        bt_add_clear2 = new javax.swing.JButton();
        return3 = new javax.swing.JButton();
        jp_change = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_change = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        ta_change = new javax.swing.JTextArea();
        bt_save_change = new javax.swing.JButton();
        bt_change_clear = new javax.swing.JButton();
        bt_change_clear1 = new javax.swing.JButton();
        return4 = new javax.swing.JButton();
        popup_list = new javax.swing.JPopupMenu();
        list_copy = new javax.swing.JMenuItem();
        change = new javax.swing.JMenuItem();
        del = new javax.swing.JMenuItem();
        popup_text_input = new javax.swing.JPopupMenu();
        text_clear = new javax.swing.JMenuItem();
        text_cut = new javax.swing.JMenuItem();
        text_copy = new javax.swing.JMenuItem();
        text_paste = new javax.swing.JMenuItem();
        text_selectAll = new javax.swing.JMenuItem();
        popup_tf_search = new javax.swing.JPopupMenu();
        tf_clear = new javax.swing.JMenuItem();
        tf_copy = new javax.swing.JMenuItem();
        tf_cut = new javax.swing.JMenuItem();
        tf_paste = new javax.swing.JMenuItem();
        tf_selectall = new javax.swing.JMenuItem();
        popup_area_search = new javax.swing.JPopupMenu();
        ta_search_selectAll = new javax.swing.JMenuItem();
        ta_search_copy = new javax.swing.JMenuItem();
        popup_text_output = new javax.swing.JPopupMenu();
        text_output_copy = new javax.swing.JMenuItem();
        text_output_selectAll = new javax.swing.JMenuItem();
        popup_tf_add = new javax.swing.JPopupMenu();
        tf_add_clear = new javax.swing.JMenuItem();
        tf_add_copy = new javax.swing.JMenuItem();
        tf_add_cut = new javax.swing.JMenuItem();
        tf_add_paste = new javax.swing.JMenuItem();
        tf_add_selectAll = new javax.swing.JMenuItem();
        popup_ta_add = new javax.swing.JPopupMenu();
        ta_add_clear = new javax.swing.JMenuItem();
        ta_add_copy = new javax.swing.JMenuItem();
        ta_add_cut = new javax.swing.JMenuItem();
        ta_add_paste = new javax.swing.JMenuItem();
        ta_add_selectAll = new javax.swing.JMenuItem();
        popup_tf_change = new javax.swing.JPopupMenu();
        tf_change_clear = new javax.swing.JMenuItem();
        tf_change_copy = new javax.swing.JMenuItem();
        tf_change_cut = new javax.swing.JMenuItem();
        tf_change_paste = new javax.swing.JMenuItem();
        tf_change_selectAll = new javax.swing.JMenuItem();
        popup_ta_change = new javax.swing.JPopupMenu();
        ta_change_clear = new javax.swing.JMenuItem();
        ta_change_copy = new javax.swing.JMenuItem();
        ta_change_cut = new javax.swing.JMenuItem();
        ta_change_paste = new javax.swing.JMenuItem();
        ta_change_selectAll = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("image/background.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        bt_text = new javax.swing.JButton();
        bt_lookup = new javax.swing.JButton();
        bt_exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jp_Search.setBackground(new java.awt.Color(204, 204, 255));
        jp_Search.setPreferredSize(new java.awt.Dimension(800, 600));

        bt_search.setIcon(new javax.swing.ImageIcon("image/search.png"));
        bt_search.setToolTipText("Tìm kiếm");
        bt_search.setBorder(null);
        bt_search.setBorderPainted(false);
        bt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_searchActionPerformed(evt);
            }
        });

        tf_search.setBackground(new java.awt.Color(255, 255, 255));
        tf_search.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_search.setForeground(new java.awt.Color(0, 0, 0));
        tf_search.setToolTipText("Nhập từ cần tra:");
        tf_search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, popup_tf_search, org.jdesktop.beansbinding.ObjectProperty.create(), tf_search, org.jdesktop.beansbinding.BeanProperty.create("componentPopupMenu"));
        bindingGroup.addBinding(binding);

        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_searchKeyTyped(evt);
            }
        });

        list_search.setBackground(new java.awt.Color(255, 255, 255));
        list_search.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        list_search.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        list_search.setForeground(new java.awt.Color(0, 0, 0));
        list_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_searchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list_search);

        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));

        ta_search.setEditable(false);
        ta_search.setBackground(new java.awt.Color(204, 255, 255));
        ta_search.setColumns(20);
        ta_search.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ta_search.setForeground(new java.awt.Color(0, 0, 0));
        ta_search.setLineWrap(true);
        ta_search.setRows(5);
        ta_search.setWrapStyleWord(true);
        ta_search.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ta_search.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, popup_area_search, org.jdesktop.beansbinding.ObjectProperty.create(), ta_search, org.jdesktop.beansbinding.BeanProperty.create("componentPopupMenu"));
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(ta_search);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tra từ");

        bt_return1.setIcon(new javax.swing.ImageIcon("image/return.png"));
        bt_return1.setToolTipText("Quay lại");
        bt_return1.setBorder(null);
        bt_return1.setBorderPainted(false);
        bt_return1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_return1ActionPerformed(evt);
            }
        });

        bt_add.setIcon(new javax.swing.ImageIcon("image/add.png"));
        bt_add.setToolTipText("Thêm");
        bt_add.setBorder(null);
        bt_add.setBorderPainted(false);
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });

        bt_change.setIcon(new javax.swing.ImageIcon("image/repair.png"));
        bt_change.setToolTipText("Sửa");
        bt_change.setBorder(null);
        bt_change.setBorderPainted(false);
        bt_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_changeActionPerformed(evt);
            }
        });

        bt_del.setIcon(new javax.swing.ImageIcon("image/remove.png"));
        bt_del.setToolTipText("Xoá");
        bt_del.setBorder(null);
        bt_del.setBorderPainted(false);
        bt_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_delActionPerformed(evt);
            }
        });

        bt_speak.setIcon(new javax.swing.ImageIcon("image/speak.png"));
        bt_speak.setToolTipText("Phát âm");
        bt_speak.setBorder(null);
        bt_speak.setBorderPainted(false);
        bt_speak.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_speak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_speakActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon("image/logo.png"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_return1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(bt_add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(bt_change)
                        .addGap(18, 18, 18)
                        .addComponent(bt_del, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)))
                .addComponent(bt_speak, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt_add, bt_change, bt_del});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_speak, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bt_add, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(bt_del, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_change)
                    .addComponent(bt_return1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt_add, bt_change, bt_del});

        javax.swing.GroupLayout jp_SearchLayout = new javax.swing.GroupLayout(jp_Search);
        jp_Search.setLayout(jp_SearchLayout);
        jp_SearchLayout.setHorizontalGroup(
            jp_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_SearchLayout.createSequentialGroup()
                .addGroup(jp_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_SearchLayout.createSequentialGroup()
                        .addComponent(tf_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_SearchLayout.setVerticalGroup(
            jp_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_SearchLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_SearchLayout.createSequentialGroup()
                        .addGroup(jp_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jp_SearchLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt_search, tf_search});

        jp_Text.setBackground(new java.awt.Color(204, 204, 255));
        jp_Text.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nhập đoạn văn");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setName(""); // NOI18N

        bt_trans.setText("Dịch");
        bt_trans.setToolTipText("Dịch đoạn văn");
        bt_trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_transActionPerformed(evt);
            }
        });

        ta_text_output.setEditable(false);
        ta_text_output.setBackground(new java.awt.Color(255, 255, 255));
        ta_text_output.setColumns(20);
        ta_text_output.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ta_text_output.setForeground(new java.awt.Color(0, 0, 0));
        ta_text_output.setLineWrap(true);
        ta_text_output.setRows(5);
        ta_text_output.setWrapStyleWord(true);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, popup_text_output, org.jdesktop.beansbinding.ObjectProperty.create(), ta_text_output, org.jdesktop.beansbinding.BeanProperty.create("componentPopupMenu"));
        bindingGroup.addBinding(binding);

        jScrollPane4.setViewportView(ta_text_output);

        ta_text_input.setBackground(new java.awt.Color(255, 255, 255));
        ta_text_input.setColumns(20);
        ta_text_input.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ta_text_input.setForeground(new java.awt.Color(0, 0, 0));
        ta_text_input.setLineWrap(true);
        ta_text_input.setRows(5);
        ta_text_input.setToolTipText("Nhập đoạn văn:");
        ta_text_input.setWrapStyleWord(true);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, popup_text_input, org.jdesktop.beansbinding.ObjectProperty.create(), ta_text_input, org.jdesktop.beansbinding.BeanProperty.create("componentPopupMenu"));
        bindingGroup.addBinding(binding);

        ta_text_input.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ta_text_inputInputMethodTextChanged(evt);
            }
        });
        jScrollPane3.setViewportView(ta_text_input);

        return2.setIcon(new javax.swing.ImageIcon("image/return.png"));
        return2.setToolTipText("Quay lại");
        return2.setBorder(null);
        return2.setBorderPainted(false);
        return2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Dịch đoạn văn");

        javax.swing.GroupLayout jp_TextLayout = new javax.swing.GroupLayout(jp_Text);
        jp_Text.setLayout(jp_TextLayout);
        jp_TextLayout.setHorizontalGroup(
            jp_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_TextLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_TextLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jp_TextLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(bt_trans, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jp_TextLayout.createSequentialGroup()
                        .addComponent(return2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jScrollPane4)
        );
        jp_TextLayout.setVerticalGroup(
            jp_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_TextLayout.createSequentialGroup()
                .addGroup(jp_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(return2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_TextLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jp_TextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_TextLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_TextLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(bt_trans, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jp_add.setBackground(new java.awt.Color(204, 204, 255));
        jp_add.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thêm từ mới");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Từ:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setName(""); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Giải nghĩa:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setName(""); // NOI18N

        tf_add.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_add.setToolTipText("Nhập từ cần thêm:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, popup_tf_add, org.jdesktop.beansbinding.ObjectProperty.create(), tf_add, org.jdesktop.beansbinding.BeanProperty.create("componentPopupMenu"));
        bindingGroup.addBinding(binding);

        ta_add.setColumns(20);
        ta_add.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ta_add.setLineWrap(true);
        ta_add.setRows(5);
        ta_add.setToolTipText("Nhập giải thích từ:");
        ta_add.setWrapStyleWord(true);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, popup_ta_add, org.jdesktop.beansbinding.ObjectProperty.create(), ta_add, org.jdesktop.beansbinding.BeanProperty.create("componentPopupMenu"));
        bindingGroup.addBinding(binding);

        jScrollPane5.setViewportView(ta_add);

        bt_added.setIcon(new javax.swing.ImageIcon("image/add.png"));
        bt_added.setToolTipText("Thêm từ");
        bt_added.setBorder(null);
        bt_added.setBorderPainted(false);
        bt_added.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addedActionPerformed(evt);
            }
        });

        bt_add_clear1.setIcon(new javax.swing.ImageIcon("image/clear.png"));
        bt_add_clear1.setToolTipText("Xoá");
        bt_add_clear1.setBorder(null);
        bt_add_clear1.setBorderPainted(false);
        bt_add_clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_add_clear1ActionPerformed(evt);
            }
        });

        bt_add_clear2.setIcon(new javax.swing.ImageIcon("image/clear.png"));
        bt_add_clear2.setToolTipText("Xoá");
        bt_add_clear2.setBorder(null);
        bt_add_clear2.setBorderPainted(false);
        bt_add_clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_add_clear2ActionPerformed(evt);
            }
        });

        return3.setIcon(new javax.swing.ImageIcon("image/cansel.png"));
        return3.setToolTipText("Huỷ");
        return3.setBorder(null);
        return3.setBorderPainted(false);
        return3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_addLayout = new javax.swing.GroupLayout(jp_add);
        jp_add.setLayout(jp_addLayout);
        jp_addLayout.setHorizontalGroup(
            jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_addLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addComponent(tf_add, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_add_clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_add_clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_addLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_addLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_addLayout.createSequentialGroup()
                        .addComponent(bt_added, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(return3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))))
        );

        jp_addLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt_added, return3});

        jp_addLayout.setVerticalGroup(
            jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_addLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_addLayout.createSequentialGroup()
                        .addComponent(bt_add_clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(bt_add_clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_addLayout.createSequentialGroup()
                        .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_addLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_addLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27)
                .addGroup(jp_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_added, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(return3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        jp_addLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel6, tf_add});

        jp_addLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt_added, return3});

        jp_change.setBackground(new java.awt.Color(204, 204, 255));
        jp_change.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sửa từ");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setName(""); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Từ:");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setName(""); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Giải nghĩa:");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setName(""); // NOI18N

        tf_change.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_change.setToolTipText("Nhập từ:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, popup_tf_change, org.jdesktop.beansbinding.ObjectProperty.create(), tf_change, org.jdesktop.beansbinding.BeanProperty.create("componentPopupMenu"));
        bindingGroup.addBinding(binding);

        ta_change.setColumns(20);
        ta_change.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ta_change.setLineWrap(true);
        ta_change.setRows(5);
        ta_change.setToolTipText("Nhập giải thích từ:");
        ta_change.setWrapStyleWord(true);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, popup_ta_change, org.jdesktop.beansbinding.ObjectProperty.create(), ta_change, org.jdesktop.beansbinding.BeanProperty.create("componentPopupMenu"));
        bindingGroup.addBinding(binding);

        jScrollPane6.setViewportView(ta_change);

        bt_save_change.setIcon(new javax.swing.ImageIcon("image/save.png"));
        bt_save_change.setToolTipText("Lưu");
        bt_save_change.setBorder(null);
        bt_save_change.setBorderPainted(false);
        bt_save_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_save_changeActionPerformed(evt);
            }
        });

        bt_change_clear.setIcon(new javax.swing.ImageIcon("image/clear.png"));
        bt_change_clear.setToolTipText("Xoá");
        bt_change_clear.setBorder(null);
        bt_change_clear.setBorderPainted(false);

        bt_change_clear1.setIcon(new javax.swing.ImageIcon("image/clear.png"));
        bt_change_clear1.setToolTipText("Xoá");
        bt_change_clear1.setBorder(null);
        bt_change_clear1.setBorderPainted(false);

        return4.setIcon(new javax.swing.ImageIcon("image/cansel.png"));
        return4.setToolTipText("Huỷ");
        return4.setBorder(null);
        return4.setBorderPainted(false);
        return4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_changeLayout = new javax.swing.GroupLayout(jp_change);
        jp_change.setLayout(jp_changeLayout);
        jp_changeLayout.setHorizontalGroup(
            jp_changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_changeLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jp_changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(jp_changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addComponent(tf_change, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_change_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_change_clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_changeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(311, 311, 311))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_changeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_save_change, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(return4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );

        jp_changeLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt_save_change, return4});

        jp_changeLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt_change_clear, bt_change_clear1});

        jp_changeLayout.setVerticalGroup(
            jp_changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_changeLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jp_changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_changeLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_changeLayout.createSequentialGroup()
                        .addGroup(jp_changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_change, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_change_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jp_changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_change_clear1))))
                .addGap(32, 32, 32)
                .addGroup(jp_changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_save_change, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(return4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jp_changeLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt_save_change, return4});

        jp_changeLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt_change_clear, bt_change_clear1, tf_change});

        list_copy.setText("Sao chép");
        list_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_copyActionPerformed(evt);
            }
        });
        popup_list.add(list_copy);

        change.setText("Sửa");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        popup_list.add(change);

        del.setText("Xoá");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        popup_list.add(del);

        text_clear.setText("Xoá");
        text_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_clearActionPerformed(evt);
            }
        });
        popup_text_input.add(text_clear);

        text_cut.setText("Cắt");
        text_cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_cutActionPerformed(evt);
            }
        });
        popup_text_input.add(text_cut);

        text_copy.setText("Sao chép");
        text_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_copyActionPerformed(evt);
            }
        });
        popup_text_input.add(text_copy);

        text_paste.setText("Dán");
        text_paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_pasteActionPerformed(evt);
            }
        });
        popup_text_input.add(text_paste);

        text_selectAll.setText("Chọn tất cả");
        text_selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_selectAllActionPerformed(evt);
            }
        });
        popup_text_input.add(text_selectAll);

        tf_clear.setText("Xoá");
        tf_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_clearActionPerformed(evt);
            }
        });
        popup_tf_search.add(tf_clear);

        tf_copy.setText("Sao chép");
        tf_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_copyActionPerformed(evt);
            }
        });
        popup_tf_search.add(tf_copy);

        tf_cut.setText("Cắt");
        tf_cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cutActionPerformed(evt);
            }
        });
        popup_tf_search.add(tf_cut);

        tf_paste.setText("Dán");
        tf_paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pasteActionPerformed(evt);
            }
        });
        popup_tf_search.add(tf_paste);

        tf_selectall.setText("Chọn tất cả");
        tf_selectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_selectallActionPerformed(evt);
            }
        });
        popup_tf_search.add(tf_selectall);

        ta_search_selectAll.setText("Chọn tất cả");
        ta_search_selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_search_selectAllActionPerformed(evt);
            }
        });
        popup_area_search.add(ta_search_selectAll);

        ta_search_copy.setText("Sao chép");
        ta_search_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_search_copyActionPerformed(evt);
            }
        });
        popup_area_search.add(ta_search_copy);

        text_output_copy.setText("Sao chép");
        text_output_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_output_copyActionPerformed(evt);
            }
        });
        popup_text_output.add(text_output_copy);

        text_output_selectAll.setText("Chọn tất cả");
        text_output_selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_output_selectAllActionPerformed(evt);
            }
        });
        popup_text_output.add(text_output_selectAll);

        tf_add_clear.setText("Xoá");
        tf_add_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_add_clearActionPerformed(evt);
            }
        });
        popup_tf_add.add(tf_add_clear);

        tf_add_copy.setText("Sao chép");
        tf_add_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_add_copyActionPerformed(evt);
            }
        });
        popup_tf_add.add(tf_add_copy);

        tf_add_cut.setText("Cắt");
        tf_add_cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_add_cutActionPerformed(evt);
            }
        });
        popup_tf_add.add(tf_add_cut);

        tf_add_paste.setText("Dán");
        tf_add_paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_add_pasteActionPerformed(evt);
            }
        });
        popup_tf_add.add(tf_add_paste);

        tf_add_selectAll.setText("Chọn tất cả");
        tf_add_selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_add_selectAllActionPerformed(evt);
            }
        });
        popup_tf_add.add(tf_add_selectAll);

        ta_add_clear.setText("Xoá");
        ta_add_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_add_clearActionPerformed(evt);
            }
        });
        popup_ta_add.add(ta_add_clear);

        ta_add_copy.setText("Sao chép");
        ta_add_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_add_copyActionPerformed(evt);
            }
        });
        popup_ta_add.add(ta_add_copy);

        ta_add_cut.setText("Cắt");
        ta_add_cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_add_cutActionPerformed(evt);
            }
        });
        popup_ta_add.add(ta_add_cut);

        ta_add_paste.setText("Dán");
        ta_add_paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_add_pasteActionPerformed(evt);
            }
        });
        popup_ta_add.add(ta_add_paste);

        ta_add_selectAll.setText("Chọn tất cả");
        ta_add_selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_add_selectAllActionPerformed(evt);
            }
        });
        popup_ta_add.add(ta_add_selectAll);

        tf_change_clear.setText("Xoá");
        tf_change_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_change_clearActionPerformed(evt);
            }
        });
        popup_tf_change.add(tf_change_clear);

        tf_change_copy.setText("Sao chép");
        tf_change_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_change_copyActionPerformed(evt);
            }
        });
        popup_tf_change.add(tf_change_copy);

        tf_change_cut.setText("Cắt");
        tf_change_cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_change_cutActionPerformed(evt);
            }
        });
        popup_tf_change.add(tf_change_cut);

        tf_change_paste.setText("Dán");
        tf_change_paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_change_pasteActionPerformed(evt);
            }
        });
        popup_tf_change.add(tf_change_paste);

        tf_change_selectAll.setText("Chọn tất cả");
        tf_change_selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_change_selectAllActionPerformed(evt);
            }
        });
        popup_tf_change.add(tf_change_selectAll);

        ta_change_clear.setText("Xoá");
        ta_change_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_change_clearActionPerformed(evt);
            }
        });
        popup_ta_change.add(ta_change_clear);

        ta_change_copy.setText("Sao chép");
        ta_change_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_change_copyActionPerformed(evt);
            }
        });
        popup_ta_change.add(ta_change_copy);

        ta_change_cut.setText("Cắt");
        ta_change_cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_change_cutActionPerformed(evt);
            }
        });
        popup_ta_change.add(ta_change_cut);

        ta_change_paste.setText("Dán");
        ta_change_paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_change_pasteActionPerformed(evt);
            }
        });
        popup_ta_change.add(ta_change_paste);

        ta_change_selectAll.setText("Chọn tất cả");
        ta_change_selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_change_selectAllActionPerformed(evt);
            }
        });
        popup_ta_change.add(ta_change_selectAll);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Từ điển Anh - Việt");
        setBounds((dimension.width - SCREEN_WIDTH)/2, (dimension.height - SCREEN_HEIGHT)/2, SCREEN_WIDTH, SCREEN_HEIGHT);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(img.getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 600));

        bt_text.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        bt_text.setIcon(new javax.swing.ImageIcon("image/bt_text.png"));
        bt_text.setToolTipText("Dịch đoạn văn");
        bt_text.setBorder(null);
        bt_text.setBorderPainted(false);
        bt_text.setPreferredSize(new java.awt.Dimension(50, 50));
        bt_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_textActionPerformed(evt);
            }
        });

        bt_lookup.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bt_lookup.setIcon(new javax.swing.ImageIcon("image/bt_search.png"));
        bt_lookup.setToolTipText("Tra từ");
        bt_lookup.setBorder(null);
        bt_lookup.setBorderPainted(false);
        bt_lookup.setHideActionText(true);
        bt_lookup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lookupActionPerformed(evt);
            }
        });

        bt_exit.setIcon(new javax.swing.ImageIcon("image/bt_exit.png"));
        bt_exit.setToolTipText("Thoát");
        bt_exit.setBorder(null);
        bt_exit.setBorderPainted(false);
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Từ điển Anh - Việt");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(bt_lookup, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(bt_text, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt_exit, bt_lookup, bt_text});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_lookup)
                    .addComponent(bt_text, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_exit))
                .addGap(168, 168, 168))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt_exit, bt_lookup, bt_text});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Thêm từ vào danh sách gợi ý    
    
    public void initToList(String text) {
        DefaultListModel model = new DefaultListModel();
        if ("".equals(text)) {
            list_search.setModel(model);
        } else {
            for (Word word : words) {
                if (word.getWord_taget().startsWith(text)) {
                    if (word.getWord_taget().equals(text)) {
                        model.add(0, word.getWord_taget());
                    } else {
                        model.addElement(word.getWord_taget());
                    }
                }
            }
            list_search.setModel(model);
        }
    }
    private void bt_transActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_transActionPerformed
        String text = ta_text_input.getText();
        EnglishVietnamese en_vi = new EnglishVietnamese();
        try {
            ta_text_output.setText(en_vi.translate(text));
        } catch (IOException | ParseException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_transActionPerformed

    private void bt_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_textActionPerformed
        setContentPane(jp_Text);
        ta_text_input.setText("");
        ta_text_output.setText("");
        setVisible(true);
    }//GEN-LAST:event_bt_textActionPerformed

    private void bt_lookupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lookupActionPerformed
        setContentPane(jp_Search);
        tf_search.setText("");
        initToList("");
        ta_search.setText("");
        setVisible(true);
    }//GEN-LAST:event_bt_lookupActionPerformed

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        int click = JOptionPane.showConfirmDialog(null, "Bạn muốn thoát khỏi chương trình?", "Thoát?", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_bt_exitActionPerformed

    private void return2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return2ActionPerformed
        setContentPane(jPanel3);
    }//GEN-LAST:event_return2ActionPerformed

    private void return3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return3ActionPerformed
        int click = JOptionPane.showConfirmDialog(null, "Huỷ thêm từ?", "Huỷ?", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.YES_OPTION) {
            setContentPane(jp_Search);
        }
    }//GEN-LAST:event_return3ActionPerformed

    private void bt_add_clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_add_clear1ActionPerformed
        tf_add.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_bt_add_clear1ActionPerformed

    private void bt_add_clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_add_clear2ActionPerformed
        ta_add.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_bt_add_clear2ActionPerformed

    private void bt_addedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addedActionPerformed
        String text = tf_add.getText().trim().toLowerCase();
        int index = BinarySearch(text);
        if (index != -1) {
            JOptionPane.showMessageDialog(null, text + " đã tồn tại!");
            tf_add.requestFocus();
        } else {
            if (executeDatabase.insertElement(new Word(1, text, ta_add.getText()))) {
                JOptionPane.showMessageDialog(null, "Thêm thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thất bại!");
            }
            try {
                words = AcessDatabase.readDatabase();
            } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        tf_add.setText("");
        ta_add.setText("");
    }//GEN-LAST:event_bt_addedActionPerformed

    private void bt_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changeActionPerformed
        if (!list_search.isSelectionEmpty() && tf_search.getText() != null) {
            setContentPane(jp_change);
            setVisible(true);
            tf_change.setText(list_search.getSelectedValue());
            ta_change.setText(ta_search.getText());
            tf_change.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Chọn từ cần sửa:");
        }
    }//GEN-LAST:event_bt_changeActionPerformed

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        setContentPane(jp_add);
        setVisible(true);
    }//GEN-LAST:event_bt_addActionPerformed

    private void bt_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delActionPerformed
        String text = list_search.getSelectedValue();
        if (text == null) {
            JOptionPane.showMessageDialog(null, "Chọn từ cần xoá:");
        } else {
            int click = JOptionPane.showConfirmDialog(null, "Xoá" + "'" + text + "'", "Question", JOptionPane.YES_NO_OPTION);
            if (click == JOptionPane.YES_OPTION) {
                if (executeDatabase.deleteElement(text)) {
                    try {
                        words = AcessDatabase.readDatabase();
                    } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                        Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    tf_search.setText("");
                    ta_search.setText("");
                    initToList("");
                    JOptionPane.showMessageDialog(null, "Xoá thành công!");
                } else {
                    JOptionPane.showMessageDialog(null, "Xoá thất bại!");
                }
            }
        }
    }//GEN-LAST:event_bt_delActionPerformed

    private void bt_return1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_return1ActionPerformed
        setContentPane(jPanel3);
    }//GEN-LAST:event_bt_return1ActionPerformed

    private void bt_speakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_speakActionPerformed
        try {
            if (list_search.isSelectionEmpty() && tf_search.getText() != null) {
                Speak.speech(tf_search.getText().toLowerCase());
            } else {
                Speak.speech(list_search.getSelectedValue());
            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_bt_speakActionPerformed

    private void tf_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            String varRun = tf_search.getText().toLowerCase();
            int index = BinarySearch(varRun);
            if (index != -1) {
                String wordDetail = words.get(index).getWord_explain().replaceAll("<C><F><I><N><Q>", "\n      ").replaceAll("<br />", "\n      ").replaceAll("</Q></N></I></F></C>", "");
                ta_search.setText(wordDetail);
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy từ " + varRun + "!");
                tf_search.requestFocus();
            }
        }
    }//GEN-LAST:event_tf_searchKeyTyped

    private void bt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_searchActionPerformed
        String varRun = tf_search.getText().trim();
        int index = BinarySearch(varRun);
        if (index != -1) {
            String wordDetail = words.get(index).getWord_explain().replaceAll("<C><F><I><N><Q>", "\n      ").replaceAll("<br />", "\n      ").replaceAll("</Q></N></I></F></C>", "");
            ta_search.setText(wordDetail);
        } else {
            JOptionPane.showMessageDialog(null, "Không tìm thấy từ " + varRun + "!");
            tf_search.requestFocus();
        }
    }//GEN-LAST:event_bt_searchActionPerformed

    private void return4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return4ActionPerformed
        int click = JOptionPane.showConfirmDialog(null, "Huỷ cập nhật?", "Huỷ?", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.YES_OPTION) {
            setContentPane(jp_Search);
        }
    }//GEN-LAST:event_return4ActionPerformed

    private void bt_save_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_save_changeActionPerformed
        String old_word = tf_change.getText();
        int id;
        int index = BinarySearch(old_word);
        id = words.get(index).getWord_id();
        if (executeDatabase.updateElement(id, tf_change.getText(), ta_change.getText())) {
            try {
                words = AcessDatabase.readDatabase();
            } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Đã lưu!");
        } else {
            JOptionPane.showMessageDialog(null, "Đã có lỗi! Từ chưa được cập nhật.");
            tf_change.requestFocus();
        }
        tf_change.setText("");
        ta_change.setText("");
    }//GEN-LAST:event_bt_save_changeActionPerformed

    private void list_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_searchMouseClicked
        if (SwingUtilities.isLeftMouseButton(evt)) {
            String word_seclection = list_search.getSelectedValue();
            int index = BinarySearch(word_seclection);
            String wordDetail = words.get(index).getWord_explain().replaceAll("<C><F><I><N><Q>", "\n      ").replaceAll("<br />", "\n      ").replaceAll("</Q></N></I></F></C>", "");
            ta_search.setText(wordDetail);
        }
        if (SwingUtilities.isRightMouseButton(evt) // if right mouse button clicked
                && !list_search.isSelectionEmpty() // and list selection is not empty
                && list_search.locationToIndex(evt.getPoint()) // and clicked point is
                == list_search.getSelectedIndex()) {       //   inside selected item bounds
            popup_list.show(list_search, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_list_searchMouseClicked

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        setContentPane(jp_change);
        setVisible(true);
        tf_change.setText(list_search.getSelectedValue());
        ta_change.setText(ta_search.getText());
        tf_change.requestFocus();
    }//GEN-LAST:event_changeActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        String text = list_search.getSelectedValue();
        int click = JOptionPane.showConfirmDialog(null, "Xoá" + "'" + text + "'", "Question", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.YES_OPTION) {
            if (executeDatabase.deleteElement(text)) {
                try {
                    words = AcessDatabase.readDatabase();
                } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
                }
                tf_search.setText("");
                ta_search.setText("");
                initToList("");
                JOptionPane.showMessageDialog(null, "Xoá thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Xoá thất bại!");
            }
        }
    }//GEN-LAST:event_delActionPerformed

    private void text_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_clearActionPerformed
        ta_text_input.setText("");
    }//GEN-LAST:event_text_clearActionPerformed
    private void text_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_copyActionPerformed
        if (evt.getActionCommand().equals("Sao chép")) {

            String selection = ta_text_input.getSelectedText();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
        }
    }//GEN-LAST:event_text_copyActionPerformed
    private void text_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_pasteActionPerformed
        if (evt.getActionCommand().equals("Dán")) {

            Transferable clip_data = clipboard.getContents(this);

            try {
                String clip_string = (String) clip_data.getTransferData(DataFlavor.stringFlavor);
                ta_text_input.replaceSelection(clip_string);

            } catch (UnsupportedFlavorException | IOException excpt) {

            }
        }
    }//GEN-LAST:event_text_pasteActionPerformed
    private void text_selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_selectAllActionPerformed
        ta_text_input.selectAll();
    }//GEN-LAST:event_text_selectAllActionPerformed

    @SuppressWarnings("IncompatibleEquals")
    private void ta_text_inputInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ta_text_inputInputMethodTextChanged
        String selection = ta_text_input.getSelectedText();
        if (ta_text_input.getText() != null && !"".equals(ta_text_input)) {
            text_clear.setEnabled(true);
            text_selectAll.setEnabled(true);
        } else {
            text_clear.setEnabled(false);
            text_selectAll.setEnabled(false);
        }

        if (selection != null && !"".equals(selection)) {
            text_copy.setEnabled(true);
            text_cut.setEnabled(true);
        } else {
            text_copy.setEnabled(false);
            text_cut.setEnabled(false);
        }
    }//GEN-LAST:event_ta_text_inputInputMethodTextChanged

    private void text_cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_cutActionPerformed
        if (evt.getActionCommand().equals("Cắt")) {

            String selection = ta_text_input.getSelectedText();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
            ta_text_input.replaceSelection("");
        }
    }//GEN-LAST:event_text_cutActionPerformed

    private void list_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_copyActionPerformed
        if (evt.getActionCommand().equals("Sao chép")) {

            String selection = list_search.getSelectedValue();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
        }
    }//GEN-LAST:event_list_copyActionPerformed

    private void tf_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_copyActionPerformed
        if (evt.getActionCommand().equals("Sao chép")) {

            String selection = tf_search.getSelectedText();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
        }
    }//GEN-LAST:event_tf_copyActionPerformed
    private void tf_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_clearActionPerformed
        tf_search.setText("");
    }//GEN-LAST:event_tf_clearActionPerformed
    private void tf_selectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_selectallActionPerformed
        tf_search.selectAll();
    }//GEN-LAST:event_tf_selectallActionPerformed
    private void tf_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pasteActionPerformed
        if (evt.getActionCommand().equals("Dán")) {
            Transferable clip_data = clipboard.getContents(this);
            try {
                String clip_string = (String) clip_data.getTransferData(DataFlavor.stringFlavor);
                tf_search.replaceSelection(clip_string);
            } catch (UnsupportedFlavorException | IOException excpt) {
            }
        }
    }//GEN-LAST:event_tf_pasteActionPerformed

    private void ta_search_selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_search_selectAllActionPerformed
        ta_search.selectAll();
    }//GEN-LAST:event_ta_search_selectAllActionPerformed
    private void ta_search_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_search_copyActionPerformed
        if (evt.getActionCommand().equals("Sao chép")) {

            String selection = ta_search.getSelectedText();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
        }
    }//GEN-LAST:event_ta_search_copyActionPerformed

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased
        String text = tf_search.getText();
        initToList(text.toLowerCase());
    }//GEN-LAST:event_tf_searchKeyReleased

    private void text_output_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_output_copyActionPerformed
        if (evt.getActionCommand().equals("Sao chép")) {

            String selection = ta_text_output.getSelectedText();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
        }
    }//GEN-LAST:event_text_output_copyActionPerformed
    private void text_output_selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_output_selectAllActionPerformed
        ta_text_output.selectAll();
    }//GEN-LAST:event_text_output_selectAllActionPerformed

    private void tf_cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cutActionPerformed
        if (evt.getActionCommand().equals("Cắt")) {

            String selection = tf_search.getSelectedText();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
            tf_search.replaceSelection("");
        }
    }//GEN-LAST:event_tf_cutActionPerformed

    private void tf_add_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_add_clearActionPerformed
        tf_add.setText("");
    }//GEN-LAST:event_tf_add_clearActionPerformed
    private void tf_add_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_add_copyActionPerformed
        if (evt.getActionCommand().equals("Sao chép")) {

            String selection = tf_add.getSelectedText();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
        }
    }//GEN-LAST:event_tf_add_copyActionPerformed
    private void tf_add_cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_add_cutActionPerformed
        if (evt.getActionCommand().equals("Cắt")) {

            String selection = tf_add.getSelectedText();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
            tf_add.replaceSelection("");
        }
    }//GEN-LAST:event_tf_add_cutActionPerformed
    private void tf_add_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_add_pasteActionPerformed
        if (evt.getActionCommand().equals("Dán")) {
            Transferable clip_data = clipboard.getContents(this);
            try {
                String clip_string = (String) clip_data.getTransferData(DataFlavor.stringFlavor);
                tf_add.replaceSelection(clip_string);
            } catch (UnsupportedFlavorException | IOException excpt) {
            }
        }
    }//GEN-LAST:event_tf_add_pasteActionPerformed
    private void tf_add_selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_add_selectAllActionPerformed
        tf_add.selectAll();
    }//GEN-LAST:event_tf_add_selectAllActionPerformed

    private void ta_add_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_add_clearActionPerformed
        ta_add.setText("");
    }//GEN-LAST:event_ta_add_clearActionPerformed
    private void ta_add_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_add_copyActionPerformed
        if (evt.getActionCommand().equals("Sao chép")) {

            String selection = ta_add.getSelectedText();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
        }
    }//GEN-LAST:event_ta_add_copyActionPerformed
    private void ta_add_cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_add_cutActionPerformed
        if (evt.getActionCommand().equals("Cắt")) {

            String selection = ta_add.getSelectedText();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
            ta_add.replaceSelection("");
        }
    }//GEN-LAST:event_ta_add_cutActionPerformed
    private void ta_add_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_add_pasteActionPerformed
        if (evt.getActionCommand().equals("Dán")) {
            Transferable clip_data = clipboard.getContents(this);
            try {
                String clip_string = (String) clip_data.getTransferData(DataFlavor.stringFlavor);
                ta_add.replaceSelection(clip_string);
            } catch (UnsupportedFlavorException | IOException excpt) {
            }
        }
    }//GEN-LAST:event_ta_add_pasteActionPerformed
    private void ta_add_selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_add_selectAllActionPerformed
        ta_add.selectAll();
    }//GEN-LAST:event_ta_add_selectAllActionPerformed

    private void tf_change_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_change_clearActionPerformed
        tf_change.setText("");
    }//GEN-LAST:event_tf_change_clearActionPerformed
    private void tf_change_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_change_copyActionPerformed
        if (evt.getActionCommand().equals("Sao chép")) {

            String selection = tf_change.getSelectedText();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
        }
    }//GEN-LAST:event_tf_change_copyActionPerformed
    private void tf_change_cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_change_cutActionPerformed
        if (evt.getActionCommand().equals("Cắt")) {

            String selection = tf_change.getSelectedText();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
            tf_change.replaceSelection("");
        }
    }//GEN-LAST:event_tf_change_cutActionPerformed
    private void tf_change_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_change_pasteActionPerformed
        if (evt.getActionCommand().equals("Dán")) {
            Transferable clip_data = clipboard.getContents(this);
            try {
                String clip_string = (String) clip_data.getTransferData(DataFlavor.stringFlavor);
                tf_change.replaceSelection(clip_string);
            } catch (UnsupportedFlavorException | IOException excpt) {
            }
        }
    }//GEN-LAST:event_tf_change_pasteActionPerformed
    private void tf_change_selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_change_selectAllActionPerformed
        tf_change.selectAll();
    }//GEN-LAST:event_tf_change_selectAllActionPerformed

    private void ta_change_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_change_clearActionPerformed
        ta_change.setText("");
    }//GEN-LAST:event_ta_change_clearActionPerformed
    private void ta_change_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_change_copyActionPerformed
        if (evt.getActionCommand().equals("Sao chép")) {

            String selection = ta_change.getSelectedText();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
        }
    }//GEN-LAST:event_ta_change_copyActionPerformed
    private void ta_change_cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_change_cutActionPerformed
        if (evt.getActionCommand().equals("Cắt")) {

            String selection = ta_change.getSelectedText();

            if (selection == null) {
                return;
            }
            StringSelection clipString = new StringSelection(selection);
            clipboard.setContents(clipString, clipString);
            ta_change.replaceSelection("");
        }
    }//GEN-LAST:event_ta_change_cutActionPerformed
    private void ta_change_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_change_pasteActionPerformed
        if (evt.getActionCommand().equals("Dán")) {
            Transferable clip_data = clipboard.getContents(this);
            try {
                String clip_string = (String) clip_data.getTransferData(DataFlavor.stringFlavor);
                ta_change.replaceSelection(clip_string);
            } catch (UnsupportedFlavorException | IOException excpt) {
            }
        }
    }//GEN-LAST:event_ta_change_pasteActionPerformed
    private void ta_change_selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_change_selectAllActionPerformed
        ta_change.selectAll();
    }//GEN-LAST:event_ta_change_selectAllActionPerformed

//Thuật toán tìm kiếm nhị phân    
    
    public int BinarySearch(String text) {
        int low = 0;
        int high = words.size() - 1;
        int mid;

        while (low < high) {
            mid = (low + high) / 2;
            if (words.get(mid).getWord_taget().equals(text)) {
                return mid;
            } else if (words.get(mid).getWord_taget().compareTo(text) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (words.get(low).getWord_taget().equals(text)) {
            return low;
        }
        return -1;
    }

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static void main(String args[]) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        words = AcessDatabase.readDatabase();
        java.awt.EventQueue.invokeLater(() -> {
            new Application().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_add_clear1;
    private javax.swing.JButton bt_add_clear2;
    private javax.swing.JButton bt_added;
    private javax.swing.JButton bt_change;
    private javax.swing.JButton bt_change_clear;
    private javax.swing.JButton bt_change_clear1;
    private javax.swing.JButton bt_del;
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_lookup;
    private javax.swing.JButton bt_return1;
    private javax.swing.JButton bt_save_change;
    private javax.swing.JButton bt_search;
    private javax.swing.JButton bt_speak;
    private javax.swing.JButton bt_text;
    private javax.swing.JButton bt_trans;
    private javax.swing.JMenuItem change;
    private javax.swing.JMenuItem del;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel jp_Search;
    private javax.swing.JPanel jp_Text;
    private javax.swing.JPanel jp_add;
    private javax.swing.JPanel jp_change;
    private javax.swing.JMenuItem list_copy;
    private javax.swing.JList<String> list_search;
    private javax.swing.JPopupMenu popup_area_search;
    private javax.swing.JPopupMenu popup_list;
    private javax.swing.JPopupMenu popup_ta_add;
    private javax.swing.JPopupMenu popup_ta_change;
    private javax.swing.JPopupMenu popup_text_input;
    private javax.swing.JPopupMenu popup_text_output;
    private javax.swing.JPopupMenu popup_tf_add;
    private javax.swing.JPopupMenu popup_tf_change;
    private javax.swing.JPopupMenu popup_tf_search;
    private javax.swing.JButton return2;
    private javax.swing.JButton return3;
    private javax.swing.JButton return4;
    private javax.swing.JTextArea ta_add;
    private javax.swing.JMenuItem ta_add_clear;
    private javax.swing.JMenuItem ta_add_copy;
    private javax.swing.JMenuItem ta_add_cut;
    private javax.swing.JMenuItem ta_add_paste;
    private javax.swing.JMenuItem ta_add_selectAll;
    private javax.swing.JTextArea ta_change;
    private javax.swing.JMenuItem ta_change_clear;
    private javax.swing.JMenuItem ta_change_copy;
    private javax.swing.JMenuItem ta_change_cut;
    private javax.swing.JMenuItem ta_change_paste;
    private javax.swing.JMenuItem ta_change_selectAll;
    private javax.swing.JTextArea ta_search;
    private javax.swing.JMenuItem ta_search_copy;
    private javax.swing.JMenuItem ta_search_selectAll;
    private javax.swing.JTextArea ta_text_input;
    private javax.swing.JTextArea ta_text_output;
    private javax.swing.JMenuItem text_clear;
    private javax.swing.JMenuItem text_copy;
    private javax.swing.JMenuItem text_cut;
    private javax.swing.JMenuItem text_output_copy;
    private javax.swing.JMenuItem text_output_selectAll;
    private javax.swing.JMenuItem text_paste;
    private javax.swing.JMenuItem text_selectAll;
    private javax.swing.JTextField tf_add;
    private javax.swing.JMenuItem tf_add_clear;
    private javax.swing.JMenuItem tf_add_copy;
    private javax.swing.JMenuItem tf_add_cut;
    private javax.swing.JMenuItem tf_add_paste;
    private javax.swing.JMenuItem tf_add_selectAll;
    private javax.swing.JTextField tf_change;
    private javax.swing.JMenuItem tf_change_clear;
    private javax.swing.JMenuItem tf_change_copy;
    private javax.swing.JMenuItem tf_change_cut;
    private javax.swing.JMenuItem tf_change_paste;
    private javax.swing.JMenuItem tf_change_selectAll;
    private javax.swing.JMenuItem tf_clear;
    private javax.swing.JMenuItem tf_copy;
    private javax.swing.JMenuItem tf_cut;
    private javax.swing.JMenuItem tf_paste;
    private javax.swing.JTextField tf_search;
    private javax.swing.JMenuItem tf_selectall;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
