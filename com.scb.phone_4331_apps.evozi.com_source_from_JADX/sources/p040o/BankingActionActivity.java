package p040o;

import com.scb.phone.view.activity.friends.FriendsLandingActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p040o.AbstractMultimap;
import p040o.IGmsServiceBroker;
import p040o.Interners;
import p040o.ListenerHolder;
import p040o.removeAllOccurrences;
import p040o.zzbn;

/* renamed from: o.BankingActionActivity */
public final class BankingActionActivity implements AbstractMultimap.EntrySet {
    public final LifecycleFragment IconCompatParcelizer;
    private final removeAllOccurrences.write MediaBrowserCompat$CustomActionResultReceiver;
    private final LifecycleCallback MediaBrowserCompat$ItemReceiver;
    private final ListenerHolder.ListenerKey MediaDescriptionCompat;
    private final FragmentBuilder_BindSettingTabFragment MediaMetadataCompat;
    private final notifyListenerInternal RatingCompat;
    private final FriendsLandingActivity.write read;
    private final isCreated write;

    BankingActionActivity() {
    }

    static String read(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.clear();
        instance.set(1, i);
        instance.set(2, i2);
        instance.set(5, i3);
        return new SimpleDateFormat("dd/MMMM/yyyy", Locale.US).format(instance.getTime());
    }

    @HmlPinActivity
    public BankingActionActivity(FragmentBuilder_BindSettingTabFragment fragmentBuilder_BindSettingTabFragment, removeAllOccurrences.write write2, FriendsLandingActivity.write write3, isCreated iscreated, LifecycleCallback lifecycleCallback, getLifecycleActivity getlifecycleactivity, LifecycleFragment lifecycleFragment, ListenerHolder.ListenerKey listenerKey, notifyListenerInternal notifylistenerinternal) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write2;
        this.MediaMetadataCompat = fragmentBuilder_BindSettingTabFragment;
        this.read = write3;
        this.write = iscreated;
        this.MediaBrowserCompat$ItemReceiver = lifecycleCallback;
        this.IconCompatParcelizer = lifecycleFragment;
        this.MediaDescriptionCompat = listenerKey;
        this.RatingCompat = notifylistenerinternal;
    }

    public final DebitCardResetOtpActivity<List<setZoomControlsEnabled>> MediaBrowserCompat$ItemReceiver() {
        DebitCardResetOtpActivity debitCardResetOtpActivity;
        BScanCNotificationDeepLinkActivity<List<R>> list = this.read.write.getBillers().map(zzcw.IconCompatParcelizer).flatMapIterable(zzbn.zzc.MediaBrowserCompat$ItemReceiver).flatMap(zzbo.write).filter(zzev.write).map(new zzdb(this.write)).toList();
        if (list instanceof HmlLatestLoanOfferStatusDeepLinkActivity) {
            debitCardResetOtpActivity = ((HmlLatestLoanOfferStatusDeepLinkActivity) list).MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            debitCardResetOtpActivity = new FriendsLandingActivity_ViewBinding(list);
        }
        return debitCardResetOtpActivity.doOnNext(new IGmsServiceBroker.Stub(this.MediaMetadataCompat));
    }

    public final DebitCardResetOtpActivity<setTiltGesturesEnabled> write(consumingIterable consumingiterable) {
        return this.read.write.getAdditionalInfo(consumingiterable.read, consumingiterable).map(new getState(this.MediaBrowserCompat$ItemReceiver));
    }

    public final DebitCardResetOtpActivity<List<Integer>> MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return this.read.write.getBillerDenomination(str).flatMap(zzbn.zzb.write);
    }

    public final DebitCardResetOtpActivity<newLatLngBoundsWithSize> IconCompatParcelizer(String str) {
        return this.read.write.getBillerRange(str).flatMap(new zzbt(this));
    }

    public final List<setZoomControlsEnabled> read() {
        return this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver;
    }

    public final onInfoWindowLongClick write() {
        removeAllOccurrences.write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        onInfoWindowLongClick oninfowindowlongclick = write2.read;
        if (oninfowindowlongclick != null && "TOPUP".equals(oninfowindowlongclick.AlertController$RecycleListView)) {
            return write2.read;
        }
        return null;
    }

    public final DebitCardResetOtpActivity<GoogleMapOptions> write(Integer num) {
        return this.read.write.getHistory(num).map(new createDoubleArray(this.MediaDescriptionCompat));
    }

    public final DebitCardResetOtpActivity<onStreetViewPanoramaLongClick> write(checkNonnegativeIndex checknonnegativeindex) {
        return this.read.write.getPerformTopUp(checknonnegativeindex).flatMap(new zzbq(this));
    }

    public final DebitCardResetOtpActivity<onStreetViewPanoramaLongClick> MediaBrowserCompat$ItemReceiver(checkNonnegativeIndex checknonnegativeindex) {
        return this.read.write.getPerformTopUpWithReferer(checknonnegativeindex).flatMap(new zzbp(this));
    }

    public final DebitCardResetOtpActivity<setScrollGesturesEnabledDuringRotateOrZoom> MediaBrowserCompat$ItemReceiver(Interners.WeakInterner.InternReference internReference) {
        return this.read.write.getRepeat(internReference).map(new LegacyInternalGmsClient(this.RatingCompat));
    }

    public final void IconCompatParcelizer() {
        this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver = null;
    }
}
