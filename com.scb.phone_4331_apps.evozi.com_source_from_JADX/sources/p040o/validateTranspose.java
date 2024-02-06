package p040o;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Handler;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.CameraPreview$MediaBrowserCompat$CustomActionResultReceiver;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.rsnScriptInvokeV;
import p040o.zzma;

/* renamed from: o.validateTranspose */
public class validateTranspose {
    /* access modifiers changed from: private */
    public static final String MediaSessionCompat$ResultReceiverWrapper = validateTranspose.class.getSimpleName();
    public static int read = 250;
    public boolean IconCompatParcelizer = false;
    public Activity MediaBrowserCompat$CustomActionResultReceiver;
    public DecoratedBarcodeView MediaBrowserCompat$ItemReceiver;
    public rsnScriptKernelIDCreate MediaBrowserCompat$MediaItem;
    public int MediaBrowserCompat$SearchResultReceiver = -1;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f5562x50fd9e4a = false;
    public Handler MediaDescriptionCompat;
    public getIIdDeserializerRtti MediaMetadataCompat = new getIIdDeserializerRtti() {
        public final void write(List<rsnScriptForEach> list) {
        }

        public final void MediaBrowserCompat$ItemReceiver(final zzlr$MediaBrowserCompat$ItemReceiver zzlr_mediabrowsercompat_itemreceiver) {
            validateTranspose.this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver();
            rsnScriptIntrinsicBLAS_Single IconCompatParcelizer = validateTranspose.this.write;
            synchronized (IconCompatParcelizer) {
                if (IconCompatParcelizer.IconCompatParcelizer) {
                    IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
            validateTranspose.this.MediaDescriptionCompat.post(new Runnable() {
                public final void run() {
                    validateTranspose validatetranspose = validateTranspose.this;
                    zzlr$MediaBrowserCompat$ItemReceiver zzlr_mediabrowsercompat_itemreceiver = zzlr_mediabrowsercompat_itemreceiver;
                    String read2 = validatetranspose.read(zzlr_mediabrowsercompat_itemreceiver);
                    Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                    intent.addFlags(524288);
                    intent.putExtra("SCAN_RESULT", zzlr_mediabrowsercompat_itemreceiver.toString());
                    intent.putExtra("SCAN_RESULT_FORMAT", zzlr_mediabrowsercompat_itemreceiver.write.write.toString());
                    byte[] bArr = zzlr_mediabrowsercompat_itemreceiver.write.MediaBrowserCompat$CustomActionResultReceiver;
                    if (bArr != null && bArr.length > 0) {
                        intent.putExtra("SCAN_RESULT_BYTES", bArr);
                    }
                    Map<rsnInvokeClosureCreate, Object> map = zzlr_mediabrowsercompat_itemreceiver.write.read;
                    if (map != null) {
                        if (map.containsKey(rsnInvokeClosureCreate.UPC_EAN_EXTENSION)) {
                            intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", map.get(rsnInvokeClosureCreate.UPC_EAN_EXTENSION).toString());
                        }
                        Number number = (Number) map.get(rsnInvokeClosureCreate.ORIENTATION);
                        if (number != null) {
                            intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
                        }
                        String str = (String) map.get(rsnInvokeClosureCreate.ERROR_CORRECTION_LEVEL);
                        if (str != null) {
                            intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str);
                        }
                        Iterable<byte[]> iterable = (Iterable) map.get(rsnInvokeClosureCreate.BYTE_SEGMENTS);
                        if (iterable != null) {
                            int i = 0;
                            for (byte[] putExtra : iterable) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("SCAN_RESULT_BYTE_SEGMENTS_");
                                sb.append(i);
                                intent.putExtra(sb.toString(), putExtra);
                                i++;
                            }
                        }
                    }
                    if (read2 != null) {
                        intent.putExtra("SCAN_RESULT_IMAGE_PATH", read2);
                    }
                    validatetranspose.MediaBrowserCompat$CustomActionResultReceiver.setResult(-1, intent);
                    validatetranspose.write();
                }
            });
        }
    };
    public boolean MediaSessionCompat$QueueItem = false;
    private final CameraPreview$MediaBrowserCompat$CustomActionResultReceiver MediaSessionCompat$Token = new CameraPreview$MediaBrowserCompat$CustomActionResultReceiver() {
        public final void IconCompatParcelizer() {
        }

        public final void MediaBrowserCompat$ItemReceiver() {
        }

        public final void write() {
        }

        public final void IconCompatParcelizer(Exception exc) {
            validateTranspose.this.IconCompatParcelizer();
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            if (validateTranspose.this.f5562x50fd9e4a) {
                Log.d(validateTranspose.MediaSessionCompat$ResultReceiverWrapper, "Camera closed; finishing activity");
                validateTranspose.this.MediaBrowserCompat$CustomActionResultReceiver.finish();
            }
        }
    };
    public boolean RatingCompat = false;
    public rsnScriptIntrinsicBLAS_Single write;

