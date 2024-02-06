package org.jnbis.internal.record.reader;

import org.jnbis.internal.NistHelper;
import org.jnbis.record.HighResolutionBinaryFingerprint;

public class HighResolutionBinaryFingerprintReader extends RecordReader {
    public HighResolutionBinaryFingerprint read(NistHelper.Token token) {
        if (token.pos < token.buffer.length) {
            HighResolutionBinaryFingerprint highResolutionBinaryFingerprint = new HighResolutionBinaryFingerprint();
            Integer valueOf = Integer.valueOf((int) readInt(token));
            byte b = token.buffer[token.pos + 6];
            int intValue = valueOf.intValue() - 18;
            if (token.pos + intValue + 17 > token.buffer.length) {
                intValue += (token.buffer.length - token.pos) - 18;
            }
            byte[] bArr = new byte[intValue];
            System.arraycopy(token.buffer, token.pos + 18, bArr, 0, (intValue + 18) - 18);
            token.pos += valueOf.intValue();
            highResolutionBinaryFingerprint.setImageDesignationCharacter(Integer.toString(b));
            highResolutionBinaryFingerprint.setImageData(bArr);
            highResolutionBinaryFingerprint.setLogicalRecordLength(valueOf.toString());
            return highResolutionBinaryFingerprint;
        }
        throw new RuntimeException("T4::NULL pointer to T4 record");
    }
}
