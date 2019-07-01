/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.buenosaries.vistas;
import java.util.List;
import javax.swing.Action;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.NbBundle.Messages;
import org.openide.util.Utilities;
import static org.buenosaries.vistas.Bundle.*;

public class UserRootNode extends AbstractNode {

    @Messages("CTRL_RootName=Usuarios (Click derecho para actualizar)")
    public UserRootNode(Children kids) {
        super(kids);
        setDisplayName(CTRL_RootName());
    }

    @Override
    public Action[] getActions(boolean context) {
        List<? extends Action> actionsForUser = Utilities.actionsForPath("Actions/User");
        return actionsForUser.toArray(new Action[actionsForUser.size()]);
    }

}