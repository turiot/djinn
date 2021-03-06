/*
 * Created on Dec 21, 2005
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
package com.scramcode.djinn.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

import com.scramcode.djinn.Launcher;
import com.scramcode.djinn.ui.actions.QuitAction;
import com.scramcode.djinn.ui.i18n.Messages;
import com.scramcode.djinn.ui.menu.ApplicationMenu;
import com.scramcode.djinn.ui.panels.DependencyListPanel;
import com.scramcode.djinn.ui.panels.WorkspacePanel;


public class DjinnFrame extends javax.swing.JFrame {
        
    /** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = 1L;
    
    private WorkspacePanel workspacePanel = new WorkspacePanel();
    
    private ApplicationMenu menuBar = new ApplicationMenu();    
    
    private JTabbedPane tabbedPane = new JTabbedPane();
    
    private DependencyListPanel dependencyDetailsPanel = new DependencyListPanel();
    
    public DjinnFrame() {
        
        setTitle(Messages.getString("DjinnFrame.title", Launcher.version));
        
        setSize(new Dimension(640,480));
        setPreferredSize(new Dimension(640,480));
        setLocationByPlatform(true);
        
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        JSplitPane vSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        splitPane.setResizeWeight(0.2d);
        splitPane.add(workspacePanel, JSplitPane.LEFT);
        splitPane.add(vSplitPane, JSplitPane.RIGHT);
                        
        vSplitPane.setResizeWeight(0.8d);
        vSplitPane.add(tabbedPane, JSplitPane.TOP);
        vSplitPane.add(dependencyDetailsPanel, JSplitPane.BOTTOM);
        
        this.getContentPane().add(splitPane, BorderLayout.CENTER);
        
        setJMenuBar(menuBar);
        
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new QuitAction().actionPerformed(null);
            }            
        });
        
    }

    public ApplicationMenu getApplicationMenu() {
        return this.menuBar;
    }

    public WorkspacePanel getWorkspacePanel() {
        return this.workspacePanel;
    }
    
    public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public DependencyListPanel getDependencyDetailsPanel() {
		return dependencyDetailsPanel;
	}
        
}
