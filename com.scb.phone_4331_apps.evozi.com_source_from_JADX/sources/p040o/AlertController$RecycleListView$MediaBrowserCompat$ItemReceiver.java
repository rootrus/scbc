package p040o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import p040o.AlertController$RecycleListView;

/* renamed from: o.AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver */
public final class AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver {
    private static final int[] IconCompatParcelizer = {16843623};
    private static final int[] MediaBrowserCompat$CustomActionResultReceiver = {16842919};
    private static final int[] MediaBrowserCompat$ItemReceiver = {16843623, 16842908};
    private static final int[] MediaBrowserCompat$MediaItem = {16842913, 16843623};
    private static final int[] MediaBrowserCompat$SearchResultReceiver = {16842913, 16842919};
    private static final int[] MediaDescriptionCompat = {16842913, 16842908};
    private static final int[] MediaMetadataCompat = {16842913};
    private static boolean MediaSessionCompat$QueueItem = (Build.VERSION.SDK_INT >= 21);
    private static final int[] RatingCompat = {16842913, 16843623, 16842908};
    public static final int abc_action_bar_embed_tabs = 2131034112;
    public static final int abc_allow_stacked_button_bar = 2131034113;
    public static final int abc_config_actionMenuItemAllCaps = 2131034114;
    private static final int[] write = {16842908};
    public Context read;

    public AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver(Context context) {
        this.read = context;
    }

