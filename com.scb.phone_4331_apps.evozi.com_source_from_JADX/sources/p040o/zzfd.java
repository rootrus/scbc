package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.activity.chequemanagement.C5579x61d4c5a4;
import p040o.performAction;

/* renamed from: o.zzfd */
public final /* synthetic */ class zzfd implements DirectDebitDeepLinkActivity {

    /* renamed from: o.zzfd$zzc */
    public final /* synthetic */ class zzc implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ zak write;

        public /* synthetic */ zzc(zak zak) {
            this.write = zak;
        }

        public final Object write(Object obj) {
            return this.write.write((SingleDataEntity) obj);
        }
    }

    /* renamed from: o.zzfd$zzd */
    public final /* synthetic */ class zzd implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ zzd IconCompatParcelizer = new zzd();

        private /* synthetic */ zzd() {
        }

        public final Object write(Object obj) {
            return (getFrameRate) ((SingleDataEntity) obj).getData();
        }
    }

    /* renamed from: o.zzfd$zza */
    public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ zza MediaBrowserCompat$ItemReceiver = new zza();

        private /* synthetic */ zza() {
        }

        public final Object write(Object obj) {
            return (setSystemAnimationsAreEnabled) ((SingleDataEntity) obj).getData();
        }
    }

    public /* synthetic */ zzfd(isPasswordLoginSupported ispasswordloginsupported) {
    }

    /* renamed from: o.zzfd$zzb */
    public final /* synthetic */ class zzb implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ getAvailableFeatures MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ zzb(getAvailableFeatures getavailablefeatures) {
            this.MediaBrowserCompat$ItemReceiver = getavailablefeatures;
        }

        public final Object write(Object obj) {
            LinkedHashTreeMap linkedHashTreeMap = (LinkedHashTreeMap) obj;
            onGetStartedClick.write((Object) linkedHashTreeMap, "merchantCategoryEntity");
            return new C5579x61d4c5a4(getAvailableFeatures.MediaBrowserCompat$ItemReceiver(linkedHashTreeMap.IconCompatParcelizer));
        }
    }

    public final Object write(Object obj) {
        setCurrentItemInternal setcurrentiteminternal = (setCurrentItemInternal) obj;
        performAction.read read = new performAction.read();
        read.IconCompatParcelizer = setcurrentiteminternal.getStatus().write();
        read.MediaBrowserCompat$ItemReceiver = setcurrentiteminternal.getStatus().IconCompatParcelizer();
        read.write = setcurrentiteminternal.getStatus().MediaBrowserCompat$ItemReceiver();
        read.read = setcurrentiteminternal.getStatus().write().equals("3013") || setcurrentiteminternal.getStatus().write().equals("3014") || setcurrentiteminternal.getStatus().write().equals("9201") || setcurrentiteminternal.getStatus().write().equals("9200");
        return new performAction(read, (byte) 0);
    }
}
