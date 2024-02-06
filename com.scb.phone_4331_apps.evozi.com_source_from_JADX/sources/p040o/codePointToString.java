package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.codePointToString */
public final class codePointToString {
    @SerializedName("description")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("sortSequence")
    public final int MediaBrowserCompat$ItemReceiver;
    @SerializedName("code")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof codePointToString)) {
            return false;
        }
        codePointToString codepointtostring = (codePointToString) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) codepointtostring.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) codepointtostring.MediaBrowserCompat$CustomActionResultReceiver) && this.MediaBrowserCompat$ItemReceiver == codepointtostring.MediaBrowserCompat$ItemReceiver;
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + i) * 31) + this.MediaBrowserCompat$ItemReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OnboardingBusinessEntity(businessCode=");
        sb.append(this.write);
        sb.append(", businessDescription=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", sortSequence=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
