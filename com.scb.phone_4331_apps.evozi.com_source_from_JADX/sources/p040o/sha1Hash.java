package p040o;

import java.util.List;
import p040o.GoogleMap;
import p040o.access$2300;
import p040o.writeUInt64NoTag;
import p040o.zzjx;

/* renamed from: o.sha1Hash */
public final class sha1Hash extends getDocumentID {

    /* renamed from: o.sha1Hash$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ sha1Hash MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(sha1Hash sha1hash) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = sha1hash;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "it");
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.sha1Hash$write */
    static final class write extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<zzjx.zze, logEventNoInterceptor, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ sha1Hash MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(sha1Hash sha1hash) {
            super(2);
            this.MediaBrowserCompat$CustomActionResultReceiver = sha1hash;
        }

        public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
            zzjx.zze zze = (zzjx.zze) obj;
            logEventNoInterceptor logeventnointerceptor = (logEventNoInterceptor) obj2;
            onGetStartedClick.write((Object) zze, "res");
            onGetStartedClick.write((Object) logeventnointerceptor, "successCase");
            if (zze.MediaBrowserCompat$CustomActionResultReceiver == zzjx.zze.IconCompatParcelizer.SUCCESS) {
                logeventnointerceptor.read();
                logeventnointerceptor.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<? extends GoogleMap.OnInfoWindowClickListener>>(this) {
                    final /* synthetic */ write MediaBrowserCompat$CustomActionResultReceiver;

                    {
                        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                    }

                    /* renamed from: o.sha1Hash$write$5$IconCompatParcelizer */
                    static final class IconCompatParcelizer implements Runnable {
                        private /* synthetic */ C54025 IconCompatParcelizer;

                        IconCompatParcelizer(C54025 r1) {
                            this.IconCompatParcelizer = r1;
                        }

                        public final void run() {
                            sha1Hash sha1hash = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C54034.IconCompatParcelizer;
                            if (sha1hash.RatingCompat != null) {
                                iconCompatParcelizer.IconCompatParcelizer(sha1hash.RatingCompat);
                            }
                        }
                    }

                    public final void onError(Throwable th) {
                        onGetStartedClick.write((Object) th, "e");
                        super.onError(th);
                        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new IconCompatParcelizer(this)));
                    }
                });
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public sha1Hash(RegularImmutableBiMap regularImmutableBiMap, writeMultiset writemultiset, C10844immutableEnumSet immutableenumset, logEventNoInterceptor logeventnointerceptor, setStatusBarScrimColor setstatusbarscrimcolor, setItemIconTintList setitemicontintlist) {
        super(regularImmutableBiMap, writemultiset, immutableenumset, logeventnointerceptor, setstatusbarscrimcolor, setitemicontintlist);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) writemultiset, "hmlLoanSlipMapper");
        onGetStartedClick.write((Object) immutableenumset, "successDisplayMapper");
        onGetStartedClick.write((Object) logeventnointerceptor, "successCase");
        onGetStartedClick.write((Object) setstatusbarscrimcolor, "setupResultCase");
        onGetStartedClick.write((Object) setitemicontintlist, "hmlGetCustomerTypeCase");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        super.write(new write(this), new IconCompatParcelizer(this), true);
    }
}
