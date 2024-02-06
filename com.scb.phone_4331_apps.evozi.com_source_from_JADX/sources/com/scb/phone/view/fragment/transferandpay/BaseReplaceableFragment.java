package com.scb.phone.view.fragment.transferandpay;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.CardView;
import p040o.setTitleMarginStart;

public abstract class BaseReplaceableFragment extends BaseFragment {
    private Fragment IconCompatParcelizer;

    /* access modifiers changed from: protected */
    public final void read(Fragment fragment, int i, String str, boolean z) {
        read(fragment, i, str, z, false);
    }

    /* access modifiers changed from: protected */
    public final void read(Fragment fragment, int i, String str, boolean z, boolean z2) {
        setTitleMarginStart childFragmentManager = getChildFragmentManager();
        CardView read = childFragmentManager.read();
        read.MediaBrowserCompat$SearchResultReceiver();
        Fragment findFragmentByTag = childFragmentManager.findFragmentByTag(str);
        if (findFragmentByTag == null) {
            read.write(i, fragment, str);
            findFragmentByTag = fragment;
        } else if (z2) {
            read.write(findFragmentByTag);
            read.write(i, fragment, str);
        } else {
            read.IconCompatParcelizer(findFragmentByTag);
        }
        if (z) {
            if (!z2) {
                fragment = findFragmentByTag;
            }
            this.IconCompatParcelizer = fragment;
        }
        read.write();
    }

    public void aA_() {
        PlaybackStateCompat$CustomAction();
        if (this.IconCompatParcelizer != null) {
            CardView read = getChildFragmentManager().read();
            read.MediaBrowserCompat$SearchResultReceiver();
            read.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
            read.write();
        }
        this.IconCompatParcelizer = null;
    }
}
