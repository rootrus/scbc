package p040o;

import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.zzly */
public final class zzly {
    @SerializedName("email")
    private final String read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zzly) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((zzly) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JuristicFormRequest(email=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public zzly(String str) {
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        this.read = str;
    }
}
