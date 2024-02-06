package p040o;

import java.util.List;

/* renamed from: o.getBooleanResourceValue */
public final class getBooleanResourceValue {
    public final String IconCompatParcelizer;
    public final List<flushOrLog> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getBooleanResourceValue)) {
            return false;
        }
        getBooleanResourceValue getbooleanresourcevalue = (getBooleanResourceValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getbooleanresourcevalue.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getbooleanresourcevalue.IconCompatParcelizer);
    }

    public final int hashCode() {
        List<flushOrLog> list = this.write;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashCommercialLoanDisplay(offers=");
        sb.append(this.write);
        sb.append(", remarkText=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getBooleanResourceValue(List<? extends flushOrLog> list, String str) {
        onGetStartedClick.write((Object) list, "offers");
        onGetStartedClick.write((Object) str, "remarkText");
        this.write = list;
        this.IconCompatParcelizer = str;
    }
}
