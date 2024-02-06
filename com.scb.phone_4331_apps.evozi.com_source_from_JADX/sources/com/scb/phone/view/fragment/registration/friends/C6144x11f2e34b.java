package com.scb.phone.view.fragment.registration.friends;

import android.os.SystemClock;
import okhttp3.internal.cache.DiskLruCache;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.C4998nC;
import p040o.C7514tY;
import p040o.DebitCardResetOtpActivity;
import p040o.ExplicitOrderedImmutableSortedSet;
import p040o.FragmentBuilder_BindRegistrationEmailSetupFragment;
import p040o.HmlLatestPersonalInformationDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.IResolveAccountCallbacks;
import p040o.PlaceBuffer;
import p040o.ScriptIntrinsicConvolve5x5;
import p040o.findSubsetIndex;
import p040o.makeGooglePlayServicesAvailable;
import p040o.onAccountResolutionComplete;
import p040o.onCopy;
import p040o.onGetStartedClick;
import p040o.rank;
import p040o.rankMap;
import p040o.setCurrentItemInternal;
import p040o.setDefaultNotificationChannelId;
import p040o.writeStringMapToJson;
import p040o.zaak;
import p040o.zzcs;
import p040o.zzeo;
import p040o.zzuk;

/* renamed from: com.scb.phone.view.fragment.registration.friends.FriendsRegistrationFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6144x11f2e34b implements C7514tY {
    private final makeGooglePlayServicesAvailable IconCompatParcelizer;
    private final ScriptIntrinsicConvolve5x5 MediaBrowserCompat$CustomActionResultReceiver;
    private final FragmentBuilder_BindRegistrationEmailSetupFragment MediaBrowserCompat$ItemReceiver;
    private final C4998nC.read read;
    private final setDefaultNotificationChannelId write;

    private C6144x11f2e34b() {
    }

    @HmlPinActivity
    public C6144x11f2e34b(C4998nC.read read2, FragmentBuilder_BindRegistrationEmailSetupFragment fragmentBuilder_BindRegistrationEmailSetupFragment, setDefaultNotificationChannelId setdefaultnotificationchannelid, makeGooglePlayServicesAvailable makegoogleplayservicesavailable, ScriptIntrinsicConvolve5x5 scriptIntrinsicConvolve5x5) {
        this.read = read2;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindRegistrationEmailSetupFragment;
        this.write = setdefaultnotificationchannelid;
        this.IconCompatParcelizer = makegoogleplayservicesavailable;
        this.MediaBrowserCompat$CustomActionResultReceiver = scriptIntrinsicConvolve5x5;
    }

    public final BScanCNotificationDeepLinkActivity<zzuk> MediaBrowserCompat$ItemReceiver(rank rank) {
        BScanCNotificationDeepLinkActivity<setCurrentItemInternal> failOverNotificationUserLog = this.read.MediaBrowserCompat$CustomActionResultReceiver.failOverNotificationUserLog(rank);
        IResolveAccountCallbacks iResolveAccountCallbacks = new IResolveAccountCallbacks(this.write);
        HmlLatestPersonalInformationDeepLinkActivity.write(iResolveAccountCallbacks, "mapper is null");
        return new onCopy(failOverNotificationUserLog, iResolveAccountCallbacks);
    }

    public final PlaceBuffer MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.write;
    }

    public final String IconCompatParcelizer() {
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver.write, (Object) "2") ? "FEMobile" : "MovingPseudo";
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver.write;
        int hashCode = str.hashCode();
        if (hashCode != 48) {
            if (hashCode != 49 || !str.equals(DiskLruCache.VERSION_1)) {
                return "FEMobile";
            }
            return "PseudoFE";
        } else if (str.equals("0")) {
            return "MovingPseudo";
        }
        return "FEMobile";
    }

    public final void read() {
        this.MediaBrowserCompat$ItemReceiver.write = null;
    }

    public final boolean write() {
        PlaceBuffer placeBuffer = this.MediaBrowserCompat$ItemReceiver.write;
        return placeBuffer != null && SystemClock.elapsedRealtime() - placeBuffer.MediaBrowserCompat$ItemReceiver < 270000;
    }

    public final DebitCardResetOtpActivity<PlaceBuffer> MediaDescriptionCompat() {
        if (write()) {
            return DebitCardResetOtpActivity.just(this.MediaBrowserCompat$ItemReceiver.write);
        }
        C4998nC.read read2 = this.read;
        return read2.MediaBrowserCompat$CustomActionResultReceiver.preauthenticate(new findSubsetIndex()).map(new onAccountResolutionComplete(this.write)).doOnNext(new writeStringMapToJson(this.MediaBrowserCompat$ItemReceiver));
    }

    public final DebitCardResetOtpActivity<PlaceBuffer> MediaBrowserCompat$MediaItem() {
        return read(new findSubsetIndex());
    }

    public final DebitCardResetOtpActivity<PlaceBuffer> read(findSubsetIndex findsubsetindex) {
        return this.read.MediaBrowserCompat$CustomActionResultReceiver.preauthenticate(findsubsetindex).map(new onAccountResolutionComplete(this.write)).doOnNext(new writeStringMapToJson(this.MediaBrowserCompat$ItemReceiver));
    }

    public final DebitCardResetOtpActivity<PlaceBuffer> write(String str) {
        if (str.length() > 6) {
            str = str.substring(0, 6);
        }
        C4998nC.read read2 = this.read;
        return read2.MediaBrowserCompat$CustomActionResultReceiver.preauthorization(new ExplicitOrderedImmutableSortedSet.SerializedForm(str)).map(zaak.MediaBrowserCompat$ItemReceiver).map(new zzcs(this.write)).doOnNext(new writeStringMapToJson(this.MediaBrowserCompat$ItemReceiver));
    }

    public final DebitCardResetOtpActivity<PlaceBuffer> MediaBrowserCompat$SearchResultReceiver() {
        C4998nC.read read2 = this.read;
        return read2.MediaBrowserCompat$CustomActionResultReceiver.requestDpParams(new rankMap()).map(new zzeo(this.IconCompatParcelizer)).doOnNext(new writeStringMapToJson(this.MediaBrowserCompat$ItemReceiver));
    }
}
