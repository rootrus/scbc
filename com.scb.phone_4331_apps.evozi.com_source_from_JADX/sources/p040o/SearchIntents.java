package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.SearchIntents */
public final class SearchIntents {
    @SerializedName("value")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("label")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchIntents)) {
            return false;
        }
        SearchIntents searchIntents = (SearchIntents) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) searchIntents.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) searchIntents.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SymbolPriceEntity(label=");
        sb.append(this.write);
        sb.append(", value=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
