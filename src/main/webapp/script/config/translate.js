'use strict';

var app = angular.module('App');

app.config(function($translateProvider) {
	$translateProvider.translations('pt-br', {
		NOME_APLICACAO: 'Street King Club F.C.',
		NENHUM_REGISTRO: 'Nenhum registro.',
		OPCOES: 'Opções',
		MENU: 'Menu',
		COPYRIGHT: '© {{ano}} Eduardo Marcon',
		
		SALVAR_MODAL: 'Salvar',
		CANCELAR_MODAL: 'Cancelar',
		FECHAR_MODAL: 'Fechar',
		
		ADICIONAR_REGISTRO: 'Adicionar registro',
		ALTERAR_REGISTRO: 'Alterar registro',
		EXCLUIR_REGISTRO: 'Excluir registro',
		REGISTRO_SALVO_COM_SUCESSO: 'Registro salvo com sucesso.',
		REGISTRO_EXCLUIDO_COM_SUCESSO: 'Registro excluído com sucesso.',
		
		STATUS: 'Status',
		STATUS_ATIVO: 'Ativo',
		STATUS_INATIVO: 'Inativo',
		
		PERFIL: 'Perfil',
		PERFIL_SPT: 'Suporte',
		PERFIL_ADM: 'Administrador',
		PERFIL_USU: 'Usuário',
		
		CONFIRMACAO_: 'Confirmação',
		CONFIRMACAO_SIM: 'Confirmado',
		CONFIRMACAO_NAO: 'Não confirmado',
		
		SELECIONE: 'Selecione'
	});
	
});