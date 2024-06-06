package edu.gustavo.msnmessager.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	validarConectadoInternet();
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}