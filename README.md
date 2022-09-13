# Springboot-backend with mysql

### **Created REST API for employee**
1. **saveEmployee**: create new employee object in database
2. **getAllEmployees**: fetch all employees from database 
3. **getEmployeeById**: Fetch perticular employee object from database
4. **updateEmployee**: Update perticular employee object in database 
5. **deleteEmployee**: delete perticular employee object from database 

---
### **Self Notes:**
- path variables- get request
    
    ```java
    //add @pathVariable annotation in order to access URL template path variable in java code
    	@GetMapping("/student/{firstName}/{lastName}") //template path variables
    	public Student studentPathVariable(@PathVariable("firstName") String fName, 
    			@PathVariable("lastName") String lName) {
    		return new Student(fName, lName);
    	}
    ```
    
- query param -get request
    
    ```java
    //handling query parameter
    	// ex: localhost://8080/student/query?firstName=Manish&lastName=Bharti
    	// use @RequestParam to map query param with java function parameters
    	@GetMapping("/student/query")
    	public Student studentQueryParam(
    			@RequestParam(name="firstName") String firstName, 
    			@RequestParam(name="lastName") String lastName) {
    		
    		return new Student(firstName, lastName);
    	}
    ```
    
- JPA: java persitance API
    - JPA can be seen as a bridge between object-oriented domain models and relational database systems.
- ORM: object-relational mapping
  
- Spring packages
    1. **model** > for defining class/ table structure
    2. **repository**> creating JpaRepository interface of the model class
        -  to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects.
    3. **service**
        - service.impl > for implementing JPA repository defined in repository package
    4. **controller**: for API function definitions, routing
    5. **exception**: for exception handling
---
**Video reference:** [Spring Boot Restful Web Services Tutorial | Full Course ✅ | REST API | Spring Boot for Beginners](https://www.youtube.com/watch?v=th3uIP7D8nk)


