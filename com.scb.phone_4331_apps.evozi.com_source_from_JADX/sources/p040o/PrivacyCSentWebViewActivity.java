package p040o;

import java.util.List;
import p040o.ContactUsActivity;

/* renamed from: o.PrivacyCSentWebViewActivity */
public final class PrivacyCSentWebViewActivity implements C1165x6a840f83 {
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final List<ContactUsActivity.CustomActionBar_ViewBinding> read;
    private final ThirdPartyWebActivity write;

    public PrivacyCSentWebViewActivity(List<? extends ContactUsActivity.CustomActionBar_ViewBinding> list, int i, ThirdPartyWebActivity thirdPartyWebActivity) {
        onGetStartedClick.write((Object) list, "interceptors");
        onGetStartedClick.write((Object) thirdPartyWebActivity, "request");
        this.read = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.write = thirdPartyWebActivity;
    }

    public final ThirdPartyWebActivity read() {
        return this.write;
    }

    public final ContactUsActivity write(ThirdPartyWebActivity thirdPartyWebActivity) {
        onGetStartedClick.write((Object) thirdPartyWebActivity, "request");
        if (this.MediaBrowserCompat$CustomActionResultReceiver < this.read.size()) {
            return this.read.get(this.MediaBrowserCompat$CustomActionResultReceiver).intercept(new PrivacyCSentWebViewActivity(this.read, this.MediaBrowserCompat$CustomActionResultReceiver + 1, thirdPartyWebActivity));
        }
        throw new AssertionError("no interceptors added to the chain");
    }
}
