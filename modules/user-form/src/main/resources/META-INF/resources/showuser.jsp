<%@ include file="/init.jsp"%>
<%@ page import="java.util.List"%>
<%@ page import="user.form.model.User"%>


<portlet:actionURL name="showUsers" var="showUsers" ></portlet:actionURL>
<div style="postion:relative; margin 30px 0 0 0;" id="navShow">
<h3>Users List</h3>
	<aui:form action="<%= showUsers %>" id="frmUser"  name="<portlet:namespace />fm">
	
	<table class="table">
			<thead>
				<tr>
				
					<th scope="col">Name</th>
					<th scope="col">Surname</th>
					<th scope="col">Address</th>
					<th scope="col">Id Card</th>
				</tr>
			</thead>
			<tbody>
	<%
	@SuppressWarnings("unchecked")
	List<User> userList = (List<User>)request.getAttribute("userList");
	if(userList!=null){
	for(User userf : userList){
	%>
	<tr>
      <th scope="row"><%=userf.getName() %></th>
      <td><%=userf.getSurname() %></td>
      <td><%=userf.getAddress() %></td>
      <td><%=userf.getIdCard() %></td>
   
    </tr>
	
	
	
	<%	
	}   
	}
   	%>
			</tbody>
		</table>
	

	<aui:button-row>
	<aui:button type="submit" value="Refresh" id="submit"></aui:button>
	
	</aui:button-row>
	</aui:form>
	
</div>