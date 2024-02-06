package com.scb.phone.view.fragment.hml;

import com.scb.phone.view.activity.investment.discover.BaseDiscoverDisclaimerActivity;
import java.util.List;
import p040o.Api;
import p040o.BillerAdapter$ItemViewHolder;
import p040o.C6959xc24751b1;
import p040o.Credential;
import p040o.CredentialRequest;
import p040o.CredentialRequestResponse;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.DirectDebitDeepLinkActivity;
import p040o.FastSafeParcelableJsonResponse;
import p040o.FavaDiagnosticsEntity;
import p040o.FragmentBuilder_BindPromptPayQRInputFragment;
import p040o.FragmentWrapper;
import p040o.HmlPinActivity;
import p040o.IGmsServiceBroker;
import p040o.IObjectWrapper;
import p040o.LocalProjectProvider;
import p040o.ObjectWrapper;
import p040o.PendingResultUtil;
import p040o.PooledExecutorsProvider;
import p040o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder;
import p040o.SafeParcelableSerializer;
import p040o.SimpleClientAdapter;
import p040o.Tables;
import p040o.checkHandlerThread;
import p040o.compareTo;
import p040o.copyEvictableEntry;
import p040o.copyExpirableEntry;
import p040o.createStringArray;
import p040o.drainRecencyQueue;
import p040o.enqueueCleanup;
import p040o.from;
import p040o.getAccountTypes;
import p040o.getAddress2FieldName;
import p040o.getCredential;
import p040o.getCredentialPickerConfig;
import p040o.getNextEvictable;
import p040o.getPreviousEvictable;
import p040o.getValueReference;
import p040o.isAtLeastHoneycomb;
import p040o.isDataCollectionEnabled;
import p040o.isIdTokenRequested;
import p040o.isPasswordLoginSupported;
import p040o.logHealthData;
import p040o.newSignInButton;
import p040o.nextEntry;
import p040o.nextInChain;
import p040o.nextIndex;
import p040o.notifyKeyReclaimed;
import p040o.onCircleClick;
import p040o.onGetStartedClick;
import p040o.onMove;
import p040o.onTransact;
import p040o.performAction;
import p040o.resetAnalyticsData;
import p040o.setCredentialHintPickerConfig;
import p040o.setEventInterceptor;
import p040o.setForNewAccount;
import p040o.setMeasurementEnabled;
import p040o.setNextExpirable;
import p040o.setPasswordLoginSupported;
import p040o.setPreviousEvictable;
import p040o.setPreviousExpirable;
import p040o.setShowCancelButton;
import p040o.setSystemAnimationsAreEnabled;
import p040o.shouldShowCancelButton;
import p040o.toResponseTask;
import p040o.toStringHelper;
import p040o.toVoidTask;
import p040o.unscheduleDrawable;
import p040o.verifyGooglePlayServicesIsAvailable;
import p040o.writeDoubleObject;
import p040o.writeIntegerList;
import p040o.writeLongArray;
import p040o.writeLongList;
import p040o.writeLongObject;
import p040o.writeParcel;
import p040o.writeParcelArray;
import p040o.writeParcelList;
import p040o.writeParcelSparseArray;
import p040o.writeParcelable;
import p040o.writeShort;
import p040o.writeSparseBooleanArray;
import p040o.writeStringList;
import p040o.zabr;
import p040o.zacs;
import p040o.zzbt;
import p040o.zzby;
import p040o.zzca;
import p040o.zzcb;
import p040o.zzcg;
import p040o.zzci;
import p040o.zzcj;
import p040o.zzco;
import p040o.zzcp;
import p040o.zzcq;
import p040o.zzcx;
import p040o.zzcy;
import p040o.zzdf;
import p040o.zzdk;
import p040o.zzdq;
import p040o.zzdy;
import p040o.zzem;
import p040o.zzew;
import p040o.zzey;
import p040o.zzez;
import p040o.zzfc;
import p040o.zzfd;
import p040o.zzfe;
import p040o.zzfi;
import p040o.zzfj;
import p040o.zzfk;
import p040o.zzfo;
import p040o.zzft;
import p040o.zzlx;
import p040o.zzq;
import p040o.zzv;
import p040o.zzwc;

