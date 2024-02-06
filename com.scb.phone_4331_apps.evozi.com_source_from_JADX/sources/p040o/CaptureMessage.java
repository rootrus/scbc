package p040o;

import java.util.Arrays;
import java.util.List;
import p040o.AbstractMapBasedMultiset;
import p040o.PassportWorkflowActivity;

/* renamed from: o.CaptureMessage */
public class CaptureMessage extends writeUInt64NoTag<PassportWorkflowActivity.C6985a> {
    public static final List<String> IconCompatParcelizer = Arrays.asList(new String[]{"ซอย", "ซ."});
    public static final List<String> MediaBrowserCompat$ItemReceiver = Arrays.asList(new String[]{"ชั้น"});
    public static final List<String> MediaBrowserCompat$MediaItem = Arrays.asList(new String[]{"หมู่บ้าน", "อาคาร", "มบ.", "อ."});
    public static final List<String> MediaBrowserCompat$SearchResultReceiver = Arrays.asList(new String[]{"ถนน", "ถ."});
    public static final List<String> MediaMetadataCompat = Arrays.asList(new String[]{"ห้อง"});
    public static final List<String> read = Arrays.asList(new String[]{"เลข", "บ้าน"});
    public static final List<String> write = Arrays.asList(new String[]{"หมู่", "ม."});
    public String MediaDescriptionCompat;
    public InstallException MediaSessionCompat$QueueItem;
    public ResponseParser ParcelableVolumeInfo;

    /* renamed from: o.CaptureMessage$KUIMessageOrientation */
    public class KUIMessageOrientation extends writeUInt64NoTag<getImageProcessingListener> {
        private final AbstractMapBasedMultiset.EntrySet.C30061.C30071 IconCompatParcelizer;
        public String read;
        final toLongArray write;

        @HmlPinActivity
        public KUIMessageOrientation(RegularImmutableBiMap regularImmutableBiMap, AbstractMapBasedMultiset.EntrySet.C30061.C30071 r2, toLongArray tolongarray) {
            super(regularImmutableBiMap);
            this.IconCompatParcelizer = r2;
            this.write = tolongarray;
        }

        public void onDestroy() {
            AbstractMapBasedMultiset.EntrySet.C30061.C30071 r0 = this.IconCompatParcelizer;
            if (!r0.MediaBrowserCompat$MediaItem.isDisposed()) {
                r0.MediaBrowserCompat$MediaItem.dispose();
            }
            super.onDestroy();
        }
    }

    @HmlPinActivity
    public CaptureMessage(RegularImmutableBiMap regularImmutableBiMap, InstallException installException) {
        super(regularImmutableBiMap);
        this.MediaSessionCompat$QueueItem = installException;
    }

    public void onDestroy() {
        InstallException installException = this.MediaSessionCompat$QueueItem;
        if (!installException.MediaBrowserCompat$MediaItem.isDisposed()) {
            installException.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public valueType write() {
        String str = null;
        String str2 = this.ParcelableVolumeInfo.MediaSessionCompat$QueueItem.isEmpty() ? null : this.ParcelableVolumeInfo.MediaSessionCompat$QueueItem;
        String str3 = this.ParcelableVolumeInfo.f2778x50fd9e4a.isEmpty() ? null : this.ParcelableVolumeInfo.f2778x50fd9e4a;
        String str4 = this.ParcelableVolumeInfo.MediaBrowserCompat$MediaItem.isEmpty() ? null : this.ParcelableVolumeInfo.MediaBrowserCompat$MediaItem;
        String str5 = this.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver.isEmpty() ? null : this.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver;
        String str6 = this.ParcelableVolumeInfo.MediaDescriptionCompat.isEmpty() ? null : this.ParcelableVolumeInfo.MediaDescriptionCompat;
        String str7 = this.ParcelableVolumeInfo.RatingCompat.isEmpty() ? null : this.ParcelableVolumeInfo.RatingCompat;
        String str8 = this.ParcelableVolumeInfo.MediaMetadataCompat.isEmpty() ? null : this.ParcelableVolumeInfo.MediaMetadataCompat;
        if (!this.ParcelableVolumeInfo.IconCompatParcelizer.isEmpty()) {
            str = this.ParcelableVolumeInfo.IconCompatParcelizer;
        }
        return new valueType(str2, str3, str4, str5, str6, str7, str8, str, this.ParcelableVolumeInfo.write, this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver, this.ParcelableVolumeInfo.read, this.ParcelableVolumeInfo.MediaBrowserCompat$SearchResultReceiver, this.ParcelableVolumeInfo.MediaSessionCompat$ResultReceiverWrapper);
    }

    static /* synthetic */ void write(CaptureMessage captureMessage) {
        if (captureMessage.RatingCompat != null) {
            captureMessage.RatingCompat.aj_();
        }
    }
}
