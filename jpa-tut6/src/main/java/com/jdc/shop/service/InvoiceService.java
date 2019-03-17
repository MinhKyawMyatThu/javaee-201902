package com.jdc.shop.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.jdc.shop.entity.Invoice;

@Stateless
@LocalBean
public class InvoiceService {

	@PersistenceContext
	private EntityManager em;

	public void save(Invoice invoice) {
		em.merge(invoice);
	}
}
