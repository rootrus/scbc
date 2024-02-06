package p040o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.ListMenuItemView */
public class ListMenuItemView {
    private boolean IconCompatParcelizer;
    final ArrayList<setSwitchPadding> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList<>();
    private long MediaBrowserCompat$ItemReceiver = -1;
    private final setSwitchMinWidth MediaMetadataCompat = new setSwitchMinWidth() {
        private boolean MediaBrowserCompat$ItemReceiver = false;
        private int write = 0;

        public void write(View view) {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = true;
                if (ListMenuItemView.this.read != null) {
                    ListMenuItemView.this.read.write((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void read() {
            this.write = 0;
            this.MediaBrowserCompat$ItemReceiver = false;
            ListMenuItemView.this.write();
        }

        public void MediaBrowserCompat$ItemReceiver(View view) {
            int i = this.write + 1;
            this.write = i;
            if (i == ListMenuItemView.this.MediaBrowserCompat$CustomActionResultReceiver.size()) {
                if (ListMenuItemView.this.read != null) {
                    ListMenuItemView.this.read.MediaBrowserCompat$ItemReceiver((View) null);
                }
                read();
            }
        }
    };
    setSwitchTypeface read;
    private Interpolator write;

    public ListMenuItemView IconCompatParcelizer(setSwitchPadding setswitchpadding) {
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver.add(setswitchpadding);
        }
        return this;
    }

    public ListMenuItemView write(setSwitchPadding setswitchpadding, setSwitchPadding setswitchpadding2) {
        this.MediaBrowserCompat$CustomActionResultReceiver.add(setswitchpadding);
        setswitchpadding2.MediaBrowserCompat$CustomActionResultReceiver(setswitchpadding.MediaBrowserCompat$CustomActionResultReceiver());
        this.MediaBrowserCompat$CustomActionResultReceiver.add(setswitchpadding2);
        return this;
    }

    public void read() {
        if (!this.IconCompatParcelizer) {
            Iterator<setSwitchPadding> it = this.MediaBrowserCompat$CustomActionResultReceiver.iterator();
            while (it.hasNext()) {
                setSwitchPadding next = it.next();
                long j = this.MediaBrowserCompat$ItemReceiver;
                if (j >= 0) {
                    next.MediaBrowserCompat$ItemReceiver(j);
                }
                Interpolator interpolator = this.write;
                if (interpolator != null) {
                    next.MediaBrowserCompat$CustomActionResultReceiver(interpolator);
                }
                if (this.read != null) {
                    next.read((setSwitchTypeface) this.MediaMetadataCompat);
                }
                next.write();
            }
            this.IconCompatParcelizer = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void write() {
        this.IconCompatParcelizer = false;
    }

    public void MediaBrowserCompat$ItemReceiver() {
        if (this.IconCompatParcelizer) {
            Iterator<setSwitchPadding> it = this.MediaBrowserCompat$CustomActionResultReceiver.iterator();
            while (it.hasNext()) {
                it.next().read();
            }
            this.IconCompatParcelizer = false;
        }
    }

    public ListMenuItemView MediaBrowserCompat$CustomActionResultReceiver(long j) {
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$ItemReceiver = j;
        }
        return this;
    }

    public ListMenuItemView IconCompatParcelizer(Interpolator interpolator) {
        if (!this.IconCompatParcelizer) {
            this.write = interpolator;
        }
        return this;
    }

    public ListMenuItemView write(setSwitchTypeface setswitchtypeface) {
        if (!this.IconCompatParcelizer) {
            this.read = setswitchtypeface;
        }
        return this;
    }
}
