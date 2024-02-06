package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.scb.phone.view.activity.investment.InvestmentDetailsActivity;
import com.scb.phone.view.activity.investment.discover.DiscoverActivity;
import com.scb.phone.view.activity.investment.discover.NtbDiscoverActivity;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver;
import java.util.HashMap;
import java.util.Map;
import p040o.HmlPinActivity;
import p040o.IdExtractor$1$MediaBrowserCompat$ItemReceiver;
import p040o.getTurnGuidance;
import p040o.getTurnGuidance$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getTurnGuidance$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;
import p040o.zzmd;

public final class MutualFundsDiscoverDeepLinkActivity extends BaseDeepLinkActivity implements IdExtractor$1$MediaBrowserCompat$ItemReceiver {
    @HmlPinActivity
    public getTurnGuidance presenter;

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$Token() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        getTurnGuidance getturnguidance = this.presenter;
        if (getturnguidance == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getturnguidance.MediaBrowserCompat$ItemReceiver(this);
        getTurnGuidance getturnguidance2 = this.presenter;
        if (getturnguidance2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return !(getturnguidance2.IconCompatParcelizer.write.read() != null);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        getTurnGuidance getturnguidance = this.presenter;
        if (getturnguidance == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getturnguidance.MediaBrowserCompat$ItemReceiver(this);
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            getTurnGuidance getturnguidance2 = this.presenter;
            if (getturnguidance2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            if (getturnguidance2.IconCompatParcelizer.write.read() != null) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getTurnGuidance$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                if (getturnguidance2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(getturnguidance2.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = new getTurnGuidance.IconCompatParcelizer(str, "l7cf73c52af3f44d3b93214098718a28a5");
            if (getturnguidance2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(getturnguidance2.RatingCompat);
                return;
            }
            return;
        }
        getTurnGuidance getturnguidance3 = this.presenter;
        if (getturnguidance3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (!(zzmd.zzm.zzb.zza.JURISTIC == setTitleOptional())) {
            if (getturnguidance3.IconCompatParcelizer.write.read() != null) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = getTurnGuidance.read.MediaBrowserCompat$ItemReceiver;
                if (getturnguidance3.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer3.IconCompatParcelizer(getturnguidance3.RatingCompat);
                }
            } else if (!getturnguidance3.MediaBrowserCompat$ItemReceiver.write.RatingCompat().write.isEmpty()) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer4 = getTurnGuidance$MediaBrowserCompat$ItemReceiver.read;
                if (getturnguidance3.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer4.IconCompatParcelizer(getturnguidance3.RatingCompat);
                }
            } else {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer5 = getTurnGuidance.write.IconCompatParcelizer;
                if (getturnguidance3.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer5.IconCompatParcelizer(getturnguidance3.RatingCompat);
                }
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer6 = getTurnGuidance.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver;
            if (getturnguidance3.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer6.IconCompatParcelizer(getturnguidance3.RatingCompat);
            }
        }
    }

    /* renamed from: S_ */
    public final void mo14210S_() {
        super.mo14210S_();
    }

    public final void write(String str, String str2) {
        String decode = Uri.decode(str);
        HashMap hashMap = new HashMap();
        Map map = hashMap;
        map.put(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat, decode);
        map.put(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, str2);
        PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver partnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver = PartnerAuthorizationActivity.MediaDescriptionCompat;
        Intent MediaBrowserCompat$CustomActionResultReceiver = PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, hashMap, true, (Intent) null);
        MediaBrowserCompat$CustomActionResultReceiver.putExtras(getIntent());
        read(MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        read(InvestmentDetailsActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this));
    }

    public final void read() {
        read(DiscoverActivity.read(this));
    }

    public final void write() {
        read(NtbDiscoverActivity.write(this));
    }
}
