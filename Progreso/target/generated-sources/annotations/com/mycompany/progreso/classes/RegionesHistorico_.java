package com.mycompany.progreso.classes;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RegionesHistorico.class)
public abstract class RegionesHistorico_ {

	public static volatile SingularAttribute<RegionesHistorico, Integer> padre;
	public static volatile SingularAttribute<RegionesHistorico, String> codigo;
	public static volatile SingularAttribute<RegionesHistorico, String> tipo;
	public static volatile SingularAttribute<RegionesHistorico, LocalDateTime> fechaCreado;
	public static volatile SingularAttribute<RegionesHistorico, Integer> historicoId;
	public static volatile SingularAttribute<RegionesHistorico, String> nombre;

	public static final String PADRE = "padre";
	public static final String CODIGO = "codigo";
	public static final String TIPO = "tipo";
	public static final String FECHA_CREADO = "fechaCreado";
	public static final String HISTORICO_ID = "historicoId";
	public static final String NOMBRE = "nombre";

}

