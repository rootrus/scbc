package p040o;

import java.util.List;
import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.MapConstraints;
import p040o.writeUInt64NoTag;

/* renamed from: o.TypeAdapters */
public final /* synthetic */ class TypeAdapters implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ TypeAdapters write = new TypeAdapters();

    private /* synthetic */ TypeAdapters() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetIJsonExactionHelperRttiFactory.read) obj).read();
    }

    /* renamed from: o.TypeAdapters$EnumTypeAdapter */
    public class EnumTypeAdapter extends writeUInt64NoTag<CheckCaptureModule_GetIJsonExactionHelperRttiFactory.read> {
        public final alpha IconCompatParcelizer;
        public List<chain> MediaBrowserCompat$ItemReceiver;
        /* access modifiers changed from: private */
        public final MapConstraints.ConstrainedMultimap.C36361 read;
        /* access modifiers changed from: private */
        public final getLeftChildIndex write;

        @HmlPinActivity
        public EnumTypeAdapter(alpha alpha, getLeftChildIndex getleftchildindex, MapConstraints.ConstrainedMultimap.C36361 r3, RegularImmutableBiMap regularImmutableBiMap) {
            super(regularImmutableBiMap);
            this.IconCompatParcelizer = alpha;
            this.write = getleftchildindex;
            this.read = r3;
        }

        public void onDestroy() {
            super.onDestroy();
            alpha alpha = this.IconCompatParcelizer;
            if (!alpha.MediaBrowserCompat$MediaItem.isDisposed()) {
                alpha.MediaBrowserCompat$MediaItem.dispose();
            }
            alpha.read.MediaBrowserCompat$ItemReceiver();
        }

        static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(EnumTypeAdapter enumTypeAdapter) {
            if (enumTypeAdapter.RatingCompat != null) {
                enumTypeAdapter.RatingCompat.ay_();
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(chain chain) {
            if (chain.ActionMenuItemView) {
                containsAllImpl read2 = containsAllImpl.read();
                read2.MediaBrowserCompat$ItemReceiver = chain.MediaDescriptionCompat;
                read2.IconCompatParcelizer = chain.AlertController$RecycleListView;
                this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(read2);
                this.IconCompatParcelizer.IconCompatParcelizer(new TypeAdapters$EnumTypeAdapter$MediaBrowserCompat$ItemReceiver(this, chain.MediaDescriptionCompat));
                return;
            }
            C38902 r3 = C38902.read;
            if (this.RatingCompat != null) {
                r3.IconCompatParcelizer(this.RatingCompat);
            }
        }

        public static boolean read(chain chain) {
            return "BLOCK".equalsIgnoreCase(chain.ParcelableVolumeInfo) || "PENDING_ACTIVATION".equalsIgnoreCase(chain.ParcelableVolumeInfo);
        }

        public static boolean MediaBrowserCompat$ItemReceiver(chain chain) {
            return "BLOCK".equalsIgnoreCase(chain.ParcelableVolumeInfo) || "TEMP_BLOCK".equalsIgnoreCase(chain.ParcelableVolumeInfo) || "PENDING_ACTIVATION".equalsIgnoreCase(chain.ParcelableVolumeInfo);
        }
    }
}
