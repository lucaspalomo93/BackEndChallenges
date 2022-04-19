package controllers;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/usuario")
public class UsuarioController {
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String consulta(){
        return "Consultando todos los registros";
    }
    
    @GET
    @Path("/{id}")
    public String consultaRegistro(@PathParam("id") int id){
        return "Consultando un registro " + id;
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String agregarRegistro(){
        return "Agregando registro";
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public String actualizandoRegistro(@PathParam("id") int id){
        return "Actualizando el registro " + id;
    }
    
    @DELETE
    @Path("/{id}")
    public String eliminarRegistro(@PathParam("id") int id){
        return "Eliminando el registro " + id;
    }
}
