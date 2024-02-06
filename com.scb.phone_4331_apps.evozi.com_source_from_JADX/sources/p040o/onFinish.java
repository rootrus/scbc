package p040o;

import java.util.List;

/* renamed from: o.onFinish */
public final class onFinish {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$ItemReceiver;
    public final List<String> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onFinish)) {
            return false;
        }
        onFinish onfinish = (onFinish) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onfinish.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onfinish.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onfinish.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<String> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidActivationVerification(cardMask=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", transactionToken=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", allowTag=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public onFinish(String str, String str2, List<String> list) {
        onGetStartedClick.write((Object) str, "cardMask");
        onGetStartedClick.write((Object) str2, "transactionToken");
        onGetStartedClick.write((Object) list, "allowTag");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
        this.read = list;
    }
}
