package p040o;

import java.util.List;
import p040o.LineBuffer;
import p040o.isDataCollectionEnabled;

/* renamed from: o.FavaDiagnosticsEntity */
public final /* synthetic */ class FavaDiagnosticsEntity implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ getCredentialPickerConfig MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ FavaDiagnosticsEntity(getCredentialPickerConfig getcredentialpickerconfig) {
        this.MediaBrowserCompat$ItemReceiver = getcredentialpickerconfig;
    }

    public final Object write(Object obj) {
        List<logEvent> list;
        List<logEvent> list2;
        getCredentialPickerConfig getcredentialpickerconfig = this.MediaBrowserCompat$ItemReceiver;
        LottieResult lottieResult = (LottieResult) obj;
        isDataCollectionEnabled.IconCompatParcelizer MediaBrowserCompat$ItemReceiver2 = isDataCollectionEnabled.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$MediaItem = getCredentialPickerConfig.write(lottieResult.MediaBrowserCompat$MediaItem, new LineBuffer.write(getcredentialpickerconfig));
        MediaBrowserCompat$ItemReceiver2.MediaMetadataCompat = lottieResult.MediaDescriptionCompat;
        List<logEvent> list3 = null;
        if (lottieResult.write != null) {
            list = getcredentialpickerconfig.read(lottieResult.write);
        } else {
            list = null;
        }
        MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer = list;
        if (lottieResult.MediaBrowserCompat$CustomActionResultReceiver != null) {
            list2 = getcredentialpickerconfig.read(lottieResult.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            list2 = null;
        }
        MediaBrowserCompat$ItemReceiver2.read = list2;
        if (lottieResult.IconCompatParcelizer != null) {
            list3 = getcredentialpickerconfig.read(lottieResult.IconCompatParcelizer);
        }
        MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver = list3;
        MediaBrowserCompat$ItemReceiver2.write = lottieResult.read;
        MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver = lottieResult.MediaBrowserCompat$ItemReceiver;
        return (isDataCollectionEnabled) MediaBrowserCompat$ItemReceiver2.read();
    }
}
