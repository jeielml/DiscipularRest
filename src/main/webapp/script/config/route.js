'use strict';

var app = angular.module('App');

app.config(function($routeProvider, $translateProvider, tmhDynamicLocaleProvider) {
	$routeProvider
		.when('/', {
			templateUrl: 'pages/inicio.html'
		})
		.when('/jogadores', {
			templateUrl: 'pages/jogadores.html',
			controller: 'JogadorCtrl'
		})
		.when('/jogos', {
			templateUrl: 'pages/jogos.html',
			controller: 'JogoCtrl'
		})
		.when('/jogadoresCredDeb', {
			templateUrl: 'pages/jogadoresCredDeb.html',
			controller: 'JogadorCredDebCtrl'
		});
});