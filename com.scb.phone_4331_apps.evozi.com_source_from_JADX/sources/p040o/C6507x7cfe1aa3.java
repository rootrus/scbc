package p040o;

import android.content.DialogInterface;
import android.webkit.SslErrorHandler;

/* renamed from: o.FragmentBuilder_BindECouponSaveSlipFragment$MediaBrowserCompat$ItemReceiver */
final class C6507x7cfe1aa3 implements DialogInterface.OnClickListener {
    private /* synthetic */ SslErrorHandler MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ FragmentBuilder_BindECouponSaveSlipFragment read;

    C6507x7cfe1aa3(FragmentBuilder_BindECouponSaveSlipFragment fragmentBuilder_BindECouponSaveSlipFragment, SslErrorHandler sslErrorHandler) {
        this.read = fragmentBuilder_BindECouponSaveSlipFragment;
        this.MediaBrowserCompat$ItemReceiver = sslErrorHandler;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.MediaBrowserCompat$ItemReceiver.cancel();
        FragmentBuilder_BindEBillSubscriptionFragment fragmentBuilder_BindEBillSubscriptionFragment = this.read.IconCompatParcelizer;
        if (fragmentBuilder_BindEBillSubscriptionFragment != null) {
            fragmentBuilder_BindEBillSubscriptionFragment.MediaSessionCompat$QueueItem();
        }
        dialogInterface.dismiss();
    }
}
