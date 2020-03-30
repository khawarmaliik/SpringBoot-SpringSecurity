<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC 5 - form handling | Java Guides</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h3 class="text-center">Employee Management</h3>
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Add Employees</div>
				</div>
				<div class="panel-body">
					<form:form action="addEmp" cssClass="form-horizontal"
						method="post" modelAttribute="employee">
						
						<div class="form-group">
							<div class="col-md-9">
								<form:hidden path="empId" cssClass="form-control" />
								${empId }
							</div>
						</div>
						
						<div class="form-group">
							<label for="empName" class="col-md-3 control-label">
								Name</label>
							<div class="col-md-9">
								<form:input path="empName" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="empEmail" class="col-md-3 control-label">
								Email</label>
							<div class="col-md-9">
								<form:input path="empEmail" cssClass="form-control" />
							</div>
						</div>
					<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<form:button cssClass="btn btn-primary">Submit</form:button>
							</div>
						</div>

					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>