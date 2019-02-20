package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Map;
import com.dao.MapDAO;
import com.service.MapService;

@Service
public class MapServiceImpl implements MapService {

	@Autowired
	MapDAO mapDAO;

	@Override
	public void InsertMap(Map map) {
		// TODO Auto-generated method stub
		mapDAO.InsertMap(map);
	}

	@Override
	public void UpdateMap(Map map) {
		// TODO Auto-generated method stub
		mapDAO.UpdateMap(map);
	}

	@Override
	public void DeleteMap(String mapId) {
		// TODO Auto-generated method stub
		mapDAO.DeleteMap(mapId);
	}

	@Override
	public List<Map> SelectMap() {
		// TODO Auto-generated method stub
		return mapDAO.SelectMap();
	}

	@Override
	public Map SelectMapById(String mapId) {
		// TODO Auto-generated method stub
		return mapDAO.SelectMapById(mapId);
	}

}
