package p040o;

import com.google.android.gms.common.Scopes;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.getCurrentPlace */
public final class getCurrentPlace {
    public final OffsetDateTime MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentPlace)) {
            return false;
        }
        getCurrentPlace getcurrentplace = (getCurrentPlace) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcurrentplace.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcurrentplace.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$ItemReceiver;
        if (offsetDateTime != null) {
            i = offsetDateTime.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JuristicRequestFormResponse(email=");
        sb.append(this.write);
        sb.append(", transactionDateTime=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getCurrentPlace(String str, OffsetDateTime offsetDateTime) {
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = offsetDateTime;
    }
}
