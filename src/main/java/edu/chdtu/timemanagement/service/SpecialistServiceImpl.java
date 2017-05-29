package edu.chdtu.timemanagement.service;

import edu.chdtu.timemanagement.dao.GenericDao;
import edu.chdtu.timemanagement.dao.SpecialistDao;
import edu.chdtu.timemanagement.model.Specialist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Metr_yumora on 23.03.2017.
 */

@Service
public class SpecialistServiceImpl extends GenericServiceImpl<Specialist, Integer> implements SpecialistService {

    private SpecialistDao specialistDao;

    @Autowired
    public SpecialistServiceImpl(@Qualifier("specialistDaoImpl") GenericDao<Specialist, Integer> genericDao) {
        super(genericDao);
        this.specialistDao = (SpecialistDao) genericDao;
    }

}