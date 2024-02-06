package p040o;

import com.scb.phone.view.activity.bankingagent.BankingAgentSuccessActivity;
import java.util.Arrays;
import p040o.MoreExecutors;

/* renamed from: o.iz */
public final class C7181iz {
    /* access modifiers changed from: private */
    public static final String[] IconCompatParcelizer = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] MediaBrowserCompat$ItemReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] read = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static HistoryAdapter$GroupFooterViewHolder write;

    public static final void MediaBrowserCompat$ItemReceiver(BankingAgentSuccessActivity bankingAgentSuccessActivity, MoreExecutors.SameThreadExecutorService sameThreadExecutorService, boolean z) {
        onGetStartedClick.write((Object) bankingAgentSuccessActivity, "$this$takeScreenshotWithPermissionCheck");
        onGetStartedClick.write((Object) sameThreadExecutorService, "display");
        String[] strArr = IconCompatParcelizer;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(bankingAgentSuccessActivity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            bankingAgentSuccessActivity.MediaBrowserCompat$ItemReceiver(sameThreadExecutorService, z);
            return;
        }
        write = new C7177iq(bankingAgentSuccessActivity, sameThreadExecutorService, z);
        AppCompatRatingBar.write(bankingAgentSuccessActivity, IconCompatParcelizer, 2);
    }

    public static final void IconCompatParcelizer(BankingAgentSuccessActivity bankingAgentSuccessActivity) {
        onGetStartedClick.write((Object) bankingAgentSuccessActivity, "$this$shareSlipWithPermissionCheck");
        String[] strArr = MediaBrowserCompat$ItemReceiver;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(bankingAgentSuccessActivity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            bankingAgentSuccessActivity.mo13919x50fd9e4a();
        } else {
            AppCompatRatingBar.write(bankingAgentSuccessActivity, MediaBrowserCompat$ItemReceiver, 1);
        }
    }

    public static final void read(BankingAgentSuccessActivity bankingAgentSuccessActivity) {
        onGetStartedClick.write((Object) bankingAgentSuccessActivity, "$this$saveSlipWithPermissionCheck");
        String[] strArr = read;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(bankingAgentSuccessActivity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            bankingAgentSuccessActivity.MediaSessionCompat$Token();
        } else {
            AppCompatRatingBar.write(bankingAgentSuccessActivity, read, 0);
        }
    }

    public static final void MediaBrowserCompat$CustomActionResultReceiver(BankingAgentSuccessActivity bankingAgentSuccessActivity, int i, int[] iArr) {
        HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder;
        onGetStartedClick.write((Object) bankingAgentSuccessActivity, "$this$onRequestPermissionsResult");
        onGetStartedClick.write((Object) iArr, "grantResults");
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length)) && (historyAdapter$GroupFooterViewHolder = write) != null) {
                        historyAdapter$GroupFooterViewHolder.IconCompatParcelizer();
                    }
                    write = null;
                }
            } else if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length))) {
                bankingAgentSuccessActivity.mo13919x50fd9e4a();
            }
        } else if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length))) {
            bankingAgentSuccessActivity.MediaSessionCompat$Token();
        }
    }
}
