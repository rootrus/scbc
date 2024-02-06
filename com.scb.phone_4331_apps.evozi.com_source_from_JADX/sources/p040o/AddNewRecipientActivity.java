package p040o;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$MediaBrowserCompat$ItemReceiver;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: o.AddNewRecipientActivity */
public final class AddNewRecipientActivity extends onSaveClick implements TabLayout$MediaBrowserCompat$ItemReceiver {
    private AddNewRecipientActivity(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
    }

    public final void write(TabLayout.IconCompatParcelizer iconCompatParcelizer) {
        DeejungTransferLandingActivity deejungTransferLandingActivity = this.MediaBrowserCompat$CustomActionResultReceiver.read.get(0);
        if (deejungTransferLandingActivity.read.size() > iconCompatParcelizer.read) {
            MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity.read.get(iconCompatParcelizer.read));
        }
    }

    private static ArrayList<TabLayout$MediaBrowserCompat$ItemReceiver> write(View view) {
        try {
            Class<?> cls = Class.forName("com.google.android.material.tabs.TabLayout");
            Field MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(cls, "mSelectedListeners");
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                MediaBrowserCompat$CustomActionResultReceiver = cls.getDeclaredField("selectedListeners");
            }
            MediaBrowserCompat$CustomActionResultReceiver.setAccessible(true);
            return (ArrayList) MediaBrowserCompat$CustomActionResultReceiver.get(view);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneOnTabSelectedListener - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(View view) throws ClassCastException {
        ((TabLayout) view).IconCompatParcelizer.remove(this);
    }

    static boolean IconCompatParcelizer(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null) {
            return false;
        }
        TabLayout tabLayout = (TabLayout) deejungTransferLandingActivity.IconCompatParcelizer;
        ArrayList<TabLayout$MediaBrowserCompat$ItemReceiver> write = write((View) tabLayout);
        if (write != null) {
            for (int i = 0; i < write.size(); i++) {
                if (write.get(i) instanceof AddNewRecipientActivity) {
                    ((AddNewRecipientActivity) write.get(i)).MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
                    return false;
                }
            }
        }
        AddNewRecipientActivity addNewRecipientActivity = new AddNewRecipientActivity(deejungTransferLandingActivity);
        tabLayout.addOnTabSelectedListener(addNewRecipientActivity);
        BankingAgentSuccessActivity_ViewBinding.write(tabLayout, true, addNewRecipientActivity);
        return true;
    }
}
