package com.min.project.portal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.min.project.portal.model.BusInfo;
@Repository
public interface BusInfoRepo extends CrudRepository<BusInfo, Integer> {

}
