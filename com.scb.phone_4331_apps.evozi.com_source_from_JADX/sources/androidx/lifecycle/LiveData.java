package androidx.lifecycle;

import java.util.Map;
import p040o.ActivityChooserView;
import p040o.createCount;
import p040o.entryRemoved;
import p040o.maxSize;
import p040o.putCount;
import p040o.setExpandActivityOverflowButtonContentDescription;

public abstract class LiveData<T> {
    public static final Object MediaBrowserCompat$ItemReceiver = new Object();
    final Object IconCompatParcelizer = new Object();
    public volatile Object MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver;
    private final Runnable MediaBrowserCompat$MediaItem = new Runnable() {
        public final void run() {
            Object obj;
            synchronized (LiveData.this.IconCompatParcelizer) {
                obj = LiveData.this.read;
                LiveData.this.read = LiveData.MediaBrowserCompat$ItemReceiver;
            }
            LiveData.this.MediaBrowserCompat$CustomActionResultReceiver(obj);
        }
    };
    private int MediaBrowserCompat$SearchResultReceiver = -1;
    private boolean MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private ActivityChooserView.InnerLayout<putCount<? super T>, LiveData<T>.IconCompatParcelizer> RatingCompat = new ActivityChooserView.InnerLayout<>();
    volatile Object read = MediaBrowserCompat$ItemReceiver;
    public int write = 0;

    /* access modifiers changed from: protected */
    public void read() {
    }

    /* access modifiers changed from: protected */
    public void write() {
    }

    private void MediaBrowserCompat$ItemReceiver(LiveData<T>.IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer.write) {
            if (!iconCompatParcelizer.MediaBrowserCompat$ItemReceiver()) {
                iconCompatParcelizer.read(false);
                return;
            }
            int i = iconCompatParcelizer.IconCompatParcelizer;
            int i2 = this.MediaBrowserCompat$SearchResultReceiver;
            if (i < i2) {
                iconCompatParcelizer.IconCompatParcelizer = i2;
                iconCompatParcelizer.read.write(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(LiveData<T>.IconCompatParcelizer iconCompatParcelizer) {
        if (this.MediaDescriptionCompat) {
            this.MediaMetadataCompat = true;
            return;
        }
        this.MediaDescriptionCompat = true;
        do {
            this.MediaMetadataCompat = false;
            if (iconCompatParcelizer == null) {
                ActivityChooserView.InnerLayout<putCount<? super T>, LiveData<T>.IconCompatParcelizer> innerLayout = this.RatingCompat;
                ActivityChooserView.InnerLayout.write write2 = new ActivityChooserView.InnerLayout.write();
                innerLayout.IconCompatParcelizer.put(write2, Boolean.FALSE);
                while (write2.hasNext()) {
                    MediaBrowserCompat$ItemReceiver((IconCompatParcelizer) ((Map.Entry) write2.next()).getValue());
                    if (this.MediaMetadataCompat) {
                        break;
                    }
                }
            } else {
                MediaBrowserCompat$ItemReceiver(iconCompatParcelizer);
                iconCompatParcelizer = null;
            }
        } while (this.MediaMetadataCompat);
        this.MediaDescriptionCompat = false;
    }

    public final void MediaBrowserCompat$ItemReceiver(maxSize maxsize, putCount<? super T> putcount) {
        write("observe");
        if (maxsize.getLifecycle().read() != entryRemoved.read.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(maxsize, putcount);
            IconCompatParcelizer IconCompatParcelizer2 = this.RatingCompat.IconCompatParcelizer(putcount, lifecycleBoundObserver);
            if (IconCompatParcelizer2 != null && !IconCompatParcelizer2.write(maxsize)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (IconCompatParcelizer2 == null) {
                maxsize.getLifecycle().IconCompatParcelizer(lifecycleBoundObserver);
            }
        }
    }

    public void write(putCount<? super T> putcount) {
        write("removeObserver");
        IconCompatParcelizer read2 = this.RatingCompat.read(putcount);
        if (read2 != null) {
            read2.write();
            read2.read(false);
        }
    }

    public void IconCompatParcelizer(T t) {
        boolean z;
        synchronized (this.IconCompatParcelizer) {
            z = this.read == MediaBrowserCompat$ItemReceiver;
            this.read = t;
        }
        if (z) {
            setExpandActivityOverflowButtonContentDescription.read().write.read(this.MediaBrowserCompat$MediaItem);
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        write("setValue");
        this.MediaBrowserCompat$SearchResultReceiver++;
        this.MediaBrowserCompat$CustomActionResultReceiver = t;
        read((LiveData<T>.IconCompatParcelizer) null);
    }

    class LifecycleBoundObserver extends LiveData<T>.IconCompatParcelizer implements createCount {
        final maxSize MediaBrowserCompat$ItemReceiver;

        LifecycleBoundObserver(maxSize maxsize, putCount<? super T> putcount) {
            super(putcount);
            this.MediaBrowserCompat$ItemReceiver = maxsize;
        }

        /* access modifiers changed from: package-private */
        public final boolean MediaBrowserCompat$ItemReceiver() {
            return this.MediaBrowserCompat$ItemReceiver.getLifecycle().read().compareTo(entryRemoved.read.STARTED) >= 0;
        }

        public final void MediaBrowserCompat$ItemReceiver(maxSize maxsize, entryRemoved.write write) {
            if (this.MediaBrowserCompat$ItemReceiver.getLifecycle().read() == entryRemoved.read.DESTROYED) {
                LiveData.this.write(this.read);
            } else {
                read(this.MediaBrowserCompat$ItemReceiver.getLifecycle().read().compareTo(entryRemoved.read.STARTED) >= 0);
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean write(maxSize maxsize) {
            return this.MediaBrowserCompat$ItemReceiver == maxsize;
        }

        /* access modifiers changed from: package-private */
        public final void write() {
            this.MediaBrowserCompat$ItemReceiver.getLifecycle().MediaBrowserCompat$ItemReceiver(this);
        }
    }

    abstract class IconCompatParcelizer {
        int IconCompatParcelizer = -1;
        final putCount<? super T> read;
        boolean write;

        /* access modifiers changed from: package-private */
        public abstract boolean MediaBrowserCompat$ItemReceiver();

        /* access modifiers changed from: package-private */
        public void write() {
        }

        /* access modifiers changed from: package-private */
        public boolean write(maxSize maxsize) {
            return false;
        }

        IconCompatParcelizer(putCount<? super T> putcount) {
            this.read = putcount;
        }

        /* access modifiers changed from: package-private */
        public final void read(boolean z) {
            if (z != this.write) {
                this.write = z;
                int i = 1;
                boolean z2 = LiveData.this.write == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.write;
                if (!this.write) {
                    i = -1;
                }
                liveData.write = i2 + i;
                if (z2 && this.write) {
                    LiveData.this.write();
                }
                if (LiveData.this.write == 0 && !this.write) {
                    LiveData.this.read();
                }
                if (this.write) {
                    LiveData.this.read(this);
                }
            }
        }
    }

    private static void write(String str) {
        if (!setExpandActivityOverflowButtonContentDescription.read().write.write()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background");
            sb.append(" thread");
            throw new IllegalStateException(sb.toString());
        }
    }
}
