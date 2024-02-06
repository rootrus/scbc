package p040o;

/* renamed from: o.getGenerator */
public final class getGenerator {
    setEvents IconCompatParcelizer;
    String MediaBrowserCompat$CustomActionResultReceiver;
    String MediaBrowserCompat$ItemReceiver;
    AutoValue_CrashlyticsReport_Session read;

    public /* synthetic */ getGenerator() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getGenerator)) {
            return false;
        }
        getGenerator getgenerator = (getGenerator) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getgenerator.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getgenerator.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getgenerator.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getgenerator.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        AutoValue_CrashlyticsReport_Session autoValue_CrashlyticsReport_Session = this.read;
        int hashCode2 = autoValue_CrashlyticsReport_Session != null ? autoValue_CrashlyticsReport_Session.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        setEvents setevents = this.IconCompatParcelizer;
        if (setevents != null) {
            i = setevents.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GoogleSignInResponseDisplay(accessToken=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", googleResponse=");
        sb.append(this.read);
        sb.append(", refreshToken=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", status=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getGenerator(String str, AutoValue_CrashlyticsReport_Session autoValue_CrashlyticsReport_Session, String str2, setEvents setevents) {
        onGetStartedClick.write((Object) setevents, "status");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = autoValue_CrashlyticsReport_Session;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.IconCompatParcelizer = setevents;
    }

    public /* synthetic */ getGenerator(setEvents setevents) {
        this((String) null, (AutoValue_CrashlyticsReport_Session) null, (String) null, setevents);
    }
}
