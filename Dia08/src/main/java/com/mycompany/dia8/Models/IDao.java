package com.mycompany.dia8.Models;

import java.util.List;

public interface IDao<T> {
    public List<T> listar();
    public T insertar();
    public T actualizar();
    public T eliminar();
}
