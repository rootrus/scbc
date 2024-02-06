package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.safeContains */
public class safeContains {
    @SerializedName("transactionToken")
    private String read;

    public /* synthetic */ safeContains(safeContains$MediaBrowserCompat$CustomActionResultReceiver safecontains_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(safecontains_mediabrowsercompat_customactionresultreceiver);
    }

    public static safeContains$MediaBrowserCompat$CustomActionResultReceiver write() {
        return new safeContains$MediaBrowserCompat$CustomActionResultReceiver();
    }

    private safeContains(safeContains$MediaBrowserCompat$CustomActionResultReceiver safecontains_mediabrowsercompat_customactionresultreceiver) {
        this.read = safecontains_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.read;
        String str2 = ((safeContains) obj).read;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchaseConfirmationRequest{transactionToken='");
        sb.append(this.read);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
