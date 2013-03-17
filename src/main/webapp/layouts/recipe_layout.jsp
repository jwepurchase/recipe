<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
</head>
<body>
	<table>
		<tr>
			<td colspan="2" class="header">
				<tiles:insertAttribute name="header"/>
			</td>
		</tr>
		<tr>
			<td class="body">
				<tiles:insertAttribute name="body"/>
			</td>
			<td class="right_column">
				<tiles:insertAttribute name="right_column"/>
			</td>
		</tr>
		<tr>
			<td colspan="2" class="footer">
				<tiles:insertAttribute name="footer"/>
			</td>
		</tr>
	</table>
</body>
</html>