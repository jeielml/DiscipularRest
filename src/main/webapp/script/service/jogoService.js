'use strict';

var app = angular.module('App');

app.factory('JogoService', function($http, Config) {
	var urlJogos = Config.API.urlAPI + 'jogos/';
	var urlConfirmacoes = Config.API.urlAPI + 'confirmacoes/';
	var urlJogadores = Config.API.urlAPI + 'jogadores/';
	
	var _inserirJogo = function(jogo) {
		return $http.post(urlJogos, jogo);
	};
	var _atualizarJogo = function(jogo) {
		return $http.put(urlJogos, jogo);
	};
	var _excluirJogo = function(jogo) {
		var params = {
				codigo: jogo.codigo
		};
		return $http['delete'](urlJogos + jogo.codigo, {params: params});
	};
	var _listarJogos = function() {
		return $http.get(urlJogos);
	};
	var _listarConfirmacoes = function() {
		return $http.get(urlConfirmacoes);
	};
	var _listarJogadores = function() {
		return $http.get(urlJogadores);
	};
	
	return {
		inserirJogo: _inserirJogo,
		atualizarJogo: _atualizarJogo,
		excluirJogo: _excluirJogo,
		listarJogos: _listarJogos,
		
		listarConfirmacoes: _listarConfirmacoes,
		listarJogadores: _listarJogadores
	};
	
});