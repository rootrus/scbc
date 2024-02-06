package p040o;

import android.graphics.Bitmap;
import com.drew.imaging.tiff.TiffProcessingException;
import java.io.IOException;
import java.util.HashSet;
import p040o.CheckParameters;

/* renamed from: o.ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver */
public final class ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver implements isHidden$MediaBrowserCompat$CustomActionResultReceiver {
    public static final int compat_button_inset_horizontal_material = 2131165317;
    public static final int compat_button_inset_vertical_material = 2131165318;
    public static final int compat_button_padding_horizontal_material = 2131165319;
    public static final int compat_button_padding_vertical_material = 2131165320;
    public static final int compat_control_corner_material = 2131165321;
    public static final int compat_notification_large_icon_max_height = 2131165322;
    public static final int compat_notification_large_icon_max_width = 2131165323;
    public static final int fastscroll_default_thickness = 2131165554;
    public static final int fastscroll_margin = 2131165555;
    public static final int fastscroll_minimum_range = 2131165556;
    public static final int item_touch_helper_max_drag_scroll_per_frame = 2131165599;
    public static final int item_touch_helper_swipe_escape_max_velocity = 2131165600;
    public static final int item_touch_helper_swipe_escape_velocity = 2131165601;
    public static final int notification_action_icon_size = 2131165789;
    public static final int notification_action_text_size = 2131165790;
    public static final int notification_big_circle_margin = 2131165791;
    public static final int notification_content_margin_start = 2131165792;
    public static final int notification_large_icon_height = 2131165793;
    public static final int notification_large_icon_width = 2131165794;
    public static final int notification_main_column_padding_top = 2131165795;
    public static final int notification_media_narrow_margin = 2131165796;
    public static final int notification_right_icon_size = 2131165797;
    public static final int notification_right_side_padding_top = 2131165798;
    public static final int notification_small_icon_background_padding = 2131165799;
    public static final int notification_small_icon_size_as_large = 2131165800;
    public static final int notification_subtext_size = 2131165801;
    public static final int notification_top_pad = 2131165802;
    public static final int notification_top_pad_large_text = 2131165803;
    private final CheckParameters_MembersInjector IconCompatParcelizer;
    private final CheckParameters.CheckCountry read;

    public ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver(CheckParameters_MembersInjector checkParameters_MembersInjector, CheckParameters.CheckCountry checkCountry) {
        this.IconCompatParcelizer = checkParameters_MembersInjector;
        this.read = checkCountry;
    }

    public final Bitmap read(int i, int i2, Bitmap.Config config) {
        return this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(i, i2, config);
    }

    public final byte[] read(int i) {
        CheckParameters.CheckCountry checkCountry = this.read;
        if (checkCountry == null) {
            return new byte[i];
        }
        return (byte[]) checkCountry.read(i, byte[].class);
    }

    public final int[] write(int i) {
        CheckParameters.CheckCountry checkCountry = this.read;
        if (checkCountry == null) {
            return new int[i];
        }
        return (int[]) checkCountry.read(i, int[].class);
    }

    public final void read(Bitmap bitmap) {
        this.IconCompatParcelizer.write(bitmap);
    }

    public final void write(byte[] bArr) {
        CheckParameters.CheckCountry checkCountry = this.read;
        if (checkCountry != null) {
            checkCountry.MediaBrowserCompat$CustomActionResultReceiver(bArr);
        }
    }

    public final void write(int[] iArr) {
        CheckParameters.CheckCountry checkCountry = this.read;
        if (checkCountry != null) {
            checkCountry.MediaBrowserCompat$CustomActionResultReceiver(iArr);
        }
    }

