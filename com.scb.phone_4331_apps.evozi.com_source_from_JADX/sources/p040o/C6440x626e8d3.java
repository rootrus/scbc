package p040o;

import android.util.Base64;
import javax.crypto.SecretKey;

/* renamed from: o.ECouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$ItemReceiver */
public class C6440x626e8d3 {
    SecretKey read;
    SecretKey write;

    public C6440x626e8d3(SecretKey secretKey, SecretKey secretKey2) {
        this.write = secretKey;
        this.read = secretKey2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Base64.encodeToString(this.write.getEncoded(), 2));
        sb.append(":");
        sb.append(Base64.encodeToString(this.read.getEncoded(), 2));
        return sb.toString();
    }

    public final int hashCode() {
        return ((this.write.hashCode() + 31) * 31) + this.read.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6440x626e8d3 eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = (C6440x626e8d3) obj;
        return this.read.equals(eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.read) && this.write.equals(eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.write);
    }
}
