package org.jmrtd.lds.icao;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.logging.Logger;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.BiometricDataBlockDecoder;
import org.jmrtd.cbeff.BiometricDataBlockEncoder;
import org.jmrtd.cbeff.CBEFFInfo;
import org.jmrtd.cbeff.ComplexCBEFFInfo;
import org.jmrtd.cbeff.ISO781611Decoder;
import org.jmrtd.cbeff.ISO781611Encoder;
import org.jmrtd.cbeff.SimpleCBEFFInfo;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.CBEFFDataGroup;
import org.jmrtd.lds.iso19794.FingerInfo;

public class DG3File extends CBEFFDataGroup<FingerInfo> {
    private static final ISO781611Decoder DECODER = new ISO781611Decoder(new BiometricDataBlockDecoder<FingerInfo>() {
        public final FingerInfo decode(InputStream inputStream, StandardBiometricHeader standardBiometricHeader, int i, int i2) throws IOException {
            return new FingerInfo(standardBiometricHeader, inputStream);
        }
    });
    private static final ISO781611Encoder<FingerInfo> ENCODER = new ISO781611Encoder<>(new BiometricDataBlockEncoder<FingerInfo>() {
        public final void encode(FingerInfo fingerInfo, OutputStream outputStream) throws IOException {
            fingerInfo.writeObject(outputStream);
        }
    });
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -1037522331623814528L;
    private boolean shouldAddRandomDataIfEmpty;

    public DG3File(List<FingerInfo> list) {
        this(list, true);
    }

    public DG3File(List<FingerInfo> list, boolean z) {
        super(99, list);
        this.shouldAddRandomDataIfEmpty = z;
    }

    public DG3File(InputStream inputStream) throws IOException {
        super(99, inputStream);
    }

    public void readContent(InputStream inputStream) throws IOException {
        for (CBEFFInfo next : DECODER.decode(inputStream).getSubRecords()) {
            if (next instanceof SimpleCBEFFInfo) {
                BiometricDataBlock biometricDataBlock = ((SimpleCBEFFInfo) next).getBiometricDataBlock();
                if (biometricDataBlock instanceof FingerInfo) {
                    add((FingerInfo) biometricDataBlock);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Was expecting a FingerInfo, found ");
                    sb.append(biometricDataBlock.getClass().getSimpleName());
                    throw new IOException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Was expecting a SimpleCBEFFInfo, found ");
                sb2.append(next.getClass().getSimpleName());
                throw new IOException(sb2.toString());
            }
        }
    }

    public void writeContent(OutputStream outputStream) throws IOException {
        ComplexCBEFFInfo complexCBEFFInfo = new ComplexCBEFFInfo();
        for (FingerInfo simpleCBEFFInfo : getSubRecords()) {
            complexCBEFFInfo.add(new SimpleCBEFFInfo(simpleCBEFFInfo));
        }
        ENCODER.encode(complexCBEFFInfo, outputStream);
        if (this.shouldAddRandomDataIfEmpty) {
            writeOptionalRandomData(outputStream);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DG3File [");
        sb.append(super.toString());
        sb.append("]");
        return sb.toString();
    }

    public List<FingerInfo> getFingerInfos() {
        return getSubRecords();
    }

    public void addFingerInfo(FingerInfo fingerInfo) {
        add(fingerInfo);
    }

    public void removeFingerInfo(int i) {
        remove(i);
    }
}
