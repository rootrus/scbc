package p040o;

import android.view.View;
import java.lang.reflect.Field;

/* renamed from: o.QrToPayOtpActivity */
public final class QrToPayOtpActivity extends onSaveClick implements View.OnClickListener {
    private final View.OnClickListener IconCompatParcelizer;

    private QrToPayOtpActivity(DeejungTransferLandingActivity deejungTransferLandingActivity, View.OnClickListener onClickListener) {
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
        this.IconCompatParcelizer = onClickListener;
    }

    private static View.OnClickListener MediaBrowserCompat$CustomActionResultReceiver(View view) {
        try {
            Field declaredField = view.getClass().getDeclaredField("mTabClickListener");
            declaredField.setAccessible(true);
            return (View.OnClickListener) declaredField.get(view);
        } catch (NoSuchFieldException e) {
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Could not get ScrollingTabContainerView.mTabClickListener.  Click handling failed.");
            MyECouponActivity_ViewBinding.IconCompatParcelizer((Exception) e);
        } catch (IllegalAccessException e2) {
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Setting ScrollingTabContainerView.mTabClickListener accessible failed. Click handling failed.");
            MyECouponActivity_ViewBinding.IconCompatParcelizer((Exception) e2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(View view) {
        view.setOnClickListener(this.IconCompatParcelizer);
    }

    public final void onClick(View view) {
        DeejungTransferLandingActivity IconCompatParcelizer2 = IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        if (IconCompatParcelizer2 != null) {
            MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
        } else {
            MyECouponActivity_ViewBinding.write("Could not find ScrollingTabContainerView Tab to click.");
        }
        View.OnClickListener onClickListener = this.IconCompatParcelizer;
        if (onClickListener != null && !(onClickListener instanceof QrToPayOtpActivity)) {
            onClickListener.onClick(view);
        }
    }

    private static DeejungTransferLandingActivity IconCompatParcelizer(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity.f3129x50fd9e4a.MediaMetadataCompat.equals("STI") || deejungTransferLandingActivity.f3129x50fd9e4a.MediaMetadataCompat.equals("ScrollingTabContainerView$TabView")) {
            return deejungTransferLandingActivity;
        }
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = null;
        if (deejungTransferLandingActivity.read.isEmpty()) {
            return null;
        }
        int i = 0;
        while (i < deejungTransferLandingActivity.read.size() && (deejungTransferLandingActivity2 = IconCompatParcelizer(deejungTransferLandingActivity.read.get(i))) == null) {
            i++;
        }
        return deejungTransferLandingActivity2;
    }

    static boolean MediaBrowserCompat$ItemReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null) {
            return false;
        }
        try {
            View.OnClickListener MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity.IconCompatParcelizer);
            int i = 0;
            while (i < deejungTransferLandingActivity.read.size()) {
                DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity.read.get(i);
                if (MediaBrowserCompat$CustomActionResultReceiver == null || !(MediaBrowserCompat$CustomActionResultReceiver instanceof QrToPayOtpActivity)) {
                    QrToPayOtpActivity qrToPayOtpActivity = new QrToPayOtpActivity(deejungTransferLandingActivity2, MediaBrowserCompat$CustomActionResultReceiver);
                    deejungTransferLandingActivity2.IconCompatParcelizer.setOnClickListener(qrToPayOtpActivity);
                    BankingAgentSuccessActivity_ViewBinding.write(deejungTransferLandingActivity2.IconCompatParcelizer, true, qrToPayOtpActivity);
                    i++;
                } else {
                    ((QrToPayOtpActivity) MediaBrowserCompat$CustomActionResultReceiver).read(deejungTransferLandingActivity2);
                    return false;
                }
            }
        } catch (RuntimeException e) {
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Setting ScrollingTabContainerView.mTabClickListener failed. Click handling failed.");
            MyECouponActivity_ViewBinding.IconCompatParcelizer((Exception) e);
        }
        return true;
    }
}
