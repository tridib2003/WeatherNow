<!--
	~ author: @tridib2003
-->

<html>

<head>

<title>WeatherNow</title>

<link rel="stylesheet" href="css/styles.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="//code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css" />
</head>

<body>

	<div class="center">

		<img src="images/bg1.png" class="hero-img" />

		<hr>

		<br>
		<br>

		<form action="weather-forecast" id="location-form">
			<span class="material-icons md-48 loc-icon">location_on</span> <input type="text" name="area"> <br>
			<br>
		</form>

		<button type="submit" form="location-form" value="Submit">Check</button>

	</div>

	<div class="footer">
		<p>
			Made with <i class="icon ion-heart"></i> by <a href="https://github.com/tridib2003">Tridib</a> | Supporting <a href="https://github.com/tridib2003/WeatherNow">open source</a>.
		</p>
	</div>

</body>
</html>