package p040o;

import java.util.Arrays;

/* renamed from: o.RSIllegalArgumentException */
public final class RSIllegalArgumentException {
    public final Float4 MediaBrowserCompat$CustomActionResultReceiver;
    public final byte[] write;

    public RSIllegalArgumentException(Float4 float4, byte[] bArr) {
        if (float4 == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = float4;
            this.write = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RSIllegalArgumentException)) {
            return false;
        }
        RSIllegalArgumentException rSIllegalArgumentException = (RSIllegalArgumentException) obj;
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.equals(rSIllegalArgumentException.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        return Arrays.equals(this.write, rSIllegalArgumentException.write);
    }

    public final int hashCode() {
        return ((this.MediaBrowserCompat$CustomActionResultReceiver.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EncodedPayload{encoding=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", bytes=[...]}");
        return sb.toString();
    }
}
