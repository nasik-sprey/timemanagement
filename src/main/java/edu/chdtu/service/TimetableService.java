package edu.chdtu.service;

import edu.chdtu.model.entity.Timetable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Metr_yumora on 23.03.2017.
 */
@Service
@Repository
@Transactional
public interface TimetableService extends GenericService<Timetable, Integer> {
}
