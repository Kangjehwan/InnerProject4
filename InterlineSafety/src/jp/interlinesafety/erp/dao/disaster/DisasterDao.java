package jp.interlinesafety.erp.dao.disaster;

import java.sql.SQLException;
import java.util.List;

import jp.interlinesafety.erp.model.disaster.DisasterStateVo;
import jp.interlinesafety.erp.model.disaster.DisasterVo;
import jp.interlinesafety.erp.util.SqlMapLocator;

public class DisasterDao {

	public List<DisasterVo> list(Object obj) throws SQLException {
		List<DisasterVo> list = SqlMapLocator.getMapper().queryForList("DisasterList", obj);
		return list;
	}
	
	public List<DisasterStateVo> stateList(Object obj) throws SQLException {
		List<DisasterStateVo> stateList = SqlMapLocator.getMapper().queryForList("DisasterStateList", obj);
		return stateList;
	}
	
	public void insert(Object obj) throws SQLException {
		SqlMapLocator.getMapper().insert("DisasterInsert", (DisasterVo)obj);
	}

	public DisasterVo select(Object obj) throws SQLException
	{
		DisasterVo vo = (DisasterVo) SqlMapLocator.getMapper().queryForObject("DisasterOne", obj);
		return vo;
	}
	
	public void delete(Object obj) throws SQLException
	{
		SqlMapLocator.getMapper().delete("DisasterDelete", obj);
	}
	
	public void update(Object obj) throws SQLException
	{
		SqlMapLocator.getMapper().update("DisasterUpdate", obj);
	}
}
