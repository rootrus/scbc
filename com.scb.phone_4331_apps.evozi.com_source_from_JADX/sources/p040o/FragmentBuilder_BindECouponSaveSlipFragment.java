package p040o;

import android.content.Context;
import android.content.DialogInterface;
import android.webkit.SslErrorHandler;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;

/* renamed from: o.FragmentBuilder_BindECouponSaveSlipFragment */
public final class FragmentBuilder_BindECouponSaveSlipFragment {
    FragmentBuilder_BindEBillSubscriptionFragment IconCompatParcelizer;

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context, SslErrorHandler sslErrorHandler) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) sslErrorHandler, "handler");
        if (context instanceof FragmentBuilder_BindEBillSubscriptionFragment) {
            this.IconCompatParcelizer = (FragmentBuilder_BindEBillSubscriptionFragment) context;
        }
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(context).MediaBrowserCompat$ItemReceiver((int) R.string.ssl_error_title).IconCompatParcelizer((int) R.string.ssl_error_message);
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.confirm), new IconCompatParcelizer(sslErrorHandler));
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.cancel), new C6507x7cfe1aa3(this, sslErrorHandler));
        MediaBrowserCompat$ItemReceiver.setCancelable(false);
        MediaBrowserCompat$ItemReceiver.setCanceledOnTouchOutside(false);
        MediaBrowserCompat$ItemReceiver.show();
    }

    /* renamed from: o.FragmentBuilder_BindECouponSaveSlipFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer implements DialogInterface.OnClickListener {
        private /* synthetic */ SslErrorHandler read;

        IconCompatParcelizer(SslErrorHandler sslErrorHandler) {
            this.read = sslErrorHandler;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.read.proceed();
            dialogInterface.dismiss();
        }
    }
}
