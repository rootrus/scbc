package p040o;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import p040o.Constraints;

/* renamed from: o.removeEntryImpl */
public final /* synthetic */ class removeEntryImpl implements findFragmentByWho {
    public /* synthetic */ removeEntryImpl(newLinkedHashMap newlinkedhashmap) {
    }

    public final Object IconCompatParcelizer(Object obj) {
        FirebaseApp firebaseApp = (FirebaseApp) obj;
        Constraints.ConstrainedListIterator MediaBrowserCompat$CustomActionResultReceiver = Constraints.ConstrainedListIterator.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.write = firebaseApp.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.read = firebaseApp.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = firebaseApp.read;
        double doubleValue = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(firebaseApp.MediaBrowserCompat$MediaItem).doubleValue();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setDecimalSeparator('.');
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = new DecimalFormat("#################0.00", decimalFormatSymbols).format(doubleValue);
        MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = firebaseApp.MediaMetadataCompat;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = firebaseApp.write;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = firebaseApp.MediaBrowserCompat$SearchResultReceiver;
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
