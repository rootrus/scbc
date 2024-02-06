package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.io.Serializable;

/* renamed from: o.DepositAccountSelectorAdapter$ItemViewHolder */
public final class DepositAccountSelectorAdapter$ItemViewHolder implements Serializable, Cloneable, C9698x5b61c61d {
    private final String MediaBrowserCompat$ItemReceiver;
    private final String read;

    public DepositAccountSelectorAdapter$ItemViewHolder(String str, String str2) {
        this.read = (String) C6431x12296157.write(str, KtaJsonExactionHelper.NAME);
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final String write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String toString() {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            return this.read;
        }
        StringBuilder sb = new StringBuilder(this.read.length() + 1 + this.MediaBrowserCompat$ItemReceiver.length());
        sb.append(this.read);
        sb.append("=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9698x5b61c61d)) {
            return false;
        }
        DepositAccountSelectorAdapter$ItemViewHolder depositAccountSelectorAdapter$ItemViewHolder = (DepositAccountSelectorAdapter$ItemViewHolder) obj;
        if (this.read.equals(depositAccountSelectorAdapter$ItemViewHolder.read)) {
            String str = this.MediaBrowserCompat$ItemReceiver;
            String str2 = depositAccountSelectorAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.read;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i + 629;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (i3 * 37) + i2;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
