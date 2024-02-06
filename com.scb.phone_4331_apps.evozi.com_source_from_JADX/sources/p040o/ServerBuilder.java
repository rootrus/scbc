package p040o;

import android.app.Activity;
import com.scb.phone.view.activity.ScbMapActivity;
import com.scb.phone.view.activity.additionaldocument.CaptureDocumentActivity;
import java.util.Arrays;

/* renamed from: o.ServerBuilder */
public final class ServerBuilder {
    /* access modifiers changed from: private */
    public static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    public static final void read(ScbMapActivity scbMapActivity) {
        onGetStartedClick.write((Object) scbMapActivity, "$this$allowedPermissionWithPermissionCheck");
        String[] strArr = MediaBrowserCompat$CustomActionResultReceiver;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(scbMapActivity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            scbMapActivity.setItemInvoker();
            return;
        }
        Activity activity = scbMapActivity;
        String[] strArr2 = MediaBrowserCompat$CustomActionResultReceiver;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(activity, (String[]) Arrays.copyOf(strArr2, strArr2.length))) {
            HistoryAdapter$GroupFooterViewHolder_ViewBinding getktausername = new getKtaUserName(scbMapActivity);
            onGetStartedClick.write((Object) getktausername, "request");
            scbMapActivity.IconCompatParcelizer(getktausername);
            return;
        }
        AppCompatRatingBar.write(activity, MediaBrowserCompat$CustomActionResultReceiver, 57);
    }

    public static final void MediaBrowserCompat$ItemReceiver(ScbMapActivity scbMapActivity, int i, int[] iArr) {
        onGetStartedClick.write((Object) scbMapActivity, "$this$onRequestPermissionsResult");
        onGetStartedClick.write((Object) iArr, "grantResults");
        if (i == 57 && ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length))) {
            scbMapActivity.setItemInvoker();
        }
    }

    /* renamed from: o.ServerBuilder$ServerType */
    public final class ServerType implements MileageQuantitySelectionActivity<CaptureDocumentActivity> {
        public static void MediaBrowserCompat$ItemReceiver(CaptureDocumentActivity captureDocumentActivity, buildFromJson buildfromjson) {
            captureDocumentActivity.presenter = buildfromjson;
        }
    }
}
