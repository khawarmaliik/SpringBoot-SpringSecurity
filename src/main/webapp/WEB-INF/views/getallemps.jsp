<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value=""/>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>All Employees</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h3 class="text-center">Employee Management</h3>
			<hr />

			<input type="button" value="Add Employee"
				onclick="window.location.href='showForm'; return false;"
				class="btn btn-primary" /> <br />
			<br />
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Employee List</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered" border="1">
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>Action</th>
						</tr>

						<!-- loop over and print our employees -->
						<c:forEach var="tempEmployee" items="${employee}">

							<!-- construct an "update" link with employee id -->
							<c:url var="updateLink" value="updateForm">
								<c:param name="empId" value="${tempEmployee.empId}" />
							</c:url>

							<!-- construct an "delete" link with employee id -->
							<c:url var="deleteLink" value="/deleteEmp">
								<c:param name="empId" value="${tempEmployee.empId}" />
							</c:url>

							<tr>
								<td>${tempEmployee.empId}</td>
								<td>${tempEmployee.empName}</td>

								<td>
									<!-- display the update link --> <a href="${updateLink}">Update</a>
									| <a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this Employee?'))) return false">Delete</a>
								</td>

							</tr>

						</c:forEach>

					</table>

				</div>
			</div>
		</div>
		<div>
		<a href="home">Go To Home Page</a>
		</div>
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>