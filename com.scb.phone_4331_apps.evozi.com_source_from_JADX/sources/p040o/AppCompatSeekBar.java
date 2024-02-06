package p040o;

import android.util.Log;
import com.scb.phone.R;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: o.AppCompatSeekBar */
public final class AppCompatSeekBar {
    public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
    public Runnable MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.AppCompatSeekBar$read */
    public static final class read {
        public static final int[] ColorStateListItem = {16843173, 16843551, R.attr.alpha};
        public static final int ColorStateListItem_alpha = 2;
        public static final int ColorStateListItem_android_alpha = 1;
        public static final int ColorStateListItem_android_color = 0;
        public static final int[] FontFamily = {R.attr.fontProviderAuthority, R.attr.fontProviderCerts, R.attr.fontProviderFetchStrategy, R.attr.fontProviderFetchTimeout, R.attr.fontProviderPackage, R.attr.fontProviderQuery};
        public static final int[] FontFamilyFont = {16844082, 16844083, 16844095, 16844143, 16844144, R.attr.font, R.attr.fontStyle, R.attr.fontVariationSettings, R.attr.fontWeight, R.attr.ttcIndex};
        public static final int FontFamilyFont_android_font = 0;
        public static final int FontFamilyFont_android_fontStyle = 2;
        public static final int FontFamilyFont_android_fontVariationSettings = 4;
        public static final int FontFamilyFont_android_fontWeight = 1;
        public static final int FontFamilyFont_android_ttcIndex = 3;
        public static final int FontFamilyFont_font = 5;
        public static final int FontFamilyFont_fontStyle = 6;
        public static final int FontFamilyFont_fontVariationSettings = 7;
        public static final int FontFamilyFont_fontWeight = 8;
        public static final int FontFamilyFont_ttcIndex = 9;
        public static final int FontFamily_fontProviderAuthority = 0;
        public static final int FontFamily_fontProviderCerts = 1;
        public static final int FontFamily_fontProviderFetchStrategy = 2;
        public static final int FontFamily_fontProviderFetchTimeout = 3;
        public static final int FontFamily_fontProviderPackage = 4;
        public static final int FontFamily_fontProviderQuery = 5;
        public static final int[] GradientColor = {16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051};
        public static final int[] GradientColorItem = {16843173, 16844052};
        public static final int GradientColorItem_android_color = 0;
        public static final int GradientColorItem_android_offset = 1;
        public static final int GradientColor_android_centerColor = 7;
        public static final int GradientColor_android_centerX = 3;
        public static final int GradientColor_android_centerY = 4;
        public static final int GradientColor_android_endColor = 1;
        public static final int GradientColor_android_endX = 10;
        public static final int GradientColor_android_endY = 11;
        public static final int GradientColor_android_gradientRadius = 5;
        public static final int GradientColor_android_startColor = 0;
        public static final int GradientColor_android_startX = 8;
        public static final int GradientColor_android_startY = 9;
        public static final int GradientColor_android_tileMode = 6;
        public static final int GradientColor_android_type = 2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    static {
        /*
            o.TierPricingInstallmentAdapter$InstallmentViewHolder[] r0 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            $SwitchMap$org$threeten$bp$temporal$ChronoField = r0
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x001d }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x001d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0028 }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0033 }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x003e }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x003e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r2 = 5
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0049 }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r2 = 6
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0054 }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ERA     // Catch:{ NoSuchFieldError -> 0x0054 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
            r2 = 7
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AppCompatSeekBar.<clinit>():void");
    }

    /* renamed from: o.AppCompatSeekBar$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
        public static final int action_container = 2131296313;
        public static final int action_divider = 2131296315;
        public static final int action_image = 2131296316;
        public static final int action_text = 2131296326;
        public static final int actions = 2131296327;
        public static final int async = 2131296431;
        public static final int blocking = 2131296572;
        public static final int chronometer = 2131297036;
        public static final int forever = 2131297802;
        public static final int icon = 2131298138;
        public static final int icon_group = 2131298145;
        public static final int info = 2131298278;
        public static final int italic = 2131298360;
        public static final int line1 = 2131298936;
        public static final int line3 = 2131298937;
        public static final int normal = 2131299387;
        public static final int notification_background = 2131299393;
        public static final int notification_main_column = 2131299394;
        public static final int notification_main_column_container = 2131299395;
        public static final int right_icon = 2131299901;
        public static final int right_side = 2131299902;
        public static final int tag_transition_group = 2131300355;
        public static final int tag_unhandled_key_event_manager = 2131300356;
        public static final int tag_unhandled_key_listeners = 2131300357;
        public static final int text = 2131300379;
        public static final int text2 = 2131300381;
        public static final int time = 2131300688;
        public static final int title = 2131300689;
        public AppCompatSeekBar$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
        public final byte[] MediaBrowserCompat$CustomActionResultReceiver = new byte[256];
        public int MediaBrowserCompat$ItemReceiver = 0;
        public ByteBuffer read;

        public int MediaBrowserCompat$CustomActionResultReceiver() {
            try {
                return this.read.get() & 255;
            } catch (Exception unused) {
                this.IconCompatParcelizer.MediaDescriptionCompat = 1;
                return 0;
            }
        }

        private void IconCompatParcelizer() {
            int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
            this.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver2;
            if (MediaBrowserCompat$CustomActionResultReceiver2 > 0) {
                int i = 0;
                int i2 = 0;
                while (i2 < this.MediaBrowserCompat$ItemReceiver) {
                    try {
                        i = this.MediaBrowserCompat$ItemReceiver - i2;
                        this.read.get(this.MediaBrowserCompat$CustomActionResultReceiver, i2, i);
                        i2 += i;
                    } catch (Exception e) {
                        if (Log.isLoggable("GifHeaderParser", 3)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error Reading Block n: ");
                            sb.append(i2);
                            sb.append(" count: ");
                            sb.append(i);
                            sb.append(" blockSize: ");
                            sb.append(this.MediaBrowserCompat$ItemReceiver);
                            Log.d("GifHeaderParser", sb.toString(), e);
                        }
                        this.IconCompatParcelizer.MediaDescriptionCompat = 1;
                        return;
                    }
                }
            }
        }

        public int[] MediaBrowserCompat$CustomActionResultReceiver(int i) {
            byte[] bArr = new byte[(i * 3)];
            int[] iArr = null;
            try {
                this.read.get(bArr);
                iArr = new int[256];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = i2 + 1;
                    int i5 = i4 + 1;
                    iArr[i3] = ((bArr[i2] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                    i2 = i5 + 1;
                }
            } catch (BufferUnderflowException e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
                }
                this.IconCompatParcelizer.MediaDescriptionCompat = 1;
            }
            return iArr;
        }

        public void MediaBrowserCompat$ItemReceiver() {
            boolean z = false;
            while (!z) {
                if (!(this.IconCompatParcelizer.MediaDescriptionCompat != 0) && this.IconCompatParcelizer.IconCompatParcelizer <= Integer.MAX_VALUE) {
                    int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
                    if (MediaBrowserCompat$CustomActionResultReceiver2 == 33) {
                        int MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver();
                        if (MediaBrowserCompat$CustomActionResultReceiver3 == 1) {
                            write();
                        } else if (MediaBrowserCompat$CustomActionResultReceiver3 == 249) {
                            this.IconCompatParcelizer.read = new AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver();
                            MediaBrowserCompat$CustomActionResultReceiver();
                            int MediaBrowserCompat$CustomActionResultReceiver4 = MediaBrowserCompat$CustomActionResultReceiver();
                            this.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver = (MediaBrowserCompat$CustomActionResultReceiver4 & 28) >> 2;
                            if (this.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver == 0) {
                                this.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver = 1;
                            }
                            this.IconCompatParcelizer.read.ParcelableVolumeInfo = (MediaBrowserCompat$CustomActionResultReceiver4 & 1) != 0;
                            short s = this.read.getShort();
                            if (s < 2) {
                                s = 10;
                            }
                            this.IconCompatParcelizer.read.write = s * 10;
                            this.IconCompatParcelizer.read.RatingCompat = MediaBrowserCompat$CustomActionResultReceiver();
                            MediaBrowserCompat$CustomActionResultReceiver();
                        } else if (MediaBrowserCompat$CustomActionResultReceiver3 == 254) {
                            write();
                        } else if (MediaBrowserCompat$CustomActionResultReceiver3 != 255) {
                            write();
                        } else {
                            IconCompatParcelizer();
                            StringBuilder sb = new StringBuilder();
                            for (int i = 0; i < 11; i++) {
                                sb.append((char) this.MediaBrowserCompat$CustomActionResultReceiver[i]);
                            }
                            if (sb.toString().equals("NETSCAPE2.0")) {
                                read();
                            } else {
                                write();
                            }
                        }
                    } else if (MediaBrowserCompat$CustomActionResultReceiver2 == 44) {
                        if (this.IconCompatParcelizer.read == null) {
                            this.IconCompatParcelizer.read = new AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver();
                        }
                        this.IconCompatParcelizer.read.MediaBrowserCompat$SearchResultReceiver = this.read.getShort();
                        this.IconCompatParcelizer.read.MediaDescriptionCompat = this.read.getShort();
                        this.IconCompatParcelizer.read.MediaMetadataCompat = this.read.getShort();
                        this.IconCompatParcelizer.read.IconCompatParcelizer = this.read.getShort();
                        int MediaBrowserCompat$CustomActionResultReceiver5 = MediaBrowserCompat$CustomActionResultReceiver();
                        boolean z2 = (MediaBrowserCompat$CustomActionResultReceiver5 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (double) ((MediaBrowserCompat$CustomActionResultReceiver5 & 7) + 1));
                        this.IconCompatParcelizer.read.MediaBrowserCompat$ItemReceiver = (MediaBrowserCompat$CustomActionResultReceiver5 & 64) != 0;
                        if (z2) {
                            this.IconCompatParcelizer.read.MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver(pow);
                        } else {
                            this.IconCompatParcelizer.read.MediaBrowserCompat$MediaItem = null;
                        }
                        this.IconCompatParcelizer.read.read = this.read.position();
                        MediaBrowserCompat$CustomActionResultReceiver();
                        write();
                        if (!(this.IconCompatParcelizer.MediaDescriptionCompat != 0)) {
                            this.IconCompatParcelizer.IconCompatParcelizer++;
                            this.IconCompatParcelizer.write.add(this.IconCompatParcelizer.read);
                        }
                    } else if (MediaBrowserCompat$CustomActionResultReceiver2 != 59) {
                        this.IconCompatParcelizer.MediaDescriptionCompat = 1;
                    } else {
                        z = true;
                    }
                } else {
                    return;
                }
            }
        }

        private void read() {
            boolean z;
            do {
                IconCompatParcelizer();
                if (this.MediaBrowserCompat$ItemReceiver <= 0) {
                    return;
                }
                if (this.IconCompatParcelizer.MediaDescriptionCompat != 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } while (!z);
        }

        private void write() {
            int MediaBrowserCompat$CustomActionResultReceiver2;
            do {
                MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
                this.read.position(Math.min(this.read.position() + MediaBrowserCompat$CustomActionResultReceiver2, this.read.limit()));
            } while (MediaBrowserCompat$CustomActionResultReceiver2 > 0);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.TierPricingInstallmentAdapter$InstallmentViewHolder[] r0 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$threeten$bp$temporal$ChronoField = r0
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x001d }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.AppCompatSeekBar.IconCompatParcelizer.<clinit>():void");
        }
    }
}
