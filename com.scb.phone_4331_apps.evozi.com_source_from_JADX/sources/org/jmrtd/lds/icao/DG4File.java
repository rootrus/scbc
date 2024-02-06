package org.jmrtd.lds.icao;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
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
import org.jmrtd.lds.iso19794.IrisInfo;

public class DG4File extends CBEFFDataGroup<IrisInfo> {
    private static final ISO781611Decoder DECODER = new ISO781611Decoder(new BiometricDataBlockDecoder<IrisInfo>() {
        public final IrisInfo decode(InputStream inputStream, StandardBiometricHeader standardBiometricHeader, int i, int i2) throws IOException {
            return new IrisInfo(standardBiometricHeader, inputStream);
        }
    });
    private static final ISO781611Encoder<IrisInfo> ENCODER = new ISO781611Encoder<>(new BiometricDataBlockEncoder<IrisInfo>() {
        public final void encode(IrisInfo irisInfo, OutputStream outputStream) throws IOException {
            irisInfo.writeObject(outputStream);
        }
    });
    private static final long serialVersionUID = -1290365855823447586L;
    private boolean shouldAddRandomDataIfEmpty;

    public DG4File(List<IrisInfo> list) {
        this(list, true);
    }

    public DG4File(List<IrisInfo> list, boolean z) {
        super(118, list);
        this.shouldAddRandomDataIfEmpty = z;
    }

    public DG4File(InputStream inputStream) throws IOException {
        super(118, inputStream);
    }

    public void readContent(InputStream inputStream) throws IOException {
        for (CBEFFInfo next : DECODER.decode(inputStream).getSubRecords()) {
            if (next instanceof SimpleCBEFFInfo) {
                BiometricDataBlock biometricDataBlock = ((SimpleCBEFFInfo) next).getBiometricDataBlock();
                if (biometricDataBlock instanceof IrisInfo) {
                    add((IrisInfo) biometricDataBlock);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Was expecting an IrisInfo, found ");
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
        for (IrisInfo simpleCBEFFInfo : getSubRecords()) {
            complexCBEFFInfo.add(new SimpleCBEFFInfo(simpleCBEFFInfo));
        }
        ENCODER.encode(complexCBEFFInfo, outputStream);
        if (this.shouldAddRandomDataIfEmpty) {
            writeOptionalRandomData(outputStream);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DG4File [");
        sb.append(super.toString());
        sb.append("]");
        return sb.toString();
    }

    public List<IrisInfo> getIrisInfos() {
        return getSubRecords();
    }

    public void addIrisInfo(IrisInfo irisInfo) {
        add(irisInfo);
    }

    public void removeIrisInfo(int i) {
        remove(i);
    }
}
