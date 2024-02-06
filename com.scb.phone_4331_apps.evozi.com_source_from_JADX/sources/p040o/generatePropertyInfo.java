package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;
import p040o.zzjx;

/* renamed from: o.generatePropertyInfo */
public final class generatePropertyInfo extends writeUInt64NoTag<PassportCaptureModule.PassportOnDeviceExtractionServer> {
    final Sets IconCompatParcelizer;
    final getRootCause MediaBrowserCompat$ItemReceiver;
    public final setStatusBarScrimColor read;

    /* renamed from: o.generatePropertyInfo$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule.PassportOnDeviceExtractionServer> {
        private /* synthetic */ generatePropertyInfo write;

        public IconCompatParcelizer(generatePropertyInfo generatepropertyinfo) {
            this.write = generatepropertyinfo;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.write.MediaBrowserCompat$ItemReceiver.write.IconCompatParcelizer(true);
            ((PassportCaptureModule.PassportOnDeviceExtractionServer) obj).read();
        }
    }

    /* renamed from: o.generatePropertyInfo$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule.PassportOnDeviceExtractionServer> {
        public static final write write = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportCaptureModule.PassportOnDeviceExtractionServer) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public generatePropertyInfo(RegularImmutableBiMap regularImmutableBiMap, setStatusBarScrimColor setstatusbarscrimcolor, Sets sets, getRootCause getrootcause) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) setstatusbarscrimcolor, "setupResultCase");
        onGetStartedClick.write((Object) sets, "setupResultDisplayMapper");
        onGetStartedClick.write((Object) getrootcause, "registrationTcCase");
        this.read = setstatusbarscrimcolor;
        this.IconCompatParcelizer = sets;
        this.MediaBrowserCompat$ItemReceiver = getrootcause;
    }

    /* renamed from: o.generatePropertyInfo$read */
    public static final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzjx.zze> {
        final /* synthetic */ generatePropertyInfo MediaBrowserCompat$ItemReceiver;

        /* renamed from: o.generatePropertyInfo$read$read  reason: collision with other inner class name */
        static final class C10750read<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule.PassportOnDeviceExtractionServer> {
            private /* synthetic */ read MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ zzjx.zze read;

            C10750read(read read2, zzjx.zze zze) {
                this.MediaBrowserCompat$CustomActionResultReceiver = read2;
                this.read = zze;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                Sets sets = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
                zzjx.zze zze = this.read;
                onGetStartedClick.write((Object) zze, "model");
                String IconCompatParcelizer = sets.IconCompatParcelizer("dd MMM yyyy - HH:mm", zze.write);
                onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "transformToDateMonthYear…te(model.confirmDateTime)");
                ((PassportCaptureModule.PassportOnDeviceExtractionServer) obj).MediaBrowserCompat$ItemReceiver(new finalizeSessions(IconCompatParcelizer));
            }
        }

        public read(generatePropertyInfo generatepropertyinfo) {
            this.MediaBrowserCompat$ItemReceiver = generatepropertyinfo;
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzjx.zze zze = (zzjx.zze) obj;
            onGetStartedClick.write((Object) zze, "result");
            super.onNext(zze);
            generatePropertyInfo generatepropertyinfo = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer read = new C10750read(this, zze);
            if (generatepropertyinfo.RatingCompat != null) {
                read.IconCompatParcelizer(generatepropertyinfo.RatingCompat);
            }
            generatePropertyInfo.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            super.onError(th);
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new C4473xeb12418f(this)));
        }
    }

    public final void onDestroy() {
        setStatusBarScrimColor setstatusbarscrimcolor = this.read;
        if (!setstatusbarscrimcolor.MediaBrowserCompat$MediaItem.isDisposed()) {
            setstatusbarscrimcolor.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(generatePropertyInfo generatepropertyinfo) {
        if (generatepropertyinfo.RatingCompat != null) {
            generatepropertyinfo.RatingCompat.aj_();
        }
    }
}
