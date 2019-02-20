package com.dao;

import java.util.List;

import com.bean.Map;

public interface MapDAO {

	void InsertMap(Map map);

	void UpdateMap(Map map);

	void DeleteMap(String mapId);

	List<Map> SelectMap();

	Map SelectMapById(String mapId);

}
