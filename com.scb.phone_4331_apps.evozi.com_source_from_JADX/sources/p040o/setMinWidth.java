package p040o;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.setMinWidth */
public final class setMinWidth {
    public final read IconCompatParcelizer = new read();
    public final List<View> MediaBrowserCompat$ItemReceiver = new ArrayList();
    public final setMinWidth$MediaBrowserCompat$CustomActionResultReceiver read;

    public setMinWidth(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver setminwidth_mediabrowsercompat_customactionresultreceiver) {
        this.read = setminwidth_mediabrowsercompat_customactionresultreceiver;
    }

    public final void read(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.read.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            i2 = MediaBrowserCompat$ItemReceiver(i);
        }
        this.IconCompatParcelizer.read(i2, z);
        if (z) {
            this.MediaBrowserCompat$ItemReceiver.add(view);
            this.read.IconCompatParcelizer(view);
        }
        this.read.MediaBrowserCompat$CustomActionResultReceiver(view, i2);
    }

    public final int MediaBrowserCompat$ItemReceiver(int i) {
        if (i < 0) {
            return -1;
        }
        int MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver();
        int i2 = i;
        while (i2 < MediaBrowserCompat$CustomActionResultReceiver) {
            int IconCompatParcelizer2 = i - (i2 - this.IconCompatParcelizer.IconCompatParcelizer(i2));
            if (IconCompatParcelizer2 == 0) {
                while (this.IconCompatParcelizer.write(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += IconCompatParcelizer2;
        }
        return -1;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
        int read2 = this.read.read(view);
        if (read2 >= 0) {
            if (this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(read2) && this.MediaBrowserCompat$ItemReceiver.remove(view)) {
                this.read.write(view);
            }
            this.read.IconCompatParcelizer(read2);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(i);
        View MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            if (this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2) && this.MediaBrowserCompat$ItemReceiver.remove(MediaBrowserCompat$CustomActionResultReceiver)) {
                this.read.write(MediaBrowserCompat$CustomActionResultReceiver);
            }
            this.read.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.read.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            i2 = MediaBrowserCompat$ItemReceiver(i);
        }
        this.IconCompatParcelizer.read(i2, z);
        if (z) {
            this.MediaBrowserCompat$ItemReceiver.add(view);
            this.read.IconCompatParcelizer(view);
        }
        this.read.MediaBrowserCompat$ItemReceiver(view, i2, layoutParams);
    }

    public final void write(int i) {
        int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(i);
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
        this.read.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2);
    }

    public final int MediaBrowserCompat$ItemReceiver(View view) {
        int read2 = this.read.read(view);
        if (read2 != -1 && !this.IconCompatParcelizer.write(read2)) {
            return read2 - this.IconCompatParcelizer.IconCompatParcelizer(read2);
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer.toString());
        sb.append(", hidden list:");
        sb.append(this.MediaBrowserCompat$ItemReceiver.size());
        return sb.toString();
    }

    /* renamed from: o.setMinWidth$read */
    public static class read {
        public read MediaBrowserCompat$ItemReceiver;
        public long write = 0;

        read() {
        }

        public final void read(int i) {
            read read = this;
            while (i >= 64) {
                read = read.MediaBrowserCompat$ItemReceiver;
                if (read != null) {
                    i -= 64;
                } else {
                    return;
                }
            }
            read.write &= ~(1 << i);
        }

        /* access modifiers changed from: package-private */
        public final int IconCompatParcelizer(int i) {
            read read = this.MediaBrowserCompat$ItemReceiver;
            if (read == null) {
                if (i >= 64) {
                    return Long.bitCount(this.write);
                }
                return Long.bitCount(this.write & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.write & ((1 << i) - 1));
            } else {
                return read.IconCompatParcelizer(i - 64) + Long.bitCount(this.write);
            }
        }

        public final String toString() {
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                return Long.toBinaryString(this.write);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaBrowserCompat$ItemReceiver.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.write));
            return sb.toString();
        }

        public final boolean write(int i) {
            read read = this;
            while (i >= 64) {
                if (read.MediaBrowserCompat$ItemReceiver == null) {
                    read.MediaBrowserCompat$ItemReceiver = new read();
                }
                read = read.MediaBrowserCompat$ItemReceiver;
                i -= 64;
            }
            return (read.write & (1 << i)) != 0;
        }

        /* access modifiers changed from: package-private */
        public final void read(int i, boolean z) {
            read read = this;
            while (true) {
                if (i >= 64) {
                    if (read.MediaBrowserCompat$ItemReceiver == null) {
                        read.MediaBrowserCompat$ItemReceiver = new read();
                    }
                    read = read.MediaBrowserCompat$ItemReceiver;
                    i -= 64;
                } else {
                    boolean z2 = (read.write & Long.MIN_VALUE) != 0;
                    long j = (1 << i) - 1;
                    long j2 = read.write;
                    read.write = (j2 & j) | (((~j) & j2) << 1);
                    if (z) {
                        read.MediaBrowserCompat$ItemReceiver(i);
                    } else {
                        read.read(i);
                    }
                    if (z2 || read.MediaBrowserCompat$ItemReceiver != null) {
                        if (read.MediaBrowserCompat$ItemReceiver == null) {
                            read.MediaBrowserCompat$ItemReceiver = new read();
                        }
                        read = read.MediaBrowserCompat$ItemReceiver;
                        i = 0;
                        z = z2;
                    } else {
                        return;
                    }
                }
            }
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver(int i) {
            read read = this;
            while (i >= 64) {
                if (read.MediaBrowserCompat$ItemReceiver == null) {
                    read.MediaBrowserCompat$ItemReceiver = new read();
                }
                read = read.MediaBrowserCompat$ItemReceiver;
                i -= 64;
            }
            long j = 1 << i;
            boolean z = (read.write & j) != 0;
            long j2 = read.write & (~j);
            read.write = j2;
            long j3 = j - 1;
            read.write = Long.rotateRight((~j3) & j2, 1) | (j3 & j2);
            read read2 = read.MediaBrowserCompat$ItemReceiver;
            if (read2 != null) {
                if (read2.write(0)) {
                    read.MediaBrowserCompat$ItemReceiver(63);
                }
                read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(0);
            }
            return z;
        }

        public final void MediaBrowserCompat$ItemReceiver(int i) {
            read read = this;
            while (i >= 64) {
                if (read.MediaBrowserCompat$ItemReceiver == null) {
                    read.MediaBrowserCompat$ItemReceiver = new read();
                }
                read = read.MediaBrowserCompat$ItemReceiver;
                i -= 64;
            }
            read.write |= 1 << i;
        }
    }
}
