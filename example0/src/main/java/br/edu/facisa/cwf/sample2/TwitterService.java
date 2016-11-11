package br.edu.facisa.cwf.sample2;

/*
 * Implementação da Interface
 */
public class TwitterService implements MessageService {
 
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Twitter message Sent to "+rec+ " with Message="+msg);
        return true;
    }
 
}