package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import p040o.C3507xc4d54cd0;
import p040o.ImmutableMultiset;
import p040o.ImmutableMultiset$Builder$MediaBrowserCompat$ItemReceiver;
import p040o.ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem;

/* renamed from: o.isInetAddress */
public final class isInetAddress extends constrainedListMultimap {
    @HmlPinActivity
    public isInetAddress(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static ImmutableMultiset.Builder read(getSignal getsignal, String str) {
        int read = getsignal.read();
        if (read == 14) {
            C3506xb5079cef read2 = ImmutableMultiset.Builder.read();
            ImmutableMultiset.Builder.MediaMetadataCompat.read MediaBrowserCompat$ItemReceiver = ImmutableMultiset.Builder.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = getsignal.IconCompatParcelizer;
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = str;
            read2.MediaMetadataCompat = new ArrayList(Arrays.asList(new ImmutableMultiset.Builder.MediaMetadataCompat[]{new ImmutableMultiset.Builder.MediaMetadataCompat(MediaBrowserCompat$ItemReceiver, (byte) 0)}));
            return new ImmutableMultiset.Builder(read2, (byte) 0);
        } else if (read != 15) {
            switch (read) {
                case 2:
                    C3506xb5079cef read3 = ImmutableMultiset.Builder.read();
                    ImmutableMultiset.Builder.read.write MediaBrowserCompat$CustomActionResultReceiver = ImmutableMultiset.Builder.read.MediaBrowserCompat$CustomActionResultReceiver();
                    MediaBrowserCompat$CustomActionResultReceiver.write = getsignal.IconCompatParcelizer;
                    MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = str;
                    read3.IconCompatParcelizer = new ArrayList(Arrays.asList(new ImmutableMultiset.Builder.read[]{new ImmutableMultiset.Builder.read(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0)}));
                    return new ImmutableMultiset.Builder(read3, (byte) 0);
                case 3:
                    C3506xb5079cef read4 = ImmutableMultiset.Builder.read();
                    C3505xf953c611 read5 = ImmutableMultiset.Builder.IconCompatParcelizer.read();
                    read5.write = getsignal.IconCompatParcelizer;
                    read5.IconCompatParcelizer = str;
                    read4.read = new ArrayList(Arrays.asList(new ImmutableMultiset.Builder.IconCompatParcelizer[]{new ImmutableMultiset.Builder.IconCompatParcelizer(read5, (byte) 0)}));
                    return new ImmutableMultiset.Builder(read4, (byte) 0);
                case 4:
                    C3506xb5079cef read6 = ImmutableMultiset.Builder.read();
                    ImmutableMultiset$Builder$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer IconCompatParcelizer = ImmutableMultiset$Builder$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
                    IconCompatParcelizer.read = getsignal.IconCompatParcelizer;
                    IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = str;
                    read6.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList(Arrays.asList(new ImmutableMultiset$Builder$MediaBrowserCompat$ItemReceiver[]{new ImmutableMultiset$Builder$MediaBrowserCompat$ItemReceiver(IconCompatParcelizer, (byte) 0)}));
                    return new ImmutableMultiset.Builder(read6, (byte) 0);
                case 5:
                    C3506xb5079cef read7 = ImmutableMultiset.Builder.read();
                    ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem.IconCompatParcelizer IconCompatParcelizer2 = ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem.IconCompatParcelizer();
                    IconCompatParcelizer2.read = getsignal.IconCompatParcelizer;
                    IconCompatParcelizer2.write = str;
                    read7.write = new ArrayList(Arrays.asList(new ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem[]{new ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem(IconCompatParcelizer2, (byte) 0)}));
                    return new ImmutableMultiset.Builder(read7, (byte) 0);
                case 6:
                    C3506xb5079cef read8 = ImmutableMultiset.Builder.read();
                    ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem.IconCompatParcelizer IconCompatParcelizer3 = ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem.IconCompatParcelizer();
                    IconCompatParcelizer3.read = getsignal.IconCompatParcelizer;
                    IconCompatParcelizer3.write = str;
                    read8.MediaDescriptionCompat = new ArrayList(Arrays.asList(new ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem[]{new ImmutableMultiset$Builder$MediaBrowserCompat$MediaItem(IconCompatParcelizer3, (byte) 0)}));
                    return new ImmutableMultiset.Builder(read8, (byte) 0);
                case 7:
                    C3506xb5079cef read9 = ImmutableMultiset.Builder.read();
                    C3507xc4d54cd0.read IconCompatParcelizer4 = C3507xc4d54cd0.IconCompatParcelizer();
                    IconCompatParcelizer4.read = getsignal.IconCompatParcelizer;
                    IconCompatParcelizer4.MediaBrowserCompat$CustomActionResultReceiver = str;
                    read9.MediaBrowserCompat$MediaItem = new ArrayList(Arrays.asList(new C3507xc4d54cd0[]{new C3507xc4d54cd0(IconCompatParcelizer4, (byte) 0)}));
                    return new ImmutableMultiset.Builder(read9, (byte) 0);
                default:
                    return null;
            }
        } else {
            C3506xb5079cef read10 = ImmutableMultiset.Builder.read();
            ImmutableMultiset.Builder.write.read read11 = ImmutableMultiset.Builder.write.read();
            read11.write = getsignal.IconCompatParcelizer;
            read11.MediaBrowserCompat$CustomActionResultReceiver = str;
            read10.MediaBrowserCompat$ItemReceiver = new ArrayList(Arrays.asList(new ImmutableMultiset.Builder.write[]{new ImmutableMultiset.Builder.write(read11, (byte) 0)}));
            return new ImmutableMultiset.Builder(read10, (byte) 0);
        }
    }
}
