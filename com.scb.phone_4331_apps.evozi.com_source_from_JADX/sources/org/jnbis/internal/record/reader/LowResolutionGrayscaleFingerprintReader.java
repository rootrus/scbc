package org.jnbis.internal.record.reader;

import org.jnbis.internal.NistHelper;
import org.jnbis.record.LowResolutionGrayscaleFingerprint;

public class LowResolutionGrayscaleFingerprintReader extends RecordReader {
    public LowResolutionGrayscaleFingerprint read(NistHelper.Token token) {
        if (token.pos < token.buffer.length) {
            LowResolutionGrayscaleFingerprint lowResolutionGrayscaleFingerprint = new LowResolutionGrayscaleFingerprint();
            Integer valueOf = Integer.valueOf((int) readInt(token));
            byte b = token.buffer[token.pos + 6];
            int intValue = valueOf.intValue() - 18;
            if (token.pos + intValue + 17 > token.buffer.length) {
                intValue += (token.buffer.length - token.pos) - 18;
            }
            byte[] bArr = new byte[intValue];
            System.arraycopy(token.buffer, token.pos + 18, bArr, 0, (intValue + 18) - 18);
            token.pos += valueOf.intValue();
            lowResolutionGrayscaleFingerprint.setImageDesignationCharacter(Integer.toString(b));
            lowResolutionGrayscaleFingerprint.setImageData(bArr);
            lowResolutionGrayscaleFingerprint.setLogicalRecordLength(valueOf.toString());
            return lowResolutionGrayscaleFingerprint;
        }
        throw new RuntimeException("T3::NULL pointer to T3 record");
    }
}
