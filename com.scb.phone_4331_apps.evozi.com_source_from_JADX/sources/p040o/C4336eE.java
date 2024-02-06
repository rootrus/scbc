package p040o;

import com.scb.phone.domain.interactor.PinCase;
import dagger.Lazy;
import p040o.FinalizableReferenceQueue;
import p040o.MapDifference;

/* renamed from: o.eE */
public class C4336eE extends C4300dt {
    private String MediaBrowserCompat$MediaItem;
    private String MediaDescriptionCompat;

    @HmlPinActivity
    public C4336eE(RegularImmutableBiMap regularImmutableBiMap, PinCase pinCase, compose compose, snippet snippet, MapDifference.ValueDifference valueDifference, onStopJob onstopjob, Lazy<RttiJsonCheck_MembersInjector> lazy) {
        super(regularImmutableBiMap, pinCase, compose, snippet, valueDifference, onstopjob, lazy);
    }

    public final void IconCompatParcelizer(String str, String str2) {
        this.MediaBrowserCompat$MediaItem = str;
        this.MediaDescriptionCompat = str2;
    }

    public final void IconCompatParcelizer(String str) {
        C9891dn dnVar = C9891dn.read;
        if (this.RatingCompat != null) {
            dnVar.IconCompatParcelizer(this.RatingCompat);
        }
        compose compose = this.MediaBrowserCompat$ItemReceiver;
        compose compose2 = this.MediaBrowserCompat$ItemReceiver;
        String str2 = this.MediaBrowserCompat$MediaItem;
        String str3 = this.MediaDescriptionCompat;
        PlaceBuffer MediaBrowserCompat$ItemReceiver = compose2.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        compose.read(DebitCardResetOtpActivity.fromCallable(new FinalizableReferenceQueue.FinalizerLoader(compose2, str, MediaBrowserCompat$ItemReceiver)).flatMap(new toStringFunction(compose2, str2, str3, MediaBrowserCompat$ItemReceiver)).doOnComplete(new Function(compose2.IconCompatParcelizer)), new C9888de(this), new C9890di(this));
    }

    static /* synthetic */ void MediaMetadataCompat(printStackTrace printstacktrace) {
        printstacktrace.aj_();
        printstacktrace.read();
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(printStackTrace printstacktrace) {
        printstacktrace.MediaBrowserCompat$ItemReceiver();
        printstacktrace.AlertController$RecycleListView();
    }

    public final /* synthetic */ void RatingCompat(printStackTrace printstacktrace) {
        if (printstacktrace.IconCompatParcelizer() && this.read != null && this.write && this.read.write()) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver();
        }
        printstacktrace.aj_();
        printstacktrace.read();
    }

    public final void MediaDescriptionCompat() {
        C4286dk dkVar = C4286dk.write;
        if (this.RatingCompat != null) {
            dkVar.IconCompatParcelizer(this.RatingCompat);
        }
        compose compose = this.MediaBrowserCompat$ItemReceiver;
        compose compose2 = this.MediaBrowserCompat$ItemReceiver;
        String str = this.MediaBrowserCompat$MediaItem;
        String str2 = this.MediaDescriptionCompat;
        standardEquals standardequals = new standardEquals();
        standardequals.MediaBrowserCompat$CustomActionResultReceiver = str;
        standardequals.MediaBrowserCompat$MediaItem = str2;
        standardequals.MediaBrowserCompat$ItemReceiver = compose2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        compose.read(compose2.write.MediaBrowserCompat$ItemReceiver(compose2.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(), standardequals).doOnComplete(new Function(compose2.IconCompatParcelizer)), new C4275dc(this), new C4281dh(this));
    }
}
