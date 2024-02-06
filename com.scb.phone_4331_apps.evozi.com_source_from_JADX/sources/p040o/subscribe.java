package p040o;

import java.util.List;

/* renamed from: o.subscribe */
public final class subscribe {
    public final String MediaBrowserCompat$ItemReceiver;
    public final List<NativeSessionFileProvider> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof subscribe)) {
            return false;
        }
        subscribe subscribe = (subscribe) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) subscribe.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) subscribe.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<NativeSessionFileProvider> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomCreditCardPageSelectorDisplay(titleText=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cards=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public subscribe(String str, List<? extends NativeSessionFileProvider> list) {
        onGetStartedClick.write((Object) str, "titleText");
        onGetStartedClick.write((Object) list, "cards");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = list;
    }
}
