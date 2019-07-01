/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.buenosaires.u;

/**
 *
 * @author tarkus
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

@ActionID(id="org.buenosaires.u.UserNewActionListener", category="File")
@ActionRegistration(displayName="#CTL_UserNewActionListener")
@ActionReference(path="Menu/File", position=10)
@Messages("CTL_UserNewActionListener=New")
public final class UserNewActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        EditorUserTopComponent tc = (EditorUserTopComponent) WindowManager.getDefault().findTopComponent("EditorUserTopComponent");
        tc.resetFields();
        tc.open();
        tc.requestActive();
    }

}

