package p040o;

import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: o.newJsonWriter */
public class newJsonWriter extends writeUInt64NoTag<getEyes> {
    @HmlPinActivity
    public newJsonWriter(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    public static String MediaBrowserCompat$ItemReceiver(int i, isEagerInDefaultApp iseagerindefaultapp) {
        return NumberFormat.getInstance(Locale.getDefault()).format(iseagerindefaultapp.MediaSessionCompat$ResultReceiverWrapper.f2870x50fd9e4a.IconCompatParcelizer.longValue() * ((long) (i + 1)));
    }

    public static String read(int i, isEagerInDefaultApp iseagerindefaultapp) {
        return NumberFormat.getInstance(Locale.getDefault()).format(((long) iseagerindefaultapp.MediaSessionCompat$ResultReceiverWrapper.PlaybackStateCompat$CustomAction.intValue()) * ((long) (i + 1)));
    }
}
