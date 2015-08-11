'use strict';

var app = angular.module('App');

app.controller('JogoCtrl', function($scope, $rootScope, JogoService) {
	
	$scope.multiple = {};
	$scope.multiple.jogadoresSelecionados = [];
	
	moment.locale('pt-br');
	
	var listarJogos = function() {
		JogoService.listarJogos().success(function($data) {
			$scope.jogos = $data;
		});
	};
	
	JogoService.listarConfirmacoes().success(function($data) {
		$scope.listaConfirmacoes = $data;
	});
	
	JogoService.listarJogadores().success(function($data) {
		$scope.listaJogadores = $data;
	});
	
	$scope.cancelarJogo = function() {
		delete $scope.jogoForm.$setPristine();
		delete $scope.jogo;
	};
	
	$scope.salvarJogo = function(jogo) {
		var service = null;
		
		if (jogo.codigo) {
			service = JogoService.atualizarJogo(jogo);
		} else {
			service = JogoService.inserirJogo(jogo);
		}
		
		service.success(function() {
			$scope.cancelarJogo();
			
			$rootScope.addMsgSucesso("REGISTRO_SALVO_COM_SUCESSO");
			
			listarJogos();
		});
	};
	
	$scope.alterarJogo = function(jogo) {
		$scope.jogo = angular.copy(jogo);
	};
	
	$scope.excluirJogo = function(jogo) {
		JogoService.excluirJogo(jogo).success(function() {
			listarJogos();
			
			$rootScope.addMsgSucesso("REGISTRO_EXCLUIDO_COM_SUCESSO");
		});
	};
	
	$scope.ordernarPor = function(campo) {
		$scope.criterioDeOrdenacao = campo;
		$scope.direcaoDaOrdenacao = !$scope.direcaoDaOrdenacao;
	};
	
	listarJogos();
	
});