    public final int write() {
        Configuration configuration = this.read.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        TypedArray obtainStyledAttributes = this.read.obtainStyledAttributes((AttributeSet) null, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar, AlertController$RecycleListView.read.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionBar_height, 0);
        Resources resources = this.read.getResources();
        if (!this.read.getResources().getBoolean(abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(AlertController$RecycleListView.IconCompatParcelizer.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver() {
    }

    public static ColorStateList MediaBrowserCompat$ItemReceiver(ColorStateList colorStateList) {
        if (MediaSessionCompat$QueueItem) {
            return new ColorStateList(new int[][]{MediaMetadataCompat, StateSet.NOTHING}, new int[]{IconCompatParcelizer(colorStateList, MediaBrowserCompat$SearchResultReceiver), IconCompatParcelizer(colorStateList, MediaBrowserCompat$CustomActionResultReceiver)});
        }
        int[] iArr = MediaBrowserCompat$SearchResultReceiver;
        int[] iArr2 = RatingCompat;
        int[] iArr3 = MediaDescriptionCompat;
        int[] iArr4 = MediaBrowserCompat$MediaItem;
        int[] iArr5 = MediaBrowserCompat$CustomActionResultReceiver;
        int[] iArr6 = MediaBrowserCompat$ItemReceiver;
        int[] iArr7 = write;
        int[] iArr8 = IconCompatParcelizer;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, MediaMetadataCompat, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{IconCompatParcelizer(colorStateList, iArr), IconCompatParcelizer(colorStateList, iArr2), IconCompatParcelizer(colorStateList, iArr3), IconCompatParcelizer(colorStateList, iArr4), 0, IconCompatParcelizer(colorStateList, iArr5), IconCompatParcelizer(colorStateList, iArr6), IconCompatParcelizer(colorStateList, iArr7), IconCompatParcelizer(colorStateList, iArr8), 0});
    }

    private static int IconCompatParcelizer(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return MediaSessionCompat$QueueItem ? AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(colorForState, Math.min(Color.alpha(colorForState) << 1, 255)) : colorForState;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|(1:15)|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d3, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d4, code lost:
        r11 = r10;
        r10 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0078 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ android.net.Uri read(p040o.getDeviceFile r10, android.content.Context r11) throws java.lang.Exception {
        /*
            java.lang.String r0 = "window"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r2 = r2.getTimeInMillis()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Moment_%s.jpg"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout     // Catch:{ all -> 0x00d3 }
            r2.<init>(r11)     // Catch:{ all -> 0x00d3 }
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams     // Catch:{ all -> 0x00d3 }
            r5 = -1
            r6 = -2
            r4.<init>(r5, r6)     // Catch:{ all -> 0x00d3 }
            r2.setLayoutParams(r4)     // Catch:{ all -> 0x00d3 }
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r11)     // Catch:{ all -> 0x00d3 }
            r5 = 2131494382(0x7f0c05ee, float:1.861227E38)
            android.view.View r2 = r4.inflate(r5, r2, r3)     // Catch:{ all -> 0x00d3 }
            com.scb.phone.view.fragment.donations.ShareMomentScreenshotFragment r4 = new com.scb.phone.view.fragment.donations.ShareMomentScreenshotFragment     // Catch:{ all -> 0x00d3 }
            r4.<init>()     // Catch:{ all -> 0x00d3 }
            butterknife.ButterKnife.IconCompatParcelizer(r4, r2)     // Catch:{ all -> 0x00d3 }
            android.widget.TextView r5 = r4.mTitle     // Catch:{ all -> 0x00d3 }
            java.lang.String r6 = r10.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00d3 }
            r5.setText(r6)     // Catch:{ all -> 0x00d3 }
            android.widget.TextView r5 = r4.mSubText     // Catch:{ all -> 0x00d3 }
            java.lang.String r6 = r10.IconCompatParcelizer     // Catch:{ all -> 0x00d3 }
            r5.setText(r6)     // Catch:{ all -> 0x00d3 }
            android.util.DisplayMetrics r5 = new android.util.DisplayMetrics     // Catch:{ all -> 0x00d3 }
            r5.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.Object r6 = r11.getSystemService(r0)     // Catch:{ all -> 0x00d3 }
            android.view.WindowManager r6 = (android.view.WindowManager) r6     // Catch:{ all -> 0x00d3 }
            android.view.Display r6 = r6.getDefaultDisplay()     // Catch:{ all -> 0x00d3 }
            r6.getMetrics(r5)     // Catch:{ all -> 0x00d3 }
            int r5 = r5.widthPixels     // Catch:{ all -> 0x00d3 }
            android.widget.ImageView r6 = r4.mSharingImage     // Catch:{ IOException | OutOfMemoryError -> 0x0078 }
            com.squareup.picasso.Picasso r7 = com.squareup.picasso.Picasso.read()     // Catch:{ IOException | OutOfMemoryError -> 0x0078 }
            java.lang.String r8 = r10.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException | OutOfMemoryError -> 0x0078 }
            o.FragmentBuilder_BindFundDetailSummaryFragment r7 = r7.write((java.lang.String) r8)     // Catch:{ IOException | OutOfMemoryError -> 0x0078 }
            o.FragmentBuilder_BindFixedTransferInputFormFragment$read r8 = r7.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException | OutOfMemoryError -> 0x0078 }
            r8.read(r5, r3)     // Catch:{ IOException | OutOfMemoryError -> 0x0078 }
            android.graphics.Bitmap r7 = r7.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ IOException | OutOfMemoryError -> 0x0078 }
            r6.setImageBitmap(r7)     // Catch:{ IOException | OutOfMemoryError -> 0x0078 }
            goto L_0x0080
        L_0x0078:
            android.widget.ImageView r6 = r4.mSharingImage     // Catch:{ all -> 0x00d3 }
            r7 = 2131231021(0x7f08012d, float:1.8078111E38)
            r6.setImageResource(r7)     // Catch:{ all -> 0x00d3 }
        L_0x0080:
            o.FragmentBuilder_BindETBProductDetailFragment r6 = new o.FragmentBuilder_BindETBProductDetailFragment     // Catch:{ IOException | OutOfMemoryError -> 0x00a3 }
            r6.<init>()     // Catch:{ IOException | OutOfMemoryError -> 0x00a3 }
            android.widget.ImageView r7 = r4.mSharingLogo     // Catch:{ IOException | OutOfMemoryError -> 0x00a3 }
            com.squareup.picasso.Picasso r8 = com.squareup.picasso.Picasso.read()     // Catch:{ IOException | OutOfMemoryError -> 0x00a3 }
            java.lang.String r10 = r10.read     // Catch:{ IOException | OutOfMemoryError -> 0x00a3 }
            o.FragmentBuilder_BindFundDetailSummaryFragment r10 = r8.write((java.lang.String) r10)     // Catch:{ IOException | OutOfMemoryError -> 0x00a3 }
            o.FragmentBuilder_BindFixedTransferInputFormFragment$read r8 = r10.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException | OutOfMemoryError -> 0x00a3 }
            r8.read(r6)     // Catch:{ IOException | OutOfMemoryError -> 0x00a3 }
            o.FragmentBuilder_BindFixedTransferInputFormFragment$read r6 = r10.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException | OutOfMemoryError -> 0x00a3 }
            r6.read(r5, r3)     // Catch:{ IOException | OutOfMemoryError -> 0x00a3 }
            android.graphics.Bitmap r10 = r10.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ IOException | OutOfMemoryError -> 0x00a3 }
            r7.setImageBitmap(r10)     // Catch:{ IOException | OutOfMemoryError -> 0x00a3 }
            goto L_0x00ab
        L_0x00a3:
            android.widget.ImageView r10 = r4.mSharingLogo     // Catch:{ all -> 0x00d3 }
            r3 = 2131231022(0x7f08012e, float:1.8078113E38)
            r10.setImageResource(r3)     // Catch:{ all -> 0x00d3 }
        L_0x00ab:
            android.util.DisplayMetrics r10 = new android.util.DisplayMetrics     // Catch:{ all -> 0x00d3 }
            r10.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.Object r0 = r11.getSystemService(r0)     // Catch:{ all -> 0x00d3 }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ all -> 0x00d3 }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ all -> 0x00d3 }
            r0.getMetrics(r10)     // Catch:{ all -> 0x00d3 }
            int r0 = r10.widthPixels     // Catch:{ all -> 0x00d3 }
            int r10 = r10.widthPixels     // Catch:{ all -> 0x00d3 }
            int r10 = r10 << 2
            android.graphics.Bitmap r10 = p040o.AlertController$RecycleListView.IconCompatParcelizer((android.view.View) r2, (int) r0, (int) r10)     // Catch:{ all -> 0x00d3 }
            android.net.Uri r11 = p040o.AlertController$RecycleListView.read((android.graphics.Bitmap) r10, (java.lang.String) r1, (android.content.Context) r11)     // Catch:{ all -> 0x00d1 }
            if (r10 == 0) goto L_0x00d0
            r10.recycle()
        L_0x00d0:
            return r11
        L_0x00d1:
            r11 = move-exception
            goto L_0x00d8
        L_0x00d3:
            r10 = move-exception
            r11 = 0
            r9 = r11
            r11 = r10
            r10 = r9
        L_0x00d8:
            if (r10 == 0) goto L_0x00dd
            r10.recycle()
        L_0x00dd:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver.read(o.getDeviceFile, android.content.Context):android.net.Uri");
    }

    public static boolean IconCompatParcelizer(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            return objArr2 == null;
        }
        if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (!(obj == null ? obj2 == null : obj.equals(obj2))) {
                return false;
            }
        }
        return true;
    }
}
