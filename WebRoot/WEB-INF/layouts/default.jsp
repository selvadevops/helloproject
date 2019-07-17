<%@ taglib prefix="sitemesh"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/components/import.jsp"%>
<sitemesh:head />
</head>
<body>
	<%@include file="/components/header.jsp"%>
	<div class="container-fluid">
		<sitemesh:body />
	</div>
	<%@include file="/components/footer.jsp"%>
 
</body>

</html>