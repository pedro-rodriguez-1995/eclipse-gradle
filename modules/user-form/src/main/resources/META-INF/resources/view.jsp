
<%@ include file="/init.jsp"%>
<%@ page import="java.util.List"%>
<%@ page import="user.form.model.User"%>

<portlet:actionURL name="addUser" var="addUser" ></portlet:actionURL>
<liferay-ui:success key="success" message="User saved successfully!"/>
<liferay-ui:error key="error" message="Sorry, error"/>

<div style="postion:relative; margin 30px 0 0 0;" id="navAdd">
<h3>Add Users</h3>
	<aui:form action="<%= addUser %>" id="frmUser" onload="loadForm();" name="<portlet:namespace />fm">
	<aui:fieldset>
		<aui:input name="userName" type="text" label="Name" required="true" style="background: white">
			<aui:validator name="maxLength">20</aui:validator>
		</aui:input>
		<aui:input name="userSurname" type="text" label="Surname" required="true" style="background: white">
			<aui:validator name="maxLength">20</aui:validator>
		</aui:input>
		<aui:input name="address" type="text" label="Address" required="true" style="background: white">
			<aui:validator name="maxLength">20</aui:validator>
		</aui:input>
		<aui:input name="userIdCard" type="text" label="UserIdCard" required="true" style="background: white">
			<aui:validator name="maxLength">20</aui:validator>
		</aui:input>
	
	
	
	</aui:fieldset>
	<aui:button-row>
	<aui:button type="submit"></aui:button>
	<aui:button type="reset" value="clear"/>
	</aui:button-row>
	</aui:form>
	
</div>


