package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.addCopies */
public final class addCopies {
    @SerializedName("type")
    private final String read;
    @SerializedName("flag")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addCopies)) {
            return false;
        }
        addCopies addcopies = (addCopies) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) addcopies.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) addcopies.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TCAccept(type=");
        sb.append(this.read);
        sb.append(", flag=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public addCopies(String str, String str2) {
        onGetStartedClick.write((Object) str, "type");
        this.read = str;
        this.write = str2;
    }

    public /* synthetic */ addCopies(String str) {
        this(str, (String) null);
    }
}
