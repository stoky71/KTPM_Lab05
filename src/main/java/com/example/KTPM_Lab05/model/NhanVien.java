package com.example.KTPM_Lab05.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "nhanvien")
public class NhanVien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8176082006202926066L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaNV")
	private String maNV;
	
	@Column(name = "Ten")
	private String ten;
	
	@Column(name = "Luong")
	private Integer luong;

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", ten=" + ten + ", luong=" + luong + "]";
	}
	
}
