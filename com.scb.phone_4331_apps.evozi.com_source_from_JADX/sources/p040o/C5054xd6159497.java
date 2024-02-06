package p040o;

import android.text.TextUtils;
import p040o.CrashlyticsReport;
import p040o.StreetViewPanoramaFragment;
import p040o.access$2300;

/* renamed from: o.nativeWriteImageToFileBuffer$MediaBrowserCompat$CustomActionResultReceiver */
class C5054xd6159497 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<StreetViewPanoramaFragment.zza> {
    private final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder IconCompatParcelizer;
    final /* synthetic */ nativeWriteImageToFileBuffer MediaBrowserCompat$CustomActionResultReceiver;

    public final /* synthetic */ void onNext(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        StreetViewPanoramaFragment.zza zza = (StreetViewPanoramaFragment.zza) obj;
        nativeWriteImageToFileBuffer.MediaSessionCompat$ResultReceiverWrapper(this.MediaBrowserCompat$CustomActionResultReceiver);
        onInfoWindowLongClick read = onInfoWindowLongClick.read();
        String str5 = "";
        if (this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver != null) {
            str = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        } else {
            str = str5;
        }
        read.setBackgroundResource = str;
        if (this.IconCompatParcelizer.MediaMetadataCompat != null) {
            str2 = this.IconCompatParcelizer.MediaMetadataCompat;
        } else {
            str2 = str5;
        }
        read.AppCompatDelegateImpl$ListMenuDecorView = str2;
        if (this.IconCompatParcelizer.RatingCompat != null) {
            str3 = this.IconCompatParcelizer.RatingCompat;
        } else {
            str3 = str5;
        }
        read.AppCompatViewInflater = str3;
        if (this.IconCompatParcelizer.MediaDescriptionCompat != null) {
            str4 = this.IconCompatParcelizer.MediaDescriptionCompat;
        } else {
            str4 = str5;
        }
        read.setChecked = str4;
        read.MediaBrowserCompat$MediaItem = this.IconCompatParcelizer.read;
        if (this.IconCompatParcelizer.MediaBrowserCompat$MediaItem != null) {
            str5 = this.IconCompatParcelizer.MediaBrowserCompat$MediaItem;
        }
        read.setCheckable = str5;
        nativeWriteImageToFileBuffer nativewriteimagetofilebuffer = this.MediaBrowserCompat$CustomActionResultReceiver;
        CrashlyticsReport.Session.Event.Application.Execution unused = nativewriteimagetofilebuffer.write = nativewriteimagetofilebuffer.MediaSessionCompat$QueueItem.write(zza.write, read, this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.IconCompatParcelizer.setCheckable());
        if (this.MediaBrowserCompat$CustomActionResultReceiver.write != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write.setTitle = this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
            nativeWriteImageToFileBuffer nativewriteimagetofilebuffer2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            GrayScaleAndLaplacianShader grayScaleAndLaplacianShader = new GrayScaleAndLaplacianShader(this);
            boolean z = true;
            if (nativewriteimagetofilebuffer2.RatingCompat != null) {
                grayScaleAndLaplacianShader.IconCompatParcelizer(nativewriteimagetofilebuffer2.RatingCompat);
            }
            if (!TextUtils.isEmpty(this.MediaBrowserCompat$CustomActionResultReceiver.write.setGroupDividerEnabled)) {
                nativeWriteImageToFileBuffer nativewriteimagetofilebuffer3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                getProgram getprogram = new getProgram(this);
                if (nativewriteimagetofilebuffer3.RatingCompat != null) {
                    getprogram.IconCompatParcelizer(nativewriteimagetofilebuffer3.RatingCompat);
                }
            }
            if (!TextUtils.isEmpty(this.MediaBrowserCompat$CustomActionResultReceiver.write.ExpandedMenuView)) {
                nativeWriteImageToFileBuffer nativewriteimagetofilebuffer4 = this.MediaBrowserCompat$CustomActionResultReceiver;
                GrayGaussianBlur3x3Shader grayGaussianBlur3x3Shader = new GrayGaussianBlur3x3Shader(this);
                if (nativewriteimagetofilebuffer4.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    grayGaussianBlur3x3Shader.IconCompatParcelizer(nativewriteimagetofilebuffer4.RatingCompat);
                }
            }
        }
    }

    public C5054xd6159497(nativeWriteImageToFileBuffer nativewriteimagetofilebuffer, CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nativewriteimagetofilebuffer;
        this.IconCompatParcelizer = builder;
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
