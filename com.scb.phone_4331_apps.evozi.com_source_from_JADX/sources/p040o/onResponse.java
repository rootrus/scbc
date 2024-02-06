package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.BaseActivity;

/* renamed from: o.onResponse */
public final /* synthetic */ class onResponse implements DialogInterface.OnClickListener {
    private final /* synthetic */ access$2300 IconCompatParcelizer;
    private final /* synthetic */ BaseActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ onResponse(BaseActivity baseActivity, access$2300 access_2300) {
        this.MediaBrowserCompat$ItemReceiver = baseActivity;
        this.IconCompatParcelizer = access_2300;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BaseActivity baseActivity = this.MediaBrowserCompat$ItemReceiver;
        access$2300 access_2300 = this.IconCompatParcelizer;
        dialogInterface.dismiss();
        baseActivity.IconCompatParcelizer(access_2300);
    }
}
