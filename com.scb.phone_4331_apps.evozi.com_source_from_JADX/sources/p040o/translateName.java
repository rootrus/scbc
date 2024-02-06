package p040o;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import p040o.Component;
import p040o.writeUInt64NoTag;

/* renamed from: o.translateName */
public final class translateName extends writeUInt64NoTag<getFirstName$MediaBrowserCompat$CustomActionResultReceiver> {
    public String IconCompatParcelizer;
    public intoSet MediaBrowserCompat$ItemReceiver;
    public Component.C31841 read;
    public Component$$Lambda$3 write;

    /* renamed from: o.translateName$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName$MediaBrowserCompat$CustomActionResultReceiver> {
        private /* synthetic */ double MediaBrowserCompat$CustomActionResultReceiver;

        MediaDescriptionCompat(double d) {
            this.MediaBrowserCompat$CustomActionResultReceiver = d;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getFirstName$MediaBrowserCompat$CustomActionResultReceiver getfirstname_mediabrowsercompat_customactionresultreceiver = (getFirstName$MediaBrowserCompat$CustomActionResultReceiver) obj;
            getfirstname_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            getfirstname_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat();
            getfirstname_mediabrowsercompat_customactionresultreceiver.read(false);
        }
    }

    /* renamed from: o.translateName$MediaMetadataCompat */
    static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName$MediaBrowserCompat$CustomActionResultReceiver> {
        private /* synthetic */ double read;

        MediaMetadataCompat(double d) {
            this.read = d;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getFirstName$MediaBrowserCompat$CustomActionResultReceiver getfirstname_mediabrowsercompat_customactionresultreceiver = (getFirstName$MediaBrowserCompat$CustomActionResultReceiver) obj;
            getfirstname_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(this.read);
            getfirstname_mediabrowsercompat_customactionresultreceiver.RatingCompat();
            getfirstname_mediabrowsercompat_customactionresultreceiver.read(false);
        }
    }

    /* renamed from: o.translateName$RatingCompat */
    static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName$MediaBrowserCompat$CustomActionResultReceiver> {
        private /* synthetic */ double IconCompatParcelizer;

        RatingCompat(double d) {
            this.IconCompatParcelizer = d;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getFirstName$MediaBrowserCompat$CustomActionResultReceiver getfirstname_mediabrowsercompat_customactionresultreceiver = (getFirstName$MediaBrowserCompat$CustomActionResultReceiver) obj;
            getfirstname_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
            getfirstname_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem();
            getfirstname_mediabrowsercompat_customactionresultreceiver.read(false);
        }
    }

    /* renamed from: o.translateName$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName$MediaBrowserCompat$CustomActionResultReceiver> {
        private /* synthetic */ onNotNowClick$MediaBrowserCompat$ItemReceiver read;

        public read(onNotNowClick$MediaBrowserCompat$ItemReceiver onnotnowclick_mediabrowsercompat_itemreceiver) {
            this.read = onnotnowclick_mediabrowsercompat_itemreceiver;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getFirstName$MediaBrowserCompat$CustomActionResultReceiver) obj).IconCompatParcelizer(this.read.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.translateName$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName$MediaBrowserCompat$CustomActionResultReceiver> {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getFirstName$MediaBrowserCompat$CustomActionResultReceiver) obj).IconCompatParcelizer();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public translateName(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }

    /* renamed from: o.translateName$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements findFragmentByWho {
        private final /* synthetic */ KeepName IconCompatParcelizer;
        private final /* synthetic */ List read;

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(KeepName keepName, List list) {
            this.IconCompatParcelizer = keepName;
            this.read = list;
        }

        public final Object IconCompatParcelizer(Object obj) {
            return this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.read, (ShapeTrimPathParser) obj);
        }
    }

    public final void IconCompatParcelizer(double d) {
        Component$$Lambda$3 component$$Lambda$3 = this.write;
        if (component$$Lambda$3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplay");
        }
        component$$Lambda$3.MediaBrowserCompat$CustomActionResultReceiver = d;
        writeUInt64NoTag.IconCompatParcelizer translatename_mediabrowsercompat_customactionresultreceiver = new translateName$MediaBrowserCompat$CustomActionResultReceiver(this);
        if (this.RatingCompat != null) {
            translatename_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(this.RatingCompat);
        }
    }

    /* access modifiers changed from: private */
    public final int IconCompatParcelizer() {
        intoSet intoset = this.MediaBrowserCompat$ItemReceiver;
        if (intoset == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplayModel");
        }
        int intValue = intoset.PlaybackStateCompat$CustomAction.intValue();
        Component$$Lambda$3 component$$Lambda$3 = this.write;
        if (component$$Lambda$3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplay");
        }
        return intValue * ((int) component$$Lambda$3.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(translateName translatename) {
        Component.C31841 r0 = translatename.read;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quotaLimitDisplayModel");
        }
        int i = r0.read;
        Component.C31841 r02 = translatename.read;
        if (r02 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quotaLimitDisplayModel");
        }
        int i2 = r02.write;
        Component.C31841 r03 = translatename.read;
        if (r03 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quotaLimitDisplayModel");
        }
        boolean z = r03.MediaBrowserCompat$ItemReceiver;
        Component$$Lambda$3 component$$Lambda$3 = translatename.write;
        if (component$$Lambda$3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplay");
        }
        writeUInt64NoTag.IconCompatParcelizer translatename_mediabrowsercompat_itemreceiver = new translateName$MediaBrowserCompat$ItemReceiver(translatename, component$$Lambda$3.MediaBrowserCompat$CustomActionResultReceiver, z, i, i2);
        if (translatename.RatingCompat != null) {
            translatename_mediabrowsercompat_itemreceiver.IconCompatParcelizer(translatename.RatingCompat);
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(translateName translatename) {
        String str = translatename.IconCompatParcelizer;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("myRewardPoints");
        }
        Double MediaBrowserCompat$ItemReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str);
        Component$$Lambda$3 component$$Lambda$3 = translatename.write;
        if (component$$Lambda$3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplay");
        }
        double d = component$$Lambda$3.MediaBrowserCompat$CustomActionResultReceiver;
        Component.C31841 r3 = translatename.read;
        if (r3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quotaLimitDisplayModel");
        }
        int i = r3.write;
        boolean z = true;
        if (Double.compare(MediaBrowserCompat$ItemReceiver2.doubleValue(), (double) translatename.IconCompatParcelizer()) < 0) {
            writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new MediaMetadataCompat(d);
            if (translatename.RatingCompat == null) {
                z = false;
            }
            if (z) {
                mediaMetadataCompat.IconCompatParcelizer(translatename.RatingCompat);
            }
        } else if (d > ((double) i)) {
            writeUInt64NoTag.IconCompatParcelizer ratingCompat = new RatingCompat(d);
            if (translatename.RatingCompat == null) {
                z = false;
            }
            if (z) {
                ratingCompat.IconCompatParcelizer(translatename.RatingCompat);
            }
        }
    }

    public static final /* synthetic */ void read(translateName translatename) {
        String str = translatename.IconCompatParcelizer;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("myRewardPoints");
        }
        Double MediaBrowserCompat$ItemReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str);
        Component$$Lambda$3 component$$Lambda$3 = translatename.write;
        if (component$$Lambda$3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quantityDisplay");
        }
        double d = component$$Lambda$3.MediaBrowserCompat$CustomActionResultReceiver;
        Component.C31841 r3 = translatename.read;
        if (r3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quotaLimitDisplayModel");
        }
        int i = r3.read;
        Component.C31841 r5 = translatename.read;
        if (r5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quotaLimitDisplayModel");
        }
        int i2 = r5.write;
        boolean z = true;
        if (Double.compare(MediaBrowserCompat$ItemReceiver2.doubleValue(), (double) translatename.IconCompatParcelizer()) < 0) {
            writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new MediaMetadataCompat(d);
            if (translatename.RatingCompat == null) {
                z = false;
            }
            if (z) {
                mediaMetadataCompat.IconCompatParcelizer(translatename.RatingCompat);
            }
        } else if (d > ((double) i2)) {
            writeUInt64NoTag.IconCompatParcelizer ratingCompat = new RatingCompat(d);
            if (translatename.RatingCompat == null) {
                z = false;
            }
            if (z) {
                ratingCompat.IconCompatParcelizer(translatename.RatingCompat);
            }
        } else if (d > ((double) i)) {
            writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new MediaDescriptionCompat(d);
            if (translatename.RatingCompat == null) {
                z = false;
            }
            if (z) {
                mediaDescriptionCompat.IconCompatParcelizer(translatename.RatingCompat);
            }
        }
    }

    public static final /* synthetic */ String MediaBrowserCompat$ItemReceiver(translateName translatename) {
        Component.C31841 r0 = translatename.read;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quotaLimitDisplayModel");
        }
        int i = r0.read;
        Component.C31841 r2 = translatename.read;
        if (r2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quotaLimitDisplayModel");
        }
        if (i < r2.write) {
            Component.C31841 r6 = translatename.read;
            if (r6 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("quotaLimitDisplayModel");
            }
            BigDecimal valueOf = BigDecimal.valueOf((long) r6.read);
            onGetStartedClick.IconCompatParcelizer((Object) valueOf, "BigDecimal.valueOf(this.toLong())");
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
            decimalFormatSymbols.setGroupingSeparator(',');
            String format = new DecimalFormat("###,###,###,###,###,##0", decimalFormatSymbols).format(valueOf);
            onGetStartedClick.IconCompatParcelizer((Object) format, "Utilities.amountBigDecim…uotaLimit.toBigDecimal())");
            return format;
        }
        Component.C31841 r62 = translatename.read;
        if (r62 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("quotaLimitDisplayModel");
        }
        BigDecimal valueOf2 = BigDecimal.valueOf((long) r62.write);
        onGetStartedClick.IconCompatParcelizer((Object) valueOf2, "BigDecimal.valueOf(this.toLong())");
        DecimalFormatSymbols decimalFormatSymbols2 = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols2.setGroupingSeparator(',');
        String format2 = new DecimalFormat("###,###,###,###,###,##0", decimalFormatSymbols2).format(valueOf2);
        onGetStartedClick.IconCompatParcelizer((Object) format2, "Utilities.amountBigDecim…tor(stock.toBigDecimal())");
        return format2;
    }
}
