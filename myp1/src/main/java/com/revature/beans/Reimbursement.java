package com.revature.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ers_reimbursement")
public class Reimbursement {
       
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name="reimb_id")
	  private int reimId;
	  @Column(name="reimb_amount")
	  private float amount;
	  @Column(name="reimb_submitted")
	  private Date submitted;
	  @Column(name="reimb_resolved")
	  private Date resolved;
	  @Column(name="reimb_description")
	  private String description;
	  @Column(name="reimb_author")
	  private int author;
	  @Column(name="reimb_resolver")
	  private int resolver;
	  @Column(name="reimb_status_id")
	  private int status;
	  @Column(name="reimb_type_id")
	  private int reimType;
	
	  
	  public Reimbursement(int reimId, float amount, Date submitted, Date resolved, String description, int author,
			int resolver, int status, int reimType) {
		super();
		this.reimId = reimId;
		this.amount = amount;
		this.submitted = submitted;
		this.resolved = resolved;
		this.description = description;
		this.author = author;
		this.resolver = resolver;
		this.status = status;
		this.reimType = reimType;
	}


	/**
	 * @return the reimId
	 */
	public int getReimId() {
		return reimId;
	}


	/**
	 * @param reimId the reimId to set
	 */
	public void setReimId(int reimId) {
		this.reimId = reimId;
	}


	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}


	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}


	/**
	 * @return the submitted
	 */
	public Date getSubmitted() {
		return submitted;
	}


	/**
	 * @param submitted the submitted to set
	 */
	public void setSubmitted(Date submitted) {
		this.submitted = submitted;
	}


	/**
	 * @return the resolved
	 */
	public Date getResolved() {
		return resolved;
	}


	/**
	 * @param resolved the resolved to set
	 */
	public void setResolved(Date resolved) {
		this.resolved = resolved;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the author
	 */
	public int getAuthor() {
		return author;
	}


	/**
	 * @param author the author to set
	 */
	public void setAuthor(int author) {
		this.author = author;
	}


	/**
	 * @return the resolver
	 */
	public int getResolver() {
		return resolver;
	}


	/**
	 * @param resolver the resolver to set
	 */
	public void setResolver(int resolver) {
		this.resolver = resolver;
	}


	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}


	/**
	 * @return the reimType
	 */
	public int getReimType() {
		return reimType;
	}


	/**
	 * @param reimType the reimType to set
	 */
	public void setReimType(int reimType) {
		this.reimType = reimType;
	}
	  
	  
	  
}