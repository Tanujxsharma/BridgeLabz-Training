package com.HealthClinicApp.ui;

import com.HealthClinicApp.dao.*;
import com.HealthClinicApp.dto.Appointment;
import com.HealthClinicApp.dto.Doctor;
import com.HealthClinicApp.dto.Patient;
import com.HealthClinicApp.service.AppointmentService;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {

    private final Scanner scanner = new Scanner(System.in);

    private final PatientDAO patientDAO = new PatientDAOImpl();
    private final DoctorDAO doctorDAO = new DoctorDAOImpl();
    private final AppointmentDAO appointmentDAO = new AppointmentDAOImpl();
    private final AppointmentService appointmentService = new AppointmentService();

    public void start() {

        boolean running = true;

        while (running) {


            System.out.println(" HEALTH CLINIC MANAGEMENT");


            System.out.println("1. Register Patient");
            System.out.println("2. View Patient");
            System.out.println("3. View All Patients");
            System.out.println("4. Register Doctor");
            System.out.println("5. View Doctors");
            System.out.println("6. Book Appointment");
            System.out.println("7. Complete Appointment");
            System.out.println("8. Exit");

            System.out.print("Enter Choice : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1 -> registerPatient();

                case 2 -> getPatient();

                case 3 -> getAllPatients();

                case 4 -> registerDoctor();

                case 5 -> getAllDoctors();

                case 6 -> bookAppointment();

                case 7 -> completeAppointment();

                case 8 -> {
                    running = false;
                    System.out.println("Thank You!");
                }

                default -> System.out.println("Invalid Choice");

            }

        }

    }



    private void registerPatient() {

        Patient patient = new Patient();

        System.out.print("First Name : ");
        patient.setFirstName(scanner.nextLine());

        System.out.print("Last Name : ");
        patient.setLastName(scanner.nextLine());

        System.out.print("DOB (yyyy-mm-dd): ");
        patient.setDateOfBirth(Date.valueOf(scanner.nextLine()));

        System.out.print("Gender : ");
        patient.setGender(scanner.nextLine());

        System.out.print("Phone : ");
        patient.setPhoneNumber(scanner.nextLine());

        System.out.print("Email : ");
        patient.setEmail(scanner.nextLine());

        patient.setActive(true);

        int id = patientDAO.addPatient(patient);

        System.out.println(id > 0 ? "Patient Added Successfully. ID : " + id : "Failed");
    }

    private void getPatient() {

        System.out.print("Enter Patient ID : ");

        Patient patient = patientDAO.getPatientById(scanner.nextInt());

        System.out.println(patient);
    }

    private void getAllPatients() {

        List<Patient> patients = patientDAO.getAllPatient();

        patients.forEach(System.out::println);

    }



    private void registerDoctor() {

        Doctor doctor = new Doctor();

        System.out.print("First Name : ");
        doctor.setFirstName(scanner.nextLine());

        System.out.print("Last Name : ");
        doctor.setLastName(scanner.nextLine());

        System.out.print("Phone : ");
        doctor.setPhoneNumber(scanner.nextLine());

        System.out.print("Email : ");
        doctor.setEmail(scanner.nextLine());

        doctor.setActive(true);

        int id = doctorDAO.addDoctor(doctor);

        System.out.println(id > 0 ? "Doctor Added. ID : " + id : "Failed");
    }

    private void getAllDoctors() {

        List<Doctor> doctors = doctorDAO.getAllDoctors();

        doctors.forEach(System.out::println);

    }



    private void bookAppointment() {

        Appointment appointment = new Appointment();

        System.out.print("Patient ID : ");
        appointment.setPatientId(scanner.nextInt());

        System.out.print("Doctor ID : ");
        appointment.setDoctorId(scanner.nextInt());

        scanner.nextLine();

        appointment.setAppointmentDate(LocalDateTime.now());

        appointment.setStatus("Scheduled");

        int id = appointmentDAO.addAppointment(appointment);

        System.out.println(id > 0 ? "Appointment Booked. ID : " + id : "Failed");

    }

    private void completeAppointment() {

        System.out.print("Appointment ID : ");
        int appointmentId = scanner.nextInt();

        System.out.print("Bill Amount : ");
        BigDecimal amount = scanner.nextBigDecimal();

        scanner.nextLine();

        System.out.print("Diagnosis : ");
        String diagnosis = scanner.nextLine();

        System.out.print("Prescription : ");
        String prescription = scanner.nextLine();

        System.out.print("Visit Notes : ");
        String notes = scanner.nextLine();

        boolean completed = appointmentService.completeAppointment(
                appointmentId,
                amount,
                diagnosis,
                prescription,
                notes
        );

        System.out.println(completed
                ? "Appointment Completed Successfully."
                : "Operation Failed.");

    }
    public static void main(String[] args) {

        new ConsoleMenu().start();

    }

}