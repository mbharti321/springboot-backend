package com.springmysql.springback.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String resourceNmae;
    
	private String fieldName;
    private Object fieldValue;
    public ResourceNotFoundException(String resourceNmae, String fieldName, Object fieldValue) {
		super(String.format("%s not found with %s: '%s'", resourceNmae, fieldName, fieldValue));
		this.resourceNmae = resourceNmae;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	/**
	 * @return the resourceNmae
	 */
	public String getResourceNmae() {
		return resourceNmae;
	}
	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}
	/**
	 * @return the fieldValue
	 */
	public Object getFieldValue() {
		return fieldValue;
	}
}
