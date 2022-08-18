package com.alice;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController implements FormControllerInterface {
	 @Autowired
	  private FormService storageService;
	
	  @PostMapping(value = "/saveForm", consumes = "application/json")
	  public ResponseEntity<?> addForm(@RequestBody FormModelDTO form) {
		FormModel formDB = null ;
		try {
			byte[] binaryContent = Base64.getDecoder().decode(form.getScreenshot());
			formDB = new FormModel(form.getName(), form.getEmail(), binaryContent);
			storageService.saveForm(formDB);
			return new ResponseEntity<>("File uploaded :" + formDB, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Unable to upload form :" + formDB, HttpStatus.NO_CONTENT);

		}
	    
	  }

}
