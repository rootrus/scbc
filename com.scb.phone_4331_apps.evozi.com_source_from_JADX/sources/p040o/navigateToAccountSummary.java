package p040o;

import android.view.MenuItem;
import android.view.View;
import android.widget.ActionMenuView;
import java.lang.reflect.Field;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.navigateToAccountSummary */
public final class navigateToAccountSummary extends onSaveClick implements ActionMenuView.OnMenuItemClickListener {
    private final ActionMenuView.OnMenuItemClickListener MediaBrowserCompat$ItemReceiver;

    private navigateToAccountSummary(ActionMenuView.OnMenuItemClickListener onMenuItemClickListener, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.MediaBrowserCompat$ItemReceiver = onMenuItemClickListener;
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, menuItem.getItemId());
        ActionMenuView.OnMenuItemClickListener onMenuItemClickListener = this.MediaBrowserCompat$ItemReceiver;
        return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
    }

    private static ActionMenuView.OnMenuItemClickListener read(View view) {
        try {
            Field declaredField = Class.forName("android.widget.ActionMenuView").getDeclaredField("mOnMenuItemClickListener");
            if (declaredField == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (ActionMenuView.OnMenuItemClickListener) declaredField.get(view);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneOnMenuItemClickListener - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(View view) throws ClassCastException {
        ((ActionMenuView) view).setOnMenuItemClickListener(this.MediaBrowserCompat$ItemReceiver);
    }

    private void MediaBrowserCompat$ItemReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity, int i) {
        if (deejungTransferLandingActivity.IconCompatParcelizer.getClass().getSimpleName().equals("ActionMenuItemView")) {
            if (deejungTransferLandingActivity.IconCompatParcelizer.getId() == i && deejungTransferLandingActivity.MediaSessionCompat$Token) {
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
                StringBuilder sb = new StringBuilder();
                sb.append("OnMenuItemClick path ");
                sb.append(deejungTransferLandingActivity.ParcelableVolumeInfo);
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity);
                return;
            }
        }
        if (deejungTransferLandingActivity.read.size() != 0) {
            for (int i2 = 0; i2 < deejungTransferLandingActivity.read.size(); i2++) {
                MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity.read.get(i2), i);
            }
        }
    }

    static boolean write(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null) {
            return false;
        }
        ActionMenuView.OnMenuItemClickListener read = read(deejungTransferLandingActivity.IconCompatParcelizer);
        if (read == null || !(read instanceof navigateToAccountSummary)) {
            navigateToAccountSummary navigatetoaccountsummary = new navigateToAccountSummary(read, deejungTransferLandingActivity);
            ((ActionMenuView) deejungTransferLandingActivity.IconCompatParcelizer).setOnMenuItemClickListener(navigatetoaccountsummary);
            BankingAgentSuccessActivity_ViewBinding.write(deejungTransferLandingActivity.IconCompatParcelizer, true, navigatetoaccountsummary);
            return true;
        }
        ((navigateToAccountSummary) read).read(deejungTransferLandingActivity);
        return false;
    }
}
