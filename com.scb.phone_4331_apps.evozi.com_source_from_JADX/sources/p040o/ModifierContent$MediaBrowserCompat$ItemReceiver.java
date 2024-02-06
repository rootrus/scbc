package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ModifierContent$MediaBrowserCompat$ItemReceiver */
public final class ModifierContent$MediaBrowserCompat$ItemReceiver {
    @SerializedName("flag")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("code")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModifierContent$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        ModifierContent$MediaBrowserCompat$ItemReceiver modifierContent$MediaBrowserCompat$ItemReceiver = (ModifierContent$MediaBrowserCompat$ItemReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) modifierContent$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) modifierContent$MediaBrowserCompat$ItemReceiver.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
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
        sb.append("PrivilegedProfession(flag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", code=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public ModifierContent$MediaBrowserCompat$ItemReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "flag");
        onGetStartedClick.write((Object) str2, "code");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
    }
}
