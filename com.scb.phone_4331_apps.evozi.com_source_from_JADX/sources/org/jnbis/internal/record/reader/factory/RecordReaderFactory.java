package org.jnbis.internal.record.reader.factory;

import org.jnbis.internal.NistHelper;
import org.jnbis.internal.record.BaseRecord;
import org.jnbis.internal.record.reader.FacialAndSmtImageReader;
import org.jnbis.internal.record.reader.HighResolutionBinaryFingerprintReader;
import org.jnbis.internal.record.reader.HighResolutionGrayscaleFingerprintReader;
import org.jnbis.internal.record.reader.IrisImageReader;
import org.jnbis.internal.record.reader.LowResolutionBinaryFingerprintReader;
import org.jnbis.internal.record.reader.LowResolutionGrayscaleFingerprintReader;
import org.jnbis.internal.record.reader.MinutiaeDataReader;
import org.jnbis.internal.record.reader.RecordReader;
import org.jnbis.internal.record.reader.SignatureImageReader;
import org.jnbis.internal.record.reader.TransactionInfoReader;
import org.jnbis.internal.record.reader.UserDefinedImageReader;
import org.jnbis.internal.record.reader.UserDefinedTextReader;
import org.jnbis.internal.record.reader.VariableResolutionFingerprintReader;
import org.jnbis.internal.record.reader.VariableResolutionLatentImageReader;
import org.jnbis.internal.record.reader.VariableResolutionPalmprintReader;

public class RecordReaderFactory {
    private static final RecordReader NOT_SUPPORTED = new RecordReader() {
        public final BaseRecord read(NistHelper.Token token) {
            StringBuilder sb = new StringBuilder();
            sb.append("record type: ");
            sb.append(token.crt);
            sb.append(" no supported!");
            throw new UnsupportedOperationException(sb.toString());
        }
    };
    private static final RecordReader[] READERS;

    static {
        RecordReader[] recordReaderArr = new RecordReader[18];
        READERS = recordReaderArr;
        recordReaderArr[0] = new TransactionInfoReader();
        READERS[1] = new TransactionInfoReader();
        READERS[2] = new UserDefinedTextReader();
        READERS[3] = new LowResolutionGrayscaleFingerprintReader();
        READERS[4] = new HighResolutionGrayscaleFingerprintReader();
        READERS[5] = new LowResolutionBinaryFingerprintReader();
        READERS[6] = new HighResolutionBinaryFingerprintReader();
        READERS[7] = new UserDefinedImageReader();
        READERS[8] = new SignatureImageReader();
        READERS[9] = new MinutiaeDataReader();
        READERS[10] = new FacialAndSmtImageReader();
        RecordReader[] recordReaderArr2 = READERS;
        RecordReader recordReader = NOT_SUPPORTED;
        recordReaderArr2[11] = recordReader;
        recordReaderArr2[12] = recordReader;
        recordReaderArr2[13] = new VariableResolutionLatentImageReader();
        READERS[14] = new VariableResolutionFingerprintReader();
        READERS[15] = new VariableResolutionPalmprintReader();
        RecordReader[] recordReaderArr3 = READERS;
        recordReaderArr3[16] = NOT_SUPPORTED;
        recordReaderArr3[17] = new IrisImageReader();
    }

    public RecordReader reader(NistHelper.Token token) {
        return READERS[token.crt];
    }

    public BaseRecord read(NistHelper.Token token) {
        return reader(token).read(token);
    }
}
