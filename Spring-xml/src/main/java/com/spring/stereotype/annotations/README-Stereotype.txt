
To use stereotype annotations we need to add tag in xml file:

	<context:component-scan base-package=""></context:component-scan>

-> To give default value to the instance variables we use @Value annotation.
	e.g. @Value("sk")

	
-> To give value to the default value to the reference data type we create the
	standalone utils in xml file and pass the id in parathesis of @Value.
	
	e.g. @Value("#{val}") 	
	
---------------------- SCOPE --------------------------
we can change the scope of bean in two ways
1. @Scope("")
2. <bean name="" class="" scope="">

Note: Bydefault scope is 'singleton'

=> Five types of scopes are :
Singleton
prototype
request
session
globalsession

------------ SpEL(Spring Expression language) ---------------------------

-> Syntax : @Value("#{ T(className).staticMethod }")

	e.g. @Value("#{ T(java.lang.Math).sqrt(16) }") // double	
		 @Value("#{ 90 -78}")  // int value
		 @Value("#{ 9+6 >0 ? 'Hii': 'hello'}")  // String
		 @Value("#{ new java.lang.String('Sk') }") // new String object
		 @Value("#{ 90-7 >100}")		// boolean value
		 
		 
		 
		 