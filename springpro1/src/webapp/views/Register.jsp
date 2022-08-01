<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form action="/mss/mpvs" method="POST" modelAttribute="userObj">
UId:<form:input path="uid"/><br>
User_names:<form:input path="uname"/><br>
city:<form:input path="city"/><br>
address:<form:input path="address"/><br>
phone:<form:input path="phone"/><br>
password:<form:input path="pass"/><br>
confirm_pass:<form:input path="confirmpass"/><br>
flag:<form:input path="flag"/><br>
<input type="submit" value="Register">
</form:form>