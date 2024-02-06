package p040o;

/* renamed from: o.FragmentBuilder_BindFundOnboardingTermsAndConditionsFragment */
public final class FragmentBuilder_BindFundOnboardingTermsAndConditionsFragment {
    public final long IconCompatParcelizer;
    public final long MediaBrowserCompat$CustomActionResultReceiver;
    public final long MediaBrowserCompat$ItemReceiver;
    public final int MediaBrowserCompat$MediaItem;
    public final int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private long f3143x50fd9e4a;
    public final int MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final long MediaSessionCompat$ResultReceiverWrapper;
    public final long MediaSessionCompat$Token;
    public final int ParcelableVolumeInfo;
    public final long RatingCompat;
    public final long read;
    public final long write;

    public FragmentBuilder_BindFundOnboardingTermsAndConditionsFragment(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.MediaDescriptionCompat = i;
        this.MediaBrowserCompat$SearchResultReceiver = i2;
        this.write = j;
        this.MediaBrowserCompat$CustomActionResultReceiver = j2;
        this.RatingCompat = j3;
        this.MediaSessionCompat$Token = j4;
        this.MediaSessionCompat$ResultReceiverWrapper = j5;
        this.read = j6;
        this.MediaBrowserCompat$ItemReceiver = j7;
        this.IconCompatParcelizer = j8;
        this.MediaBrowserCompat$MediaItem = i3;
        this.MediaMetadataCompat = i4;
        this.ParcelableVolumeInfo = i5;
        this.f3143x50fd9e4a = j9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StatsSnapshot{maxSize=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", size=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", cacheHits=");
        sb.append(this.write);
        sb.append(", cacheMisses=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", downloadCount=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", totalDownloadSize=");
        sb.append(this.RatingCompat);
        sb.append(", averageDownloadSize=");
        sb.append(this.read);
        sb.append(", totalOriginalBitmapSize=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", totalTransformedBitmapSize=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", averageOriginalBitmapSize=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", averageTransformedBitmapSize=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", originalBitmapCount=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", transformedBitmapCount=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", timeStamp=");
        sb.append(this.f3143x50fd9e4a);
        sb.append('}');
        return sb.toString();
    }
}
