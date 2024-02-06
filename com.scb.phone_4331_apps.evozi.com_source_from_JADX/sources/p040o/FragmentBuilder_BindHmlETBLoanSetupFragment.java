package p040o;

import android.app.Activity;
import com.thunderhead.MiniNotificationView;
import com.thunderhead.MiniOptimizationViewController;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p040o.FragmentBuilder_BindHmlETBSummaryFragment;

/* renamed from: o.FragmentBuilder_BindHmlETBLoanSetupFragment */
public final class FragmentBuilder_BindHmlETBLoanSetupFragment extends FragmentBuilder_BindHmlAddOperatingAccountFragment {
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    WeakReference<MiniOptimizationViewController> MediaBrowserCompat$ItemReceiver;
    private long MediaBrowserCompat$SearchResultReceiver;
    private FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer PlaybackStateCompat$CustomAction = FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer.MINI_NOTIFICATION_BOTTOM;

    /* access modifiers changed from: package-private */
    public final FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer MediaMetadataCompat() {
        return this.PlaybackStateCompat$CustomAction;
    }

    public final void RatingCompat() {
        FragmentBuilder_BindHmlLandingFragment fragmentBuilder_BindHmlLandingFragment;
        Iterator<FragmentBuilder_BindHmlLandingFragment> it = this.f3144x50fd9e4a.iterator();
        while (true) {
            if (!it.hasNext()) {
                fragmentBuilder_BindHmlLandingFragment = null;
                break;
            }
            fragmentBuilder_BindHmlLandingFragment = it.next();
            if (fragmentBuilder_BindHmlLandingFragment.MediaBrowserCompat$MediaItem() != null && !fragmentBuilder_BindHmlLandingFragment.MediaBrowserCompat$MediaItem().isEmpty()) {
                break;
            }
        }
        if (fragmentBuilder_BindHmlLandingFragment == null) {
            Iterator<FragmentBuilder_BindHmlLandingFragment> it2 = this.f3144x50fd9e4a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                FragmentBuilder_BindHmlLandingFragment next = it2.next();
                if (next.MediaBrowserCompat$ItemReceiver().equals(C6552xadbb583e.POSITIVE)) {
                    fragmentBuilder_BindHmlLandingFragment = next;
                    break;
                }
            }
        }
        if (fragmentBuilder_BindHmlLandingFragment != null) {
            IconCompatParcelizer(fragmentBuilder_BindHmlLandingFragment);
            if (this.Keep != null) {
                this.Keep.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindHmlLandingFragment.IconCompatParcelizer(), this.RatingCompat, (FragmentBuilder_BindHmlNdidInstructionFragment) null);
            }
        } else {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindSmeLoanStatusFragment.NO_DEFAULT_POSITIVE_RESPONSE_FROM_SERVER);
        }
        if (this.write != null) {
            this.write.MediaBrowserCompat$ItemReceiver(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(Activity activity) {
        super.read(activity);
        MiniNotificationView.write write = new MiniNotificationView.write(activity);
        write.read = this.IconCompatParcelizer;
        write.write = this.MediaSessionCompat$QueueItem;
        write.MediaBrowserCompat$CustomActionResultReceiver = this.setHasDecor;
        write.MediaMetadataCompat = this.PlaybackStateCompat;
        write.IconCompatParcelizer = this.MediaMetadataCompat;
        StringBuilder sb = new StringBuilder("Create new MiniNotification - message: \"");
        sb.append(write.write);
        sb.append("\", text size: ");
        sb.append(write.MediaMetadataCompat);
        sb.append(", text color: ");
        sb.append(write.MediaBrowserCompat$CustomActionResultReceiver);
        MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.write, sb.toString());
        MiniOptimizationViewController miniOptimizationViewController = new MiniOptimizationViewController(activity, new MiniNotificationView(write.MediaBrowserCompat$ItemReceiver, write.read, write.write, write.MediaMetadataCompat, write.MediaBrowserCompat$CustomActionResultReceiver, write.IconCompatParcelizer, 0, (byte) 0), this, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaSessionCompat$ResultReceiverWrapper, this.AlertController$RecycleListView.booleanValue());
        this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(miniOptimizationViewController);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            miniOptimizationViewController.IconCompatParcelizer = this.MediaBrowserCompat$SearchResultReceiver;
            ((Activity) miniOptimizationViewController.getContext()).runOnUiThread(miniOptimizationViewController.MediaDescriptionCompat);
            return;
        }
        ((Activity) miniOptimizationViewController.getContext()).runOnUiThread(miniOptimizationViewController.MediaMetadataCompat);
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver() {
        WeakReference<MiniOptimizationViewController> weakReference = this.MediaBrowserCompat$ItemReceiver;
        if (!(weakReference == null || weakReference.get() == null)) {
            this.MediaBrowserCompat$ItemReceiver.get().IconCompatParcelizer(false, this.AlertController$RecycleListView.booleanValue());
        }
        if (this.write != null) {
            this.write.MediaBrowserCompat$ItemReceiver(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        WeakReference<MiniOptimizationViewController> weakReference = this.MediaBrowserCompat$ItemReceiver;
        if (!(weakReference == null || weakReference.get() == null)) {
            this.MediaBrowserCompat$ItemReceiver.get().IconCompatParcelizer(true, this.AlertController$RecycleListView.booleanValue());
        }
        if (this.write != null) {
            this.write.MediaBrowserCompat$ItemReceiver(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void read() {
        MiniOptimizationViewController miniOptimizationViewController;
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        WeakReference<MiniOptimizationViewController> weakReference = this.MediaBrowserCompat$ItemReceiver;
        if (weakReference != null && (miniOptimizationViewController = weakReference.get()) != null) {
            this.MediaBrowserCompat$SearchResultReceiver = miniOptimizationViewController.IconCompatParcelizer + (System.currentTimeMillis() - miniOptimizationViewController.MediaBrowserCompat$MediaItem);
            miniOptimizationViewController.MediaBrowserCompat$ItemReceiver = null;
            miniOptimizationViewController.MediaBrowserCompat$SearchResultReceiver.removeCallbacks(miniOptimizationViewController.MediaDescriptionCompat);
            miniOptimizationViewController.MediaBrowserCompat$SearchResultReceiver.removeCallbacks(miniOptimizationViewController.MediaMetadataCompat);
            miniOptimizationViewController.MediaBrowserCompat$SearchResultReceiver.removeCallbacks(miniOptimizationViewController.write);
            miniOptimizationViewController.MediaBrowserCompat$SearchResultReceiver.removeCallbacks(miniOptimizationViewController.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        if (this.write != null) {
            this.write.MediaBrowserCompat$ItemReceiver(this);
        }
    }

    public final void MediaDescriptionCompat() {
        if (this.write != null) {
            this.write.MediaBrowserCompat$ItemReceiver(this);
        }
    }
}
