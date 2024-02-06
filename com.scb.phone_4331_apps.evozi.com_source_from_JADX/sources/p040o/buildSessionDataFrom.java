package p040o;

import p040o.CheckCaptureModule;
import p040o.ReportUploader;

/* renamed from: o.buildSessionDataFrom */
public class buildSessionDataFrom extends writeUInt64NoTag<CheckCaptureModule.C6375a.RatingCompat> {
    public boolean MediaBrowserCompat$ItemReceiver;
    public final TileProvider read;

    @HmlPinActivity
    public buildSessionDataFrom(RegularImmutableBiMap regularImmutableBiMap, TileProvider tileProvider) {
        super(regularImmutableBiMap);
        this.read = tileProvider;
    }

    /* renamed from: o.buildSessionDataFrom$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        public final void onComplete() {
        }

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(buildSessionDataFrom buildsessiondatafrom, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            buildSessionDataFrom.write(buildSessionDataFrom.this);
            boolean z = true;
            if (((Boolean) obj).booleanValue()) {
                buildSessionDataFrom buildsessiondatafrom = buildSessionDataFrom.this;
                writeCachedSettings writecachedsettings = writeCachedSettings.IconCompatParcelizer;
                if (buildsessiondatafrom.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    writecachedsettings.IconCompatParcelizer(buildsessiondatafrom.RatingCompat);
                    return;
                }
                return;
            }
            buildSessionDataFrom buildsessiondatafrom2 = buildSessionDataFrom.this;
            ReportUploader.ReportFilesProvider reportFilesProvider = new ReportUploader.ReportFilesProvider(this);
            if (buildsessiondatafrom2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                reportFilesProvider.IconCompatParcelizer(buildsessiondatafrom2.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            if (!buildSessionDataFrom.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                boolean z = true;
                if (buildSessionDataFrom.this.RatingCompat != null) {
                    buildSessionDataFrom buildsessiondatafrom = buildSessionDataFrom.this;
                    deleteReports deletereports = deleteReports.read;
                    if (buildsessiondatafrom.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        deletereports.IconCompatParcelizer(buildsessiondatafrom.RatingCompat);
                    }
                }
            }
            buildSessionDataFrom.read(buildSessionDataFrom.this);
        }
    }

    static /* synthetic */ void read(buildSessionDataFrom buildsessiondatafrom) {
        if (buildsessiondatafrom.RatingCompat != null) {
            buildsessiondatafrom.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void write(buildSessionDataFrom buildsessiondatafrom) {
        if (buildsessiondatafrom.RatingCompat != null) {
            buildsessiondatafrom.RatingCompat.ay_();
        }
    }
}