    public ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02d8, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0342, code lost:
        r3 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0113 A[SYNTHETIC, Splitter:B:68:0x0113] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void read(p040o.getImageHeight r30, p040o.C10820Allocation r31, java.util.Set<java.lang.Integer> r32, int r33, int r34) throws java.io.IOException {
        /*
            r8 = r30
            r9 = r31
            r0 = r32
            r10 = r33
            r11 = r34
            java.lang.Integer r1 = java.lang.Integer.valueOf(r33)     // Catch:{ all -> 0x0403 }
            boolean r1 = r0.contains(r1)     // Catch:{ all -> 0x0403 }
            if (r1 == 0) goto L_0x0018
            r30.read()
            return
        L_0x0018:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r33)     // Catch:{ all -> 0x0403 }
            r0.add(r1)     // Catch:{ all -> 0x0403 }
            long r1 = (long) r10     // Catch:{ all -> 0x0403 }
            long r3 = r31.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x0403 }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x03f6
            if (r10 < 0) goto L_0x03f6
            int r1 = r9.MediaSessionCompat$ResultReceiverWrapper(r10)     // Catch:{ all -> 0x0403 }
            r2 = 255(0xff, float:3.57E-43)
            r13 = 1
            if (r1 <= r2) goto L_0x004c
            r2 = r1 & 255(0xff, float:3.57E-43)
            if (r2 != 0) goto L_0x004c
            boolean r2 = r9.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0403 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0403 }
            int r1 = r1 >> 8
            boolean r3 = r9.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0047 }
            r3 = r3 ^ r13
            r9.MediaBrowserCompat$CustomActionResultReceiver = r3     // Catch:{ all -> 0x0047 }
            r14 = r1
            r15 = r2
            goto L_0x004e
        L_0x0047:
            r0 = move-exception
            r4 = r2
            r12 = r9
            goto L_0x0406
        L_0x004c:
            r14 = r1
            r15 = 0
        L_0x004e:
            int r16 = r14 * 12
            int r1 = r16 + 2
            int r1 = r1 + 4
            int r1 = r1 + r10
            long r1 = (long) r1
            long r3 = r31.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x03f3 }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x006f
            java.lang.String r0 = "Illegally sized IFD"
            r8.read(r0)     // Catch:{ all -> 0x03f3 }
            r30.read()
            if (r15 == 0) goto L_0x006e
            boolean r0 = r15.booleanValue()
            r9.MediaBrowserCompat$CustomActionResultReceiver = r0
        L_0x006e:
            return
        L_0x006f:
            r17 = 0
            r7 = r17
            r18 = r7
        L_0x0075:
            if (r7 >= r14) goto L_0x03a9
            int r1 = r10 + 2
            int r2 = r7 * 12
            int r1 = r1 + r2
            int r6 = r9.MediaSessionCompat$ResultReceiverWrapper(r1)     // Catch:{ all -> 0x03f3 }
            int r2 = r1 + 2
            int r5 = r9.MediaSessionCompat$ResultReceiverWrapper(r2)     // Catch:{ all -> 0x03f3 }
            o.setPreserveFocusAfterLayout r2 = p040o.setPreserveFocusAfterLayout.IconCompatParcelizer(r5)     // Catch:{ all -> 0x03f3 }
            int r3 = r1 + 4
            long r3 = r9.mo15721x50fd9e4a(r3)     // Catch:{ all -> 0x03f3 }
            java.lang.String r12 = "Invalid TIFF tag format code %d for tag 0x%04X"
            r13 = 2
            if (r2 != 0) goto L_0x00dd
            java.lang.Long r2 = r8.MediaBrowserCompat$ItemReceiver((int) r5, (long) r3)     // Catch:{ all -> 0x03f3 }
            if (r2 != 0) goto L_0x00d2
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x03f3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03f3 }
            r1[r17] = r2     // Catch:{ all -> 0x03f3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x03f3 }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x03f3 }
            java.lang.String r1 = java.lang.String.format(r12, r1)     // Catch:{ all -> 0x03f3 }
            r8.read(r1)     // Catch:{ all -> 0x03f3 }
            int r1 = r18 + 1
            r2 = 5
            if (r1 <= r2) goto L_0x00c7
            java.lang.String r0 = "Stopping processing as too many errors seen in TIFF IFD"
            r8.read(r0)     // Catch:{ all -> 0x03f3 }
            r30.read()
            if (r15 == 0) goto L_0x00c6
            boolean r0 = r15.booleanValue()
            r9.MediaBrowserCompat$CustomActionResultReceiver = r0
        L_0x00c6:
            return
        L_0x00c7:
            r18 = r1
            r24 = r7
            r12 = r9
            r20 = r14
        L_0x00ce:
            r3 = 1
        L_0x00cf:
            r4 = 0
            goto L_0x039d
        L_0x00d2:
            long r19 = r2.longValue()     // Catch:{ all -> 0x03f3 }
            r28 = r19
            r20 = r14
            r13 = r28
            goto L_0x00e3
        L_0x00dd:
            int r2 = r2.write     // Catch:{ all -> 0x03f3 }
            r20 = r14
            long r13 = (long) r2
            long r13 = r13 * r3
        L_0x00e3:
            r21 = 4
            int r2 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            r23 = r5
            java.lang.String r5 = "Illegal TIFF tag pointer offset"
            if (r2 <= 0) goto L_0x010a
            int r1 = r1 + 8
            long r1 = r9.mo15721x50fd9e4a(r1)     // Catch:{ all -> 0x038f }
            long r24 = r31.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x038f }
            long r26 = r1 + r13
            int r24 = (r26 > r24 ? 1 : (r26 == r24 ? 0 : -1))
            if (r24 <= 0) goto L_0x0107
            r8.read(r5)     // Catch:{ all -> 0x03f3 }
            r24 = r7
            r12 = r9
            goto L_0x00ce
        L_0x0104:
            r12 = r9
            goto L_0x0407
        L_0x0107:
            long r9 = (long) r11
            long r9 = r9 + r1
            goto L_0x010d
        L_0x010a:
            int r1 = r1 + 8
            long r9 = (long) r1
        L_0x010d:
            r1 = 0
            int r24 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r24 < 0) goto L_0x0394
            long r24 = r31.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x038f }
            int r24 = (r9 > r24 ? 1 : (r9 == r24 ? 0 : -1))
            if (r24 <= 0) goto L_0x011d
            goto L_0x0394
        L_0x011d:
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0374
            long r1 = r9 + r13
            long r24 = r31.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x038f }
            int r1 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r1 <= 0) goto L_0x012d
            goto L_0x0374
        L_0x012d:
            long r21 = r21 * r3
            int r1 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r1 != 0) goto L_0x015e
            r21 = r12
            r24 = r13
            r1 = r17
            r2 = r1
        L_0x013a:
            long r12 = (long) r2     // Catch:{ all -> 0x038f }
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x015b
            boolean r5 = r8.IconCompatParcelizer((int) r6)     // Catch:{ all -> 0x038f }
            if (r5 == 0) goto L_0x0156
            int r1 = r2 << 2
            long r12 = (long) r1
            long r12 = r12 + r9
            int r1 = (int) r12
            r12 = r31
            int r1 = r12.MediaBrowserCompat$MediaItem(r1)     // Catch:{ all -> 0x03f1 }
            int r1 = r1 + r11
            read(r8, r12, r0, r1, r11)     // Catch:{ all -> 0x03f1 }
            r1 = 1
            goto L_0x0158
        L_0x0156:
            r12 = r31
        L_0x0158:
            int r2 = r2 + 1
            goto L_0x013a
        L_0x015b:
            r12 = r31
            goto L_0x0166
        L_0x015e:
            r21 = r12
            r24 = r13
            r12 = r31
            r1 = r17
        L_0x0166:
            if (r1 != 0) goto L_0x0370
            int r9 = (int) r9     // Catch:{ all -> 0x03f1 }
            r13 = r24
            int r10 = (int) r13     // Catch:{ all -> 0x03f1 }
            r1 = r30
            r2 = r9
            r13 = r3
            r3 = r32
            r4 = r34
            r22 = r23
            r5 = r31
            r23 = r6
            r24 = r7
            r7 = r10
            boolean r1 = r1.write(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x03f1 }
            if (r1 != 0) goto L_0x00ce
            int r1 = (int) r13     // Catch:{ all -> 0x03f1 }
            switch(r22) {
                case 1: goto L_0x0335;
                case 2: goto L_0x0325;
                case 3: goto L_0x0300;
                case 4: goto L_0x02db;
                case 5: goto L_0x0299;
                case 6: goto L_0x0275;
                case 7: goto L_0x026a;
                case 8: goto L_0x0245;
                case 9: goto L_0x0220;
                case 10: goto L_0x01db;
                case 11: goto L_0x01b6;
                case 12: goto L_0x018f;
                default: goto L_0x0187;
            }     // Catch:{ all -> 0x03f1 }
        L_0x0187:
            r3 = r23
            r1 = 2
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x03f1 }
            goto L_0x0359
        L_0x018f:
            r2 = 1
            if (r1 != r2) goto L_0x019d
            double r1 = r12.write(r9)     // Catch:{ all -> 0x03f1 }
            r3 = r23
            r8.read((int) r3, (double) r1)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x019d:
            r3 = r23
            double[] r2 = new double[r1]     // Catch:{ all -> 0x03f1 }
            r4 = r17
        L_0x01a3:
            if (r4 >= r1) goto L_0x01b1
            int r5 = r4 << 2
            int r5 = r5 + r9
            double r5 = r12.write(r5)     // Catch:{ all -> 0x03f1 }
            r2[r4] = r5     // Catch:{ all -> 0x03f1 }
            int r4 = r4 + 1
            goto L_0x01a3
        L_0x01b1:
            r8.IconCompatParcelizer((int) r3, (double[]) r2)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x01b6:
            r3 = r23
            r2 = 1
            if (r1 != r2) goto L_0x01c4
            float r1 = r12.MediaBrowserCompat$ItemReceiver(r9)     // Catch:{ all -> 0x03f1 }
            r8.write((int) r3, (float) r1)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x01c4:
            float[] r2 = new float[r1]     // Catch:{ all -> 0x03f1 }
            r4 = r17
        L_0x01c8:
            if (r4 >= r1) goto L_0x01d6
            int r5 = r4 << 2
            int r5 = r5 + r9
            float r5 = r12.MediaBrowserCompat$ItemReceiver(r5)     // Catch:{ all -> 0x03f1 }
            r2[r4] = r5     // Catch:{ all -> 0x03f1 }
            int r4 = r4 + 1
            goto L_0x01c8
        L_0x01d6:
            r8.IconCompatParcelizer((int) r3, (float[]) r2)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x01db:
            r3 = r23
            r2 = 1
            if (r1 != r2) goto L_0x01f6
            o.copy3DRangeFromUnchecked r1 = new o.copy3DRangeFromUnchecked     // Catch:{ all -> 0x03f1 }
            int r2 = r12.MediaBrowserCompat$MediaItem(r9)     // Catch:{ all -> 0x03f1 }
            long r4 = (long) r2     // Catch:{ all -> 0x03f1 }
            int r9 = r9 + 4
            int r2 = r12.MediaBrowserCompat$MediaItem(r9)     // Catch:{ all -> 0x03f1 }
            long r6 = (long) r2     // Catch:{ all -> 0x03f1 }
            r1.<init>(r4, r6)     // Catch:{ all -> 0x03f1 }
            r8.read((int) r3, (p040o.copy3DRangeFromUnchecked) r1)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x01f6:
            if (r1 <= r2) goto L_0x02d8
            o.copy3DRangeFromUnchecked[] r2 = new p040o.copy3DRangeFromUnchecked[r1]     // Catch:{ all -> 0x03f1 }
            r4 = r17
        L_0x01fc:
            if (r4 >= r1) goto L_0x021b
            int r5 = r4 << 3
            o.copy3DRangeFromUnchecked r6 = new o.copy3DRangeFromUnchecked     // Catch:{ all -> 0x03f1 }
            int r7 = r9 + r5
            int r7 = r12.MediaBrowserCompat$MediaItem(r7)     // Catch:{ all -> 0x03f1 }
            long r13 = (long) r7     // Catch:{ all -> 0x03f1 }
            int r7 = r9 + 4
            int r7 = r7 + r5
            int r5 = r12.MediaBrowserCompat$MediaItem(r7)     // Catch:{ all -> 0x03f1 }
            long r10 = (long) r5     // Catch:{ all -> 0x03f1 }
            r6.<init>(r13, r10)     // Catch:{ all -> 0x03f1 }
            r2[r4] = r6     // Catch:{ all -> 0x03f1 }
            int r4 = r4 + 1
            r11 = r34
            goto L_0x01fc
        L_0x021b:
            r8.MediaBrowserCompat$CustomActionResultReceiver((int) r3, (p040o.copy3DRangeFromUnchecked[]) r2)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x0220:
            r3 = r23
            r2 = 1
            if (r1 != r2) goto L_0x022e
            int r1 = r12.MediaBrowserCompat$MediaItem(r9)     // Catch:{ all -> 0x03f1 }
            r8.MediaBrowserCompat$ItemReceiver((int) r3, (int) r1)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x022e:
            int[] r2 = new int[r1]     // Catch:{ all -> 0x03f1 }
            r4 = r17
        L_0x0232:
            if (r4 >= r1) goto L_0x0240
            int r5 = r4 << 2
            int r5 = r5 + r9
            int r5 = r12.MediaBrowserCompat$MediaItem(r5)     // Catch:{ all -> 0x03f1 }
            r2[r4] = r5     // Catch:{ all -> 0x03f1 }
            int r4 = r4 + 1
            goto L_0x0232
        L_0x0240:
            r8.IconCompatParcelizer((int) r3, (int[]) r2)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x0245:
            r3 = r23
            r2 = 1
            if (r1 != r2) goto L_0x0253
            short r1 = r12.IconCompatParcelizer(r9)     // Catch:{ all -> 0x03f1 }
            r8.read((int) r3, (int) r1)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x0253:
            short[] r2 = new short[r1]     // Catch:{ all -> 0x03f1 }
            r4 = r17
        L_0x0257:
            if (r4 >= r1) goto L_0x0265
            int r5 = r4 << 1
            int r5 = r5 + r9
            short r5 = r12.IconCompatParcelizer(r5)     // Catch:{ all -> 0x03f1 }
            r2[r4] = r5     // Catch:{ all -> 0x03f1 }
            int r4 = r4 + 1
            goto L_0x0257
        L_0x0265:
            r8.MediaBrowserCompat$CustomActionResultReceiver((int) r3, (short[]) r2)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x026a:
            r3 = r23
            byte[] r1 = r12.MediaBrowserCompat$ItemReceiver(r9, r1)     // Catch:{ all -> 0x03f1 }
            r8.write((int) r3, (byte[]) r1)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x0275:
            r3 = r23
            r2 = 1
            if (r1 != r2) goto L_0x0283
            byte r1 = r12.RatingCompat(r9)     // Catch:{ all -> 0x03f1 }
            r8.MediaBrowserCompat$ItemReceiver((int) r3, (byte) r1)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x0283:
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x03f1 }
            r4 = r17
        L_0x0287:
            if (r4 >= r1) goto L_0x0294
            int r5 = r9 + r4
            byte r5 = r12.RatingCompat(r5)     // Catch:{ all -> 0x03f1 }
            r2[r4] = r5     // Catch:{ all -> 0x03f1 }
            int r4 = r4 + 1
            goto L_0x0287
        L_0x0294:
            r8.read((int) r3, (byte[]) r2)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x0299:
            r3 = r23
            r2 = 1
            if (r1 != r2) goto L_0x02b2
            o.copy3DRangeFromUnchecked r1 = new o.copy3DRangeFromUnchecked     // Catch:{ all -> 0x03f1 }
            long r4 = r12.mo15721x50fd9e4a(r9)     // Catch:{ all -> 0x03f1 }
            int r9 = r9 + 4
            long r6 = r12.mo15721x50fd9e4a(r9)     // Catch:{ all -> 0x03f1 }
            r1.<init>(r4, r6)     // Catch:{ all -> 0x03f1 }
            r8.read((int) r3, (p040o.copy3DRangeFromUnchecked) r1)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x02b2:
            if (r1 <= r2) goto L_0x02d8
            o.copy3DRangeFromUnchecked[] r2 = new p040o.copy3DRangeFromUnchecked[r1]     // Catch:{ all -> 0x03f1 }
            r4 = r17
        L_0x02b8:
            if (r4 >= r1) goto L_0x02d3
            int r5 = r4 << 3
            o.copy3DRangeFromUnchecked r6 = new o.copy3DRangeFromUnchecked     // Catch:{ all -> 0x03f1 }
            int r7 = r9 + r5
            long r10 = r12.mo15721x50fd9e4a(r7)     // Catch:{ all -> 0x03f1 }
            int r7 = r9 + 4
            int r7 = r7 + r5
            long r13 = r12.mo15721x50fd9e4a(r7)     // Catch:{ all -> 0x03f1 }
            r6.<init>(r10, r13)     // Catch:{ all -> 0x03f1 }
            r2[r4] = r6     // Catch:{ all -> 0x03f1 }
            int r4 = r4 + 1
            goto L_0x02b8
        L_0x02d3:
            r8.MediaBrowserCompat$CustomActionResultReceiver((int) r3, (p040o.copy3DRangeFromUnchecked[]) r2)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x02d8:
            r3 = r2
            goto L_0x00cf
        L_0x02db:
            r3 = r23
            r2 = 1
            if (r1 != r2) goto L_0x02e9
            long r1 = r12.mo15721x50fd9e4a(r9)     // Catch:{ all -> 0x03f1 }
            r8.IconCompatParcelizer((int) r3, (long) r1)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x02e9:
            long[] r2 = new long[r1]     // Catch:{ all -> 0x03f1 }
            r4 = r17
        L_0x02ed:
            if (r4 >= r1) goto L_0x02fb
            int r5 = r4 << 2
            int r5 = r5 + r9
            long r5 = r12.mo15721x50fd9e4a(r5)     // Catch:{ all -> 0x03f1 }
            r2[r4] = r5     // Catch:{ all -> 0x03f1 }
            int r4 = r4 + 1
            goto L_0x02ed
        L_0x02fb:
            r8.read((int) r3, (long[]) r2)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x0300:
            r3 = r23
            r2 = 1
            if (r1 != r2) goto L_0x030e
            int r1 = r12.MediaSessionCompat$ResultReceiverWrapper(r9)     // Catch:{ all -> 0x03f1 }
            r8.IconCompatParcelizer((int) r3, (int) r1)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x030e:
            int[] r2 = new int[r1]     // Catch:{ all -> 0x03f1 }
            r4 = r17
        L_0x0312:
            if (r4 >= r1) goto L_0x0320
            int r5 = r4 << 1
            int r5 = r5 + r9
            int r5 = r12.MediaSessionCompat$ResultReceiverWrapper(r5)     // Catch:{ all -> 0x03f1 }
            r2[r4] = r5     // Catch:{ all -> 0x03f1 }
            int r4 = r4 + 1
            goto L_0x0312
        L_0x0320:
            r8.write((int) r3, (int[]) r2)     // Catch:{ all -> 0x03f1 }
            goto L_0x00ce
        L_0x0325:
            r3 = r23
            byte[] r1 = r12.MediaBrowserCompat$CustomActionResultReceiver(r9, r1)     // Catch:{ all -> 0x03f1 }
            o.createFromBitmap r2 = new o.createFromBitmap     // Catch:{ all -> 0x03f1 }
            r4 = 0
            r2.<init>(r1, r4)     // Catch:{ all -> 0x03f1 }
            r8.MediaBrowserCompat$CustomActionResultReceiver((int) r3, (p040o.createFromBitmap) r2)     // Catch:{ all -> 0x03f1 }
            goto L_0x0342
        L_0x0335:
            r3 = r23
            r2 = 1
            r4 = 0
            if (r1 != r2) goto L_0x0344
            short r1 = r12.MediaSessionCompat$QueueItem(r9)     // Catch:{ all -> 0x03f1 }
            r8.write((int) r3, (short) r1)     // Catch:{ all -> 0x03f1 }
        L_0x0342:
            r3 = 1
            goto L_0x039d
        L_0x0344:
            short[] r2 = new short[r1]     // Catch:{ all -> 0x03f1 }
            r5 = r17
        L_0x0348:
            if (r5 >= r1) goto L_0x0355
            int r6 = r9 + r5
            short r6 = r12.MediaSessionCompat$QueueItem(r6)     // Catch:{ all -> 0x03f1 }
            r2[r5] = r6     // Catch:{ all -> 0x03f1 }
            int r5 = r5 + 1
            goto L_0x0348
        L_0x0355:
            r8.IconCompatParcelizer((int) r3, (short[]) r2)     // Catch:{ all -> 0x03f1 }
            goto L_0x0342
        L_0x0359:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x03f1 }
            r1[r17] = r2     // Catch:{ all -> 0x03f1 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x03f1 }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x03f1 }
            r2 = r21
            java.lang.String r1 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x03f1 }
            r8.read(r1)     // Catch:{ all -> 0x03f1 }
            goto L_0x039d
        L_0x0370:
            r24 = r7
            goto L_0x00ce
        L_0x0374:
            r12 = r31
            r24 = r7
            r3 = 1
            r4 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f1 }
            r1.<init>()     // Catch:{ all -> 0x03f1 }
            java.lang.String r2 = "Illegal number of bytes for TIFF tag data: "
            r1.append(r2)     // Catch:{ all -> 0x03f1 }
            r1.append(r13)     // Catch:{ all -> 0x03f1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x03f1 }
            r8.read(r1)     // Catch:{ all -> 0x03f1 }
            goto L_0x039d
        L_0x038f:
            r0 = move-exception
            r12 = r31
            goto L_0x0407
        L_0x0394:
            r12 = r31
            r24 = r7
            r3 = 1
            r4 = 0
            r8.read(r5)     // Catch:{ all -> 0x03f1 }
        L_0x039d:
            int r7 = r24 + 1
            r10 = r33
            r11 = r34
            r13 = r3
            r9 = r12
            r14 = r20
            goto L_0x0075
        L_0x03a9:
            r12 = r9
            r1 = r33
            int r2 = r1 + 2
            int r2 = r2 + r16
            int r2 = r12.MediaBrowserCompat$MediaItem(r2)     // Catch:{ all -> 0x03f1 }
            if (r2 == 0) goto L_0x03e5
            r3 = r34
            int r2 = r2 + r3
            long r4 = (long) r2     // Catch:{ all -> 0x03f1 }
            long r6 = r31.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x03f1 }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x03ce
            r30.read()
            if (r15 == 0) goto L_0x03cd
            boolean r0 = r15.booleanValue()
            r12.MediaBrowserCompat$CustomActionResultReceiver = r0
        L_0x03cd:
            return
        L_0x03ce:
            if (r2 >= r1) goto L_0x03dc
            r30.read()
            if (r15 == 0) goto L_0x03db
            boolean r0 = r15.booleanValue()
            r12.MediaBrowserCompat$CustomActionResultReceiver = r0
        L_0x03db:
            return
        L_0x03dc:
            boolean r1 = r30.IconCompatParcelizer()     // Catch:{ all -> 0x03f1 }
            if (r1 == 0) goto L_0x03e5
            read(r8, r12, r0, r2, r3)     // Catch:{ all -> 0x03f1 }
        L_0x03e5:
            r30.read()
            if (r15 == 0) goto L_0x03f0
            boolean r0 = r15.booleanValue()
            r12.MediaBrowserCompat$CustomActionResultReceiver = r0
        L_0x03f0:
            return
        L_0x03f1:
            r0 = move-exception
            goto L_0x0407
        L_0x03f3:
            r0 = move-exception
            goto L_0x0104
        L_0x03f6:
            r12 = r9
            r4 = 0
            java.lang.String r0 = "Ignored IFD marked to start outside data segment"
            r8.read(r0)     // Catch:{ all -> 0x0401 }
            r30.read()
            return
        L_0x0401:
            r0 = move-exception
            goto L_0x0406
        L_0x0403:
            r0 = move-exception
            r12 = r9
            r4 = 0
        L_0x0406:
            r15 = r4
        L_0x0407:
            r30.read()
            if (r15 == 0) goto L_0x0412
            boolean r1 = r15.booleanValue()
            r12.MediaBrowserCompat$CustomActionResultReceiver = r1
        L_0x0412:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(o.getImageHeight, o.Allocation, java.util.Set, int, int):void");
    }

    public static void IconCompatParcelizer(C10820Allocation allocation, getImageHeight getimageheight, int i) throws TiffProcessingException, IOException {
        short IconCompatParcelizer2 = allocation.IconCompatParcelizer(i);
        if (IconCompatParcelizer2 == 19789) {
            allocation.MediaBrowserCompat$CustomActionResultReceiver = true;
        } else if (IconCompatParcelizer2 == 18761) {
            allocation.MediaBrowserCompat$CustomActionResultReceiver = false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unclear distinction between Motorola/Intel byte ordering: ");
            sb.append(IconCompatParcelizer2);
            throw new TiffProcessingException(sb.toString());
        }
        int i2 = i + 2;
        getimageheight.MediaBrowserCompat$CustomActionResultReceiver(allocation.MediaSessionCompat$ResultReceiverWrapper(i2));
        int MediaBrowserCompat$MediaItem = allocation.MediaBrowserCompat$MediaItem(i + 4) + i;
        if (((long) MediaBrowserCompat$MediaItem) >= allocation.MediaBrowserCompat$ItemReceiver() - 1) {
            getimageheight.IconCompatParcelizer("First IFD offset is beyond the end of the TIFF data segment -- trying default offset");
            MediaBrowserCompat$MediaItem = i2 + 2 + 4;
        }
        read(getimageheight, allocation, new HashSet(), MediaBrowserCompat$MediaItem, i);
    }
}
