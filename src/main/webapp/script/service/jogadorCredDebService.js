'use strict';

var app = angular.module('App');

app.factory('JogadorCredDebService', function($http, Config) {
	var urlJogadoresCredDeb = Config.API.urlAPI + 'jogadorescreddeb/';
	var urlJogadores = Config.API.urlAPI + 'jogadores/';
	
	var _inserirJogadorCredDeb = function(jogadorCredDeb) {
		return $http.post(urlJogadoresCredDeb, jogadorCredDeb);
	};
	var _atualizarJogadorCredDeb = function(jogadorCredDeb) {
		return $http.put(urlJogadoresCredDeb, jogadorCredDeb);
	};
	var _excluirJogadorCredDeb = function(jogadorCredDeb) {
		var params = {
				codigo: jogadorCredDeb.codigo
		};
		return $http['delete'](urlJogadoresCredDeb + jogadorCredDeb.codigo, {params: params});
	};
	var _listarJogadoresCredDeb = function() {
		return $http.get(urlJogadoresCredDeb);
	};
	
	var _listarJogadores = function() {
		return $http.get(urlJogadores);
	};
	
	return {
		inserirJogadorCredDeb: _inserirJogadorCredDeb,
		atualizarJogadorCredDeb: _atualizarJogadorCredDeb,
		excluirJogadorCredDeb: _excluirJogadorCredDeb,
		listarJogadoresCredDeb: _listarJogadoresCredDeb,
		
		listarJogadores: _listarJogadores
	};
	
});