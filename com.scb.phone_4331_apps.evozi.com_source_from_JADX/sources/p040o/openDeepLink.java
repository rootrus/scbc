package p040o;

import java.util.Iterator;

/* renamed from: o.openDeepLink */
final class openDeepLink implements BaseJuristicPinActivity_ViewBinding<AddAccountConsentActivity> {
    final CharSequence IconCompatParcelizer;
    final int MediaBrowserCompat$CustomActionResultReceiver;
    final BaseDiscoverFundFilterActivity<CharSequence, Integer, HmlVerifyEmailSuccessfulActivity<Integer, Integer>> MediaBrowserCompat$ItemReceiver;
    final int read;

    public openDeepLink(CharSequence charSequence, int i, int i2, BaseDiscoverFundFilterActivity<? super CharSequence, ? super Integer, HmlVerifyEmailSuccessfulActivity<Integer, Integer>> baseDiscoverFundFilterActivity) {
        onGetStartedClick.write((Object) charSequence, "input");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "getNextMatch");
        this.IconCompatParcelizer = charSequence;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.read = i2;
        this.MediaBrowserCompat$ItemReceiver = baseDiscoverFundFilterActivity;
    }

    public final Iterator<AddAccountConsentActivity> read() {
        return new openDeepLink$MediaBrowserCompat$ItemReceiver(this);
    }
}
