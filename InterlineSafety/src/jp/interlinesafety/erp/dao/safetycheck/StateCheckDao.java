package jp.interlinesafety.erp.dao.safetycheck;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import jp.interlinesafety.erp.model.safetycheck.PhysicalConditionVo;
import jp.interlinesafety.erp.model.safetycheck.StateCheckVo;
import jp.interlinesafety.erp.model.safetycheck.WhereaboutsVo;
import jp.interlinesafety.erp.util.SqlMapLocator;

/** 作成者 : 李 珍瑞
 *  作成日付 : 2016.01.27
 */
public class StateCheckDao {
	private static StateCheckDao singleton;
	private StateCheckDao() {}
	
	public static StateCheckDao getInstance() {
		if(singleton == null) {
			singleton = new StateCheckDao();
		}
		return singleton;
	}

	public List<StateCheckVo> showCurrenDisaster(Object obj) throws SQLException {
		List<StateCheckVo> showCurrenDisaster = SqlMapLocator.getMapper().queryForList("ShowCurrenDisaster", obj);
		return showCurrenDisaster;
	}

	public List<StateCheckVo> showSafetyCheck(Object obj) throws SQLException {
		System.out.println("List<StateCheckVo> showSafetyCheck(Object obj) = " + obj);
		List<StateCheckVo> showSafetyCheck = SqlMapLocator.getMapper().queryForList("ShowSafetyCheck", obj);
		System.out.println("List<StateCheckVo> showSafetyCheck " + showSafetyCheck);
		return showSafetyCheck;
	}

	public void doWrite(Object obj) throws SQLException {
		SqlMapLocator.getMapper().insert("DoWrite", obj);
		System.out.println("Insert Object 파라미터로 넘어온값 obj" + obj);
	}

	public void doUpdate (Object obj) throws SQLException {
		SqlMapLocator.getMapper().update("DoUpdate", obj);
		System.out.println("Update Object 파라미터로 넘어온값 obj" + obj);
	}

	public List<WhereaboutsVo> selectWhereaboutsName(Object obj) throws SQLException {
		List<WhereaboutsVo> selectWhereaboutsName = SqlMapLocator.getMapper().queryForList("SelectBoxWhereaboutsName", obj);
		System.out.println("List<WhereaboutsVo> selectWhereaboutsName " + selectWhereaboutsName);
		return selectWhereaboutsName;
	}

	public List<PhysicalConditionVo> selectPhysicalCondtion(Object obj) throws SQLException {
		List<PhysicalConditionVo> selectPhysicalCondtion = SqlMapLocator.getMapper().queryForList("SelectBoxPhysicalCondtion", obj);
		System.out.println("List<PhysicalConditionVo> selectPhysicalCondtion " + selectPhysicalCondtion);
		return selectPhysicalCondtion;
	}
	
	public String testDisasterId(Object obj) throws SQLException {
		System.out.println("DAO에 넘어온 testDisasterId "  + obj);
		return ((String) SqlMapLocator.getMapper().queryForObject("TestDisasterId", obj));
	}

}
