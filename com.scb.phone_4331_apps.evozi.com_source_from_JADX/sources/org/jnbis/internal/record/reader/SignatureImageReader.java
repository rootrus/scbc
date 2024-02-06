package org.jnbis.internal.record.reader;

import org.jnbis.internal.NistHelper;
import org.jnbis.record.SignatureImage;

public class SignatureImageReader extends RecordReader {
    public SignatureImage read(NistHelper.Token token) {
        if (token.pos < token.buffer.length) {
            SignatureImage signatureImage = new SignatureImage();
            Integer valueOf = Integer.valueOf((int) readInt(token));
            int intValue = valueOf.intValue() - 12;
            if (token.pos + intValue + 11 > token.buffer.length) {
                intValue += (token.buffer.length - token.pos) - 12;
            }
            byte[] bArr = new byte[intValue];
            System.arraycopy(token.buffer, token.pos + 12, bArr, 0, (intValue + 12) - 12);
            token.pos += valueOf.intValue();
            signatureImage.setImageData(bArr);
            signatureImage.setLogicalRecordLength(valueOf.toString());
            return signatureImage;
        }
        throw new RuntimeException("T8::NULL pointer to T8 record");
    }
}
