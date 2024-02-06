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
import org.jmrtd.lds.iso19794.FaceInfo;

public class DG2File extends CBEFFDataGroup<FaceInfo> {
    private static final ISO781611Decoder DECODER = new ISO781611Decoder(new BiometricDataBlockDecoder<FaceInfo>() {
        public final FaceInfo decode(InputStream inputStream, StandardBiometricHeader standardBiometricHeader, int i, int i2) throws IOException {
            return new FaceInfo(standardBiometricHeader, inputStream);
        }
    });
    private static final ISO781611Encoder<FaceInfo> ENCODER = new ISO781611Encoder<>(new BiometricDataBlockEncoder<FaceInfo>() {
        public final void encode(FaceInfo faceInfo, OutputStream outputStream) throws IOException {
            faceInfo.writeObject(outputStream);
        }
    });
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 414300652684010416L;

    public DG2File(List<FaceInfo> list) {
        super(117, list);
    }

    public DG2File(InputStream inputStream) throws IOException {
        super(117, inputStream);
    }

    public void readContent(InputStream inputStream) throws IOException {
        for (CBEFFInfo next : DECODER.decode(inputStream).getSubRecords()) {
            if (next instanceof SimpleCBEFFInfo) {
                BiometricDataBlock biometricDataBlock = ((SimpleCBEFFInfo) next).getBiometricDataBlock();
                if (biometricDataBlock instanceof FaceInfo) {
                    add((FaceInfo) biometricDataBlock);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Was expecting a FaceInfo, found ");
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
        for (FaceInfo simpleCBEFFInfo : getSubRecords()) {
            complexCBEFFInfo.add(new SimpleCBEFFInfo(simpleCBEFFInfo));
        }
        ENCODER.encode(complexCBEFFInfo, outputStream);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DG2File [");
        sb.append(super.toString());
        sb.append("]");
        return sb.toString();
    }

    public List<FaceInfo> getFaceInfos() {
        return getSubRecords();
    }

    public void addFaceInfo(FaceInfo faceInfo) {
        add(faceInfo);
    }

    public void removeFaceInfo(int i) {
        remove(i);
    }
}
