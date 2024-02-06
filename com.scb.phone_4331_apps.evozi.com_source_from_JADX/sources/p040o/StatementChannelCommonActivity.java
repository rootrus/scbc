package p040o;

import android.content.SharedPreferences;

/* renamed from: o.StatementChannelCommonActivity */
public final /* synthetic */ class StatementChannelCommonActivity implements FragmentBuilder_BindIssuerSearchFragment {
    private final /* synthetic */ ECouponDetailActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ StatementChannelCommonActivity(ECouponDetailActivity_ViewBinding eCouponDetailActivity_ViewBinding) {
        this.MediaBrowserCompat$CustomActionResultReceiver = eCouponDetailActivity_ViewBinding;
    }

    public final Object read(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer((SharedPreferences) obj);
    }
}
