package p040o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;

/* renamed from: o.setCustomSelectionActionModeCallback */
public class setCustomSelectionActionModeCallback implements proxyGetICheckDetector {
    public void write() {
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        checkCaptureModule_GetICheckDetectorFactory.IconCompatParcelizer(new setSupportBackgroundTintMode(colorStateList, f));
        View MediaBrowserCompat$ItemReceiver = checkCaptureModule_GetICheckDetectorFactory.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.setClipToOutline(true);
        MediaBrowserCompat$ItemReceiver.setElevation(f2);
        write(checkCaptureModule_GetICheckDetectorFactory, f3);
    }

    public void IconCompatParcelizer(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory, float f) {
        setSupportBackgroundTintMode RatingCompat = RatingCompat(checkCaptureModule_GetICheckDetectorFactory);
        if (f != RatingCompat.MediaBrowserCompat$ItemReceiver) {
            RatingCompat.MediaBrowserCompat$ItemReceiver = f;
            RatingCompat.MediaBrowserCompat$CustomActionResultReceiver((Rect) null);
            RatingCompat.invalidateSelf();
        }
    }

    public void write(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory, float f) {
        setSupportBackgroundTintMode RatingCompat = RatingCompat(checkCaptureModule_GetICheckDetectorFactory);
        boolean MediaBrowserCompat$CustomActionResultReceiver = checkCaptureModule_GetICheckDetectorFactory.MediaBrowserCompat$CustomActionResultReceiver();
        boolean read = checkCaptureModule_GetICheckDetectorFactory.read();
        if (!(f == RatingCompat.MediaBrowserCompat$CustomActionResultReceiver && RatingCompat.write == MediaBrowserCompat$CustomActionResultReceiver && RatingCompat.read == read)) {
            RatingCompat.MediaBrowserCompat$CustomActionResultReceiver = f;
            RatingCompat.write = MediaBrowserCompat$CustomActionResultReceiver;
            RatingCompat.read = read;
            RatingCompat.MediaBrowserCompat$CustomActionResultReceiver((Rect) null);
            RatingCompat.invalidateSelf();
        }
        MediaBrowserCompat$SearchResultReceiver(checkCaptureModule_GetICheckDetectorFactory);
    }

    public float write(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory) {
        return RatingCompat(checkCaptureModule_GetICheckDetectorFactory).MediaBrowserCompat$CustomActionResultReceiver;
    }

    public float read(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory) {
        return IconCompatParcelizer(checkCaptureModule_GetICheckDetectorFactory) * 2.0f;
    }

    public float MediaBrowserCompat$CustomActionResultReceiver(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory) {
        return IconCompatParcelizer(checkCaptureModule_GetICheckDetectorFactory) * 2.0f;
    }

    public float IconCompatParcelizer(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory) {
        return RatingCompat(checkCaptureModule_GetICheckDetectorFactory).MediaBrowserCompat$ItemReceiver;
    }

    public void read(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory, float f) {
        checkCaptureModule_GetICheckDetectorFactory.MediaBrowserCompat$ItemReceiver().setElevation(f);
    }

    public void MediaBrowserCompat$SearchResultReceiver(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory) {
        if (!checkCaptureModule_GetICheckDetectorFactory.MediaBrowserCompat$CustomActionResultReceiver()) {
            checkCaptureModule_GetICheckDetectorFactory.read(0, 0, 0, 0);
            return;
        }
        float write = write(checkCaptureModule_GetICheckDetectorFactory);
        float IconCompatParcelizer = IconCompatParcelizer(checkCaptureModule_GetICheckDetectorFactory);
        int ceil = (int) Math.ceil((double) AppCompatButton.read(write, IconCompatParcelizer, checkCaptureModule_GetICheckDetectorFactory.read()));
        int ceil2 = (int) Math.ceil((double) AppCompatButton.MediaBrowserCompat$ItemReceiver(write, IconCompatParcelizer, checkCaptureModule_GetICheckDetectorFactory.read()));
        checkCaptureModule_GetICheckDetectorFactory.read(ceil, ceil2, ceil, ceil2);
    }

    public void MediaBrowserCompat$ItemReceiver(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory) {
        write(checkCaptureModule_GetICheckDetectorFactory, write(checkCaptureModule_GetICheckDetectorFactory));
    }

    public void MediaDescriptionCompat(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory) {
        write(checkCaptureModule_GetICheckDetectorFactory, write(checkCaptureModule_GetICheckDetectorFactory));
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory, ColorStateList colorStateList) {
        setSupportBackgroundTintMode RatingCompat = RatingCompat(checkCaptureModule_GetICheckDetectorFactory);
        RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(colorStateList);
        RatingCompat.invalidateSelf();
    }

    private setSupportBackgroundTintMode RatingCompat(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory) {
        return (setSupportBackgroundTintMode) checkCaptureModule_GetICheckDetectorFactory.IconCompatParcelizer();
    }
}
