package p040o;

import java.io.File;
import java.util.List;
import p040o.onCreateOptionsMenu;
import p040o.onResume;

/* renamed from: o.onViewStateRestored */
final class onViewStateRestored implements onResume, onCreateOptionsMenu.IconCompatParcelizer<Object> {
    private volatile C1536x6a517a85<?> IconCompatParcelizer;
    private final peekChildFragmentManager<?> MediaBrowserCompat$CustomActionResultReceiver;
    private final List<isStateSaved> MediaBrowserCompat$ItemReceiver;
    private List<setSharedElementEnterTransition<File, ?>> MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;
    private isStateSaved MediaMetadataCompat;
    private int RatingCompat;
    private final onResume.read read;
    private File write;

    onViewStateRestored(peekChildFragmentManager<?> peekchildfragmentmanager, onResume.read read2) {
        this(peekchildfragmentmanager.MediaBrowserCompat$CustomActionResultReceiver(), peekchildfragmentmanager, read2);
    }

    onViewStateRestored(List<isStateSaved> list, peekChildFragmentManager<?> peekchildfragmentmanager, onResume.read read2) {
        this.MediaBrowserCompat$SearchResultReceiver = -1;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = peekchildfragmentmanager;
        this.read = read2;
    }

    public final boolean write() {
        while (true) {
            List<setSharedElementEnterTransition<File, ?>> list = this.MediaBrowserCompat$MediaItem;
            if (list != null) {
                if (this.RatingCompat < list.size()) {
                    this.IconCompatParcelizer = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.RatingCompat < this.MediaBrowserCompat$MediaItem.size())) {
                            break;
                        }
                        List<setSharedElementEnterTransition<File, ?>> list2 = this.MediaBrowserCompat$MediaItem;
                        int i = this.RatingCompat;
                        this.RatingCompat = i + 1;
                        this.IconCompatParcelizer = list2.get(i).IconCompatParcelizer(this.write, this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat);
                        if (this.IconCompatParcelizer != null) {
                            peekChildFragmentManager<?> peekchildfragmentmanager = this.MediaBrowserCompat$CustomActionResultReceiver;
                            if (peekchildfragmentmanager.write.MediaMetadataCompat.read(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write(), peekchildfragmentmanager.MediaBrowserCompat$SearchResultReceiver, peekchildfragmentmanager.ParcelableVolumeInfo) != null) {
                                this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat, this);
                                z = true;
                            }
                        }
                    }
                    return z;
                }
            }
            int i2 = this.MediaBrowserCompat$SearchResultReceiver + 1;
            this.MediaBrowserCompat$SearchResultReceiver = i2;
            if (i2 >= this.MediaBrowserCompat$ItemReceiver.size()) {
                return false;
            }
            isStateSaved isstatesaved = this.MediaBrowserCompat$ItemReceiver.get(this.MediaBrowserCompat$SearchResultReceiver);
            File write2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.write().write(new performActivityCreated(isstatesaved, this.MediaBrowserCompat$CustomActionResultReceiver.f2615x50fd9e4a));
            this.write = write2;
            if (write2 != null) {
                this.MediaMetadataCompat = isstatesaved;
                this.MediaBrowserCompat$MediaItem = this.MediaBrowserCompat$CustomActionResultReceiver.write.MediaMetadataCompat.read(write2);
                this.RatingCompat = 0;
            }
        }
    }

    public final void read() {
        C1536x6a517a85<?> setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
        if (setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver != null) {
            setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void read(Object obj) {
        this.read.read(this.MediaMetadataCompat, obj, this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver, isPostponed.DATA_DISK_CACHE, this.MediaMetadataCompat);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
        this.read.write(this.MediaMetadataCompat, exc, this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver, isPostponed.DATA_DISK_CACHE);
    }
}
