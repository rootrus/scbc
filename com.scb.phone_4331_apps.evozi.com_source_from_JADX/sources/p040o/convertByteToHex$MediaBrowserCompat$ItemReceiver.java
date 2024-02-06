package p040o;

import p040o.getSessionIdFromSessionFile;

/* renamed from: o.convertByteToHex$MediaBrowserCompat$ItemReceiver */
final class convertByteToHex$MediaBrowserCompat$ItemReceiver<T> implements DebitCardMarketConductDeepLinkActivity<getSessionIdFromSessionFile> {
    private /* synthetic */ convertByteToHex MediaBrowserCompat$ItemReceiver;

    convertByteToHex$MediaBrowserCompat$ItemReceiver(convertByteToHex convertbytetohex) {
        this.MediaBrowserCompat$ItemReceiver = convertbytetohex;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getSessionIdFromSessionFile getsessionidfromsessionfile = (getSessionIdFromSessionFile) obj;
        if (!getsessionidfromsessionfile.MediaBrowserCompat$ItemReceiver.isEmpty()) {
            convertByteToHex convertbytetohex = this.MediaBrowserCompat$ItemReceiver;
            getSessionIdFromSessionFile.read read = getsessionidfromsessionfile.MediaBrowserCompat$ItemReceiver.get(0);
            onGetStartedClick.write((Object) read, "<set-?>");
            convertbytetohex.read = read;
        }
        if (!getsessionidfromsessionfile.MediaBrowserCompat$MediaItem.isEmpty()) {
            convertByteToHex convertbytetohex2 = this.MediaBrowserCompat$ItemReceiver;
            getSessionIdFromSessionFile.read read2 = getsessionidfromsessionfile.MediaBrowserCompat$MediaItem.get(0);
            onGetStartedClick.write((Object) read2, "<set-?>");
            convertbytetohex2.MediaMetadataCompat = read2;
        }
    }
}
