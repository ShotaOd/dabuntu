package org.dabuntu.sample.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author ubuntu 2016/10/04.
 */
@Getter
@Setter
@Entity
public class Product {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Integer price;
}
