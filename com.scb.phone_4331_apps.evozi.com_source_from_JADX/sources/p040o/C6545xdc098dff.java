package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

/* renamed from: o.FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment$MediaBrowserCompat$CustomActionResultReceiver */
class C6545xdc098dff extends Thread {
    private final Bitmap MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment MediaBrowserCompat$ItemReceiver;
    private final Context read;

    C6545xdc098dff(FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment, Context context, Bitmap bitmap) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment;
        this.read = context;
        this.MediaBrowserCompat$CustomActionResultReceiver = bitmap;
    }

    public final void run() {
        super.run();
        Bitmap write = FragmentBuilder_BindHmlBusinessAddressFragment.write(this.read, this.MediaBrowserCompat$CustomActionResultReceiver);
        if (!this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.get()) {
            FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment = this.MediaBrowserCompat$ItemReceiver;
            synchronized (fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment) {
                fragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(write);
            }
            FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
            return;
        }
        write.recycle();
    }
}
