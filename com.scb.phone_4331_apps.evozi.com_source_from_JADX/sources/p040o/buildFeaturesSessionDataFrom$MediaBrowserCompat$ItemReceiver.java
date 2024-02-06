package p040o;

import java.util.List;

/* renamed from: o.buildFeaturesSessionDataFrom$MediaBrowserCompat$ItemReceiver */
public final class buildFeaturesSessionDataFrom$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzsi> {
    final /* synthetic */ buildFeaturesSessionDataFrom IconCompatParcelizer;
    boolean MediaBrowserCompat$ItemReceiver;

    public final /* synthetic */ void onNext(Object obj) {
        zzsi zzsi = (zzsi) obj;
        boolean unused = this.IconCompatParcelizer.MediaDescriptionCompat = false;
        boolean z = true;
        if (this.IconCompatParcelizer.RatingCompat != null) {
            buildFeaturesSessionDataFrom buildfeaturessessiondatafrom = this.IconCompatParcelizer;
            List unused2 = buildfeaturessessiondatafrom.MediaBrowserCompat$ItemReceiver = buildfeaturessessiondatafrom.f2800x50fd9e4a.MediaBrowserCompat$ItemReceiver(zzsi.read);
            String unused3 = this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = zzsi.IconCompatParcelizer;
            buildFeaturesSessionDataFrom buildfeaturessessiondatafrom2 = this.IconCompatParcelizer;
            writeSessionEventAppExecution writesessioneventappexecution = new writeSessionEventAppExecution(this, zzsi);
            if (buildfeaturessessiondatafrom2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writesessioneventappexecution.IconCompatParcelizer(buildfeaturessessiondatafrom2.RatingCompat);
            }
        }
    }

    public buildFeaturesSessionDataFrom$MediaBrowserCompat$ItemReceiver(buildFeaturesSessionDataFrom buildfeaturessessiondatafrom, boolean z) {
        this.IconCompatParcelizer = buildfeaturessessiondatafrom;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void onComplete() {
        buildFeaturesSessionDataFrom.read(this.IconCompatParcelizer);
        buildFeaturesSessionDataFrom.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
    }

    public final void onError(Throwable th) {
        boolean unused = this.IconCompatParcelizer.MediaDescriptionCompat = false;
        boolean z = true;
        if ((this.IconCompatParcelizer.RatingCompat != null) && !this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            buildFeaturesSessionDataFrom.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
            buildFeaturesSessionDataFrom buildfeaturessessiondatafrom = this.IconCompatParcelizer;
            writeThread writethread = writeThread.read;
            if (buildfeaturessessiondatafrom.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writethread.IconCompatParcelizer(buildfeaturessessiondatafrom.RatingCompat);
            }
        }
    }
}
