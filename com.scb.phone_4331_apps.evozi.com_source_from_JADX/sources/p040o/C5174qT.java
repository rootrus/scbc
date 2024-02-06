package p040o;

import p040o.CrashlyticsReport;
import p040o.ServerProjectProvider;

/* renamed from: o.qT */
public class C5174qT extends writeUInt64NoTag<ServerProjectProvider.C70706> {
    public logEventNoInterceptor MediaBrowserCompat$ItemReceiver;
    public CrashlyticsReport.Session.Event.Application read;

    @HmlPinActivity
    public C5174qT(RegularImmutableBiMap regularImmutableBiMap, logEventNoInterceptor logeventnointerceptor) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = logeventnointerceptor;
    }

    static /* synthetic */ void write(CrashlyticsReport.Session.Event.Application application, ServerProjectProvider.C70706 r1) {
        r1.IconCompatParcelizer(application);
        r1.MediaBrowserCompat$ItemReceiver();
    }

    static /* synthetic */ void write(boolean z, String str, ServerProjectProvider.C70706 r2) {
        if (z) {
            r2.write(str);
        } else {
            r2.IconCompatParcelizer(str);
        }
    }

    public void onDestroy() {
        logEventNoInterceptor logeventnointerceptor = this.MediaBrowserCompat$ItemReceiver;
        if (!logeventnointerceptor.MediaBrowserCompat$MediaItem.isDisposed()) {
            logeventnointerceptor.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void write(C5174qT qTVar) {
        if (qTVar.RatingCompat != null) {
            qTVar.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C5174qT qTVar) {
        if (qTVar.RatingCompat != null) {
            qTVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C5174qT qTVar) {
        if (qTVar.RatingCompat != null) {
            qTVar.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void read(C5174qT qTVar) {
        if (qTVar.RatingCompat != null) {
            qTVar.RatingCompat.aj_();
        }
    }
}
