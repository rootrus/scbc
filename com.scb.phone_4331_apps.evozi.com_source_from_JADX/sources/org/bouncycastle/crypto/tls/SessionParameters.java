package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.util.Arrays;

public final class SessionParameters {
    private int cipherSuite;
    private short compressionAlgorithm;
    private byte[] encodedServerExtensions;
    private byte[] masterSecret;
    private Certificate peerCertificate;
    private byte[] pskIdentity;
    private byte[] srpIdentity;

    public static final class Builder {
        private int cipherSuite = -1;
        private short compressionAlgorithm = -1;
        private byte[] encodedServerExtensions = null;
        private byte[] masterSecret = null;
        private Certificate peerCertificate = null;
        private byte[] pskIdentity = null;
        private byte[] srpIdentity = null;

        private void validate(boolean z, String str) {
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Required session parameter '");
                sb.append(str);
                sb.append("' not configured");
                throw new IllegalStateException(sb.toString());
            }
        }

        public final SessionParameters build() {
            boolean z = true;
            validate(this.cipherSuite >= 0, "cipherSuite");
            validate(this.compressionAlgorithm >= 0, "compressionAlgorithm");
            if (this.masterSecret == null) {
                z = false;
            }
            validate(z, "masterSecret");
            return new SessionParameters(this.cipherSuite, this.compressionAlgorithm, this.masterSecret, this.peerCertificate, this.pskIdentity, this.srpIdentity, this.encodedServerExtensions);
        }

        public final Builder setCipherSuite(int i) {
            this.cipherSuite = i;
            return this;
        }

        public final Builder setCompressionAlgorithm(short s) {
            this.compressionAlgorithm = s;
            return this;
        }

        public final Builder setMasterSecret(byte[] bArr) {
            this.masterSecret = bArr;
            return this;
        }

        public final Builder setPSKIdentity(byte[] bArr) {
            this.pskIdentity = bArr;
            return this;
        }

        public final Builder setPeerCertificate(Certificate certificate) {
            this.peerCertificate = certificate;
            return this;
        }

        public final Builder setPskIdentity(byte[] bArr) {
            this.pskIdentity = bArr;
            return this;
        }

        public final Builder setSRPIdentity(byte[] bArr) {
            this.srpIdentity = bArr;
            return this;
        }

        public final Builder setServerExtensions(Hashtable hashtable) throws IOException {
            if (hashtable == null) {
                this.encodedServerExtensions = null;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                TlsProtocol.writeExtensions(byteArrayOutputStream, hashtable);
                this.encodedServerExtensions = byteArrayOutputStream.toByteArray();
            }
            return this;
        }
    }

    private SessionParameters(int i, short s, byte[] bArr, Certificate certificate, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.pskIdentity = null;
        this.srpIdentity = null;
        this.cipherSuite = i;
        this.compressionAlgorithm = s;
        this.masterSecret = Arrays.clone(bArr);
        this.peerCertificate = certificate;
        this.pskIdentity = Arrays.clone(bArr2);
        this.srpIdentity = Arrays.clone(bArr3);
        this.encodedServerExtensions = bArr4;
    }

    public final void clear() {
        byte[] bArr = this.masterSecret;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    public final SessionParameters copy() {
        return new SessionParameters(this.cipherSuite, this.compressionAlgorithm, this.masterSecret, this.peerCertificate, this.pskIdentity, this.srpIdentity, this.encodedServerExtensions);
    }

    public final int getCipherSuite() {
        return this.cipherSuite;
    }

    public final short getCompressionAlgorithm() {
        return this.compressionAlgorithm;
    }

    public final byte[] getMasterSecret() {
        return this.masterSecret;
    }

    public final byte[] getPSKIdentity() {
        return this.pskIdentity;
    }

    public final Certificate getPeerCertificate() {
        return this.peerCertificate;
    }

    public final byte[] getPskIdentity() {
        return this.pskIdentity;
    }

    public final byte[] getSRPIdentity() {
        return this.srpIdentity;
    }

    public final Hashtable readServerExtensions() throws IOException {
        if (this.encodedServerExtensions == null) {
            return null;
        }
        return TlsProtocol.readExtensions(new ByteArrayInputStream(this.encodedServerExtensions));
    }
}
