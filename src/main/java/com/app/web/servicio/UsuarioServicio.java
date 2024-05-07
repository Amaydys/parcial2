package com.app.web.servicio;
import com.app.web.entidades.Usuario;
import java.util.List;


public interface UsuarioServicio {
	public List<Usuario> listarTodosLosUsuarios();
	public Usuario guardarUsuario(Usuario usuario);
	public Usuario obtenerUsuarioPorId(Long id);
	public Usuario actualizarUsuario(Usuario usuario);
	public void eliminarUsuario(Long id);

}
