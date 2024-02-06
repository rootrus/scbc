package p040o;

import java.util.ArrayList;
import okhttp3.internal.cache.DiskLruCache;
import p040o.ExtractorResponse;
import p040o.GoogleMap;
import p040o.Predicates;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionFace */
public final class FirebaseVisionFace extends writeUInt64NoTag<ExtractorResponse.IconCompatParcelizer> {
    public final Predicates.ContainsPatternPredicate IconCompatParcelizer;
    public chain MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final String MediaBrowserCompat$MediaItem = "EXTRA_SELECT_ADD_NEW_ADDRESS_KEY";
    /* access modifiers changed from: private */
    public final String MediaBrowserCompat$SearchResultReceiver = "EXTRA_SELECT_ADDRESS_KEY";
    public Boolean MediaDescriptionCompat;
    public final Predicates.C37371 MediaMetadataCompat;
    public String read;
    public ArrayList<chain> write;

    /* renamed from: o.FirebaseVisionFace$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.IconCompatParcelizer> {
        private /* synthetic */ FirebaseVisionFace write;

        public MediaDescriptionCompat(FirebaseVisionFace firebaseVisionFace) {
            this.write = firebaseVisionFace;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ExtractorResponse.IconCompatParcelizer iconCompatParcelizer = (ExtractorResponse.IconCompatParcelizer) obj;
            String MediaMetadataCompat = this.write.MediaMetadataCompat.write.MediaMetadataCompat();
            if (MediaMetadataCompat == null) {
                MediaMetadataCompat = "";
            }
            if (MediaMetadataCompat.length() > 0) {
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
            } else {
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }

    /* renamed from: o.FirebaseVisionFace$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.IconCompatParcelizer> {
        private /* synthetic */ FirebaseVisionFace MediaBrowserCompat$ItemReceiver;

        public MediaMetadataCompat(FirebaseVisionFace firebaseVisionFace) {
            this.MediaBrowserCompat$ItemReceiver = firebaseVisionFace;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ExtractorResponse.IconCompatParcelizer iconCompatParcelizer = (ExtractorResponse.IconCompatParcelizer) obj;
            String MediaMetadataCompat = this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.write.MediaMetadataCompat();
            if (MediaMetadataCompat == null) {
                MediaMetadataCompat = "";
            }
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(true, MediaMetadataCompat);
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.FirebaseVisionFace$ParcelableVolumeInfo */
    public static final class ParcelableVolumeInfo<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.IconCompatParcelizer> {
        private /* synthetic */ FirebaseVisionFace IconCompatParcelizer;

        public ParcelableVolumeInfo(FirebaseVisionFace firebaseVisionFace) {
            this.IconCompatParcelizer = firebaseVisionFace;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ExtractorResponse.IconCompatParcelizer iconCompatParcelizer = (ExtractorResponse.IconCompatParcelizer) obj;
            String MediaMetadataCompat = this.IconCompatParcelizer.MediaMetadataCompat.write.MediaMetadataCompat();
            if (MediaMetadataCompat == null) {
                MediaMetadataCompat = "";
            }
            if (MediaMetadataCompat.length() > 0) {
                FirebaseVisionFace.MediaBrowserCompat$MediaItem(this.IconCompatParcelizer);
                iconCompatParcelizer.MediaMetadataCompat();
                return;
            }
            FirebaseVisionFace.MediaDescriptionCompat(this.IconCompatParcelizer);
        }
    }

    /* renamed from: o.FirebaseVisionFace$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.IconCompatParcelizer> {
        private /* synthetic */ FirebaseVisionFace read;

        public RatingCompat(FirebaseVisionFace firebaseVisionFace) {
            this.read = firebaseVisionFace;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ExtractorResponse.IconCompatParcelizer iconCompatParcelizer = (ExtractorResponse.IconCompatParcelizer) obj;
            String MediaMetadataCompat = this.read.MediaMetadataCompat.write.MediaMetadataCompat();
            if (MediaMetadataCompat == null) {
                MediaMetadataCompat = "";
            }
            if (MediaMetadataCompat.length() > 0) {
                FirebaseVisionFace.MediaBrowserCompat$MediaItem(this.read);
                iconCompatParcelizer.MediaMetadataCompat();
                return;
            }
            FirebaseVisionFace.MediaDescriptionCompat(this.read);
        }
    }

    /* renamed from: o.FirebaseVisionFace$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.IconCompatParcelizer> {
        public static final read read = new read();

        read() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ExtractorResponse.IconCompatParcelizer) obj).IconCompatParcelizer();
        }
    }

    /* renamed from: o.FirebaseVisionFace$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.IconCompatParcelizer> {
        private /* synthetic */ FirebaseVisionFace IconCompatParcelizer;

        IconCompatParcelizer(FirebaseVisionFace firebaseVisionFace) {
            this.IconCompatParcelizer = firebaseVisionFace;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str;
            ExtractorResponse.IconCompatParcelizer iconCompatParcelizer = (ExtractorResponse.IconCompatParcelizer) obj;
            GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = this.IconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView();
            if (AppCompatDelegateImpl$ListMenuDecorView != null) {
                str = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$SearchResultReceiver;
            } else {
                str = null;
            }
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) DiskLruCache.VERSION_1)) {
                chain MediaBrowserCompat$ItemReceiver = FirebaseVisionFace.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
                ArrayList IconCompatParcelizer2 = FirebaseVisionFace.IconCompatParcelizer(this.IconCompatParcelizer);
                String MediaMetadataCompat = this.IconCompatParcelizer.MediaMetadataCompat.write.MediaMetadataCompat();
                if (MediaMetadataCompat == null) {
                    MediaMetadataCompat = "";
                }
                iconCompatParcelizer.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver, IconCompatParcelizer2, MediaMetadataCompat);
                return;
            }
            FirebaseVisionFace.MediaBrowserCompat$SearchResultReceiver(this.IconCompatParcelizer);
        }
    }

    /* renamed from: o.FirebaseVisionFace$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.IconCompatParcelizer> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ FirebaseVisionFace MediaBrowserCompat$ItemReceiver;

        public write(FirebaseVisionFace firebaseVisionFace, String str) {
            this.MediaBrowserCompat$ItemReceiver = firebaseVisionFace;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ExtractorResponse.IconCompatParcelizer iconCompatParcelizer = (ExtractorResponse.IconCompatParcelizer) obj;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver)) {
                FirebaseVisionFace.write(this.MediaBrowserCompat$ItemReceiver);
            } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem)) {
                iconCompatParcelizer.read();
            }
        }
    }

    public static final /* synthetic */ ArrayList IconCompatParcelizer(FirebaseVisionFace firebaseVisionFace) {
        ArrayList<chain> arrayList = firebaseVisionFace.write;
        if (arrayList == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplayList");
        }
        return arrayList;
    }

    public static final /* synthetic */ chain MediaBrowserCompat$ItemReceiver(FirebaseVisionFace firebaseVisionFace) {
        chain chain = firebaseVisionFace.MediaBrowserCompat$ItemReceiver;
        if (chain == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        return chain;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public FirebaseVisionFace(Predicates.ContainsPatternPredicate containsPatternPredicate, Predicates.C37371 r3, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) containsPatternPredicate, "hasUserVerifiedEmailCase");
        onGetStartedClick.write((Object) r3, "userEmailCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.IconCompatParcelizer = containsPatternPredicate;
        this.MediaMetadataCompat = r3;
    }

    public static final /* synthetic */ void write(FirebaseVisionFace firebaseVisionFace) {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(firebaseVisionFace);
        if (firebaseVisionFace.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(firebaseVisionFace.RatingCompat);
        }
    }

    public static final /* synthetic */ void MediaDescriptionCompat(FirebaseVisionFace firebaseVisionFace) {
        writeUInt64NoTag.IconCompatParcelizer firebaseVisionFace$MediaBrowserCompat$CustomActionResultReceiver = new FirebaseVisionFace$MediaBrowserCompat$CustomActionResultReceiver(firebaseVisionFace);
        if (firebaseVisionFace.RatingCompat != null) {
            firebaseVisionFace$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(firebaseVisionFace.RatingCompat);
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$MediaItem(FirebaseVisionFace firebaseVisionFace) {
        writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new MediaMetadataCompat(firebaseVisionFace);
        if (firebaseVisionFace.RatingCompat != null) {
            mediaMetadataCompat.IconCompatParcelizer(firebaseVisionFace.RatingCompat);
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(FirebaseVisionFace firebaseVisionFace) {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = FirebaseVisionFace$MediaBrowserCompat$SearchResultReceiver.write;
        if (firebaseVisionFace.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(firebaseVisionFace.RatingCompat);
        }
    }
}
