package p040o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p040o.performContextItemSelected;

/* renamed from: o.peekChildFragmentManager */
final class peekChildFragmentManager<Transcode> {
    private boolean AlertController$RecycleListView;
    boolean IconCompatParcelizer;
    private boolean Keep;
    int MediaBrowserCompat$CustomActionResultReceiver;
    performContextItemSelected.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    boolean MediaBrowserCompat$MediaItem;
    Class<?> MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    isStateSaved f2615x50fd9e4a;
    onActivityResult MediaDescriptionCompat;
    Object MediaMetadataCompat;
    private final List<isStateSaved> MediaSessionCompat$QueueItem = new ArrayList();
    Map<Class<?>, onCreateAnimation<?>> MediaSessionCompat$ResultReceiverWrapper;
    int MediaSessionCompat$Token;
    Class<Transcode> ParcelableVolumeInfo;
    hasOptionsMenu RatingCompat;
    performCreate read;
    private final List<C1536x6a517a85<?>> setHasDecor = new ArrayList();
    getView write;

    peekChildFragmentManager() {
    }

    /* access modifiers changed from: package-private */
    public final void write() {
        this.write = null;
        this.MediaMetadataCompat = null;
        this.f2615x50fd9e4a = null;
        this.MediaBrowserCompat$SearchResultReceiver = null;
        this.ParcelableVolumeInfo = null;
        this.MediaDescriptionCompat = null;
        this.RatingCompat = null;
        this.MediaSessionCompat$ResultReceiverWrapper = null;
        this.read = null;
        this.setHasDecor.clear();
        this.Keep = false;
        this.MediaSessionCompat$QueueItem.clear();
        this.AlertController$RecycleListView = false;
    }

    /* access modifiers changed from: package-private */
    public final <Z> onCreateAnimation<Z> MediaBrowserCompat$ItemReceiver(Class<Z> cls) {
        onCreateAnimation<Z> oncreateanimation = this.MediaSessionCompat$ResultReceiverWrapper.get(cls);
        if (oncreateanimation == null) {
            Iterator<Map.Entry<Class<?>, onCreateAnimation<?>>> it = this.MediaSessionCompat$ResultReceiverWrapper.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    oncreateanimation = (onCreateAnimation) next.getValue();
                    break;
                }
            }
        }
        if (oncreateanimation != null) {
            return oncreateanimation;
        }
        if (!this.MediaSessionCompat$ResultReceiverWrapper.isEmpty() || !this.MediaBrowserCompat$MediaItem) {
            return checkForValidRequestCode.MediaBrowserCompat$ItemReceiver();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Missing transformation for ");
        sb.append(cls);
        sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final List<C1536x6a517a85<?>> IconCompatParcelizer() {
        if (!this.Keep) {
            this.Keep = true;
            this.setHasDecor.clear();
            List read2 = this.write.MediaMetadataCompat.read(this.MediaMetadataCompat);
            int size = read2.size();
            for (int i = 0; i < size; i++) {
                C1536x6a517a85 IconCompatParcelizer2 = ((setSharedElementEnterTransition) read2.get(i)).IconCompatParcelizer(this.MediaMetadataCompat, this.MediaSessionCompat$Token, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaDescriptionCompat);
                if (IconCompatParcelizer2 != null) {
                    this.setHasDecor.add(IconCompatParcelizer2);
                }
            }
        }
        return this.setHasDecor;
    }

    /* access modifiers changed from: package-private */
    public final List<isStateSaved> MediaBrowserCompat$CustomActionResultReceiver() {
        if (!this.AlertController$RecycleListView) {
            this.AlertController$RecycleListView = true;
            this.MediaSessionCompat$QueueItem.clear();
            List<C1536x6a517a85<?>> IconCompatParcelizer2 = IconCompatParcelizer();
            int size = IconCompatParcelizer2.size();
            for (int i = 0; i < size; i++) {
                C1536x6a517a85 setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver = IconCompatParcelizer2.get(i);
                if (!this.MediaSessionCompat$QueueItem.contains(setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver.read)) {
                    this.MediaSessionCompat$QueueItem.add(setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver.read);
                }
                for (int i2 = 0; i2 < setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver.write.size(); i2++) {
                    if (!this.MediaSessionCompat$QueueItem.contains(setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver.write.get(i2))) {
                        this.MediaSessionCompat$QueueItem.add(setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver.write.get(i2));
                    }
                }
            }
        }
        return this.MediaSessionCompat$QueueItem;
    }

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer(Class<?> cls) {
        return this.write.MediaMetadataCompat.read(cls, this.MediaBrowserCompat$SearchResultReceiver, this.ParcelableVolumeInfo) != null;
    }
}
