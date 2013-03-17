<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
</head>
<body>
	<div class="header">
		<tiles:insertAttribute name="header"/>
	</div>
	<div class="welcome_body">
		<tiles:insertAttribute name="body"/>
	</div>
	<div>
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>