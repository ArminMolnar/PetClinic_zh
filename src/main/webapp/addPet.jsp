
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:page title="Add new pet">

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

<button type="submit">Save</button>
    </form>

</t:page>
