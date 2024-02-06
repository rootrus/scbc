package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.io.Serializable;

/* renamed from: o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding */
public final class PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding implements AddAccountsActivity, Cloneable, Serializable {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    private final String read;

    public PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = (String) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, KtaJsonExactionHelper.NAME);
        this.read = str2;
    }

    public final String IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        return this.read;
    }

    public final String toString() {
        if (this.read == null) {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        StringBuilder sb = new StringBuilder(this.MediaBrowserCompat$CustomActionResultReceiver.length() + 1 + this.read.length());
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("=");
        sb.append(this.read);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddAccountsActivity)) {
            return false;
        }
        PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding paymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding = (PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.equals(paymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver)) {
            String str = this.read;
            String str2 = paymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding.read;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i + 629;
        String str2 = this.read;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (i3 * 37) + i2;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
