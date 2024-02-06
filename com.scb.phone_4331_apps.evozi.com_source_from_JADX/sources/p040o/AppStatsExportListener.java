package p040o;

import p040o.access$2300;

/* renamed from: o.AppStatsExportListener */
public final /* synthetic */ class AppStatsExportListener implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ AppStatsSessionEvent write;

    public /* synthetic */ AppStatsExportListener(AppStatsSessionEvent appStatsSessionEvent) {
        this.write = appStatsSessionEvent;
    }

    /* renamed from: o.AppStatsExportListener$ExportStatus */
    public final /* synthetic */ class ExportStatus implements DebitCardMarketConductDeepLinkActivity {
        private final /* synthetic */ AppStatsSessionEvent read;

        public /* synthetic */ ExportStatus(AppStatsSessionEvent appStatsSessionEvent) {
            this.read = appStatsSessionEvent;
        }

        public final void IconCompatParcelizer(Object obj) {
            AppStatsSessionEvent appStatsSessionEvent = this.read;
            access$2300.write write = access$2300.write.NAVIGATE_BACK;
            appStatsSessionEvent.MediaBrowserCompat$ItemReceiver(appStatsSessionEvent.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((Throwable) obj, write));
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsSessionEvent appStatsSessionEvent = this.write;
        boolean z = true;
        if (appStatsSessionEvent.RatingCompat != null) {
            appStatsSessionEvent.RatingCompat.aj_();
        }
        AppStatsNewJsonExportHandler appStatsNewJsonExportHandler = AppStatsNewJsonExportHandler.MediaBrowserCompat$CustomActionResultReceiver;
        if (appStatsSessionEvent.RatingCompat == null) {
            z = false;
        }
        if (z) {
            appStatsNewJsonExportHandler.IconCompatParcelizer(appStatsSessionEvent.RatingCompat);
        }
    }
}
