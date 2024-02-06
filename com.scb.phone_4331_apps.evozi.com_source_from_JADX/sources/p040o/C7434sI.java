package p040o;

import java.util.List;
import java.util.NoSuchElementException;
import p040o.CrashlyticsReport;
import p040o.StreetViewPanoramaFragment;
import p040o.Synchronized;
import p040o.access$2300;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.sI */
public class C7434sI extends writeUInt64NoTag<getTopLeftCornerWidth.setExpandedFormat> {
    /* access modifiers changed from: private */
    public List<CrashlyticsReport.Session.Event.Application.Execution> IconCompatParcelizer;
    public AppMeasurementInstallReferrerReceiver MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public doStop MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public startUp MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public Synchronized.SynchronizedSet MediaMetadataCompat;
    public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder read;
    /* access modifiers changed from: private */
    public lessThanUnsigned write;

    @HmlPinActivity
    public C7434sI(AppMeasurementInstallReferrerReceiver appMeasurementInstallReferrerReceiver, Synchronized.SynchronizedSet synchronizedSet, RegularImmutableBiMap regularImmutableBiMap, doStop dostop, startUp startup, lessThanUnsigned lessthanunsigned) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = appMeasurementInstallReferrerReceiver;
        this.MediaMetadataCompat = synchronizedSet;
        this.MediaBrowserCompat$MediaItem = dostop;
        this.MediaBrowserCompat$SearchResultReceiver = startup;
        this.write = lessthanunsigned;
    }

    /* renamed from: o.sI$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<StreetViewPanoramaFragment.zza> {
        private write() {
        }

        public /* synthetic */ write(C7434sI sIVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            C7434sI sIVar = C7434sI.this;
            List unused = sIVar.IconCompatParcelizer = sIVar.write.MediaBrowserCompat$ItemReceiver(((StreetViewPanoramaFragment.zza) obj).write, C7434sI.this.MediaBrowserCompat$ItemReceiver.read.setCheckable());
            C7434sI sIVar2 = C7434sI.this;
            C7519te teVar = new C7519te(this);
            if (sIVar2.RatingCompat != null) {
                teVar.IconCompatParcelizer(sIVar2.RatingCompat);
            }
            C7434sI.MediaBrowserCompat$SearchResultReceiver(C7434sI.this);
        }

        public final void onComplete() {
            C7434sI.write(C7434sI.this);
        }

        public final void onError(Throwable th) {
            C7434sI.this.MediaBrowserCompat$ItemReceiver(C7434sI.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C7434sI sIVar) {
        if (sIVar.RatingCompat != null) {
            sIVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(C7434sI sIVar) {
        if (sIVar.RatingCompat != null) {
            sIVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(C7434sI sIVar) {
        if (sIVar.RatingCompat != null) {
            sIVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution MediaBrowserCompat$CustomActionResultReceiver(C7434sI sIVar, String str) {
        isSupportFragmentClass issupportfragmentclass;
        show show = new show(sIVar.IconCompatParcelizer);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new C7517tb(str)));
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

    static /* synthetic */ boolean IconCompatParcelizer(String str, CrashlyticsReport.Session.Event.Application.Execution execution) {
        return str != null && str.equals(execution.MediaBrowserCompat$SearchResultReceiver);
    }
}
