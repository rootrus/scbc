package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.replaceInParent$MediaBrowserCompat$ItemReceiver */
public final class replaceInParent$MediaBrowserCompat$ItemReceiver {
    public final float IconCompatParcelizer;
    public final float MediaBrowserCompat$CustomActionResultReceiver;
    public final float MediaBrowserCompat$ItemReceiver;
    public final float MediaBrowserCompat$MediaItem;
    public final float MediaBrowserCompat$SearchResultReceiver;
    public final float MediaDescriptionCompat;
    public final float MediaMetadataCompat;
    public final float read;
    public final float write;

    private replaceInParent$MediaBrowserCompat$ItemReceiver() {
    }

    private replaceInParent$MediaBrowserCompat$ItemReceiver(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.MediaBrowserCompat$CustomActionResultReceiver = f;
        this.IconCompatParcelizer = f4;
        this.write = f7;
        this.read = f2;
        this.MediaBrowserCompat$ItemReceiver = f5;
        this.MediaDescriptionCompat = f8;
        this.MediaBrowserCompat$SearchResultReceiver = f3;
        this.MediaBrowserCompat$MediaItem = f6;
        this.MediaMetadataCompat = f9;
    }

    public static replaceInParent$MediaBrowserCompat$ItemReceiver write(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return MediaBrowserCompat$CustomActionResultReceiver(f9, f10, f11, f12, f13, f14, f15, f16).write(MediaBrowserCompat$CustomActionResultReceiver(f, f2, f3, f4, f5, f6, f7, f8).read());
    }

    private static replaceInParent$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == BitmapDescriptorFactory.HUE_RED && f10 == BitmapDescriptorFactory.HUE_RED) {
            return new replaceInParent$MediaBrowserCompat$ItemReceiver(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new replaceInParent$MediaBrowserCompat$ItemReceiver((f3 - f) + (f16 * f3), (f7 - f) + (f17 * f7), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    private replaceInParent$MediaBrowserCompat$ItemReceiver read() {
        float f = this.MediaBrowserCompat$ItemReceiver;
        float f2 = this.MediaMetadataCompat;
        float f3 = this.MediaDescriptionCompat;
        float f4 = this.MediaBrowserCompat$MediaItem;
        float f5 = this.MediaBrowserCompat$SearchResultReceiver;
        float f6 = this.read;
        float f7 = this.write;
        float f8 = this.IconCompatParcelizer;
        float f9 = this.MediaBrowserCompat$CustomActionResultReceiver;
        return new replaceInParent$MediaBrowserCompat$ItemReceiver((f * f2) - (f3 * f4), (f3 * f5) - (f6 * f2), (f6 * f4) - (f * f5), (f7 * f4) - (f8 * f2), (f2 * f9) - (f7 * f5), (f5 * f8) - (f4 * f9), (f8 * f3) - (f7 * f), (f7 * f6) - (f3 * f9), (f9 * f) - (f8 * f6));
    }

    private replaceInParent$MediaBrowserCompat$ItemReceiver write(replaceInParent$MediaBrowserCompat$ItemReceiver replaceinparent_mediabrowsercompat_itemreceiver) {
        replaceInParent$MediaBrowserCompat$ItemReceiver replaceinparent_mediabrowsercompat_itemreceiver2 = replaceinparent_mediabrowsercompat_itemreceiver;
        float f = this.MediaBrowserCompat$CustomActionResultReceiver;
        float f2 = replaceinparent_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$CustomActionResultReceiver;
        float f3 = this.read;
        float f4 = replaceinparent_mediabrowsercompat_itemreceiver2.IconCompatParcelizer;
        float f5 = this.MediaBrowserCompat$SearchResultReceiver;
        float f6 = replaceinparent_mediabrowsercompat_itemreceiver2.write;
        float f7 = replaceinparent_mediabrowsercompat_itemreceiver2.read;
        float f8 = replaceinparent_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$ItemReceiver;
        float f9 = replaceinparent_mediabrowsercompat_itemreceiver2.MediaDescriptionCompat;
        float f10 = replaceinparent_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$SearchResultReceiver;
        float f11 = replaceinparent_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$MediaItem;
        float f12 = replaceinparent_mediabrowsercompat_itemreceiver2.MediaMetadataCompat;
        float f13 = this.IconCompatParcelizer;
        float f14 = this.MediaBrowserCompat$ItemReceiver;
        float f15 = this.MediaBrowserCompat$MediaItem;
        float f16 = this.write;
        float f17 = this.MediaDescriptionCompat;
        float f18 = this.MediaMetadataCompat;
        return new replaceInParent$MediaBrowserCompat$ItemReceiver((f * f2) + (f3 * f4) + (f5 * f6), (f * f7) + (f3 * f8) + (f5 * f9), (f * f10) + (f3 * f11) + (f5 * f12), (f13 * f2) + (f14 * f4) + (f15 * f6), (f13 * f7) + (f14 * f8) + (f15 * f9), (f15 * f12) + (f13 * f10) + (f14 * f11), (f6 * f18) + (f2 * f16) + (f4 * f17), (f7 * f16) + (f8 * f17) + (f9 * f18), (f16 * f10) + (f17 * f11) + (f18 * f12));
    }
}
