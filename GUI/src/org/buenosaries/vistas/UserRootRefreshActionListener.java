/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.buenosaries.vistas;

/**
 *
 * @author tarkus
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(id="org.buenosaires.vistas.UserRootRefreshActionListener", category="User")
@ActionRegistration(displayName="#CTL_UserRootRefreshActionListener")
@Messages("CTL_UserRootRefreshActionListener=Refresh")
public class UserRootRefreshActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        MantenedoresTopComponent.refreshNode();
    }
    
}