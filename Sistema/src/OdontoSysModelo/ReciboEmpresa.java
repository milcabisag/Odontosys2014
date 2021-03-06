package OdontoSysModelo;
// Generated 24/07/2014 08:45:38 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ReciboEmpresa generated by hbm2java
 */
@Entity
@Table(name="recibo_empresa"
    ,catalog="odontosys"
)
public class ReciboEmpresa  implements java.io.Serializable {


     private Integer idreciboEmpresa;
     private Empresa empresa;
     private Usuario usuario;
     private FacturaEmpresa facturaEmpresa;
     private Date fecha;
     private int monto;
     private Set<MovimientoEmpresa> movimientoEmpresas = new HashSet<MovimientoEmpresa>(0);
     private Set<DetalleReciboemp> detalleReciboemps = new HashSet<DetalleReciboemp>(0);

    public ReciboEmpresa() {
    }

	
    public ReciboEmpresa(Empresa empresa, Usuario usuario, FacturaEmpresa facturaEmpresa, Date fecha, int monto) {
        this.empresa = empresa;
        this.usuario = usuario;
        this.facturaEmpresa = facturaEmpresa;
        this.fecha = fecha;
        this.monto = monto;
    }
    public ReciboEmpresa(Empresa empresa, Usuario usuario, FacturaEmpresa facturaEmpresa, Date fecha, int monto, Set<MovimientoEmpresa> movimientoEmpresas, Set<DetalleReciboemp> detalleReciboemps) {
       this.empresa = empresa;
       this.usuario = usuario;
       this.facturaEmpresa = facturaEmpresa;
       this.fecha = fecha;
       this.monto = monto;
       this.movimientoEmpresas = movimientoEmpresas;
       this.detalleReciboemps = detalleReciboemps;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idrecibo_empresa", unique=true, nullable=false)
    public Integer getIdreciboEmpresa() {
        return this.idreciboEmpresa;
    }
    
    public void setIdreciboEmpresa(Integer idreciboEmpresa) {
        this.idreciboEmpresa = idreciboEmpresa;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_empresa", nullable=false)
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_usuario", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_facturaemp", nullable=false)
    public FacturaEmpresa getFacturaEmpresa() {
        return this.facturaEmpresa;
    }
    
    public void setFacturaEmpresa(FacturaEmpresa facturaEmpresa) {
        this.facturaEmpresa = facturaEmpresa;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha", nullable=false, length=10)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="monto", nullable=false)
    public int getMonto() {
        return this.monto;
    }
    
    public void setMonto(int monto) {
        this.monto = monto;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="reciboEmpresa")
    public Set<MovimientoEmpresa> getMovimientoEmpresas() {
        return this.movimientoEmpresas;
    }
    
    public void setMovimientoEmpresas(Set<MovimientoEmpresa> movimientoEmpresas) {
        this.movimientoEmpresas = movimientoEmpresas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="reciboEmpresa")
    public Set<DetalleReciboemp> getDetalleReciboemps() {
        return this.detalleReciboemps;
    }
    
    public void setDetalleReciboemps(Set<DetalleReciboemp> detalleReciboemps) {
        this.detalleReciboemps = detalleReciboemps;
    }




}


