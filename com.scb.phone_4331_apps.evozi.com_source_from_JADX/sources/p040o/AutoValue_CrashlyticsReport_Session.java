package p040o;

import java.util.List;

/* renamed from: o.AutoValue_CrashlyticsReport_Session */
public final class AutoValue_CrashlyticsReport_Session {
    String MediaBrowserCompat$ItemReceiver;
    String write;

    public /* synthetic */ AutoValue_CrashlyticsReport_Session() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoValue_CrashlyticsReport_Session)) {
            return false;
        }
        AutoValue_CrashlyticsReport_Session autoValue_CrashlyticsReport_Session = (AutoValue_CrashlyticsReport_Session) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) autoValue_CrashlyticsReport_Session.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) autoValue_CrashlyticsReport_Session.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
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
        sb.append("GoogleResponse(gmail=");
        sb.append(this.write);
        sb.append(", idToken=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public AutoValue_CrashlyticsReport_Session(String str, String str2) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session$Builder */
    public final class Builder extends setGenerator {
        public final List<isCrashed> MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Builder(PlacePhotoMetadataResult placePhotoMetadataResult, List<isCrashed> list, int i) {
            super(placePhotoMetadataResult, i);
            onGetStartedClick.write((Object) placePhotoMetadataResult, "tile");
            onGetStartedClick.write((Object) list, "highlights");
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
        }
    }
}
