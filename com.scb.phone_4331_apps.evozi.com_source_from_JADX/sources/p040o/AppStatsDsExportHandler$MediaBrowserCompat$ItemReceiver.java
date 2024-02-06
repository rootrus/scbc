package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.AppStatsDsExportHandler$MediaBrowserCompat$ItemReceiver */
final class AppStatsDsExportHandler$MediaBrowserCompat$ItemReceiver implements Runnable {
    private /* synthetic */ AppStatsDsExportHandler MediaBrowserCompat$CustomActionResultReceiver;

    AppStatsDsExportHandler$MediaBrowserCompat$ItemReceiver(AppStatsDsExportHandler appStatsDsExportHandler) {
        this.MediaBrowserCompat$CustomActionResultReceiver = appStatsDsExportHandler;
    }

    public final void run() {
        AppStatsDsExportHandler appStatsDsExportHandler = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C30363.MediaBrowserCompat$CustomActionResultReceiver;
        if (appStatsDsExportHandler.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(appStatsDsExportHandler.RatingCompat);
        }
    }
}
