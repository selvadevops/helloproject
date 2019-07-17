<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Hello World</title>
</head>
<body>
	Hello World
	<s:form action="hello.action" enctype="multipart/form-data"
		theme="bootstrap" cssClass="form-horizontal"
		label="A sample horizontal Form">
		<s:textfield name="name" label="Name" />
		<s:submit cssClass="btn btn-primary" />
	</s:form>

</body>
</html>