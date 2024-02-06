package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.AlertController$RecycleListView;
import p040o.InstallationResponse;
import p040o.ThreadFactoryBuilder;
import p040o.access$2300;

/* renamed from: o.FirebaseVisionCloudDetectorOptions$MediaBrowserCompat$ItemReceiver */
public class C9736x97ce62ae extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzxo> {
    final /* synthetic */ FirebaseVisionCloudDetectorOptions MediaBrowserCompat$ItemReceiver;

    private C9736x97ce62ae(FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        this.MediaBrowserCompat$ItemReceiver = firebaseVisionCloudDetectorOptions;
    }

    public /* synthetic */ C9736x97ce62ae(FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions, byte b) {
        this(firebaseVisionCloudDetectorOptions);
    }

    public final /* synthetic */ void onNext(Object obj) {
        TimeLimiter timeLimiter;
        zzxo zzxo = (zzxo) obj;
        putAllImpl unused = this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
        notifyBackgroundStateChangeListeners MediaBrowserCompat$MediaItem = this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat;
        String RatingCompat = this.MediaBrowserCompat$ItemReceiver.read;
        ThreadFactoryBuilder.C38611 write = ThreadFactoryBuilder.C38611.write();
        write.write = zzxo.MediaBrowserCompat$ItemReceiver;
        write.MediaDescriptionCompat = MediaBrowserCompat$MediaItem.IconCompatParcelizer;
        write.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver;
        write.MediaMetadataCompat = Double.valueOf(zzxo.write).doubleValue();
        write.IconCompatParcelizer = RatingCompat;
        write.MediaBrowserCompat$ItemReceiver = zzxo.read;
        if (zzxo.read) {
            timeLimiter = null;
        } else {
            zzxm zzxm = zzxo.MediaBrowserCompat$CustomActionResultReceiver;
            timeLimiter = new TimeLimiter(zzxm.read, zzxm.MediaBrowserCompat$CustomActionResultReceiver);
        }
        write.read = timeLimiter;
        FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions = this.MediaBrowserCompat$ItemReceiver;
        writeRequestBodyToOutputStream writerequestbodytooutputstream = new writeRequestBodyToOutputStream(write);
        if (firebaseVisionCloudDetectorOptions.RatingCompat != null) {
            writerequestbodytooutputstream.IconCompatParcelizer(firebaseVisionCloudDetectorOptions.RatingCompat);
        }
    }

    public final void onComplete() {
        FirebaseVisionCloudDetectorOptions.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        access$2200 access_2200;
        if (!this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            String str = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS).IconCompatParcelizer;
            if (!writeUInt64NoTag.MediaBrowserCompat$CustomActionResultReceiver(th) || str == null) {
                FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions = this.MediaBrowserCompat$ItemReceiver;
                InstallationResponse.Builder builder = new InstallationResponse.Builder(this);
                if (th instanceof RetrofitException) {
                    RetrofitException retrofitException = (RetrofitException) th;
                    if (!(retrofitException.IconCompatParcelizer == null || retrofitException.IconCompatParcelizer.write == null || AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(retrofitException.IconCompatParcelizer.write.write))) {
                        access_2200 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) builder);
                        access_2200.MediaBrowserCompat$ItemReceiver = retrofitException.IconCompatParcelizer.write.write;
                        firebaseVisionCloudDetectorOptions.MediaBrowserCompat$ItemReceiver(access_2200);
                        return;
                    }
                }
                access_2200 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) builder);
                firebaseVisionCloudDetectorOptions.MediaBrowserCompat$ItemReceiver(access_2200);
                return;
            }
            FirebaseVisionCloudDetectorOptions.read(this.MediaBrowserCompat$ItemReceiver);
            FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions2 = this.MediaBrowserCompat$ItemReceiver;
            generateAuthToken generateauthtoken = new generateAuthToken(str);
            if (firebaseVisionCloudDetectorOptions2.RatingCompat != null) {
                generateauthtoken.IconCompatParcelizer(firebaseVisionCloudDetectorOptions2.RatingCompat);
            }
        }
    }
}
