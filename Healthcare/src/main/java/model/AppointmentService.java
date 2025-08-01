package model;

import java.time.LocalDate;

public class AppointmentService {
	
	private DoctorRepository doctorRepository;
	
	  

	   public void setDoctorRepository(DoctorRepository doctorRepository) {
	        this.doctorRepository = doctorRepository;
	    }


	
	public  String  appointmentService(String id,LocalDate date)
	{
		if (doctorRepository.isavailable(id, date)) {
            return "Appointment confirmed";
        } else {
            return "Doctor not available";
        }
	}

}
