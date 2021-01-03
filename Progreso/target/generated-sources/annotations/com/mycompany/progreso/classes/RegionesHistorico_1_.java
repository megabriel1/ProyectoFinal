package com.mycompany.progreso.classes;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RegionesHistorico_1.class)
public abstract class RegionesHistorico_1_ {

	public static volatile SingularAttribute<RegionesHistorico_1, Integer> padre;
	public static volatile SingularAttribute<RegionesHistorico_1, String> codigo;
	public static volatile SingularAttribute<RegionesHistorico_1, String> tipo;
	public static volatile SingularAttribute<RegionesHistorico_1, LocalDateTime> fechaCreado;
	public static volatile SingularAttribute<RegionesHistorico_1, Integer> regionId;
	public static volatile SingularAttribute<RegionesHistorico_1, Integer> historicoId;
	public static volatile SingularAttribute<RegionesHistorico_1, String> nombre;

	public static final String PADRE = "padre";
	public static final String CODIGO = "codigo";
	public static final String TIPO = "tipo";
	public static final String FECHA_CREADO = "fechaCreado";
	public static final String REGION_ID = "regionId";
	public static final String HISTORICO_ID = "historicoId";
	public static final String NOMBRE = "nombre";

}

