package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.C7131hE;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentBaseOverlayView_Factory */
public abstract class DocumentBaseOverlayView_Factory<T extends C7131hE> extends writeUInt64NoTag<T> {
    public abstract void IconCompatParcelizer(access$2200 access_2200);

    public abstract void write(String str);

    /* renamed from: o.DocumentBaseOverlayView_Factory$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ access$2200 IconCompatParcelizer;

        read(access$2200 access_2200) {
            this.IconCompatParcelizer = access_2200;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            C7131hE hEVar = (C7131hE) obj;
            hEVar.read();
            access$2200 access_2200 = this.IconCompatParcelizer;
            onGetStartedClick.IconCompatParcelizer((Object) access_2200, "errorDisplay");
            String str = access_2200.IconCompatParcelizer;
            onGetStartedClick.IconCompatParcelizer((Object) str, "errorDisplay.message");
            hEVar.IconCompatParcelizer(str);
        }
    }

    /* renamed from: o.DocumentBaseOverlayView_Factory$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ access$2200 MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ DocumentBaseOverlayView_Factory write;

        write(access$2200 access_2200, DocumentBaseOverlayView_Factory documentBaseOverlayView_Factory) {
            this.MediaBrowserCompat$CustomActionResultReceiver = access_2200;
            this.write = documentBaseOverlayView_Factory;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7131hE) obj).read();
            DocumentBaseOverlayView_Factory documentBaseOverlayView_Factory = this.write;
            access$2200 access_2200 = this.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) access_2200, "errorDisplay");
            documentBaseOverlayView_Factory.IconCompatParcelizer(access_2200);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocumentBaseOverlayView_Factory(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }

    /* access modifiers changed from: protected */
    public final void MediaDescriptionCompat(Throwable th) {
        ILocationSourceDelegate.zza zza;
        onGetStartedClick.write((Object) th, "throwable");
        if (th instanceof RetrofitException) {
            boolean z = true;
            if (this.RatingCompat != null) {
                this.RatingCompat.aj_();
            }
            ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
            if (iLocationSourceDelegate != null && (zza = iLocationSourceDelegate.write) != null) {
                access$2200 MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "1030", (Object) zza.IconCompatParcelizer)) {
                    writeUInt64NoTag.IconCompatParcelizer read2 = new read(MediaBrowserCompat$ItemReceiver);
                    if (this.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        read2.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                }
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "1036", (Object) zza.IconCompatParcelizer) || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "3036", (Object) zza.IconCompatParcelizer)) {
                    onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "errorDisplay");
                    read(MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, (Runnable) new IconCompatParcelizer(zza, this));
                    return;
                }
                writeUInt64NoTag.IconCompatParcelizer write2 = new write(MediaBrowserCompat$ItemReceiver, this);
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    write2.IconCompatParcelizer(this.RatingCompat);
                    return;
                }
                return;
            }
            return;
        }
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    /* renamed from: o.DocumentBaseOverlayView_Factory$IconCompatParcelizer */
    static final class IconCompatParcelizer implements Runnable {
        private /* synthetic */ DocumentBaseOverlayView_Factory IconCompatParcelizer;
        final /* synthetic */ ILocationSourceDelegate.zza MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(ILocationSourceDelegate.zza zza, DocumentBaseOverlayView_Factory documentBaseOverlayView_Factory) {
            this.MediaBrowserCompat$ItemReceiver = zza;
            this.IconCompatParcelizer = documentBaseOverlayView_Factory;
        }

        public final void run() {
            DocumentBaseOverlayView_Factory documentBaseOverlayView_Factory = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<T>(this) {
                private /* synthetic */ IconCompatParcelizer IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((C7131hE) obj).MediaBrowserCompat$ItemReceiver(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, (Object) "3036"));
                }
            };
            if (documentBaseOverlayView_Factory.RatingCompat != null) {
                r1.IconCompatParcelizer(documentBaseOverlayView_Factory.RatingCompat);
            }
        }
    }
}
