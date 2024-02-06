package p040o;

import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.view.activity.mwpartner.MwManageWalletActivity;
import p040o.getTaskID;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCalendar */
public final /* synthetic */ class getCalendar implements C6992x633f693d {
    private final /* synthetic */ MwManageWalletActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getCalendar(MwManageWalletActivity mwManageWalletActivity) {
        this.MediaBrowserCompat$ItemReceiver = mwManageWalletActivity;
    }

    public final boolean read(String str) {
        getTaskID gettaskid = this.MediaBrowserCompat$ItemReceiver.presenter;
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        writeUInt64NoTag.IconCompatParcelizer write = new getTaskID.write(str);
        if (gettaskid.RatingCompat != null) {
            write.IconCompatParcelizer(gettaskid.RatingCompat);
        }
        return true;
    }
}
