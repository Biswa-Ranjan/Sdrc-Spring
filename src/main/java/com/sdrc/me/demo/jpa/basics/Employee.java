package com.sdrc.me.demo.jpa.basics;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

/*
 * @Entity defines that a class can be mapped to a database table.
 * It is a marker.
 * why @Entity annotation is mandatory?
 * In JPA in order to create a new entity u have to do 2 manadatory things
 * firts @Entity and @Id(primary key is mandatory)
 * */
@Entity
/*
 * It is an optional annotation and used to specify details of the table
 * The following are the properties of an @Table annotation
 * indexes="",
 * catalog ="", 
 * Some databases contains schemas, some contains catalogs, and some contains both. 
 * When logging in with a specific user, some databases defaults the schema/catalog to the user's namespace,
 * causing the table to not be visible to other users, thus, causing the need to use a "common" namespace
 * schema="", specifies the schema to which the table belongs
 * name="", specifies the name of the table overriding entity naming convention
 * uniqueConstraints="" specifies the unique constriants that are going to be used on table creation
 * 
 * */
@Table(name="employee_table",indexes={
		@Index(name="table_index_1",columnList="empName"),
		@Index(name="table_index_2",columnList="empAddress")
	})
/*@Table(name="employee_table",indexes={
@Index(name="hello",columnList="empName,empAddress")
})*/
public class Employee {

	/*
	 * @Column properties
	 * insertable=true, whether column is included in sql insert statement or not
	 * length=78, applicable only if string valued column is used
	 * name="emp_id",
	 * nullable=true,
	 * precision=2, the precision for decimal places
	 * unique=true,
	 * updatable=true  whether column is included in sql update statement or not
	 * columnDefinition= ‘INT(11) NOT NULL COMMENT '0 for no action, 1 for executed, 2 for validated, 3 for aproved'
	 * 
	 * 
	 * */
	
	@Id
	@Column(insertable=true,length=10,name="emp_id",nullable=true,precision=2,unique=true,updatable=false)
	private int empId;
	@Column()
	private String empName;
	
	private String empAddress;
	
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
