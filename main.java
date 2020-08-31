package com.company;

public class Main {

    public static void main(String[] args) {

                String patientName= "Stacey Manson";
                boolean hasInsurance = false;
                int temp = 102;
                float numVisits = (float) 5.02;

                int copay = 50;
                String apptdate = "2020-10-03";
                String contact = "315-224-6058";

                System.out.println("Patient Details:");
                System.out.println("Name: "+ patientName);
                System.out.println("Patient has insurance: "+ hasInsurance);
                System.out.println("Body temperature: " + temp);
                System.out.println("Number of visits: " + numVisits);
                System.out.println("Copay: $" + copay);
                System.out.println("Next Appointment: " + apptdate);
                System.out.println("Patient Contact Number: " + contact);
            }
    }
