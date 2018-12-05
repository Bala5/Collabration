var app = angular.module('myApp', [ 'ngRoute', 'ngCookies' ]);
app.config(function($routeProvider) {
	$routeProvider.when("/", {
		templateUrl : "home.html"
	}).when("/about", {
		templateUrl : "aboutus.html"
	}).when("/contact", {
		templateUrl : "contact.html"
	}).when("/login", {
		templateUrl : "login.html"
	});
});