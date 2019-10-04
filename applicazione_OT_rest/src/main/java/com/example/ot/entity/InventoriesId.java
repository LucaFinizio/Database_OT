package com.example.ot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InventoriesId implements Serializable{
	    /**
	     * 
	 	*/
		private static final long serialVersionUID = 1L;

		@Column(name = "product_id")
	    private int product_id;
	    
	    @Column(name = "warehouse_id")
	    private int warehouse_id;
}
