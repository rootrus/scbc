package p040o;

import android.text.TextUtils;
import com.thunderhead.android.infrastructure.server.entitys.DeviceInfo;
import com.thunderhead.android.infrastructure.server.requests.BaseRequest;
import java.net.URI;

@HmlSetNTBPinActivity
/* renamed from: o.FragmentBuilder_BindPurchaseDepositFragment */
public final class FragmentBuilder_BindPurchaseDepositFragment {
    public OECF_sRGB write;

    public static final C6437x1b3a90a2 MediaBrowserCompat$CustomActionResultReceiver(String str, URI uri, String str2, DeviceInfo deviceInfo, Long l) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(uri);
            sb.append("/one-appInstall");
            BaseRequest baseRequest = new BaseRequest(sb.toString());
            baseRequest.setDeviceInfo(deviceInfo);
            baseRequest.setTimestamp(l.longValue());
            ECouponCommonActivity_ViewBinding visibility = FragmentBuilder_BindHmlIssuerLandingFragment.setVisibility();
            if (visibility == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            return new C6437x1b3a90a2(str, baseRequest, new C6685x5408f198(str, str2, "/one-appInstall", visibility, new ConfirmRedemptionActivity()), 14);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return null;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(OECF_sRGB oECF_sRGB) {
        if (this.write == null) {
            this.write = oECF_sRGB;
            return;
        }
        if (oECF_sRGB.MediaBrowserCompat$SearchResultReceiver != null) {
            this.write.MediaBrowserCompat$SearchResultReceiver = oECF_sRGB.MediaBrowserCompat$SearchResultReceiver;
        }
        if (oECF_sRGB.AlertController$RecycleListView != null) {
            this.write.AlertController$RecycleListView = oECF_sRGB.AlertController$RecycleListView;
        }
        if (oECF_sRGB.MediaDescriptionCompat != null) {
            this.write.MediaDescriptionCompat = oECF_sRGB.MediaDescriptionCompat;
        }
        if (oECF_sRGB.IconCompatParcelizer != null) {
            this.write.IconCompatParcelizer = oECF_sRGB.IconCompatParcelizer;
        }
        if (oECF_sRGB.RatingCompat != null) {
            this.write.RatingCompat = oECF_sRGB.RatingCompat;
        }
        if (oECF_sRGB.write != null) {
            this.write.write = oECF_sRGB.write;
        }
        if (oECF_sRGB.MediaMetadataCompat != null) {
            this.write.MediaMetadataCompat = oECF_sRGB.MediaMetadataCompat;
        }
        if (oECF_sRGB.PlaybackStateCompat$CustomAction != null) {
            this.write.PlaybackStateCompat$CustomAction = oECF_sRGB.PlaybackStateCompat$CustomAction;
        }
        if (oECF_sRGB.MediaBrowserCompat$MediaItem != null) {
            this.write.MediaBrowserCompat$MediaItem = oECF_sRGB.MediaBrowserCompat$MediaItem;
        }
        if (oECF_sRGB.ParcelableVolumeInfo != null) {
            this.write.ParcelableVolumeInfo = oECF_sRGB.ParcelableVolumeInfo;
        }
        if (oECF_sRGB.read != null) {
            this.write.read = oECF_sRGB.read;
        }
        if (!TextUtils.isEmpty(oECF_sRGB.Keep)) {
            this.write.Keep = oECF_sRGB.Keep;
        }
        if (!TextUtils.isEmpty(oECF_sRGB.setHasDecor)) {
            this.write.setHasDecor = oECF_sRGB.setHasDecor;
        }
        if (!TextUtils.isEmpty(oECF_sRGB.f2764x50fd9e4a)) {
            this.write.f2764x50fd9e4a = oECF_sRGB.f2764x50fd9e4a;
        }
        if (!TextUtils.isEmpty(oECF_sRGB.MediaBrowserCompat$ItemReceiver)) {
            this.write.MediaBrowserCompat$ItemReceiver = oECF_sRGB.MediaBrowserCompat$ItemReceiver;
        }
        if (oECF_sRGB.MediaSessionCompat$ResultReceiverWrapper != null) {
            this.write.MediaSessionCompat$ResultReceiverWrapper = oECF_sRGB.MediaSessionCompat$ResultReceiverWrapper;
        }
        if (oECF_sRGB.MediaSessionCompat$Token != null) {
            this.write.MediaSessionCompat$Token = oECF_sRGB.MediaSessionCompat$Token;
        }
        this.write.PlaybackStateCompat = oECF_sRGB.PlaybackStateCompat;
        if (oECF_sRGB != null && oECF_sRGB.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.write.MediaBrowserCompat$CustomActionResultReceiver = oECF_sRGB.MediaBrowserCompat$CustomActionResultReceiver;
        }
    }
}
