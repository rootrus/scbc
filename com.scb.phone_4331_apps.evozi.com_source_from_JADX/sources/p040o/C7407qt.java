package p040o;

import android.view.View;
import com.scb.phone.view.activity.fastpay.FastPaySettingActivity;

/* renamed from: o.qt */
public final /* synthetic */ class C7407qt implements View.OnFocusChangeListener {
    private final /* synthetic */ FastPaySettingActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C7407qt(FastPaySettingActivity fastPaySettingActivity) {
        this.MediaBrowserCompat$ItemReceiver = fastPaySettingActivity;
    }

    public final void onFocusChange(View view, boolean z) {
        FastPaySettingActivity fastPaySettingActivity = this.MediaBrowserCompat$ItemReceiver;
        if (!z) {
            nativeWriteTiffImageWithMetaData nativewritetiffimagewithmetadata = fastPaySettingActivity.presenter;
            IpImageMetadata ipImageMetadata = new IpImageMetadata(nativewritetiffimagewithmetadata, fastPaySettingActivity.cdiFastPaySettingLimitAmount.IconCompatParcelizer);
            if (nativewritetiffimagewithmetadata.RatingCompat != null) {
                ipImageMetadata.IconCompatParcelizer(nativewritetiffimagewithmetadata.RatingCompat);
            }
        }
    }
}
