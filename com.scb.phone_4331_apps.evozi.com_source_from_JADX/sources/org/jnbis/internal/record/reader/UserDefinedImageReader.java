package org.jnbis.internal.record.reader;

import org.jnbis.internal.NistHelper;
import org.jnbis.record.UserDefinedImage;

public class UserDefinedImageReader extends RecordReader {
    public UserDefinedImage read(NistHelper.Token token) {
        if (token.pos < token.buffer.length) {
            UserDefinedImage userDefinedImage = new UserDefinedImage();
            Integer valueOf = Integer.valueOf((int) readInt(token));
            int intValue = valueOf.intValue() - 5;
            if (token.pos + intValue + 4 > token.buffer.length) {
                intValue += (token.buffer.length - token.pos) - 5;
            }
            byte[] bArr = new byte[intValue];
            System.arraycopy(token.buffer, token.pos + 5, bArr, 0, (intValue + 5) - 5);
            token.pos += valueOf.intValue();
            userDefinedImage.setImageData(bArr);
            userDefinedImage.setLogicalRecordLength(valueOf.toString());
            return userDefinedImage;
        }
        throw new RuntimeException("T7::NULL pointer to T7 record");
    }
}
