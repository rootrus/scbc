package com.scb.phone.view.fragment.remittance;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import java.util.Map;
import p040o.AddPlaceRequest;
import p040o.AutocompleteFilter;
import p040o.C4997nB;
import p040o.C7534ua;
import p040o.Collections2;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.EmptyImmutableList;
import p040o.EmptyImmutableMap;
import p040o.EmptyImmutableMultiset;
import p040o.EmptyImmutableSet;
import p040o.EmptyImmutableSetMultimap;
import p040o.EnumBiMap;
import p040o.FastJsonResponse;
import p040o.FastParser;
import p040o.Feature;
import p040o.FirstPartyScopes;
import p040o.ForwardingMultimap;
import p040o.FragmentBuilder_BindRegistrationPushNotificationFragment;
import p040o.GoogleSignInStatusCodes;
import p040o.HmlPinActivity;
import p040o.NumberUtils;
import p040o.PlaceBufferResponse;
import p040o.PolystarShape;
import p040o.PreLoadCheckActivity;
import p040o.RevocationBoundService;
import p040o.SettingsApi;
import p040o.StringToIntConverter;
import p040o.addAllLocationRequests;
import p040o.addLocationRequest;
import p040o.addObject;
import p040o.convertBack;
import p040o.ensurePlayServicesAvailable;
import p040o.extractLocationAvailability;
import p040o.forBase64;
import p040o.forBoolean;
import p040o.forConcreteType;
import p040o.forConcreteTypeArray;
import p040o.forDouble;
import p040o.forFloat;
import p040o.forInteger;
import p040o.forLong;
import p040o.forString;
import p040o.forStringMap;
import p040o.forStrings;
import p040o.getClientVersion;
import p040o.getFrontException;
import p040o.getFusedLocationProviderClient;
import p040o.getGoogleSignInAccount;
import p040o.getInitialTrigger;
import p040o.getInnerRadius;
import p040o.getInterval;
import p040o.getLatLng;
import p040o.getMinApkVersion;
import p040o.getOuterRadius;
import p040o.getPlaceTypes;
import p040o.getSafeParcelableFieldId;
import p040o.getSavedDefaultGoogleSignInOptions;
import p040o.getSettingsClient;
import p040o.getStatus;
import p040o.getTriggeringLocation;
import p040o.getTypeFilter;
import p040o.hasResolution;
import p040o.headSetImpl;
import p040o.isHashCodeFast;
import p040o.isLocationAvailable;
import p040o.isPartialView;
import p040o.isPrimitiveFieldSet;
import p040o.newInstance;
import p040o.onServiceConnected;
import p040o.requestIdToken;
import p040o.requestServerAuthCode;
import p040o.reverse;
import p040o.setBooleanInternal;
import p040o.setLongInternal;
import p040o.setNeedBle;
import p040o.setStringMapInternal;
import p040o.subSetImpl;
import p040o.tailSetImpl;
import p040o.withConverter;
import p040o.zaae;
import p040o.zabr;
import p040o.zzcr;
import p040o.zzy;
import scb.yek.GetKey$MediaBrowserCompat$CustomActionResultReceiver;

/* renamed from: com.scb.phone.view.fragment.remittance.RemittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver */
public final class C6150x69d72700 implements C7534ua {
    public final zzy AlertController$RecycleListView;
    public final requestIdToken IconCompatParcelizer;
    private final String Keep;
    public final FragmentBuilder_BindRegistrationPushNotificationFragment MediaBrowserCompat$CustomActionResultReceiver;
    public final getSavedDefaultGoogleSignInOptions MediaBrowserCompat$ItemReceiver;
    public final newInstance MediaBrowserCompat$MediaItem;
    public final hasResolution MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final ensurePlayServicesAvailable f3097x50fd9e4a;
    public final FirstPartyScopes MediaDescriptionCompat;
    public final getGoogleSignInAccount MediaMetadataCompat;
    public final Feature MediaSessionCompat$QueueItem;
    public final getMinApkVersion MediaSessionCompat$ResultReceiverWrapper;
    public final getClientVersion MediaSessionCompat$Token;
    public final PreLoadCheckActivity ParcelableVolumeInfo;
    private final GoogleSignInStatusCodes PlaybackStateCompat;
    private final getFrontException PlaybackStateCompat$CustomAction;
    public final onServiceConnected RatingCompat;
    public final requestServerAuthCode read;
    private final C4997nB.read setHasDecor;
    public final addObject write;

    private C6150x69d72700() {
    }

