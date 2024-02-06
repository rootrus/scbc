package p040o;

import com.bumptech.glide.Registry;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040o.onCreateOptionsMenu;
import p040o.onResume;

/* renamed from: o.performMultiWindowModeChanged */
final class performMultiWindowModeChanged implements onResume, onCreateOptionsMenu.IconCompatParcelizer<Object> {
    private final peekChildFragmentManager<?> IconCompatParcelizer;
    private performOptionsItemSelected MediaBrowserCompat$CustomActionResultReceiver;
    private File MediaBrowserCompat$ItemReceiver;
    private List<setSharedElementEnterTransition<File, ?>> MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;
    private int MediaDescriptionCompat = -1;
    private int MediaMetadataCompat;
    private isStateSaved RatingCompat;
    private volatile C1536x6a517a85<?> read;
    private final onResume.read write;

    performMultiWindowModeChanged(peekChildFragmentManager<?> peekchildfragmentmanager, onResume.read read2) {
        this.IconCompatParcelizer = peekchildfragmentmanager;
        this.write = read2;
    }

    public final boolean write() {
        List<isStateSaved> MediaBrowserCompat$CustomActionResultReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2.isEmpty()) {
            return false;
        }
        peekChildFragmentManager<?> peekchildfragmentmanager = this.IconCompatParcelizer;
        Registry registry = peekchildfragmentmanager.write.MediaMetadataCompat;
        Class<?> cls = peekchildfragmentmanager.MediaMetadataCompat.getClass();
        Class<?> cls2 = peekchildfragmentmanager.MediaBrowserCompat$SearchResultReceiver;
        Class<Transcode> cls3 = peekchildfragmentmanager.ParcelableVolumeInfo;
        List<Class<?>> write2 = registry.RatingCompat.write(cls, cls2, cls3);
        if (write2 == null) {
            write2 = new ArrayList<>();
            for (Class<?> MediaBrowserCompat$ItemReceiver2 : registry.IconCompatParcelizer.read(cls)) {
                for (Class next : registry.write.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2, cls2)) {
                    if (!registry.MediaDescriptionCompat.read(next, cls3).isEmpty() && !write2.contains(next)) {
                        write2.add(next);
                    }
                }
            }
            getActivity$MediaBrowserCompat$CustomActionResultReceiver getactivity_mediabrowsercompat_customactionresultreceiver = registry.RatingCompat;
            List<T> unmodifiableList = Collections.unmodifiableList(write2);
            synchronized (getactivity_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer) {
                getactivity_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.put(new getAnimator$MediaBrowserCompat$ItemReceiver(cls, cls2, cls3), unmodifiableList);
            }
        }
        if (!write2.isEmpty()) {
            while (true) {
                List<setSharedElementEnterTransition<File, ?>> list = this.MediaBrowserCompat$MediaItem;
                if (list != null) {
                    if (this.MediaBrowserCompat$SearchResultReceiver < list.size()) {
                        this.read = null;
                        boolean z = false;
                        while (!z) {
                            if (!(this.MediaBrowserCompat$SearchResultReceiver < this.MediaBrowserCompat$MediaItem.size())) {
                                break;
                            }
                            List<setSharedElementEnterTransition<File, ?>> list2 = this.MediaBrowserCompat$MediaItem;
                            int i = this.MediaBrowserCompat$SearchResultReceiver;
                            this.MediaBrowserCompat$SearchResultReceiver = i + 1;
                            this.read = list2.get(i).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer.MediaSessionCompat$Token, this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer.MediaDescriptionCompat);
                            if (this.read != null && this.IconCompatParcelizer.IconCompatParcelizer(this.read.MediaBrowserCompat$ItemReceiver.write())) {
                                this.read.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.IconCompatParcelizer.RatingCompat, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                }
                int i2 = this.MediaDescriptionCompat + 1;
                this.MediaDescriptionCompat = i2;
                if (i2 >= write2.size()) {
                    int i3 = this.MediaMetadataCompat + 1;
                    this.MediaMetadataCompat = i3;
                    if (i3 >= MediaBrowserCompat$CustomActionResultReceiver2.size()) {
                        return false;
                    }
                    this.MediaDescriptionCompat = 0;
                }
                isStateSaved isstatesaved = MediaBrowserCompat$CustomActionResultReceiver2.get(this.MediaMetadataCompat);
                Class cls4 = write2.get(this.MediaDescriptionCompat);
                this.MediaBrowserCompat$CustomActionResultReceiver = new performOptionsItemSelected(this.IconCompatParcelizer.write.write, isstatesaved, this.IconCompatParcelizer.f2615x50fd9e4a, this.IconCompatParcelizer.MediaSessionCompat$Token, this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(cls4), cls4, this.IconCompatParcelizer.MediaDescriptionCompat);
                File write3 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write().write(this.MediaBrowserCompat$CustomActionResultReceiver);
                this.MediaBrowserCompat$ItemReceiver = write3;
                if (write3 != null) {
                    this.RatingCompat = isstatesaved;
                    this.MediaBrowserCompat$MediaItem = this.IconCompatParcelizer.write.MediaMetadataCompat.read(write3);
                    this.MediaBrowserCompat$SearchResultReceiver = 0;
                }
            }
        } else if (File.class.equals(this.IconCompatParcelizer.ParcelableVolumeInfo)) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any load path from ");
            sb.append(this.IconCompatParcelizer.MediaMetadataCompat.getClass());
            sb.append(" to ");
            sb.append(this.IconCompatParcelizer.ParcelableVolumeInfo);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void read() {
        C1536x6a517a85<?> setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver = this.read;
        if (setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver != null) {
            setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void read(Object obj) {
        this.write.read(this.RatingCompat, obj, this.read.MediaBrowserCompat$ItemReceiver, isPostponed.RESOURCE_DISK_CACHE, this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
        this.write.write(this.MediaBrowserCompat$CustomActionResultReceiver, exc, this.read.MediaBrowserCompat$ItemReceiver, isPostponed.RESOURCE_DISK_CACHE);
    }
}
