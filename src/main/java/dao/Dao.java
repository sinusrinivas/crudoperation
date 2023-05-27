package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Dto;

public class Dao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void insert(Dto dto) {
		et.begin();
		em.persist(dto);
		et.commit();
	}

	public void update(int sid, String sname, long phno, String gender)

	{
		Dto dto = em.find(Dto.class, sid);
		dto.setSname(sname);
		dto.setPhno(phno);
		dto.setGender(gender);
		et.begin();
		em.persist(dto);
		et.commit();

	}

	public String remove(int sid) {
		Dto dto = em.find(Dto.class, sid);
		if (dto != null) {
			et.begin();
			em.remove(dto);
			et.commit();
			return "data deleted";
		} else {
			return "Data not found";

		}
	}

	public String fetch(int sid)

	{
		et.begin();
		Dto dto = em.find(Dto.class, sid);
		String msg = " " + dto.getSid() + " " + dto.getSname() + " " + dto.getGender() + " " + dto.getPhno();
		et.commit();
		return msg;
	}

	public List<Dto> fetchall() {
		// TODO Auto-generated method stub
		javax.persistence.Query q = em.createQuery("select data from Dto data");
		List<Dto> l1 = q.getResultList();
		for(Dto d1:l1) {
			System.out.println(d1.getSid());
			System.out.println(d1.getSname());
			System.out.println(d1.getPhno());
			System.out.println(d1.getGender());
		}
		return l1;
	}
}
