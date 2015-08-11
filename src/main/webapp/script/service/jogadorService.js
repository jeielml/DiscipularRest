'use strict';

var app = angular.module('App');

app.factory('JogadorService', function($http, Config) {
	var urlJogadores = Config.API.urlAPI + 'jogadores/';
	var urlStatus = Config.API.urlAPI + 'status/';
	var urlPerfis = Config.API.urlAPI + 'perfis/';
	
	var _inserirJogador = function(jogador) {
		return $http.post(urlJogadores, jogador);
	};
	var _atualizarJogador = function(jogador) {
		return $http.put(urlJogadores, jogador);
	};
	var _excluirJogador = function(jogador) {
		var params = {
				codigo: jogador.codigo
		};
		return $http['delete'](urlJogadores + jogador.codigo, {params: params});
	};
	var _listarJogadores = function() {
		return $http.get(urlJogadores);
	};
	
	var _listarStatus = function() {
		return $http.get(urlStatus);
	};
	
	var _listarPerfis = function() {
		return $http.get(urlPerfis);
	};
	
	return {
		inserirJogador: _inserirJogador,
		atualizarJogador: _atualizarJogador,
		excluirJogador: _excluirJogador,
		listarJogadores: _listarJogadores,
		
		listarStatus: _listarStatus,
		listarPerfis: _listarPerfis
	};
	
});