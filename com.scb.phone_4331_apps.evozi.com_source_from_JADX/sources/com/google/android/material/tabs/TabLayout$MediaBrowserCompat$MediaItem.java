package com.google.android.material.tabs;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class TabLayout$MediaBrowserCompat$MediaItem implements TabLayout$MediaBrowserCompat$ItemReceiver {
    private final ViewPager write;

    public TabLayout$MediaBrowserCompat$MediaItem(ViewPager viewPager) {
        this.write = viewPager;
    }

    public final void write(TabLayout.IconCompatParcelizer iconCompatParcelizer) {
        this.write.setCurrentItem(iconCompatParcelizer.read);
    }
}