    @HmlPinActivity
    public C6150x69d72700(C4997nB.read read2, FragmentBuilder_BindRegistrationPushNotificationFragment fragmentBuilder_BindRegistrationPushNotificationFragment, GoogleSignInStatusCodes googleSignInStatusCodes, requestIdToken requestidtoken, requestServerAuthCode requestserverauthcode, getSavedDefaultGoogleSignInOptions getsaveddefaultgooglesigninoptions, hasResolution hasresolution, newInstance newinstance, onServiceConnected onserviceconnected, Feature feature, ensurePlayServicesAvailable ensureplayservicesavailable, PreLoadCheckActivity preLoadCheckActivity, getClientVersion getclientversion, FirstPartyScopes firstPartyScopes, zzy zzy, getMinApkVersion getminapkversion, getStatus getstatus, addObject addobject, RevocationBoundService revocationBoundService, getGoogleSignInAccount getgooglesigninaccount, getFrontException getfrontexception, String str) {
        this.setHasDecor = read2;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindRegistrationPushNotificationFragment;
        this.PlaybackStateCompat = googleSignInStatusCodes;
        this.IconCompatParcelizer = requestidtoken;
        this.read = requestserverauthcode;
        this.MediaBrowserCompat$ItemReceiver = getsaveddefaultgooglesigninoptions;
        this.MediaBrowserCompat$SearchResultReceiver = hasresolution;
        this.MediaBrowserCompat$MediaItem = newinstance;
        this.RatingCompat = onserviceconnected;
        this.MediaSessionCompat$QueueItem = feature;
        this.f3097x50fd9e4a = ensureplayservicesavailable;
        this.ParcelableVolumeInfo = preLoadCheckActivity;
        this.MediaSessionCompat$Token = getclientversion;
        this.MediaDescriptionCompat = firstPartyScopes;
        this.AlertController$RecycleListView = zzy;
        this.MediaSessionCompat$ResultReceiverWrapper = getminapkversion;
        this.write = addobject;
        this.MediaMetadataCompat = getgooglesigninaccount;
        this.PlaybackStateCompat$CustomAction = getfrontexception;
        this.Keep = str;
    }

    public PlaceBufferResponse IconCompatParcelizer(SingleDataEntity<getInnerRadius> singleDataEntity) {
        PlaceBufferResponse MediaBrowserCompat$ItemReceiver2 = this.PlaybackStateCompat.MediaBrowserCompat$ItemReceiver(singleDataEntity.getData());
        if (MediaBrowserCompat$ItemReceiver2.read != null && this.PlaybackStateCompat$CustomAction.MediaBrowserCompat$ItemReceiver(String.valueOf(MediaBrowserCompat$ItemReceiver2.read.MediaBrowserCompat$ItemReceiver))) {
            MediaBrowserCompat$ItemReceiver2.read = null;
        }
        return MediaBrowserCompat$ItemReceiver2;
    }

    public final DebitCardResetOtpActivity write(CustomConcurrentHashMap.StrongValueReference strongValueReference) {
        SingleDataEntity singleDataEntity;
        FragmentBuilder_BindRegistrationPushNotificationFragment fragmentBuilder_BindRegistrationPushNotificationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        List<String> list = strongValueReference.read;
        Map<String, SingleDataEntity<PolystarShape.Type>> map = fragmentBuilder_BindRegistrationPushNotificationFragment.RatingCompat;
        SingleDataEntity singleDataEntity2 = null;
        if (map == null) {
            singleDataEntity = null;
        } else {
            singleDataEntity = map.get(FragmentBuilder_BindRegistrationPushNotificationFragment.read(list));
        }
        if (!(singleDataEntity != null)) {
            return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.calculateRiskAssessment(strongValueReference).doOnNext(new StringToIntConverter.zaa(this, strongValueReference)).flatMap(new FastJsonResponse.Field(this));
        }
        FragmentBuilder_BindRegistrationPushNotificationFragment fragmentBuilder_BindRegistrationPushNotificationFragment2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        List<String> list2 = strongValueReference.read;
        Map<String, SingleDataEntity<PolystarShape.Type>> map2 = fragmentBuilder_BindRegistrationPushNotificationFragment2.RatingCompat;
        if (map2 != null) {
            singleDataEntity2 = map2.get(FragmentBuilder_BindRegistrationPushNotificationFragment.read(list2));
        }
        return DebitCardResetOtpActivity.just(RevocationBoundService.MediaBrowserCompat$ItemReceiver((PolystarShape.Type) singleDataEntity2.getData()));
    }

