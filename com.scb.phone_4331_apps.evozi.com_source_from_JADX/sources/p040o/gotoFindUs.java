package p040o;

import java.net.InetAddress;
import java.util.Collection;

/* renamed from: o.gotoFindUs */
public class gotoFindUs implements Cloneable {
    public static final gotoFindUs IconCompatParcelizer = new gotoFindUs$MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$ItemReceiver();
    private final InetAddress AlertController$RecycleListView;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;
    public final int MediaBrowserCompat$MediaItem;
    public final boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean f5542x50fd9e4a;
    public final boolean MediaDescriptionCompat;
    public final Collection<String> MediaMetadataCompat;
    public final Collection<String> MediaSessionCompat$QueueItem;
    public final boolean MediaSessionCompat$ResultReceiverWrapper;
    public final boolean MediaSessionCompat$Token;
    public final int ParcelableVolumeInfo;
    private final boolean PlaybackStateCompat$CustomAction;
    public final String RatingCompat;
    public final int read;
    private final PrivacyManagementLandingViewHolder setHasDecor;
    public final int write;

    protected gotoFindUs() {
        this(false, (PrivacyManagementLandingViewHolder) null, (InetAddress) null, false, (String) null, false, false, false, 0, false, (Collection<String>) null, (Collection<String>) null, 0, 0, 0, true, true);
    }

    gotoFindUs(boolean z, PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, InetAddress inetAddress, boolean z2, String str, boolean z3, boolean z4, boolean z5, int i, boolean z6, Collection<String> collection, Collection<String> collection2, int i2, int i3, int i4, boolean z7, boolean z8) {
        this.MediaDescriptionCompat = z;
        this.setHasDecor = privacyManagementLandingViewHolder;
        this.AlertController$RecycleListView = inetAddress;
        this.f5542x50fd9e4a = z2;
        this.RatingCompat = str;
        this.MediaSessionCompat$Token = z3;
        this.MediaSessionCompat$ResultReceiverWrapper = z4;
        this.MediaBrowserCompat$ItemReceiver = z5;
        this.MediaBrowserCompat$MediaItem = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = z6;
        this.MediaSessionCompat$QueueItem = collection;
        this.MediaMetadataCompat = collection2;
        this.write = i2;
        this.read = i3;
        this.ParcelableVolumeInfo = i4;
        this.PlaybackStateCompat$CustomAction = z7;
        this.MediaBrowserCompat$SearchResultReceiver = z8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append("expectContinueEnabled=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", proxy=");
        sb.append(this.setHasDecor);
        sb.append(", localAddress=");
        sb.append(this.AlertController$RecycleListView);
        sb.append(", cookieSpec=");
        sb.append(this.RatingCompat);
        sb.append(", redirectsEnabled=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", relativeRedirectsAllowed=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", maxRedirects=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", circularRedirectsAllowed=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", authenticationEnabled=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", targetPreferredAuthSchemes=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", proxyPreferredAuthSchemes=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", connectionRequestTimeout=");
        sb.append(this.write);
        sb.append(", connectTimeout=");
        sb.append(this.read);
        sb.append(", socketTimeout=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", contentCompressionEnabled=");
        sb.append(this.PlaybackStateCompat$CustomAction);
        sb.append(", normalizeUri=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append("]");
        return sb.toString();
    }

    public static gotoFindUs$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver(gotoFindUs gotofindus) {
        gotoFindUs$MediaBrowserCompat$ItemReceiver gotofindus_mediabrowsercompat_itemreceiver = new gotoFindUs$MediaBrowserCompat$ItemReceiver();
        gotofindus_mediabrowsercompat_itemreceiver.MediaDescriptionCompat = gotofindus.MediaDescriptionCompat;
        gotofindus_mediabrowsercompat_itemreceiver.MediaSessionCompat$ResultReceiverWrapper = gotofindus.setHasDecor;
        gotofindus_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver = gotofindus.AlertController$RecycleListView;
        gotofindus_mediabrowsercompat_itemreceiver.Keep = gotofindus.f5542x50fd9e4a;
        gotofindus_mediabrowsercompat_itemreceiver.MediaBrowserCompat$MediaItem = gotofindus.RatingCompat;
        gotofindus_mediabrowsercompat_itemreceiver.ParcelableVolumeInfo = gotofindus.MediaSessionCompat$Token;
        gotofindus_mediabrowsercompat_itemreceiver.MediaSessionCompat$Token = gotofindus.MediaSessionCompat$ResultReceiverWrapper;
        gotofindus_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = gotofindus.MediaBrowserCompat$ItemReceiver;
        gotofindus_mediabrowsercompat_itemreceiver.MediaMetadataCompat = gotofindus.MediaBrowserCompat$MediaItem;
        gotofindus_mediabrowsercompat_itemreceiver.IconCompatParcelizer = gotofindus.MediaBrowserCompat$CustomActionResultReceiver;
        gotofindus_mediabrowsercompat_itemreceiver.PlaybackStateCompat = gotofindus.MediaSessionCompat$QueueItem;
        gotofindus_mediabrowsercompat_itemreceiver.MediaSessionCompat$QueueItem = gotofindus.MediaMetadataCompat;
        gotofindus_mediabrowsercompat_itemreceiver.write = gotofindus.write;
        gotofindus_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = gotofindus.read;
        gotofindus_mediabrowsercompat_itemreceiver.f5543x50fd9e4a = gotofindus.ParcelableVolumeInfo;
        gotofindus_mediabrowsercompat_itemreceiver.read = gotofindus.PlaybackStateCompat$CustomAction;
        gotofindus_mediabrowsercompat_itemreceiver.read = gotofindus.PlaybackStateCompat$CustomAction;
        gotofindus_mediabrowsercompat_itemreceiver.RatingCompat = gotofindus.MediaBrowserCompat$SearchResultReceiver;
        return gotofindus_mediabrowsercompat_itemreceiver;
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (gotoFindUs) super.clone();
    }
}
