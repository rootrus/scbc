package p040o;

import p040o.writeUInt64NoTag;
import p040o.zzjx;

/* renamed from: o.getDocumentID */
public abstract class getDocumentID extends getSessionEventSize<proxyGetIPassportDeserializerKta> {
    private final setStatusBarScrimColor MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public final logEventNoInterceptor MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final C10844immutableEnumSet MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public final setItemIconTintList read;
    /* access modifiers changed from: private */
    public final writeMultiset write;

    public abstract void MediaBrowserCompat$ItemReceiver();

    /* renamed from: o.getDocumentID$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetIPassportDeserializerKta> {
        public static final write IconCompatParcelizer = new write();

        write() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((proxyGetIPassportDeserializerKta) obj).IconCompatParcelizer();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getDocumentID(RegularImmutableBiMap regularImmutableBiMap, writeMultiset writemultiset, C10844immutableEnumSet immutableenumset, logEventNoInterceptor logeventnointerceptor, setStatusBarScrimColor setstatusbarscrimcolor, setItemIconTintList setitemicontintlist) {
        super(regularImmutableBiMap, logeventnointerceptor);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) writemultiset, "hmlLoanSlipMapper");
        onGetStartedClick.write((Object) immutableenumset, "successDisplayMapper");
        onGetStartedClick.write((Object) logeventnointerceptor, "successCase");
        onGetStartedClick.write((Object) setstatusbarscrimcolor, "setupResultCase");
        onGetStartedClick.write((Object) setitemicontintlist, "hmlGetCustomerTypeCase");
        this.write = writemultiset;
        this.MediaDescriptionCompat = immutableenumset;
        this.MediaBrowserCompat$SearchResultReceiver = logeventnointerceptor;
        this.MediaBrowserCompat$MediaItem = setstatusbarscrimcolor;
        this.read = setitemicontintlist;
    }

    /* access modifiers changed from: protected */
    public final void write(BaseDiscoverFundFilterActivity<? super zzjx.zze, ? super logEventNoInterceptor, HmlVerifyPhoneValidateOtpActivity> baseDiscoverFundFilterActivity, FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, boolean z) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "onError");
        DebitCardResetOtpActivity<zzjx.zze> MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.MediaBrowserCompat$MediaItem.write(MediaBrowserCompat$CustomActionResultReceiver, new getDocumentID$MediaBrowserCompat$ItemReceiver(this, z, baseDiscoverFundFilterActivity, fundFactSheetActivity));
    }

    public void onDestroy() {
        setStatusBarScrimColor setstatusbarscrimcolor = this.MediaBrowserCompat$MediaItem;
        if (!setstatusbarscrimcolor.MediaBrowserCompat$MediaItem.isDisposed()) {
            setstatusbarscrimcolor.MediaBrowserCompat$MediaItem.dispose();
        }
        logEventNoInterceptor logeventnointerceptor = this.MediaBrowserCompat$SearchResultReceiver;
        if (!logeventnointerceptor.MediaBrowserCompat$MediaItem.isDisposed()) {
            logeventnointerceptor.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void write(getDocumentID getdocumentid) {
        if (getdocumentid.RatingCompat != null) {
            getdocumentid.RatingCompat.aj_();
        }
    }
}
