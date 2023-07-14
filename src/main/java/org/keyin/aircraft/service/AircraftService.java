//package org.keyin.aircraft.service;
//
//import org.keyin.aircraft.Aircraft;
//import org.keyin.aircraft.AircraftRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class AircraftService {
//    private List<Aircraft> aircraftList = new ArrayList<Aircraft>();
//
//    @Autowired
//    private AircraftRepository aircraftRepository;
//
//    public AircraftService() {
//        Aircraft aircraft = new Aircraft();
//        aircraft.setId(1L);
//        aircraft.setBrand("Boeing");
//        aircraft.setModel("737");
//        aircraft.setTailNumber("AF-1234");
//
//        aircraftList.add(aircraft);
//
//        Aircraft aircraft2 = new Aircraft(); // Create a new Aircraft object
//        aircraft2.setId(2L);
//        aircraft2.setBrand("Boeing");
//        aircraft2.setModel("747");
//        aircraft2.setTailNumber("AF-34");
//
//        aircraftList.add(aircraft2); // Add the new Aircraft object to the list
//
//
//    }
//
//    public List<Aircraft> getAllAircraft() {
//        System.out.println("List Contains");
//        return aircraftList;
//    }
//
//    public List<Aircraft> getAllAircraftFromDB() {
//        return (List<Aircraft>) aircraftRepository.findAll();
//    }
//
//    public Aircraft createAircraft(Aircraft aircraft) {
//        return (Aircraft) aircraftRepository.save(aircraft);
//    }
//
//    public List<Aircraft> deleteAircraft(Long id){
//
//        aircraftRepository.deleteById(id);
//        return  aircraftList;
//
//    }
//
//    @Transactional
//    public Optional<Aircraft> updateAircraft(long id, Aircraft aircraft) {
//
//        try{
//            return aircraftRepository.findById(id).map(target -> {
//                target.setTailNumber(aircraft.getTailNumber());
//                target.setType(aircraft.getType());
//                target.setBrand(aircraft.getBrand());
//                target.setModel(aircraft.getModel());
//
//                return aircraft ;
//            });
//
//        } catch (NullPointerException e){
//            System.out.println(e);
//        }
//
//
//        return null;
//    }
//
//
//}
//
//
//
