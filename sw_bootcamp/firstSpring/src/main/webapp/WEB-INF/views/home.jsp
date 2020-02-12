<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Home</title>
	<%@include file="./common_resource.jsp" %>
	<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/home.js"></script>
	<link href="${pageContext.request.contextPath }/resources/css/home.css" rel="stylesheet">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <script src="https://d3js.org/d3.v5.min.js"></script>
    <script src="http://labratrevenge.com/d3-tip/javascripts/d3.tip.v0.6.3.js"></script>
    <style>
	    .chart div {
	      font: 20px sans-serif;
	      background-color: orange;
	      text-align: left;
	      padding: 3px;
	      margin: 1px;
	      color: steelblue;
	    }
	    .chart div:hover {
	      font: 25px sans-serif;
	      background-color: orangered;
	      text-align: left;
	      padding: 10x;
	      margin: 1px;
	      color: steelblue;
	    }
    </style>
</head>
<body>
	<h1>Hello world!</h1>
	<button id="load_movieList" type="button">와인 데이터 가져오기</button>
	<button id="load_mean" type="button">와인 차트 가져오기</button>
	<table>
		<thead>
			<tr>
				<th>fixed_acidity</th>
				<th>volitile_acidity</th>
				<th>citric_acid</th>
				<th>residual_sugar</th>
				<th>chlorides</th>
				<th>free_sulfur_dioxide</th>
				<th>total_sulfur_dioxide</th>
				<th>density</th>
				<th>pH</th>
				<th>sulphates</th>
				<th>alcohol</th>
				<th>quality</th>
			</tr>
		</thead>
		<tbody id="movieList"></tbody>
	</table>
	<div id="chart" class="chart"></div>
</body>
</html>
