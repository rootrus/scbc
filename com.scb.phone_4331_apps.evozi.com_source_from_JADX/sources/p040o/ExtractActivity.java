package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ExtractActivity */
public final class ExtractActivity implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;

    public ExtractActivity(FundFactSheetActivity fundFactSheetActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        onGetStartedClick.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.invoke(obj), "invoke(...)");
    }
}