/* renamed from: com.scb.phone.view.fragment.hml.HmlNTBAdditionalDocumentInputFragment$MediaBrowserCompat$ItemReceiver */
public final class C5993x5a636e5f implements LocalProjectProvider.C69375 {
    private final CredentialRequestResponse AlertController$RecycleListView;
    private final FragmentBuilder_BindPromptPayQRInputFragment IconCompatParcelizer;
    private final setCredentialHintPickerConfig Keep;
    private final zzv MediaBrowserCompat$CustomActionResultReceiver;
    private final getAddress2FieldName.read MediaBrowserCompat$ItemReceiver;
    private final setShowCancelButton MediaBrowserCompat$MediaItem;
    private final Api.AnyClientKey MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final getCredentialPickerConfig f3085x50fd9e4a;
    private final verifyGooglePlayServicesIsAvailable MediaDescriptionCompat;
    private final shouldShowCancelButton MediaMetadataCompat;
    private final isPasswordLoginSupported MediaSessionCompat$QueueItem;
    private final getAccountTypes MediaSessionCompat$ResultReceiverWrapper;
    private final isIdTokenRequested MediaSessionCompat$Token;
    private final BaseDiscoverDisclaimerActivity.write ParcelableVolumeInfo;
    private final String PlaybackStateCompat;
    private final getCredential PlaybackStateCompat$CustomAction;
    private final setForNewAccount RatingCompat;
    private final Credential.Builder read;
    private final CredentialRequest.Builder setHasDecor;
    public final setPasswordLoginSupported write;

    private C5993x5a636e5f() {
    }

    @HmlPinActivity
    public C5993x5a636e5f(getAddress2FieldName.read read2, BaseDiscoverDisclaimerActivity.write write2, setShowCancelButton setshowcancelbutton, isIdTokenRequested isidtokenrequested, CredentialRequest.Builder builder, getCredential getcredential, setPasswordLoginSupported setpasswordloginsupported, CredentialRequestResponse credentialRequestResponse, isPasswordLoginSupported ispasswordloginsupported, Api.AnyClientKey anyClientKey, shouldShowCancelButton shouldshowcancelbutton, setForNewAccount setfornewaccount, verifyGooglePlayServicesIsAvailable verifygoogleplayservicesisavailable, zzv zzv, FragmentBuilder_BindPromptPayQRInputFragment fragmentBuilder_BindPromptPayQRInputFragment, getAccountTypes getaccounttypes, Credential.Builder builder2, getCredentialPickerConfig getcredentialpickerconfig, setCredentialHintPickerConfig setcredentialhintpickerconfig, String str) {
        this.MediaBrowserCompat$ItemReceiver = read2;
        this.ParcelableVolumeInfo = write2;
        this.MediaSessionCompat$Token = isidtokenrequested;
        this.MediaBrowserCompat$MediaItem = setshowcancelbutton;
        this.setHasDecor = builder;
        this.PlaybackStateCompat$CustomAction = getcredential;
        this.write = setpasswordloginsupported;
        this.AlertController$RecycleListView = credentialRequestResponse;
        this.MediaSessionCompat$QueueItem = ispasswordloginsupported;
        this.MediaBrowserCompat$SearchResultReceiver = anyClientKey;
        this.MediaMetadataCompat = shouldshowcancelbutton;
        this.RatingCompat = setfornewaccount;
        this.MediaDescriptionCompat = verifygoogleplayservicesisavailable;
        this.MediaBrowserCompat$CustomActionResultReceiver = zzv;
        this.IconCompatParcelizer = fragmentBuilder_BindPromptPayQRInputFragment;
        this.MediaSessionCompat$ResultReceiverWrapper = getaccounttypes;
        this.read = builder2;
        this.PlaybackStateCompat = str;
        this.f3085x50fd9e4a = getcredentialpickerconfig;
        this.Keep = setcredentialhintpickerconfig;
    }

    public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$CustomActionResultReceiver(CustomConcurrentHashMap.EntryFactory.C32966 r2) {
        return this.MediaBrowserCompat$ItemReceiver.read.additionDocumentScbAccount(r2).map(writeParcelList.read);
    }

