package p040o;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;

/* renamed from: o.getThemeAccentColor */
public final /* synthetic */ class getThemeAccentColor implements DownloadListener {
    private final /* synthetic */ SCBUniversalWebViewActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getThemeAccentColor(SCBUniversalWebViewActivity sCBUniversalWebViewActivity) {
        this.MediaBrowserCompat$ItemReceiver = sCBUniversalWebViewActivity;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.MediaBrowserCompat$ItemReceiver;
        sCBUniversalWebViewActivity.ay_();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        IntentTidInjectionContextAspect.aspectOf();
        SCBUniversalWebViewActivity.IconCompatParcelizer(sCBUniversalWebViewActivity, intent);
    }
}
