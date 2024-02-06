package org.jnbis.internal.record.reader;

import org.jnbis.internal.NistHelper;
import org.jnbis.record.HighResolutionGrayscaleFingerprint;

public class HighResolutionGrayscaleFingerprintReader extends RecordReader {
    public HighResolutionGrayscaleFingerprint read(NistHelper.Token token) {
        if (token.pos < token.buffer.length) {
            HighResolutionGrayscaleFingerprint highResolutionGrayscaleFingerprint = new HighResolutionGrayscaleFingerprint();
            Integer valueOf = Integer.valueOf((int) readInt(token));
            byte b = token.buffer[token.pos + 6];
            int intValue = valueOf.intValue() - 18;
            if (token.pos + intValue + 17 > token.buffer.length) {
                intValue += (token.buffer.length - token.pos) - 18;
            }
            byte[] bArr = new byte[intValue];
            System.arraycopy(token.buffer, token.pos + 18, bArr, 0, (intValue + 18) - 18);
            token.pos += valueOf.intValue();
            highResolutionGrayscaleFingerprint.setImageDesignationCharacter(Integer.toString(b));
            highResolutionGrayscaleFingerprint.setImageData(bArr);
            highResolutionGrayscaleFingerprint.setLogicalRecordLength(valueOf.toString());
            return highResolutionGrayscaleFingerprint;
        }
        throw new RuntimeException("T4::NULL pointer to T4 record");
    }
}
