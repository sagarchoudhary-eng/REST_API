package com.alice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface FormControllerInterface {

  @ApiOperation(value    = "Add a new form", 
                nickname = "addForm", 
                response = FormModelDTO.class, 
                responseContainer = "String")
  @ApiResponses(value = {
                  @ApiResponse(code = 200, message = "Form Added Successfully", 
                               response = String.class, responseContainer = "String"),
                  @ApiResponse(code = 409, message = "Unable to upload file", 
                  response = String.class, responseContainer = "String"),
                  @ApiResponse(code = 405, message = "Invalid input") })
  public ResponseEntity<?> addForm(
      @ApiParam(value = "Form needs to be added", required = true)
      @RequestBody(required = true) FormModelDTO form);
}
