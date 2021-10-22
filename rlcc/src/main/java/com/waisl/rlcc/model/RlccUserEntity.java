package com.waisl.rlcc.model;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;

import lombok.Data;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  (name="[CRONUS LS 90001 W1 Demo$CCTV POS Trans_ Line]")
@Data
@Table
public class RlccUserEntity  
{  
//Defining book id as primary key  
	 @Id
	 @Column
	    private long id;
@Column  
private String username;  
@Column  
private String password;

}  