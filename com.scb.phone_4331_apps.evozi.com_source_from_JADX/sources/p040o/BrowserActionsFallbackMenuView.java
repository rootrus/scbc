package p040o;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: o.BrowserActionsFallbackMenuView */
public abstract class BrowserActionsFallbackMenuView extends onActivityCreated {
    private Fragment IconCompatParcelizer = null;
    private final setTitleMarginStart MediaBrowserCompat$ItemReceiver;
    private CardView write = null;

    public abstract Fragment MediaBrowserCompat$CustomActionResultReceiver(int i);

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public BrowserActionsFallbackMenuView(setTitleMarginStart settitlemarginstart) {
        this.MediaBrowserCompat$ItemReceiver = settitlemarginstart;
    }

    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.write == null) {
            this.write = this.MediaBrowserCompat$ItemReceiver.read();
        }
        long j = (long) i;
        Fragment findFragmentByTag = this.MediaBrowserCompat$ItemReceiver.findFragmentByTag(MediaBrowserCompat$ItemReceiver(viewGroup.getId(), j));
        if (findFragmentByTag != null) {
            this.write.read(findFragmentByTag);
        } else {
            findFragmentByTag = MediaBrowserCompat$CustomActionResultReceiver(i);
            this.write.write(viewGroup.getId(), findFragmentByTag, MediaBrowserCompat$ItemReceiver(viewGroup.getId(), j));
        }
        if (findFragmentByTag != this.IconCompatParcelizer) {
            findFragmentByTag.setMenuVisibility(false);
            findFragmentByTag.setUserVisibleHint(false);
        }
        return findFragmentByTag;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.write == null) {
            this.write = this.MediaBrowserCompat$ItemReceiver.read();
        }
        this.write.MediaBrowserCompat$CustomActionResultReceiver((Fragment) obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.IconCompatParcelizer;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.IconCompatParcelizer.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.IconCompatParcelizer = fragment;
        }
    }

    public void finishUpdate(ViewGroup viewGroup) {
        CardView cardView = this.write;
        if (cardView != null) {
            cardView.MediaBrowserCompat$CustomActionResultReceiver();
            this.write = null;
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    private static String MediaBrowserCompat$ItemReceiver(int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }
}
