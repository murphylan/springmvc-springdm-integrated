package com.xiebiao.osgi.business.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.dao.DataAccessException;

import com.xiebiao.osgi.business.dao.IDao;
import com.xiebiao.osgi.business.domain.BaseDomain;

public abstract class BaseDao extends SqlSessionDaoSupport implements IDao {

	@Override
	public <T> String insert(T t) throws DataAccessException {
		String keyId = String.valueOf(this.getSqlSession().insert(
				getNameSpace(), t));
		return keyId;
	}

	@Override
	public Integer delete(String keyId) throws DataAccessException {
		return null;
	}

	@Override
	public <T> Integer update(T t) throws DataAccessException {
		return this.getSqlSession().update(this.getNameSpace() + ".update", t);
	}

	@Override
	public <T> T find(String keyId) throws DataAccessException {
		T t = (T) this.getSqlSession().selectOne(this.getNameSpace() + ".find",
				keyId);
		return t;
	}

	@Override
	public <T> List<T> listForObject(T t) throws DataAccessException {
		return null;
	}

	@Override
	public <T> Integer countForObject(T t) throws DataAccessException {
		return null;
	}

	@Override
	public <T extends BaseDomain> List<T> insertBatch(List<T> t) {
		return null;
	}

	@Override
	public <T extends BaseDomain> List<T> updateBatch(List<T> t) {
		return null;
	}

	@Override
	public <T extends BaseDomain> List<T> updateBatch(List<T> t,
			String updateSqlId) {
		return null;
	}

	public abstract String getNameSpace();
}
