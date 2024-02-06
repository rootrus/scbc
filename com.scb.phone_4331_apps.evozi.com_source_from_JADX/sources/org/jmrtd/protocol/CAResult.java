package org.jmrtd.protocol;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import org.jmrtd.Util;
import p040o.AlertController$RecycleListView;

public class CAResult implements Serializable {
    private static final long serialVersionUID = 4431711176589761513L;
    private byte[] keyHash;
    private BigInteger keyId;
    private PrivateKey pcdPrivateKey;
    private PublicKey pcdPublicKey;
    private PublicKey piccPublicKey;
    private SecureMessagingWrapper wrapper;

    public CAResult(BigInteger bigInteger, PublicKey publicKey, byte[] bArr, PublicKey publicKey2, PrivateKey privateKey, SecureMessagingWrapper secureMessagingWrapper) {
        this.keyId = bigInteger;
        this.piccPublicKey = publicKey;
        this.keyHash = bArr;
        this.pcdPublicKey = publicKey2;
        this.pcdPrivateKey = privateKey;
        this.wrapper = secureMessagingWrapper;
    }

    public BigInteger getKeyId() {
        return this.keyId;
    }

    public PublicKey getPublicKey() {
        return this.piccPublicKey;
    }

    public SecureMessagingWrapper getWrapper() {
        return this.wrapper;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CAResult [keyId: ");
        sb.append(this.keyId);
        sb.append(", PICC public key: ");
        sb.append(this.piccPublicKey);
        sb.append(", wrapper: ");
        sb.append(this.wrapper);
        sb.append(", key hash: ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.keyHash));
        sb.append(", PCD public key: ");
        sb.append(Util.getDetailedPublicKeyAlgorithm(this.pcdPublicKey));
        sb.append(", PCD private key: ");
        sb.append(Util.getDetailedPrivateKeyAlgorithm(this.pcdPrivateKey));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.keyHash);
        BigInteger bigInteger = this.keyId;
        int i = 0;
        int hashCode2 = bigInteger == null ? 0 : bigInteger.hashCode();
        PublicKey publicKey = this.piccPublicKey;
        int hashCode3 = publicKey == null ? 0 : publicKey.hashCode();
        PublicKey publicKey2 = this.pcdPublicKey;
        int hashCode4 = publicKey2 == null ? 0 : publicKey2.hashCode();
        PrivateKey privateKey = this.pcdPrivateKey;
        int hashCode5 = privateKey == null ? 0 : privateKey.hashCode();
        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
        if (secureMessagingWrapper != null) {
            i = secureMessagingWrapper.hashCode();
        }
        return ((((((((((hashCode + 31) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CAResult cAResult = (CAResult) obj;
        if (!Arrays.equals(this.keyHash, cAResult.keyHash)) {
            return false;
        }
        BigInteger bigInteger = this.keyId;
        if (bigInteger == null) {
            if (cAResult.keyId != null) {
                return false;
            }
        } else if (!bigInteger.equals(cAResult.keyId)) {
            return false;
        }
        PrivateKey privateKey = this.pcdPrivateKey;
        if (privateKey == null) {
            if (cAResult.pcdPrivateKey != null) {
                return false;
            }
        } else if (!privateKey.equals(cAResult.pcdPrivateKey)) {
            return false;
        }
        PublicKey publicKey = this.pcdPublicKey;
        if (publicKey == null) {
            if (cAResult.pcdPublicKey != null) {
                return false;
            }
        } else if (!publicKey.equals(cAResult.pcdPublicKey)) {
            return false;
        }
        PublicKey publicKey2 = this.piccPublicKey;
        if (publicKey2 == null) {
            if (cAResult.piccPublicKey != null) {
                return false;
            }
        } else if (!publicKey2.equals(cAResult.piccPublicKey)) {
            return false;
        }
        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
        if (secureMessagingWrapper == null) {
            if (cAResult.wrapper != null) {
                return false;
            }
        } else if (!secureMessagingWrapper.equals(cAResult.wrapper)) {
            return false;
        }
        return true;
    }

    public byte[] getKeyHash() {
        return this.keyHash;
    }

    public PublicKey getPCDPublicKey() {
        return this.pcdPublicKey;
    }

    public PrivateKey getPCDPrivateKey() {
        return this.pcdPrivateKey;
    }
}
