package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.C1161xfaac52a4;
import p040o.Multisets;
import p040o.writeUInt64NoTag;

/* renamed from: o.getChannels */
public class getChannels<T extends C1161xfaac52a4> extends writeUInt64NoTag<T> {
    public String IconCompatParcelizer;
    final toLongArray MediaBrowserCompat$ItemReceiver;
    private final setRequestedFps MediaDescriptionCompat;
    public final setMaxGapFrames MediaMetadataCompat;
    public String read;
    public String write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getChannels(RegularImmutableBiMap regularImmutableBiMap, Multisets.UnmodifiableMultiset unmodifiableMultiset, setMaxGapFrames setmaxgapframes, setRequestedFps setrequestedfps, toLongArray tolongarray) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) unmodifiableMultiset, "easycashContactInformationDisplayMapper");
        onGetStartedClick.write((Object) setmaxgapframes, "termsAndConditionsCase");
        onGetStartedClick.write((Object) setrequestedfps, "easycashNCBCase");
        onGetStartedClick.write((Object) tolongarray, "mTermsAndConsMapper");
        this.MediaMetadataCompat = setmaxgapframes;
        this.MediaDescriptionCompat = setrequestedfps;
        this.MediaBrowserCompat$ItemReceiver = tolongarray;
    }

    public final void read(boolean z) {
        String str = z ? DiskLruCache.VERSION_1 : "0";
        onGetStartedClick.IconCompatParcelizer((Object) str, "easycashNCBCase.convertB…anToString(consentStatus)");
        this.write = str;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getChannels$MediaBrowserCompat$ItemReceiver.read;
        if (this.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
    }

    /* renamed from: o.getChannels$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onCircleClick> {

        /* renamed from: o.getChannels$IconCompatParcelizer$IconCompatParcelizer  reason: collision with other inner class name */
        static final class C10751IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
            private /* synthetic */ onCircleClick IconCompatParcelizer;
            private /* synthetic */ IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

            C10751IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, onCircleClick oncircleclick) {
                this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
                this.IconCompatParcelizer = oncircleclick;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((C1161xfaac52a4) obj).read(getChannels.this.MediaBrowserCompat$ItemReceiver.read((String) null, this.IconCompatParcelizer, true, false, (String) null));
            }
        }

        public IconCompatParcelizer() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            onCircleClick oncircleclick = (onCircleClick) obj;
            onGetStartedClick.write((Object) oncircleclick, "privacyConsentContent");
            getChannels getchannels = getChannels.this;
            boolean z = true;
            if (getchannels.RatingCompat != null) {
                getchannels.RatingCompat.aj_();
            }
            getChannels getchannels2 = getChannels.this;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new C10751IconCompatParcelizer(this, oncircleclick);
            if (getchannels2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(getchannels2.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            getChannels getchannels = getChannels.this;
            getchannels.MediaBrowserCompat$ItemReceiver(getchannels.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new C4515xb50fc22d(this)));
        }
    }

    /* renamed from: o.getChannels$write */
    final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {

        /* renamed from: o.getChannels$write$write  reason: collision with other inner class name */
        static final class C10752write<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
            private /* synthetic */ write read;

            C10752write(write write) {
                this.read = write;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                C1161xfaac52a4 checkExtractActivity_MembersInjector$MediaBrowserCompat$SearchResultReceiver = (C1161xfaac52a4) obj;
                String str = getChannels.this.write;
                if (str == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("consentStatus");
                }
                checkExtractActivity_MembersInjector$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) DiskLruCache.VERSION_1));
            }
        }

        public write() {
        }

        /* renamed from: o.getChannels$write$read */
        static final class read implements Runnable {
            private /* synthetic */ write write;

            read(write write2) {
                this.write = write2;
            }

            public final void run() {
                getChannels getchannels = getChannels.this;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C45144.MediaBrowserCompat$CustomActionResultReceiver;
                if (getchannels.RatingCompat != null) {
                    iconCompatParcelizer.IconCompatParcelizer(getchannels.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            getChannels getchannels = getChannels.this;
            getchannels.MediaBrowserCompat$ItemReceiver(getchannels.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new read(this)));
        }

        public final void onComplete() {
            getChannels getchannels = getChannels.this;
            if (getchannels.RatingCompat != null) {
                getchannels.RatingCompat.aj_();
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            getChannels getchannels = getChannels.this;
            writeUInt64NoTag.IconCompatParcelizer write2 = new C10752write(this);
            if (getchannels.RatingCompat != null) {
                write2.IconCompatParcelizer(getchannels.RatingCompat);
            }
        }
    }

    public void onDestroy() {
        setRequestedFps setrequestedfps = this.MediaDescriptionCompat;
        if (!setrequestedfps.MediaBrowserCompat$MediaItem.isDisposed()) {
            setrequestedfps.MediaBrowserCompat$MediaItem.dispose();
        }
        setMaxGapFrames setmaxgapframes = this.MediaMetadataCompat;
        if (!setmaxgapframes.MediaBrowserCompat$MediaItem.isDisposed()) {
            setmaxgapframes.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public void read() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        String str = this.read;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productType");
        }
        String str2 = this.write;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("consentStatus");
        }
        String MediaBrowserCompat$SearchResultReceiver = this.MediaDescriptionCompat.read.MediaBrowserCompat$SearchResultReceiver();
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$SearchResultReceiver, "easycashNCBCase.tileVersion");
        this.MediaDescriptionCompat.write(new getNext(str, str2, MediaBrowserCompat$SearchResultReceiver, this.IconCompatParcelizer));
        this.MediaDescriptionCompat.IconCompatParcelizer(new write());
    }
}
