package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setRequestPassword$MediaBrowserCompat$CustomActionResultReceiver */
public final class setRequestPassword$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractor_Factory> {
    private /* synthetic */ setRequestPassword IconCompatParcelizer;
    private /* synthetic */ CrashlyticsReportWithSessionId read;

    public setRequestPassword$MediaBrowserCompat$CustomActionResultReceiver(setRequestPassword setrequestpassword, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        this.IconCompatParcelizer = setrequestpassword;
        this.read = crashlyticsReportWithSessionId;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        PassportExtractor_Factory passportExtractor_Factory = (PassportExtractor_Factory) obj;
        if (this.IconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer.write.read() != null) {
            passportExtractor_Factory.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            passportExtractor_Factory.write(setRequestPassword.write(this.IconCompatParcelizer).MediaBrowserCompat$ItemReceiver, this.read.MediaBrowserCompat$ItemReceiver, this.read.write);
        }
    }
}
