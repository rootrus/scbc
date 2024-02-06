package org.bouncycastle.util.p062io.pem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Base64;

/* renamed from: org.bouncycastle.util.io.pem.PemWriter */
public class PemWriter extends BufferedWriter {
    private static final int LINE_LENGTH = 64;
    private char[] buf = new char[64];
    private final int nlLength;

    public PemWriter(Writer writer) {
        super(writer);
        String lineSeparator = Strings.lineSeparator();
        this.nlLength = lineSeparator != null ? lineSeparator.length() : 2;
    }

    private void writeEncoded(byte[] bArr) throws IOException {
        int i;
        byte[] encode = Base64.encode(bArr);
        int i2 = 0;
        while (i2 < encode.length) {
            int i3 = 0;
            while (true) {
                char[] cArr = this.buf;
                if (i3 == cArr.length || (i = i2 + i3) >= encode.length) {
                    write(this.buf, 0, i3);
                    newLine();
                    i2 += this.buf.length;
                } else {
                    cArr[i3] = (char) encode[i];
                    i3++;
                }
            }
            write(this.buf, 0, i3);
            newLine();
            i2 += this.buf.length;
        }
    }

    private void writePostEncapsulationBoundary(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("-----END ");
        sb.append(str);
        sb.append("-----");
        write(sb.toString());
        newLine();
    }

    private void writePreEncapsulationBoundary(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("-----BEGIN ");
        sb.append(str);
        sb.append("-----");
        write(sb.toString());
        newLine();
    }

    public int getOutputSize(PemObject pemObject) {
        int length = (((pemObject.getType().length() + 10) + this.nlLength) << 1) + 6 + 4;
        if (!pemObject.getHeaders().isEmpty()) {
            for (PemHeader pemHeader : pemObject.getHeaders()) {
                length += pemHeader.getName().length() + 2 + pemHeader.getValue().length() + this.nlLength;
            }
            length += this.nlLength;
        }
        int length2 = ((pemObject.getContent().length + 2) / 3) << 2;
        return length + length2 + ((((length2 + 64) - 1) / 64) * this.nlLength);
    }

    public void writeObject(PemObjectGenerator pemObjectGenerator) throws IOException {
        PemObject generate = pemObjectGenerator.generate();
        writePreEncapsulationBoundary(generate.getType());
        if (!generate.getHeaders().isEmpty()) {
            for (PemHeader pemHeader : generate.getHeaders()) {
                write(pemHeader.getName());
                write(": ");
                write(pemHeader.getValue());
                newLine();
            }
            newLine();
        }
        writeEncoded(generate.getContent());
        writePostEncapsulationBoundary(generate.getType());
    }
}
