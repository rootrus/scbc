package p040o;

import p040o.C3080xc2f5febc;
import p040o.writeUInt64NoTag;

/* renamed from: o.KtaBillExtractor_Factory$MediaBrowserCompat$ItemReceiver */
public final class KtaBillExtractor_Factory$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<GoogleMapOptions> {
    private /* synthetic */ KtaBillExtractor_Factory MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.KtaBillExtractor_Factory$MediaBrowserCompat$ItemReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ C3080xc2f5febc.Builder MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(C3080xc2f5febc.Builder builder) {
            this.MediaBrowserCompat$CustomActionResultReceiver = builder;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.KtaBillExtractor_Factory$MediaBrowserCompat$ItemReceiver$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        public static final read write = new read();

        read() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).IconCompatParcelizer();
        }
    }

    /* renamed from: o.KtaBillExtractor_Factory$MediaBrowserCompat$ItemReceiver$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        public static final write read = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public KtaBillExtractor_Factory$MediaBrowserCompat$ItemReceiver(KtaBillExtractor_Factory ktaBillExtractor_Factory) {
        this.MediaBrowserCompat$ItemReceiver = ktaBillExtractor_Factory;
    }

    public final /* synthetic */ void onNext(Object obj) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) obj;
        onGetStartedClick.write((Object) googleMapOptions, "transferHistory");
        KtaBillExtractor_Factory.IconCompatParcelizer();
        boolean z = true;
        if (this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) {
            C3080xc2f5febc.Builder read2 = this.MediaBrowserCompat$ItemReceiver.read.read(googleMapOptions);
            if (read2.write != 0) {
                if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver > 0) {
                    KtaBillExtractor_Factory ktaBillExtractor_Factory = this.MediaBrowserCompat$ItemReceiver;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(read2);
                    if (ktaBillExtractor_Factory.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        iconCompatParcelizer.IconCompatParcelizer(ktaBillExtractor_Factory.RatingCompat);
                    }
                } else {
                    KtaBillExtractor_Factory ktaBillExtractor_Factory2 = this.MediaBrowserCompat$ItemReceiver;
                    writeUInt64NoTag.IconCompatParcelizer ktaBillExtractor_Factory$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver = new C6925xd417cd19(read2);
                    if (ktaBillExtractor_Factory2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        ktaBillExtractor_Factory$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(ktaBillExtractor_Factory2.RatingCompat);
                    }
                }
                KtaBillExtractor_Factory ktaBillExtractor_Factory3 = this.MediaBrowserCompat$ItemReceiver;
                ktaBillExtractor_Factory3.MediaBrowserCompat$ItemReceiver = ktaBillExtractor_Factory3.MediaBrowserCompat$ItemReceiver + read2.MediaBrowserCompat$ItemReceiver.size();
            } else if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver == 0) {
                KtaBillExtractor_Factory ktaBillExtractor_Factory4 = this.MediaBrowserCompat$ItemReceiver;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = write.read;
                if (ktaBillExtractor_Factory4.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer2.IconCompatParcelizer(ktaBillExtractor_Factory4.RatingCompat);
                }
            } else {
                KtaBillExtractor_Factory ktaBillExtractor_Factory5 = this.MediaBrowserCompat$ItemReceiver;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = read.write;
                if (ktaBillExtractor_Factory5.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer3.IconCompatParcelizer(ktaBillExtractor_Factory5.RatingCompat);
                }
            }
        }
    }

    public final void onComplete() {
        KtaBillExtractor_Factory.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        boolean z = true;
        if ((this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) && !this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            KtaBillExtractor_Factory.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
            KtaBillExtractor_Factory ktaBillExtractor_Factory = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C6926x31cc7ba8.MediaBrowserCompat$CustomActionResultReceiver;
            if (ktaBillExtractor_Factory.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(ktaBillExtractor_Factory.RatingCompat);
            }
        }
    }
}
