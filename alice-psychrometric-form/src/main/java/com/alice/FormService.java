package com.alice;

import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Transactional
public class FormService {
	
	@Autowired
	private FormRepository formrepository;
	
	public FormModel saveForm(FormModel form) throws IOException {
	    return formrepository.save(form);
	  }
	 
}
