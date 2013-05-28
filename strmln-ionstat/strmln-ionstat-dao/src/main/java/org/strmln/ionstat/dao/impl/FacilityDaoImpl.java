package org.strmln.ionstat.dao.impl;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.strmln.ionstat.dao.FacilityDao;
import org.strmln.ionstat.dao.hibernate.AutowireSessionFactory;
import org.strmln.ionstat.dao.hibernate.HibernateCallback;
import org.strmln.ionstat.model.Facility;

public class FacilityDaoImpl extends AutowireSessionFactory implements
	FacilityDao {

    @Override
    public void addNewFacility(final Facility facility) {
	execute(new HibernateCallback<Long>() {

	    @Override
	    public Long execute(Session session) throws HibernateException,
		    SQLException {
		session.save(facility);
		return null;
	    }
	});

    }

}
