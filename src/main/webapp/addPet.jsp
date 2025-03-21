
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <meta charset="UTF-8">
    <title>Add pet</title>
</head>
<body>

<form method="post" action="addPetServlet">
<table>
    <tr>
        <td>Name:</td>
        <td>
    <input type="text" name="name">
        </td>
    </tr>

    <tr>
        <td>Chip code:</td>
        <td>
            <input type="text" name="chipCode">
        </td>
    </tr>
    <tr>
        <td>Address:</td>
        <td>
            <input type="text" name="address">
        </td>
    </tr>
    <tr>
        <td>Species:</td>
        <td>
            <input type="text" name="species">
        </td>
    </tr>
</table>
<br>

<button type="submit" name="action" value="save">Save</button>
<br>
<button type="submit" name="action" value="back">Back</button>
    </form>
</body>
</html>
