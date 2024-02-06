package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIndexFields  reason: case insensitive filesystem */
public final class C10840getIndexFields extends isUserLoggedIn {
    private final NavigationMenuView IconCompatParcelizer;
    private final removeAllNodes MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C10840getIndexFields(removeAllNodes removeallnodes, RegularImmutableBiMap regularImmutableBiMap, NavigationMenuView navigationMenuView) {
        super(regularImmutableBiMap, navigationMenuView);
        onGetStartedClick.write((Object) removeallnodes, "hmlNcbConsentController");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) navigationMenuView, "verifyPinCase");
        this.MediaBrowserCompat$ItemReceiver = removeallnodes;
        this.IconCompatParcelizer = navigationMenuView;
    }

    /* renamed from: o.getIndexFields$read */
    public static final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C10840getIndexFields read;

        /* renamed from: o.getIndexFields$read$IconCompatParcelizer */
        static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetIPassportDetector> {
            public static final IconCompatParcelizer read = new IconCompatParcelizer();

            IconCompatParcelizer() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((proxyGetIPassportDetector) obj).MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        read(C10840getIndexFields getindexfields) {
            this.read = getindexfields;
        }

        public final void onComplete() {
            super.onComplete();
            C10840getIndexFields.MediaBrowserCompat$ItemReceiver(this.read);
            C10840getIndexFields getindexfields = this.read;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.read;
            if (getindexfields.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getindexfields.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            super.onError(th);
            C10840getIndexFields.MediaBrowserCompat$ItemReceiver(this.read);
            if (th instanceof RetrofitException) {
                ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
                onGetStartedClick.IconCompatParcelizer((Object) iLocationSourceDelegate, "e.response");
                ILocationSourceDelegate.zza zza = iLocationSourceDelegate.write;
                onGetStartedClick.IconCompatParcelizer((Object) zza, "e.response.error");
                String str = zza.IconCompatParcelizer;
                boolean z = true;
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "1087") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "1089")) {
                    C10840getIndexFields getindexfields = this.read;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getIndexFields$read$MediaBrowserCompat$ItemReceiver.read;
                    if (getindexfields.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        iconCompatParcelizer.IconCompatParcelizer(getindexfields.RatingCompat);
                        return;
                    }
                    return;
                }
                C10840getIndexFields getindexfields2 = this.read;
                writeUInt64NoTag.IconCompatParcelizer getindexfields_read_mediabrowsercompat_customactionresultreceiver = new C9974x87acabb2(this, th);
                if (getindexfields2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getindexfields_read_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(getindexfields2.RatingCompat);
                }
            }
        }
    }

    public final void read() {
        removeAllNodes removeallnodes = this.MediaBrowserCompat$ItemReceiver;
        FundActionsSuccessActivity getindexfields_mediabrowsercompat_itemreceiver = new getIndexFields$MediaBrowserCompat$ItemReceiver(this);
        FundFactSheetActivity getindexfields_mediabrowsercompat_customactionresultreceiver = new getIndexFields$MediaBrowserCompat$CustomActionResultReceiver(this);
        onGetStartedClick.write((Object) getindexfields_mediabrowsercompat_itemreceiver, "onSuccess");
        onGetStartedClick.write((Object) getindexfields_mediabrowsercompat_customactionresultreceiver, "onError");
        removeallnodes.MediaBrowserCompat$ItemReceiver(removeallnodes.IconCompatParcelizer, getindexfields_mediabrowsercompat_itemreceiver, getindexfields_mediabrowsercompat_customactionresultreceiver, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver());
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(C10840getIndexFields getindexfields) {
        if (getindexfields.RatingCompat != null) {
            getindexfields.RatingCompat.aj_();
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "pin");
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(str);
        this.IconCompatParcelizer.IconCompatParcelizer(new read(this));
    }
}
