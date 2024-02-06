package p040o;

import android.view.View;
import android.widget.TabHost;
import java.lang.reflect.Field;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.BulkTransferInfoActivity */
public final class BulkTransferInfoActivity extends onSaveClick implements TabHost.OnTabChangeListener {
    private final TabHost.OnTabChangeListener IconCompatParcelizer;
    private int read = -1;

    private BulkTransferInfoActivity(TabHost.OnTabChangeListener onTabChangeListener, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.IconCompatParcelizer = onTabChangeListener;
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
    }

    private static TabHost.OnTabChangeListener read(View view) {
        try {
            Field declaredField = Class.forName("android.widget.TabHost").getDeclaredField("mOnTabChangeListener");
            if (declaredField == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (TabHost.OnTabChangeListener) declaredField.get(view);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneOnTabChangeListener - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        }
    }

    public final void onTabChanged(String str) {
        int i = this.read;
        if (i == -1 || i != ((TabHost) this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer).getCurrentTab()) {
            this.read = ((TabHost) this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer).getCurrentTab();
            read(this.MediaBrowserCompat$CustomActionResultReceiver, ((TabHost) this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer).getCurrentTab());
            TabHost.OnTabChangeListener onTabChangeListener = this.IconCompatParcelizer;
            if (onTabChangeListener != null && !(onTabChangeListener instanceof BulkTransferInfoActivity)) {
                onTabChangeListener.onTabChanged(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(View view) throws ClassCastException {
        ((TabHost) view).setOnTabChangedListener(this.IconCompatParcelizer);
    }

    static boolean IconCompatParcelizer(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null) {
            return false;
        }
        TabHost.OnTabChangeListener read2 = read(deejungTransferLandingActivity.IconCompatParcelizer);
        if (read2 == null || !(read2 instanceof BulkTransferInfoActivity)) {
            BulkTransferInfoActivity bulkTransferInfoActivity = new BulkTransferInfoActivity(read2, deejungTransferLandingActivity);
            ((TabHost) deejungTransferLandingActivity.IconCompatParcelizer).setOnTabChangedListener(bulkTransferInfoActivity);
            BankingAgentSuccessActivity_ViewBinding.write(deejungTransferLandingActivity.IconCompatParcelizer, true, bulkTransferInfoActivity);
            return true;
        }
        ((BulkTransferInfoActivity) read2).read(deejungTransferLandingActivity);
        return false;
    }

    private boolean read(DeejungTransferLandingActivity deejungTransferLandingActivity, int i) {
        if (!deejungTransferLandingActivity.f3129x50fd9e4a.MediaMetadataCompat.equals("TI") || i != DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity.ParcelableVolumeInfo)) {
            for (int i2 = 0; i2 < deejungTransferLandingActivity.read.size(); i2++) {
                if (read(deejungTransferLandingActivity.read.get(i2), i)) {
                    return true;
                }
            }
            return false;
        }
        MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
        StringBuilder sb = new StringBuilder();
        sb.append("onTabChanged ");
        sb.append(i);
        sb.append("; ");
        sb.append(deejungTransferLandingActivity.ParcelableVolumeInfo);
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
        MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity);
        return true;
    }
}
