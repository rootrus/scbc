package com.google.gson;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import com.thunderhead.android.infrastructure.server.entitys.AttributeData;
import com.thunderhead.android.infrastructure.server.entitys.Captures;
import com.thunderhead.android.infrastructure.server.entitys.ContentImage;
import com.thunderhead.android.infrastructure.server.entitys.DeviceInfo;
import com.thunderhead.android.infrastructure.server.entitys.InteractionData;
import com.thunderhead.android.infrastructure.server.entitys.OptimizationActions;
import com.thunderhead.android.infrastructure.server.entitys.Optimizations;
import com.thunderhead.android.infrastructure.server.entitys.TrackingPointData;
import com.thunderhead.android.infrastructure.server.entitys.Viewpoint;
import com.thunderhead.android.infrastructure.server.requests.PropertiesRequest;
import com.thunderhead.android.infrastructure.server.responses.InteractionRegionErrorResponse;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p040o.AdvertisingIdClient;
import p040o.C1251R;
import p040o.CrashlyticsReport;
import p040o.GoogleMap;
import p040o.HmlNTBLoanReviewActivity;
import p040o.StreetViewPanoramaView;
import p040o.SupportMapFragment;
import p040o.SupportStreetViewPanoramaFragment;
import p040o.writeToParcel;
import p040o.zzag;
import p040o.zzbt;
import p040o.zzby;
import p040o.zzvm;
import p040o.zzxc;

public class Gson {
    public static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    public static final boolean DEFAULT_ESCAPE_HTML = true;
    public static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    public static final boolean DEFAULT_LENIENT = false;
    public static final boolean DEFAULT_PRETTY_PRINT = false;
    public static final boolean DEFAULT_SERIALIZE_NULLS = false;
    public static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    public static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    public static final TypeToken<?> NULL_KEY_SURROGATE = TypeToken.get(Object.class);
    public final List<TypeAdapterFactory> builderFactories;
    public final List<TypeAdapterFactory> builderHierarchyFactories;
    public final ThreadLocal<Map<TypeToken<?>, FutureTypeAdapter<?>>> calls;
    public final boolean complexMapKeySerialization;
    public final ConstructorConstructor constructorConstructor;
    public final String datePattern;
    public final int dateStyle;
    public final Excluder excluder;
    public final List<TypeAdapterFactory> factories;
    public final FieldNamingStrategy fieldNamingStrategy;
    public final boolean generateNonExecutableJson;
    public final boolean htmlSafe;
    public final Map<Type, InstanceCreator<?>> instanceCreators;
    public final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    public final boolean lenient;
    public final LongSerializationPolicy longSerializationPolicy;
    public final boolean prettyPrinting;
    public final boolean serializeNulls;
    public final boolean serializeSpecialFloatingPointValues;
    public final int timeStyle;
    public final Map<TypeToken<?>, TypeAdapter<?>> typeTokenCache;

