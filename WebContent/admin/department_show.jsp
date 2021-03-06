<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="loginValidate.jsp" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Show Department</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" type="text/css" href="lib/bootstrap/css/bootstrap.css">
    
    <link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">

    <script src="lib/jquery-1.7.2.min.js" type="text/javascript"></script>

    <!-- Demo page code -->

    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .brand { font-family: georgia, serif; }
        .brand .first {
            color: #ccc;
            font-style: italic;
        }
        .brand .second {
            color: #fff;
            font-weight: bold;
        }
    </style>

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
  </head>

  <!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
  <!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
  <!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
  <!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
  <!--[if (gt IE 9)|!(IE)]><!--> 
  <body class=""> 
  <!--<![endif]-->
   <jsp:include page="navbar.jsp"></jsp:include>
    
    <div class="sidebar-nav">
        <!-- <form class="search form-inline">
            <input type="text" placeholder="Search...">
        </form> -->

        <a href="#dashboard-menu" class="nav-header" data-toggle="collapse"><i class="icon-dashboard"></i>Dashboard</a>
        <ul id="dashboard-menu" class="nav nav-list collapse in">
            <li><a href="index.jsp">Home</a></li>
            <li class="active"><a href="<%=basePath %>admin/department_list">Department Management</a></li>
            <li><a href="<%=basePath %>admin/employee_list">Employee Management</a></li>
        </ul>
    </div>
    

    
    <div class="content">
        
        <div class="header">
            
            <h1 class="page-title">Show Department</h1>
        </div>
        
                <ul class="breadcrumb">
            <li><a href="index.jsp">Home</a> <span class="divider">/</span></li>
            <li><a href="department_list">Departments</a> <span class="divider">/</span></li>
            <li class="active">Department</li>
        </ul>

        <div class="container-fluid">
            <div class="row-fluid">

<div class="well">
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in">
      	<table class="table table-bordered">
			<thead>
		        <tr>
		          <th width="10%">#</th>
		          <th width="20%">Department Name</th>
		          <th>Employees</th>
		        </tr>
	      	</thead>
		    <tbody>
		    	<tr>
		    		<td><s:property value="id"/></td>
		    		<td><s:property value="name"/></td>
		    		<td>
		    			<s:iterator value="employees" var="e" status="status">
		    				<s:if test="#status.last == true">
		    					<a href="employee_query?id=<s:property value="#e.id"/>"><s:property value="#e.name"/></a>
		    				</s:if>
		    				<s:else>
		    					<a href="employee_query?id=<s:property value="#e.id"/>"><s:property value="#e.name"/></a>,&nbsp;
		    				</s:else>
		    			</s:iterator>
		    		</td>
		        </tr>
		    </tbody>
		</table>
      </div>
  </div>

</div>

            </div>
        </div>
    </div>
    
    <script src="lib/bootstrap/js/bootstrap.js"></script>
  </body>
</html>


