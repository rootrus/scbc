package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.landingpage.PartnerWebViewFragment;

/* renamed from: o.ActivityBuilder_ContributeECouponCommonActivity */
public final class ActivityBuilder_ContributeECouponCommonActivity {
    /* access modifiers changed from: private */
    public static final String[] IconCompatParcelizer = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void MediaBrowserCompat$ItemReceiver(PartnerWebViewFragment partnerWebViewFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(partnerWebViewFragment.requireActivity(), IconCompatParcelizer)) {
            partnerWebViewFragment.MediaBrowserCompat$CustomActionResultReceiver();
        } else if (ProxySourceAdapter$ItemViewHolder.write(partnerWebViewFragment, IconCompatParcelizer)) {
            C6308x4fe01052 activityBuilder_ContributeECouponCommonActivity$MediaBrowserCompat$CustomActionResultReceiver = new C6308x4fe01052(partnerWebViewFragment, (byte) 0);
            if (partnerWebViewFragment.getUserVisibleHint()) {
                CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(partnerWebViewFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_storage_camera_title).IconCompatParcelizer((int) R.string.permission_storage_camera);
                CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.permission_allow), new ActivityBuilder_ContributeDeejungTransferMinFullOtpActivity(activityBuilder_ContributeECouponCommonActivity$MediaBrowserCompat$CustomActionResultReceiver));
                IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.permission_deny), new ActivityBuilder_ContributeDeejungTransferInstallmentOtpActivity(activityBuilder_ContributeECouponCommonActivity$MediaBrowserCompat$CustomActionResultReceiver)).show();
            }
        } else {
            partnerWebViewFragment.requestPermissions(IconCompatParcelizer, 42);
        }
    }
}
