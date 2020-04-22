package com.lti.dao;

import java.util.List;

import com.lti.models.AnswerDetails;


@Repository
public interface IAnswerDetailsDao {
	//Select details
	public List<AnswerDetails> readAllAnswerDetails();
	
	
	//Insert details
	public void createAnswerDetails(AnswerDetails answerDetails);
}


public class DemandDetailsDaoImpl implements IDemandDetailsDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public DemandDetailsDaoImpl() {

	}
	@Override
	public List<DemandDetails> readAllDemandDetails() {
		String jpql = "From DemandDetails";
		TypedQuery<DemandDetails> tquery = entityManager.createQuery(jpql, DemandDetails.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createDemandDetails(DemandDetails demandDetails) {
		entityManager.persist(demandDetails);
		
	}
	
	
