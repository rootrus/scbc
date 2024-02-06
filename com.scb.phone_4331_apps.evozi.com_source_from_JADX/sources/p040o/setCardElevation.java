package p040o;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: o.setCardElevation */
public abstract class setCardElevation extends onActivityCreated {
    private CardView IconCompatParcelizer = null;
    private ArrayList<Fragment.IconCompatParcelizer> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList<>();
    private ArrayList<Fragment> MediaBrowserCompat$ItemReceiver = new ArrayList<>();
    private Fragment read = null;
    private final setTitleMarginStart write;

    public abstract Fragment read(int i);

    public setCardElevation(setTitleMarginStart settitlemarginstart) {
        this.write = settitlemarginstart;
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
        Fragment.IconCompatParcelizer iconCompatParcelizer;
        Fragment fragment;
        if (this.MediaBrowserCompat$ItemReceiver.size() > i && (fragment = this.MediaBrowserCompat$ItemReceiver.get(i)) != null) {
            return fragment;
        }
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = this.write.read();
        }
        Fragment read2 = read(i);
        if (this.MediaBrowserCompat$CustomActionResultReceiver.size() > i && (iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.get(i)) != null) {
            read2.setInitialSavedState(iconCompatParcelizer);
        }
        while (this.MediaBrowserCompat$ItemReceiver.size() <= i) {
            this.MediaBrowserCompat$ItemReceiver.add((Object) null);
        }
        read2.setMenuVisibility(false);
        read2.setUserVisibleHint(false);
        this.MediaBrowserCompat$ItemReceiver.set(i, read2);
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(viewGroup.getId(), read2);
        return read2;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = this.write.read();
        }
        while (this.MediaBrowserCompat$CustomActionResultReceiver.size() <= i) {
            this.MediaBrowserCompat$CustomActionResultReceiver.add((Object) null);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.set(i, fragment.isAdded() ? this.write.write(fragment) : null);
        this.MediaBrowserCompat$ItemReceiver.set(i, (Object) null);
        this.IconCompatParcelizer.write(fragment);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.read;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.read.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.read = fragment;
        }
    }

    public void finishUpdate(ViewGroup viewGroup) {
        CardView cardView = this.IconCompatParcelizer;
        if (cardView != null) {
            cardView.MediaBrowserCompat$CustomActionResultReceiver();
            this.IconCompatParcelizer = null;
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public Parcelable saveState() {
        Bundle bundle;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.size() > 0) {
            bundle = new Bundle();
            Fragment.IconCompatParcelizer[] iconCompatParcelizerArr = new Fragment.IconCompatParcelizer[this.MediaBrowserCompat$CustomActionResultReceiver.size()];
            this.MediaBrowserCompat$CustomActionResultReceiver.toArray(iconCompatParcelizerArr);
            bundle.putParcelableArray("states", iconCompatParcelizerArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.MediaBrowserCompat$ItemReceiver.size(); i++) {
            Fragment fragment = this.MediaBrowserCompat$ItemReceiver.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("f");
                sb.append(i);
                this.write.read(bundle, sb.toString(), fragment);
            }
        }
        return bundle;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.MediaBrowserCompat$CustomActionResultReceiver.clear();
            this.MediaBrowserCompat$ItemReceiver.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.add((Fragment.IconCompatParcelizer) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment write2 = this.write.write(bundle, str);
                    if (write2 != null) {
                        while (this.MediaBrowserCompat$ItemReceiver.size() <= parseInt) {
                            this.MediaBrowserCompat$ItemReceiver.add((Object) null);
                        }
                        write2.setMenuVisibility(false);
                        this.MediaBrowserCompat$ItemReceiver.set(parseInt, write2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Bad fragment at key ");
                        sb.append(str);
                        Log.w("FragmentStatePagerAdapt", sb.toString());
                    }
                }
            }
        }
    }
}
