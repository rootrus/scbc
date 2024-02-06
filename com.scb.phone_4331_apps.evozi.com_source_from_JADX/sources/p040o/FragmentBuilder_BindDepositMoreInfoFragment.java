package p040o;

import android.os.Bundle;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.ntb.EkycRouterDialogFragment;
import java.lang.ref.WeakReference;
import p040o.IResolveAccountCallbacks;
import p040o.OnDeviceIdExtractor;
import p040o.zzk;

/* renamed from: o.FragmentBuilder_BindDepositMoreInfoFragment */
public final class FragmentBuilder_BindDepositMoreInfoFragment implements OnDeviceIdExtractor.C6966a.C69682 {
    public final zzaq IconCompatParcelizer;
    public final zzak MediaBrowserCompat$CustomActionResultReceiver;
    private final zzap MediaBrowserCompat$ItemReceiver;
    private final sz$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem;
    private final getAccountName MediaDescriptionCompat;
    private final zzk.zzc MediaMetadataCompat;
    private final zzk.zza RatingCompat;
    public final newTaskFor read;
    public final zzav write;

    public FragmentBuilder_BindDepositMoreInfoFragment() {
    }

    public static void read(C6498x19dfc59c fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver) {
        BaseActivity baseActivity = fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver.write.get();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_REGISTRATION_TILE_DATA", fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
        bundle.putBoolean("TOUCHPOINT_SHOULD_NAVIGATE_TO_REGISTRATION_METHOD", fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        EkycRouterDialogFragment ekycRouterDialogFragment = new EkycRouterDialogFragment();
        ekycRouterDialogFragment.setArguments(bundle);
        new blend().MediaBrowserCompat$ItemReceiver(baseActivity.scbAnalytics, "ekyc_start");
        ekycRouterDialogFragment.show(baseActivity.getSupportFragmentManager(), "routerDialogFragment");
    }

    public static void write(WeakReference<BaseActivity> weakReference) {
        Bundle bundle = new Bundle();
        bundle.putString("NAVIGATE_BACK", "NAVIGATE_BACK");
        EkycRouterDialogFragment ekycRouterDialogFragment = new EkycRouterDialogFragment();
        ekycRouterDialogFragment.setArguments(bundle);
        ekycRouterDialogFragment.show(weakReference.get().getSupportFragmentManager(), "routerDialogFragment");
    }

    @HmlPinActivity
    public FragmentBuilder_BindDepositMoreInfoFragment(sz$MediaBrowserCompat$ItemReceiver sz_mediabrowsercompat_itemreceiver, zzak zzak, getAccountName getaccountname, newTaskFor newtaskfor, zzaq zzaq, zzav zzav, zzk.zzc zzc, zzap zzap, zzk.zza zza) {
        this.MediaBrowserCompat$MediaItem = sz_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = zzak;
        this.MediaDescriptionCompat = getaccountname;
        this.read = newtaskfor;
        this.IconCompatParcelizer = zzaq;
        this.write = zzav;
        this.MediaMetadataCompat = zzc;
        this.MediaBrowserCompat$ItemReceiver = zzap;
        this.RatingCompat = zza;
    }

    public final DebitCardResetOtpActivity<getLanguage> write(copyEntry copyentry) {
        return this.MediaBrowserCompat$MediaItem.read.getActivateChequeConfirm(copyentry).flatMap(new newArrayList(this));
    }

    public final DebitCardResetOtpActivity<getLabel> MediaBrowserCompat$CustomActionResultReceiver(connectExpirables connectexpirables) {
        return this.MediaBrowserCompat$MediaItem.read.getActivateChequeVerification(connectexpirables).map(zzfz.write).map(new IResolveAccountCallbacks.Stub(this.MediaBrowserCompat$ItemReceiver));
    }

    public final DebitCardResetOtpActivity<getLastLocation> MediaBrowserCompat$ItemReceiver(discardingQueue discardingqueue) {
        return this.MediaBrowserCompat$MediaItem.read.getChequeStatusIssueDetail(discardingqueue).flatMap(new decodeUrlSafeNoPadding(this));
    }

    public final DebitCardResetOtpActivity<removeGeofences> MediaBrowserCompat$ItemReceiver(newStringBuilderForCollection newstringbuilderforcollection) {
        sz$MediaBrowserCompat$ItemReceiver sz_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$MediaItem;
        return sz_mediabrowsercompat_itemreceiver.read.getChequeStatusIssueSummary(newTaskFor.IconCompatParcelizer(newstringbuilderforcollection)).flatMap(new toPrimitiveArray(this));
    }

    public final DebitCardResetOtpActivity<getLastLocation> IconCompatParcelizer(discardingQueue discardingqueue) {
        return this.MediaBrowserCompat$MediaItem.read.getChequeStatusReceiveDetail(discardingqueue).flatMap(new decodeUrlSafe(this));
    }

    public final DebitCardResetOtpActivity<addGeofences> MediaBrowserCompat$CustomActionResultReceiver(newStringBuilderForCollection newstringbuilderforcollection) {
        sz$MediaBrowserCompat$ItemReceiver sz_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$MediaItem;
        return sz_mediabrowsercompat_itemreceiver.read.getChequeStatusReceiveSummary(newTaskFor.IconCompatParcelizer(newstringbuilderforcollection)).flatMap(new writeArray(this));
    }

    public final DebitCardResetOtpActivity<getLanguage> MediaBrowserCompat$ItemReceiver(copyEntry copyentry) {
        return this.MediaBrowserCompat$MediaItem.read.getOrderChequeConfirm(copyentry).flatMap(new Base64Utils(this));
    }

    public final DebitCardResetOtpActivity<onLocationAvailability> IconCompatParcelizer() {
        return this.MediaBrowserCompat$MediaItem.read.getOrderChequeLanding().map(SupportFragmentWrapper.MediaBrowserCompat$CustomActionResultReceiver).map(new isAtLeastJellyBean(this.RatingCompat));
    }

    public final DebitCardResetOtpActivity<checkLocationSettings> write(connectEvictables connectevictables) {
        return this.MediaBrowserCompat$MediaItem.read.getOrderChequeVerification(connectevictables).map(zzcf.MediaBrowserCompat$CustomActionResultReceiver).map(new encode(this.RatingCompat));
    }

    public final DebitCardResetOtpActivity<getLanguage> MediaBrowserCompat$CustomActionResultReceiver(copyEntry copyentry) {
        return this.MediaBrowserCompat$MediaItem.read.getStopChequeConfirm(copyentry).flatMap(new decode(this));
    }

    public final DebitCardResetOtpActivity<onLocationResult> MediaBrowserCompat$CustomActionResultReceiver(unset unset) {
        return this.MediaBrowserCompat$MediaItem.read.getStopChequeDetail(unset).map(getValueObject.IconCompatParcelizer).map(new Preconditions(this.MediaDescriptionCompat));
    }

    public final DebitCardResetOtpActivity<getRequestId> IconCompatParcelizer(enqueueNotification enqueuenotification) {
        return this.MediaBrowserCompat$MediaItem.read.getStopChequeVerification(enqueuenotification).map(zzea.write).map(new writeTypedArray(this.MediaMetadataCompat));
    }
}
