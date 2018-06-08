package com.core.oopi2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortComparator1 {

	public static void main(String ieu[]){
		
		Map<Long,Hospital1> mapl=new HashMap<>();
		
		mapl.put(1l, new Hospital1("sk1", "fsf1", 31, "sonography"));
		mapl.put(6l, new Hospital1("sk6", "fsf6", 1, "MRI"));
		mapl.put(3l, new Hospital1("sk3", "fsf3", 351, "Xrays"));
		mapl.put(5l, new Hospital1("sk5", "fsf5", 51, "ECG"));
		mapl.put(0l, new Hospital1("sk0", "fsf0", 21, "ICu"));
		
		Set<Map.Entry<Long, Hospital1>> set=mapl.entrySet();
		List<Map.Entry<Long, Hospital1>> lst=new ArrayList<>(set);
		Collections.sort(lst, new Comparator<Map.Entry<Long,Hospital1>> (){

			@Override
			public int compare(java.util.Map.Entry<Long, Hospital1> o1, java.util.Map.Entry<Long, Hospital1> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().department.compareTo(o2.getValue().department);
			}
			
			
		});
		
		Iterator<Map.Entry<Long, Hospital1>> itr=lst.iterator();
		
		while(itr.hasNext()){
			Map.Entry<Long, Hospital1> hos=itr.next();
				
				System.out.println(hos.getKey()+"\t$@@$\t"+hos.getValue().doctorName); 
				
		}
	}
}

class Hospital1{
	
	String doctorName;
	String patientName;
	long id;
	String department;
	public Hospital1(String doctorName, String patientName, long id, String department) {
		super();
		this.doctorName = doctorName;
		this.patientName = patientName;
		this.id = id;
		this.department = department;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}


