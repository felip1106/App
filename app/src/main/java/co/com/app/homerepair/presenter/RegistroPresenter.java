package co.com.app.homerepair.presenter;

import android.content.Context;
import android.database.sqlite.SQLiteConstraintException;
import android.widget.Toast;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import co.com.app.homerepair.R;
import co.com.app.homerepair.controller.AppController;
import co.com.app.homerepair.dao.ClientesDao;
import co.com.app.homerepair.dao.ProveedorDao;
import co.com.app.homerepair.dao.UsuariosDao;
import co.com.app.homerepair.model.Clientes;
import co.com.app.homerepair.model.Proveedor;
import co.com.app.homerepair.model.Usuarios;
import co.com.app.homerepair.utils.AESCipher;
import co.com.app.homerepair.utils.RSACipher;
import co.com.app.homerepair.view.IRegistroView;
import co.com.app.homerepair.view.RegistroActivity;

/**
 * Created by jfmg9029 on 02/02/2018.
 */

public class RegistroPresenter<V extends IRegistroView> implements IRegistroPresenter<V> {

    @Override
    public Usuarios findUsuarioByNombre(String nombre, Context context) {
        Usuarios usuarios = null;

        UsuariosDao usuariosDao = ((AppController) context).getDaoSession().getUsuariosDao();
        usuarios = usuariosDao.queryBuilder()
                .where(UsuariosDao.Properties.Usu_nombre.eq(nombre)).unique();

        return usuarios;
    }

    @Override
    public void saveUsuario(Usuarios usuario, Context context) {
        UsuariosDao usuariosDao = ((AppController) context).getDaoSession().getUsuariosDao();
        usuariosDao.insert(usuario);
    }

    @Override
    public void saveCliente(Clientes cliente, Context context) {
        ClientesDao clientesDao = ((AppController) context).getDaoSession().getClientesDao();
        clientesDao.insert(cliente);
    }

    @Override
    public void saveRegistroProveedor(Proveedor proveedor, Context context) {
        ProveedorDao proveedorDao = ((AppController) context).getDaoSession().getProveedorDao();
        proveedorDao.insert(proveedor);
    }

}
