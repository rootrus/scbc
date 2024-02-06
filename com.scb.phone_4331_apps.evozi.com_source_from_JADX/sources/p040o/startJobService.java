package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.deeplink.DeepLinkActivity;

/* renamed from: o.startJobService */
public final /* synthetic */ class startJobService implements DialogInterface.OnClickListener {
    private final /* synthetic */ DeepLinkActivity read;

    public /* synthetic */ startJobService(DeepLinkActivity deepLinkActivity) {
        this.read = deepLinkActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeepLinkActivity deepLinkActivity = this.read;
        dialogInterface.dismiss();
        deepLinkActivity.finish();
    }
}
