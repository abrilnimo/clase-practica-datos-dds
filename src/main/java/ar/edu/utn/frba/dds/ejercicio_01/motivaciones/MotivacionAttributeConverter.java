package ar.edu.utn.frba.dds.ejercicio_01.motivaciones;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
import javax.persistence.Converter;

@Converter
public class MotivacionAttributeConverter implements AttributeConverter<Motivacion, String> {
    @Override
    public String convertToDatabaseColumn(Motivacion motivacion){
        if(motivacion == null){
            return null;
        }
        String stringMotivacion = "";

        if(motivacion instanceof  BajarDePeso){
            stringMotivacion = "BajarDePeso";
        }else if(motivacion instanceof  Mantener){
            stringMotivacion = "Mantener";
        }else if(motivacion instanceof  Tonificar){
            stringMotivacion = "Tonificar";
        }
        return stringMotivacion;
    }
    @Override
    public Motivacion convertToEntityAttribute(String s){
        if(s == null){
            return null;
        }
        Motivacion motivacion;

        switch(s){
            case "BajarDePeso" : motivacion = new BajarDePeso();break;
            case "Mantener" : motivacion = new Mantener(); break;
            case "Tonificar" : motivacion = new Tonificar();break;
            default: motivacion = null;
        }
        return motivacion;
    }
}
