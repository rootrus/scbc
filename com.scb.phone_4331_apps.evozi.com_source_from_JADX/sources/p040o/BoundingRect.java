package p040o;

import java.util.Collections;
import java.util.List;
import p040o.CrashlyticsBackgroundWorker;
import p040o.Iterables;
import p040o.writeUInt64NoTag;
import p040o.zzbt;

/* renamed from: o.BoundingRect */
public final /* synthetic */ class BoundingRect implements FundFactSheetActivity {
    private final /* synthetic */ setMicrData MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.BoundingRect$FriendBR */
    public final /* synthetic */ class FriendBR implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ FriendBR(String str) {
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((C6393xc7fe0382) obj).write(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    public /* synthetic */ BoundingRect(setMicrData setmicrdata) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setmicrdata;
    }

    public final Object invoke(Object obj) {
        CrashlyticsBackgroundWorker.C32164 r5;
        setMicrData setmicrdata = this.MediaBrowserCompat$CustomActionResultReceiver;
        zzbt.zza.C10761zza zza = (zzbt.zza.C10761zza) obj;
        setmicrdata.write = zza;
        unmodifiableMultiset unmodifiablemultiset = setmicrdata.IconCompatParcelizer;
        if (zza.read == null || zza.read.isEmpty()) {
            r5 = null;
        } else {
            List<RestrictedComponentContainer> MediaBrowserCompat$ItemReceiver = unmodifiableMultiset.MediaBrowserCompat$ItemReceiver(zza.read, new findFragmentByWho() {
                public final Object IconCompatParcelizer(Object obj) {
                    unmodifiableMultiset unmodifiablemultiset = unmodifiableMultiset.this;
                    setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
                    if (setdatacollectionenabled.MediaDescriptionCompat == null || setdatacollectionenabled.write == null) {
                        return null;
                    }
                    if ("ANNUAL_INTEREST".equals(setdatacollectionenabled.MediaBrowserCompat$ItemReceiver)) {
                        return new RestrictedComponentContainer(setdatacollectionenabled.IconCompatParcelizer, (List<C3758xd990f62c>) Collections.singletonList(new C3758xd990f62c(setdatacollectionenabled.MediaDescriptionCompat, unmodifiablemultiset.MediaBrowserCompat$CustomActionResultReceiver.getColor(Iterables.C35273.read.dark_gray))));
                    }
                    return new RestrictedComponentContainer(setdatacollectionenabled.IconCompatParcelizer, setdatacollectionenabled.MediaDescriptionCompat);
                }
            });
            CrashlyticsBackgroundWorker.C32164.read read = new CrashlyticsBackgroundWorker.C32164.read();
            read.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver;
            r5 = read.MediaBrowserCompat$CustomActionResultReceiver();
        }
        boolean z = true;
        if (setmicrdata.RatingCompat != null) {
            setmicrdata.RatingCompat.aj_();
        }
        setRectLeft setrectleft = new setRectLeft(r5);
        if (setmicrdata.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setrectleft.IconCompatParcelizer(setmicrdata.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
