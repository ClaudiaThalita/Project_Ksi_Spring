package com.claudiathalita.apiksi.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_json")
public class Json implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String[] accepted_devices;
    private String[] rejected_devices;



	public String[] getAccepted_devices() {
        return accepted_devices;
    }

    public void setAccepted_devices(String[] accepted_devices) {
        this.accepted_devices = accepted_devices;
    }

    public String[] getRejected_devices() {
        return rejected_devices;
    }

    public void setRejected_devices(String[] rejected_devices) {
        this.rejected_devices = rejected_devices;
    }


	public Json() {
		// TODO Auto-generated constructor stub
	}

	public Json(String[] accepted_devices, String[] rejected_devices) {
		super();
		this.accepted_devices = accepted_devices;
		this.rejected_devices = rejected_devices;
	}




    
 
}


