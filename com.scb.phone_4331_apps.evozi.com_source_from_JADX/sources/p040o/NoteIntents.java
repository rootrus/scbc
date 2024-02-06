package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.NoteIntents */
public final class NoteIntents {
    @SerializedName("label")
    public final String IconCompatParcelizer;
    @SerializedName("value")
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoteIntents)) {
            return false;
        }
        NoteIntents noteIntents = (NoteIntents) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) noteIntents.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) noteIntents.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
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
        sb.append("SymbolFullNameEntity(label=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", value=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
