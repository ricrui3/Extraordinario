/*
 * Con la informacion del mensaje
 */
package Cliente;

import java.io.Serializable;

/**
 *
 * @author mrubik
 */
public class Mensaje implements Serializable{
    private String mensaje;
    private int threadId;
    private String usuario;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
