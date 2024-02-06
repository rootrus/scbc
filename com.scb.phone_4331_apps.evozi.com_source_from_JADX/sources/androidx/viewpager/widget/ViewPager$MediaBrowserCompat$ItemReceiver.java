package androidx.viewpager.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p040o.setIconifiedByDefault;
import p040o.setTextOn;

class ViewPager$MediaBrowserCompat$ItemReceiver extends setIconifiedByDefault {
    final /* synthetic */ ViewPager MediaBrowserCompat$ItemReceiver;

    ViewPager$MediaBrowserCompat$ItemReceiver(ViewPager viewPager) {
        this.MediaBrowserCompat$ItemReceiver = viewPager;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(View view, AccessibilityEvent accessibilityEvent) {
        super.MediaBrowserCompat$CustomActionResultReceiver(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        boolean z = true;
        if (this.MediaBrowserCompat$ItemReceiver.mAdapter == null || this.MediaBrowserCompat$ItemReceiver.mAdapter.getCount() <= 1) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        if (accessibilityEvent.getEventType() == 4096 && this.MediaBrowserCompat$ItemReceiver.mAdapter != null) {
            accessibilityEvent.setItemCount(this.MediaBrowserCompat$ItemReceiver.mAdapter.getCount());
            accessibilityEvent.setFromIndex(this.MediaBrowserCompat$ItemReceiver.mCurItem);
            accessibilityEvent.setToIndex(this.MediaBrowserCompat$ItemReceiver.mCurItem);
        }
    }

    public final void IconCompatParcelizer(View view, setTextOn settexton) {
        super.IconCompatParcelizer(view, settexton);
        settexton.write((CharSequence) ViewPager.class.getName());
        settexton.MediaSessionCompat$ResultReceiverWrapper(this.MediaBrowserCompat$ItemReceiver.mAdapter != null && this.MediaBrowserCompat$ItemReceiver.mAdapter.getCount() > 1);
        if (this.MediaBrowserCompat$ItemReceiver.canScrollHorizontally(1)) {
            settexton.read(4096);
        }
        if (this.MediaBrowserCompat$ItemReceiver.canScrollHorizontally(-1)) {
            settexton.read(8192);
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver(View view, int i, Bundle bundle) {
        if (super.MediaBrowserCompat$ItemReceiver(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.MediaBrowserCompat$ItemReceiver.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager = this.MediaBrowserCompat$ItemReceiver;
            viewPager.setCurrentItem(viewPager.mCurItem - 1);
            return true;
        } else if (!this.MediaBrowserCompat$ItemReceiver.canScrollHorizontally(1)) {
            return false;
        } else {
            ViewPager viewPager2 = this.MediaBrowserCompat$ItemReceiver;
            viewPager2.setCurrentItem(viewPager2.mCurItem + 1);
            return true;
        }
    }
}
