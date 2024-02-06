package p040o;

import com.scb.phone.data.network.api.justforyou.JustForYouApi;
import p040o.AbstractMultimap;
import p040o.GoogleApiAvailability;

/* renamed from: o.zzkg */
public final class zzkg implements AbstractMultimap.WrappedList {
    final FragmentBuilder_BindStatementChannelSuccessfulFragment IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final JustForYouApi MediaBrowserCompat$ItemReceiver;
    final GoogleApiAvailability.zaa write;

    @HmlPinActivity
    public zzkg(JustForYouApi justForYouApi, GoogleApiAvailability.zaa zaa, FragmentBuilder_BindStatementChannelSuccessfulFragment fragmentBuilder_BindStatementChannelSuccessfulFragment, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        onGetStartedClick.write((Object) justForYouApi, "justForYouApi");
        onGetStartedClick.write((Object) zaa, "justForYouInsightHeaderResponseEntityMapper");
        onGetStartedClick.write((Object) fragmentBuilder_BindStatementChannelSuccessfulFragment, "justForYouCache");
        onGetStartedClick.write((Object) str, "tileVersion");
        this.MediaBrowserCompat$ItemReceiver = justForYouApi;
        this.write = zaa;
        this.IconCompatParcelizer = fragmentBuilder_BindStatementChannelSuccessfulFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final DebitCardResetOtpActivity<PlaceFilter> read() {
        if (this.IconCompatParcelizer.write != null) {
            DebitCardResetOtpActivity<PlaceFilter> just = DebitCardResetOtpActivity.just(this.IconCompatParcelizer.write);
            onGetStartedClick.IconCompatParcelizer((Object) just, "Observable.just(justForYouCache.insightHeader)");
            return just;
        }
        DebitCardResetOtpActivity<R> doOnNext = this.MediaBrowserCompat$ItemReceiver.insightsHeader(this.MediaBrowserCompat$CustomActionResultReceiver).map(new zzkg$MediaBrowserCompat$CustomActionResultReceiver(this)).doOnNext(new zzkg$MediaBrowserCompat$ItemReceiver(this));
        onGetStartedClick.IconCompatParcelizer((Object) doOnNext, "justForYouApi.insightsHe…ache.insightHeader = it }");
        return doOnNext;
    }

    public final void write() {
        this.IconCompatParcelizer.write = null;
    }
}
