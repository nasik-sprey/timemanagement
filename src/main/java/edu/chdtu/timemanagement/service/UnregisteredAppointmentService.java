package edu.chdtu.timemanagement.service;

import edu.chdtu.timemanagement.model.UnregisteredAppointment;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Metr_yumora on 30.03.2017.
 */
@Service
@Repository
@Transactional
public interface UnregisteredAppointmentService extends GenericService<UnregisteredAppointment, Integer> {

}
