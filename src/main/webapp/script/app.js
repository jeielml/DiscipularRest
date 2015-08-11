'use strict';

var app = angular.module('App', [ 'ngRoute', 'pascalprecht.translate', 'tmh.dynamicLocale', 'currencyMask', 'ngAnimate', 'mgcrea.ngStrap', 'ui.select', 'ngSanitize']);

app.run(function($rootScope, $translate, tmhDynamicLocale) {
	$rootScope.dataHoje = new Date();
	$rootScope.key = 'pt-br';
	
	$rootScope.mudarLinguagem = function(key) {
		$translate.use(key);
		tmhDynamicLocale.set(key);
		$rootScope.key = key;
	};
	
	$rootScope.mudarLinguagem($rootScope.key);
	
	$rootScope.addMsgSucesso = function(msgSucesso) {
		$rootScope.msgSucesso = msgSucesso;
		
		setTimeout(function() {
			$rootScope.$apply(function () {
				delete $rootScope.msgSucesso;
			});
		}, 4000);
	};
	
	$rootScope.addMsgErro = function(msgErro) {
		$rootScope.msgErro = msgErro;
		
		setTimeout(function() {
			$rootScope.$apply(function () {
				delete $rootScope.msgErro;
			});
		}, 4000);
	};
	
});

app.config(function(uiSelectConfig) {
	  uiSelectConfig.theme = 'bootstrap';
	  uiSelectConfig.resetSearchInput = true;
	  uiSelectConfig.appendToBody = true;
});