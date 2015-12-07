package hello;

import org.bitcoinj.crypto.DeterministicKey;
import org.bitcoinj.crypto.HDKeyDerivation;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class KeyGenerator {
    private byte[] masterKey;
    private byte[] chainCode;
    private final int CHILD_NUMBER = 0;
    private String privateKey;

    public KeyGenerator(String masterKey, String chainCode) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            new RuntimeException(e);
        }
        this.masterKey = new BigInteger(masterKey,16).toByteArray();
        this.chainCode = md.digest(chainCode.getBytes());

        generatePrivateKey();
    }

    private void generatePrivateKey(){
        // TODO some derivation here
    }

    public String getPrivateKey() {
        return privateKey;
    }

}
