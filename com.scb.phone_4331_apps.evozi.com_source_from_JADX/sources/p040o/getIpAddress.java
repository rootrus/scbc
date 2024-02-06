package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;
import p040o.zzct;
import p040o.zzfy;

/* renamed from: o.getIpAddress */
public final class getIpAddress extends writeUInt64NoTag<KtaJsonPassport_MembersInjector> {
    private String IconCompatParcelizer;
    private final TabLayout MediaBrowserCompat$ItemReceiver;
    private final AppBarLayout read;
    public final getStartFinalizer write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getIpAddress(RegularImmutableBiMap regularImmutableBiMap, AppBarLayout appBarLayout, getStartFinalizer getstartfinalizer, TabLayout tabLayout) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) appBarLayout, "hmlCtaGetLoanOfferStatusCase");
        onGetStartedClick.write((Object) getstartfinalizer, "getNTBUserInfoUseCase");
        onGetStartedClick.write((Object) tabLayout, "hmlSetCustomerTypeCase");
        this.read = appBarLayout;
        this.write = getstartfinalizer;
        this.MediaBrowserCompat$ItemReceiver = tabLayout;
    }

    public static /* synthetic */ void IconCompatParcelizer(getIpAddress getipaddress, String str, zzct.zza zza, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            zza = zzct.zza.CONSUMER;
        }
        getipaddress.read(str, zza);
    }

    public final void read(String str, zzct.zza zza) {
        onGetStartedClick.write((Object) zza, "customerType");
        this.IconCompatParcelizer = str;
        onGetStartedClick.write((Object) zza, "customerType");
        TabLayout tabLayout = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) zza, "type");
        tabLayout.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(zza);
        boolean z = true;
        if (this.write.write.read() != null) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getIpAddress$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        IconCompatParcelizer();
    }

    /* renamed from: o.getIpAddress$read */
    public static final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzfy.zzf> {
        final /* synthetic */ getIpAddress IconCompatParcelizer;

        /* renamed from: o.getIpAddress$read$write */
        static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<KtaJsonPassport_MembersInjector> {
            private /* synthetic */ read MediaBrowserCompat$ItemReceiver;

            write(read read) {
                this.MediaBrowserCompat$ItemReceiver = read;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                KtaJsonPassport_MembersInjector ktaJsonPassport_MembersInjector = (KtaJsonPassport_MembersInjector) obj;
                if (getIpAddress.write(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)) {
                    ktaJsonPassport_MembersInjector.read();
                } else {
                    ktaJsonPassport_MembersInjector.MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
        }

        read(getIpAddress getipaddress) {
            this.IconCompatParcelizer = getipaddress;
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzfy.zzf zzf = (zzfy.zzf) obj;
            onGetStartedClick.write((Object) zzf, "status");
            super.onNext(zzf);
            getIpAddress.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
            boolean z = false;
            if (getSystemIdentifier.read[zzf.MediaBrowserCompat$ItemReceiver.ordinal()] != 1) {
                getIpAddress getipaddress = this.IconCompatParcelizer;
                writeUInt64NoTag.IconCompatParcelizer getipaddress_read_mediabrowsercompat_customactionresultreceiver = new getIpAddress$read$MediaBrowserCompat$CustomActionResultReceiver(this);
                if (getipaddress.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getipaddress_read_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(getipaddress.RatingCompat);
                    return;
                }
                return;
            }
            getIpAddress getipaddress2 = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer write2 = new write(this);
            if (getipaddress2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                write2.IconCompatParcelizer(getipaddress2.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            super.onError(th);
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    public final void onDestroy() {
        AppBarLayout appBarLayout = this.read;
        if (!appBarLayout.MediaBrowserCompat$MediaItem.isDisposed()) {
            appBarLayout.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getIpAddress getipaddress) {
        if (getipaddress.RatingCompat != null) {
            getipaddress.RatingCompat.aj_();
        }
    }

    public static final /* synthetic */ boolean write(getIpAddress getipaddress) {
        return getipaddress.write.write.read() != null;
    }

    public final void IconCompatParcelizer() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        AppBarLayout appBarLayout = this.read;
        appBarLayout.write(appBarLayout.read(this.IconCompatParcelizer), new read(this));
    }
}
