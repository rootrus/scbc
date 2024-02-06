package p040o;

import android.os.Parcel;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.sanitizeAttribute */
public final class sanitizeAttribute extends ForwardingFuture {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final CrashlyticsReportJsonTransform$$Lambda$1 MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sanitizeAttribute(String str, CrashlyticsReportJsonTransform$$Lambda$1 crashlyticsReportJsonTransform$$Lambda$1, String str2) {
        super(crashlyticsReportJsonTransform$$Lambda$1);
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) crashlyticsReportJsonTransform$$Lambda$1, "type");
        onGetStartedClick.write((Object) str2, "image");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = crashlyticsReportJsonTransform$$Lambda$1;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    public final void write(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.IconCompatParcelizer);
        }
    }
}
