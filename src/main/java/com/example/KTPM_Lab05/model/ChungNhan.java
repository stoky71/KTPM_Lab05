package com.example.KTPM_Lab05.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "chungnhan")
public class ChungNhan implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 137610835084861528L;

	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name = "MaNV", referencedColumnName = "MaNV", insertable = false, updatable = false)
	private NhanVien nhanVien;
	
	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name = "MaMB", referencedColumnName = "MaMB", insertable = false, updatable = false)
	private MayBay mayBay;

	@Override
	public String toString() {
		return "ChungNhan [nhanVien=" + nhanVien + ", mayBay=" + mayBay + "]";
	}
	
}
