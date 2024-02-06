package p040o;

import java.util.List;

/* renamed from: o.getCachedSettingsData$MediaBrowserCompat$CustomActionResultReceiver */
final class C4513xa1018272 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<zzvy>> {
    final /* synthetic */ getCachedSettingsData MediaBrowserCompat$CustomActionResultReceiver;

    private C4513xa1018272(getCachedSettingsData getcachedsettingsdata) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getcachedsettingsdata;
    }

    /* synthetic */ C4513xa1018272(getCachedSettingsData getcachedsettingsdata, byte b) {
        this(getcachedsettingsdata);
    }

    public final /* synthetic */ void onNext(Object obj) {
        List list = (List) obj;
        boolean unused = this.MediaBrowserCompat$CustomActionResultReceiver.read = false;
        boolean z = true;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null) {
            getCachedSettingsData getcachedsettingsdata = this.MediaBrowserCompat$CustomActionResultReceiver;
            MapDifference unused2 = getcachedsettingsdata.IconCompatParcelizer;
            List unused3 = getcachedsettingsdata.MediaBrowserCompat$ItemReceiver = MapDifference.MediaBrowserCompat$CustomActionResultReceiver(list, new SessionReport(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer), onSchedule.MediaBrowserCompat$CustomActionResultReceiver);
            getCachedSettingsData getcachedsettingsdata2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            sendReport sendreport = new sendReport(this);
            if (getcachedsettingsdata2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                sendreport.IconCompatParcelizer(getcachedsettingsdata2.RatingCompat);
            }
        }
    }

    public final void onComplete() {
        getCachedSettingsData.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        getCachedSettingsData.read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void onError(Throwable th) {
        boolean unused = this.MediaBrowserCompat$CustomActionResultReceiver.read = false;
        boolean z = true;
        if ((this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null) && !this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            getCachedSettingsData.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
            getCachedSettingsData getcachedsettingsdata = this.MediaBrowserCompat$CustomActionResultReceiver;
            applyMultipartDataTo applymultipartdatato = applyMultipartDataTo.IconCompatParcelizer;
            if (getcachedsettingsdata.RatingCompat == null) {
                z = false;
            }
            if (z) {
                applymultipartdatato.IconCompatParcelizer(getcachedsettingsdata.RatingCompat);
            }
        }
    }
}
