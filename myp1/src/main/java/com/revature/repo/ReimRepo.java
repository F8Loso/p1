package com.revature.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.beans.Reimbursement;



public interface ReimRepo extends JpaRepository<Reimbursement, Integer> {

	public List<Reimbursement> findByStatus(int statusId);
	
	public List<Reimbursement> findByAuthor(int authorId);

}
