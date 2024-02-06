package p040o;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import java.lang.reflect.Field;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.lambda$setupListeners$0$BulkTransferInputActivity */
public final class lambda$setupListeners$0$BulkTransferInputActivity extends onSaveClick implements ActionMenuView.OnMenuItemClickListener, MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver {
    private final ActionMenuView.OnMenuItemClickListener read;
    private final MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver write;

    private lambda$setupListeners$0$BulkTransferInputActivity(ActionMenuView.OnMenuItemClickListener onMenuItemClickListener, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.read = onMenuItemClickListener;
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
        MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver write2 = write(deejungTransferLandingActivity.IconCompatParcelizer);
        this.write = write2;
        if (!(write2 instanceof lambda$setupListeners$0$BulkTransferInputActivity)) {
            ((ActionMenuView) deejungTransferLandingActivity.IconCompatParcelizer).setMenuCallbacks(read((ActionMenuView) deejungTransferLandingActivity.IconCompatParcelizer), this);
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, menuItem.getItemId());
        ActionMenuView.OnMenuItemClickListener onMenuItemClickListener = this.read;
        return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
    }

    private static setStackedBackground$MediaBrowserCompat$ItemReceiver read(ActionMenuView actionMenuView) {
        try {
            Field declaredField = Class.forName("androidx.appcompat.widget.ActionMenuView").getDeclaredField("mActionMenuPresenterCallback");
            if (declaredField == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (setStackedBackground$MediaBrowserCompat$ItemReceiver) declaredField.get(actionMenuView);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneSupportOnMenuItemClickListener - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        }
    }

    private static MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver write(View view) {
        try {
            Field declaredField = Class.forName("androidx.appcompat.widget.ActionMenuView").getDeclaredField("mMenuBuilderCallback");
            if (declaredField == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver) declaredField.get(view);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneSupportOnMenuItemClickListener - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        }
    }

    private static ActionMenuView.OnMenuItemClickListener read(View view) {
        try {
            Field declaredField = Class.forName("androidx.appcompat.widget.ActionMenuView").getDeclaredField("mOnMenuItemClickListener");
            if (declaredField == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (ActionMenuView.OnMenuItemClickListener) declaredField.get(view);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneSupportOnMenuItemClickListener - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        }
    }

    private static int write(View view, String str) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField("mItemData");
            if (declaredField == null) {
                return -1;
            }
            declaredField.setAccessible(true);
            return write(declaredField.get(view));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneSupportOnMenuItemClickListener - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return -1;
        }
    }

    public static int write(Object obj) {
        try {
            Field declaredField = Class.forName("androidx.appcompat.view.menu.MenuItemImpl").getDeclaredField("mId");
            if (declaredField == null) {
                return -1;
            }
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(obj)).intValue();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getItemId - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(View view) throws ClassCastException {
        ((ActionMenuView) view).setOnMenuItemClickListener(this.read);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl, MenuItem menuItem) {
        MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver = this.write;
        return menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver != null && menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(menuItemImpl, menuItem);
    }

    public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token) {
            MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
        MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver = this.write;
        if (menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver != null) {
            menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(menuItemImpl);
        }
    }

    private void IconCompatParcelizer(DeejungTransferLandingActivity deejungTransferLandingActivity, int i) {
        int i2 = 0;
        if ((deejungTransferLandingActivity.IconCompatParcelizer instanceof ActionMenuView) && deejungTransferLandingActivity.read.size() != 0) {
            while (i2 < deejungTransferLandingActivity.read.size()) {
                IconCompatParcelizer(deejungTransferLandingActivity.read.get(i2), i);
                i2++;
            }
        } else if (DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer(deejungTransferLandingActivity.IconCompatParcelizer.getClass().getCanonicalName()).equals("AMIV")) {
            View view = deejungTransferLandingActivity.IconCompatParcelizer;
            int write2 = write(view, "androidx.appcompat.view.menu.ActionMenuItemView");
            if (write2 == -1) {
                write2 = write(view, "androidx.appcompat.internal.view.menu.ActionMenuItemView");
            }
            if (write2 == i && deejungTransferLandingActivity.MediaSessionCompat$Token) {
                i2 = 1;
            }
            if (i2 != 0) {
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.write;
                StringBuilder sb = new StringBuilder();
                sb.append("SupportOnMenuItemClick path");
                sb.append(deejungTransferLandingActivity.ParcelableVolumeInfo);
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity);
            }
        }
    }

    static boolean write(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null) {
            return false;
        }
        ActionMenuView.OnMenuItemClickListener read2 = read(deejungTransferLandingActivity.IconCompatParcelizer);
        if (read2 == null || !(read2 instanceof lambda$setupListeners$0$BulkTransferInputActivity)) {
            lambda$setupListeners$0$BulkTransferInputActivity lambda_setuplisteners_0_bulktransferinputactivity = new lambda$setupListeners$0$BulkTransferInputActivity(read2, deejungTransferLandingActivity);
            ((ActionMenuView) deejungTransferLandingActivity.IconCompatParcelizer).setOnMenuItemClickListener(lambda_setuplisteners_0_bulktransferinputactivity);
            BankingAgentSuccessActivity_ViewBinding.write(deejungTransferLandingActivity.IconCompatParcelizer, true, lambda_setuplisteners_0_bulktransferinputactivity);
            return true;
        }
        ((lambda$setupListeners$0$BulkTransferInputActivity) read2).read(deejungTransferLandingActivity);
        return false;
    }
}
