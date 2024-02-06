package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setJustifyContent */
public final class setJustifyContent {
    @SerializedName("amount")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("amountTH")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("exRate")
    public final String read;
    @SerializedName("currency")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setJustifyContent)) {
            return false;
        }
        setJustifyContent setjustifycontent = (setJustifyContent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setjustifycontent.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setjustifycontent.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setjustifycontent.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setjustifycontent.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CashoffshoreEntity(currency=");
        sb.append(this.write);
        sb.append(", amount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", exRate=");
        sb.append(this.read);
        sb.append(", amountTH=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
