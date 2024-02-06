package p040o;

import com.scb.phone.view.fragment.remittance.RemittanceSuccessFragment;
import java.util.Arrays;

/* renamed from: o.ActivityBuilder_ContributePrepaidRequestReviewActivity */
public final class ActivityBuilder_ContributePrepaidRequestReviewActivity {
    private static HistoryAdapter$GroupFooterViewHolder IconCompatParcelizer;
    private static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] MediaBrowserCompat$ItemReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    /* access modifiers changed from: private */
    public static final String[] write = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static final void IconCompatParcelizer(RemittanceSuccessFragment remittanceSuccessFragment, setImportance setimportance, boolean z) {
        onGetStartedClick.write((Object) remittanceSuccessFragment, "$this$takeScreenshotWithPermissionCheck");
        onGetStartedClick.write((Object) setimportance, "display");
        String[] strArr = write;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(remittanceSuccessFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            remittanceSuccessFragment.read(setimportance, z);
            return;
        }
        IconCompatParcelizer = new ActivityBuilder_ContributePrepaidResetPinSuccessActivity(remittanceSuccessFragment, setimportance, z);
        remittanceSuccessFragment.requestPermissions(write, 50);
    }

    public static final void MediaBrowserCompat$ItemReceiver(RemittanceSuccessFragment remittanceSuccessFragment) {
        onGetStartedClick.write((Object) remittanceSuccessFragment, "$this$shareSlipWithPermissionCheck");
        String[] strArr = MediaBrowserCompat$CustomActionResultReceiver;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(remittanceSuccessFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            remittanceSuccessFragment.MediaMetadataCompat();
        } else {
            remittanceSuccessFragment.requestPermissions(MediaBrowserCompat$CustomActionResultReceiver, 49);
        }
    }

    public static final void read(RemittanceSuccessFragment remittanceSuccessFragment) {
        onGetStartedClick.write((Object) remittanceSuccessFragment, "$this$saveSlipWithPermissionCheck");
        String[] strArr = MediaBrowserCompat$ItemReceiver;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(remittanceSuccessFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            remittanceSuccessFragment.MediaBrowserCompat$ItemReceiver();
        } else {
            remittanceSuccessFragment.requestPermissions(MediaBrowserCompat$ItemReceiver, 48);
        }
    }

    public static final void read(RemittanceSuccessFragment remittanceSuccessFragment, int i, int[] iArr) {
        HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder;
        onGetStartedClick.write((Object) remittanceSuccessFragment, "$this$onRequestPermissionsResult");
        onGetStartedClick.write((Object) iArr, "grantResults");
        switch (i) {
            case 48:
                if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length))) {
                    remittanceSuccessFragment.MediaBrowserCompat$ItemReceiver();
                    return;
                }
                return;
            case 49:
                if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length))) {
                    remittanceSuccessFragment.MediaMetadataCompat();
                    return;
                }
                return;
            case 50:
                if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length)) && (historyAdapter$GroupFooterViewHolder = IconCompatParcelizer) != null) {
                    historyAdapter$GroupFooterViewHolder.IconCompatParcelizer();
                }
                IconCompatParcelizer = null;
                return;
            default:
                return;
        }
    }
}
