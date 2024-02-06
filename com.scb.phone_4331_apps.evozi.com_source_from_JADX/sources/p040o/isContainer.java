package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.isContainer */
public final class isContainer {
    @SerializedName("disburseTnCFlag")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("applicationUuid")
    private final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isContainer)) {
            return false;
        }
        isContainer iscontainer = (isContainer) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iscontainer.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) iscontainer.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlUuidRequest(applicationUuid=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", disburseTnCFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public isContainer(String str, String str2) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}
