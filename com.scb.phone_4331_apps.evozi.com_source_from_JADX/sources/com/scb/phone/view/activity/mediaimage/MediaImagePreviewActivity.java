package com.scb.phone.view.activity.mediaimage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.util.plugins.camera.view.CropOverlayView;
import com.scb.phone.view.util.plugins.camera.view.ScaleImageView;
import java.io.ByteArrayOutputStream;
import p040o.AlertController$RecycleListView;
import p040o.CheckWorkflowActivity_MembersInjector;
import p040o.FragmentBuilder_BindECouponQuantityFragment;
import p040o.FragmentBuilder_BindETBMarketConductFragment;
import p040o.HmlPinActivity;
import p040o.QueueFile;
import p040o.TileOverlayOptions;
import p040o.access$2200;
import p040o.getEnvTimeZone;
import p040o.getEnvTimeZone$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.initFaceDetector;
import p040o.onCheckBoxClick;
import p040o.orderValuesBy;
import p040o.standardValues;

public class MediaImagePreviewActivity extends BaseActivity implements CheckWorkflowActivity_MembersInjector {
    private int MediaBrowserCompat$MediaItem;
    private QueueFile.ElementReader MediaBrowserCompat$SearchResultReceiver;
    @BindView
    TextView cancelPicture;
    @BindView
    TextView choosePicture;
    @BindView
    CropOverlayView cropOverlayView;
    @HmlPinActivity
    public getEnvTimeZone mediaImagePresenter;
    @BindView
    ScaleImageView scaleImageView;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78702131493095);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.mediaImagePresenter.MediaBrowserCompat$ItemReceiver(this);
        initFaceDetector.MediaBrowserCompat$ItemReceiver(this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.mediaImagePresenter.onDestroy();
    }

    public final void read(QueueFile.ElementReader elementReader) {
        this.MediaBrowserCompat$SearchResultReceiver = elementReader;
        if (elementReader.IconCompatParcelizer == null || elementReader.IconCompatParcelizer.isEmpty()) {
            closeActivity();
            return;
        }
        getEnvTimeZone getenvtimezone = this.mediaImagePresenter;
        String str = elementReader.IconCompatParcelizer;
        if (getenvtimezone.RatingCompat != null) {
            getenvtimezone.RatingCompat.AlertController$RecycleListView();
        }
        TileOverlayOptions tileOverlayOptions = getenvtimezone.MediaBrowserCompat$ItemReceiver;
        orderValuesBy read = orderValuesBy.read();
        read.write = str;
        tileOverlayOptions.MediaBrowserCompat$CustomActionResultReceiver(read);
        getenvtimezone.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getEnvTimeZone.write(getenvtimezone, (byte) 0));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (!z) {
            closeActivity();
        } else if (!TextUtils.isEmpty(this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer)) {
            Intent intent = new Intent();
            intent.putExtra("isCropped", true);
            intent.putExtra("imageURL", this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer);
            intent.putExtra("imageID", this.MediaBrowserCompat$SearchResultReceiver.read);
            setResult(-1, intent);
            finish();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        initFaceDetector.write(this, i, iArr);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static void m2958x50fd9e4a() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void MediaSessionCompat$QueueItem() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void uploadCroppedImage() {
        ScaleImageView scaleImageView2 = this.scaleImageView;
        Bitmap drawingCache = scaleImageView2.getDrawingCache();
        if (drawingCache == null) {
            drawingCache = Bitmap.createBitmap(scaleImageView2.getWidth(), scaleImageView2.getHeight(), Bitmap.Config.RGB_565);
            scaleImageView2.draw(new Canvas(drawingCache));
        }
        Rect MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindECouponQuantityFragment.MediaBrowserCompat$CustomActionResultReceiver(drawingCache.getWidth(), drawingCache.getHeight(), scaleImageView2.getWidth(), scaleImageView2.getHeight());
        float width = ((float) drawingCache.getWidth()) / ((float) MediaBrowserCompat$CustomActionResultReceiver.width());
        float height = ((float) drawingCache.getHeight()) / ((float) MediaBrowserCompat$CustomActionResultReceiver.height());
        Bitmap createBitmap = Bitmap.createBitmap(drawingCache, (int) ((FragmentBuilder_BindETBMarketConductFragment.LEFT.mCoordinate - ((float) MediaBrowserCompat$CustomActionResultReceiver.left)) * width), (int) ((FragmentBuilder_BindETBMarketConductFragment.TOP.mCoordinate - ((float) MediaBrowserCompat$CustomActionResultReceiver.top)) * height), (int) (FragmentBuilder_BindETBMarketConductFragment.write() * width), (int) (FragmentBuilder_BindETBMarketConductFragment.IconCompatParcelizer() * height));
        int i = this.MediaBrowserCompat$MediaItem;
        int i2 = i > 0 ? i : 100;
        if (i <= 0) {
            i = 100;
        }
        boolean z = true;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, i2, i, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 75, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        getEnvTimeZone getenvtimezone = this.mediaImagePresenter;
        if (getenvtimezone.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getenvtimezone.RatingCompat.AlertController$RecycleListView();
        }
        TileOverlayOptions tileOverlayOptions = getenvtimezone.MediaBrowserCompat$ItemReceiver;
        standardValues IconCompatParcelizer = standardValues.IconCompatParcelizer();
        IconCompatParcelizer.read = encodeToString;
        tileOverlayOptions.read(IconCompatParcelizer);
        getenvtimezone.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getEnvTimeZone$MediaBrowserCompat$CustomActionResultReceiver(getenvtimezone, (byte) 0));
        createScaledBitmap.recycle();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void closeActivity() {
        setResult(0, new Intent());
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        if (r0 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0084, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (r2 != null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaSessionCompat$ResultReceiverWrapper() {
        /*
            r10 = this;
            java.lang.String r0 = "maxWidth"
            android.content.Intent r1 = r10.getIntent()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r2 = "imageUri"
            android.os.Parcelable r1 = r1.getParcelableExtra(r2)     // Catch:{ Exception -> 0x0093 }
            android.net.Uri r1 = (android.net.Uri) r1     // Catch:{ Exception -> 0x0093 }
            android.content.Intent r2 = r10.getIntent()     // Catch:{ Exception -> 0x0093 }
            r3 = 100
            int r2 = r2.getIntExtra(r0, r3)     // Catch:{ Exception -> 0x0093 }
            r10.MediaBrowserCompat$MediaItem = r2     // Catch:{ Exception -> 0x0093 }
            android.content.Intent r2 = r10.getIntent()     // Catch:{ Exception -> 0x0093 }
            int r0 = r2.getIntExtra(r0, r3)     // Catch:{ Exception -> 0x0093 }
            android.content.ContentResolver r2 = r10.getContentResolver()     // Catch:{ Exception -> 0x0093 }
            java.io.InputStream r2 = r2.openInputStream(r1)     // Catch:{ Exception -> 0x0093 }
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0085 }
            r3.<init>()     // Catch:{ all -> 0x0085 }
            r4 = 1
            r3.inJustDecodeBounds = r4     // Catch:{ all -> 0x0085 }
            r5 = 0
            android.graphics.BitmapFactory.decodeStream(r2, r5, r3)     // Catch:{ all -> 0x0085 }
            int r6 = r10.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x0085 }
            int r7 = r3.outHeight     // Catch:{ all -> 0x0085 }
            int r8 = r3.outWidth     // Catch:{ all -> 0x0085 }
            if (r7 > r0) goto L_0x0040
            if (r8 <= r6) goto L_0x004e
        L_0x0040:
            r9 = 2
            int r7 = r7 / r9
            int r8 = r8 / r9
            int r7 = r7 / r0
            int r8 = r8 / r6
            int r0 = r7 + r8
            if (r0 <= r9) goto L_0x004e
            int r0 = java.lang.Math.min(r7, r8)     // Catch:{ all -> 0x0085 }
            int r4 = r4 + r0
        L_0x004e:
            r3.inSampleSize = r4     // Catch:{ all -> 0x0085 }
            r0 = 0
            r3.inJustDecodeBounds = r0     // Catch:{ all -> 0x0085 }
            android.content.ContentResolver r0 = r10.getContentResolver()     // Catch:{ all -> 0x0085 }
            java.io.InputStream r0 = r0.openInputStream(r1)     // Catch:{ all -> 0x0085 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r0, r5, r3)     // Catch:{ all -> 0x0077 }
            android.content.Context r4 = r10.getApplicationContext()     // Catch:{ all -> 0x0077 }
            android.graphics.Bitmap r1 = p040o.FragmentBuilder_BindDeejungTransferMinMaxReviewFragment.write(r4, r1, r3)     // Catch:{ all -> 0x0077 }
            com.scb.phone.view.util.plugins.camera.view.ScaleImageView r3 = r10.scaleImageView     // Catch:{ all -> 0x0077 }
            r3.setImageBitmap(r1)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0071
            r0.close()     // Catch:{ all -> 0x0085 }
        L_0x0071:
            if (r2 == 0) goto L_0x0097
            r2.close()     // Catch:{ Exception -> 0x0093 }
            return
        L_0x0077:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r3 = move-exception
            if (r0 == 0) goto L_0x0084
            r0.close()     // Catch:{ all -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0085 }
        L_0x0084:
            throw r3     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r1 = move-exception
            if (r2 == 0) goto L_0x0092
            r2.close()     // Catch:{ all -> 0x008e }
            goto L_0x0092
        L_0x008e:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch:{ Exception -> 0x0093 }
        L_0x0092:
            throw r1     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            p040o.onCheckBoxClick.write((java.lang.Throwable) r0)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.mediaimage.MediaImagePreviewActivity.MediaSessionCompat$ResultReceiverWrapper():void");
    }

    public final void IconCompatParcelizer(access$2200 access_2200) {
        AlertController$RecycleListView.write((Activity) this, (int) R.id.view_group_root, (int) R.drawable.ic_error_white_24dp, access_2200.IconCompatParcelizer, (int) R.color.f66062131099761);
    }
}
