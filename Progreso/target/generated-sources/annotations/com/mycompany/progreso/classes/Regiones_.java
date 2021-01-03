package com.mycompany.progreso.classes;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Regiones.class)
public abstract class Regiones_ {

	public static volatile SingularAttribute<Regiones, Integer> padre;
	public static volatile SingularAttribute<Regiones, String> codigo;
	public static volatile SingularAttribute<Regiones, Integer> regionId;
	public static volatile SingularAttribute<Regiones, Regiones> padreRegiones;
	public static volatile ListAttribute<Regiones, Regiones> regionesHijasList;
	public static volatile SingularAttribute<Regiones, String> nombre;

	public static final String PADRE = "padre";
	public static final String CODIGO = "codigo";
	public static final String REGION_ID = "regionId";
	public static final String PADRE_REGIONES = "padreRegiones";
	public static final String REGIONES_HIJAS_LIST = "regionesHijasList";
	public static final String NOMBRE = "nombre";

}

