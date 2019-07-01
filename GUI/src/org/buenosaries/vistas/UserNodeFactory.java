package org.buenosaries.vistas;

import entidades.User;
import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.lookup.Lookups;

public class UserNodeFactory extends ChildFactory<User> {

    private List<User> resultList;

    public UserNodeFactory(List<User> resultList) {
        this.resultList = resultList;
    }

    @Override
    protected boolean createKeys(List<User> list) {
        for (User user : resultList) {
            list.add(user);
        }
        return true;
    }

    @Override
    protected Node createNodeForKey(User u) {
        try {
            UserBeanNode bn = new UserBeanNode(u);
            bn.setDisplayName(u.getUsername());
            return bn;
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
            return null;
        }
    }
    
    private class UserBeanNode extends BeanNode {
        
        public UserBeanNode(User bean) throws IntrospectionException {
            super(bean, Children.LEAF, Lookups.singleton(bean));
        }
    }
}

