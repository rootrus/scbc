package p040o;

/* renamed from: o.setContent */
public final class setContent extends AutoValue_CrashlyticsReport_Session_OperatingSystem {
    public String MediaBrowserCompat$CustomActionResultReceiver;

    private setContent(int i, String str) {
        super(i);
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public static setContent read(int i, String str) {
        return new setContent(i, str);
    }
}
