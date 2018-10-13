/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author danda
 */
public class Client extends javax.swing.JFrame {
    
    private Server server;
    private String login;
    private List<Skill> skills;
    private List<Ability> abilities;

    /**
     * Creates new form Client
     */
    public Client() {
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

        jButtonConnectToServer = new javax.swing.JButton();
        jLabelConnectToServed = new javax.swing.JLabel();
        jButtonDisconnectFromServer = new javax.swing.JButton();
        jTextFieldLogin = new javax.swing.JTextField();
        jTabbedPaneMain = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonStorageDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelSnowballs = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelSnowflakes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelIcicles = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelStorageType = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelStorageSize = new javax.swing.JLabel();
        jButtonSkillsDetails = new javax.swing.JButton();
        jComboBoxSkills = new javax.swing.JComboBox<>();
        jButtonActionDetails = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabelActionType = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelActionAction = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelActionStartDate = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelActionEndDate = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboAbilities = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabelCurrentLevel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelExperience = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelNextExperience = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snowballs client");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButtonConnectToServer.setText("Connect to server");
        jButtonConnectToServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConnectToServerMouseClicked(evt);
            }
        });
        jButtonConnectToServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectToServerActionPerformed(evt);
            }
        });

        jLabelConnectToServed.setText("Connected");

        jButtonDisconnectFromServer.setText("Disconnect from server");
        jButtonDisconnectFromServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDisconnectFromServerMouseClicked(evt);
            }
        });
        jButtonDisconnectFromServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisconnectFromServerActionPerformed(evt);
            }
        });

        jButtonStorageDetails.setText("Get storage details");
        jButtonStorageDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonStorageDetailsMouseClicked(evt);
            }
        });

        jLabel1.setText("Snowballs:");

        jLabelSnowballs.setText("10000");

        jLabel2.setText("Snowflakes:");

        jLabelSnowflakes.setText("10000");

        jLabel3.setText("Icicles:");

        jLabelIcicles.setText("10000");

        jLabel4.setText("Storage type:");

        jLabelStorageType.setText("EXTENDED");

        jLabel5.setText("Storage size:");

        jLabelStorageSize.setText("10000");

        jButtonSkillsDetails.setText("Get skills details");
        jButtonSkillsDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSkillsDetailsMouseClicked(evt);
            }
        });
        jButtonSkillsDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSkillsDetailsActionPerformed(evt);
            }
        });

        jButtonActionDetails.setText("Get action details");
        jButtonActionDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonActionDetailsMouseClicked(evt);
            }
        });

        jLabel9.setText("Type:");

        jLabelActionType.setText("STUDY_ABILITY");

        jLabel10.setText("Action:");

        jLabelActionAction.setText("FREE");

        jLabel11.setText("Start date:");

        jLabelActionStartDate.setText("2018-10-13T23:44:20.877");

        jLabel12.setText("End date:");

        jLabelActionEndDate.setText("jLabel13");

        jButton1.setText("Get abilities details");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonActionDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSkillsDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonStorageDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSnowballs)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSnowflakes)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelIcicles)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelStorageType)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelStorageSize))
                    .addComponent(jComboBoxSkills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelActionType)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelActionAction)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelActionStartDate)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelActionEndDate))
                    .addComponent(jComboAbilities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStorageDetails)
                    .addComponent(jLabel1)
                    .addComponent(jLabelSnowballs)
                    .addComponent(jLabel2)
                    .addComponent(jLabelSnowflakes)
                    .addComponent(jLabel3)
                    .addComponent(jLabelIcicles)
                    .addComponent(jLabel4)
                    .addComponent(jLabelStorageType)
                    .addComponent(jLabel5)
                    .addComponent(jLabelStorageSize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSkillsDetails)
                    .addComponent(jComboBoxSkills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActionDetails)
                    .addComponent(jLabel9)
                    .addComponent(jLabelActionType)
                    .addComponent(jLabel10)
                    .addComponent(jLabelActionAction)
                    .addComponent(jLabel11)
                    .addComponent(jLabelActionStartDate)
                    .addComponent(jLabel12)
                    .addComponent(jLabelActionEndDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jComboAbilities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(457, Short.MAX_VALUE))
        );

        jTabbedPaneMain.addTab("Receive information", jPanel1);

        jLabel6.setText("Current level:");

        jLabelCurrentLevel.setText("15");

        jLabel7.setText("Experience:");

        jLabelExperience.setText("10000");

        jLabel8.setText("Next experience:");

        jLabelNextExperience.setText("10000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPaneMain)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelConnectToServed)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonConnectToServer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDisconnectFromServer)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCurrentLevel)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelExperience)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNextExperience)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelConnectToServed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConnectToServer)
                    .addComponent(jButtonDisconnectFromServer)
                    .addComponent(jLabel6)
                    .addComponent(jLabelCurrentLevel)
                    .addComponent(jLabel7)
                    .addComponent(jLabelExperience)
                    .addComponent(jLabel8)
                    .addComponent(jLabelNextExperience))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneMain)
                .addContainerGap())
        );

        jTabbedPaneMain.getAccessibleContext().setAccessibleName("Receive information");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConnectToServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectToServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConnectToServerActionPerformed

    private void jButtonConnectToServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConnectToServerMouseClicked
        this.server = new Server();
        if (this.server.startConnection("localhost", 2600)) {
            cleanValues();
            this.login = this.jTextFieldLogin.getText();
            String result = this.server.sendMessage("00001 " + this.login);
            String[] values = defaultParseLine(result);
            
            this.jLabelCurrentLevel.setText(values[0]);
            this.jLabelExperience.setText(values[1]);
            this.jLabelNextExperience.setText(values[2]);
            
            this.jLabelConnectToServed.setText("Connected");
        } else {
            this.jLabelConnectToServed.setText("Connection failed");
        }
    }//GEN-LAST:event_jButtonConnectToServerMouseClicked

    private void jButtonDisconnectFromServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisconnectFromServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDisconnectFromServerActionPerformed

    private void jButtonDisconnectFromServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDisconnectFromServerMouseClicked
        if (this.server.stopConnection()) {
            this.jLabelConnectToServed.setText("Disconnected");
        } else {
            this.jLabelConnectToServed.setText("Disconnection failed");
        }
    }//GEN-LAST:event_jButtonDisconnectFromServerMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cleanValues();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonStorageDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonStorageDetailsMouseClicked
        String result = this.server.sendMessage("10001 GET");
        String[] values = defaultParseLine(result);
        this.jLabelSnowballs.setText(values[0]);
        this.jLabelSnowflakes.setText(values[1]);
        this.jLabelIcicles.setText(values[2]);
        this.jLabelStorageType.setText(values[3]);
        this.jLabelStorageSize.setText(values[4]);
    }//GEN-LAST:event_jButtonStorageDetailsMouseClicked

    private void jButtonSkillsDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSkillsDetailsMouseClicked
        this.skills = new ArrayList<>();
        String result = this.server.sendMessage("10002 GET");
        Map<Integer, String[]> values = specialParseLine(result);
        for (Map.Entry<Integer, String[]> entry : values.entrySet()) {
            String[] value = entry.getValue();
            Skill skill = new Skill(
                    Long.valueOf(value[0]), 
                    value[1],
                    value[2],
                    value[3],
                    Integer.valueOf(value[4]),
                    Integer.valueOf(value[5]),
                    Float.valueOf(value[6].replace(",", ".")),
                    Integer.valueOf(value[7]),
                    Integer.valueOf(value[8])
            );
            
            this.skills.add(skill);
            this.jComboBoxSkills.addItem(skill);
            this.jComboBoxSkills.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButtonSkillsDetailsMouseClicked

    private void jButtonSkillsDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSkillsDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSkillsDetailsActionPerformed

    private void jButtonActionDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActionDetailsMouseClicked
        String result = this.server.sendMessage("10003 GET");
        String[] values = defaultParseLine(result);
        this.jLabelActionType.setText(values[0]);
        this.jLabelActionAction.setText(values[1]);
        this.jLabelActionStartDate.setText(values[2]);
        this.jLabelActionEndDate.setText(values[3]);
    }//GEN-LAST:event_jButtonActionDetailsMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.abilities = new ArrayList<>();
        String result = this.server.sendMessage("10004 GET");
        Map<Integer, String[]> values = specialParseLine(result);
        for (Map.Entry<Integer, String[]> entry : values.entrySet()) {
            String[] value = entry.getValue();
            Ability ability = new Ability(
                    Long.valueOf(value[0]), 
                    value[1],
                    value[2],
                    value[3],
                    Integer.valueOf(value[4]),
                    Integer.valueOf(value[5]),
                    Integer.valueOf(value[6]),
                    Integer.valueOf(value[7]),
                    Integer.valueOf(value[8]),
                    Integer.valueOf(value[9]),
                    Integer.valueOf(value[10]),
                    Integer.valueOf(value[11]),
                    Integer.valueOf(value[12])
            );
            
            this.abilities.add(ability);
            this.jComboAbilities.addItem(ability);
            this.jComboAbilities.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void cleanValues() {
        this.jLabelConnectToServed.setText("");
        
        this.jLabelCurrentLevel.setText("");
        this.jLabelExperience.setText("");
        this.jLabelNextExperience.setText("");
        
        this.jLabelSnowballs.setText("");
        this.jLabelSnowflakes.setText("");
        this.jLabelIcicles.setText("");
        this.jLabelStorageType.setText("");
        this.jLabelStorageSize.setText("");
        
        this.jComboBoxSkills.removeAllItems();
        
        this.jLabelActionType.setText("");
        this.jLabelActionAction.setText("");
        this.jLabelActionStartDate.setText("");
        this.jLabelActionEndDate.setText("");
        
        this.jComboAbilities.removeAllItems();
    }
    
    private String[] defaultParseLine(String line) {
        return line.substring(6).split(" ");
    }
    
    private Map<Integer, String[]> specialParseLine(String line) {
        String[] parts = Stream.of(line.substring(6).split("\\]"))
                .map(it ->it.replace(" [", ""))
                .map(it -> it.replace("[", ""))
                .collect(Collectors.toList())
                .toArray(new String[0]);
        Map<Integer, String[]> result = new HashMap<>();
        for (int i = 0; i < parts.length; i++) {
            result.put(i, parts[i].split(";"));
        }
        
        return result;
    }
    
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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonActionDetails;
    private javax.swing.JButton jButtonConnectToServer;
    private javax.swing.JButton jButtonDisconnectFromServer;
    private javax.swing.JButton jButtonSkillsDetails;
    private javax.swing.JButton jButtonStorageDetails;
    private javax.swing.JComboBox<Ability> jComboAbilities;
    private javax.swing.JComboBox<Skill> jComboBoxSkills;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelActionAction;
    private javax.swing.JLabel jLabelActionEndDate;
    private javax.swing.JLabel jLabelActionStartDate;
    private javax.swing.JLabel jLabelActionType;
    private javax.swing.JLabel jLabelConnectToServed;
    private javax.swing.JLabel jLabelCurrentLevel;
    private javax.swing.JLabel jLabelExperience;
    private javax.swing.JLabel jLabelIcicles;
    private javax.swing.JLabel jLabelNextExperience;
    private javax.swing.JLabel jLabelSnowballs;
    private javax.swing.JLabel jLabelSnowflakes;
    private javax.swing.JLabel jLabelStorageSize;
    private javax.swing.JLabel jLabelStorageType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPaneMain;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables

    private static class Skill {
        private long id;
        private String nameRus;
        private String nameEng;
        private String type;
        private int currentLevel;
        private int maxLevel;
        private float currentBonus;
        private int costNextLevel;
        private int nextLevelStudyTime;

        public Skill(long id, String nameRus, String nameEng, String type, int currentLevel, int maxLevel, float currentBonus, int costNextLevel, int nextLevelStudyTime) {
            this.id = id;
            this.nameRus = nameRus;
            this.nameEng = nameEng;
            this.type = type;
            this.currentLevel = currentLevel;
            this.maxLevel = maxLevel;
            this.currentBonus = currentBonus;
            this.costNextLevel = costNextLevel;
            this.nextLevelStudyTime = nextLevelStudyTime;
        }

        public long getId() {
            return id;
        }

        public String getNameRus() {
            return nameRus;
        }

        public String getNameEng() {
            return nameEng;
        }

        public String getType() {
            return type;
        }

        public int getCurrentLevel() {
            return currentLevel;
        }

        public int getMaxLevel() {
            return maxLevel;
        }

        public float getCurrentBonus() {
            return currentBonus;
        }

        public int getCostNextLevel() {
            return costNextLevel;
        }

        public int getNextLevelStudyTime() {
            return nextLevelStudyTime;
        }

        @Override
        public String toString() {
            return nameEng;
        }
    }
    
    private static class Ability {
        private long id;
        private String nameRus;
        private String nameEng;
        private String type;
        private int currentLevel;
        private int maxLevel;
        private int damage;
        private int damagePerSecond;
        private int intervalDamage;
        private int duration;
        private int cooldown;
        private int costNextLevel;
        private int nextLevelStudyTime;

        public Ability(long id, String nameRus, String nameEng, String type, int currentLevel, int maxLevel, int damage, int damagePerSecond, int intervalDamage, int duration, int cooldown, int costNextLevel, int nextLevelStudyTime) {
            this.id = id;
            this.nameRus = nameRus;
            this.nameEng = nameEng;
            this.type = type;
            this.currentLevel = currentLevel;
            this.maxLevel = maxLevel;
            this.damage = damage;
            this.damagePerSecond = damagePerSecond;
            this.intervalDamage = intervalDamage;
            this.duration = duration;
            this.cooldown = cooldown;
            this.costNextLevel = costNextLevel;
            this.nextLevelStudyTime = nextLevelStudyTime;
        }

        public long getId() {
            return id;
        }

        public String getNameRus() {
            return nameRus;
        }

        public String getNameEng() {
            return nameEng;
        }

        public String getType() {
            return type;
        }

        public int getCurrentLevel() {
            return currentLevel;
        }

        public int getMaxLevel() {
            return maxLevel;
        }

        public int getDamage() {
            return damage;
        }

        public int getDamagePerSecond() {
            return damagePerSecond;
        }

        public int getIntervalDamage() {
            return intervalDamage;
        }

        public int getDuration() {
            return duration;
        }

        public int getCooldown() {
            return cooldown;
        }

        public int getCostNextLevel() {
            return costNextLevel;
        }

        public int getNextLevelStudyTime() {
            return nextLevelStudyTime;
        }

        @Override
        public String toString() {
            return nameEng;
        }
    }
}
