package p040o;

import p040o.CheckParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.inject_surface */
public final /* synthetic */ class inject_surface implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;
    private final /* synthetic */ SettingsApi write;

    public /* synthetic */ inject_surface(getGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver getglobalbitmap_mediabrowsercompat_customactionresultreceiver, SettingsApi settingsApi) {
        this.IconCompatParcelizer = getglobalbitmap_mediabrowsercompat_customactionresultreceiver;
        this.write = settingsApi;
    }

    public final void IconCompatParcelizer(Object obj) {
        int i;
        getGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver getglobalbitmap_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
        SettingsApi settingsApi = this.write;
        CheckParameters.write write2 = (CheckParameters.write) obj;
        removeColumn IconCompatParcelizer2 = getglobalbitmap_mediabrowsercompat_customactionresultreceiver.read.MediaBrowserCompat$SearchResultReceiver;
        isBuildIdValid MediaBrowserCompat$CustomActionResultReceiver = getglobalbitmap_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        String str = getglobalbitmap_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        checkForPreviousCrash write3 = checkForPreviousCrash.write();
        write3.IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver;
        write3.read = IconCompatParcelizer2.IconCompatParcelizer("dd MMM yyyy - HH:mm", settingsApi.MediaBrowserCompat$CustomActionResultReceiver);
        write3.write = String.format(IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.purchase_remaining_balance), new Object[]{removeColumn.write(settingsApi.IconCompatParcelizer)});
        write3.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver.getString("Y".equals(str) ? Iterables$3$MediaBrowserCompat$MediaItem.purchase_remark_post : Iterables$3$MediaBrowserCompat$MediaItem.purchase_remark_no_post);
        if (MediaBrowserCompat$CustomActionResultReceiver.setHasDecor == null) {
            i = Iterables$3$MediaBrowserCompat$MediaItem.purchase_success;
        } else {
            i = Iterables$3$MediaBrowserCompat$MediaItem.purchase_success_scheduled;
        }
        write3.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver.getString(i);
        write2.IconCompatParcelizer(write3);
    }
}
