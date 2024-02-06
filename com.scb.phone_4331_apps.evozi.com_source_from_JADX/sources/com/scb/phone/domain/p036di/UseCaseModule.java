package com.scb.phone.domain.p036di;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.scb.phone.domain.interactor.FatcaQuestionnaireCase;
import com.scb.phone.domain.interactor.PinCase;
import com.scb.phone.domain.interactor.ReviewInfoCase;
import com.scb.phone.domain.interactor.emailverification.EnterVerificationCodeUseCase;
import com.scb.phone.domain.interactor.etb.ETBCheckIdentityCase;
import com.scb.phone.domain.repositories.ForgotPinRepositoryContractor;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import p040o.AbstractBiMap;
import p040o.AbstractIterator;
import p040o.AbstractLinkedIterator;
import p040o.AbstractMapBasedMultiset;
import p040o.AbstractMultimap;
import p040o.AbstractMultiset;
import p040o.AbstractSortedSetMultimap;
import p040o.AppMeasurement;
import p040o.AppMeasurementContentProvider;
import p040o.AppMeasurementDynamiteService;
import p040o.AppMeasurementInstallReferrerReceiver;
import p040o.AppMeasurementJobService;
import p040o.AppMeasurementReceiver;
import p040o.AppMeasurementSdk;
import p040o.AppMeasurementService;
import p040o.ArrayListMultimap;
import p040o.AsynchronousComputationException;
import p040o.Barcode;
import p040o.C10847jointType;
import p040o.C10858rotation;
import p040o.C10869tileProvider;
import p040o.C10887sdkVersion;
import p040o.C1189xa6547b7b;
import p040o.C4801in;
import p040o.C4809is;
import p040o.C4939limit;
import p040o.C5092on;
import p040o.C6372x3d677cbb;
import p040o.C6548x820c5aab;
import p040o.C6897xeb950f47;
import p040o.C7514tY;
import p040o.C7515tZ;
import p040o.C7534ua;
import p040o.CameraSource;
import p040o.CcSofHybridActivity_ViewBinding;
import p040o.CharMatcher;
import p040o.CloseAccountReviewActivity;
import p040o.Detector;
import p040o.Face;
import p040o.FaceDetector;
import p040o.FaceDetectorV2Jni;
import p040o.FinalizableReferenceQueue;
import p040o.FinalizableWeakReference;
import p040o.Finalizer;
import p040o.FocusingProcessor;
import p040o.FragmentBuilder_BindBaseInvestmentSuccessFragment;
import p040o.FragmentBuilder_BindCloseAccountSelectionOwnFragment;
import p040o.Frame;
import p040o.Functions;
import p040o.HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.IIdExtractionResult;
import p040o.INativeImageLabeler;
import p040o.IdType;
import p040o.IndoorBuilding;
import p040o.IndoorLevel;
import p040o.InstallException;
import p040o.LabelOptions;
import p040o.Landmark;
import p040o.LargestFaceFocusingProcessor;
import p040o.LatLng;
import p040o.LatLngBounds;
import p040o.LocalProjectProvider;
import p040o.LocalProjectProvider_Factory;
import p040o.LocalProjectProvider_MembersInjector;
import p040o.MapStyleOptions;
import p040o.MarkerOptions;
import p040o.MultiDetector;
import p040o.NativeFaceDetectorImpl;
import p040o.NativeFaceDetectorV2Impl;
import p040o.NativeFaceSettings;
import p040o.OnDeviceIdExtractor;
import p040o.OnDeviceIdExtractor_Factory;
import p040o.PassportCaptureModule_PassportOnDeviceExtractionServer_Factory;
import p040o.PassportExtractActivity;
import p040o.PatternItem;
import p040o.PointOfInterest;
import p040o.Polygon;
import p040o.PolygonOptions;
import p040o.Polyline;
import p040o.PolylineOptions;
import p040o.Predicates;
import p040o.ProjectProviderException;
import p040o.ServerProjectProvider;
import p040o.SignInOptions;
import p040o.Splitter;
import p040o.SquareCap;
import p040o.StreetViewPanoramaCamera;
import p040o.StreetViewPanoramaLink;
import p040o.StreetViewPanoramaLocation;
import p040o.StreetViewPanoramaOrientation;
import p040o.StreetViewSource;
import p040o.Suppliers;
import p040o.TaskCompletionSource;
import p040o.Tasks;
import p040o.TextInputEditText;
import p040o.TileOverlay;
import p040o.TileOverlayOptions;
import p040o.TileProvider;
import p040o.TransformationChildLayout;
import p040o.UrlTileProvider;
import p040o.VisibleRegion;
import p040o.access$210;
import p040o.access$600;
import p040o.addHandshakeCompletedListener;
import p040o.addHole;
import p040o.addToMap;
import p040o.alpha;
import p040o.alwaysFalse;
import p040o.alwaysTrue;
import p040o.asList;
import p040o.asMap;
import p040o.attachInfo;
import p040o.classification;
import p040o.classificationConfidence;
import p040o.clearConditionalUserPropertyAs;
import p040o.closeDetectorJni;
import p040o.color;
import p040o.containsPattern;
import p040o.countIn;
import p040o.createAsMap;
import p040o.createCollection;
import p040o.createKeySet;
import p040o.defensiveCopy;
import p040o.delegate;
import p040o.detect;
import p040o.detectFacesImageByteBufferJni;
import p040o.detectorIsOperational;
import p040o.doGoAsync;
import p040o.doStartService;
import p040o.draggable;
import p040o.elementSet;
import p040o.endCap;
import p040o.endOfData;
import p040o.equalTo;
import p040o.fadeIn;
import p040o.findValueIteratorAndKey;
import p040o.firstKey;
import p040o.flat;
import p040o.forMap;
import p040o.forResult;
import p040o.frequency;
import p040o.geodesic;
import p040o.getAncestor;
import p040o.getAnchorV;
import p040o.getAppIdOrigin;
import p040o.getBaseUrl;
import p040o.getBundleVersion;
import p040o.getCausalChain;
import p040o.getConditionalUserPropertiesAs;
import p040o.getDelegateIterator;
import p040o.getDocument$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getFrontException;
import p040o.getGrayscaleImageData;
import p040o.getInfoWindowAnchorV;
import p040o.getIsRightEyeOpenProbability;
import p040o.getIsSmilingProbability;
import p040o.getKeepAlive;
import p040o.getLocalAddress;
import p040o.getLocalPort;
import p040o.getOrientation;
import p040o.getProjectAsync;
import p040o.getRegionName;
import p040o.getRootCause;
import p040o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver;
import p040o.getSupportedCipherSuites;
import p040o.getTileProvider;
import p040o.getUnknownKeys;
import p040o.getUserPropertiesAs;
import p040o.getVariantAsync;
import p040o.icon;
import p040o.include;
import p040o.including;
import p040o.infoWindowAnchor;
import p040o.inject_cacheProvider;
import p040o.inject_extractorProvider;
import p040o.iterable;
import p040o.keys;
import p040o.logEventInternal;
import p040o.logEventInternalNoInterceptor;
import p040o.logEventNoInterceptor;
import p040o.matchesAllOf;
import p040o.memoize;
import p040o.memoizeWithExpiration;
import p040o.negate;
import p040o.newLoader;
import p040o.newLocalProjectProvider;
import p040o.newOnDeviceIdExtractor;
import p040o.nullToEmpty;
import p040o.onBackImageProcessed;
import p040o.onFrontImageProcessed;
import p040o.onPattern;
import p040o.onPictureTaken;
import p040o.onPreviewFrame;
import p040o.onRebind;
import p040o.onStopJob;
import p040o.onUnbind;
import p040o.orientation;
import p040o.pattern;
import p040o.performActionWithResponse;
import p040o.readResolve;
import p040o.readVersion;
import p040o.receiveDetections;
import p040o.receiveFrame;
import p040o.refreshIfEmpty;
import p040o.replaceValues;
import p040o.selectFocus;
import p040o.sendUrgentData;
import p040o.separatorEnd;
import p040o.setAutoFocusEnabled;
import p040o.setBoxBackgroundColorResource;
import p040o.setConditionalUserPropertyAs;
import p040o.setCvv;
import p040o.setDelegates;
import p040o.setErrorTextColor;
import p040o.setExpandedTitleMargin;
import p040o.setFabCradleRoundedCornerRadius;
import p040o.setHintEnabled;
import p040o.setInverse;
import p040o.setLandmarkType;
import p040o.setMap;
import p040o.setMaxGapFrames;
import p040o.setMinFaceSize;
import p040o.setMode;
import p040o.setPasswordVisibilityToggleContentDescription;
import p040o.setTimestampMillis;
import p040o.setUserPropertyInternal;
import p040o.setupDialog;
import p040o.skipNulls;
import p040o.snippet;
import p040o.split;
import p040o.startCap;
import p040o.strokeJointType;
import p040o.tailSet;
import p040o.title;
import p040o.transparency;
import p040o.trimFrom;
import p040o.trySetException;
import p040o.update;
import p040o.validateIterator;
import p040o.validateModelFilesJni;
import p040o.waitForAccessTokenRefresh;
import p040o.whenAll;
import p040o.zzuk;

