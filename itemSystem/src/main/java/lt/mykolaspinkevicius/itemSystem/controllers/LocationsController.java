//package lt.mykolaspinkevicius.itemSystem.controllers;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import lt.mykolaspinkevicius.itemSystem.entities.Location;
//import lt.mykolaspinkevicius.itemSystem.services.LocationsService;
//
//@RestController
//@RequestMapping("/locations")
//public class LocationsController {
//
//	private LocationsService service;
//	
//	public LocationsController(LocationsService service) {
//		this.service = service;
//	}
//	
//	@PostMapping
//	@ResponseStatus(value=HttpStatus.CREATED)
//	public int createLocation(@RequestBody Location location) {
//		return service.createLocation(location);
//	}
//}
