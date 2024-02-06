package p040o;

import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.navigation.NavigationView;
import java.lang.reflect.Field;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.navigateToManageQR */
public final class navigateToManageQR extends onSaveClick implements NavigationView.write {
    private final NavigationView.write MediaBrowserCompat$ItemReceiver;

    private navigateToManageQR(NavigationView.write write, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.MediaBrowserCompat$ItemReceiver = write;
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
    }

    public final boolean write(MenuItem menuItem) {
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, menuItem.getItemId());
        NavigationView.write write = this.MediaBrowserCompat$ItemReceiver;
        return write != null && write.write(menuItem);
    }

    private static NavigationView.write write(View view) {
        try {
            Class<?> cls = Class.forName("com.google.android.material.navigation.NavigationView");
            Field MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(cls, "mListener");
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                MediaBrowserCompat$CustomActionResultReceiver = cls.getDeclaredField(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            }
            MediaBrowserCompat$CustomActionResultReceiver.setAccessible(true);
            return (NavigationView.write) MediaBrowserCompat$CustomActionResultReceiver.get(view);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneOnNavigationItemSelectedListener - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        }
    }

    private static int read(View view) {
        try {
            Class<?> cls = Class.forName("com.google.android.material.internal.NavigationMenuItemView");
            Field MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(cls, "mItemData");
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                MediaBrowserCompat$CustomActionResultReceiver = cls.getDeclaredField("itemData");
            }
            MediaBrowserCompat$CustomActionResultReceiver.setAccessible(true);
            return lambda$setupListeners$0$BulkTransferInputActivity.write(MediaBrowserCompat$CustomActionResultReceiver.get(view));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneOnNavigationItemSelectedListener - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(View view) throws ClassCastException {
        ((NavigationView) view).setNavigationItemSelectedListener(this.MediaBrowserCompat$ItemReceiver);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity, int i) {
        if (deejungTransferLandingActivity.IconCompatParcelizer instanceof NavigationMenuItemView) {
            if (read(deejungTransferLandingActivity.IconCompatParcelizer) == i && deejungTransferLandingActivity.MediaSessionCompat$Token) {
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
                StringBuilder sb = new StringBuilder();
                sb.append("NavigationView intercept click: ");
                sb.append(deejungTransferLandingActivity.ParcelableVolumeInfo);
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity);
                return;
            }
        }
        if (deejungTransferLandingActivity.read.size() != 0) {
            for (int i2 = 0; i2 < deejungTransferLandingActivity.read.size(); i2++) {
                MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity.read.get(i2), i);
            }
        }
    }

    static boolean MediaBrowserCompat$ItemReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null || !(deejungTransferLandingActivity.IconCompatParcelizer instanceof NavigationView)) {
            return false;
        }
        NavigationView.write write = write(deejungTransferLandingActivity.IconCompatParcelizer);
        if (write instanceof navigateToManageQR) {
            ((navigateToManageQR) write).read(deejungTransferLandingActivity);
            return false;
        }
        navigateToManageQR navigatetomanageqr = new navigateToManageQR(write, deejungTransferLandingActivity);
        ((NavigationView) deejungTransferLandingActivity.IconCompatParcelizer).setNavigationItemSelectedListener(navigatetomanageqr);
        BankingAgentSuccessActivity_ViewBinding.write(deejungTransferLandingActivity.IconCompatParcelizer, true, navigatetomanageqr);
        return true;
    }
}
