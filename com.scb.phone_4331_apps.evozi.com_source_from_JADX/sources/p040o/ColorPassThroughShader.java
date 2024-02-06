package p040o;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p040o.StreetViewPanorama;
import p040o.access$2300;
import p040o.setCvv;

/* renamed from: o.ColorPassThroughShader */
public class ColorPassThroughShader extends writeUInt64NoTag<setCvv.write> implements loadInBackground {
    public String IconCompatParcelizer;
    public double MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    public Double MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: package-private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final offset f2688x50fd9e4a;
    public int MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public final setMode MediaSessionCompat$QueueItem;
    public int MediaSessionCompat$ResultReceiverWrapper;
    public int MediaSessionCompat$Token;
    public int ParcelableVolumeInfo;
    public String read;
    public List<StreetViewPanorama.OnStreetViewPanoramaLongClickListener> write;

    @HmlPinActivity
    public ColorPassThroughShader(RegularImmutableBiMap regularImmutableBiMap, setMode setmode, offset offset) {
        super(regularImmutableBiMap);
        this.MediaSessionCompat$QueueItem = setmode;
        this.f2688x50fd9e4a = offset;
    }

    static List<String> MediaBrowserCompat$ItemReceiver() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 31; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write() {
        /*
            r7 = this;
            int r0 = r7.MediaDescriptionCompat
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x000c
            r3 = 31
            if (r0 > r3) goto L_0x000c
            r0 = r2
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            java.lang.String r3 = r7.IconCompatParcelizer
            java.lang.String r4 = "1"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0018
            r0 = r2
        L_0x0018:
            int r3 = r7.MediaSessionCompat$ResultReceiverWrapper
            if (r3 <= 0) goto L_0x0047
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r7.read
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0047
            boolean r0 = r7.MediaMetadataCompat
            if (r0 == 0) goto L_0x0047
            java.lang.Double r0 = r7.MediaBrowserCompat$SearchResultReceiver
            double r3 = r0.doubleValue()
            double r5 = r7.MediaBrowserCompat$ItemReceiver
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0047
            int r0 = r7.MediaSessionCompat$Token
            double r3 = (double) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0047
            int r0 = r7.ParcelableVolumeInfo
            double r3 = (double) r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r0 = r2
            goto L_0x0048
        L_0x0047:
            r0 = r1
        L_0x0048:
            r7.MediaBrowserCompat$MediaItem = r0
            o.getMaxVaryingVectors r3 = new o.getMaxVaryingVectors
            r3.<init>(r0)
            T r0 = r7.RatingCompat
            if (r0 == 0) goto L_0x0054
            r1 = r2
        L_0x0054:
            if (r1 == 0) goto L_0x005b
            T r0 = r7.RatingCompat
            r3.IconCompatParcelizer(r0)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ColorPassThroughShader.write():void");
    }

    /* renamed from: o.ColorPassThroughShader$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanorama.OnStreetViewPanoramaLongClickListener>> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(ColorPassThroughShader colorPassThroughShader, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            ColorPassThroughShader.RatingCompat(ColorPassThroughShader.this);
            boolean z = true;
            if (ColorPassThroughShader.this.RatingCompat != null) {
                List unused = ColorPassThroughShader.this.write = list;
                if (list != null && !list.isEmpty()) {
                    offset unused2 = ColorPassThroughShader.this.f2688x50fd9e4a;
                    List MediaBrowserCompat$ItemReceiver2 = offset.MediaBrowserCompat$ItemReceiver(list, new setPreviewResoution(this));
                    ColorPassThroughShader colorPassThroughShader = ColorPassThroughShader.this;
                    setResizedResolution setresizedresolution = new setResizedResolution(MediaBrowserCompat$ItemReceiver2);
                    if (colorPassThroughShader.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        setresizedresolution.IconCompatParcelizer(colorPassThroughShader.RatingCompat);
                    }
                }
            }
        }

        public final void onComplete() {
            ColorPassThroughShader.write(ColorPassThroughShader.this);
        }

        public final void onError(Throwable th) {
            ColorPassThroughShader.MediaBrowserCompat$SearchResultReceiver(ColorPassThroughShader.this);
            ColorPassThroughShader.this.MediaBrowserCompat$ItemReceiver(ColorPassThroughShader.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    /* renamed from: o.ColorPassThroughShader$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setBoundsBias> {
        private write() {
        }

        public /* synthetic */ write(ColorPassThroughShader colorPassThroughShader, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            ColorPassThroughShader.MediaBrowserCompat$MediaItem(ColorPassThroughShader.this);
            ColorPassThroughShader colorPassThroughShader = ColorPassThroughShader.this;
            OpenGLESContextManager openGLESContextManager = new OpenGLESContextManager((setBoundsBias) obj);
            if (colorPassThroughShader.RatingCompat != null) {
                openGLESContextManager.IconCompatParcelizer(colorPassThroughShader.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            ColorPassThroughShader colorPassThroughShader = ColorPassThroughShader.this;
            isRGBInputTextureRequired isrgbinputtexturerequired = isRGBInputTextureRequired.IconCompatParcelizer;
            if (colorPassThroughShader.RatingCompat != null) {
                isrgbinputtexturerequired.IconCompatParcelizer(colorPassThroughShader.RatingCompat);
            }
        }

        static /* synthetic */ void MediaBrowserCompat$ItemReceiver(setCvv.write write2) {
            write2.ay_();
            write2.MediaDescriptionCompat();
        }

        static /* synthetic */ void read(setBoundsBias setboundsbias, setCvv.write write2) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance.setMinimumFractionDigits(2);
            currencyInstance.setMaximumFractionDigits(2);
            write2.write(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(setboundsbias != null ? setboundsbias.MediaBrowserCompat$MediaItem.doubleValue() : 0.0d));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(ColorPassThroughShader colorPassThroughShader) {
        if (colorPassThroughShader.RatingCompat != null) {
            colorPassThroughShader.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(ColorPassThroughShader colorPassThroughShader) {
        if (colorPassThroughShader.RatingCompat != null) {
            colorPassThroughShader.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(ColorPassThroughShader colorPassThroughShader) {
        if (colorPassThroughShader.RatingCompat != null) {
            colorPassThroughShader.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(ColorPassThroughShader colorPassThroughShader) {
        if (colorPassThroughShader.RatingCompat != null) {
            colorPassThroughShader.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(ColorPassThroughShader colorPassThroughShader) {
        if (colorPassThroughShader.RatingCompat != null) {
            colorPassThroughShader.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void RatingCompat(ColorPassThroughShader colorPassThroughShader) {
        if (colorPassThroughShader.RatingCompat != null) {
            colorPassThroughShader.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(ColorPassThroughShader colorPassThroughShader) {
        if (colorPassThroughShader.RatingCompat != null) {
            colorPassThroughShader.RatingCompat.ay_();
        }
    }
}
