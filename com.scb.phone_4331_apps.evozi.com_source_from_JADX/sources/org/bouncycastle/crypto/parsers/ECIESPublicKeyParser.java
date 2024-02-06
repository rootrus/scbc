package org.bouncycastle.crypto.parsers;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.util.p062io.Streams;

public class ECIESPublicKeyParser implements KeyParser {
    private ECDomainParameters ecParams;

    public ECIESPublicKeyParser(ECDomainParameters eCDomainParameters) {
        this.ecParams = eCDomainParameters;
    }

    public AsymmetricKeyParameter readKey(InputStream inputStream) throws IOException {
        int i;
        int read = inputStream.read();
        if (read != 0) {
            if (read == 2 || read == 3) {
                i = (this.ecParams.getCurve().getFieldSize() + 7) / 8;
            } else if (read == 4 || read == 6 || read == 7) {
                i = ((this.ecParams.getCurve().getFieldSize() + 7) / 8) << 1;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Sender's public key has invalid point encoding 0x");
                sb.append(Integer.toString(read, 16));
                throw new IOException(sb.toString());
            }
            byte[] bArr = new byte[(i + 1)];
            bArr[0] = (byte) read;
            Streams.readFully(inputStream, bArr, 1, bArr.length - 1);
            return new ECPublicKeyParameters(this.ecParams.getCurve().decodePoint(bArr), this.ecParams);
        }
        throw new IOException("Sender's public key invalid.");
    }
}