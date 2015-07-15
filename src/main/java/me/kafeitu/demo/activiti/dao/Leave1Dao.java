package me.kafeitu.demo.activiti.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManagerFactory;

import me.kafeitu.demo.activiti.entity.oa.Leave;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.SimpleExpression;
import org.hibernate.ejb.HibernateEntityManagerFactory;
import org.hibernate.sql.JoinType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class Leave1Dao{
//	@Autowired
//	private SessionFactory sessionFactory;
	
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	private Session getCurrentSession(){
		SessionFactory sessionfactory = ((HibernateEntityManagerFactory)entityManagerFactory).getSessionFactory();
		return sessionfactory.openSession();
		
//		Session session = entityManagerFactory.createEntityManager().unwrap(Session.class);
//		return session;
	}
	
	@SuppressWarnings("unchecked")
	public List<Leave> findByCreateria(Set<Criterion> criterions){
		Criteria criteria = getCurrentSession().createCriteria(Leave.class, "leave");
		criteria.createAlias("leave.historicTaskInstances", "historyTask", JoinType.LEFT_OUTER_JOIN);
		
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		
		setParams(criteria, criterions);
		return criteria.list();
	}
	
	
	protected void setParams(Criteria criteria, Set<Criterion> criterions) {
		for(Criterion criterion : criterions){
			if(criterion instanceof SimpleExpression){
				criteria.add(criterion);
			}else if(criterion instanceof Order){
				criteria.addOrder((Order) criterion);
			}else{
				System.out.println("Not implemented yet!");
			}
		}
	}
}
