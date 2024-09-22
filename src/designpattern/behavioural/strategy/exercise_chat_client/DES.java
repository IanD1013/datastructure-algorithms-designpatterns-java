package designpattern.behavioural.strategy.exercise_chat_client;

public class DES implements EncryptionAlgorithm {
    @Override
    public String encrypt(String text) {
        System.out.println("Encrypting message using DES");
        return "encryptedText";
    }
}
