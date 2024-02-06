package p040o;

import android.content.Intent;
import com.scb.phone.view.fragment.demo.ntb.NTBLifestyleLandingFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.getBusinessProfileInfo */
final class getBusinessProfileInfo {
    /* access modifiers changed from: private */
    public static final String[] IconCompatParcelizer = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    static void MediaBrowserCompat$CustomActionResultReceiver(NTBLifestyleLandingFragment nTBLifestyleLandingFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(nTBLifestyleLandingFragment.requireActivity(), IconCompatParcelizer)) {
            nTBLifestyleLandingFragment.ExpandedMenuView();
            return;
        }
        new write(nTBLifestyleLandingFragment, (Intent) null, (byte) 0);
        nTBLifestyleLandingFragment.requestPermissions(IconCompatParcelizer, 37);
    }

    /* renamed from: o.getBusinessProfileInfo$write */
    static final class write implements HistoryAdapter$GroupFooterViewHolder {
        private final WeakReference<NTBLifestyleLandingFragment> MediaBrowserCompat$ItemReceiver;

        public final void read() {
        }

        /* synthetic */ write(NTBLifestyleLandingFragment nTBLifestyleLandingFragment, Intent intent, byte b) {
            this(nTBLifestyleLandingFragment, (Intent) null);
        }

        private write(NTBLifestyleLandingFragment nTBLifestyleLandingFragment, Intent intent) {
            this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(nTBLifestyleLandingFragment);
        }

        public final void write() {
            NTBLifestyleLandingFragment nTBLifestyleLandingFragment = this.MediaBrowserCompat$ItemReceiver.get();
            if (nTBLifestyleLandingFragment != null) {
                nTBLifestyleLandingFragment.requestPermissions(getBusinessProfileInfo.IconCompatParcelizer, 37);
            }
        }

        public final void IconCompatParcelizer() {
            NTBLifestyleLandingFragment nTBLifestyleLandingFragment = this.MediaBrowserCompat$ItemReceiver.get();
            if (nTBLifestyleLandingFragment != null) {
                nTBLifestyleLandingFragment.ExpandedMenuView();
            }
        }
    }
}
