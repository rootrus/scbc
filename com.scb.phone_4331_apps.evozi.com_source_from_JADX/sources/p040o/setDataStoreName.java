package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setDataStoreName */
public final class setDataStoreName extends writeUInt64NoTag<PassportCaptureModule_OnDevicePassportDeserializer_Factory> {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public final CircularRevealFrameLayout MediaMetadataCompat;
    public read read = read.FIRST;
    public String write;

    /* renamed from: o.setDataStoreName$read */
    public enum read {
        FIRST,
        SECOND,
        THIRD
    }

    /* renamed from: o.setDataStoreName$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_OnDevicePassportDeserializer_Factory> {
        private /* synthetic */ setDataStoreName MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(setDataStoreName setdatastorename) {
            this.MediaBrowserCompat$ItemReceiver = setdatastorename;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
            r0 = p040o.setDataStoreName.MediaBrowserCompat$ItemReceiver(r5.MediaBrowserCompat$ItemReceiver);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void IconCompatParcelizer(java.lang.Object r6) {
            /*
                r5 = this;
                o.PassportCaptureModule_OnDevicePassportDeserializer_Factory r6 = (p040o.PassportCaptureModule_OnDevicePassportDeserializer_Factory) r6
                o.setDataStoreName r0 = r5.MediaBrowserCompat$ItemReceiver
                java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
                r1 = 1
                r2 = 2
                r3 = 0
                if (r0 == 0) goto L_0x0027
                o.setDataStoreName r0 = r5.MediaBrowserCompat$ItemReceiver
                java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
                if (r0 == 0) goto L_0x001b
                int r0 = r0.length()
                if (r0 == r2) goto L_0x0027
            L_0x001b:
                o.setDataStoreName r0 = r5.MediaBrowserCompat$ItemReceiver
                o.setDataStoreName$read r0 = r0.read
                o.setDataStoreName$read r4 = p040o.setDataStoreName.read.FIRST
                if (r0 == r4) goto L_0x0027
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r0 = r3
            L_0x0028:
                o.setDataStoreName$read r4 = p040o.setDataStoreName.read.FIRST
                r6.IconCompatParcelizer(r0, r4)
                o.setDataStoreName r0 = r5.MediaBrowserCompat$ItemReceiver
                java.lang.String r0 = r0.IconCompatParcelizer
                if (r0 == 0) goto L_0x004f
                o.setDataStoreName r0 = r5.MediaBrowserCompat$ItemReceiver
                java.lang.String r0 = r0.IconCompatParcelizer
                if (r0 == 0) goto L_0x0043
                int r0 = r0.length()
                if (r0 == r2) goto L_0x004f
            L_0x0043:
                o.setDataStoreName r0 = r5.MediaBrowserCompat$ItemReceiver
                o.setDataStoreName$read r0 = r0.read
                o.setDataStoreName$read r4 = p040o.setDataStoreName.read.SECOND
                if (r0 == r4) goto L_0x004f
                r0 = r1
                goto L_0x0050
            L_0x004f:
                r0 = r3
            L_0x0050:
                o.setDataStoreName$read r4 = p040o.setDataStoreName.read.SECOND
                r6.IconCompatParcelizer(r0, r4)
                o.setDataStoreName r0 = r5.MediaBrowserCompat$ItemReceiver
                java.lang.String r0 = r0.write
                if (r0 == 0) goto L_0x0076
                o.setDataStoreName r0 = r5.MediaBrowserCompat$ItemReceiver
                java.lang.String r0 = r0.write
                if (r0 == 0) goto L_0x006b
                int r0 = r0.length()
                if (r0 == r2) goto L_0x0076
            L_0x006b:
                o.setDataStoreName r0 = r5.MediaBrowserCompat$ItemReceiver
                o.setDataStoreName$read r0 = r0.read
                o.setDataStoreName$read r2 = p040o.setDataStoreName.read.THIRD
                if (r0 == r2) goto L_0x0076
                goto L_0x0077
            L_0x0076:
                r1 = r3
            L_0x0077:
                o.setDataStoreName$read r0 = p040o.setDataStoreName.read.THIRD
                r6.IconCompatParcelizer(r1, r0)
                r6.IconCompatParcelizer(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.setDataStoreName.IconCompatParcelizer.IconCompatParcelizer(java.lang.Object):void");
        }
    }

    /* renamed from: o.setDataStoreName$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_OnDevicePassportDeserializer_Factory> {
        public static final MediaDescriptionCompat write = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportCaptureModule_OnDevicePassportDeserializer_Factory) obj).IconCompatParcelizer(true, read.FIRST);
        }
    }

    /* renamed from: o.setDataStoreName$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_OnDevicePassportDeserializer_Factory> {
        public static final MediaMetadataCompat IconCompatParcelizer = new MediaMetadataCompat();

        MediaMetadataCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportCaptureModule_OnDevicePassportDeserializer_Factory) obj).MediaBrowserCompat$ItemReceiver(true);
        }
    }

    /* renamed from: o.setDataStoreName$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_OnDevicePassportDeserializer_Factory> {
        public static final write write = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            PassportCaptureModule_OnDevicePassportDeserializer_Factory passportCaptureModule_OnDevicePassportDeserializer_Factory = (PassportCaptureModule_OnDevicePassportDeserializer_Factory) obj;
            passportCaptureModule_OnDevicePassportDeserializer_Factory.IconCompatParcelizer(true);
            passportCaptureModule_OnDevicePassportDeserializer_Factory.MediaBrowserCompat$ItemReceiver(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setDataStoreName(CircularRevealFrameLayout circularRevealFrameLayout, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) circularRevealFrameLayout, "verifyCodeCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaMetadataCompat = circularRevealFrameLayout;
    }

    /* renamed from: o.setDataStoreName$RatingCompat */
    public static final class RatingCompat extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void> {
        private /* synthetic */ setDataStoreName IconCompatParcelizer;

        /* renamed from: o.setDataStoreName$RatingCompat$read */
        static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_OnDevicePassportDeserializer_Factory> {
            public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

            read() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((PassportCaptureModule_OnDevicePassportDeserializer_Factory) obj).MediaBrowserCompat$ItemReceiver();
            }
        }

        /* renamed from: o.setDataStoreName$RatingCompat$write */
        static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_OnDevicePassportDeserializer_Factory> {
            public static final write read = new write();

            write() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                PassportCaptureModule_OnDevicePassportDeserializer_Factory passportCaptureModule_OnDevicePassportDeserializer_Factory = (PassportCaptureModule_OnDevicePassportDeserializer_Factory) obj;
                passportCaptureModule_OnDevicePassportDeserializer_Factory.MediaBrowserCompat$ItemReceiver(true);
                passportCaptureModule_OnDevicePassportDeserializer_Factory.IconCompatParcelizer(true, read.FIRST);
                passportCaptureModule_OnDevicePassportDeserializer_Factory.IconCompatParcelizer(true, read.SECOND);
                passportCaptureModule_OnDevicePassportDeserializer_Factory.IconCompatParcelizer(true, read.THIRD);
                passportCaptureModule_OnDevicePassportDeserializer_Factory.IconCompatParcelizer(true);
                passportCaptureModule_OnDevicePassportDeserializer_Factory.read();
            }
        }

        public RatingCompat(setDataStoreName setdatastorename) {
            this.IconCompatParcelizer = setdatastorename;
        }

        public final void onComplete() {
            super.onComplete();
            setDataStoreName.write(this.IconCompatParcelizer);
            setDataStoreName setdatastorename = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.MediaBrowserCompat$CustomActionResultReceiver;
            if (setdatastorename.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(setdatastorename.RatingCompat);
            }
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
            if (r5.equals("3029") != false) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
            r2 = r4.IconCompatParcelizer;
            r3 = new p040o.C5292x22520fd0(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
            if (r2.RatingCompat == null) goto L_0x0061;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
            if (r0 == false) goto L_0x007d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
            r3.IconCompatParcelizer(r2.RatingCompat);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
            if (r5.equals("3031") != false) goto L_0x0053;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onError(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.String r0 = "e"
                p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
                super.onError(r5)
                com.scb.phone.domain.errors.RetrofitException r5 = (com.scb.phone.domain.errors.RetrofitException) r5
                o.ILocationSourceDelegate r5 = r5.IconCompatParcelizer
                java.lang.String r0 = "(e as RetrofitException).response"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r0)
                o.ILocationSourceDelegate$zza r5 = r5.write
                java.lang.String r0 = "(e as RetrofitException).response.error"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r0)
                java.lang.String r5 = r5.IconCompatParcelizer
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L_0x006a
                int r2 = r5.hashCode()
                switch(r2) {
                    case 1567076: goto L_0x004b;
                    case 1567098: goto L_0x002f;
                    case 1567099: goto L_0x0026;
                    default: goto L_0x0025;
                }
            L_0x0025:
                goto L_0x006a
            L_0x0026:
                java.lang.String r2 = "3031"
                boolean r2 = r5.equals(r2)
                if (r2 == 0) goto L_0x006a
                goto L_0x0053
            L_0x002f:
                java.lang.String r2 = "3030"
                boolean r5 = r5.equals(r2)
                if (r5 == 0) goto L_0x006a
                o.setDataStoreName r5 = r4.IconCompatParcelizer
                o.setDataStoreName$RatingCompat$write r2 = p040o.setDataStoreName.RatingCompat.write.read
                o.writeUInt64NoTag$IconCompatParcelizer r2 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r2
                T r3 = r5.RatingCompat
                if (r3 == 0) goto L_0x0042
                goto L_0x0043
            L_0x0042:
                r0 = r1
            L_0x0043:
                if (r0 == 0) goto L_0x007d
                T r5 = r5.RatingCompat
                r2.IconCompatParcelizer(r5)
                goto L_0x007d
            L_0x004b:
                java.lang.String r2 = "3029"
                boolean r2 = r5.equals(r2)
                if (r2 == 0) goto L_0x006a
            L_0x0053:
                o.setDataStoreName r2 = r4.IconCompatParcelizer
                o.setDataStoreName$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver r3 = new o.setDataStoreName$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver
                r3.<init>(r5)
                o.writeUInt64NoTag$IconCompatParcelizer r3 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r3
                T r5 = r2.RatingCompat
                if (r5 == 0) goto L_0x0061
                goto L_0x0062
            L_0x0061:
                r0 = r1
            L_0x0062:
                if (r0 == 0) goto L_0x007d
                T r5 = r2.RatingCompat
                r3.IconCompatParcelizer(r5)
                goto L_0x007d
            L_0x006a:
                o.setDataStoreName r5 = r4.IconCompatParcelizer
                o.setDataStoreName$RatingCompat$MediaBrowserCompat$ItemReceiver r2 = p040o.setDataStoreName$RatingCompat$MediaBrowserCompat$ItemReceiver.write
                o.writeUInt64NoTag$IconCompatParcelizer r2 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r2
                T r3 = r5.RatingCompat
                if (r3 == 0) goto L_0x0075
                goto L_0x0076
            L_0x0075:
                r0 = r1
            L_0x0076:
                if (r0 == 0) goto L_0x007d
                T r5 = r5.RatingCompat
                r2.IconCompatParcelizer(r5)
            L_0x007d:
                o.setDataStoreName r5 = r4.IconCompatParcelizer
                p040o.setDataStoreName.write(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.setDataStoreName.RatingCompat.onError(java.lang.Throwable):void");
        }
    }

    public final void onDestroy() {
        CircularRevealFrameLayout circularRevealFrameLayout = this.MediaMetadataCompat;
        if (!circularRevealFrameLayout.MediaBrowserCompat$MediaItem.isDisposed()) {
            circularRevealFrameLayout.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void write(setDataStoreName setdatastorename) {
        if (setdatastorename.RatingCompat != null) {
            setdatastorename.RatingCompat.aj_();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = r4.IconCompatParcelizer;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r0 = r4.write;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver() {
        /*
            r4 = this;
            java.lang.String r0 = r4.MediaBrowserCompat$ItemReceiver
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            int r0 = r0.length()
            r3 = 2
            if (r0 != r3) goto L_0x0023
            java.lang.String r0 = r4.IconCompatParcelizer
            if (r0 == 0) goto L_0x0023
            int r0 = r0.length()
            if (r0 != r3) goto L_0x0023
            java.lang.String r0 = r4.write
            if (r0 == 0) goto L_0x0023
            int r0 = r0.length()
            if (r0 != r3) goto L_0x0023
            r0 = r1
            goto L_0x0024
        L_0x0023:
            r0 = r2
        L_0x0024:
            if (r0 == 0) goto L_0x0038
            o.setDataStoreName$write r0 = p040o.setDataStoreName.write.write
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r4.RatingCompat
            if (r3 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            if (r1 == 0) goto L_0x0037
            T r1 = r4.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x0037:
            return
        L_0x0038:
            o.setDataStoreName$IconCompatParcelizer r0 = new o.setDataStoreName$IconCompatParcelizer
            r0.<init>(r4)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r4.RatingCompat
            if (r3 == 0) goto L_0x0045
            r3 = r1
            goto L_0x0046
        L_0x0045:
            r3 = r2
        L_0x0046:
            if (r3 == 0) goto L_0x004d
            T r3 = r4.RatingCompat
            r0.IconCompatParcelizer(r3)
        L_0x004d:
            java.lang.String r0 = r4.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = r4.IconCompatParcelizer
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = r4.write
            if (r0 == 0) goto L_0x006a
            o.setDataStoreName$MediaBrowserCompat$ItemReceiver r0 = p040o.setDataStoreName$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r4.RatingCompat
            if (r3 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r1 = r2
        L_0x0063:
            if (r1 == 0) goto L_0x006a
            T r1 = r4.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setDataStoreName.MediaBrowserCompat$ItemReceiver():void");
    }
}
