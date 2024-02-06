package p040o;

import android.util.Base64;
import java.util.Arrays;

/* renamed from: o.ECouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
public class C6439x870a5304 {
    final byte[] MediaBrowserCompat$CustomActionResultReceiver;
    final byte[] MediaBrowserCompat$ItemReceiver;
    final byte[] read;

    public C6439x870a5304(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[bArr.length];
        this.read = bArr4;
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        byte[] bArr5 = new byte[bArr2.length];
        this.MediaBrowserCompat$ItemReceiver = bArr5;
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        byte[] bArr6 = new byte[bArr3.length];
        this.MediaBrowserCompat$CustomActionResultReceiver = bArr6;
        System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
    }

    public C6439x870a5304(String str) {
        String[] split = str.split(":");
        if (split.length == 3) {
            this.MediaBrowserCompat$ItemReceiver = Base64.decode(split[0], 2);
            this.MediaBrowserCompat$CustomActionResultReceiver = Base64.decode(split[1], 2);
            this.read = Base64.decode(split[2], 2);
            return;
        }
        throw new IllegalArgumentException("Cannot parse iv:ciphertext:mac");
    }

    public final String toString() {
        String encodeToString = Base64.encodeToString(this.MediaBrowserCompat$ItemReceiver, 2);
        String encodeToString2 = Base64.encodeToString(this.read, 2);
        String encodeToString3 = Base64.encodeToString(this.MediaBrowserCompat$CustomActionResultReceiver, 2);
        StringBuilder sb = new StringBuilder();
        sb.append(encodeToString);
        sb.append(":");
        sb.append(encodeToString3);
        sb.append(":");
        sb.append(encodeToString2);
        return String.format(sb.toString(), new Object[0]);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.read) + 31) * 31) + Arrays.hashCode(this.MediaBrowserCompat$ItemReceiver)) * 31) + Arrays.hashCode(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6439x870a5304 eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = (C6439x870a5304) obj;
        return Arrays.equals(this.read, eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.read) && Arrays.equals(this.MediaBrowserCompat$ItemReceiver, eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) && Arrays.equals(this.MediaBrowserCompat$CustomActionResultReceiver, eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
