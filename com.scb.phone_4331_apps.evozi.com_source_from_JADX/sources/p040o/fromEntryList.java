package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.fromEntryList */
public final class fromEntryList {
    @SerializedName("tcAccept")
    private final addCopies IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof fromEntryList) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((fromEntryList) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        addCopies addcopies = this.IconCompatParcelizer;
        if (addcopies != null) {
            return addcopies.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AcceptTermsAndConsRequest(tcAccept=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public fromEntryList(addCopies addcopies) {
        onGetStartedClick.write((Object) addcopies, "tcAccept");
        this.IconCompatParcelizer = addcopies;
    }
}