    public final DebitCardResetOtpActivity<zzby.zza> write(copyExpirableEntry copyexpirableentry) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.documentUpload(copyexpirableentry.IconCompatParcelizer, copyexpirableentry.MediaBrowserCompat$CustomActionResultReceiver, copyexpirableentry.write, copyexpirableentry.MediaBrowserCompat$MediaItem, copyexpirableentry.MediaSessionCompat$Token, copyexpirableentry.read).map(toResponseTask.write).map(new IObjectWrapper(this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public final DebitCardResetOtpActivity<C6959xc24751b1> MediaBrowserCompat$CustomActionResultReceiver(CustomConcurrentHashMap.EntryFactory.C32913 r2) {
        return this.MediaBrowserCompat$ItemReceiver.read.calculateCreditPower(r2).map(writeParcelArray.IconCompatParcelizer);
    }

    public final DebitCardResetOtpActivity<setEventInterceptor> MediaBrowserCompat$CustomActionResultReceiver(getNextEvictable getnextevictable) {
        return this.MediaBrowserCompat$ItemReceiver.read.calculateMortgageLoan(getnextevictable).map(zzcg.zzg.read).map(new zzft(this.write));
    }

    public final DebitCardResetOtpActivity<setEventInterceptor> MediaBrowserCompat$CustomActionResultReceiver(getValueReference getvaluereference) {
        return this.MediaBrowserCompat$ItemReceiver.read.calculatePurposefulLoan(getvaluereference).map(new writeSparseBooleanArray(this));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentBuilder_BindPromptPayQRInputFragment fragmentBuilder_BindPromptPayQRInputFragment = this.IconCompatParcelizer;
        fragmentBuilder_BindPromptPayQRInputFragment.MediaBrowserCompat$ItemReceiver = null;
        fragmentBuilder_BindPromptPayQRInputFragment.write = null;
    }

    public final DebitCardResetOtpActivity<zzbt.zzd.zza> MediaBrowserCompat$ItemReceiver(copyEvictableEntry copyevictableentry) {
        return this.MediaBrowserCompat$ItemReceiver.read.confirmMortgageLoan(copyevictableentry).map(new zzcj(this.read));
    }

    public final DebitCardResetOtpActivity<performAction> MediaBrowserCompat$ItemReceiver(setNextExpirable setnextexpirable) {
        return this.MediaBrowserCompat$ItemReceiver.read.confirmNTBReferral(setnextexpirable).map(new zzfd(this.MediaSessionCompat$QueueItem));
    }

    public final DebitCardResetOtpActivity<zzbt.zzd.zza> read(copyEvictableEntry copyevictableentry) {
        return this.MediaBrowserCompat$ItemReceiver.read.confirmPurposefulLoan(copyevictableentry).map(new zzcj(this.read));
    }

    public final DebitCardResetOtpActivity<performAction> write(setNextExpirable setnextexpirable) {
        getAddress2FieldName.read read2 = this.MediaBrowserCompat$ItemReceiver;
        zabr.IconCompatParcelizer("3013");
        zabr.IconCompatParcelizer("3014");
        return read2.read.confirmReferral(setnextexpirable).map(new zzfd(this.MediaSessionCompat$QueueItem));
    }

    public final DebitCardResetOtpActivity<performAction> read(setNextExpirable setnextexpirable) {
        return this.MediaBrowserCompat$ItemReceiver.read.confirmReferralCommercialLoan(setnextexpirable).map(new zzfd(this.MediaSessionCompat$QueueItem));
    }

    public final DebitCardResetOtpActivity<Boolean> write(String str, String str2) {
        getAddress2FieldName.read read2 = this.MediaBrowserCompat$ItemReceiver;
        return read2.read.deleteAdditionDocument(new zzlx(str, str2)).map(writeParcelable.write);
    }

    public final DebitCardResetOtpActivity<Boolean> write(CustomConcurrentHashMap.EntryIterator entryIterator) {
        return this.MediaBrowserCompat$ItemReceiver.read.deleteIssuer(entryIterator).map(writeLongList.IconCompatParcelizer);
    }

    public final DebitCardResetOtpActivity<zzby.zzb> IconCompatParcelizer(String str) {
        return this.MediaBrowserCompat$ItemReceiver.read.getDocumentType(str).map(zzem.read).map(new compareTo(this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public final DebitCardResetOtpActivity<zzcb.zzd.zza> read() {
        getAddress2FieldName.read read2 = this.MediaBrowserCompat$ItemReceiver;
        return read2.read.getCreditPowerLanding(this.PlaybackStateCompat).map(ObjectWrapper.MediaBrowserCompat$ItemReceiver).map(zzca.read);
    }

    public final DebitCardResetOtpActivity<zzbt.zzc.zza> read(String str, String str2) {
        getAddress2FieldName.read read2 = this.MediaBrowserCompat$ItemReceiver;
        return read2.read.getCustomerContactInformation(str, str2, this.PlaybackStateCompat).map(nextIndex.MediaBrowserCompat$ItemReceiver).map(new zzfi(this.MediaDescriptionCompat));
    }

    public final DebitCardResetOtpActivity<zzwc> IconCompatParcelizer(String str, String str2) {
        return this.MediaBrowserCompat$ItemReceiver.read.getDocumentUploaded(str, str2).map(from.IconCompatParcelizer).map(zzcx.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final DebitCardResetOtpActivity<zzbt.zzb.zza> MediaBrowserCompat$CustomActionResultReceiver(String str) {
        getAddress2FieldName.read read2 = this.MediaBrowserCompat$ItemReceiver;
        return read2.read.getEasycashDeeplink(str, this.PlaybackStateCompat).map(PooledExecutorsProvider.PooledExecutorFactory.write).map(new newSignInButton(this.MediaBrowserCompat$SearchResultReceiver));
    }

    public final DebitCardResetOtpActivity<zzbt.zzf.zza> write(String str) {
        return this.MediaBrowserCompat$ItemReceiver.read.getEasycashIntroductions(str).map(zzcy.IconCompatParcelizer).map(new zzew(this.MediaBrowserCompat$SearchResultReceiver));
    }

    public final DebitCardResetOtpActivity<zzdq.zza> IconCompatParcelizer() {
        setSystemAnimationsAreEnabled setsystemanimationsareenabled = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        if (setsystemanimationsareenabled == null || setsystemanimationsareenabled.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            return this.MediaBrowserCompat$ItemReceiver.read.getEasycashLoanTypesList().map(zzfd.zza.MediaBrowserCompat$ItemReceiver).doOnNext(new zzey(this.IconCompatParcelizer)).map(new zzdy(this.RatingCompat));
        }
        return DebitCardResetOtpActivity.just(this.RatingCompat.MediaBrowserCompat$ItemReceiver(setsystemanimationsareenabled));
    }

    public final DebitCardResetOtpActivity<zzfo.zzf> MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        getAddress2FieldName.read read2 = this.MediaBrowserCompat$ItemReceiver;
        String str = this.PlaybackStateCompat;
        zabr.IconCompatParcelizer("3000");
        return (z ? read2.read.getEasycashLoansList(str) : read2.read.getEasycashNtbLoansList(str)).map(new writeDoubleObject(this.MediaBrowserCompat$MediaItem));
    }

    public final DebitCardResetOtpActivity<setMeasurementEnabled> write() {
        getAddress2FieldName.read read2 = this.MediaBrowserCompat$ItemReceiver;
        String str = this.PlaybackStateCompat;
        zabr.IconCompatParcelizer("3000");
        return read2.read.getEasycashSalesheets(str).map(new zzfe(this.AlertController$RecycleListView));
    }

    public final DebitCardResetOtpActivity<zzfo.zzb> MediaBrowserCompat$CustomActionResultReceiver() {
        unscheduleDrawable unscheduledrawable = this.IconCompatParcelizer.write;
        if (unscheduledrawable == null || unscheduledrawable.write.isEmpty()) {
            return this.MediaBrowserCompat$ItemReceiver.read.getEasycashInstitutionsList().map(zzci.read).doOnNext(new zzfc(this.IconCompatParcelizer)).map(new DirectDebitDeepLinkActivity() {
                public final Object write(Object obj) {
                    return new zzfo.zzb(shouldShowCancelButton.read(((unscheduleDrawable) obj).write, new Tables.ImmutableCell.write(shouldShowCancelButton.this), zzq.read));
                }
            });
        }
        return DebitCardResetOtpActivity.just(new zzfo.zzb(shouldShowCancelButton.read(unscheduledrawable.write, new Tables.ImmutableCell.write(this.MediaMetadataCompat), zzq.read)));
    }

    public final DebitCardResetOtpActivity<zzfo.zza> read(String str) {
        return this.MediaBrowserCompat$ItemReceiver.read.getLendingIssuer(str).map(FastSafeParcelableJsonResponse.MediaBrowserCompat$CustomActionResultReceiver).map(new toVoidTask(this.MediaMetadataCompat));
    }

    public final DebitCardResetOtpActivity<isDataCollectionEnabled> MediaBrowserCompat$ItemReceiver(String str, String str2) {
        getAddress2FieldName.read read2 = this.MediaBrowserCompat$ItemReceiver;
        return read2.read.getMortgageTopupOffers(str, str2, this.PlaybackStateCompat).map(toStringHelper.read).map(new FavaDiagnosticsEntity(this.f3085x50fd9e4a));
    }

    public final DebitCardResetOtpActivity<zzcb.zze> write(CustomConcurrentHashMap.EntryFactory.C32924 r2) {
        return this.MediaBrowserCompat$ItemReceiver.read.getNCBInquiry(r2).map(onMove.read).map(zzfj.read);
    }

    public final DebitCardResetOtpActivity<String> MediaBrowserCompat$CustomActionResultReceiver(getPreviousEvictable getpreviousevictable) {
        return this.MediaBrowserCompat$ItemReceiver.read.getNcbMultiproduct(getpreviousevictable).map(zzfk.read);
    }

    public final DebitCardResetOtpActivity<zzbt.zze.zza> MediaBrowserCompat$ItemReceiver(String str) {
        return this.MediaBrowserCompat$ItemReceiver.read.getOccupationInfo(str).map(SafeParcelableSerializer.write).map(new createStringArray(this.MediaSessionCompat$ResultReceiverWrapper));
    }

    public final DebitCardResetOtpActivity<logHealthData> MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        getAddress2FieldName.read read2 = this.MediaBrowserCompat$ItemReceiver;
        return read2.read.getPurposefulLoanOffers(str, this.PlaybackStateCompat, str2).map(zzdf.MediaBrowserCompat$CustomActionResultReceiver).map(new zzcp(this.MediaSessionCompat$Token));
    }

    public final DebitCardResetOtpActivity<nextEntry> MediaBrowserCompat$MediaItem(String str, String str2) {
        getAddress2FieldName.read read2 = this.MediaBrowserCompat$ItemReceiver;
        return read2.read.getRequestInfoIncome(str, (String) null, this.PlaybackStateCompat).map(writeShort.read);
    }

    public final DebitCardResetOtpActivity<String> IconCompatParcelizer(CustomConcurrentHashMap.Segment segment) {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getTermsConditions(segment.MediaBrowserCompat$CustomActionResultReceiver, segment.read, segment.MediaBrowserCompat$SearchResultReceiver);
    }

    public final DebitCardResetOtpActivity<String> read(CustomConcurrentHashMap.Segment segment) {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getTermsConditionsReferral(segment.MediaBrowserCompat$CustomActionResultReceiver, segment.read, segment.IconCompatParcelizer, segment.MediaBrowserCompat$SearchResultReceiver);
    }

    public final DebitCardResetOtpActivity<String> MediaBrowserCompat$ItemReceiver(CustomConcurrentHashMap.Segment segment) {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getTermsConditionsReferralUnsecured(segment.MediaBrowserCompat$CustomActionResultReceiver, segment.read, segment.IconCompatParcelizer, segment.MediaBrowserCompat$SearchResultReceiver);
    }

    public final DebitCardResetOtpActivity<onCircleClick> write(CustomConcurrentHashMap.Segment segment) {
        getAddress2FieldName.read read2 = this.MediaBrowserCompat$ItemReceiver;
        segment.MediaBrowserCompat$ItemReceiver = this.PlaybackStateCompat;
        return read2.read.getTermsConditionsRequiredDocument(segment.MediaBrowserCompat$CustomActionResultReceiver, segment.read, segment.write, segment.MediaBrowserCompat$SearchResultReceiver, segment.MediaBrowserCompat$ItemReceiver).map(zzcg.zzd.MediaBrowserCompat$CustomActionResultReceiver).map(FragmentWrapper.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final String MediaBrowserCompat$SearchResultReceiver() {
        return this.PlaybackStateCompat;
    }

    public final DebitCardResetOtpActivity<List<BillerAdapter$ItemViewHolder>> read(CustomConcurrentHashMap.ReferenceEntry referenceEntry) {
        return this.MediaBrowserCompat$ItemReceiver.read.landingNTBReferral(referenceEntry).map(SimpleClientAdapter.write).map(new PendingResultUtil.ResultConverter(this.Keep));
    }

    public final DebitCardResetOtpActivity<zzbt.zzf> IconCompatParcelizer(notifyKeyReclaimed notifykeyreclaimed) {
        return this.MediaBrowserCompat$ItemReceiver.read.postOccupation(notifykeyreclaimed).map(zzez.write).map(new zacs(this.MediaSessionCompat$ResultReceiverWrapper));
    }

    public final DebitCardResetOtpActivity<zzcb.zzf.zza> MediaBrowserCompat$CustomActionResultReceiver(CustomConcurrentHashMap.EntryFactory.C32935 r2) {
        return this.MediaBrowserCompat$ItemReceiver.read.requestCreditPowerLoan(r2).map(writeParcelSparseArray.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final DebitCardResetOtpActivity<Boolean> write(CustomConcurrentHashMap.EntryFactory.C328912 r2) {
        r2.MediaDescriptionCompat = this.PlaybackStateCompat;
        return this.MediaBrowserCompat$ItemReceiver.read.saveCustomerContactInformation(r2).map(writeLongObject.IconCompatParcelizer);
    }

    public final DebitCardResetOtpActivity<RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder> IconCompatParcelizer(nextInChain nextinchain) {
        String str = this.PlaybackStateCompat;
        onGetStartedClick.write((Object) str, "<set-?>");
        nextinchain.MediaDescriptionCompat = str;
        BaseDiscoverDisclaimerActivity.write write2 = this.ParcelableVolumeInfo;
        onGetStartedClick.write((Object) nextinchain, "request");
        return write2.read.sendMortgageRequestInfo(nextinchain).map(zzdk.read).map(onTransact.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$ItemReceiver(CustomConcurrentHashMap.KeySet keySet) {
        return this.MediaBrowserCompat$ItemReceiver.read.submitLendingIssuer(keySet).map(writeLongArray.read);
    }

    public final DebitCardResetOtpActivity<Boolean> read(CustomConcurrentHashMap.EntryFactory.C32948 r2) {
        return this.MediaBrowserCompat$ItemReceiver.read.uploadValidation(r2).map(writeParcel.MediaBrowserCompat$ItemReceiver);
    }

    public final DebitCardResetOtpActivity<zzbt.zzc> MediaBrowserCompat$MediaItem() {
        getAddress2FieldName.read read2 = this.MediaBrowserCompat$ItemReceiver;
        return read2.read.validateCommercialEligibility(this.PlaybackStateCompat).map(IGmsServiceBroker.Stub.zza.read).map(new zzcq(this.PlaybackStateCompat$CustomAction));
    }

    public final DebitCardResetOtpActivity<zzbt.zzc> RatingCompat(String str) {
        getAddress2FieldName.read read2 = this.MediaBrowserCompat$ItemReceiver;
        return read2.read.validateMortgageEligibility(str, this.PlaybackStateCompat).map(IGmsServiceBroker.Stub.zza.read).map(new zzcq(this.PlaybackStateCompat$CustomAction));
    }

    public final DebitCardResetOtpActivity<String> MediaBrowserCompat$MediaItem(String str) {
        return this.MediaBrowserCompat$ItemReceiver.read.validateReferralEligibility(str).map(writeStringList.MediaBrowserCompat$ItemReceiver);
    }

    public final DebitCardResetOtpActivity<resetAnalyticsData> read(setPreviousExpirable setpreviousexpirable) {
        setpreviousexpirable.write = this.PlaybackStateCompat;
        return this.MediaBrowserCompat$ItemReceiver.read.verifyCommercialReferral(setpreviousexpirable).map(isAtLeastHoneycomb.IconCompatParcelizer).map(new checkHandlerThread(this.setHasDecor));
    }

    public final DebitCardResetOtpActivity<Boolean> IconCompatParcelizer(enqueueCleanup enqueuecleanup) {
        return this.MediaBrowserCompat$ItemReceiver.read.verifyMortgageFeatures(enqueuecleanup).map(writeIntegerList.MediaBrowserCompat$ItemReceiver);
    }

    public final DebitCardResetOtpActivity<resetAnalyticsData> MediaBrowserCompat$ItemReceiver(setPreviousEvictable setpreviousevictable) {
        setpreviousevictable.read = this.PlaybackStateCompat;
        return this.MediaBrowserCompat$ItemReceiver.read.verifyNTBReferral(setpreviousevictable).map(isAtLeastHoneycomb.IconCompatParcelizer).map(new zzco(this.setHasDecor));
    }

    public final DebitCardResetOtpActivity<RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder> MediaBrowserCompat$ItemReceiver(drainRecencyQueue drainrecencyqueue) {
        return this.MediaBrowserCompat$ItemReceiver.read.verifyPurposefulFeatures(drainrecencyqueue).map(zzdk.read).map(onTransact.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final DebitCardResetOtpActivity<resetAnalyticsData> MediaBrowserCompat$CustomActionResultReceiver(setPreviousExpirable setpreviousexpirable) {
        setpreviousexpirable.write = this.PlaybackStateCompat;
        return this.MediaBrowserCompat$ItemReceiver.read.verifyReferral(setpreviousexpirable).map(isAtLeastHoneycomb.IconCompatParcelizer).map(new checkHandlerThread(this.setHasDecor));
    }
}
