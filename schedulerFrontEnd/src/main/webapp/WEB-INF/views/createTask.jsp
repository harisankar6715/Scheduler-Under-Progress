<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>Scheduler | Create Task</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="application/x-javascript">
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 

</script>
<!-- Bootstrap Core CSS -->
<link href="resources/css/bootstrap.min.css" rel='stylesheet'
	type='text/css' />
<!-- Custom CSS -->
<link href="resources/css/style.css" rel='stylesheet' type='text/css' />
<!-- jQuery -->
<link
	href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400'
	rel='stylesheet' type='text/css' />
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700'
	rel='stylesheet' type='text/css'>
<!-- lined-icons -->
<link rel="stylesheet" href="resources/css/icon-font.min.css"
	type='text/css' />

<!-- //lined-icons -->
<script src="resources/js/jquery-1.10.2.min.js"></script>
</head>
<body>
	<div class="page-container">
		<!--/content-inner-->
		<div class="left-content">
			<div class="inner-content">
				<!-- header-starts -->
				<div class="header-section">
					<!-- top_bg -->
					<div class="top_bg">
						<div class="header_top">
							<div class="top_right">
								<ul>

									<li><a href="contacts"><span
											class="glyphicon glyphicon-envelope"> Contacts</span></a></li>|
									<li><a><span class="glyphicon glyphicon-phone-alt">
												91-90727-00085</span></a></li>
								</ul>
							</div>
							<div class="top_left">
								<ul>
									<li><a href="logout"><span
											class="glyphicon glyphicon-log-out"> SignOut</span></a></li>

								</ul>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
					<div class="clearfix"></div>
					<!-- /top_bg -->
				</div>
			</div>
		</div>
	</div>
	<!--/sidebar-menu-->
	<div class="sidebar-menu">
		<header> <br>
		<br>
		<br>
		<br>
		</header>
		<div style="border-top: 1px ridge rgba(255, 255, 255, 0.15)"></div>
		<div class="menu">
			<ul id="menu">
				<li><a href="existingTask"><i class="glyphicon glyphicon-home"></i><span>Home</span></a></li>
				<li id="menu-academico"><a href="#"><i
						class="glyphicon glyphicon-pencil"></i> <span>Reminders</span>
						<span class="fa fa-angle-right" style="float: right"></span></a>
					<ul id="menu-academico-sub">
						<li id="menu-academico-avaliacoes"><a href="createTask">Create
								New</a></li>
						<li id="menu-academico-avaliacoes"><a href="editExisting">Edit
								Existing</a></li>
						<li id="menu-academico-boletim"><a href="deleteExisting">Delete
								Existing</a></li>
					</ul></li>
				<li id="menu-academico"><a href="report"><i
						class="glyphicon glyphicon-book"></i> <span>Report</span></a></li>
				<li><a href="settings"><i
						class="glyphicon glyphicon-cog"></i> <span>Settings</span></a></li>


			</ul>
		</div>
	</div>
	<div class="clearfix"></div>
	</div>
	<script>
		var toggle = true;

		$(".sidebar-icon").click(
				function() {
					if (toggle) {
						$(".page-container").addClass("sidebar-collapsed")
								.removeClass("sidebar-collapsed-back");
						$("#menu span").css({
							"position" : "absolute"
						});
					} else {
						$(".page-container").removeClass("sidebar-collapsed")
								.addClass("sidebar-collapsed-back");
						setTimeout(function() {
							$("#menu span").css({
								"position" : "relative"
							});
						}, 400);
					}

					toggle = !toggle;
				});
	</script>
	<!--js -->
	<script src="resources/js/jquery.nicescroll.js"></script>
	<script src="resources/js/scripts.js"></script>

	<br>
	<br>
	<br>
	<br>
	<br>

	<h1 align="center">
		<b><u>CREATE TASK</u></b>
	</h1>
	<c:url var="addAction" value="tocreateTask"></c:url>
	<form:form action="${addAction }" commandName="task">
		<table align="center">

			<tr>
				<td><form:label path="title" required="true">
						<spring:message text="Title"></spring:message>
					</form:label></td>
				<td><form:input path="title" required="true"></form:input></td>
			</tr>

			<tr>
				<td><form:label path="description">
						<spring:message text="Description"></spring:message>
					</form:label></td>
				<td><form:input path="description" required="true"></form:input></td>
			</tr>

			<tr>
				<!-- if the category is already exist, then edit -->
				<td><c:if test="${!empty task.title }">
						<input type="submit"
							value="<spring:message text="Edit"></spring:message>">
					</c:if> <c:if test="${empty task.title}">
						<input type="submit"
							value="<spring:message text="Add"></spring:message>">
					</c:if></td>
			</tr>
		</table>
	</form:form>

	<br>
</body>
</html>