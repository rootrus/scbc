package p040o;

import android.content.SharedPreferences;

/* renamed from: o.TempLimitHomeActivity */
public final /* synthetic */ class TempLimitHomeActivity implements FragmentBuilder_BindHowToAddFavouriteTopUpFragment {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ String read;

    public /* synthetic */ TempLimitHomeActivity(String str, String str2) {
        this.read = str;
        this.IconCompatParcelizer = str2;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        try {
            ((SharedPreferences.Editor) obj).putString(this.read, this.IconCompatParcelizer).apply();
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }
}
