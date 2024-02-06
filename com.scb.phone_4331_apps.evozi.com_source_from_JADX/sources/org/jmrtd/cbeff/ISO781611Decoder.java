package org.jmrtd.cbeff;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.util.HashMap;
import java.util.logging.Logger;
import net.p088sf.scuba.tlv.TLVInputStream;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.AlertController$RecycleListView;

public class ISO781611Decoder implements ISO781611 {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private BiometricDataBlockDecoder<?> bdbDecoder;

    public ISO781611Decoder(BiometricDataBlockDecoder<?> biometricDataBlockDecoder) {
        this.bdbDecoder = biometricDataBlockDecoder;
    }

    public ComplexCBEFFInfo decode(InputStream inputStream) throws IOException {
        return readBITGroup(inputStream);
    }

    private ComplexCBEFFInfo readBITGroup(InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int write = tLVInputStream.write();
        if (write == 32609) {
            return readBITGroup(write, tLVInputStream.IconCompatParcelizer(), inputStream);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected tag ");
        sb.append(Integer.toHexString(32609));
        sb.append(", found ");
        sb.append(Integer.toHexString(write));
        throw new IllegalArgumentException(sb.toString());
    }

    private ComplexCBEFFInfo readBITGroup(int i, int i2, InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        ComplexCBEFFInfo complexCBEFFInfo = new ComplexCBEFFInfo();
        if (i == 32609) {
            int write = tLVInputStream.write();
            if (write == 2) {
                int IconCompatParcelizer = tLVInputStream.IconCompatParcelizer();
                if (IconCompatParcelizer == 1) {
                    byte[] MediaBrowserCompat$ItemReceiver = tLVInputStream.MediaBrowserCompat$ItemReceiver();
                    byte b = MediaBrowserCompat$ItemReceiver[0];
                    for (int i3 = 0; i3 < (b & 255); i3++) {
                        complexCBEFFInfo.add(readBIT(inputStream, i3));
                    }
                    return complexCBEFFInfo;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("BIOMETRIC_INFO_COUNT should have length 1, found length ");
                sb.append(IconCompatParcelizer);
                throw new IllegalArgumentException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected tag BIOMETRIC_INFO_COUNT_TAG (");
            sb2.append(Integer.toHexString(2));
            sb2.append(") in CBEFF structure, found ");
            sb2.append(Integer.toHexString(write));
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Expected tag ");
        sb3.append(Integer.toHexString(32609));
        sb3.append(", found ");
        sb3.append(Integer.toHexString(i));
        throw new IllegalArgumentException(sb3.toString());
    }

    private CBEFFInfo readBIT(InputStream inputStream, int i) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        return readBIT(tLVInputStream.write(), tLVInputStream.IconCompatParcelizer(), inputStream, i);
    }

    private CBEFFInfo readBIT(int i, int i2, InputStream inputStream, int i3) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        if (i == 32608) {
            int write = tLVInputStream.write();
            int IconCompatParcelizer = tLVInputStream.IconCompatParcelizer();
            if (write == 125) {
                readStaticallyProtectedBIT(inputStream, write, IconCompatParcelizer, i3);
                return null;
            } else if ((write & 160) == 160) {
                return new SimpleCBEFFInfo(readBiometricDataBlock(inputStream, readBHT(inputStream, write, IconCompatParcelizer, i3), i3));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported template tag: ");
                sb.append(Integer.toHexString(write));
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected tag BIOMETRIC_INFORMATION_TEMPLATE_TAG (");
            sb2.append(Integer.toHexString(32608));
            sb2.append("), found ");
            sb2.append(Integer.toHexString(i));
            sb2.append(", index is ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private StandardBiometricHeader readBHT(InputStream inputStream, int i, int i2, int i3) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        if (i != 161) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected tag ");
            sb.append(Integer.toHexString(CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384));
            sb.append(", found ");
            sb.append(Integer.toHexString(i));
            String obj = sb.toString();
            Logger logger = LOGGER;
            if (logger != null) {
                logger.warning(obj);
            }
        }
        HashMap hashMap = new HashMap();
        int i4 = 0;
        while (i4 < i2) {
            int write = tLVInputStream.write();
            int write2 = AlertController$RecycleListView.write(write);
            int MediaBrowserCompat$CustomActionResultReceiver = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(tLVInputStream.IconCompatParcelizer());
            byte[] MediaBrowserCompat$ItemReceiver = tLVInputStream.MediaBrowserCompat$ItemReceiver();
            i4 = i4 + write2 + MediaBrowserCompat$CustomActionResultReceiver + MediaBrowserCompat$ItemReceiver.length;
            hashMap.put(Integer.valueOf(write), MediaBrowserCompat$ItemReceiver);
        }
        return new StandardBiometricHeader(hashMap);
    }

    private void readStaticallyProtectedBIT(InputStream inputStream, int i, int i2, int i3) throws IOException {
        TLVInputStream tLVInputStream = new TLVInputStream(new ByteArrayInputStream(decodeSMTValue(inputStream)));
        readBiometricDataBlock(new ByteArrayInputStream(decodeSMTValue(inputStream)), readBHT(tLVInputStream, tLVInputStream.write(), tLVInputStream.IconCompatParcelizer(), i3), i3);
    }

    private byte[] decodeSMTValue(InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int write = tLVInputStream.write();
        int IconCompatParcelizer = tLVInputStream.IconCompatParcelizer();
        if (write == 129) {
            return tLVInputStream.MediaBrowserCompat$ItemReceiver();
        }
        if (write != 133) {
            long j = 0;
            if (write == 142) {
                while (true) {
                    long j2 = (long) IconCompatParcelizer;
                    if (j >= j2) {
                        return null;
                    }
                    j += tLVInputStream.skip(j2);
                }
            } else if (write != 158) {
                return null;
            } else {
                while (true) {
                    long j3 = (long) IconCompatParcelizer;
                    if (j >= j3) {
                        return null;
                    }
                    j += tLVInputStream.skip(j3);
                }
            }
        } else {
            throw new AccessControlException("Access denied. Biometric Information Template is statically protected.");
        }
    }

    private BiometricDataBlock readBiometricDataBlock(InputStream inputStream, StandardBiometricHeader standardBiometricHeader, int i) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int write = tLVInputStream.write();
        if (write == 24366 || write == 32558) {
            return this.bdbDecoder.decode(inputStream, standardBiometricHeader, i, tLVInputStream.IconCompatParcelizer());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected tag BIOMETRIC_DATA_BLOCK_TAG (");
        sb.append(Integer.toHexString(24366));
        sb.append(") or BIOMETRIC_DATA_BLOCK_TAG_ALT (");
        sb.append(Integer.toHexString(32558));
        sb.append("), found ");
        sb.append(Integer.toHexString(write));
        throw new IllegalArgumentException(sb.toString());
    }
}
