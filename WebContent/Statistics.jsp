<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
.height {
	height: 250px;
}

.wrapper {
	box-sizing: border-box;
	overflow: hidden;
	height: 100%;
	margin: 0px;
}

.card {
	float: left;
}

</style>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">

			$(window).on("resize",function(){
				drawChart();//svg는 정적이므로 사이즈가 변할 때 마다 함수를 다시 그린다
			})

        
            google.charts.load('current', {'packages':['corechart']});
            google.charts.setOnLoadCallback(drawChart);

            function drawChart() {
                var data = google.visualization.arrayToDataTable([
                    ['Day', '방문자'],
                    <c:forEach var="tmp" items="${result1}">
                    ['${tmp.time}시', ${tmp.visit}],
                    </c:forEach>  
                ]);

                var options = {
                    title: '일일 방문자 통계',
                    curveType: 'function',
                    legend: { position: 'bottom' }
                };

                var lineChart = new google.visualization.LineChart(document.getElementById('curve_chart'));

                lineChart.draw(data, options);
                // ------------------------------------- curverChart 에 대한 작업.
                
                
                var data = google.visualization.arrayToDataTable([
				    ['Week', '방문자'],
                <c:forEach var="tmp" items="${result2}">
                ['${tmp.week}', ${tmp.visit2}],
                </c:forEach> 

				]);

				var options = {
					title: '지난 주 방문자 통계',
					hAxis: {title: '요일',  titleTextStyle: {color: '#333'}},
					vAxis: {minValue: 0}
				};

				var areaChart = new google.visualization.AreaChart(document.getElementById('chart_div'));
				areaChart.draw(data, options);
                // --------------------------------------- areaChart 에 대한 작업
              
				var data = google.visualization.arrayToDataTable([
		        	['Task', 'Hours per Day'],
		        	<c:forEach var="tmp" items="${result3}">
		        	['${tmp.age}' , ${tmp.visit}],
		                  </c:forEach>
		        ]);
		        var options = {
		          title: '지난 달 방문자 연령별 통계',
		          pieHole: 0.3,
		        };
		        var pieChart = new google.visualization.PieChart(document.getElementById('donutchart'));
		        pieChart.draw(data, options);
                
		        
		        var data = google.visualization.arrayToDataTable([ 
		           	['gender', 'visit'], 
		           	<c:forEach var="tmp" items="${gender}">
		           	['male', ${tmp.male}],
		           	['female', ${tmp.female}]
		                     </c:forEach>
		           ]); 
		           var options = { 
		             title: '지난 달 방문자 성별 통계', 
		             pieHole: 0.3, 
		           }; 
		           var pieChart2 = new google.visualization.PieChart(document.getElementById('donutchart2')); 
		           pieChart2.draw(data, options); 
                
            }
            
            
            <!--         ----------------------------------------------     -->
            <!-- <script type="text/javascript" -->
            <!-- 	src="https://www.gstatic.com/charts/loader.js"></script> -->
            <!-- <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script> -->
            <!-- <script type="text/javascript"> -->
            <!-- //             google.charts.load('current', {'packages':['corechart']}); -->
            <!-- //             google.charts.setOnLoadCallback(drawVisualization); -->

            <!-- //             function drawVisualization() { -->
            <!-- //                 // Some raw data (not necessarily accurate) -->
            <!-- //                 var data = google.visualization.arrayToDataTable([ -->
            <!-- //                     ['Week', '남자', '여자', '20대', '30대', '40대', '총 방문자'], -->
            <%-- //                     <c:forEach var="tmp" items="${total}"> --%>
            <%-- //                 	['${tmp.day}요일', ${tmp.male}, ${tmp.female},  --%>
            <%-- //                 	  ${tmp.age20}, ${tmp.age30}, ${tmp.age40},${tmp.male}], --%>
            <%-- //                           </c:forEach> --%>
            <!-- //                 ]); -->

            <!-- //                 var options = { -->
            <!-- //                     title : '주간 방문자 통계', -->
            <!-- //                     vAxis: {title: 'Visitor'}, -->
            <!-- //                     hAxis: {title: 'Week'}, -->
            <!-- //                     seriesType: 'bars', -->
            <!-- //                     series: {5: {type: 'line'}} -->
            <!-- //                 }; -->

            <!-- //                 var chart = new google.visualization.ComboChart(document.getElementById('chart_div')); -->
            <!-- //                 chart.draw(data, options); -->
            <!-- //             } -->
            <!--             </script> -->
            <!--            ----------------------------- -->
            
            
            </script>



</head>
<body>
	<div class="container ">
		<div class="row">

			<div
				class="height col-lg-6 col-md-6 col-sm-12 card border-success p-0 m-0">
				<div id="curve_chart" class="graph  p-0 m-0"></div>
			</div>
			<div
				class="height col-lg-6 col-md-6 col-sm-12 card border-success p-0 m-0">
				<div id="chart_div" class="graph   p-0 m-0"></div>
			</div>
			<div
				class="height col-lg-6 col-md-6 col-sm-12 card border-success p-0 m-0">
				<div id="donutchart" class="graph"></div>
			</div>
			<div
				class="height col-lg-6 col-md-6 col-sm-12 card border-success p-0 m-0">
				<div id="donutchart2" class="graph"></div>
			</div>

		</div>
		<br>
		<button type="button" class="btn btn-outline-danger ">뒤로가기</button>
	</div>
</body>
</html>