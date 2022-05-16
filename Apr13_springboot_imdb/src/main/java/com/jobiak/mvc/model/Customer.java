package com.jobiak.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Customer {

	@Id
	private long acctno;
	private String name;
	private double balance;
}

 
