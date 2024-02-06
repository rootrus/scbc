package p040o;

import java.util.List;
import java.util.NoSuchElementException;
import p040o.CrashlyticsReport;
import p040o.StreetViewPanoramaFragment;
import p040o.Synchronized;
import p040o.access$2300;

/* renamed from: o.sF */
public class C7431sF extends writeUInt64NoTag<getTopLeftCornerWidth$MediaSessionCompat$ResultReceiverWrapper> {
    public final include IconCompatParcelizer;
    public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final lessThanUnsigned MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public final isCancelled MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public List<CrashlyticsReport.Session.Event.Application.Execution> MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public final startUp MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final Synchronized.SynchronizedSet MediaSessionCompat$Token;
    public StreetViewPanoramaFragment.zzb read;
    /* access modifiers changed from: private */
    public final UnsignedBytes write;

    @HmlPinActivity
    public C7431sF(include include, isCancelled iscancelled, lessThanUnsigned lessthanunsigned, UnsignedBytes unsignedBytes, RegularImmutableBiMap regularImmutableBiMap, startUp startup, Synchronized.SynchronizedSet synchronizedSet) {
        super(regularImmutableBiMap);
        this.write = unsignedBytes;
        this.IconCompatParcelizer = include;
        this.MediaBrowserCompat$SearchResultReceiver = iscancelled;
        this.MediaBrowserCompat$MediaItem = lessthanunsigned;
        this.MediaMetadataCompat = startup;
        this.MediaSessionCompat$Token = synchronizedSet;
    }

    /* renamed from: o.sF$write */
    final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getPanningGesturesEnabled> {
        private write() {
        }

        /* synthetic */ write(C7431sF sFVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getPanningGesturesEnabled getpanninggesturesenabled = (getPanningGesturesEnabled) obj;
            boolean z = true;
            if (C7431sF.this.RatingCompat != null) {
                CrashlyticsReport.Session.Application.Builder IconCompatParcelizer = C7431sF.this.write.MediaBrowserCompat$ItemReceiver(getpanninggesturesenabled);
                C7431sF sFVar = C7431sF.this;
                C7441sQ sQVar = new C7441sQ(this, IconCompatParcelizer);
                if (sFVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    sQVar.IconCompatParcelizer(sFVar.RatingCompat);
                }
            }
        }

        public final void onComplete() {
            C7431sF.m3575x50fd9e4a(C7431sF.this);
            C7431sF.ParcelableVolumeInfo(C7431sF.this);
        }

        public final void onError(Throwable th) {
            C7431sF.this.MediaBrowserCompat$ItemReceiver(C7431sF.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    /* renamed from: o.sF$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setBoundsBias> {
        private read() {
        }

        public /* synthetic */ read(C7431sF sFVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            C7431sF sFVar = C7431sF.this;
            C7440sP sPVar = new C7440sP(this, (setBoundsBias) obj);
            if (sFVar.RatingCompat != null) {
                sPVar.IconCompatParcelizer(sFVar.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            if (!C7431sF.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                C7431sF sFVar = C7431sF.this;
                C7525tn tnVar = C7525tn.IconCompatParcelizer;
                if (sFVar.RatingCompat != null) {
                    tnVar.IconCompatParcelizer(sFVar.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void write(C7431sF sFVar) {
        if (sFVar.RatingCompat != null) {
            sFVar.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaDescriptionCompat(C7431sF sFVar) {
        if (sFVar.RatingCompat != null) {
            sFVar.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(C7431sF sFVar) {
        if (sFVar.RatingCompat != null) {
            sFVar.RatingCompat.ay_();
        }
    }

    static /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution MediaBrowserCompat$CustomActionResultReceiver(C7431sF sFVar, String str) {
        isSupportFragmentClass issupportfragmentclass;
        show show = new show(sFVar.MediaDescriptionCompat);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new C7444sU(str)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (!(issupportfragmentclass.IconCompatParcelizer != null)) {
            return null;
        }
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            return (CrashlyticsReport.Session.Event.Application.Execution) t;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    static /* synthetic */ void m3575x50fd9e4a(C7431sF sFVar) {
        if (sFVar.RatingCompat != null) {
            sFVar.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void ParcelableVolumeInfo(C7431sF sFVar) {
        if (sFVar.RatingCompat != null) {
            sFVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(String str, CrashlyticsReport.Session.Event.Application.Execution execution) {
        return str != null && str.equals(execution.MediaBrowserCompat$SearchResultReceiver);
    }
}
