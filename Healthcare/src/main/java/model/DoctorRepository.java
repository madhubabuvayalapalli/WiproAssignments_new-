package model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

public class DoctorRepository {
	
	Map<String, List<LocalDate>> store =new TreeMap();
	
	public void  storedata()
	{
		   store.put("DOC101", Arrays.asList(
	                LocalDate.of(2025, 4, 10),
	                LocalDate.of(2025, 4, 12)
	        ));
	}
	
	public boolean isavailable(String id,LocalDate d)
	{
		List<LocalDate> ad=store.get(id);	
		if(ad!=null && ad.contains(d))		
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		

	

}