    public validateTranspose(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        this.MediaBrowserCompat$CustomActionResultReceiver = activity;
        this.MediaBrowserCompat$ItemReceiver = decoratedBarcodeView;
        ((BarcodeView) decoratedBarcodeView.findViewById(rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_barcode_surface)).MediaBrowserCompat$MediaItem.add(this.MediaSessionCompat$Token);
        this.MediaDescriptionCompat = new Handler();
        this.MediaBrowserCompat$MediaItem = new rsnScriptKernelIDCreate(activity, new Runnable() {
            public final void run() {
                Log.d(validateTranspose.MediaSessionCompat$ResultReceiverWrapper, "Finishing due to inactivity");
                validateTranspose.this.MediaBrowserCompat$CustomActionResultReceiver.finish();
            }
        });
        this.write = new rsnScriptIntrinsicBLAS_Single(activity);
    }

    public final void write(int i, int[] iArr) {
        if (i != read) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            IconCompatParcelizer();
        } else {
            this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$SearchResultReceiver();
        }
    }

    /* access modifiers changed from: package-private */
    public String read(zzlr$MediaBrowserCompat$ItemReceiver zzlr_mediabrowsercompat_itemreceiver) {
        if (this.MediaSessionCompat$QueueItem) {
            zzma.IconCompatParcelizer iconCompatParcelizer = zzlr_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
            Rect rect = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            if (iconCompatParcelizer.MediaDescriptionCompat % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 != 0) {
                rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            }
            YuvImage yuvImage = new YuvImage(iconCompatParcelizer.IconCompatParcelizer, iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer.write, iconCompatParcelizer.read, (int[]) null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 2;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
            if (iconCompatParcelizer.MediaDescriptionCompat != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) iconCompatParcelizer.MediaDescriptionCompat);
                decodeByteArray = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
            }
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.MediaBrowserCompat$CustomActionResultReceiver.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException e) {
                String str = MediaSessionCompat$ResultReceiverWrapper;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to create temporary file and store bitmap! ");
                sb.append(e);
                Log.w(str, sb.toString());
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void write() {
        CGERU cgeru = ((BarcodeView) this.MediaBrowserCompat$ItemReceiver.findViewById(rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_barcode_surface)).write;
        if (cgeru == null || cgeru.IconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver.finish();
        } else {
            this.f5562x50fd9e4a = true;
        }
        this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver();
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.isFinishing() && !this.RatingCompat && !this.f5562x50fd9e4a) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.MediaBrowserCompat$CustomActionResultReceiver);
            builder.setTitle(this.MediaBrowserCompat$CustomActionResultReceiver.getString(rsnScriptInvokeV.read.zxing_app_name));
            builder.setMessage(this.MediaBrowserCompat$CustomActionResultReceiver.getString(rsnScriptInvokeV.read.zxing_msg_camera_framework_bug));
            builder.setPositiveButton(rsnScriptInvokeV.read.zxing_button_ok, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    validateTranspose.this.MediaBrowserCompat$CustomActionResultReceiver.finish();
                }
            });
            builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
                public final void onCancel(DialogInterface dialogInterface) {
                    validateTranspose.this.MediaBrowserCompat$CustomActionResultReceiver.finish();
                }
            });
            builder.show();
        }
    }
}
