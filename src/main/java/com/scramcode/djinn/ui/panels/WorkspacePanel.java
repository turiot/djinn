/*
 * Created on Mar 1, 2006
 * By Fabien Benoit - http://www.scramcode.com 
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.scramcode.djinn.ui.panels;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.WindowConstants;


public class WorkspacePanel extends javax.swing.JPanel {
    
    /** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = 1L;
    
    private JScrollPane workspaceScrollPane;
    
    private JTree packageIndexTree;
    private JPanel panel;
    private JTree workspaceTree;

    /**
    * Auto-generated main method to display this 
    * JPanel inside a new JFrame.
    */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new WorkspacePanel());
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public WorkspacePanel() {
        super();
        initGUI();
    }
    
    private void initGUI() {
        try {
            BorderLayout thisLayout = new BorderLayout();
            this.setLayout(thisLayout);
            this.setPreferredSize(new java.awt.Dimension(248, 334));                                     
            this.add(getPanel(), BorderLayout.CENTER);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public JScrollPane getWorkspaceScrollPane() {
        if (workspaceScrollPane == null) {
            workspaceScrollPane = new JScrollPane();            
            workspaceScrollPane.setViewportView(getWorkspaceTree());
            workspaceScrollPane.setBorder(BorderFactory.createEmptyBorder());
        }
        return workspaceScrollPane;
    }
    
    public JTree getWorkspaceTree() {
        if (workspaceTree == null) {
            workspaceTree = new JTree();
            workspaceTree.setAutoscrolls(true);            
        }
        return workspaceTree;
    }
        
    public JPanel getPanel() {
        if (panel == null) {
            panel = new JPanel();                       
            panel.setLayout(new BorderLayout());            
            panel.add(getWorkspaceScrollPane(), BorderLayout.CENTER);                                                          
        }
        return panel;
    }
    
    public JTree getPackageIndexTree() {
        if (packageIndexTree == null) {
            packageIndexTree = new JTree();
            packageIndexTree.setAutoscrolls(true);
        }
        return packageIndexTree;
    }
    
}
