package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import p040o.CrashlyticsReport;
import p040o.SignedBytes;

/* renamed from: o.AbstractService */
public final class AbstractService extends SignedBytes.LexicographicalComparator {
    @HmlPinActivity
    public AbstractService(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
    }

    /* renamed from: o.AbstractService$Transition */
    public final /* synthetic */ class Transition implements findFragmentByWho {
        public static final /* synthetic */ Transition MediaBrowserCompat$CustomActionResultReceiver = new Transition();

        private /* synthetic */ Transition() {
        }

        public final Object IconCompatParcelizer(Object obj) {
            setOnIndoorStateChangeListener setonindoorstatechangelistener = (setOnIndoorStateChangeListener) obj;
            return new CrashlyticsReport.Session.OperatingSystem.Builder(setonindoorstatechangelistener.MediaDescriptionCompat, setonindoorstatechangelistener.IconCompatParcelizer, setonindoorstatechangelistener.write, setonindoorstatechangelistener.MediaBrowserCompat$CustomActionResultReceiver, setonindoorstatechangelistener.MediaBrowserCompat$ItemReceiver, setonindoorstatechangelistener.read);
        }
    }

    public final parseEventSignal IconCompatParcelizer(setZoomControlsEnabled setzoomcontrolsenabled) {
        String str;
        if (setzoomcontrolsenabled.RatingCompat == null || setzoomcontrolsenabled.RatingCompat.isEmpty()) {
            str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.reference);
        } else {
            str = setzoomcontrolsenabled.RatingCompat;
        }
        parseEventSignal write = parseEventSignal.write();
        if ("PREPAID".equalsIgnoreCase(setzoomcontrolsenabled.MediaBrowserCompat$MediaItem)) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance.setMinimumFractionDigits(2);
            currencyInstance.setMaximumFractionDigits(2);
            String format = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(100);
            NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance2.setMinimumFractionDigits(2);
            currencyInstance2.setMaximumFractionDigits(2);
            String format2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance2).format(50000);
            write.f2915x50fd9e4a = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.two_words_with_separator), new Object[]{format, format2});
        }
        write.MediaDescriptionCompat = setzoomcontrolsenabled.read;
        write.RatingCompat = setzoomcontrolsenabled.MediaBrowserCompat$CustomActionResultReceiver;
        write.AlertController$RecycleListView = setzoomcontrolsenabled.MediaDescriptionCompat;
        write.MediaSessionCompat$QueueItem = write(setzoomcontrolsenabled.MediaBrowserCompat$ItemReceiver);
        parseEventSignal MediaBrowserCompat$ItemReceiver = write.MediaBrowserCompat$ItemReceiver(mo26549c_(setzoomcontrolsenabled.write));
        MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.two_words), new Object[]{this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.input), str});
        MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo = str;
        parseEventSignal write2 = MediaBrowserCompat$ItemReceiver.write(setzoomcontrolsenabled.IconCompatParcelizer);
        write2.PlaybackStateCompat$CustomAction = setzoomcontrolsenabled.MediaBrowserCompat$MediaItem;
        return write2;
    }

    public final parseEventSignal read(List<setZoomControlsEnabled> list, onInfoWindowLongClick oninfowindowlongclick) {
        isSupportFragmentClass issupportfragmentclass;
        show show = new show(list);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new AbstractListenableFuture(oninfowindowlongclick)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (!(issupportfragmentclass.IconCompatParcelizer != null)) {
            return null;
        }
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            parseEventSignal MediaMetadataCompat = IconCompatParcelizer((setZoomControlsEnabled) t).MediaMetadataCompat();
            MediaMetadataCompat.MediaBrowserCompat$MediaItem = oninfowindowlongclick.AppCompatDialogFragment;
            MediaMetadataCompat.Keep = oninfowindowlongclick.AppCompatDelegateImpl$ListMenuDecorView;
            MediaMetadataCompat.MediaBrowserCompat$SearchResultReceiver = write(Double.valueOf(oninfowindowlongclick.MediaBrowserCompat$MediaItem));
            MediaMetadataCompat.setHasDecor = oninfowindowlongclick.setCheckable;
            MediaMetadataCompat.MediaSessionCompat$ResultReceiverWrapper = oninfowindowlongclick.PlaybackStateCompat$CustomAction;
            return MediaMetadataCompat;
        }
        throw new NoSuchElementException("No value present");
    }
}
