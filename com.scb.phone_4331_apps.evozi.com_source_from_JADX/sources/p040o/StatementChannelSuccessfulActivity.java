package p040o;

import android.content.SharedPreferences;

/* renamed from: o.StatementChannelSuccessfulActivity */
public final /* synthetic */ class StatementChannelSuccessfulActivity implements FragmentBuilder_BindHowToAddFavouriteTopUpFragment {
    private final /* synthetic */ ECouponDetailActivity_ViewBinding IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ StatementChannelSuccessfulActivity(ECouponDetailActivity_ViewBinding eCouponDetailActivity_ViewBinding, String str) {
        this.IconCompatParcelizer = eCouponDetailActivity_ViewBinding;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        ECouponDetailActivity_ViewBinding eCouponDetailActivity_ViewBinding = this.IconCompatParcelizer;
        String str = this.MediaBrowserCompat$ItemReceiver;
        SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
        if (str.equals("tid-preference")) {
            StringBuilder sb = new StringBuilder();
            sb.append(eCouponDetailActivity_ViewBinding.MediaBrowserCompat$ItemReceiver);
            sb.append("-");
            sb.append(str);
            editor.remove(sb.toString());
        }
        if (str.equals("remember-me-preference")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(eCouponDetailActivity_ViewBinding.MediaBrowserCompat$ItemReceiver);
            sb2.append("-");
            sb2.append(eCouponDetailActivity_ViewBinding.write);
            sb2.append("-");
            sb2.append(str);
            editor.remove(sb2.toString());
        }
        editor.remove(str);
        editor.commit();
    }
}
