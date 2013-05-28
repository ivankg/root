package org.strmln.ionstat.model;

import java.io.Serializable;

public class Facility implements Serializable {

    private static final long serialVersionUID = 1190917941000235900L;

    private Long _facilityId;
    private String _name;
    private String _city;
    private String _pib;

    public String getCity() {
	return _city;
    }

    public Long getFacilityId() {
	return _facilityId;
    }

    public String getName() {
	return _name;
    }

    public String getPib() {
	return _pib;
    }

    public void setCity(String city) {
	_city = city;
    }

    public void setFacilityId(Long facilityId) {
	_facilityId = facilityId;
    }

    public void setName(String name) {
	_name = name;
    }

    public void setPib(String pib) {
	_pib = pib;
    }
}
