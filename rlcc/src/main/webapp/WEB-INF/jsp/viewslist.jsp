<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>

	<h2>How to iterate list on JSP in Spring MVC</h2>

	<p><b>Simple List:</b><p>
	
	${list}
	
	<p><b>Iterated List:</b><p>

	<ol>
		<c:forEach var="emp" items="${list}">
		
			<li>${Receipt No_}</li>
			
		</c:forEach>
	</ol>

</body>
</html><%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>

	<h2>How to iterate list on JSP in Spring MVC</h2>

	<p><b>Simple List:</b><p>
	
	${list}
	
	<p><b>Iterated List:</b><p>

	<ol>
		<c:forEach var="emp" items="${list}">
		
			<li>${Receipt No_}</li>
			
		</c:forEach>
	</ol>

</body>
</html>