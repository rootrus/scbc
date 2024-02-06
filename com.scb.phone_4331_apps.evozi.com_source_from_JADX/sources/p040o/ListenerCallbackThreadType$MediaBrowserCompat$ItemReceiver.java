package p040o;

import p040o.AutoCrashlyticsReportEncoder;
import p040o.writeUInt64NoTag;

/* renamed from: o.ListenerCallbackThreadType$MediaBrowserCompat$ItemReceiver */
public final class ListenerCallbackThreadType$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<classification$MediaBrowserCompat$CustomActionResultReceiver> {
    private /* synthetic */ immediateCheckedFuture MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ AutoCrashlyticsReportEncoder.C3050xc3999712 MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ ListenerCallbackThreadType read;

    public ListenerCallbackThreadType$MediaBrowserCompat$ItemReceiver(ListenerCallbackThreadType listenerCallbackThreadType, immediateCheckedFuture immediatecheckedfuture, AutoCrashlyticsReportEncoder.C3050xc3999712 crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder) {
        this.read = listenerCallbackThreadType;
        this.MediaBrowserCompat$CustomActionResultReceiver = immediatecheckedfuture;
        this.MediaBrowserCompat$ItemReceiver = crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        classification$MediaBrowserCompat$CustomActionResultReceiver classification_mediabrowsercompat_customactionresultreceiver = (classification$MediaBrowserCompat$CustomActionResultReceiver) obj;
        String IconCompatParcelizer = getICheckDeserializerRtti.IconCompatParcelizer(false, false, this.read.read.MediaMetadataCompat());
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "Utilities.maskingFormat(…chantWalletCase.walletId)");
        String str = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) str, "depositDisplay.accountNumber");
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver.AppCompatDialogFragment;
        onGetStartedClick.IconCompatParcelizer((Object) str2, "depositDisplay.productTypeDescription");
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat;
        if (str3 == null) {
            str3 = "";
        }
        classification_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer, str, str2, str3, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
    }
}
