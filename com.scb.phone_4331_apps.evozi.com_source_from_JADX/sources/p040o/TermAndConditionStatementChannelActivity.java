package p040o;

import android.content.SharedPreferences;

/* renamed from: o.TermAndConditionStatementChannelActivity */
public final /* synthetic */ class TermAndConditionStatementChannelActivity implements FragmentBuilder_BindIssuerSearchFragment {
    private final /* synthetic */ ECouponDetailActivity_ViewBinding write;

    public /* synthetic */ TermAndConditionStatementChannelActivity(ECouponDetailActivity_ViewBinding eCouponDetailActivity_ViewBinding) {
        this.write = eCouponDetailActivity_ViewBinding;
    }

    public final Object read(Object obj) {
        return this.write.MediaBrowserCompat$CustomActionResultReceiver((SharedPreferences) obj);
    }
}
