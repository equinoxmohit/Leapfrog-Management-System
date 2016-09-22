<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <h1>Edit Course:</h1>
            <form action="${pageContext.request.contextPath}/edit/${course.id}" method="post">
                <div>
                    <label>Course Name</label>
                    <input type="text" name="courseName" required="required" class="form-control" value="${course.courseName}"/>
                </div>
                <div>
                    <label>Course Description</label>
                    <textarea rows="2" name="courseDescription" required="required" class="form-control">${course.courseDescription}</textarea>
                </div>
                <div>
                    <label>Fees</label>
                    <input type="text" name="fees" required="required" class="form-control"  value="${course.fees}"/>
                </div>
                <div>
                    <label>Duration</label>
                    <input type="text" name="duration" required="required" class="form-control"  value="${course.duration}"/>
                </div>
                <div>
                    <label>Duration Type</label>
                    <input type="text" name="durationType" required="required" class="form-control"  value="${course.durationType}"/>
                </div>
                <br>
                <div>
                    <label>Select Availability Status
                        <select name="status" required="required">
                            <option value="">Select Status</option>
                            <option value="1">Available</option>
                            <option value="0">Unavailable</option>
                        </select>
                    </label>
                </div>
                <div>
                    <button type="submit" class="btn btn-success">Submit</button>
                    <button type="reset" class="btn btn-danger">Reset</button>
                </div>
            </form>
        </div>
    </body>
</html>
