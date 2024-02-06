package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.etb.ETBCheckIdentityCase;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;

/* renamed from: o.generateShader$MediaBrowserCompat$ItemReceiver */
public class generateShader$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    final /* synthetic */ generateShader IconCompatParcelizer;

    private generateShader$MediaBrowserCompat$ItemReceiver(generateShader generateshader) {
        this.IconCompatParcelizer = generateshader;
    }

    public /* synthetic */ generateShader$MediaBrowserCompat$ItemReceiver(generateShader generateshader, byte b) {
        this(generateshader);
    }

    public final void onError(Throwable th) {
        String str;
        ILocationSourceDelegate iLocationSourceDelegate;
        ILocationSourceDelegate.zza zza;
        generateShader.read(this.IconCompatParcelizer);
        boolean unused = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = true;
        if (th instanceof ETBCheckIdentityCase.ErrorCode3013Exception) {
            generateShader generateshader = this.IconCompatParcelizer;
            C9828T t = C9828T.MediaBrowserCompat$CustomActionResultReceiver;
            if (generateshader.RatingCompat != null) {
                t.IconCompatParcelizer(generateshader.RatingCompat);
                return;
            }
            return;
        }
        if (!(th instanceof RetrofitException) || (iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer) == null || (zza = iLocationSourceDelegate.write) == null) {
            str = "";
        } else {
            str = zza.IconCompatParcelizer;
        }
        if (str.equals("3012") || str.equals("3015")) {
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new initRectangle(this)));
        } else {
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public final /* synthetic */ void onNext(Object obj) {
        generateShader.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        generateShader generateshader = this.IconCompatParcelizer;
        ZoomGuidance zoomGuidance = ZoomGuidance.write;
        if (generateshader.RatingCompat != null) {
            zoomGuidance.IconCompatParcelizer(generateshader.RatingCompat);
        }
        boolean unused = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = true;
    }
}
