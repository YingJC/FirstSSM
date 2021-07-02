package com.secode.lyf;

import com.soecode.lyf.dao.AppointmentDao;
import com.soecode.lyf.entity.Appointment;
import com.soecode.lyf.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AppointmentDaoTest extends BaseTest{
    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    public void testInsertAppointment() throws Exception{
        long bookId = 1000;
        long studentId = 1234567890L;
        int insert = appointmentDao.insertAppointment(bookId, studentId);
        System.out.println("insert=" + insert);
    }

    @Test
    public void testQueryByKeyWithBook() throws Exception {
        long bookId = 1000;
        long studentId = 12345678910L;
        Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
        System.out.println(appointment);
        System.out.println(appointment.getBook());
    }

}