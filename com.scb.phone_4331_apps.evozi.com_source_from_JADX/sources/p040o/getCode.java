package p040o;

import java.util.List;
import p040o.C3085x7c929f5b;

/* renamed from: o.getCode */
public final class getCode extends getImportance implements getExpirationYear {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final List<C3085x7c929f5b.C30861> MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCode)) {
            return false;
        }
        getCode getcode = (getCode) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getcode.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcode.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcode.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<C3085x7c929f5b.C30861> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CountryDisplay(name=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", flagImage=");
        sb.append(this.write);
        sb.append(", channels=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getCode(String str, String str2, List<C3085x7c929f5b.C30861> list) {
        super((byte) 0);
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) str2, "flagImage");
        onGetStartedClick.write((Object) list, "channels");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }
}
