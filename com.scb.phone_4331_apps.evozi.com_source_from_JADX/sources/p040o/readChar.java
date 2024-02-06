package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.easycash.DurationEmploymentForBusinessDialog;
import p040o.zzct;

/* renamed from: o.readChar */
public final /* synthetic */ class readChar implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ DurationEmploymentForBusinessDialog.read MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ zzct.zza write;

    public /* synthetic */ readChar(DurationEmploymentForBusinessDialog.read read, zzct.zza zza) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
        this.write = zza;
    }

    public final Object write(Object obj) {
        DurationEmploymentForBusinessDialog.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        return read.write.IconCompatParcelizer((getSize) ((SingleDataEntity) obj).getData(), this.write);
    }
}
