package com.tit.queueinterface;

import java.util.PriorityQueue;

class Patient{
     String patient_Name;
     int severity;
    public Patient(String patient_Name, int severity ){
        this.patient_Name = patient_Name;
        this.severity = severity;
    }
}
public class HospitalTriage {


    public static void main(String[] args) {
        PriorityQueue<Patient> patient = new PriorityQueue<>((p1,p2) -> Integer.compare(p2.severity,p1.severity));
        patient.add(new Patient("Ankit",2));
        patient.add(new Patient("Aadarsh",5));
        patient.add(new Patient("Aditya",3));

        while(!patient.isEmpty()){
            System.out.println(patient.poll().patient_Name);
        }
    }
}
