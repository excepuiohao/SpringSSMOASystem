package com.bean;

/**
 * @author excepuio µØÍ¼»ùÀà
 */
public class Map {

	private int MapId;

	private String MapExplain;

	private String Address;

	public int getMapId() {
		return MapId;
	}

	public void setMapId(int mapId) {
		MapId = mapId;
	}

	public String getMapExplain() {
		return MapExplain;
	}

	public void setMapExplain(String mapExplain) {
		MapExplain = mapExplain;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Map [MapId=" + MapId + ", MapExplain=" + MapExplain + ", Address=" + Address + "]";
	}

	public Map() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Map(int mapId, String mapExplain, String address) {
		super();
		MapId = mapId;
		MapExplain = mapExplain;
		Address = address;
	}

}
