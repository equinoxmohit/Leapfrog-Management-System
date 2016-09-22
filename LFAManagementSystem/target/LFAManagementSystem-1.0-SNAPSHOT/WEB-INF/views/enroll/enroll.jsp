<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <h1>Enrollment Form:</h1>
            <form action="" method="post">
                <div>
                    <label>First Name</label>
                    <input type="text" name="firstName" class="form-control" required="required"/>
                </div>
                <div>
                    <label>Last Name</label>
                    <input type="text" name="lastName" class="form-control" required="required"/>
                </div>
                <div>
                    <label>Email</label>
                    <input type="email" name="email" class="form-control" required="required"/>
                </div>
                <div>
                    <label>Contact Number</label>
                    <input type="text" name="contactNumber" class="form-control" required="required"/>
                </div>
                <div>
                    <label>College/Organization</label>
                    <input type="text" name="collegeName" class="form-control" required="required"/>
                </div>
                <div>
                    <label>
                        Your Desired Course Name 
                    </label>
                    <br>
                    <select name="course" required="required" class="form-control">
                        <option value="">Select Desired Course</option>
                        <c:forEach var="cou" items="${courses}">
                            <option value="${cou.id}">${cou.courseName}</option>
                        </c:forEach>
                    </select>
                </div>
                <div>
                    <label>
                        Education(Faculty) 
                    </label>
                    <br>
                    <select name="faculty" required="required" class="form-control">
                        <option value="">Select Your Faculty</option>
                        <c:forEach var="fac" items="${faculty}">
                            <option value="${fac.facultyId}">${fac.facultyName}</option>
                        </c:forEach>
                    </select>
                </div>
                <div>
                    <label>
                        What best describes your current employment status?
                    </label>
                    <br>
                    <select name="employmentStatus" required="required" class="form-control">
                        <option value="">Select Employment Status</option>
                        <c:forEach var="emp" items="${employmentStatus}">
                            <option value="${emp.employmentStatusid}">${emp.employmentStatusName}</option>
                        </c:forEach>
                    </select>
                </div>
                <div>
                    <label>
                        How did you hear about Leapfrog Academy? 
                    </label>
                    <br>
                    <select name="enquiryStatus" required="required" class="form-control">
                        <option value="">Please Select</option>
                        <c:forEach var="enq" items="${enquiry}">
                            <option value="${enq.enquiryStatusId}">${enq.enquiryStatusName}</option>
                        </c:forEach>
                    </select>
                </div>
                <br>
                <div>
                    <button type="submit" class="btn btn-success">Submit</button>
                    <button type="reset" class="btn btn-danger">Reset</button>
                </div>
            </form>
        </div>
    </body>
</html>
