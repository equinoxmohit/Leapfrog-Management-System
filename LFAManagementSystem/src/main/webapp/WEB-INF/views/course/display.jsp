<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </head>
    <body>
        <div class="container">
            <a href="${pageContext.request.contextPath}" class="btn btn-success"><span class="glyphicon glyphicon-home"></span></a>
            <a href="${pageContext.request.contextPath}/course" class="btn btn-success"><span class="glyphicon glyphicon-plus">Course</span></a>
            <a href="${pageContext.request.contextPath}/faculty" class="btn btn-success"><span class="glyphicon glyphicon-plus">Faculty</span></a>
            <a href="${pageContext.request.contextPath}/displayfaculty" class="btn btn-success">Faculties</a>
            <a href="${pageContext.request.contextPath}/employmentstatus" class="btn btn-success"><span class="glyphicon glyphicon-plus">Employment-Status</span></a>
            <a href="${pageContext.request.contextPath}/displayemploymentstatus" class="btn btn-success">Employment-Status</a>
            <a href="${pageContext.request.contextPath}/status" class="btn btn-success"><span class="glyphicon glyphicon-plus">Enquiry-Status</span></a>
            <a href="${pageContext.request.contextPath}/displayenquirystatus" class="btn btn-success">Enquiry-Status</a>
            <div>
                <h1>Courses</h1>
                <table class="table table-striped table-hover table-responsive">
                    <tr>
                        <th>Course Name</th>
                        <th>Course Description</th>
                        <th>Fees</th>
                        <th>Duration</th>
                        <th>Duration Type</th>
                        <th>Added Date</th>
                        <th>Status</th>
                        <th>Action</th>
                    </tr>
                    <c:forEach var="course" items="${courses}">
                        <tr>
                            <td>${course.courseName}</td>
                            <td style="width:20%">${course.courseDescription}</td>
                            <td>${course.fees}</td>
                            <td>${course.duration}</td>
                            <td>${course.durationType}</td>
                            <td>${course.addedDate}</td>
                            <td>
                                <c:choose>
                                    <c:when test="${course.status}"> Available</c:when>                 
                                    <c:otherwise>Unavailable</c:otherwise>
                                </c:choose>
                            </td>
                            <td>
                                <a href="${pageContext.request.contextPath}/edit/${course.id}" class="btn btn-success"><span class="glyphicon glyphicon-pencil"></span></a>
                                <a href="${pageContext.request.contextPath}/delete/${course.id}" class="btn btn-danger"><span class="glyphicon glyphicon-trash" onclick="return confirm('Are you sure you want to delete the record?')"></span></a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>

        </div>
    </body>
</html>
