package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ntb.EkycOtpActivity;
import java.lang.ref.WeakReference;

/* renamed from: o.applyFacade */
public final /* synthetic */ class applyFacade implements DialogInterface.OnClickListener {
    private final /* synthetic */ EkycOtpActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ applyFacade(EkycOtpActivity ekycOtpActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = ekycOtpActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EkycOtpActivity ekycOtpActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        dialogInterface.dismiss();
        FragmentBuilder_BindDepositMoreInfoFragment.write((WeakReference<BaseActivity>) new WeakReference(ekycOtpActivity));
    }
}
