package p040o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.thunderhead.FullScreenNotificationScreen;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p040o.FragmentBuilder_BindHmlETBSummaryFragment;

/* renamed from: o.FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment */
public final class FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment extends FragmentBuilder_BindHmlAddOperatingAccountFragment {
    WeakReference<Bitmap> MediaBrowserCompat$CustomActionResultReceiver = null;
    AtomicBoolean MediaBrowserCompat$ItemReceiver = new AtomicBoolean();
    public WeakReference<write> MediaBrowserCompat$SearchResultReceiver;
    private C6545xdc098dff PlaybackStateCompat$CustomAction;

    /* renamed from: o.FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment$write */
    public interface write {
        void MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaDescriptionCompat() {
    }

    /* access modifiers changed from: package-private */
    public final void read() {
    }

    /* access modifiers changed from: package-private */
    public final FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer MediaMetadataCompat() {
        return FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer.FULL;
    }

    public final void RatingCompat() {
        MediaBrowserCompat$CustomActionResultReceiver(C6552xadbb583e.POSITIVE);
    }

    /* access modifiers changed from: package-private */
    public final void read(Activity activity) {
        super.read(activity);
        View decorView = activity.getWindow().getDecorView();
        decorView.setDrawingCacheQuality(524288);
        decorView.setDrawingCacheEnabled(true);
        decorView.buildDrawingCache();
        C6545xdc098dff fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment$MediaBrowserCompat$CustomActionResultReceiver = new C6545xdc098dff(this, activity.getApplicationContext(), decorView.getDrawingCache());
        this.PlaybackStateCompat$CustomAction = fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment$MediaBrowserCompat$CustomActionResultReceiver;
        fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment$MediaBrowserCompat$CustomActionResultReceiver.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public final void uncaughtException(Thread thread, Throwable th) {
                MyECouponActivity_ViewBinding.write("Error occurred during preparation of a fullscreen optimization. Unable to create blurred background.");
                th.printStackTrace();
            }
        });
        this.PlaybackStateCompat$CustomAction.start();
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver() {
        WeakReference<write> weakReference = this.MediaBrowserCompat$SearchResultReceiver;
        if (!(weakReference == null || weakReference.get() == null)) {
            this.MediaBrowserCompat$SearchResultReceiver.get().MediaBrowserCompat$ItemReceiver();
        }
        if (this.write != null) {
            this.write.MediaBrowserCompat$ItemReceiver(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        MediaBrowserCompat$ItemReceiver();
    }

    /* access modifiers changed from: package-private */
    public final void write() {
        MediaBrowserCompat$CustomActionResultReceiver((C6550x270b6bf5) null);
        this.write = null;
        this.MediaBrowserCompat$ItemReceiver.set(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap IconCompatParcelizer() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.ref.WeakReference<android.graphics.Bitmap> r0 = r1.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0017
            java.lang.ref.WeakReference<android.graphics.Bitmap> r0 = r1.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x001a }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0017
            java.lang.ref.WeakReference<android.graphics.Bitmap> r0 = r1.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x001a }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x001a }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x001a }
            monitor-exit(r1)
            return r0
        L_0x0017:
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x001a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment.IconCompatParcelizer():android.graphics.Bitmap");
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment) {
        if (fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment.read == null || fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment.read.get() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Internal SDK error: could not retrieve context for ");
            sb.append(fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment.getClass().getSimpleName());
            MyECouponActivity_ViewBinding.write(sb.toString());
            if (fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment.write != null) {
                fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment.write.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment);
                return;
            }
            return;
        }
        Context context = fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment.read.get();
        Intent intent = new Intent(context, FullScreenNotificationScreen.class);
        intent.addFlags(268435456);
        intent.addFlags(131072);
        context.startActivity(intent);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(C6552xadbb583e fragmentBuilder_BindHmlLandingFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        FragmentBuilder_BindHmlLandingFragment fragmentBuilder_BindHmlLandingFragment;
        if (this.f3144x50fd9e4a != null) {
            Iterator<FragmentBuilder_BindHmlLandingFragment> it = this.f3144x50fd9e4a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                fragmentBuilder_BindHmlLandingFragment = it.next();
                if (fragmentBuilder_BindHmlLandingFragment$MediaBrowserCompat$CustomActionResultReceiver.toString().equals(fragmentBuilder_BindHmlLandingFragment.write())) {
                    break;
                }
            }
        }
        fragmentBuilder_BindHmlLandingFragment = null;
        if (fragmentBuilder_BindHmlLandingFragment != null) {
            IconCompatParcelizer(fragmentBuilder_BindHmlLandingFragment);
            if (this.Keep != null) {
                this.Keep.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindHmlLandingFragment.IconCompatParcelizer(), this.RatingCompat, (FragmentBuilder_BindHmlNdidInstructionFragment) null);
            }
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        if (this.write != null) {
            this.write.MediaBrowserCompat$ItemReceiver(this);
        }
    }
}
