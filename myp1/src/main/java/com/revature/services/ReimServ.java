package com.revature.services;

import java.util.List;
import java.util.Optional;

import com.revature.beans.Reimbursement;


public interface ReimServ {

	public List<Reimbursement> findAll();

	public List<Reimbursement> findPending();

	public List<Reimbursement> findApproved();

	public Reimbursement updateReimbursementStatus(int id,int status);
	
	public List<Reimbursement> findByAuthor(int id);
    
	public static Optional<Reimbursement> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	 
	public Reimbursement save(Reimbursement item);
	public void deleteById(int id);
	

}
