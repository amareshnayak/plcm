package com.hendisantika.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "euicc")
public class User {
	
	@Id
	@Column(name = "eid")
	private String eid;
	@Column(name = "eum_name")
    private String eum_name;
    @Column(name = "euicc_type")
    private String euicc_type;
    @Column(name = "bootstrap_info")
    private String bootstrapInfo;

    @Column(name = "sr_id")
    private String sr_id;
    @Column(name = "status")
    private String status;
    @Column
    private String username;

    @Column
    @JsonIgnore
    private String password;
    
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEum_name() {
		return eum_name;
	}
	public void setEum_name(String eum_name) {
		this.eum_name = eum_name;
	}
	public String getEuicc_type() {
		return euicc_type;
	}
	public void setEuicc_type(String euicc_type) {
		this.euicc_type = euicc_type;
	}
	public String getBootstrapInfo() {
		return bootstrapInfo;
	}
	public void setBootstrapInfo(String bootstrapInfo) {
		this.bootstrapInfo = bootstrapInfo;
	}
	public String getSr_id() {
		return sr_id;
	}
	public void setSr_id(String sr_id) {
		this.sr_id = sr_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    

   
}
