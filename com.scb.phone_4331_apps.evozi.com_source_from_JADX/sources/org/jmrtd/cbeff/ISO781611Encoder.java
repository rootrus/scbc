package org.jmrtd.cbeff;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.p088sf.scuba.tlv.TLVOutputStream;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.cbeff.BiometricDataBlock;

public class ISO781611Encoder<B extends BiometricDataBlock> implements ISO781611 {
    private BiometricDataBlockEncoder<B> bdbEncoder;

    public ISO781611Encoder(BiometricDataBlockEncoder<B> biometricDataBlockEncoder) {
        this.bdbEncoder = biometricDataBlockEncoder;
    }

    public void encode(CBEFFInfo cBEFFInfo, OutputStream outputStream) throws IOException {
        if (cBEFFInfo instanceof SimpleCBEFFInfo) {
            writeBITGroup(Arrays.asList(new CBEFFInfo[]{cBEFFInfo}), outputStream);
        } else if (cBEFFInfo instanceof ComplexCBEFFInfo) {
            writeBITGroup(((ComplexCBEFFInfo) cBEFFInfo).getSubRecords(), outputStream);
        }
    }

    private void writeBITGroup(List<CBEFFInfo> list, OutputStream outputStream) throws IOException {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.IconCompatParcelizer(32609);
        tLVOutputStream.IconCompatParcelizer(2);
        int size = list.size();
        tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(new byte[]{(byte) size});
        for (int i = 0; i < size; i++) {
            writeBIT(tLVOutputStream, i, (SimpleCBEFFInfo) list.get(i));
        }
        tLVOutputStream.write();
    }

    private void writeBIT(TLVOutputStream tLVOutputStream, int i, SimpleCBEFFInfo<B> simpleCBEFFInfo) throws IOException {
        if (simpleCBEFFInfo instanceof SimpleCBEFFInfo) {
            tLVOutputStream.IconCompatParcelizer(32608);
            writeBHT(tLVOutputStream, i, simpleCBEFFInfo);
            writeBiometricDataBlock(tLVOutputStream, simpleCBEFFInfo.getBiometricDataBlock());
            tLVOutputStream.write();
            return;
        }
        throw new IllegalArgumentException("Encoder does not support level > 2 nesting");
    }

    private void writeBHT(TLVOutputStream tLVOutputStream, int i, SimpleCBEFFInfo<B> simpleCBEFFInfo) throws IOException {
        tLVOutputStream.IconCompatParcelizer(CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384);
        for (Map.Entry next : simpleCBEFFInfo.getBiometricDataBlock().getStandardBiometricHeader().getElements().entrySet()) {
            tLVOutputStream.IconCompatParcelizer(((Integer) next.getKey()).intValue());
            tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver((byte[]) next.getValue());
        }
        tLVOutputStream.write();
    }

    private void writeBiometricDataBlock(TLVOutputStream tLVOutputStream, B b) throws IOException {
        tLVOutputStream.IconCompatParcelizer(24366);
        this.bdbEncoder.encode(b, tLVOutputStream);
        tLVOutputStream.write();
    }
}
