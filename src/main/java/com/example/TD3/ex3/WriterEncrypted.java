package com.example.TD3.ex3;
import java.io.IOException;
import java.io.Writer;

public class WriterEncrypted extends Writer {
    private Writer writer;

    public WriterEncrypted(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void write(char[] chars, int i, int i1) throws IOException {
        char[] encryptedChars = encrypt(chars,  "caesar", 3);
        writer.write(encryptedChars, i, i1);
        ((ExtendedWriter) writer).a();
    }

    public char[] encrypt(char[] chars, String algorithm, int key){

        // encryption operation here
        if (algorithm.equals("caesar")){
            CaesarCipher cipher = new CaesarCipher();
            return cipher.cipher(String.copyValueOf(chars), key).toCharArray();
        }
        return chars;
    }

    @Override
    public void flush() throws IOException {
        // handle output flushing
    }

    @Override
    public void close() throws IOException {
        // handle Writer closing
    }
}
