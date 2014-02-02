package com.ssh2test1.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hibtest1.entity.Test;

public class TestDAOImpl extends HibernateDaoSupport implements
TestDAO {
public List search(final Test condition) {
return super.getHibernateTemplate().executeFind(
		new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Criteria c = session.createCriteria(Test.class);
				if (condition != null) {
					if (condition.getTstate() != null) {
						c.add(Restrictions.eq("tstate", condition.getTstate()));
					}
				}
				Object object = c.list();
				return object;
			}

		});
}

}
