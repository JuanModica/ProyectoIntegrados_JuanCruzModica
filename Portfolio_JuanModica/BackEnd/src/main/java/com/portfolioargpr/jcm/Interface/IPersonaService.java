package com.portfolioargpr.jcm.Interface;

import com.portfolioargpr.jcm.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //Traer unas lista de Persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto buscado por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}
