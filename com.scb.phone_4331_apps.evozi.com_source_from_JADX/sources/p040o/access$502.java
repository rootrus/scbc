package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.investment.scbs.AddAccountConsentActivity;

/* renamed from: o.access$502 */
public final /* synthetic */ class access$502 implements DialogInterface.OnClickListener {
    private final /* synthetic */ AddAccountConsentActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ access$502(AddAccountConsentActivity addAccountConsentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = addAccountConsentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.presenter.IconCompatParcelizer(false);
    }
}
