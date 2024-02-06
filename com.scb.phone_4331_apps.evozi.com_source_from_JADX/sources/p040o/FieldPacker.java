package p040o;

import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p040o.C10821Element;
import p040o.rsnScriptInvokeV;

/* renamed from: o.FieldPacker */
public final class FieldPacker extends C10821Element.C11751 {
    public float AlertController$RecycleListView = 3.0f;
    public float AppCompatActivity = BitmapDescriptorFactory.HUE_RED;
    public read AppCompatDialogFragment = read.BOTTOM;
    public rsnScriptInvokeV[] IconCompatParcelizer = new rsnScriptInvokeV[0];
    public write Keep = write.HORIZONTAL;
    public List<Float2> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList(16);
    public List<Float2> MediaBrowserCompat$ItemReceiver = new ArrayList(16);
    public float MediaBrowserCompat$MediaItem = 8.0f;
    public FieldPacker$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$SearchResultReceiver = FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.LEFT;
    public float MediaDescriptionCompat = 3.0f;
    public float MediaMetadataCompat = 5.0f;
    public float PlaybackStateCompat = BitmapDescriptorFactory.HUE_RED;
    public FieldPacker$MediaBrowserCompat$ItemReceiver PlaybackStateCompat$CustomAction = FieldPacker$MediaBrowserCompat$ItemReceiver.SQUARE;
    public float RatingCompat = 0.95f;
    public IconCompatParcelizer read = IconCompatParcelizer.LEFT_TO_RIGHT;
    public float setContentView = 6.0f;
    public float setHasDecor = BitmapDescriptorFactory.HUE_RED;
    public List<Boolean> write = new ArrayList(16);

    /* renamed from: o.FieldPacker$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    /* renamed from: o.FieldPacker$read */
    public enum read {
        TOP,
        CENTER,
        BOTTOM
    }

    /* renamed from: o.FieldPacker$write */
    public enum write {
        HORIZONTAL,
        VERTICAL
    }

    public FieldPacker() {
        this.MediaSessionCompat$QueueItem = subShort3.read(10.0f);
        this.MediaSessionCompat$Token = subShort3.read(5.0f);
        this.f2542x50fd9e4a = subShort3.read(3.0f);
    }

