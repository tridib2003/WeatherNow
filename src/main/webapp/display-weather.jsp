<!--
	~ author: @tridib2003
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>WeatherNow</title>

<link rel="stylesheet" href="css/styles.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="//code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>

	<div class="center">

		<img src="images/bg2.png" class="hero-img display-img" />
		
		<button class="right" type="submit" value="submit" onclick="history.go(-1)">Home</button>

	</div>

	<hr>

	<div class="forecast-section">

		<img src="images/icon4.png" class="forecast-icon" />
		<h2>${location}</h2>

		<br>
		<br> <img src="images/icon1.png" class="forecast-icon" />
		<h2>${temperature}°C, ${description}</h2>

		<br>
		<br> <img src="images/icon2.png" class="forecast-icon" />
		<h2>${humidity}%</h2>

		<br>
		<br> <img src="images/icon3.png" class="forecast-icon" />
		<h2>${wind_speed} meter/sec</h2>

		<br>
		<br>
		<br>
		<br>

	</div>

	<div class="footer">
		<p>
			Made with <i class="icon ion-heart"></i> by <a href="https://github.com/tridib2003">Tridib</a> | Supporting <a href="https://github.com/tridib2003/WeatherNow">open source</a>.
		</p>
	</div>

</body>
</html>