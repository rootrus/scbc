package p040o;

import com.scb.phone.view.activity.bscanc.QRPaymentCoachMarkActivity;
import com.scb.phone.view.activity.cardmanagement.CardActivationActivity;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.Multisets;
import p040o.addAnalysisProgressEventListener;
import p040o.writeUInt64NoTag;
import p040o.zzcb;

/* renamed from: o.g */
public final /* synthetic */ class C9946g implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzcb.zzf.zza read;
    private final /* synthetic */ addAnalysisProgressEventListener.write write;

    /* renamed from: o.g$a */
    public final /* synthetic */ class C4444a implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ C4444a(boolean z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        public final void IconCompatParcelizer(Object obj) {
            VideoPlayerCameraSourceType.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, (getBlackStreakMaxHeight) obj);
        }
    }

    public /* synthetic */ C9946g(addAnalysisProgressEventListener.write write2, zzcb.zzf.zza zza) {
        this.write = write2;
        this.read = zza;
    }

    /* renamed from: o.g$1 */
    public final class C71031 implements MileageQuantitySelectionActivity<QRPaymentCoachMarkActivity> {
        public static void IconCompatParcelizer(QRPaymentCoachMarkActivity qRPaymentCoachMarkActivity, shouldSendSdkHeartBeat shouldsendsdkheartbeat) {
            qRPaymentCoachMarkActivity.presenter = shouldsendsdkheartbeat;
        }
    }

    /* renamed from: o.g$b */
    public final class C7105b implements MileageQuantitySelectionActivity<CardActivationActivity> {
        public static void IconCompatParcelizer(CardActivationActivity cardActivationActivity, FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
            cardActivationActivity.cardActivationPresenter = firebaseVisionCloudDetectorOptions;
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        addAnalysisProgressEventListener.write write2 = this.write;
        zzcb.zzf.zza zza = this.read;
        Multisets.SetMultiset.ElementSet IconCompatParcelizer = addAnalysisProgressEventListener.this.MediaBrowserCompat$MediaItem;
        onGetStartedClick.write((Object) zza, "requestResult");
        ((CheckExtractActivity_MembersInjector.PlaybackStateCompat.CustomAction) obj).IconCompatParcelizer(new isPowerConnected(zza.IconCompatParcelizer, zza.write, zza.MediaBrowserCompat$ItemReceiver, IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver(zza.MediaBrowserCompat$CustomActionResultReceiver)));
    }
}
