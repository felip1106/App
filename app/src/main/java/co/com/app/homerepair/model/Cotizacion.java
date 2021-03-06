package co.com.app.homerepair.model;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToOne;

import co.com.app.homerepair.dao.ClientesDao;
import co.com.app.homerepair.dao.CotizacionDao;
import co.com.app.homerepair.dao.DaoSession;
import co.com.app.homerepair.dao.ProveedorDao;
import co.com.app.homerepair.dao.SolicitudDao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "COTIZACION".
 */
@Entity(active = true)
public class Cotizacion {

    @Id(autoincrement = true)
    private Long id;
    private String cot_valor;
    private String cot_estado;
    private long cot_cl_id;
    private Long cot_prov_id;
    private Long cot_sol_id;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient CotizacionDao myDao;

    @ToOne(joinProperty = "cot_cl_id")
    private Clientes clientes;

    @Generated
    private transient Long clientes__resolvedKey;

    @ToOne(joinProperty = "cot_prov_id")
    private Proveedor proveedor;

    @Generated
    private transient Long proveedor__resolvedKey;

    @ToOne(joinProperty = "cot_sol_id")
    private Solicitud solicitud;

    @Generated
    private transient Long solicitud__resolvedKey;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public Cotizacion() {
    }

    public Cotizacion(Long id) {
        this.id = id;
    }

    @Generated
    public Cotizacion(Long id, String cot_valor, String cot_estado, long cot_cl_id, Long cot_prov_id, Long cot_sol_id) {
        this.id = id;
        this.cot_valor = cot_valor;
        this.cot_estado = cot_estado;
        this.cot_cl_id = cot_cl_id;
        this.cot_prov_id = cot_prov_id;
        this.cot_sol_id = cot_sol_id;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getCotizacionDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCot_valor() {
        return cot_valor;
    }

    public void setCot_valor(String cot_valor) {
        this.cot_valor = cot_valor;
    }

    public String getCot_estado() {
        return cot_estado;
    }

    public void setCot_estado(String cot_estado) {
        this.cot_estado = cot_estado;
    }

    public long getCot_cl_id() {
        return cot_cl_id;
    }

    public void setCot_cl_id(long cot_cl_id) {
        this.cot_cl_id = cot_cl_id;
    }

    public Long getCot_prov_id() {
        return cot_prov_id;
    }

    public void setCot_prov_id(Long cot_prov_id) {
        this.cot_prov_id = cot_prov_id;
    }

    public Long getCot_sol_id() {
        return cot_sol_id;
    }

    public void setCot_sol_id(Long cot_sol_id) {
        this.cot_sol_id = cot_sol_id;
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Clientes getClientes() {
        long __key = this.cot_cl_id;
        if (clientes__resolvedKey == null || !clientes__resolvedKey.equals(__key)) {
            __throwIfDetached();
            ClientesDao targetDao = daoSession.getClientesDao();
            Clientes clientesNew = targetDao.load(__key);
            synchronized (this) {
                clientes = clientesNew;
            	clientes__resolvedKey = __key;
            }
        }
        return clientes;
    }

    @Generated
    public void setClientes(Clientes clientes) {
        if (clientes == null) {
            throw new DaoException("To-one property 'cot_cl_id' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.clientes = clientes;
            cot_cl_id = clientes.getId();
            clientes__resolvedKey = cot_cl_id;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Proveedor getProveedor() {
        Long __key = this.cot_prov_id;
        if (proveedor__resolvedKey == null || !proveedor__resolvedKey.equals(__key)) {
            __throwIfDetached();
            ProveedorDao targetDao = daoSession.getProveedorDao();
            Proveedor proveedorNew = targetDao.load(__key);
            synchronized (this) {
                proveedor = proveedorNew;
            	proveedor__resolvedKey = __key;
            }
        }
        return proveedor;
    }

    @Generated
    public void setProveedor(Proveedor proveedor) {
        synchronized (this) {
            this.proveedor = proveedor;
            cot_prov_id = proveedor == null ? null : proveedor.getId();
            proveedor__resolvedKey = cot_prov_id;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Solicitud getSolicitud() {
        Long __key = this.cot_sol_id;
        if (solicitud__resolvedKey == null || !solicitud__resolvedKey.equals(__key)) {
            __throwIfDetached();
            SolicitudDao targetDao = daoSession.getSolicitudDao();
            Solicitud solicitudNew = targetDao.load(__key);
            synchronized (this) {
                solicitud = solicitudNew;
            	solicitud__resolvedKey = __key;
            }
        }
        return solicitud;
    }

    @Generated
    public void setSolicitud(Solicitud solicitud) {
        synchronized (this) {
            this.solicitud = solicitud;
            cot_sol_id = solicitud == null ? null : solicitud.getId();
            solicitud__resolvedKey = cot_sol_id;
        }
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void delete() {
        __throwIfDetached();
        myDao.delete(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void update() {
        __throwIfDetached();
        myDao.update(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void refresh() {
        __throwIfDetached();
        myDao.refresh(this);
    }

    @Generated
    private void __throwIfDetached() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
