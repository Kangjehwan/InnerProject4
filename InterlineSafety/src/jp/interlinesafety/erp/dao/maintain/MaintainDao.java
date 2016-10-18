package jp.interlinesafety.erp.dao.maintain;

import java.sql.SQLException;
import java.util.List;

import jp.interlinesafety.erp.model.maintain.MaintainVo;
import jp.interlinesafety.erp.util.SqlMapLocator;

public class MaintainDao {

	public List<MaintainVo> list(Object obj) throws SQLException {
		List<MaintainVo> list = SqlMapLocator.getMapper().queryForList(
				"MaintainList", obj);
		return list;
	}
	
	public List<MaintainVo> list2(Object obj) throws SQLException {
		List<MaintainVo> list2 = SqlMapLocator.getMapper().queryForList(
				"MainList", obj);
		return list2;
	}

	public void insert(Object obj) throws SQLException {
		SqlMapLocator.getMapper().insert("MaintainInsert", (MaintainVo) obj);
	}

	public void insert1(Object obj) throws SQLException {
		SqlMapLocator.getMapper().insert("MaintainInsert1", (MaintainVo) obj);
	}

	public MaintainVo select(Object obj) throws SQLException {
		System.out.println(obj);
		MaintainVo vo = (MaintainVo) SqlMapLocator.getMapper().queryForObject(
				"MaintainOne", obj);
		return vo;
	}
	
	public MaintainVo cnt(Object obj) throws SQLException {
		MaintainVo vo = (MaintainVo) SqlMapLocator.getMapper().queryForObject(
				"SelectCnt", obj);
		return vo;
	}

	public void delete(Object obj) throws SQLException {
		SqlMapLocator.getMapper().delete("MaintainDelete", obj);
	}

	public void delete1(Object obj) throws SQLException {
		SqlMapLocator.getMapper().delete("MaintainDelete1", obj);
	}

	public void update(Object obj) throws SQLException {
		SqlMapLocator.getMapper().update("MaintainUpdate", obj);
	}

	public void update1(Object obj) throws SQLException {
		SqlMapLocator.getMapper().update("MaintainUpdate1", obj);
	}

	public void update2(Object obj) throws SQLException {
		SqlMapLocator.getMapper().update("MaintainUpdate2", obj);
	}
}