    public Gson() {
        this(Excluder.DEFAULT, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    Gson(Excluder excluder2, FieldNamingStrategy fieldNamingStrategy2, Map<Type, InstanceCreator<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy2, String str, int i, int i2, List<TypeAdapterFactory> list, List<TypeAdapterFactory> list2, List<TypeAdapterFactory> list3) {
        boolean z8 = z7;
        ArrayList arrayList = new ArrayList(list3);
        arrayList.add(new TypeAdapterFactory() {
            private static final mergeDAGs MediaBrowserCompat$CustomActionResultReceiver = new mergeDAGs();
            private static final calcOrder read = new calcOrder();

            public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (gson.fieldNamingStrategy != FieldNamingPolicy.IDENTITY || !gson.excluder.serializationStrategies.isEmpty() || !gson.excluder.deserializationStrategies.isEmpty()) {
                    return null;
                }
                if (zzvm.write.class.isAssignableFrom(typeToken.getRawType())) {
                    return new zzvv(read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == AttributeData.class) {
                    return new C6463xf6ca510b(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzvm.class) {
                    return new zzvw(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == removeUpdateListener.class) {
                    return new removeAllLottieOnCompositionLoadedListener(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == PlacePhotoMetadataResult.class) {
                    return new PlaceLikelihoodBufferResponse(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == PropertiesRequest.class) {
                    return new BaseChangePinActivity_ViewBinding(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzvj.class) {
                    return new zzuz(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzwi.class) {
                    return new zzwz(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzrm.class) {
                    return new zzuv(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == FragmentBuilder_BindPurchaseProfileManagementFragment.class) {
                    return new FragmentBuilder_BindRemittanceCountrySelectionFragment(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzwo.class) {
                    return new zzwv(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == BindDrawable.class) {
                    return new BindString(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == isRotationIdentity.class) {
                    return new parseShapeData(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == OptimizationActions.class) {
                    return new SCBFcmMessagingService(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzws.class) {
                    return new zzwx(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == DependencyException.class) {
                    return new DependencyCycleException(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == CrashlyticsReport.Session.Event.Log.Builder.class) {
                    return new CrashlyticsReportJsonTransform(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == GlideException.class) {
                    return new SupportRequestManagerFragment(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == GoogleMap.OnMapClickListener.class) {
                    return new onInfoWindowClose(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == PlaceReport.class) {
                    return new PlacePhotoResult(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == AdvertisingIdClient.Info.class) {
                    return new getBoolean(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == isSet.class) {
                    return new getHandlers(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == setEndedAt.class) {
                    return new getUser(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == createResultAndNotify.class) {
                    return new matches(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == BindBitmap.class) {
                    return new BindInt(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == StreetViewPanoramaView.zzb.class) {
                    return new SupportMapFragment.zzb(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == setFontAssetDelegate.class) {
                    return new setImageAssetsFolder(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == BindColor.class) {
                    return new BindFloat(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzur.class) {
                    return new zzuy(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == canonicalize.class) {
                    return new DeepLinkResult(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == Viewpoint.class) {
                    return new BaseActivity_ViewBinding(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == InteractionRegionErrorResponse.class) {
                    return new BasePartialSearchActivity(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == FragmentBuilder_BindHmlOutcomeRejectFragment.class) {
                    return new FragmentBuilder_BindHowToAddAccountFragment(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == AutoValue_CrashlyticsReport_Session.class) {
                    return new getDevice(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == HmlNTBLoanReviewActivity.read.class) {
                    return new HmlNTBPersonalInfoActivity(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == OptimizationActions.Action.Asset.Response.class) {
                    return new ManageEmailInputPresenter(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == Optimizations.class) {
                    return new BaseActivity(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzun.class) {
                    return new zzut(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzag.zza.class) {
                    return new zzbt.zzb(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (getGeoDataClient.class.isAssignableFrom(typeToken.getRawType())) {
                    return new getPhotoMetadata(read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == getOpacityAtPosition.class) {
                    return new FontParser(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == setIndicatorSmart.class) {
                    return new RequestManagerFragment(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == ContentImage.class) {
                    return new UpdateEmailUseCase$Error3000(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzwl.class) {
                    return new zzwy(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == TrackingPointData.class) {
                    return new lambda$showInAppDownloaded$0$BaseActivity(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == writeToParcel.write.class) {
                    return new LottieComposition(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzuk.class) {
                    return new zzuq(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzby.zzb.zza.class) {
                    return new zzby.zza.C10762zza(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == ECouponCommonActivity.class) {
                    return new ConfirmRedemptionActivity_ViewBinding(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == decodeHexDigit.class) {
                    return new C1307error(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == setCurrentItemInternal.class) {
                    return new setScrollState(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (zzvm$MediaBrowserCompat$CustomActionResultReceiver.class.isAssignableFrom(typeToken.getRawType())) {
                    return new zzwa(read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzvf.class) {
                    return new zzva(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder.class) {
                    return new CrashlyticsReport.Type(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == Captures.class) {
                    return new ETBCheckIdentityCase$ErrorCode3013Exception(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzrp.class) {
                    return new zzru(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzup.class) {
                    return new zzuw(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == AnimatableValueParser.class) {
                    return new DocumentDataParser(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == KeyframeParser.class) {
                    return new JsonUtils(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == setEvents.class) {
                    return new getGeneratorType(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == HmlNTBConsentActivity.class) {
                    return new HmlMailingAddressActivity(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == getLikelihood.class) {
                    return new PlacePhotoMetadata(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == SupportStreetViewPanoramaFragment.zza.class) {
                    return new SupportMapFragment.zza(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzrz.class) {
                    return new zzrv(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzwm.class) {
                    return new zzwr(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == setBearing.class) {
                    return new getBearing(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzxc.class) {
                    return new zzxc.zza(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == C1251R.color.class) {
                    return new getMethod(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == setEndFrames.class) {
                    return new GradientStrokeParser(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == jsonObjectToPoint.class) {
                    return new FontCharacterParser(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == DeviceInfo.class) {
                    return new PresenterModule(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == zzwu.class) {
                    return new zzww(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == InteractionData.class) {
                    return new NsipPartnerPaymentConfirmCase$NsipConfirmException(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == isRestrictedToPlacesOpenNow.class) {
                    return new getMaxHeight(gson, read, MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (typeToken.getRawType() == writeToParcel.class) {
                    return 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x056b: RETURN  
                          (wrap: o.LottieAnimationView$SavedState$1 : 0x0568: CONSTRUCTOR  (r4v50 o.LottieAnimationView$SavedState$1) = 
                          (r3v0 'gson' com.google.gson.Gson)
                          (wrap: o.calcOrder : 0x0564: SGET  (r0v183 o.calcOrder) =  o.ScriptGroup.Builder.1.read o.calcOrder)
                          (wrap: o.mergeDAGs : 0x0566: SGET  (r1v169 o.mergeDAGs) =  o.ScriptGroup.Builder.1.MediaBrowserCompat$CustomActionResultReceiver o.mergeDAGs)
                         call: o.LottieAnimationView.SavedState.1.<init>(com.google.gson.Gson, o.validateCycle, o.validateDAGRecurse):void type: CONSTRUCTOR)
                         in method: o.ScriptGroup.Builder.1.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter<T>, dex: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0568: CONSTRUCTOR  (r4v50 o.LottieAnimationView$SavedState$1) = 
                          (r3v0 'gson' com.google.gson.Gson)
                          (wrap: o.calcOrder : 0x0564: SGET  (r0v183 o.calcOrder) =  o.ScriptGroup.Builder.1.read o.calcOrder)
                          (wrap: o.mergeDAGs : 0x0566: SGET  (r1v169 o.mergeDAGs) =  o.ScriptGroup.Builder.1.MediaBrowserCompat$CustomActionResultReceiver o.mergeDAGs)
                         call: o.LottieAnimationView.SavedState.1.<init>(com.google.gson.Gson, o.validateCycle, o.validateDAGRecurse):void type: CONSTRUCTOR in method: o.ScriptGroup.Builder.1.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter<T>, dex: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 368 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.LottieAnimationView, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:260)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:606)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	... 372 more
                        */
                    /*
                        this = this;
                        com.google.gson.FieldNamingStrategy r0 = r3.fieldNamingStrategy
                        com.google.gson.FieldNamingPolicy r1 = com.google.gson.FieldNamingPolicy.IDENTITY
                        if (r0 != r1) goto L_0x08d4
                        com.google.gson.internal.Excluder r0 = r3.excluder
                        java.util.List<com.google.gson.ExclusionStrategy> r0 = r0.serializationStrategies
                        boolean r0 = r0.isEmpty()
                        if (r0 == 0) goto L_0x08d4
                        com.google.gson.internal.Excluder r0 = r3.excluder
                        java.util.List<com.google.gson.ExclusionStrategy> r0 = r0.deserializationStrategies
                        boolean r0 = r0.isEmpty()
                        if (r0 == 0) goto L_0x08d4
                        java.lang.Class<o.zzvm$write> r0 = p040o.zzvm.write.class
                        java.lang.Class r1 = r4.getRawType()
                        boolean r0 = r0.isAssignableFrom(r1)
                        if (r0 == 0) goto L_0x0030
                        o.zzvv r3 = new o.zzvv
                        o.calcOrder r4 = read
                        o.mergeDAGs r0 = MediaBrowserCompat$CustomActionResultReceiver
                        r3.<init>(r4, r0)
                        return r3
                    L_0x0030:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.AttributeData> r1 = com.thunderhead.android.infrastructure.server.entitys.AttributeData.class
                        if (r0 != r1) goto L_0x0042
                        o.EnterVerificationCodeUseCase$EmailMeVerificationCodeNeededException r4 = new o.EnterVerificationCodeUseCase$EmailMeVerificationCodeNeededException
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0042:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzvm> r1 = p040o.zzvm.class
                        if (r0 != r1) goto L_0x0054
                        o.zzvw r4 = new o.zzvw
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0054:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.removeUpdateListener> r1 = p040o.removeUpdateListener.class
                        if (r0 != r1) goto L_0x0066
                        o.removeAllLottieOnCompositionLoadedListener r4 = new o.removeAllLottieOnCompositionLoadedListener
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0066:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.PlacePhotoMetadataResult> r1 = p040o.PlacePhotoMetadataResult.class
                        if (r0 != r1) goto L_0x0078
                        o.PlaceLikelihoodBufferResponse r4 = new o.PlaceLikelihoodBufferResponse
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0078:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.requests.PropertiesRequest> r1 = com.thunderhead.android.infrastructure.server.requests.PropertiesRequest.class
                        if (r0 != r1) goto L_0x008a
                        o.BaseChangePinActivity_ViewBinding r4 = new o.BaseChangePinActivity_ViewBinding
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x008a:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzvj> r1 = p040o.zzvj.class
                        if (r0 != r1) goto L_0x009c
                        o.zzuz r4 = new o.zzuz
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x009c:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzwi> r1 = p040o.zzwi.class
                        if (r0 != r1) goto L_0x00ae
                        o.zzwz r4 = new o.zzwz
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x00ae:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzrm> r1 = p040o.zzrm.class
                        if (r0 != r1) goto L_0x00c0
                        o.zzuv r4 = new o.zzuv
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x00c0:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.FragmentBuilder_BindPurchaseProfileManagementFragment> r1 = p040o.FragmentBuilder_BindPurchaseProfileManagementFragment.class
                        if (r0 != r1) goto L_0x00d2
                        o.FragmentBuilder_BindRemittanceCountrySelectionFragment r4 = new o.FragmentBuilder_BindRemittanceCountrySelectionFragment
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x00d2:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzwo> r1 = p040o.zzwo.class
                        if (r0 != r1) goto L_0x00e4
                        o.zzwv r4 = new o.zzwv
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x00e4:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.BindDrawable> r1 = p040o.BindDrawable.class
                        if (r0 != r1) goto L_0x00f6
                        o.BindString r4 = new o.BindString
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x00f6:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.isRotationIdentity> r1 = p040o.isRotationIdentity.class
                        if (r0 != r1) goto L_0x0108
                        o.parseShapeData r4 = new o.parseShapeData
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0108:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.OptimizationActions> r1 = com.thunderhead.android.infrastructure.server.entitys.OptimizationActions.class
                        if (r0 != r1) goto L_0x011a
                        o.SCBFcmMessagingService r4 = new o.SCBFcmMessagingService
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x011a:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzws> r1 = p040o.zzws.class
                        if (r0 != r1) goto L_0x012c
                        o.zzwx r4 = new o.zzwx
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x012c:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.DependencyException> r1 = p040o.DependencyException.class
                        if (r0 != r1) goto L_0x013e
                        o.DependencyCycleException r4 = new o.DependencyCycleException
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x013e:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.CrashlyticsReport$Session$Event$Log$Builder> r1 = p040o.CrashlyticsReport.Session.Event.Log.Builder.class
                        if (r0 != r1) goto L_0x0150
                        o.CrashlyticsReportJsonTransform r4 = new o.CrashlyticsReportJsonTransform
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0150:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.GlideException> r1 = p040o.GlideException.class
                        if (r0 != r1) goto L_0x0162
                        o.SupportRequestManagerFragment r4 = new o.SupportRequestManagerFragment
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0162:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.GoogleMap$OnMapClickListener> r1 = p040o.GoogleMap.OnMapClickListener.class
                        if (r0 != r1) goto L_0x0174
                        o.onInfoWindowClose r4 = new o.onInfoWindowClose
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0174:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.PlaceReport> r1 = p040o.PlaceReport.class
                        if (r0 != r1) goto L_0x0186
                        o.PlacePhotoResult r4 = new o.PlacePhotoResult
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0186:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.AdvertisingIdClient$Info> r1 = p040o.AdvertisingIdClient.Info.class
                        if (r0 != r1) goto L_0x0198
                        o.getBoolean r4 = new o.getBoolean
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0198:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.isSet> r1 = p040o.isSet.class
                        if (r0 != r1) goto L_0x01aa
                        o.getHandlers r4 = new o.getHandlers
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x01aa:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.setEndedAt> r1 = p040o.setEndedAt.class
                        if (r0 != r1) goto L_0x01bc
                        o.getUser r4 = new o.getUser
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x01bc:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.createResultAndNotify> r1 = p040o.createResultAndNotify.class
                        if (r0 != r1) goto L_0x01ce
                        o.matches r4 = new o.matches
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x01ce:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.BindBitmap> r1 = p040o.BindBitmap.class
                        if (r0 != r1) goto L_0x01e0
                        o.BindInt r4 = new o.BindInt
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x01e0:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.StreetViewPanoramaView$zzb> r1 = p040o.StreetViewPanoramaView.zzb.class
                        if (r0 != r1) goto L_0x01f2
                        o.SupportMapFragment$zzb r4 = new o.SupportMapFragment$zzb
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x01f2:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.setFontAssetDelegate> r1 = p040o.setFontAssetDelegate.class
                        if (r0 != r1) goto L_0x0204
                        o.setImageAssetsFolder r4 = new o.setImageAssetsFolder
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0204:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.BindColor> r1 = p040o.BindColor.class
                        if (r0 != r1) goto L_0x0216
                        o.BindFloat r4 = new o.BindFloat
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0216:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzur> r1 = p040o.zzur.class
                        if (r0 != r1) goto L_0x0228
                        o.zzuy r4 = new o.zzuy
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0228:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.canonicalize> r1 = p040o.canonicalize.class
                        if (r0 != r1) goto L_0x023a
                        o.DeepLinkResult r4 = new o.DeepLinkResult
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x023a:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.Viewpoint> r1 = com.thunderhead.android.infrastructure.server.entitys.Viewpoint.class
                        if (r0 != r1) goto L_0x024c
                        o.BaseActivity_ViewBinding r4 = new o.BaseActivity_ViewBinding
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x024c:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.responses.InteractionRegionErrorResponse> r1 = com.thunderhead.android.infrastructure.server.responses.InteractionRegionErrorResponse.class
                        if (r0 != r1) goto L_0x025e
                        o.BasePartialSearchActivity r4 = new o.BasePartialSearchActivity
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x025e:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.FragmentBuilder_BindHmlOutcomeRejectFragment> r1 = p040o.FragmentBuilder_BindHmlOutcomeRejectFragment.class
                        if (r0 != r1) goto L_0x0270
                        o.FragmentBuilder_BindHowToAddAccountFragment r4 = new o.FragmentBuilder_BindHowToAddAccountFragment
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0270:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.AutoValue_CrashlyticsReport_Session> r1 = p040o.AutoValue_CrashlyticsReport_Session.class
                        if (r0 != r1) goto L_0x0282
                        o.getDevice r4 = new o.getDevice
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0282:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.HmlNTBLoanReviewActivity$read> r1 = p040o.HmlNTBLoanReviewActivity.read.class
                        if (r0 != r1) goto L_0x0294
                        o.HmlNTBPersonalInfoActivity r4 = new o.HmlNTBPersonalInfoActivity
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0294:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.OptimizationActions$Action$Asset$Response> r1 = com.thunderhead.android.infrastructure.server.entitys.OptimizationActions.Action.Asset.Response.class
                        if (r0 != r1) goto L_0x02a6
                        o.ManageEmailInputPresenter r4 = new o.ManageEmailInputPresenter
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x02a6:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.Optimizations> r1 = com.thunderhead.android.infrastructure.server.entitys.Optimizations.class
                        if (r0 != r1) goto L_0x02b8
                        o.BaseActivity r4 = new o.BaseActivity
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x02b8:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzun> r1 = p040o.zzun.class
                        if (r0 != r1) goto L_0x02ca
                        o.zzut r4 = new o.zzut
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x02ca:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzag$zza> r1 = p040o.zzag.zza.class
                        if (r0 != r1) goto L_0x02dc
                        o.zzbt$zzb r4 = new o.zzbt$zzb
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x02dc:
                        java.lang.Class<o.getGeoDataClient> r0 = p040o.getGeoDataClient.class
                        java.lang.Class r1 = r4.getRawType()
                        boolean r0 = r0.isAssignableFrom(r1)
                        if (r0 == 0) goto L_0x02f2
                        o.getPhotoMetadata r3 = new o.getPhotoMetadata
                        o.calcOrder r4 = read
                        o.mergeDAGs r0 = MediaBrowserCompat$CustomActionResultReceiver
                        r3.<init>(r4, r0)
                        return r3
                    L_0x02f2:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.getOpacityAtPosition> r1 = p040o.getOpacityAtPosition.class
                        if (r0 != r1) goto L_0x0304
                        o.FontParser r4 = new o.FontParser
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0304:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.setIndicatorSmart> r1 = p040o.setIndicatorSmart.class
                        if (r0 != r1) goto L_0x0316
                        o.RequestManagerFragment r4 = new o.RequestManagerFragment
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0316:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.ContentImage> r1 = com.thunderhead.android.infrastructure.server.entitys.ContentImage.class
                        if (r0 != r1) goto L_0x0328
                        o.UpdateEmailUseCase$Error3000 r4 = new o.UpdateEmailUseCase$Error3000
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0328:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzwl> r1 = p040o.zzwl.class
                        if (r0 != r1) goto L_0x033a
                        o.zzwy r4 = new o.zzwy
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x033a:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.TrackingPointData> r1 = com.thunderhead.android.infrastructure.server.entitys.TrackingPointData.class
                        if (r0 != r1) goto L_0x034c
                        o.lambda$showInAppDownloaded$0$BaseActivity r4 = new o.lambda$showInAppDownloaded$0$BaseActivity
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x034c:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.writeToParcel$write> r1 = p040o.writeToParcel.write.class
                        if (r0 != r1) goto L_0x035e
                        o.LottieComposition r4 = new o.LottieComposition
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x035e:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzuk> r1 = p040o.zzuk.class
                        if (r0 != r1) goto L_0x0370
                        o.zzuq r4 = new o.zzuq
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0370:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzby$zzb$zza> r1 = p040o.zzby.zzb.zza.class
                        if (r0 != r1) goto L_0x0382
                        o.zzby$zza$zza r4 = new o.zzby$zza$zza
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0382:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.ECouponCommonActivity> r1 = p040o.ECouponCommonActivity.class
                        if (r0 != r1) goto L_0x0394
                        o.ConfirmRedemptionActivity_ViewBinding r4 = new o.ConfirmRedemptionActivity_ViewBinding
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0394:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.decodeHexDigit> r1 = p040o.decodeHexDigit.class
                        if (r0 != r1) goto L_0x03a6
                        o.error r4 = new o.error
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x03a6:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.setCurrentItemInternal> r1 = p040o.setCurrentItemInternal.class
                        if (r0 != r1) goto L_0x03b8
                        o.setScrollState r4 = new o.setScrollState
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x03b8:
                        java.lang.Class<o.zzvm$MediaBrowserCompat$CustomActionResultReceiver> r0 = p040o.zzvm$MediaBrowserCompat$CustomActionResultReceiver.class
                        java.lang.Class r1 = r4.getRawType()
                        boolean r0 = r0.isAssignableFrom(r1)
                        if (r0 == 0) goto L_0x03ce
                        o.zzwa r3 = new o.zzwa
                        o.calcOrder r4 = read
                        o.mergeDAGs r0 = MediaBrowserCompat$CustomActionResultReceiver
                        r3.<init>(r4, r0)
                        return r3
                    L_0x03ce:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzvf> r1 = p040o.zzvf.class
                        if (r0 != r1) goto L_0x03e0
                        o.zzva r4 = new o.zzva
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x03e0:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder> r1 = p040o.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder.class
                        if (r0 != r1) goto L_0x03f2
                        o.CrashlyticsReport$Type r4 = new o.CrashlyticsReport$Type
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x03f2:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.Captures> r1 = com.thunderhead.android.infrastructure.server.entitys.Captures.class
                        if (r0 != r1) goto L_0x0404
                        o.ETBCheckIdentityCase$ErrorCode3013Exception r4 = new o.ETBCheckIdentityCase$ErrorCode3013Exception
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0404:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzrp> r1 = p040o.zzrp.class
                        if (r0 != r1) goto L_0x0416
                        o.zzru r4 = new o.zzru
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0416:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzup> r1 = p040o.zzup.class
                        if (r0 != r1) goto L_0x0428
                        o.zzuw r4 = new o.zzuw
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0428:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.AnimatableValueParser> r1 = p040o.AnimatableValueParser.class
                        if (r0 != r1) goto L_0x043a
                        o.DocumentDataParser r4 = new o.DocumentDataParser
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x043a:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.KeyframeParser> r1 = p040o.KeyframeParser.class
                        if (r0 != r1) goto L_0x044c
                        o.JsonUtils r4 = new o.JsonUtils
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x044c:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.setEvents> r1 = p040o.setEvents.class
                        if (r0 != r1) goto L_0x045e
                        o.getGeneratorType r4 = new o.getGeneratorType
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x045e:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.HmlNTBConsentActivity> r1 = p040o.HmlNTBConsentActivity.class
                        if (r0 != r1) goto L_0x0470
                        o.HmlMailingAddressActivity r4 = new o.HmlMailingAddressActivity
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0470:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.getLikelihood> r1 = p040o.getLikelihood.class
                        if (r0 != r1) goto L_0x0482
                        o.PlacePhotoMetadata r4 = new o.PlacePhotoMetadata
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0482:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.SupportStreetViewPanoramaFragment$zza> r1 = p040o.SupportStreetViewPanoramaFragment.zza.class
                        if (r0 != r1) goto L_0x0494
                        o.SupportMapFragment$zza r4 = new o.SupportMapFragment$zza
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0494:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzrz> r1 = p040o.zzrz.class
                        if (r0 != r1) goto L_0x04a6
                        o.zzrv r4 = new o.zzrv
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x04a6:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzwm> r1 = p040o.zzwm.class
                        if (r0 != r1) goto L_0x04b8
                        o.zzwr r4 = new o.zzwr
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x04b8:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.setBearing> r1 = p040o.setBearing.class
                        if (r0 != r1) goto L_0x04ca
                        o.getBearing r4 = new o.getBearing
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x04ca:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzxc> r1 = p040o.zzxc.class
                        if (r0 != r1) goto L_0x04dc
                        o.zzxc$zza r4 = new o.zzxc$zza
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x04dc:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.R$color> r1 = p040o.C1251R.color.class
                        if (r0 != r1) goto L_0x04ee
                        o.getMethod r4 = new o.getMethod
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x04ee:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.setEndFrames> r1 = p040o.setEndFrames.class
                        if (r0 != r1) goto L_0x0500
                        o.GradientStrokeParser r4 = new o.GradientStrokeParser
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0500:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.jsonObjectToPoint> r1 = p040o.jsonObjectToPoint.class
                        if (r0 != r1) goto L_0x0512
                        o.FontCharacterParser r4 = new o.FontCharacterParser
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0512:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.DeviceInfo> r1 = com.thunderhead.android.infrastructure.server.entitys.DeviceInfo.class
                        if (r0 != r1) goto L_0x0524
                        o.PresenterModule r4 = new o.PresenterModule
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0524:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzwu> r1 = p040o.zzwu.class
                        if (r0 != r1) goto L_0x0536
                        o.zzww r4 = new o.zzww
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0536:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.InteractionData> r1 = com.thunderhead.android.infrastructure.server.entitys.InteractionData.class
                        if (r0 != r1) goto L_0x0548
                        o.NsipPartnerPaymentConfirmCase$NsipConfirmException r4 = new o.NsipPartnerPaymentConfirmCase$NsipConfirmException
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0548:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.isRestrictedToPlacesOpenNow> r1 = p040o.isRestrictedToPlacesOpenNow.class
                        if (r0 != r1) goto L_0x055a
                        o.getMaxHeight r4 = new o.getMaxHeight
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x055a:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.writeToParcel> r1 = p040o.writeToParcel.class
                        if (r0 != r1) goto L_0x056c
                        o.LottieAnimationView$SavedState$1 r4 = new o.LottieAnimationView$SavedState$1
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x056c:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.HmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver> r1 = p040o.C6890x2027e421.class
                        if (r0 != r1) goto L_0x057e
                        o.HmlIssuerLandingActivity r4 = new o.HmlIssuerLandingActivity
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x057e:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.getLayers> r1 = p040o.getLayers.class
                        if (r0 != r1) goto L_0x0590
                        o.fromJsonString r4 = new o.fromJsonString
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0590:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.PlaceDetectionClient> r1 = p040o.PlaceDetectionClient.class
                        if (r0 != r1) goto L_0x05a2
                        o.PlacePhotoMetadataBuffer r4 = new o.PlacePhotoMetadataBuffer
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x05a2:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.ContentMessage> r1 = com.thunderhead.android.infrastructure.server.entitys.ContentMessage.class
                        if (r0 != r1) goto L_0x05b4
                        o.ProfileSettingDisplayMapper r4 = new o.ProfileSettingDisplayMapper
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x05b4:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.OptimizationActions$Action$Proposition> r1 = com.thunderhead.android.infrastructure.server.entitys.OptimizationActions.Action.Proposition.class
                        if (r0 != r1) goto L_0x05c6
                        o.ScbsAccountDetailPresenter r4 = new o.ScbsAccountDetailPresenter
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x05c6:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.remainingCapacity> r1 = p040o.remainingCapacity.class
                        if (r0 != r1) goto L_0x05d8
                        o.Futures r4 = new o.Futures
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x05d8:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.DeepLinkSpec> r1 = p040o.DeepLinkSpec.class
                        if (r0 != r1) goto L_0x05ea
                        o.getActivityClass r4 = new o.getActivityClass
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x05ea:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.parseFloat> r1 = p040o.parseFloat.class
                        if (r0 != r1) goto L_0x05fc
                        o.FloatParser r4 = new o.FloatParser
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x05fc:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzuj> r1 = p040o.zzuj.class
                        if (r0 != r1) goto L_0x060e
                        o.zzrs r4 = new o.zzrs
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x060e:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.setGeneratorType> r1 = p040o.setGeneratorType.class
                        if (r0 != r1) goto L_0x0620
                        o.getOs r4 = new o.getOs
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0620:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.parseDevice> r1 = p040o.parseDevice.class
                        if (r0 != r1) goto L_0x0632
                        o.CrashlyticsReport$Session$User r4 = new o.CrashlyticsReport$Session$User
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0632:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzrt> r1 = p040o.zzrt.class
                        if (r0 != r1) goto L_0x0644
                        o.zzrx r4 = new o.zzrx
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0644:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzry> r1 = p040o.zzry.class
                        if (r0 != r1) goto L_0x0656
                        o.zzux r4 = new o.zzux
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0656:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.CrashlyticsReport$Session$Event$Builder> r1 = p040o.CrashlyticsReport.Session.Event.Builder.class
                        if (r0 != r1) goto L_0x0668
                        o.CrashlyticsReport$Session$User$Builder r4 = new o.CrashlyticsReport$Session$User$Builder
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0668:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.BindDimen> r1 = p040o.BindDimen.class
                        if (r0 != r1) goto L_0x067a
                        o.BindFont$TypefaceStyle r4 = new o.BindFont$TypefaceStyle
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x067a:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.kofax.mobile.sdk.extract.id.LocalProjectProvider$VersionTable$VersionList> r1 = com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider.VersionTable.VersionList.class
                        if (r0 != r1) goto L_0x068c
                        o.CHPMV r4 = new o.CHPMV
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x068c:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.isScaleIdentity> r1 = p040o.isScaleIdentity.class
                        if (r0 != r1) goto L_0x069e
                        o.CircleShapeParser r4 = new o.CircleShapeParser
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x069e:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.getInterpolator> r1 = p040o.getInterpolator.class
                        if (r0 != r1) goto L_0x06b0
                        o.addOpacityStopsToGradientIfNeeded r4 = new o.addOpacityStopsToGradientIfNeeded
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x06b0:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.Utils> r1 = p040o.Utils.class
                        if (r0 != r1) goto L_0x06c2
                        o.getPathFromData r4 = new o.getPathFromData
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x06c2:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.PlaceFilter$zzb> r1 = p040o.PlaceFilter.zzb.class
                        if (r0 != r1) goto L_0x06d4
                        o.getMaxWidth r4 = new o.getMaxWidth
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x06d4:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.requests.BaseRequest> r1 = com.thunderhead.android.infrastructure.server.requests.BaseRequest.class
                        if (r0 != r1) goto L_0x06e6
                        o.BaseActivityWithFragment r4 = new o.BaseActivityWithFragment
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x06e6:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.onIndoorLevelActivated> r1 = p040o.onIndoorLevelActivated.class
                        if (r0 != r1) goto L_0x06f8
                        o.GoogleMap$OnInfoWindowLongClickListener r4 = new o.GoogleMap$OnInfoWindowLongClickListener
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x06f8:
                        java.lang.Class<o.HmlNTBAdditionalDocumentActivity_ViewBinding> r0 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.class
                        java.lang.Class r1 = r4.getRawType()
                        boolean r0 = r0.isAssignableFrom(r1)
                        if (r0 == 0) goto L_0x070e
                        o.HmlHomeAddressActivity r3 = new o.HmlHomeAddressActivity
                        o.calcOrder r4 = read
                        o.mergeDAGs r0 = MediaBrowserCompat$CustomActionResultReceiver
                        r3.<init>(r4, r0)
                        return r3
                    L_0x070e:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.OptimizationActions$Action> r1 = com.thunderhead.android.infrastructure.server.entitys.OptimizationActions.Action.class
                        if (r0 != r1) goto L_0x0720
                        o.SCBClearAppFromRecentService r4 = new o.SCBClearAppFromRecentService
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0720:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.requests.ElementDataRequest> r1 = com.thunderhead.android.infrastructure.server.requests.ElementDataRequest.class
                        if (r0 != r1) goto L_0x0732
                        o.onNextClick r4 = new o.onNextClick
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0732:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.getUriTemplate> r1 = p040o.getUriTemplate.class
                        if (r0 != r1) goto L_0x0744
                        o.getParameters r4 = new o.getParameters
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0744:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzrn> r1 = p040o.zzrn.class
                        if (r0 != r1) goto L_0x0756
                        o.zzuu r4 = new o.zzuu
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0756:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.CustomerKeyConfiguration> r1 = com.thunderhead.android.infrastructure.server.entitys.CustomerKeyConfiguration.class
                        if (r0 != r1) goto L_0x0768
                        o.ForgotPinRepositoryContractor r4 = new o.ForgotPinRepositoryContractor
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0768:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.OptimizationActions$Action$Asset> r1 = com.thunderhead.android.infrastructure.server.entitys.OptimizationActions.Action.Asset.class
                        if (r0 != r1) goto L_0x077a
                        o.EmailOtpPresenter r4 = new o.EmailOtpPresenter
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x077a:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.getGenerator> r1 = p040o.getGenerator.class
                        if (r0 != r1) goto L_0x078c
                        o.getIdentifier r4 = new o.getIdentifier
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x078c:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzrr> r1 = p040o.zzrr.class
                        if (r0 != r1) goto L_0x079e
                        o.zzrw r4 = new o.zzrw
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x079e:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.Property> r1 = com.thunderhead.android.infrastructure.server.entitys.Property.class
                        if (r0 != r1) goto L_0x07b0
                        o.AddressSearchActivity r4 = new o.AddressSearchActivity
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x07b0:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.parseScale> r1 = p040o.parseScale.class
                        if (r0 != r1) goto L_0x07c2
                        o.GradientColorParser r4 = new o.GradientColorParser
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x07c2:
                        java.lang.Class<o.parseChars> r0 = p040o.parseChars.class
                        java.lang.Class r1 = r4.getRawType()
                        boolean r0 = r0.isAssignableFrom(r1)
                        if (r0 == 0) goto L_0x07d8
                        o.GradientFillParser r3 = new o.GradientFillParser
                        o.calcOrder r4 = read
                        o.mergeDAGs r0 = MediaBrowserCompat$CustomActionResultReceiver
                        r3.<init>(r4, r0)
                        return r3
                    L_0x07d8:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzwp> r1 = p040o.zzwp.class
                        if (r0 != r1) goto L_0x07ea
                        o.zzwq r4 = new o.zzwq
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x07ea:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzuh> r1 = p040o.zzuh.class
                        if (r0 != r1) goto L_0x07fc
                        o.zzus r4 = new o.zzus
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x07fc:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.FragmentBuilder_BindRegistrationLandingFragment> r1 = p040o.FragmentBuilder_BindRegistrationLandingFragment.class
                        if (r0 != r1) goto L_0x080e
                        o.FragmentBuilder_BindRemittanceAmountFormFragment r4 = new o.FragmentBuilder_BindRemittanceAmountFormFragment
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x080e:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.requests.ResponseForOptimizationPointsRequest> r1 = com.thunderhead.android.infrastructure.server.requests.ResponseForOptimizationPointsRequest.class
                        if (r0 != r1) goto L_0x0820
                        o.BaseOtpActivity r4 = new o.BaseOtpActivity
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0820:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.getLayers$MediaBrowserCompat$ItemReceiver> r1 = p040o.getLayers$MediaBrowserCompat$ItemReceiver.class
                        if (r0 != r1) goto L_0x0832
                        o.fromJsonSync r4 = new o.fromJsonSync
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0832:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.GoogleMap$OnMarkerDragListener> r1 = p040o.GoogleMap.OnMarkerDragListener.class
                        if (r0 != r1) goto L_0x0844
                        o.GoogleMap$OnInfoWindowCloseListener r4 = new o.GoogleMap$OnInfoWindowCloseListener
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0844:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.zzwn> r1 = p040o.zzwn.class
                        if (r0 != r1) goto L_0x0856
                        o.zzwt r4 = new o.zzwt
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0856:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.setOnPageChangeListener> r1 = p040o.setOnPageChangeListener.class
                        if (r0 != r1) goto L_0x0868
                        o.smoothScrollTo r4 = new o.smoothScrollTo
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x0868:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.kofax.mobile.sdk.extract.id.LocalProjectProvider$VersionTable> r1 = com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider.VersionTable.class
                        if (r0 != r1) goto L_0x087a
                        o.CHER2K r4 = new o.CHER2K
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x087a:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.setFontAssetDelegate$read> r1 = p040o.setFontAssetDelegate.read.class
                        if (r0 != r1) goto L_0x088c
                        o.setMaxProgress r4 = new o.setMaxProgress
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x088c:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.AutoValue_CrashlyticsReport_FilesPayload_File$1> r1 = p040o.AutoValue_CrashlyticsReport_FilesPayload_File.C30621.class
                        if (r0 != r1) goto L_0x089e
                        o.getApp r4 = new o.getApp
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x089e:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.requests.DeviceInfoRequest> r1 = com.thunderhead.android.infrastructure.server.requests.DeviceInfoRequest.class
                        if (r0 != r1) goto L_0x08b0
                        o.BaseChangePinActivity r4 = new o.BaseChangePinActivity
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x08b0:
                        java.lang.Class r0 = r4.getRawType()
                        java.lang.Class<o.addPoints> r1 = p040o.addPoints.class
                        if (r0 != r1) goto L_0x08c2
                        o.closeQuietly r4 = new o.closeQuietly
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x08c2:
                        java.lang.Class r4 = r4.getRawType()
                        java.lang.Class<com.thunderhead.android.infrastructure.server.entitys.Content> r0 = com.thunderhead.android.infrastructure.server.entitys.Content.class
                        if (r4 != r0) goto L_0x08d4
                        o.AmortizationPresenter r4 = new o.AmortizationPresenter
                        o.calcOrder r0 = read
                        o.mergeDAGs r1 = MediaBrowserCompat$CustomActionResultReceiver
                        r4.<init>(r3, r0, r1)
                        return r4
                    L_0x08d4:
                        r3 = 0
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p040o.ScriptGroup.Builder.C12691.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
                }
            });
            this.calls = new ThreadLocal<>();
            this.typeTokenCache = new ConcurrentHashMap();
            this.excluder = excluder2;
            this.fieldNamingStrategy = fieldNamingStrategy2;
            this.instanceCreators = map;
            this.constructorConstructor = new ConstructorConstructor(map);
            this.serializeNulls = z;
            this.complexMapKeySerialization = z2;
            this.generateNonExecutableJson = z3;
            this.htmlSafe = z4;
            this.prettyPrinting = z5;
            this.lenient = z6;
            this.serializeSpecialFloatingPointValues = z8;
            this.longSerializationPolicy = longSerializationPolicy2;
            this.datePattern = str;
            this.dateStyle = i;
            this.timeStyle = i2;
            this.builderFactories = list;
            this.builderHierarchyFactories = list2;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(TypeAdapters.JSON_ELEMENT_FACTORY);
            arrayList2.add(ObjectTypeAdapter.FACTORY);
            arrayList2.add(excluder2);
            arrayList2.addAll(arrayList);
            arrayList2.add(TypeAdapters.STRING_FACTORY);
            arrayList2.add(TypeAdapters.INTEGER_FACTORY);
            arrayList2.add(TypeAdapters.BOOLEAN_FACTORY);
            arrayList2.add(TypeAdapters.BYTE_FACTORY);
            arrayList2.add(TypeAdapters.SHORT_FACTORY);
            TypeAdapter<Number> longAdapter = longAdapter(longSerializationPolicy2);
            arrayList2.add(TypeAdapters.newFactory(Long.TYPE, Long.class, longAdapter));
            arrayList2.add(TypeAdapters.newFactory(Double.TYPE, Double.class, doubleAdapter(z8)));
            arrayList2.add(TypeAdapters.newFactory(Float.TYPE, Float.class, floatAdapter(z8)));
            arrayList2.add(TypeAdapters.NUMBER_FACTORY);
            arrayList2.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
            arrayList2.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
            arrayList2.add(TypeAdapters.newFactory(AtomicLong.class, atomicLongAdapter(longAdapter)));
            arrayList2.add(TypeAdapters.newFactory(AtomicLongArray.class, atomicLongArrayAdapter(longAdapter)));
            arrayList2.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
            arrayList2.add(TypeAdapters.CHARACTER_FACTORY);
            arrayList2.add(TypeAdapters.STRING_BUILDER_FACTORY);
            arrayList2.add(TypeAdapters.STRING_BUFFER_FACTORY);
            arrayList2.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
            arrayList2.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
            arrayList2.add(TypeAdapters.URL_FACTORY);
            arrayList2.add(TypeAdapters.URI_FACTORY);
            arrayList2.add(TypeAdapters.UUID_FACTORY);
            arrayList2.add(TypeAdapters.CURRENCY_FACTORY);
            arrayList2.add(TypeAdapters.LOCALE_FACTORY);
            arrayList2.add(TypeAdapters.INET_ADDRESS_FACTORY);
            arrayList2.add(TypeAdapters.BIT_SET_FACTORY);
            arrayList2.add(DateTypeAdapter.FACTORY);
            arrayList2.add(TypeAdapters.CALENDAR_FACTORY);
            arrayList2.add(TimeTypeAdapter.FACTORY);
            arrayList2.add(SqlDateTypeAdapter.FACTORY);
            arrayList2.add(TypeAdapters.TIMESTAMP_FACTORY);
            arrayList2.add(ArrayTypeAdapter.FACTORY);
            arrayList2.add(TypeAdapters.CLASS_FACTORY);
            arrayList2.add(new CollectionTypeAdapterFactory(this.constructorConstructor));
            arrayList2.add(new MapTypeAdapterFactory(this.constructorConstructor, z2));
            JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(this.constructorConstructor);
            this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
            arrayList2.add(jsonAdapterAnnotationTypeAdapterFactory);
            arrayList2.add(TypeAdapters.ENUM_FACTORY);
            arrayList2.add(new ReflectiveTypeAdapterFactory(this.constructorConstructor, fieldNamingStrategy2, excluder2, this.jsonAdapterFactory));
            this.factories = Collections.unmodifiableList(arrayList2);
        }

        public GsonBuilder newBuilder() {
            return new GsonBuilder(this);
        }

        public Excluder excluder() {
            return this.excluder;
        }

        public FieldNamingStrategy fieldNamingStrategy() {
            return this.fieldNamingStrategy;
        }

        public boolean serializeNulls() {
            return this.serializeNulls;
        }

        public boolean htmlSafe() {
            return this.htmlSafe;
        }

        private TypeAdapter<Number> doubleAdapter(boolean z) {
            if (z) {
                return TypeAdapters.DOUBLE;
            }
            return new TypeAdapter<Number>() {
                public Double read(JsonReader jsonReader) throws IOException {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        return Double.valueOf(jsonReader.nextDouble());
                    }
                    jsonReader.nextNull();
                    return null;
                }

                public void write(JsonWriter jsonWriter, Number number) throws IOException {
                    if (number == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    Gson.checkValidFloatingPoint(number.doubleValue());
                    jsonWriter.value(number);
                }
            };
        }

        private TypeAdapter<Number> floatAdapter(boolean z) {
            if (z) {
                return TypeAdapters.FLOAT;
            }
            return new TypeAdapter<Number>() {
                public Float read(JsonReader jsonReader) throws IOException {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        return Float.valueOf((float) jsonReader.nextDouble());
                    }
                    jsonReader.nextNull();
                    return null;
                }

                public void write(JsonWriter jsonWriter, Number number) throws IOException {
                    if (number == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    Gson.checkValidFloatingPoint((double) number.floatValue());
                    jsonWriter.value(number);
                }
            };
        }

        static void checkValidFloatingPoint(double d) {
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                StringBuilder sb = new StringBuilder();
                sb.append(d);
                sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
                throw new IllegalArgumentException(sb.toString());
            }
        }

        private static TypeAdapter<Number> longAdapter(LongSerializationPolicy longSerializationPolicy2) {
            if (longSerializationPolicy2 == LongSerializationPolicy.DEFAULT) {
                return TypeAdapters.LONG;
            }
            return new TypeAdapter<Number>() {
                public final Number read(JsonReader jsonReader) throws IOException {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        return Long.valueOf(jsonReader.nextLong());
                    }
                    jsonReader.nextNull();
                    return null;
                }

                public final void write(JsonWriter jsonWriter, Number number) throws IOException {
                    if (number == null) {
                        jsonWriter.nullValue();
                    } else {
                        jsonWriter.value(number.toString());
                    }
                }
            };
        }

        private static TypeAdapter<AtomicLong> atomicLongAdapter(final TypeAdapter<Number> typeAdapter) {
            return new TypeAdapter<AtomicLong>() {
                public final void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
                    typeAdapter.write(jsonWriter, Long.valueOf(atomicLong.get()));
                }

                public final AtomicLong read(JsonReader jsonReader) throws IOException {
                    return new AtomicLong(((Number) typeAdapter.read(jsonReader)).longValue());
                }
            }.nullSafe();
        }

        private static TypeAdapter<AtomicLongArray> atomicLongArrayAdapter(final TypeAdapter<Number> typeAdapter) {
            return new TypeAdapter<AtomicLongArray>() {
                public final void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
                    jsonWriter.beginArray();
                    int length = atomicLongArray.length();
                    for (int i = 0; i < length; i++) {
                        typeAdapter.write(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
                    }
                    jsonWriter.endArray();
                }

                public final AtomicLongArray read(JsonReader jsonReader) throws IOException {
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(Long.valueOf(((Number) typeAdapter.read(jsonReader)).longValue()));
                    }
                    jsonReader.endArray();
                    int size = arrayList.size();
                    AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                    for (int i = 0; i < size; i++) {
                        atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                    }
                    return atomicLongArray;
                }
            }.nullSafe();
        }

        public <T> TypeAdapter<T> getAdapter(TypeToken<T> typeToken) {
            TypeAdapter<T> typeAdapter = this.typeTokenCache.get(typeToken == null ? NULL_KEY_SURROGATE : typeToken);
            if (typeAdapter != null) {
                return typeAdapter;
            }
            Map map = this.calls.get();
            boolean z = false;
            if (map == null) {
                map = new HashMap();
                this.calls.set(map);
                z = true;
            }
            FutureTypeAdapter futureTypeAdapter = (FutureTypeAdapter) map.get(typeToken);
            if (futureTypeAdapter != null) {
                return futureTypeAdapter;
            }
            try {
                FutureTypeAdapter futureTypeAdapter2 = new FutureTypeAdapter();
                map.put(typeToken, futureTypeAdapter2);
                for (TypeAdapterFactory create : this.factories) {
                    TypeAdapter<T> create2 = create.create(this, typeToken);
                    if (create2 != null) {
                        futureTypeAdapter2.setDelegate(create2);
                        this.typeTokenCache.put(typeToken, create2);
                        return create2;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("GSON (2.8.5) cannot handle ");
                sb.append(typeToken);
                throw new IllegalArgumentException(sb.toString());
            } finally {
                map.remove(typeToken);
                if (z) {
                    this.calls.remove();
                }
            }
        }

        public <T> TypeAdapter<T> getDelegateAdapter(TypeAdapterFactory typeAdapterFactory, TypeToken<T> typeToken) {
            if (!this.factories.contains(typeAdapterFactory)) {
                typeAdapterFactory = this.jsonAdapterFactory;
            }
            boolean z = false;
            for (TypeAdapterFactory next : this.factories) {
                if (z) {
                    TypeAdapter<T> create = next.create(this, typeToken);
                    if (create != null) {
                        return create;
                    }
                } else if (next == typeAdapterFactory) {
                    z = true;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("GSON cannot serialize ");
            sb.append(typeToken);
            throw new IllegalArgumentException(sb.toString());
        }

        public <T> TypeAdapter<T> getAdapter(Class<T> cls) {
            return getAdapter(TypeToken.get(cls));
        }

        public JsonElement toJsonTree(Object obj) {
            if (obj == null) {
                return JsonNull.INSTANCE;
            }
            return toJsonTree(obj, obj.getClass());
        }

        public JsonElement toJsonTree(Object obj, Type type) {
            JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
            toJson(obj, type, (JsonWriter) jsonTreeWriter);
            return jsonTreeWriter.get();
        }

        public String toJson(Object obj) {
            if (obj == null) {
                return toJson((JsonElement) JsonNull.INSTANCE);
            }
            return toJson(obj, (Type) obj.getClass());
        }

        public String toJson(Object obj, Type type) {
            StringWriter stringWriter = new StringWriter();
            toJson(obj, type, (Appendable) stringWriter);
            return stringWriter.toString();
        }

        public void toJson(Object obj, Appendable appendable) throws JsonIOException {
            if (obj != null) {
                toJson(obj, (Type) obj.getClass(), appendable);
            } else {
                toJson((JsonElement) JsonNull.INSTANCE, appendable);
            }
        }

        public void toJson(Object obj, Type type, Appendable appendable) throws JsonIOException {
            try {
                toJson(obj, type, newJsonWriter(Streams.writerForAppendable(appendable)));
            } catch (IOException e) {
                throw new JsonIOException((Throwable) e);
            }
        }

        public void toJson(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
            TypeAdapter<?> adapter = getAdapter(TypeToken.get(type));
            boolean isLenient = jsonWriter.isLenient();
            jsonWriter.setLenient(true);
            boolean isHtmlSafe = jsonWriter.isHtmlSafe();
            jsonWriter.setHtmlSafe(this.htmlSafe);
            boolean serializeNulls2 = jsonWriter.getSerializeNulls();
            jsonWriter.setSerializeNulls(this.serializeNulls);
            try {
                adapter.write(jsonWriter, obj);
                jsonWriter.setLenient(isLenient);
                jsonWriter.setHtmlSafe(isHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls2);
            } catch (IOException e) {
                throw new JsonIOException((Throwable) e);
            } catch (AssertionError e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("AssertionError (GSON 2.8.5): ");
                sb.append(e2.getMessage());
                throw new AssertionError(sb.toString(), e2);
            } catch (Throwable th) {
                jsonWriter.setLenient(isLenient);
                jsonWriter.setHtmlSafe(isHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls2);
                throw th;
            }
        }

        public String toJson(JsonElement jsonElement) {
            StringWriter stringWriter = new StringWriter();
            toJson(jsonElement, (Appendable) stringWriter);
            return stringWriter.toString();
        }

        public void toJson(JsonElement jsonElement, Appendable appendable) throws JsonIOException {
            try {
                toJson(jsonElement, newJsonWriter(Streams.writerForAppendable(appendable)));
            } catch (IOException e) {
                throw new JsonIOException((Throwable) e);
            }
        }

        public JsonWriter newJsonWriter(Writer writer) throws IOException {
            if (this.generateNonExecutableJson) {
                writer.write(JSON_NON_EXECUTABLE_PREFIX);
            }
            JsonWriter jsonWriter = new JsonWriter(writer);
            if (this.prettyPrinting) {
                jsonWriter.setIndent("  ");
            }
            jsonWriter.setSerializeNulls(this.serializeNulls);
            return jsonWriter;
        }

        public JsonReader newJsonReader(Reader reader) {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setLenient(this.lenient);
            return jsonReader;
        }

        public void toJson(JsonElement jsonElement, JsonWriter jsonWriter) throws JsonIOException {
            boolean isLenient = jsonWriter.isLenient();
            jsonWriter.setLenient(true);
            boolean isHtmlSafe = jsonWriter.isHtmlSafe();
            jsonWriter.setHtmlSafe(this.htmlSafe);
            boolean serializeNulls2 = jsonWriter.getSerializeNulls();
            jsonWriter.setSerializeNulls(this.serializeNulls);
            try {
                Streams.write(jsonElement, jsonWriter);
                jsonWriter.setLenient(isLenient);
                jsonWriter.setHtmlSafe(isHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls2);
            } catch (IOException e) {
                throw new JsonIOException((Throwable) e);
            } catch (AssertionError e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("AssertionError (GSON 2.8.5): ");
                sb.append(e2.getMessage());
                throw new AssertionError(sb.toString(), e2);
            } catch (Throwable th) {
                jsonWriter.setLenient(isLenient);
                jsonWriter.setHtmlSafe(isHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls2);
                throw th;
            }
        }

        public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
            return Primitives.wrap(cls).cast(fromJson(str, (Type) cls));
        }

        public <T> T fromJson(String str, Type type) throws JsonSyntaxException {
            if (str == null) {
                return null;
            }
            return fromJson((Reader) new StringReader(str), type);
        }

        public <T> T fromJson(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
            JsonReader newJsonReader = newJsonReader(reader);
            T fromJson = fromJson(newJsonReader, (Type) cls);
            assertFullConsumption(fromJson, newJsonReader);
            return Primitives.wrap(cls).cast(fromJson);
        }

        public <T> T fromJson(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
            JsonReader newJsonReader = newJsonReader(reader);
            T fromJson = fromJson(newJsonReader, type);
            assertFullConsumption(fromJson, newJsonReader);
            return fromJson;
        }

        private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
            if (obj != null) {
                try {
                    if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                        throw new JsonIOException("JSON document was not fully consumed.");
                    }
                } catch (MalformedJsonException e) {
                    throw new JsonSyntaxException((Throwable) e);
                } catch (IOException e2) {
                    throw new JsonIOException((Throwable) e2);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r2 = new java.lang.StringBuilder();
            r2.append("AssertionError (GSON 2.8.5): ");
            r2.append(r6.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
            throw new java.lang.AssertionError(r2.toString(), r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
            throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
            throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
            r5.setLenient(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
            throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
            r5.setLenient(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005c, code lost:
            throw r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
            r6 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[ExcHandler: AssertionError (r6v5 'e' java.lang.AssertionError A[CUSTOM_DECLARE]), Splitter:B:1:0x0009] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ EOFException -> 0x001c, IllegalStateException -> 0x0044, IOException -> 0x003d, AssertionError -> 0x0021, all -> 0x001f }, ExcHandler: IOException (r6v4 'e' java.io.IOException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x0009] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0044 A[Catch:{ EOFException -> 0x001c, IllegalStateException -> 0x0044, IOException -> 0x003d, AssertionError -> 0x0021, all -> 0x001f }, ExcHandler: IllegalStateException (r6v3 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:1:0x0009] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0053 A[SYNTHETIC, Splitter:B:24:0x0053] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> T fromJson(com.google.gson.stream.JsonReader r5, java.lang.reflect.Type r6) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            /*
                r4 = this;
                boolean r0 = r5.isLenient()
                r1 = 1
                r5.setLenient(r1)
                r2 = 0
                r5.peek()     // Catch:{ EOFException -> 0x004b, IllegalStateException -> 0x0044, IOException -> 0x003d, AssertionError -> 0x0021 }
                com.google.gson.reflect.TypeToken r6 = com.google.gson.reflect.TypeToken.get((java.lang.reflect.Type) r6)     // Catch:{ EOFException -> 0x001c, IllegalStateException -> 0x0044, IOException -> 0x003d, AssertionError -> 0x0021 }
                com.google.gson.TypeAdapter r6 = r4.getAdapter(r6)     // Catch:{ EOFException -> 0x001c, IllegalStateException -> 0x0044, IOException -> 0x003d, AssertionError -> 0x0021 }
                java.lang.Object r6 = r6.read(r5)     // Catch:{ EOFException -> 0x001c, IllegalStateException -> 0x0044, IOException -> 0x003d, AssertionError -> 0x0021 }
                r5.setLenient(r0)
                return r6
            L_0x001c:
                r6 = move-exception
                r1 = r2
                goto L_0x004c
            L_0x001f:
                r6 = move-exception
                goto L_0x0059
            L_0x0021:
                r6 = move-exception
                java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x001f }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
                r2.<init>()     // Catch:{ all -> 0x001f }
                java.lang.String r3 = "AssertionError (GSON 2.8.5): "
                r2.append(r3)     // Catch:{ all -> 0x001f }
                java.lang.String r3 = r6.getMessage()     // Catch:{ all -> 0x001f }
                r2.append(r3)     // Catch:{ all -> 0x001f }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x001f }
                r1.<init>(r2, r6)     // Catch:{ all -> 0x001f }
                throw r1     // Catch:{ all -> 0x001f }
            L_0x003d:
                r6 = move-exception
                com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch:{ all -> 0x001f }
                r1.<init>((java.lang.Throwable) r6)     // Catch:{ all -> 0x001f }
                throw r1     // Catch:{ all -> 0x001f }
            L_0x0044:
                r6 = move-exception
                com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch:{ all -> 0x001f }
                r1.<init>((java.lang.Throwable) r6)     // Catch:{ all -> 0x001f }
                throw r1     // Catch:{ all -> 0x001f }
            L_0x004b:
                r6 = move-exception
            L_0x004c:
                if (r1 == 0) goto L_0x0053
                r5.setLenient(r0)
                r5 = 0
                return r5
            L_0x0053:
                com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch:{ all -> 0x001f }
                r1.<init>((java.lang.Throwable) r6)     // Catch:{ all -> 0x001f }
                throw r1     // Catch:{ all -> 0x001f }
            L_0x0059:
                r5.setLenient(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.fromJson(com.google.gson.stream.JsonReader, java.lang.reflect.Type):java.lang.Object");
        }

        public <T> T fromJson(JsonElement jsonElement, Class<T> cls) throws JsonSyntaxException {
            return Primitives.wrap(cls).cast(fromJson(jsonElement, (Type) cls));
        }

        public <T> T fromJson(JsonElement jsonElement, Type type) throws JsonSyntaxException {
            if (jsonElement == null) {
                return null;
            }
            return fromJson((JsonReader) new JsonTreeReader(jsonElement), type);
        }

        static class FutureTypeAdapter<T> extends TypeAdapter<T> {
            private TypeAdapter<T> delegate;

            FutureTypeAdapter() {
            }

            public void setDelegate(TypeAdapter<T> typeAdapter) {
                if (this.delegate == null) {
                    this.delegate = typeAdapter;
                    return;
                }
                throw new AssertionError();
            }

            public T read(JsonReader jsonReader) throws IOException {
                TypeAdapter<T> typeAdapter = this.delegate;
                if (typeAdapter != null) {
                    return typeAdapter.read(jsonReader);
                }
                throw new IllegalStateException();
            }

            public void write(JsonWriter jsonWriter, T t) throws IOException {
                TypeAdapter<T> typeAdapter = this.delegate;
                if (typeAdapter != null) {
                    typeAdapter.write(jsonWriter, t);
                    return;
                }
                throw new IllegalStateException();
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{serializeNulls:");
            sb.append(this.serializeNulls);
            sb.append(",factories:");
            sb.append(this.factories);
            sb.append(",instanceCreators:");
            sb.append(this.constructorConstructor);
            sb.append("}");
            return sb.toString();
        }
    }
