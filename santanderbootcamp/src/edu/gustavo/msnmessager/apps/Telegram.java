package edu.gustavo.msnmessager.apps;

public class Telegram extends ServicoMensagemInstantanea {
	validarConectadoInternet();
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
}

