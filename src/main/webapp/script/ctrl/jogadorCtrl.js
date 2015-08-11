'use strict';

var app = angular.module('App');

app.controller('JogadorCtrl', function($scope, $rootScope, JogadorService) {
	var listarJogadores = function() {
		JogadorService.listarJogadores().success(function($data) {
			$scope.jogadores = $data;
		});
	};
	
	JogadorService.listarStatus().success(function($data) {
		$scope.listaStatus = $data;
	});
	
	JogadorService.listarPerfis().success(function($data) {
		$scope.listaPerfis = $data;
	});
	
	$scope.cancelarJogador = function() {
		delete $scope.jogadorForm.$setPristine();
		delete $scope.jogador;
	};
	
	$scope.salvarJogador = function(jogador) {
		var service = null;
		
		if (jogador.codigo) {
			service = JogadorService.atualizarJogador(jogador);
		} else {
			service = JogadorService.inserirJogador(jogador);
		}
		
		service.success(function() {
			$scope.cancelarJogador();
			
			$rootScope.addMsgSucesso("REGISTRO_SALVO_COM_SUCESSO");
			
			listarJogadores();
		});
	};
	
	$scope.alterarJogador = function(jogador) {
		$scope.jogador = angular.copy(jogador);
	};
	
	$scope.excluirJogador = function(jogador) {
		JogadorService.excluirJogador(jogador).success(function() {
			listarJogadores();
			
			$rootScope.addMsgSucesso("REGISTRO_EXCLUIDO_COM_SUCESSO");
		});
	};
	
	$scope.ordernarPor = function(campo) {
		$scope.criterioDeOrdenacao = campo;
		$scope.direcaoDaOrdenacao = !$scope.direcaoDaOrdenacao;
	};
	
	listarJogadores();
});