package p040o;

import com.scb.phone.view.fragment.transferandpay.FixedTransferSuccessFragment;
import p040o.CrashlyticsReport;

/* renamed from: o.ActivityBuilder_ContributesHmlLaserIdAboutActivity */
public final class ActivityBuilder_ContributesHmlLaserIdAboutActivity {
    private static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    /* access modifiers changed from: private */
    public static final String[] MediaBrowserCompat$ItemReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] read = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static HistoryAdapter$GroupFooterViewHolder write;

    public static void IconCompatParcelizer(FixedTransferSuccessFragment fixedTransferSuccessFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(fixedTransferSuccessFragment.requireActivity(), read)) {
            fixedTransferSuccessFragment.IconCompatParcelizer();
        } else {
            fixedTransferSuccessFragment.requestPermissions(read, 22);
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(FixedTransferSuccessFragment fixedTransferSuccessFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(fixedTransferSuccessFragment.requireActivity(), MediaBrowserCompat$CustomActionResultReceiver)) {
            fixedTransferSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            fixedTransferSuccessFragment.requestPermissions(MediaBrowserCompat$CustomActionResultReceiver, 21);
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(FixedTransferSuccessFragment fixedTransferSuccessFragment, CrashlyticsReport.Session.Event.Application application, boolean z) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(fixedTransferSuccessFragment.requireActivity(), MediaBrowserCompat$ItemReceiver)) {
            fixedTransferSuccessFragment.read(application, z);
            return;
        }
        write = new C6324xe15d7917(fixedTransferSuccessFragment, application, z, (byte) 0);
        fixedTransferSuccessFragment.requestPermissions(MediaBrowserCompat$ItemReceiver, 23);
    }

    public static void IconCompatParcelizer(FixedTransferSuccessFragment fixedTransferSuccessFragment, int i, int[] iArr) {
        HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder;
        switch (i) {
            case 21:
                if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                    fixedTransferSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver();
                    return;
                }
                return;
            case 22:
                if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                    fixedTransferSuccessFragment.IconCompatParcelizer();
                    return;
                }
                return;
            case 23:
                if (ProxySourceAdapter$ItemViewHolder.write(iArr) && (historyAdapter$GroupFooterViewHolder = write) != null) {
                    historyAdapter$GroupFooterViewHolder.IconCompatParcelizer();
                }
                write = null;
                return;
            default:
                return;
        }
    }
}
