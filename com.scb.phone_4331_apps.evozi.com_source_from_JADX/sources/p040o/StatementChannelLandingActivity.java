package p040o;

import android.content.SharedPreferences;

/* renamed from: o.StatementChannelLandingActivity */
public final /* synthetic */ class StatementChannelLandingActivity implements FragmentBuilder_BindHowToAddFavouriteTopUpFragment {
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ StatementChannelLandingActivity(String str, boolean z) {
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        try {
            ((SharedPreferences.Editor) obj).putBoolean(this.write, this.MediaBrowserCompat$CustomActionResultReceiver).apply();
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }
}
