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
@Table(name = "tb_komputer", catalog = "db_warnet", schema = "")
@NamedQueries({
    @NamedQuery(name = "TbKomputer.findAll", query = "SELECT t FROM TbKomputer t")
    , @NamedQuery(name = "TbKomputer.findByIdKom", query = "SELECT t FROM TbKomputer t WHERE t.idKom = :idKom")
    , @NamedQuery(name = "TbKomputer.findByNama", query = "SELECT t FROM TbKomputer t WHERE t.nama = :nama")
    , @NamedQuery(name = "TbKomputer.findByCpu", query = "SELECT t FROM TbKomputer t WHERE t.cpu = :cpu")
    , @NamedQuery(name = "TbKomputer.findByGpu", query = "SELECT t FROM TbKomputer t WHERE t.gpu = :gpu")
    , @NamedQuery(name = "TbKomputer.findByRam", query = "SELECT t FROM TbKomputer t WHERE t.ram = :ram")})
public class TbKomputer implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_kom")
    private Integer idKom;
    @Basic(optional = false)
    @Column(name = "Nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "CPU")
    private String cpu;
    @Basic(optional = false)
    @Column(name = "GPU")
    private String gpu;
    @Basic(optional = false)
    @Column(name = "RAM")
    private String ram;

    public TbKomputer() {
    }

    public TbKomputer(Integer idKom) {
        this.idKom = idKom;
    }

    public TbKomputer(Integer idKom, String nama, String cpu, String gpu, String ram) {
        this.idKom = idKom;
        this.nama = nama;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }

    public Integer getIdKom() {
        return idKom;
    }

    public void setIdKom(Integer idKom) {
        Integer oldIdKom = this.idKom;
        this.idKom = idKom;
        changeSupport.firePropertyChange("idKom", oldIdKom, idKom);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        String oldCpu = this.cpu;
        this.cpu = cpu;
        changeSupport.firePropertyChange("cpu", oldCpu, cpu);
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        String oldGpu = this.gpu;
        this.gpu = gpu;
        changeSupport.firePropertyChange("gpu", oldGpu, gpu);
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        String oldRam = this.ram;
        this.ram = ram;
        changeSupport.firePropertyChange("ram", oldRam, ram);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKom != null ? idKom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbKomputer)) {
            return false;
        }
        TbKomputer other = (TbKomputer) object;
        if ((this.idKom == null && other.idKom != null) || (this.idKom != null && !this.idKom.equals(other.idKom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sewapcapp.TbKomputer[ idKom=" + idKom + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