    public final DebitCardResetOtpActivity<getTriggeringLocation> IconCompatParcelizer(EnumBiMap enumBiMap) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver != null) {
            return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.cancelFundTransaction(enumBiMap).doOnNext(new isPrimitiveFieldSet(this, enumBiMap)).flatMap(new setLongInternal(this));
        }
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.getDetails(headSetImpl.MediaBrowserCompat$ItemReceiver(), this.Keep).flatMap(new forString(this, enumBiMap));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = null;
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = null;
    }

    public final void IconCompatParcelizer() {
        FragmentBuilder_BindRegistrationPushNotificationFragment fragmentBuilder_BindRegistrationPushNotificationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        fragmentBuilder_BindRegistrationPushNotificationFragment.MediaBrowserCompat$CustomActionResultReceiver = false;
        fragmentBuilder_BindRegistrationPushNotificationFragment.IconCompatParcelizer = null;
        fragmentBuilder_BindRegistrationPushNotificationFragment.MediaBrowserCompat$ItemReceiver = null;
        fragmentBuilder_BindRegistrationPushNotificationFragment.read = null;
        fragmentBuilder_BindRegistrationPushNotificationFragment.RatingCompat = null;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        FragmentBuilder_BindRegistrationPushNotificationFragment fragmentBuilder_BindRegistrationPushNotificationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        fragmentBuilder_BindRegistrationPushNotificationFragment.read = null;
        fragmentBuilder_BindRegistrationPushNotificationFragment.RatingCompat = null;
        fragmentBuilder_BindRegistrationPushNotificationFragment.write = null;
    }

    public final DebitCardResetOtpActivity<SettingsApi> MediaBrowserCompat$CustomActionResultReceiver(isPartialView ispartialview) {
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.confirmPurchase(ispartialview).flatMap(new setBooleanInternal(this));
    }

    public final DebitCardResetOtpActivity<getTypeFilter> write(reverse reverse, String str, String str2) {
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.confirmRedeem(reverse, str, str2).flatMap(new forBase64(this));
    }

    public final DebitCardResetOtpActivity IconCompatParcelizer(CustomConcurrentHashMap.ValueIterator valueIterator) {
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.confirmRiskAssessment(valueIterator).flatMap(new convertBack(this));
    }

    public final DebitCardResetOtpActivity<GetKey$MediaBrowserCompat$CustomActionResultReceiver> write(EmptyImmutableSet emptyImmutableSet) {
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.confirmSwitch(emptyImmutableSet).flatMap(new forLong(this));
    }

    public final DebitCardResetOtpActivity<getSettingsClient> write() {
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.getLandingDiscover().map(new forStringMap(this));
    }

    public final DebitCardResetOtpActivity<getFusedLocationProviderClient> MediaBrowserCompat$ItemReceiver(tailSetImpl tailsetimpl) {
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.getFundDetails(tailsetimpl).flatMap(new StringToIntConverter(this));
    }

    public final DebitCardResetOtpActivity<getTriggeringLocation> MediaBrowserCompat$MediaItem() {
        return MediaBrowserCompat$ItemReceiver(true);
    }

    public final DebitCardResetOtpActivity<getTriggeringLocation> MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver != null) {
                return DebitCardResetOtpActivity.just(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.getData()));
            }
        }
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.getDetails(headSetImpl.MediaBrowserCompat$ItemReceiver(), this.Keep).doOnError(new FastParser(this)).doOnNext(new NumberUtils(this.MediaBrowserCompat$CustomActionResultReceiver)).flatMap(new FastParser.ParseException(this));
    }

    public final DebitCardResetOtpActivity<PlaceBufferResponse> write(Collections2.FilteredCollection.C31791 r1, boolean z) {
        if (z) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer != null) {
                return DebitCardResetOtpActivity.just(IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer));
            }
        }
        return this.setHasDecor.read.getInvestmentSummary(r1).map(new withConverter(this));
    }

    public final DebitCardResetOtpActivity<isLocationAvailable> MediaBrowserCompat$ItemReceiver(ForwardingMultimap forwardingMultimap) {
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.getMutualFundsConfig(forwardingMultimap).flatMap(new getSafeParcelableFieldId(this));
    }

    public final DebitCardResetOtpActivity<getLatLng> MediaBrowserCompat$ItemReceiver(EmptyImmutableList.C97281 r2, String str) {
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.getPurchaseSearchFunds(r2).flatMap(new forFloat(this, str));
    }

    public final DebitCardResetOtpActivity<AutocompleteFilter> read(EmptyImmutableMap emptyImmutableMap) {
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.getRedeemSearchFunds(emptyImmutableMap).flatMap(new setStringMapInternal(this));
    }

    public final DebitCardResetOtpActivity<List<getInterval>> MediaBrowserCompat$SearchResultReceiver() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.write != null) {
            return DebitCardResetOtpActivity.just(getStatus.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.write.getData()));
        }
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.getRiskAssessment().doOnNext(new zzcr(this.MediaBrowserCompat$CustomActionResultReceiver)).flatMap(new FastParser.zaa(this));
    }

    public final DebitCardResetOtpActivity<addAllLocationRequests> MediaBrowserCompat$ItemReceiver(isHashCodeFast ishashcodefast) {
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.getSwitchInSearchFunds(ishashcodefast).flatMap(new forStrings(this));
    }

    public final DebitCardResetOtpActivity<addLocationRequest> MediaBrowserCompat$ItemReceiver(EmptyImmutableSetMultimap emptyImmutableSetMultimap) {
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.getSwitchOutSearchFunds(emptyImmutableSetMultimap).flatMap(new forBoolean(this));
    }

    public final String RatingCompat() {
        return this.Keep;
    }

    public final boolean MediaMetadataCompat() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void read() {
        FragmentBuilder_BindRegistrationPushNotificationFragment fragmentBuilder_BindRegistrationPushNotificationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        fragmentBuilder_BindRegistrationPushNotificationFragment.MediaBrowserCompat$CustomActionResultReceiver = false;
        fragmentBuilder_BindRegistrationPushNotificationFragment.IconCompatParcelizer = null;
        fragmentBuilder_BindRegistrationPushNotificationFragment.MediaBrowserCompat$ItemReceiver = null;
        fragmentBuilder_BindRegistrationPushNotificationFragment.read = null;
        fragmentBuilder_BindRegistrationPushNotificationFragment.RatingCompat = null;
    }

    public final DebitCardResetOtpActivity<extractLocationAvailability> MediaBrowserCompat$ItemReceiver(String str) {
        SingleDataEntity singleDataEntity;
        Map<String, SingleDataEntity<getOuterRadius>> map = this.MediaBrowserCompat$CustomActionResultReceiver.read;
        SingleDataEntity singleDataEntity2 = null;
        if (map == null) {
            singleDataEntity = null;
        } else {
            singleDataEntity = map.get(str);
        }
        if (singleDataEntity != null) {
            addObject addobject = this.write;
            Map<String, SingleDataEntity<getOuterRadius>> map2 = this.MediaBrowserCompat$CustomActionResultReceiver.read;
            if (map2 != null) {
                singleDataEntity2 = map2.get(str);
            }
            return DebitCardResetOtpActivity.just(addobject.MediaBrowserCompat$CustomActionResultReceiver((getOuterRadius) singleDataEntity2.getData()));
        }
        return this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver.requestRiskAssessment(str, this.Keep).doOnNext(new forConcreteTypeArray(this, str)).flatMap(new forConcreteType(this));
    }

    public final void IconCompatParcelizer(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = true;
    }

    public final DebitCardResetOtpActivity<getInitialTrigger> MediaDescriptionCompat() {
        C4997nB.read read2 = this.setHasDecor;
        return read2.MediaBrowserCompat$CustomActionResultReceiver.setRiskAssessment(headSetImpl.MediaBrowserCompat$ItemReceiver()).flatMap(new FastJsonResponse.FieldConverter(this));
    }

    public final DebitCardResetOtpActivity<AddPlaceRequest> IconCompatParcelizer(EmptyImmutableList emptyImmutableList) {
        C4997nB.read read2 = this.setHasDecor;
        zabr.IconCompatParcelizer("9200");
        return read2.MediaBrowserCompat$CustomActionResultReceiver.verifyPurchase(emptyImmutableList).doFinally(zaae.MediaBrowserCompat$CustomActionResultReceiver).flatMap(new forInteger(this));
    }

    public final DebitCardResetOtpActivity<getPlaceTypes> read(EmptyImmutableMultiset emptyImmutableMultiset) {
        C4997nB.read read2 = this.setHasDecor;
        zabr.IconCompatParcelizer("9200");
        return read2.MediaBrowserCompat$CustomActionResultReceiver.verifyRedeem(emptyImmutableMultiset).flatMap(new forDouble(this));
    }

    public final DebitCardResetOtpActivity<setNeedBle> read(subSetImpl subsetimpl) {
        C4997nB.read read2 = this.setHasDecor;
        zabr.IconCompatParcelizer("9200");
        return read2.MediaBrowserCompat$CustomActionResultReceiver.verifySwitch(subsetimpl).flatMap(new FastJsonResponse(this));
    }
}
