package p040o;

import p040o.ImagePerfectionProfile;

/* renamed from: o.ImagePerfectionProfile$UseTargetFrameCrop$MediaBrowserCompat$ItemReceiver */
public final class C9765x8112e4b2 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    final /* synthetic */ ImagePerfectionProfile.UseTargetFrameCrop IconCompatParcelizer;

    private C9765x8112e4b2(ImagePerfectionProfile.UseTargetFrameCrop useTargetFrameCrop) {
        this.IconCompatParcelizer = useTargetFrameCrop;
    }

    public /* synthetic */ C9765x8112e4b2(ImagePerfectionProfile.UseTargetFrameCrop useTargetFrameCrop, byte b) {
        this(useTargetFrameCrop);
    }

    public final void onError(Throwable th) {
        if (!this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            ImagePerfectionProfile.UseTargetFrameCrop.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
            ImagePerfectionProfile.UseTargetFrameCrop useTargetFrameCrop = this.IconCompatParcelizer;
            getUseTargetFrameCrop getusetargetframecrop = new getUseTargetFrameCrop(this, th);
            if (useTargetFrameCrop.RatingCompat != null) {
                getusetargetframecrop.IconCompatParcelizer(useTargetFrameCrop.RatingCompat);
            }
            boolean unused = this.IconCompatParcelizer.write = false;
        }
    }

    public final /* synthetic */ void onNext(Object obj) {
        ImagePerfectionProfile.UseTargetFrameCrop useTargetFrameCrop = this.IconCompatParcelizer;
        ImageSource imageSource = ImageSource.read;
        if (useTargetFrameCrop.RatingCompat != null) {
            imageSource.IconCompatParcelizer(useTargetFrameCrop.RatingCompat);
        }
        ImagePerfectionProfile.UseTargetFrameCrop.read(this.IconCompatParcelizer);
        boolean unused = this.IconCompatParcelizer.write = false;
    }
}
