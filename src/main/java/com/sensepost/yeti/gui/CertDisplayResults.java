package com.sensepost.yeti.gui;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

import com.sensepost.yeti.common.UtilFunctions;
import com.sensepost.yeti.controllers.CertController;
import com.sensepost.yeti.models.CertModel;
import com.sensepost.yeti.reports.ResultExport;
import com.sensepost.yeti.persistence.DataStore;
import java.io.IOException;

/**
 *
 * @author willemmouton
 */
public class CertDisplayResults extends javax.swing.JPanel implements DisplayResultIFace {

    private static final long serialVersionUID = 1L;

//	private CertController parent = null;
    public CertDisplayResults(CertController c) {
        initComponents();
//        this.parent = c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmCertPopup = new javax.swing.JPopupMenu();
        miOpenInBrowser = new javax.swing.JMenuItem();
        miWhois = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        miSelectKnownDomains = new javax.swing.JMenuItem();
        miSelectAll = new javax.swing.JMenuItem();
        miUnselectAll = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miSelectAllFromIp = new javax.swing.JMenuItem();
        miUnselectAllFromIp = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        miSelectAllFromDomain = new javax.swing.JMenuItem();
        miUnselectAllFromDomain = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        btnTrimUnchecked = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResults = new javax.swing.JTable();

        pmCertPopup.setName("pmCertPopup"); // NOI18N

        miOpenInBrowser.setText("Open in browser"); // NOI18N
        miOpenInBrowser.setName("miOpenInBrowser"); // NOI18N
        miOpenInBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOpenInBrowserActionPerformed(evt);
            }
        });
        pmCertPopup.add(miOpenInBrowser);

        miWhois.setText("Whois"); // NOI18N
        miWhois.setName("miWhois"); // NOI18N
        miWhois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miWhoisActionPerformed(evt);
            }
        });
        pmCertPopup.add(miWhois);

        jSeparator3.setName("jSeparator3"); // NOI18N
        pmCertPopup.add(jSeparator3);

        miSelectKnownDomains.setText("Select known domains"); // NOI18N
        miSelectKnownDomains.setName("miSelectKnownDomains"); // NOI18N
        miSelectKnownDomains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSelectKnownDomainsActionPerformed(evt);
            }
        });
        pmCertPopup.add(miSelectKnownDomains);

        miSelectAll.setText("Select all"); // NOI18N
        miSelectAll.setName("miSelectAll"); // NOI18N
        miSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSelectAllActionPerformed(evt);
            }
        });
        pmCertPopup.add(miSelectAll);

        miUnselectAll.setText("Unselect all"); // NOI18N
        miUnselectAll.setName("miUnselectAll"); // NOI18N
        miUnselectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUnselectAllActionPerformed(evt);
            }
        });
        pmCertPopup.add(miUnselectAll);

        jSeparator1.setName("jSeparator1"); // NOI18N
        pmCertPopup.add(jSeparator1);

        miSelectAllFromIp.setText("Select all from this ip"); // NOI18N
        miSelectAllFromIp.setName("miSelectAllFromIp"); // NOI18N
        miSelectAllFromIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSelectAllFromIpActionPerformed(evt);
            }
        });
        pmCertPopup.add(miSelectAllFromIp);

        miUnselectAllFromIp.setText("Unselect all from this ip"); // NOI18N
        miUnselectAllFromIp.setName("miUnselectAllFromIp"); // NOI18N
        miUnselectAllFromIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUnselectAllFromIpActionPerformed(evt);
            }
        });
        pmCertPopup.add(miUnselectAllFromIp);

        jSeparator2.setName("jSeparator2"); // NOI18N
        pmCertPopup.add(jSeparator2);

        miSelectAllFromDomain.setText("Select all from this domain"); // NOI18N
        miSelectAllFromDomain.setName("miSelectAllFromDomain"); // NOI18N
        miSelectAllFromDomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSelectAllFromDomainActionPerformed(evt);
            }
        });
        pmCertPopup.add(miSelectAllFromDomain);

        miUnselectAllFromDomain.setText("Unselect all from this domain"); // NOI18N
        miUnselectAllFromDomain.setName("miUnselectAllFromDomain"); // NOI18N
        miUnselectAllFromDomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUnselectAllFromDomainActionPerformed(evt);
            }
        });
        pmCertPopup.add(miUnselectAllFromDomain);

        setName("Form"); // NOI18N

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        btnTrimUnchecked.setText("Clear unselected"); // NOI18N
        btnTrimUnchecked.setFocusable(false);
        btnTrimUnchecked.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrimUnchecked.setName("btnTrimUnchecked"); // NOI18N
        btnTrimUnchecked.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTrimUnchecked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrimUncheckedMouseClicked(evt);
            }
        });
        jToolBar1.add(btnTrimUnchecked);

        btnExport.setText("Export"); // NOI18N
        btnExport.setFocusable(false);
        btnExport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExport.setName("btnExport"); // NOI18N
        btnExport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportMouseClicked(evt);
            }
        });
        jToolBar1.add(btnExport);

        btnSave.setText("Save"); // NOI18N
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setName("btnSave"); // NOI18N
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSave);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tblResults.setAutoCreateRowSorter(true);
        tblResults.setComponentPopupMenu(pmCertPopup);
        tblResults.setName("tblResults"); // NOI18N
        tblResults.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResultsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblResults);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jToolBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportMouseClicked
        String filename = UtilFunctions.saveFile(".xls");
        if (!filename.isEmpty()) {
            try {
                ResultExport.ExportCertToXLS(filename, ((CertModel) this.tblResults.getModel()).getData());
            } catch (IOException ex) {
                Logger.getLogger("certDisplayResults.btnExportMouseClicked").log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnExportMouseClicked

//    private void btnPersistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPersistMouseClicked
//        CertModel model = (CertModel)this.tblResults.getModel();
//        DataStore.addCertHosts(model.getData());
//    }//GEN-LAST:event_btnPersistMouseClicked
    private void btnTrimUncheckedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrimUncheckedMouseClicked
        CertModel model = (CertModel) this.tblResults.getModel();
        for (int idx = model.getRowCount() - 1; idx >= 0; idx--) {
            if (!(Boolean) model.getValueAt(idx, 3)) {
                model.deleteRow(idx);
            }
        }
    }//GEN-LAST:event_btnTrimUncheckedMouseClicked

    private void miOpenInBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOpenInBrowserActionPerformed
        String siteAddress = "https://" + ((CertModel) this.tblResults.getModel()).getValueAt(this.tblResults.getSelectedRow(), 0).toString();
        UtilFunctions.launchBrowser(siteAddress);
    }//GEN-LAST:event_miOpenInBrowserActionPerformed

    private void miWhoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miWhoisActionPerformed
        String domain = ((CertModel) this.tblResults.getModel()).getValueAt(this.tblResults.getSelectedRow(), 2).toString();
        //utilFunctions.webWhois(domain);
        try {
            String name = domain.split("\\.", 2)[0];
            String tld = domain.split("\\.", 2)[1];
            DoWhois frmWhoisTool = new DoWhois(name, tld);
            frmWhoisTool.setVisible(true);
        } catch (Exception e) {
            DoWhois frmWhoisTool = new DoWhois();
            frmWhoisTool.setVisible(true);
        }
    }//GEN-LAST:event_miWhoisActionPerformed

    private void miSelectAllFromIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSelectAllFromIpActionPerformed
        String ip = ((CertModel) this.tblResults.getModel()).getValueAt(this.tblResults.getSelectedRow(), 0).toString();
        this.toggleBasedOnIP(ip, true);
    }//GEN-LAST:event_miSelectAllFromIpActionPerformed

    private void miUnselectAllFromIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUnselectAllFromIpActionPerformed
        String ip = ((CertModel) this.tblResults.getModel()).getValueAt(this.tblResults.getSelectedRow(), 0).toString();
        this.toggleBasedOnIP(ip, false);
    }//GEN-LAST:event_miUnselectAllFromIpActionPerformed

    private void miSelectAllFromDomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSelectAllFromDomainActionPerformed
        String domain = ((CertModel) this.tblResults.getModel()).getValueAt(this.tblResults.getSelectedRow(), 2).toString();
        this.toggleBasedOnDomain(domain, true);
    }//GEN-LAST:event_miSelectAllFromDomainActionPerformed

    private void miUnselectAllFromDomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUnselectAllFromDomainActionPerformed
        String domain = ((CertModel) this.tblResults.getModel()).getValueAt(this.tblResults.getSelectedRow(), 2).toString();
        this.toggleBasedOnDomain(domain, false);
    }//GEN-LAST:event_miUnselectAllFromDomainActionPerformed

    private void tblResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultsMouseClicked

}//GEN-LAST:event_tblResultsMouseClicked

    public void saveData() {
        CertModel model = (CertModel) this.tblResults.getModel();
        DataStore.addCertHosts(model.getData());
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        this.saveData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void miSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSelectAllActionPerformed
        CertModel model = (CertModel) this.tblResults.getModel();
        for (int idx = model.getRowCount() - 1; idx >= 0; idx--) {
            model.setValueAt(true, idx, 3);
        }
    }//GEN-LAST:event_miSelectAllActionPerformed

    private void miUnselectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUnselectAllActionPerformed
        CertModel model = (CertModel) this.tblResults.getModel();
        for (int idx = model.getRowCount() - 1; idx >= 0; idx--) {
            model.setValueAt(false, idx, 3);
        }
    }//GEN-LAST:event_miUnselectAllActionPerformed

    private void miSelectKnownDomainsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSelectKnownDomainsActionPerformed
        CertModel model = (CertModel) this.tblResults.getModel();
        List<String> initialDomains = DataStore.getInitialDataItems(DataStore.DOMAIN);
        for (int idx = 0; idx < model.getRowCount(); idx++) {
            String domain = model.getValueAt(idx, 2).toString();
            if (initialDomains.contains(domain)) {
                model.setValueAt(true, idx, 3);
            }
        }
    }//GEN-LAST:event_miSelectKnownDomainsActionPerformed

    private void toggleBasedOnIP(String ip, boolean value) {
        CertModel model = (CertModel) this.tblResults.getModel();
        for (int idx = 0; idx < model.getRowCount(); idx++) {
            String cIp = model.getValueAt(idx, 0).toString();
            if (ip.compareTo(cIp) == 0) {
                model.setValueAt(value, idx, 3);
            }
        }
    }

    private void toggleBasedOnDomain(String domain, boolean value) {
        CertModel model = (CertModel) this.tblResults.getModel();
        for (int idx = 0; idx < model.getRowCount(); idx++) {
            String cIp = model.getValueAt(idx, 2).toString();
            if (domain.compareTo(cIp) == 0) {
                model.setValueAt(value, idx, 3);
            }
        }
    }

//    private void toggleBasedOnCN(String domain, boolean value){
//        CertModel model = (CertModel)this.tblResults.getModel();
//        for (int idx = 0; idx < model.getRowCount(); idx++){
//            String cIp = model.getValueAt(idx, 1).toString();
//            if (domain.compareTo(cIp) == 0){
//                model.setValueAt(value, idx, 3);
//            }
//        }
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnTrimUnchecked;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem miOpenInBrowser;
    private javax.swing.JMenuItem miSelectAll;
    private javax.swing.JMenuItem miSelectAllFromDomain;
    private javax.swing.JMenuItem miSelectAllFromIp;
    private javax.swing.JMenuItem miSelectKnownDomains;
    private javax.swing.JMenuItem miUnselectAll;
    private javax.swing.JMenuItem miUnselectAllFromDomain;
    private javax.swing.JMenuItem miUnselectAllFromIp;
    private javax.swing.JMenuItem miWhois;
    private javax.swing.JPopupMenu pmCertPopup;
    public javax.swing.JTable tblResults;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setModel(DefaultTableModel model) {
        this.tblResults.setModel((CertModel) model);
    }

    @Override
    public DefaultTableModel getModel() {
        return (DefaultTableModel) tblResults.getModel();
    }
}
