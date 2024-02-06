package p040o;

import java.util.List;

/* renamed from: o.liteMode */
public final class liteMode {
    public final String IconCompatParcelizer;
    public final List<String> MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof liteMode)) {
            return false;
        }
        liteMode litemode = (liteMode) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) litemode.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) litemode.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) litemode.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Field(fieldFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", label=");
        sb.append(this.write);
        sb.append(", length=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public liteMode(String str, String str2, List<String> list) {
        onGetStartedClick.write((Object) str, "fieldFlag");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
