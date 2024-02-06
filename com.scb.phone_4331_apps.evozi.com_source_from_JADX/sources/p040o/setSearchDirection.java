package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.ExecutorUtils;
import p040o.writeUInt64NoTag;

/* renamed from: o.setSearchDirection */
public final class setSearchDirection extends writeUInt64NoTag<newCheckParameters> {
    public String IconCompatParcelizer = "N";
    public String MediaBrowserCompat$ItemReceiver = DiskLruCache.VERSION_1;
    /* access modifiers changed from: private */
    public final fromMap MediaBrowserCompat$SearchResultReceiver;
    public final StreetViewPanoramaLink read;
    public ExecutorUtils.C33371 write;

    /* renamed from: o.setSearchDirection$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<newCheckParameters> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ ExecutorUtils.C33371 read;

        public IconCompatParcelizer(ExecutorUtils.C33371 r1, String str, String str2) {
            this.read = r1;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.IconCompatParcelizer = str2;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            newCheckParameters newcheckparameters = (newCheckParameters) obj;
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "S", (Object) this.read.PlaybackStateCompat$CustomAction) || !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "S", (Object) this.read.Keep)) {
                CharSequence charSequence = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "L", (Object) this.IconCompatParcelizer)) {
                        newcheckparameters.MediaBrowserCompat$ItemReceiver(0);
                        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
                        onGetStartedClick.IconCompatParcelizer((Object) str, "disclaimerMessage");
                        newcheckparameters.IconCompatParcelizer(str);
                        return;
                    } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "R", (Object) this.IconCompatParcelizer)) {
                        newcheckparameters.MediaBrowserCompat$ItemReceiver(0);
                        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                        onGetStartedClick.IconCompatParcelizer((Object) str2, "disclaimerMessage");
                        newcheckparameters.read(str2);
                        return;
                    } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "S", (Object) this.IconCompatParcelizer)) {
                        newcheckparameters.MediaBrowserCompat$ItemReceiver(0);
                        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                        onGetStartedClick.IconCompatParcelizer((Object) str3, "disclaimerMessage");
                        newcheckparameters.MediaBrowserCompat$MediaItem(str3);
                        return;
                    } else {
                        newcheckparameters.MediaBrowserCompat$ItemReceiver(8);
                        return;
                    }
                }
            }
            newcheckparameters.MediaBrowserCompat$ItemReceiver(8);
        }
    }

    /* renamed from: o.setSearchDirection$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<newCheckParameters> {
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        public MediaDescriptionCompat(String str) {
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((newCheckParameters) obj).MediaMetadataCompat(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.setSearchDirection$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<newCheckParameters> {
        private /* synthetic */ String write;

        public MediaMetadataCompat(String str) {
            this.write = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            newCheckParameters newcheckparameters = (newCheckParameters) obj;
            String str = this.write;
            if (str.hashCode() != 49 || !str.equals(DiskLruCache.VERSION_1)) {
                newcheckparameters.MediaDescriptionCompat();
            } else {
                newcheckparameters.MediaBrowserCompat$SearchResultReceiver();
            }
        }
    }

    /* renamed from: o.setSearchDirection$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<newCheckParameters> {
        private /* synthetic */ String IconCompatParcelizer;

        public read(String str) {
            this.IconCompatParcelizer = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            newCheckParameters newcheckparameters = (newCheckParameters) obj;
            CharSequence charSequence = this.IconCompatParcelizer;
            if (charSequence == null || charSequence.length() == 0) {
                newcheckparameters.MediaBrowserCompat$CustomActionResultReceiver();
            } else {
                newcheckparameters.write(this.IconCompatParcelizer);
            }
        }
    }

    /* renamed from: o.setSearchDirection$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<newCheckParameters> {
        private /* synthetic */ CrashlyticsFileMarker read;

        public write(CrashlyticsFileMarker crashlyticsFileMarker) {
            this.read = crashlyticsFileMarker;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            newCheckParameters newcheckparameters = (newCheckParameters) obj;
            CrashlyticsFileMarker crashlyticsFileMarker = this.read;
            if (crashlyticsFileMarker != null) {
                newcheckparameters.MediaMetadataCompat();
                newcheckparameters.write(crashlyticsFileMarker);
                return;
            }
            newcheckparameters.mo38187x50fd9e4a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setSearchDirection(StreetViewPanoramaLink streetViewPanoramaLink, fromMap frommap, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) streetViewPanoramaLink, "investmentCase");
        onGetStartedClick.write((Object) frommap, "switchConfirmationDisplayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.read = streetViewPanoramaLink;
        this.MediaBrowserCompat$SearchResultReceiver = frommap;
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(setSearchDirection setsearchdirection) {
        if (setsearchdirection.RatingCompat != null) {
            setsearchdirection.RatingCompat.aj_();
        }
    }
}
