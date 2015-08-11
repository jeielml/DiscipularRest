'use strict';

var app = angular.module('App');

app.controller('JogadorCredDebCtrl', function($scope, $rootScope, JogadorCredDebService) {
	var listarJogadores = function() {
		JogadorCredDebService.listarJogadores().success(function($data) {
			$scope.jogadores = $data;
		});
	};
	
	var listarJogadoresCredDeb = function() {
		JogadorCredDebService.listarJogadoresCredDeb().success(function($data) {
			$scope.jogadoresCredDeb = $data;
		});
	};
	
	$scope.cancelarJogadorCredDeb = function() {
		delete $scope.jogadorCredDebForm.$setPristine();
		delete $scope.jogadorCredDeb;
	};
	
	$scope.salvarJogadorCredDeb = function(jogadorCredDeb) {
		var service = null;
		
		if (jogadorCredDeb.codigo) {
			service = JogadorCredDebService.atualizarJogadorCredDeb(jogadorCredDeb);
		} else {
			service = JogadorCredDebService.inserirJogadorCredDeb(jogadorCredDeb);
		}
		
		service.success(function() {
			$scope.cancelarJogadorCredDeb();
			
			$rootScope.addMsgSucesso("REGISTRO_SALVO_COM_SUCESSO");
			
			listarJogadoresCredDeb();
		});
	};
	
	$scope.alterarJogadorCredDeb = function(jogadorCredDeb) {
		$scope.jogadorCredDeb = angular.copy(jogadorCredDeb);
	};
	
	$scope.excluirJogadorCredDeb = function(jogadorCredDeb) {
		JogadorCredDebService.excluirJogadorCredDeb(jogadorCredDeb).success(function() {
			listarJogadoresCredDeb();
			
			$rootScope.addMsgSucesso("REGISTRO_EXCLUIDO_COM_SUCESSO");
		});
	};
	
	$scope.ordernarPor = function(campo) {
		$scope.criterioDeOrdenacao = campo;
		$scope.direcaoDaOrdenacao = !$scope.direcaoDaOrdenacao;
	};
	
	listarJogadoresCredDeb();
	listarJogadores();
});