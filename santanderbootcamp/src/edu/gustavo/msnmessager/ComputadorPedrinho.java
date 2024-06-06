package edu.gustavo.msnmessager;

import edu.gustavo.msnmessager.apps.FacebookMessenger;
import edu.gustavo.msnmessager.apps.MSNMessenger;
import edu.gustavo.msnmessager.apps.ServicoMensagemInstantanea;
import edu.gustavo.msnmessager.apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();

		System.out.println("FACEBOOK");
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();

		System.out.println("TELEGRAM");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();

		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		*/ 
		
		ServicoMensagemInstantanea smi = null;

		String appEscolhido="tlg"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	
	}
}

