package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.easycash.DurationEmploymentForBusinessDialog;

/* renamed from: o.readBoolean */
public final /* synthetic */ class readBoolean implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ DurationEmploymentForBusinessDialog.read write;

    public /* synthetic */ readBoolean(DurationEmploymentForBusinessDialog.read read) {
        this.write = read;
    }

    public final Object write(Object obj) {
        root root = (root) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) root, "idp");
        return new addGroundOverlay(root.write, root.MediaBrowserCompat$CustomActionResultReceiver, root.IconCompatParcelizer);
    }
}