/* renamed from: com.scb.phone.domain.di.UseCaseModule */
public class UseCaseModule {
    @HmlSetNTBPinActivity
    public transparency write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, OnDeviceIdExtractor.C69651 r14, LocalProjectProvider localProjectProvider, IdType idType, AbstractMultimap.EntryIterator entryIterator, setMap setmap) {
        return new transparency(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, r14, idType, localProjectProvider, entryIterator, setmap);
    }

    @HmlSetNTBPinActivity
    public include IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, classificationConfidence classificationconfidence, C7515tZ tZVar, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findValueIteratorAndKey findvalueiteratorandkey) {
        return new include(closeAccountReviewActivity, closeAccountReviewActivity2, classificationconfidence, tZVar, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public alpha read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, IdType idType, findValueIteratorAndKey findvalueiteratorandkey) {
        return new alpha(closeAccountReviewActivity, closeAccountReviewActivity2, idType, findvalueiteratorandkey);
    }

    @HmlSetNTBPinActivity
    public StreetViewPanoramaLink MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C7534ua uaVar, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, getFrontException getfrontexception) {
        return new StreetViewPanoramaLink(closeAccountReviewActivity, closeAccountReviewActivity2, uaVar, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public AppMeasurementDynamiteService read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, IdType idType) {
        return new AppMeasurementDynamiteService(closeAccountReviewActivity, closeAccountReviewActivity2, idType);
    }

    @HmlSetNTBPinActivity
    public LatLngBounds MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, IdType idType) {
        return new LatLngBounds(closeAccountReviewActivity, closeAccountReviewActivity2, idType);
    }

    @HmlSetNTBPinActivity
    public AppMeasurementInstallReferrerReceiver MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C7515tZ tZVar, classificationConfidence classificationconfidence, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new AppMeasurementInstallReferrerReceiver(closeAccountReviewActivity, closeAccountReviewActivity2, tZVar, classificationconfidence, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public including MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, setCvv setcvv, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new including(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public icon MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider localProjectProvider, findValueIteratorAndKey findvalueiteratorandkey) {
        return new icon(closeAccountReviewActivity, closeAccountReviewActivity2, localProjectProvider, findvalueiteratorandkey);
    }

    @HmlSetNTBPinActivity
    public PatternItem IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider localProjectProvider, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new PatternItem(closeAccountReviewActivity, closeAccountReviewActivity2, localProjectProvider, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public snippet MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C10887sdkVersion sdkversion, setCvv setcvv, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, keys keys) {
        return new snippet(closeAccountReviewActivity, closeAccountReviewActivity2, sdkversion, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, keys);
    }

    @HmlSetNTBPinActivity
    public Polyline MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, inject_cacheProvider inject_cacheprovider) {
        return new Polyline(closeAccountReviewActivity, closeAccountReviewActivity2, inject_cacheprovider);
    }

    @HmlSetNTBPinActivity
    public pattern MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider_MembersInjector localProjectProvider_MembersInjector) {
        return new pattern(closeAccountReviewActivity, closeAccountReviewActivity2, localProjectProvider_MembersInjector);
    }

    @HmlSetNTBPinActivity
    public getOrientation write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider_MembersInjector localProjectProvider_MembersInjector, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new getOrientation(closeAccountReviewActivity, closeAccountReviewActivity2, localProjectProvider_MembersInjector, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public OkHttpClient write() {
        return new OkHttpClient();
    }

    @HmlSetNTBPinActivity
    public startCap write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider_MembersInjector localProjectProvider_MembersInjector, File file, OkHttpClient okHttpClient) {
        return new startCap(closeAccountReviewActivity, closeAccountReviewActivity2, localProjectProvider_MembersInjector, file, okHttpClient);
    }

    @HmlSetNTBPinActivity
    public StreetViewPanoramaCamera read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider_MembersInjector localProjectProvider_MembersInjector, File file, OkHttpClient okHttpClient) {
        return new StreetViewPanoramaCamera(closeAccountReviewActivity, closeAccountReviewActivity2, localProjectProvider_MembersInjector, file, okHttpClient);
    }

    @HmlSetNTBPinActivity
    public SquareCap MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider_MembersInjector localProjectProvider_MembersInjector, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, AbstractMultimap.MultisetEntry multisetEntry, findValueIteratorAndKey findvalueiteratorandkey) {
        return new SquareCap(closeAccountReviewActivity, closeAccountReviewActivity2, localProjectProvider_MembersInjector, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, multisetEntry, findvalueiteratorandkey);
    }

    @HmlSetNTBPinActivity
    public StreetViewPanoramaOrientation.Builder write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, findValueIteratorAndKey findvalueiteratorandkey, ServerProjectProvider.C70673 r14, LocalProjectProvider localProjectProvider, AbstractMultimap.EntrySet entrySet, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, getFrontException getfrontexception) {
        return new StreetViewPanoramaOrientation.Builder(closeAccountReviewActivity, closeAccountReviewActivity2, findvalueiteratorandkey, r14, localProjectProvider, entrySet, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, getfrontexception);
    }

    @HmlSetNTBPinActivity
    public StreetViewSource MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C7515tZ tZVar, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new StreetViewSource(closeAccountReviewActivity, closeAccountReviewActivity2, tZVar);
    }

    @HmlSetNTBPinActivity
    public TileOverlay IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, newOnDeviceIdExtractor newondeviceidextractor, OnDeviceIdExtractor_Factory onDeviceIdExtractor_Factory) {
        return new TileOverlay(closeAccountReviewActivity, closeAccountReviewActivity2, newondeviceidextractor, onDeviceIdExtractor_Factory);
    }

    @HmlSetNTBPinActivity
    public TileOverlayOptions MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, OnDeviceIdExtractor.C6966a.C69671 r4, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new TileOverlayOptions(closeAccountReviewActivity, closeAccountReviewActivity2, r4, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public UrlTileProvider MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, setCvv setcvv, getFrontException getfrontexception) {
        return new UrlTileProvider(closeAccountReviewActivity, closeAccountReviewActivity2, setcvv, getfrontexception);
    }

    @HmlSetNTBPinActivity
    public AppMeasurement.Event read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getFrontException getfrontexception, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new AppMeasurement.Event(closeAccountReviewActivity, closeAccountReviewActivity2, getfrontexception, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public StreetViewPanoramaCamera.Builder MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getFrontException getfrontexception) {
        return new StreetViewPanoramaCamera.Builder(closeAccountReviewActivity, closeAccountReviewActivity2, getfrontexception);
    }

    @HmlSetNTBPinActivity
    public VisibleRegion IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider localProjectProvider, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findValueIteratorAndKey findvalueiteratorandkey) {
        return new VisibleRegion(closeAccountReviewActivity, closeAccountReviewActivity2, localProjectProvider, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findvalueiteratorandkey);
    }

    @HmlSetNTBPinActivity
    public draggable MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, onFrontImageProcessed onfrontimageprocessed, LocalProjectProvider localProjectProvider, findValueIteratorAndKey findvalueiteratorandkey, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, getFrontException getfrontexception) {
        return new draggable(closeAccountReviewActivity, closeAccountReviewActivity2, onfrontimageprocessed, findvalueiteratorandkey, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public doStartService ParcelableVolumeInfo(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new doStartService(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public getUserPropertiesAs MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider.C70695 r4, getAncestor getancestor) {
        return new getUserPropertiesAs(closeAccountReviewActivity, closeAccountReviewActivity2, r4, getancestor);
    }

    @HmlSetNTBPinActivity
    public PinCase MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C7514tY tYVar, setCvv setcvv, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, AbstractMultimap.EntryIterator entryIterator, keys keys, C1189xa6547b7b fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaSessionCompat$ResultReceiverWrapper, ForgotPinRepositoryContractor forgotPinRepositoryContractor, C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver) {
        return new PinCase(closeAccountReviewActivity, closeAccountReviewActivity2, tYVar, setcvv, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, entryIterator, keys, fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaSessionCompat$ResultReceiverWrapper, forgotPinRepositoryContractor, fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver);
    }

    @HmlSetNTBPinActivity
    public performActionWithResponse MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2) {
        return new performActionWithResponse(closeAccountReviewActivity, closeAccountReviewActivity2);
    }

    @HmlSetNTBPinActivity
    public setUserPropertyInternal read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, setCvv setcvv, getFrontException getfrontexception, newOnDeviceIdExtractor newondeviceidextractor, findValueIteratorAndKey findvalueiteratorandkey, LocalProjectProvider localProjectProvider, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, AbstractMultimap.EntryIterator entryIterator, AbstractMultimap.AsMap.AsMapIterator asMapIterator, ProjectProviderException projectProviderException, keys keys, C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver, AbstractMultimap.WrappedList wrappedList, IdType idType, C7534ua uaVar, OnDeviceIdExtractor.C69651 r36) {
        return new setUserPropertyInternal(closeAccountReviewActivity, closeAccountReviewActivity2, setcvv, getfrontexception, newondeviceidextractor, findvalueiteratorandkey, localProjectProvider, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, entryIterator, asMapIterator, projectProviderException, keys, fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver, wrappedList, idType, uaVar, r36);
    }

    @HmlSetNTBPinActivity
    public setConditionalUserPropertyAs write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findValueIteratorAndKey findvalueiteratorandkey) {
        return new setConditionalUserPropertyAs(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findvalueiteratorandkey);
    }

    @HmlSetNTBPinActivity
    public AppMeasurement.Param MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider localProjectProvider, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new AppMeasurement.Param(closeAccountReviewActivity, closeAccountReviewActivity2, localProjectProvider, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public AppMeasurement.OnEventListener read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider localProjectProvider, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new AppMeasurement.OnEventListener(closeAccountReviewActivity, closeAccountReviewActivity2, localProjectProvider, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public AppMeasurement.UserProperty read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, AbstractMultimap.EntrySet entrySet, findValueIteratorAndKey findvalueiteratorandkey) {
        return new AppMeasurement.UserProperty(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, entrySet, findvalueiteratorandkey);
    }

    @HmlSetNTBPinActivity
    public AppMeasurementContentProvider read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.EntrySet entrySet, classificationConfidence classificationconfidence, getFrontException getfrontexception) {
        return new AppMeasurementContentProvider(closeAccountReviewActivity, closeAccountReviewActivity2, entrySet, classificationconfidence);
    }

    @HmlSetNTBPinActivity
    public AppMeasurementJobService write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, newOnDeviceIdExtractor newondeviceidextractor) {
        return new AppMeasurementJobService(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public logEventNoInterceptor IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findValueIteratorAndKey findvalueiteratorandkey) {
        return new logEventNoInterceptor(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public getAppIdOrigin write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.EntrySet entrySet, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findValueIteratorAndKey findvalueiteratorandkey) {
        return new getAppIdOrigin(closeAccountReviewActivity, closeAccountReviewActivity2, entrySet, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findvalueiteratorandkey);
    }

    @HmlSetNTBPinActivity
    public doGoAsync IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, CcSofHybridActivity_ViewBinding.read read, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, include include) {
        return new doGoAsync(closeAccountReviewActivity, closeAccountReviewActivity2, read, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, include);
    }

    @HmlSetNTBPinActivity
    public update read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, CcSofHybridActivity_ViewBinding.read read) {
        return new update(closeAccountReviewActivity, closeAccountReviewActivity2, read);
    }

    @HmlSetNTBPinActivity
    public AppMeasurementSdk.ConditionalUserProperty AlertController$RecycleListView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new AppMeasurementSdk.ConditionalUserProperty(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public AppMeasurementSdk.OnEventListener MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.MultisetEntry multisetEntry, C7515tZ tZVar, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findValueIteratorAndKey findvalueiteratorandkey) {
        return new AppMeasurementSdk.OnEventListener(closeAccountReviewActivity, closeAccountReviewActivity2, multisetEntry, tZVar, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findvalueiteratorandkey);
    }

    @HmlSetNTBPinActivity
    public closeDetectorJni MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.MultisetEntry multisetEntry) {
        return new closeDetectorJni(closeAccountReviewActivity, closeAccountReviewActivity2, multisetEntry);
    }

    @HmlSetNTBPinActivity
    public AppMeasurement IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, AbstractMultimap.AsMap.AsMapIterator asMapIterator) {
        return new AppMeasurement(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, asMapIterator);
    }

    @HmlSetNTBPinActivity
    public onStopJob IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.C30091 r4, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new onStopJob(closeAccountReviewActivity, closeAccountReviewActivity2, r4, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public clearConditionalUserPropertyAs MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6372x3d677cbb ccSofCreditCardOnlyActivity$MediaBrowserCompat$CustomActionResultReceiver) {
        return new clearConditionalUserPropertyAs(closeAccountReviewActivity, closeAccountReviewActivity2, ccSofCreditCardOnlyActivity$MediaBrowserCompat$CustomActionResultReceiver);
    }

    @HmlSetNTBPinActivity
    public StreetViewPanoramaLocation IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6372x3d677cbb ccSofCreditCardOnlyActivity$MediaBrowserCompat$CustomActionResultReceiver) {
        return new StreetViewPanoramaLocation(closeAccountReviewActivity, closeAccountReviewActivity2, ccSofCreditCardOnlyActivity$MediaBrowserCompat$CustomActionResultReceiver);
    }

    @HmlSetNTBPinActivity
    public StreetViewPanoramaOrientation read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6372x3d677cbb ccSofCreditCardOnlyActivity$MediaBrowserCompat$CustomActionResultReceiver, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, OnDeviceIdExtractor onDeviceIdExtractor, AbstractMultimap.AsMap.AsMapIterator asMapIterator, findValueIteratorAndKey findvalueiteratorandkey, AbstractMultimap.EntryIterator entryIterator, inject_extractorProvider inject_extractorprovider, HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver hmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver, getRegionName getregionname) {
        return new StreetViewPanoramaOrientation(closeAccountReviewActivity, closeAccountReviewActivity2, ccSofCreditCardOnlyActivity$MediaBrowserCompat$CustomActionResultReceiver, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, onDeviceIdExtractor, asMapIterator, findvalueiteratorandkey, entryIterator, inject_extractorprovider, hmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver, getregionname);
    }

    @HmlSetNTBPinActivity
    public AppMeasurement.EventInterceptor read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6372x3d677cbb ccSofCreditCardOnlyActivity$MediaBrowserCompat$CustomActionResultReceiver) {
        return new AppMeasurement.EventInterceptor(closeAccountReviewActivity, closeAccountReviewActivity2, ccSofCreditCardOnlyActivity$MediaBrowserCompat$CustomActionResultReceiver);
    }

    @HmlSetNTBPinActivity
    public attachInfo write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider localProjectProvider, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findValueIteratorAndKey findvalueiteratorandkey, C6372x3d677cbb ccSofCreditCardOnlyActivity$MediaBrowserCompat$CustomActionResultReceiver) {
        return new attachInfo(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, ccSofCreditCardOnlyActivity$MediaBrowserCompat$CustomActionResultReceiver);
    }

    @HmlSetNTBPinActivity
    public IndoorBuilding.zza read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, AbstractMultimap.EntryIterator entryIterator) {
        return new IndoorBuilding.zza(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, entryIterator);
    }

    @HmlSetNTBPinActivity
    public C10858rotation MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69331 r4) {
        return new C10858rotation(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public FinalizableReferenceQueue MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider.C70673 r4) {
        return new FinalizableReferenceQueue(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public TileProvider MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.Entries entries) {
        return new TileProvider(closeAccountReviewActivity, closeAccountReviewActivity2, entries);
    }

    @HmlSetNTBPinActivity
    public title write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getProjectAsync getprojectasync, findValueIteratorAndKey findvalueiteratorandkey) {
        return new title(closeAccountReviewActivity, closeAccountReviewActivity2, getprojectasync, findvalueiteratorandkey);
    }

    @HmlSetNTBPinActivity
    public AppMeasurement.ConditionalUserProperty MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, SubsamplingScaleImageView.IconCompatParcelizer iconCompatParcelizer, findValueIteratorAndKey findvalueiteratorandkey, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new AppMeasurement.ConditionalUserProperty(closeAccountReviewActivity, closeAccountReviewActivity2, iconCompatParcelizer, findvalueiteratorandkey, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public MapStyleOptions write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, onBackImageProcessed onbackimageprocessed, AbstractMultimap.MultisetEntry multisetEntry, C7515tZ tZVar, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findValueIteratorAndKey findvalueiteratorandkey) {
        return new MapStyleOptions(closeAccountReviewActivity, closeAccountReviewActivity2, onbackimageprocessed, multisetEntry, tZVar, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findvalueiteratorandkey);
    }

    @HmlSetNTBPinActivity
    public AppMeasurementSdk write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.EntryIterator entryIterator) {
        return new AppMeasurementSdk(closeAccountReviewActivity, closeAccountReviewActivity2, entryIterator);
    }

    @HmlSetNTBPinActivity
    public getSupportedCipherSuites write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.MultisetEntryIterator multisetEntryIterator) {
        return new getSupportedCipherSuites(closeAccountReviewActivity, closeAccountReviewActivity2, multisetEntryIterator);
    }

    @HmlSetNTBPinActivity
    public flat read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider localProjectProvider, OnDeviceIdExtractor.C6966a.C69682 r4, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new flat(closeAccountReviewActivity, closeAccountReviewActivity2, r4, localProjectProvider);
    }

    @HmlSetNTBPinActivity
    public AppMeasurementService MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, OnDeviceIdExtractor.C6966a.C69682 r10, LocalProjectProvider localProjectProvider, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new AppMeasurementService(closeAccountReviewActivity, closeAccountReviewActivity2, r10, localProjectProvider, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public getAnchorV MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, OnDeviceIdExtractor.C6966a.C69682 r10, LocalProjectProvider localProjectProvider, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new getAnchorV(closeAccountReviewActivity, closeAccountReviewActivity2, r10, localProjectProvider, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public logEventInternal IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, OnDeviceIdExtractor.C6966a.C69682 r10, LocalProjectProvider localProjectProvider, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new logEventInternal(closeAccountReviewActivity, closeAccountReviewActivity2, r10, localProjectProvider, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public AppMeasurementReceiver IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.AsMap.AsMapIterator asMapIterator, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, AbstractMultimap.C30091 r12) {
        return new AppMeasurementReceiver(closeAccountReviewActivity, closeAccountReviewActivity2, asMapIterator, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, r12);
    }

    @HmlSetNTBPinActivity
    public matchesAllOf MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, OnDeviceIdExtractor.C69651 r3, getFrontException getfrontexception) {
        return new matchesAllOf(closeAccountReviewActivity, closeAccountReviewActivity2, r3);
    }

    @HmlSetNTBPinActivity
    public negate write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, OnDeviceIdExtractor.C69651 r4, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new negate(closeAccountReviewActivity, closeAccountReviewActivity2, r4, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public fadeIn MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C6939a aVar) {
        return new fadeIn(closeAccountReviewActivity, closeAccountReviewActivity2, aVar);
    }

    @HmlSetNTBPinActivity
    public getInfoWindowAnchorV MediaDescriptionCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new getInfoWindowAnchorV(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public C5092on MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, FragmentBuilder_BindCloseAccountSelectionOwnFragment fragmentBuilder_BindCloseAccountSelectionOwnFragment) {
        return new C5092on(closeAccountReviewActivity, closeAccountReviewActivity2, fragmentBuilder_BindCloseAccountSelectionOwnFragment);
    }

    @HmlSetNTBPinActivity
    public skipNulls write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, FragmentBuilder_BindCloseAccountSelectionOwnFragment fragmentBuilder_BindCloseAccountSelectionOwnFragment, AbstractMapBasedMultiset.EntrySet.C30061 r5) {
        return new skipNulls(closeAccountReviewActivity, closeAccountReviewActivity2, fragmentBuilder_BindCloseAccountSelectionOwnFragment, r5);
    }

    @HmlSetNTBPinActivity
    public getTileProvider MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new getTileProvider(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public EnterVerificationCodeUseCase read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new EnterVerificationCodeUseCase(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public strokeJointType IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider.C70695 r4, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new strokeJointType(closeAccountReviewActivity, closeAccountReviewActivity2, r4, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public getLocalPort MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.MultisetView.EntrySet entrySet) {
        return new getLocalPort(closeAccountReviewActivity, closeAccountReviewActivity2, entrySet);
    }

    @HmlSetNTBPinActivity
    public getLocalAddress write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.KeySet keySet) {
        return new getLocalAddress(closeAccountReviewActivity, closeAccountReviewActivity2, keySet);
    }

    @HmlSetNTBPinActivity
    public Splitter.C38146 read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider localProjectProvider) {
        return new IndoorBuilding(closeAccountReviewActivity, closeAccountReviewActivity2, localProjectProvider) {
            private final LocalProjectProvider read;

            {
                this.read = r3;
            }

            public final DebitCardResetOtpActivity IconCompatParcelizer() {
                return write(this.read.MediaBrowserCompat$ItemReceiver("TRANSFER"));
            }
        };
    }

    @HmlSetNTBPinActivity
    public C4801in IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new C4801in(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public Splitter.C38114 IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, IdType idType) {
        return new IndoorBuilding(closeAccountReviewActivity, closeAccountReviewActivity2, idType) {
            private final IdType MediaBrowserCompat$CustomActionResultReceiver;

            {
                this.MediaBrowserCompat$CustomActionResultReceiver = r3;
            }

            public final DebitCardResetOtpActivity write(List<String> list) {
                if (list == null || list.isEmpty()) {
                    return write(DebitCardResetOtpActivity.just(Collections.emptyList()));
                }
                return write(this.MediaBrowserCompat$CustomActionResultReceiver.write().map(C38093.C38101.read).map(new DirectDebitDeepLinkActivity(list) {
                    private final /* synthetic */ List read;

                    {
                        this.read = r2;
                    }

                    public final Object write(Object obj) {
                        C38114 r0 = C38114.this;
                        List list = this.read;
                        show show = new show((List) obj);
                        return (List) new show(show.write, new getNextTransition(show.IconCompatParcelizer, new separatorStart(r0, list))).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
                            public final /* synthetic */ Object read() {
                                return new ArrayList();
                            }
                        }, new ensureAnimationInfo<List<T>, T>() {
                            public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
                                ((List) obj).add(obj2);
                            }
                        }));
                    }
                }));
            }
        };
    }

    @HmlSetNTBPinActivity
    public access$210 MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, getFrontException getfrontexception) {
        return new access$210(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, getfrontexception);
    }

    @HmlSetNTBPinActivity
    public Splitter.C38135 IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getDocument$MediaBrowserCompat$CustomActionResultReceiver getdocument_mediabrowsercompat_customactionresultreceiver) {
        return new IndoorBuilding(closeAccountReviewActivity, closeAccountReviewActivity2, getdocument_mediabrowsercompat_customactionresultreceiver) {
            private getDocument$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r3;
            }

            public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(chooseTableSize choosetablesize) {
                return write(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(choosetablesize));
            }
        };
    }

    @HmlSetNTBPinActivity
    public FatcaQuestionnaireCase IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r11, getAncestor getancestor, newLocalProjectProvider newlocalprojectprovider, LocalProjectProvider.C69353 r14) {
        return new FatcaQuestionnaireCase(closeAccountReviewActivity, closeAccountReviewActivity2, r11, newlocalprojectprovider, r14, getancestor);
    }

    @HmlSetNTBPinActivity
    public TextInputEditText MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider_Factory localProjectProvider_Factory) {
        return new TextInputEditText(closeAccountReviewActivity, closeAccountReviewActivity2, localProjectProvider_Factory);
    }

    @HmlSetNTBPinActivity
    public detect MediaMetadataCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new detect(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public onRebind IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r4) {
        return new onRebind(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public Detector RatingCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new Detector(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public addHole MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, LocalProjectProvider.C69386 r5) {
        return new addHole(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, r5);
    }

    @HmlSetNTBPinActivity
    public detectorIsOperational read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new detectorIsOperational(closeAccountReviewActivity, closeAccountReviewActivity2, r4, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public receiveFrame MediaBrowserCompat$SearchResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new receiveFrame(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public getGrayscaleImageData MediaSessionCompat$Token(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new getGrayscaleImageData(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public Detector.Detections MediaBrowserCompat$MediaItem(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new Detector.Detections(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public Frame.Builder MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new Frame.Builder(closeAccountReviewActivity, closeAccountReviewActivity2, r4, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public CameraSource.zza IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new CameraSource.zza(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public setAutoFocusEnabled IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r11, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, getAncestor getancestor, refreshIfEmpty refreshifempty) {
        return new setAutoFocusEnabled(closeAccountReviewActivity, closeAccountReviewActivity2, r11, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, getancestor, refreshifempty);
    }

    @HmlSetNTBPinActivity
    public PointOfInterest MediaBrowserCompat$SearchResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r4) {
        return new PointOfInterest(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public MultiDetector mo13501x50fd9e4a(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new MultiDetector(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public logEventInternalNoInterceptor MediaDescriptionCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r4) {
        return new logEventInternalNoInterceptor(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public receiveDetections ParcelableVolumeInfo(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new receiveDetections(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public CameraSource.ShutterCallback MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4, getFrontException getfrontexception) {
        return new CameraSource.ShutterCallback(closeAccountReviewActivity, closeAccountReviewActivity2, r4, getfrontexception);
    }

    @HmlSetNTBPinActivity
    public Frame.Metadata MediaSessionCompat$ResultReceiverWrapper(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new Frame.Metadata(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public onUnbind IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r3, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, keys keys) {
        return new onUnbind(closeAccountReviewActivity, closeAccountReviewActivity2, r3, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public getConditionalUserPropertiesAs read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r4, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new getConditionalUserPropertiesAs(closeAccountReviewActivity, closeAccountReviewActivity2, r4, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public MarkerOptions MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r4, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new MarkerOptions(closeAccountReviewActivity, closeAccountReviewActivity2, r4, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public C10869tileProvider write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r10, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, PassportExtractActivity passportExtractActivity) {
        return new C10869tileProvider(closeAccountReviewActivity, closeAccountReviewActivity2, r10, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, passportExtractActivity);
    }

    @HmlSetNTBPinActivity
    public ReviewInfoCase IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r4, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new ReviewInfoCase(closeAccountReviewActivity, closeAccountReviewActivity2, r4, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public getIsSmilingProbability MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider serverProjectProvider) {
        return new getIsSmilingProbability(closeAccountReviewActivity, closeAccountReviewActivity2, serverProjectProvider);
    }

    @HmlSetNTBPinActivity
    public TaskCompletionSource read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider serverProjectProvider) {
        return new TaskCompletionSource(closeAccountReviewActivity, closeAccountReviewActivity2, serverProjectProvider);
    }

    @HmlSetNTBPinActivity
    public setMaxGapFrames PlaybackStateCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new setMaxGapFrames(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public Barcode.UrlBookmark MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r4) {
        return new Barcode.UrlBookmark(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public Barcode.Email write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r4) {
        return new Barcode.Email(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public IndoorLevel IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, PassportCaptureModule_PassportOnDeviceExtractionServer_Factory passportCaptureModule_PassportOnDeviceExtractionServer_Factory) {
        return new IndoorLevel(closeAccountReviewActivity, closeAccountReviewActivity2, passportCaptureModule_PassportOnDeviceExtractionServer_Factory);
    }

    @HmlSetNTBPinActivity
    public selectFocus write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider.C706515 r4) {
        return new selectFocus(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public FinalizableReferenceQueue.DecoupledLoader MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider.C706515 r4) {
        return new FinalizableReferenceQueue.DecoupledLoader(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public newLoader IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider.C706515 r4) {
        return new newLoader(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public LatLng IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, PassportExtractActivity passportExtractActivity, LocalProjectProvider.C69386 r11, newLocalProjectProvider newlocalprojectprovider) {
        return new LatLng(closeAccountReviewActivity, closeAccountReviewActivity2, passportExtractActivity, r11, newlocalprojectprovider);
    }

    @HmlSetNTBPinActivity
    public whenAll IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider serverProjectProvider, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, getAncestor getancestor) {
        return new whenAll(closeAccountReviewActivity, closeAccountReviewActivity2, serverProjectProvider, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, getancestor);
    }

    @HmlSetNTBPinActivity
    public FinalizableWeakReference MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider.C706515 r4) {
        return new FinalizableWeakReference(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public getBaseUrl read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider.C706515 r4) {
        return new getBaseUrl(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public countIn read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getFrontException getfrontexception) {
        return new countIn(closeAccountReviewActivity, closeAccountReviewActivity2, getfrontexception);
    }

    @HmlSetNTBPinActivity
    public Barcode.Sms read(LocalProjectProvider.C69386 r2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new Barcode.Sms(r2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public CharMatcher.C31612 IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C7534ua uaVar) {
        return new IndoorBuilding(closeAccountReviewActivity, closeAccountReviewActivity2, uaVar) {
            private final C7534ua MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r3;
            }

            public final DebitCardResetOtpActivity<isLocationAvailable> MediaBrowserCompat$CustomActionResultReceiver(ForwardingMultimap forwardingMultimap) {
                return write(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(forwardingMultimap));
            }
        };
    }

    @HmlSetNTBPinActivity
    public geodesic IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, newLocalProjectProvider newlocalprojectprovider) {
        return new geodesic(closeAccountReviewActivity, closeAccountReviewActivity2, newlocalprojectprovider);
    }

    @HmlSetNTBPinActivity
    public PolylineOptions write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, newLocalProjectProvider newlocalprojectprovider, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new PolylineOptions(closeAccountReviewActivity, closeAccountReviewActivity2, newlocalprojectprovider, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public Polygon read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getVariantAsync getvariantasync) {
        return new Polygon(closeAccountReviewActivity, closeAccountReviewActivity2, getvariantasync);
    }

    @HmlSetNTBPinActivity
    public color read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, newLocalProjectProvider newlocalprojectprovider) {
        return new color(closeAccountReviewActivity, closeAccountReviewActivity2, newlocalprojectprovider);
    }

    @HmlSetNTBPinActivity
    public C10847jointType write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, newLocalProjectProvider newlocalprojectprovider) {
        return new C10847jointType(closeAccountReviewActivity, closeAccountReviewActivity2, newlocalprojectprovider);
    }

    @HmlSetNTBPinActivity
    public FinalizableReferenceQueue.DirectLoader MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r4) {
        return new FinalizableReferenceQueue.DirectLoader(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public addHandshakeCompletedListener write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, IIdExtractionResult iIdExtractionResult) {
        return new addHandshakeCompletedListener(closeAccountReviewActivity, closeAccountReviewActivity2, iIdExtractionResult);
    }

    @HmlSetNTBPinActivity
    public FaceDetector.Builder IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69353 r4) {
        return new FaceDetector.Builder(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public FaceDetector write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69353 r3) {
        return new FaceDetector(closeAccountReviewActivity, closeAccountReviewActivity2);
    }

    @HmlSetNTBPinActivity
    public setMode read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C7515tZ tZVar, LocalProjectProvider localProjectProvider, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, LocalProjectProvider.C69353 r14) {
        return new setMode(closeAccountReviewActivity, closeAccountReviewActivity2, tZVar, localProjectProvider, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, r14);
    }

    @HmlSetNTBPinActivity
    public setMinFaceSize read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69353 r4, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new setMinFaceSize(closeAccountReviewActivity, closeAccountReviewActivity2, r4, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public Face read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69353 r3) {
        return new Face(closeAccountReviewActivity, closeAccountReviewActivity2);
    }

    @HmlSetNTBPinActivity
    public ETBCheckIdentityCase MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69353 r4) {
        return new ETBCheckIdentityCase(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public setLandmarkType MediaBrowserCompat$MediaItem(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69353 r3) {
        return new setLandmarkType(closeAccountReviewActivity, closeAccountReviewActivity2);
    }

    @HmlSetNTBPinActivity
    public getIsRightEyeOpenProbability MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69353 r3) {
        return new getIsRightEyeOpenProbability(closeAccountReviewActivity, closeAccountReviewActivity2);
    }

    @HmlSetNTBPinActivity
    public C4939limit MediaSessionCompat$QueueItem(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new C4939limit(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public AbstractMapBasedMultiset.MapBasedElementSet write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new AbstractMapBasedMultiset.MapBasedElementSet(closeAccountReviewActivity, closeAccountReviewActivity2);
    }

    @HmlSetNTBPinActivity
    public PolygonOptions write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C6940b bVar) {
        return new PolygonOptions(closeAccountReviewActivity, closeAccountReviewActivity2, bVar);
    }

    @HmlSetNTBPinActivity
    public FaceDetectorV2Jni MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C6940b bVar) {
        return new FaceDetectorV2Jni(closeAccountReviewActivity, closeAccountReviewActivity2, bVar);
    }

    @HmlSetNTBPinActivity
    public detectFacesImageByteBufferJni IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C6940b bVar, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new detectFacesImageByteBufferJni(closeAccountReviewActivity, closeAccountReviewActivity2, bVar, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public LargestFaceFocusingProcessor.Builder MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2) {
        return new LargestFaceFocusingProcessor.Builder(closeAccountReviewActivity, closeAccountReviewActivity2);
    }

    @HmlSetNTBPinActivity
    public Splitter MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new Splitter(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public equalTo MediaBrowserCompat$SearchResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new equalTo(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public asList MediaMetadataCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new asList(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public forMap IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, FragmentBuilder_BindBaseInvestmentSuccessFragment fragmentBuilder_BindBaseInvestmentSuccessFragment, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new forMap(closeAccountReviewActivity, closeAccountReviewActivity2, fragmentBuilder_BindBaseInvestmentSuccessFragment, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public AbstractMapBasedMultiset read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getRegionName getregionname) {
        return new AbstractMapBasedMultiset(closeAccountReviewActivity, closeAccountReviewActivity2, getregionname);
    }

    @HmlSetNTBPinActivity
    public createKeySet MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getRegionName getregionname) {
        return new createKeySet(closeAccountReviewActivity, closeAccountReviewActivity2, getregionname);
    }

    @HmlSetNTBPinActivity
    public createAsMap write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getRegionName getregionname) {
        return new createAsMap(closeAccountReviewActivity, closeAccountReviewActivity2, getregionname);
    }

    @HmlSetNTBPinActivity
    public onPattern Keep(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new onPattern(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public endCap MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, LocalProjectProvider localProjectProvider) {
        return new endCap(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, localProjectProvider);
    }

    @HmlSetNTBPinActivity
    public split MediaSessionCompat$Token(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new split(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public separatorEnd write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C10887sdkVersion sdkversion, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, AbstractMultimap.C30091 r12) {
        return new separatorEnd(closeAccountReviewActivity, closeAccountReviewActivity2, sdkversion, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, r12);
    }

    @HmlSetNTBPinActivity
    public NativeFaceDetectorV2Impl write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ForgotPinRepositoryContractor forgotPinRepositoryContractor) {
        return new NativeFaceDetectorV2Impl(closeAccountReviewActivity, closeAccountReviewActivity2, forgotPinRepositoryContractor);
    }

    @HmlSetNTBPinActivity
    public LargestFaceFocusingProcessor MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C7514tY tYVar, ForgotPinRepositoryContractor forgotPinRepositoryContractor) {
        return new LargestFaceFocusingProcessor(closeAccountReviewActivity, closeAccountReviewActivity2, tYVar);
    }

    @HmlSetNTBPinActivity
    public validateModelFilesJni read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C7514tY tYVar, ForgotPinRepositoryContractor forgotPinRepositoryContractor) {
        return new validateModelFilesJni(closeAccountReviewActivity, closeAccountReviewActivity2, tYVar);
    }

    @HmlSetNTBPinActivity
    public NativeFaceDetectorImpl MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ForgotPinRepositoryContractor forgotPinRepositoryContractor, keys keys, C7514tY tYVar) {
        return new NativeFaceDetectorImpl(closeAccountReviewActivity, closeAccountReviewActivity2, keys, tYVar);
    }

    @HmlSetNTBPinActivity
    public Landmark write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ForgotPinRepositoryContractor forgotPinRepositoryContractor, keys keys, C7514tY tYVar) {
        return new Landmark(closeAccountReviewActivity, closeAccountReviewActivity2, keys, tYVar);
    }

    @HmlSetNTBPinActivity
    public AbstractBiMap MediaSessionCompat$ResultReceiverWrapper(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new AbstractBiMap(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Finalizer.ShutDown mo13500x50fd9e4a(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new Finalizer.ShutDown(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public access$600 RatingCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new access$600(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public CameraSource.zze MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new CameraSource.zze(closeAccountReviewActivity, closeAccountReviewActivity2, r4, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public setTimestampMillis MediaBrowserCompat$MediaItem(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        return new setTimestampMillis(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public FocusingProcessor MediaSessionCompat$QueueItem(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new FocusingProcessor(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public getRootCause write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver, AbstractMultimap.Entries entries) {
        return new getRootCause(closeAccountReviewActivity, closeAccountReviewActivity2, fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver);
    }

    @HmlSetNTBPinActivity
    public memoize MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, setCvv setcvv, newOnDeviceIdExtractor newondeviceidextractor) {
        return new memoize(getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, setcvv, newondeviceidextractor, closeAccountReviewActivity, closeAccountReviewActivity2);
    }

    @HmlSetNTBPinActivity
    public nullToEmpty write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver) {
        return new nullToEmpty(closeAccountReviewActivity, closeAccountReviewActivity2, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver);
    }

    @HmlSetNTBPinActivity
    public getCausalChain MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, keys keys, C7514tY tYVar, C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver, AbstractMultimap.Entries entries) {
        return new getCausalChain(closeAccountReviewActivity, closeAccountReviewActivity2, keys, tYVar);
    }

    @HmlSetNTBPinActivity
    public Suppliers.ThreadSafeSupplier MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, keys keys, C7514tY tYVar, C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver, AbstractMultimap.Entries entries) {
        return new Suppliers.ThreadSafeSupplier(closeAccountReviewActivity, closeAccountReviewActivity2, keys, tYVar);
    }

    @HmlSetNTBPinActivity
    public memoizeWithExpiration MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver) {
        return new memoizeWithExpiration(closeAccountReviewActivity, closeAccountReviewActivity2);
    }

    @HmlSetNTBPinActivity
    public Suppliers.SupplierFunction MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C7514tY tYVar, C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver, setCvv setcvv, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, newOnDeviceIdExtractor newondeviceidextractor, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        return new Suppliers.SupplierFunction(tYVar, fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver, setcvv, closeAccountReviewActivity, closeAccountReviewActivity2, newondeviceidextractor, str);
    }

    @HmlSetNTBPinActivity
    public setInverse MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver, C7514tY tYVar) {
        return new setInverse(closeAccountReviewActivity, closeAccountReviewActivity2, fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver, tYVar);
    }

    @HmlSetNTBPinActivity
    public setDelegates IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.C30091 r4) {
        return new setDelegates(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public delegate MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver, setCvv setcvv, newOnDeviceIdExtractor newondeviceidextractor, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        return new delegate(closeAccountReviewActivity, closeAccountReviewActivity2, fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver, setcvv, newondeviceidextractor, str);
    }

    @HmlSetNTBPinActivity
    public Splitter.C38051.C38061 read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C7514tY tYVar, C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver) {
        return new LatLngBounds.Builder(closeAccountReviewActivity, closeAccountReviewActivity2, tYVar, fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver) {
            final C6548x820c5aab MediaBrowserCompat$CustomActionResultReceiver;

            {
                this.MediaBrowserCompat$CustomActionResultReceiver = r4;
            }

            public final void MediaBrowserCompat$ItemReceiver(boolean z, String str, String str2) {
                if (z) {
                    write(this.IconCompatParcelizer.write(str).map(new DirectDebitDeepLinkActivity(str, str2) {
                        private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
                        private final /* synthetic */ String write;

                        {
                            this.MediaBrowserCompat$CustomActionResultReceiver = r2;
                            this.write = r3;
                        }

                        public final Object write(Object obj) {
                            return new onMarkerDragStart("ATM", this.MediaBrowserCompat$CustomActionResultReceiver, (String) null, (String) null, Splitter.C38051.C38061.this.write(this.write), ((PlaceBuffer) obj).read);
                        }
                    }).flatMap(new Predicates.CompositionPredicate(this.MediaBrowserCompat$CustomActionResultReceiver)));
                } else {
                    write(this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver().flatMap(new Predicates.OrPredicate(this, str, str2)));
                }
            }
        };
    }

    @HmlSetNTBPinActivity
    public sendUrgentData IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, elementSet elementset) {
        return new sendUrgentData(closeAccountReviewActivity, closeAccountReviewActivity2, elementset);
    }

    @HmlSetNTBPinActivity
    public CharMatcher.C3167Or MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, OnDeviceIdExtractor.C6966a.C69693 r4) {
        return new CharMatcher.C3167Or(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public createCollection IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6897xeb950f47 hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver) {
        return new createCollection(closeAccountReviewActivity, closeAccountReviewActivity2, hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver);
    }

    @HmlSetNTBPinActivity
    public AbstractLinkedIterator write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6897xeb950f47 hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver) {
        return new AbstractLinkedIterator(closeAccountReviewActivity, closeAccountReviewActivity2, hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver);
    }

    @HmlSetNTBPinActivity
    public Detector.Processor MediaDescriptionCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new Detector.Processor(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public setHintEnabled RatingCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6897xeb950f47 hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver) {
        return new setHintEnabled(closeAccountReviewActivity, closeAccountReviewActivity2, hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver);
    }

    @HmlSetNTBPinActivity
    public replaceValues MediaMetadataCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6897xeb950f47 hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver) {
        return new replaceValues(closeAccountReviewActivity, closeAccountReviewActivity2, hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver);
    }

    @HmlSetNTBPinActivity
    public asMap MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6897xeb950f47 hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver) {
        return new asMap(closeAccountReviewActivity, closeAccountReviewActivity2, hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver);
    }

    @HmlSetNTBPinActivity
    public setErrorTextColor MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6897xeb950f47 hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver) {
        return new setErrorTextColor(closeAccountReviewActivity, closeAccountReviewActivity2, hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver);
    }

    @HmlSetNTBPinActivity
    public setPasswordVisibilityToggleContentDescription read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6897xeb950f47 hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver) {
        return new setPasswordVisibilityToggleContentDescription(closeAccountReviewActivity, closeAccountReviewActivity2, hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver);
    }

    @HmlSetNTBPinActivity
    public TransformationChildLayout MediaBrowserCompat$SearchResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6897xeb950f47 hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver) {
        return new TransformationChildLayout(closeAccountReviewActivity, closeAccountReviewActivity2, hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver);
    }

    @HmlSetNTBPinActivity
    public InstallException MediaBrowserCompat$MediaItem(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C6897xeb950f47 hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver) {
        return new InstallException(closeAccountReviewActivity, closeAccountReviewActivity2, hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver);
    }

    @HmlSetNTBPinActivity
    public INativeImageLabeler IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getAncestor getancestor) {
        return new INativeImageLabeler(closeAccountReviewActivity, closeAccountReviewActivity2, getancestor);
    }

    @HmlSetNTBPinActivity
    public setExpandedTitleMargin read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getAncestor getancestor, refreshIfEmpty refreshifempty) {
        return new setExpandedTitleMargin(closeAccountReviewActivity, closeAccountReviewActivity2, getancestor, refreshifempty);
    }

    @HmlSetNTBPinActivity
    public LabelOptions MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getAncestor getancestor, refreshIfEmpty refreshifempty) {
        return new LabelOptions(closeAccountReviewActivity, closeAccountReviewActivity2, getancestor, refreshifempty);
    }

    @HmlSetNTBPinActivity
    public setFabCradleRoundedCornerRadius MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getAncestor getancestor, refreshIfEmpty refreshifempty) {
        return new setFabCradleRoundedCornerRadius(closeAccountReviewActivity, closeAccountReviewActivity2, getancestor, refreshifempty);
    }

    @HmlSetNTBPinActivity
    public onPreviewFrame MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new onPreviewFrame(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public getKeepAlive MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, classification classification) {
        return new getKeepAlive(closeAccountReviewActivity, closeAccountReviewActivity2, classification);
    }

    @HmlSetNTBPinActivity
    public onPictureTaken read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new onPictureTaken(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public CameraSource.PictureCallback MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new CameraSource.PictureCallback(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public CameraSource.zzd write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        return new CameraSource.zzd(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public Functions write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider.C70729 r4) {
        return new Functions(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public NativeFaceSettings read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, tailSet tailset) {
        return new NativeFaceSettings(closeAccountReviewActivity, closeAccountReviewActivity2, tailset);
    }

    @HmlSetNTBPinActivity
    public alwaysFalse write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AsynchronousComputationException asynchronousComputationException) {
        return new alwaysFalse(closeAccountReviewActivity, closeAccountReviewActivity2, asynchronousComputationException);
    }

    @HmlSetNTBPinActivity
    public AbstractBiMap.EntrySet.C29881 write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultiset abstractMultiset) {
        return new IndoorBuilding(closeAccountReviewActivity, closeAccountReviewActivity2, abstractMultiset) {
            public final AbstractMultiset MediaBrowserCompat$CustomActionResultReceiver;

            {
                onGetStartedClick.write((Object) r2, "subscriberOn");
                onGetStartedClick.write((Object) r3, "observerOn");
                onGetStartedClick.write((Object) r4, "remittanceRepositoryContractor");
                this.MediaBrowserCompat$CustomActionResultReceiver = r4;
            }
        };
    }

    @HmlSetNTBPinActivity
    public AbstractIterator.C30031 IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultiset abstractMultiset) {
        return new IndoorBuilding(closeAccountReviewActivity, closeAccountReviewActivity2, abstractMultiset) {
            public final AbstractMultiset MediaBrowserCompat$ItemReceiver;

            {
                onGetStartedClick.write((Object) r2, "subscriberOn");
                onGetStartedClick.write((Object) r3, "observerOn");
                onGetStartedClick.write((Object) r4, "remittanceRepositoryContractor");
                this.MediaBrowserCompat$ItemReceiver = r4;
            }
        };
    }

    @HmlSetNTBPinActivity
    public AbstractBiMap.KeySet.C29911 read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultiset abstractMultiset) {
        return new frequency<zzuk, AbstractBiMap.KeySet.C29911.write>(closeAccountReviewActivity, closeAccountReviewActivity2, abstractMultiset) {
            {
                onGetStartedClick.write((Object) r2, "subscriberOn");
                onGetStartedClick.write((Object) r3, "observerOn");
                onGetStartedClick.write((Object) r4, "repository");
            }

            /* renamed from: o.AbstractBiMap$KeySet$1$write */
            public static final class write implements C4602xca7af99c {
                final findSubmapIndex IconCompatParcelizer;

                public write(findSubmapIndex findsubmapindex) {
                    onGetStartedClick.write((Object) findsubmapindex, "request");
                    this.IconCompatParcelizer = findsubmapindex;
                }
            }
        };
    }

    @HmlSetNTBPinActivity
    public readResolve MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultiset abstractMultiset) {
        return new readResolve(closeAccountReviewActivity, closeAccountReviewActivity2, abstractMultiset);
    }

    @HmlSetNTBPinActivity
    public iterable MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getDelegateIterator getdelegateiterator) {
        return new iterable(closeAccountReviewActivity, closeAccountReviewActivity2, getdelegateiterator);
    }

    @HmlSetNTBPinActivity
    public alwaysTrue read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractSortedSetMultimap abstractSortedSetMultimap) {
        return new alwaysTrue(closeAccountReviewActivity, closeAccountReviewActivity2, abstractSortedSetMultimap);
    }

    @HmlSetNTBPinActivity
    public waitForAccessTokenRefresh write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.RandomAccessWrappedList randomAccessWrappedList) {
        return new waitForAccessTokenRefresh(closeAccountReviewActivity, closeAccountReviewActivity2, randomAccessWrappedList);
    }

    @HmlSetNTBPinActivity
    public defensiveCopy read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ArrayListMultimap arrayListMultimap) {
        return new defensiveCopy(closeAccountReviewActivity, closeAccountReviewActivity2, arrayListMultimap);
    }

    @HmlSetNTBPinActivity
    public SignInOptions.zaa MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.RandomAccessWrappedList randomAccessWrappedList) {
        return new SignInOptions.zaa(closeAccountReviewActivity, closeAccountReviewActivity2, randomAccessWrappedList);
    }

    @HmlSetNTBPinActivity
    public containsPattern read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r4) {
        return new containsPattern(closeAccountReviewActivity, closeAccountReviewActivity2, r4);
    }

    @HmlSetNTBPinActivity
    public C4809is IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.WrappedList wrappedList) {
        return new C4809is(closeAccountReviewActivity, closeAccountReviewActivity2, wrappedList);
    }

    @HmlSetNTBPinActivity
    public Splitter.AbstractIterator MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getDocument$MediaBrowserCompat$CustomActionResultReceiver getdocument_mediabrowsercompat_customactionresultreceiver) {
        return new Splitter.AbstractIterator(closeAccountReviewActivity, closeAccountReviewActivity2, getdocument_mediabrowsercompat_customactionresultreceiver);
    }

    @HmlSetNTBPinActivity
    public endOfData MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getDocument$MediaBrowserCompat$CustomActionResultReceiver getdocument_mediabrowsercompat_customactionresultreceiver) {
        return new endOfData(closeAccountReviewActivity, closeAccountReviewActivity2, getdocument_mediabrowsercompat_customactionresultreceiver);
    }

    @HmlSetNTBPinActivity
    public setBoxBackgroundColorResource write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, addToMap addtomap) {
        return new setBoxBackgroundColorResource(closeAccountReviewActivity, closeAccountReviewActivity2, addtomap);
    }

    @HmlSetNTBPinActivity
    public orientation IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, OnDeviceIdExtractor.C6966a aVar) {
        return new orientation(closeAccountReviewActivity, closeAccountReviewActivity2, aVar);
    }

    @HmlSetNTBPinActivity
    public trySetException MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, firstKey firstkey) {
        return new trySetException(closeAccountReviewActivity, closeAccountReviewActivity2, firstkey);
    }

    @HmlSetNTBPinActivity
    public Tasks.zza MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, readVersion readversion) {
        return new Tasks.zza(closeAccountReviewActivity, closeAccountReviewActivity2, readversion);
    }

    @HmlSetNTBPinActivity
    public trimFrom MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, validateIterator validateiterator) {
        return new trimFrom(closeAccountReviewActivity, closeAccountReviewActivity2, validateiterator);
    }

    @HmlSetNTBPinActivity
    public forResult IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider localProjectProvider) {
        return new forResult(closeAccountReviewActivity, closeAccountReviewActivity2, localProjectProvider);
    }

    @HmlSetNTBPinActivity
    public infoWindowAnchor IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getFrontException getfrontexception, getBundleVersion getbundleversion) {
        return new infoWindowAnchor(closeAccountReviewActivity, closeAccountReviewActivity2, getfrontexception, getbundleversion);
    }

    @HmlSetNTBPinActivity
    public getUnknownKeys read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C7514tY tYVar) {
        return new getUnknownKeys(closeAccountReviewActivity, closeAccountReviewActivity2, tYVar);
    }
}
