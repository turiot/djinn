package com.scramcode.djinn.ui.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.scramcode.djinn.ui.Application;
import com.scramcode.djinn.ui.dialogs.WorkspaceEditorDialogController;
import com.scramcode.djinn.ui.i18n.Images;
import com.scramcode.djinn.ui.i18n.Messages;

public class EditWorkspaceAction extends AbstractAction {
	
	private static final long serialVersionUID = 1L;

	public EditWorkspaceAction(boolean enabled) {
        super(Messages.getString("EditWorkspaceAction.label"), Images.getIcon("EditWorkspaceAction.icon") );        
        setEnabled(enabled);
	}

	public void actionPerformed(ActionEvent event) {		
		WorkspaceEditorDialogController dialog = Application.getInstance().getWorkspaceEditorDialogController();		
		dialog.isEdit = true;
		dialog.setVisible(true);		
	}

}
