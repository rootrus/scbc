package p040o;

import p040o.AbstractIterator;
import p040o.ServerProjectProvider;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.nV */
public final class C5024nV extends writeUInt64NoTag<ServerProjectProvider.C706313> {
    public setImportance IconCompatParcelizer;
    public final AbstractIterator.C30031 MediaBrowserCompat$ItemReceiver;
    public final logEventNoInterceptor read;

    /* renamed from: o.nV$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C706313> {
        private /* synthetic */ setImportance MediaBrowserCompat$CustomActionResultReceiver;

        public IconCompatParcelizer(setImportance setimportance) {
            this.MediaBrowserCompat$CustomActionResultReceiver = setimportance;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ServerProjectProvider.C706313) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, true);
        }
    }

    /* renamed from: o.nV$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C706313> {
        private /* synthetic */ setImportance write;

        public MediaMetadataCompat(setImportance setimportance) {
            this.write = setimportance;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ServerProjectProvider.C706313) obj).MediaBrowserCompat$ItemReceiver(this.write);
        }
    }

    /* renamed from: o.nV$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C706313> {
        private /* synthetic */ setImportance MediaBrowserCompat$ItemReceiver;

        public write(setImportance setimportance) {
            this.MediaBrowserCompat$ItemReceiver = setimportance;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ServerProjectProvider.C706313) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5024nV(AbstractIterator.C30031 r2, logEventNoInterceptor logeventnointerceptor, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "remittanceSuccessCase");
        onGetStartedClick.write((Object) logeventnointerceptor, "successCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = r2;
        this.read = logeventnointerceptor;
    }

    /* renamed from: o.nV$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Integer> {
        final /* synthetic */ C5024nV MediaBrowserCompat$ItemReceiver;
        String write;

        /* renamed from: o.nV$read$IconCompatParcelizer */
        static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C706313> {
            private /* synthetic */ read MediaBrowserCompat$CustomActionResultReceiver;

            IconCompatParcelizer(read read) {
                this.MediaBrowserCompat$CustomActionResultReceiver = read;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((ServerProjectProvider.C706313) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver.write);
            }
        }

        /* renamed from: o.nV$read$write */
        static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C706313> {
            private /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ read write;

            write(read read, Throwable th) {
                this.write = read;
                this.MediaBrowserCompat$CustomActionResultReceiver = th;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                access$2200 MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.JUST_DISMISS);
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "errorDisplayMapper.transform(e)");
                ((ServerProjectProvider.C706313) obj).MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver);
            }
        }

        public read(C5024nV nVVar, String str) {
            onGetStartedClick.write((Object) str, "name");
            this.MediaBrowserCompat$ItemReceiver = nVVar;
            this.write = str;
        }

        public final void onComplete() {
            C5024nV.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
            C5024nV.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            boolean z = true;
            if ((this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) && !this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
                C5024nV.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
                C5024nV.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
                C5024nV nVVar = this.MediaBrowserCompat$ItemReceiver;
                writeUInt64NoTag.IconCompatParcelizer write2 = new write(this, th);
                if (nVVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    write2.IconCompatParcelizer(nVVar.RatingCompat);
                }
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            boolean z = true;
            if (this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) {
                C5024nV nVVar = this.MediaBrowserCompat$ItemReceiver;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
                if (nVVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(nVVar.RatingCompat);
                }
            }
            this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.setPadding();
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C5024nV nVVar) {
        if (nVVar.RatingCompat != null) {
            nVVar.RatingCompat.aj_();
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(C5024nV nVVar) {
        if (nVVar.RatingCompat != null) {
            nVVar.RatingCompat.ay_();
        }
    }
}
