package com.example.KTPM_Lab05.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;

public class ChungNhanID implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8118334262964867951L;

	@Basic
	@Column(name = "MaNV")
	private String maNV;
	
	@Basic(optional = false)
	@Column(name = "MaMB")
	private Integer maMB;

	@Override
	public String toString() {
		return "ChungNhanID [maNV=" + maNV + ", maMB=" + maMB + "]";
	}
	
}
