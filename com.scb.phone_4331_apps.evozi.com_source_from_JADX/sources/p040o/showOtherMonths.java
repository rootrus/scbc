package p040o;

import com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity;

/* renamed from: o.showOtherMonths */
public final class showOtherMonths {
    private static final String[] read = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    public static void IconCompatParcelizer(SCBUniversalWebViewActivity sCBUniversalWebViewActivity) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(sCBUniversalWebViewActivity, read)) {
            sCBUniversalWebViewActivity.MediaSessionCompat$Token();
        } else {
            AppCompatRatingBar.write(sCBUniversalWebViewActivity, read, 53);
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, int i, int[] iArr) {
        if (i != 53) {
            return;
        }
        if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            sCBUniversalWebViewActivity.MediaSessionCompat$Token();
        } else {
            sCBUniversalWebViewActivity.signinAndLocationPresenter.MediaBrowserCompat$ItemReceiver((String) null, (String) null);
        }
    }
}
