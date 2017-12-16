<%@  taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0" align="left">
    <tr>
      <td colspan="2" align="left" bgcolor="#FF5733"><tiles:insertAttribute name="header" />
      </td>
    </tr>
    <tr>
      <td valign="top" bgcolor="#FFC266"><tiles:insertAttribute name="body" />
      </td>
    </tr>
    <tr>
      <td colspan="2" align="left" bgcolor="#556B2F"><tiles:insertAttribute name="footer" />
      </td>
    </tr>
  </table>
</body>
</html>