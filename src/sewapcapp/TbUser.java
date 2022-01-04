/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewapcapp;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Faidur
 */
@Entity
@Table(name = "tb_user", catalog = "db_warnet", schema = "")
@NamedQueries({
    @NamedQuery(name = "TbUser.findAll", query = "SELECT t FROM TbUser t")
    , @NamedQuery(name = "TbUser.findByUserid", query = "SELECT t FROM TbUser t WHERE t.userid = :userid")
    , @NamedQuery(name = "TbUser.findByUsername", query = "SELECT t FROM TbUser t WHERE t.username = :username")
    , @NamedQuery(name = "TbUser.findByPassword", query = "SELECT t FROM TbUser t WHERE t.password = :password")})
public class TbUser implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userid")
    private Integer userid;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    public TbUser() {
    }

    public TbUser(Integer userid) {
        this.userid = userid;
    }

    public TbUser(Integer userid, String username, String password) {
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        Integer oldUserid = this.userid;
        this.userid = userid;
        changeSupport.firePropertyChange("userid", oldUserid, userid);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUser)) {
            return false;
        }
        TbUser other = (TbUser) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sewapcapp.TbUser[ userid=" + userid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
