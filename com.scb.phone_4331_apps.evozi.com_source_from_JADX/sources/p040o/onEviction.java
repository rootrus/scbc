package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.onEviction */
public final class onEviction {
    @SerializedName("applicationType")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("resumeStageFlag")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onEviction)) {
            return false;
        }
        onEviction oneviction = (onEviction) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) oneviction.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) oneviction.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
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
        sb.append("EligibilitiesRequest(applicationType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", resumeStageFlag=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public onEviction(String str, String str2) {
        onGetStartedClick.write((Object) str, "applicationType");
        onGetStartedClick.write((Object) str2, "resumeStageFlag");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
    }
}
