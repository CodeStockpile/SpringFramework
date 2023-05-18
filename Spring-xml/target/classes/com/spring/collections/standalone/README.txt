
Standalone collection are created so that those values can be use in more than one bean.

-> for this first add following schema in xml file:

	xmlns:util="http://www.springframework.org/schema/util"
	http://www.springframework.org/schema/util
	http://www.springframework.org/schema/util/spring-util.xsd">

-> Then we can create standalone collections:


after that we assign it to the bean:

1. 
	<property name="experience">
		<ref bean="course" />
	</property>


2.
	<property name="prop" ref="dbconfig" />
		