    public final void IconCompatParcelizer(Paint paint, rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer) {
        float f;
        int i;
        float f2;
        float f3;
        float f4;
        boolean z;
        Paint paint2 = paint;
        float read2 = subShort3.read(this.MediaBrowserCompat$MediaItem);
        float read3 = subShort3.read(this.AlertController$RecycleListView);
        float read4 = subShort3.read(this.MediaMetadataCompat);
        float read5 = subShort3.read(this.setContentView);
        float read6 = subShort3.read((float) BitmapDescriptorFactory.HUE_RED);
        rsnScriptInvokeV[] rsnscriptinvokevArr = this.IconCompatParcelizer;
        int length = rsnscriptinvokevArr.length;
        subShort3.read(this.MediaMetadataCompat);
        for (rsnScriptInvokeV rsnscriptinvokev : this.IconCompatParcelizer) {
            subShort3.read(Float.isNaN(rsnscriptinvokev.write) ? this.MediaBrowserCompat$MediaItem : rsnscriptinvokev.write);
            String str = rsnscriptinvokev.RatingCompat;
            if (str != null) {
                subShort3.read(paint2, str);
            }
        }
        float f5 = 0.0f;
        for (rsnScriptInvokeV rsnscriptinvokev2 : this.IconCompatParcelizer) {
            String str2 = rsnscriptinvokev2.RatingCompat;
            if (str2 != null) {
                float MediaBrowserCompat$ItemReceiver2 = (float) subShort3.MediaBrowserCompat$ItemReceiver(paint2, str2);
                if (MediaBrowserCompat$ItemReceiver2 > f5) {
                    f5 = MediaBrowserCompat$ItemReceiver2;
                }
            }
        }
        this.AppCompatActivity = f5;
        int i2 = C11785.MediaBrowserCompat$ItemReceiver[this.Keep.ordinal()];
        if (i2 == 1) {
            float f6 = read2;
            float f7 = read3;
            rsnScriptInvokeV[] rsnscriptinvokevArr2 = rsnscriptinvokevArr;
            float write2 = subShort3.write(paint);
            float f8 = 0.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            boolean z2 = false;
            for (int i3 = 0; i3 < length; i3++) {
                rsnScriptInvokeV rsnscriptinvokev3 = rsnscriptinvokevArr2[i3];
                boolean z3 = rsnscriptinvokev3.MediaBrowserCompat$ItemReceiver != FieldPacker$MediaBrowserCompat$ItemReceiver.NONE;
                if (Float.isNaN(rsnscriptinvokev3.write)) {
                    f = f6;
                } else {
                    f = subShort3.read(rsnscriptinvokev3.write);
                }
                String str3 = rsnscriptinvokev3.RatingCompat;
                if (!z2) {
                    f10 = 0.0f;
                }
                if (z3) {
                    if (z2) {
                        f10 += f7;
                    }
                    f10 += f;
                }
                if (str3 != null) {
                    if (z3 && !z2) {
                        f10 += read4;
                    } else if (z2) {
                        f8 = Math.max(f8, f10);
                        f9 += write2 + read6;
                        f10 = 0.0f;
                        z2 = false;
                    }
                    float read7 = (float) subShort3.read(paint2, str3);
                    if (i3 < length - 1) {
                        f9 += write2 + read6;
                    }
                    f10 += read7;
                } else {
                    f10 += f;
                    if (i3 < length - 1) {
                        f10 += f7;
                    }
                    z2 = true;
                }
                f8 = Math.max(f8, f10);
            }
            this.setHasDecor = f8;
            this.PlaybackStateCompat = f9;
        } else if (i2 == 2) {
            float write3 = subShort3.write(paint);
            float read8 = subShort3.read(paint);
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.width();
            this.write.clear();
            this.MediaBrowserCompat$CustomActionResultReceiver.clear();
            this.MediaBrowserCompat$ItemReceiver.clear();
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            int i4 = -1;
            int i5 = 0;
            while (i5 < length) {
                rsnScriptInvokeV rsnscriptinvokev4 = rsnscriptinvokevArr[i5];
                float f14 = read2;
                boolean z4 = rsnscriptinvokev4.MediaBrowserCompat$ItemReceiver != FieldPacker$MediaBrowserCompat$ItemReceiver.NONE;
                if (Float.isNaN(rsnscriptinvokev4.write)) {
                    f2 = f14;
                } else {
                    f2 = subShort3.read(rsnscriptinvokev4.write);
                }
                String str4 = rsnscriptinvokev4.RatingCompat;
                float f15 = read5;
                rsnScriptInvokeV[] rsnscriptinvokevArr3 = rsnscriptinvokevArr;
                this.write.add(Boolean.FALSE);
                float f16 = i4 == -1 ? BitmapDescriptorFactory.HUE_RED : f12 + read3;
                if (str4 != null) {
                    f3 = read3;
                    this.MediaBrowserCompat$CustomActionResultReceiver.add(subShort3.IconCompatParcelizer(paint2, str4));
                    f4 = f16 + (z4 ? read4 + f2 : BitmapDescriptorFactory.HUE_RED) + this.MediaBrowserCompat$CustomActionResultReceiver.get(i5).write;
                } else {
                    f3 = read3;
                    float f17 = f2;
                    this.MediaBrowserCompat$CustomActionResultReceiver.add(Float2.MediaBrowserCompat$CustomActionResultReceiver(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                    f4 = f16 + (!z4 ? BitmapDescriptorFactory.HUE_RED : f17);
                    if (i4 == -1) {
                        i4 = i5;
                    }
                }
                if (str4 != null || i5 == length - 1) {
                    z = false;
                    float f18 = f13 + (f13 == BitmapDescriptorFactory.HUE_RED ? 0.0f : f15) + f4;
                    if (i5 == length - 1) {
                        this.MediaBrowserCompat$ItemReceiver.add(Float2.MediaBrowserCompat$CustomActionResultReceiver(f18, write3));
                        f11 = Math.max(f11, f18);
                    }
                    f13 = f18;
                } else {
                    z = false;
                }
                if (str4 != null) {
                    i4 = -1;
                }
                i5++;
                boolean z5 = z;
                read3 = f3;
                read2 = f14;
                rsnscriptinvokevArr = rsnscriptinvokevArr3;
                f12 = f4;
                read5 = f15;
            }
            this.setHasDecor = f11;
            float size = (float) this.MediaBrowserCompat$ItemReceiver.size();
            if (this.MediaBrowserCompat$ItemReceiver.size() == 0) {
                i = 0;
            } else {
                i = this.MediaBrowserCompat$ItemReceiver.size() - 1;
            }
            this.PlaybackStateCompat = (write3 * size) + ((read8 + read6) * ((float) i));
        }
        this.PlaybackStateCompat += this.f2542x50fd9e4a;
        this.setHasDecor += this.MediaSessionCompat$Token;
    }

    /* renamed from: o.FieldPacker$5 */
    static /* synthetic */ class C11785 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                o.FieldPacker$write[] r0 = p040o.FieldPacker.write.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.FieldPacker$write r1 = p040o.FieldPacker.write.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.FieldPacker$write r1 = p040o.FieldPacker.write.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.FieldPacker.C11785.<clinit>():void");
        }
    }
}
