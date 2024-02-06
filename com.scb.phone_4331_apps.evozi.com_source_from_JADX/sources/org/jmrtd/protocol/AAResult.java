package org.jmrtd.protocol;

import java.io.Serializable;
import java.security.PublicKey;
import java.util.Arrays;
import org.jmrtd.Util;
import p040o.AlertController$RecycleListView;

public class AAResult implements Serializable {
    private static final long serialVersionUID = 8800803919646625713L;
    private byte[] challenge;
    private String digestAlgorithm;
    private PublicKey publicKey;
    private byte[] response;
    private String signatureAlgorithm;

    public AAResult(PublicKey publicKey2, String str, String str2, byte[] bArr, byte[] bArr2) {
        this.publicKey = publicKey2;
        this.digestAlgorithm = str;
        this.signatureAlgorithm = str2;
        this.challenge = bArr;
        this.response = bArr2;
    }

    public byte[] getChallenge() {
        return this.challenge;
    }

    public byte[] getResponse() {
        return this.response;
    }

    public PublicKey getPublicKey() {
        return this.publicKey;
    }

    public String getDigestAlgorithm() {
        return this.digestAlgorithm;
    }

    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AAResult [");
        sb.append("publicKey: ");
        sb.append(Util.getDetailedPublicKeyAlgorithm(this.publicKey));
        sb.append(", digestAlgorithm: ");
        sb.append(this.digestAlgorithm);
        sb.append(", signatureAlgorithm: ");
        sb.append(this.signatureAlgorithm);
        sb.append(", challenge: ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.challenge));
        sb.append(", response: ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.response));
        return sb.toString();
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.challenge);
        String str = this.digestAlgorithm;
        int i = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        PublicKey publicKey2 = this.publicKey;
        int hashCode3 = publicKey2 == null ? 0 : publicKey2.hashCode();
        int hashCode4 = Arrays.hashCode(this.response);
        String str2 = this.signatureAlgorithm;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((hashCode + 1303377669) * 1991) + hashCode2) * 1991) + hashCode3) * 1991) + hashCode4) * 1991) + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AAResult aAResult = (AAResult) obj;
        if (!Arrays.equals(this.challenge, aAResult.challenge)) {
            return false;
        }
        String str = this.digestAlgorithm;
        if (str == null) {
            if (aAResult.digestAlgorithm != null) {
                return false;
            }
        } else if (!str.equals(aAResult.digestAlgorithm)) {
            return false;
        }
        PublicKey publicKey2 = this.publicKey;
        if (publicKey2 == null) {
            if (aAResult.publicKey != null) {
                return false;
            }
        } else if (!publicKey2.equals(aAResult.publicKey)) {
            return false;
        }
        if (!Arrays.equals(this.response, aAResult.response)) {
            return false;
        }
        String str2 = this.signatureAlgorithm;
        if (str2 == null) {
            if (aAResult.signatureAlgorithm != null) {
                return false;
            }
        } else if (!str2.equals(aAResult.signatureAlgorithm)) {
            return false;
        }
        return true;
    }
}
