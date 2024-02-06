package p040o;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* renamed from: o.AppCompatRatingBar */
public class AppCompatRatingBar extends setLastBaselineToBottomHeight {
    private static AppCompatRatingBar$MediaBrowserCompat$CustomActionResultReceiver write;

    /* renamed from: o.AppCompatRatingBar$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        void validateRequestPermissionsRequestCode(int i);
    }

    protected AppCompatRatingBar() {
    }

    public static AppCompatRatingBar$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver() {
        return write;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }

    public static void write(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Activity activity, setPrompt setprompt) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(setprompt != null ? new write(setprompt) : null);
        }
    }

    public static void read(Activity activity, setPrompt setprompt) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setExitSharedElementCallback(setprompt != null ? new write(setprompt) : null);
        }
    }

    public static void IconCompatParcelizer(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    public static void read(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    public static void write(final Activity activity, final String[] strArr, final int i) {
        AppCompatRatingBar$MediaBrowserCompat$CustomActionResultReceiver appCompatRatingBar$MediaBrowserCompat$CustomActionResultReceiver = write;
        if (appCompatRatingBar$MediaBrowserCompat$CustomActionResultReceiver != null && appCompatRatingBar$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof IconCompatParcelizer) {
                ((IconCompatParcelizer) activity).validateRequestPermissionsRequestCode(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof AppCompatRatingBar$MediaBrowserCompat$ItemReceiver) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                    }
                    ((AppCompatRatingBar$MediaBrowserCompat$ItemReceiver) activity).onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        }
    }

    public static boolean write(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* renamed from: o.AppCompatRatingBar$write */
    static class write extends SharedElementCallback {
        private final setPrompt MediaBrowserCompat$ItemReceiver;

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
        }

        public void onRejectSharedElements(List<View> list) {
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        }

        write(setPrompt setprompt) {
            this.MediaBrowserCompat$ItemReceiver = setprompt;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            Bitmap MediaBrowserCompat$ItemReceiver2;
            setPrompt setprompt = this.MediaBrowserCompat$ItemReceiver;
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                Drawable background = imageView.getBackground();
                if (!(drawable == null || background != null || (MediaBrowserCompat$ItemReceiver2 = setPrompt.MediaBrowserCompat$ItemReceiver(drawable)) == null)) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("sharedElement:snapshot:bitmap", MediaBrowserCompat$ItemReceiver2);
                    bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                    if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                        float[] fArr = new float[9];
                        imageView.getImageMatrix().getValues(fArr);
                        bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                    }
                    return bundle;
                }
            }
            int round = Math.round(rectF.width());
            int round2 = Math.round(rectF.height());
            if (round <= 0 || round2 <= 0) {
                return null;
            }
            float min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
            int i = (int) (((float) round) * min);
            int i2 = (int) (((float) round2) * min);
            if (setprompt.MediaBrowserCompat$CustomActionResultReceiver == null) {
                setprompt.MediaBrowserCompat$CustomActionResultReceiver = new Matrix();
            }
            setprompt.MediaBrowserCompat$CustomActionResultReceiver.set(matrix);
            setprompt.MediaBrowserCompat$CustomActionResultReceiver.postTranslate(-rectF.left, -rectF.top);
            setprompt.MediaBrowserCompat$CustomActionResultReceiver.postScale(min, min);
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.concat(setprompt.MediaBrowserCompat$CustomActionResultReceiver);
            view.draw(canvas);
            return createBitmap;
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return setPrompt.MediaBrowserCompat$CustomActionResultReceiver(context, parcelable);
        }

        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            setPrompt.MediaBrowserCompat$CustomActionResultReceiver(new setPrompt$MediaBrowserCompat$CustomActionResultReceiver() {
                public void MediaBrowserCompat$CustomActionResultReceiver() {
                    onSharedElementsReadyListener.onSharedElementsReady();
                }
            });
        }
    }
}
