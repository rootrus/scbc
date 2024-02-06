package com.scb.phone.data.network.p034di;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p040o.C1251R;
import p040o.DataBufferRef;
import p040o.DataBufferUtils;
import p040o.DataHolder;
import p040o.DeepLinkUri;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.KeyframeParser;
import p040o.LottieAnimationView;
import p040o.TaskUtil$MediaBrowserCompat$ItemReceiver;
import p040o.addEncodedPathSegment;
import p040o.addEncodedQueryParameter;
import p040o.addLottieOnCompositionLoadedListener;
import p040o.buildDrawingCache;
import p040o.containsInvalidHostnameAsciiCodes;
import p040o.count$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.decodeIpv6;
import p040o.domainToAscii;
import p040o.effectivePort;
import p040o.endSection;
import p040o.getByteArray;
import p040o.getDouble;
import p040o.getFontPath;
import p040o.getIsAdIdFakeForDebugLogging;
import p040o.hasObservers;
import p040o.hasPrevPage;
import p040o.inet6AddressToAscii;
import p040o.onDataRangeInserted;
import p040o.paddedPartition;
import p040o.pathInterpolatorCache;
import p040o.query;
import p040o.queryParameterValues;
import p040o.removeAllEncodedQueryParameters;
import p040o.removeAllQueryParameters;
import p040o.removeLottieOnCompositionLoadedListener;
import p040o.removeObserver;
import p040o.resetOverride$MediaBrowserCompat$ItemReceiver;
import p040o.resolvePath;
import p040o.schemeDelimiterOffset;
import p040o.setPageMarginDrawable;
import p040o.skipTrailingAsciiWhitespace;
import p040o.username;
import p040o.zaaa;
import p040o.zabr;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/* renamed from: com.scb.phone.data.network.di.NetworkModule */
public class NetworkModule {
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "mobileNumberURL")
    @HmlSetNTBPinActivity
    public String MediaDescriptionCompat() {
        return "http://www.scb.co.th/";
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "googlesigninURL")
    @HmlSetNTBPinActivity
    public String RatingCompat() {
        return "https://www.googleapis.com";
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa MediaDescriptionCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, true);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "NoSSLServiceGenerator")
    @HmlSetNTBPinActivity
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public zaaa mo13211x50fd9e4a(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, false);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "BillPaymentServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "BillPaymentConverter") Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, true);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "CCContentServiceConverterGenerator")
    @HmlSetNTBPinActivity
    public zaaa MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "CCContentServiceConverter") Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, true);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "RewardRedemptionServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa MediaSessionCompat$ResultReceiverWrapper(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "RewardRedemptionConverter") Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, true);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "CardManagementServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "CardManagementConverter") Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, true);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "V1ServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa Keep(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "v1") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, true);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "StaticContentServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa ParcelableVolumeInfo(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseStaticURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, true);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "PreloadCheckServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, Converter.Factory factory, CallAdapter.Factory factory2, getDouble getdouble) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, (Interceptor) getdouble);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "ProfileServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, Converter.Factory factory, CallAdapter.Factory factory2, DataBufferRef dataBufferRef) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, (Interceptor) dataBufferRef);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "TileServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa MediaSessionCompat$QueueItem(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "TilesConverter") Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, (Interceptor) null);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "CommonServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa MediaMetadataCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "GenSlipConverter") Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, (Interceptor) null);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "MobileNumberServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa MediaBrowserCompat$MediaItem(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseMsisdnURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "SimpleXMLConverter") Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, 10, false);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "HmlDocumentUploadServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "apiAuthInterceptor") Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, 60, true);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DocumentUploadServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa MediaBrowserCompat$SearchResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, 60, true);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "FingerprintServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, Converter.Factory factory, CallAdapter.Factory factory2, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "fingerprintInterceptor") Interceptor interceptor2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, interceptor2);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "PlainTextServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa MediaSessionCompat$Token(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "PlainTextConverter") Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, true);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "ApiAuthServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "apiAuthInterceptor") Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, true);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "GoogleSigninServiceGenerator")
    @HmlSetNTBPinActivity
    public zaaa RatingCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "googlesigninURL") String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, Converter.Factory factory, CallAdapter.Factory factory2) {
        return new zaaa(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, false);
    }

    @HmlSetNTBPinActivity
    public Interceptor read(SharedPreferences sharedPreferences) {
        return new hasPrevPage(sharedPreferences);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "apiAuthInterceptor")
    @HmlSetNTBPinActivity
    public Interceptor MediaBrowserCompat$CustomActionResultReceiver(SharedPreferences sharedPreferences, count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver) {
        return new DataBufferUtils(sharedPreferences, count_mediabrowsercompat_customactionresultreceiver);
    }

    public static /* synthetic */ Response MediaBrowserCompat$CustomActionResultReceiver(SharedPreferences sharedPreferences, count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver, Interceptor.Chain chain) throws IOException {
        Response proceed = chain.proceed(chain.request().newBuilder().header("Content-Type", "application/json").header("Accept-Language", sharedPreferences.getString("com.scb.phone.pref.key.LANGUAGE", "th")).header("scb-channel", "APP").build());
        String header = proceed.header("Api-Auth");
        String header2 = proceed.header("Api-Refresh");
        boolean z = false;
        if (!(header == null || header.length() == 0) && !TextUtils.isEmpty(header)) {
            count_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = header;
        }
        if (header2 == null || header2.length() == 0) {
            z = true;
        }
        if (!z) {
            count_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.edit().putString("com.scb.phone.pref.key.API_REFRESH", header2).commit();
        }
        return proceed;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "fingerprintInterceptor")
    @HmlSetNTBPinActivity
    public Interceptor MediaBrowserCompat$CustomActionResultReceiver(count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver) {
        return new DataHolder.Builder(count_mediabrowsercompat_customactionresultreceiver);
    }

    public static /* synthetic */ Response MediaBrowserCompat$CustomActionResultReceiver(count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver, Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder method = request.newBuilder().method(request.method(), request.body());
        method.addHeader("Api-Refresh", count_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.getString("com.scb.phone.pref.key.API_REFRESH", ""));
        return chain.proceed(method.build());
    }

    @HmlSetNTBPinActivity
    public Converter.Factory read() {
        return GsonConverterFactory.create(new GsonBuilder().setDateFormat("yyyy-MMM-dd'T'HH:mm:ss.SSSZ").setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).setLenient().registerTypeAdapterFactory(new paddedPartition.IconCompatParcelizer()).create());
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "PlainTextConverter")
    @HmlSetNTBPinActivity
    public Converter.Factory MediaBrowserCompat$SearchResultReceiver() {
        return ScalarsConverterFactory.create();
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "BillPaymentConverter")
    @HmlSetNTBPinActivity
    public Converter.Factory IconCompatParcelizer() {
        return GsonConverterFactory.create(new GsonBuilder().registerTypeAdapterFactory(new paddedPartition.IconCompatParcelizer()).registerTypeAdapter(C1251R.dimen.class, new TaskUtil$MediaBrowserCompat$ItemReceiver(new Gson())).create());
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "CCContentServiceConverter")
    @HmlSetNTBPinActivity
    public Converter.Factory write() {
        return GsonConverterFactory.create(new GsonBuilder().registerTypeAdapter(getIsAdIdFakeForDebugLogging.class, new resetOverride$MediaBrowserCompat$ItemReceiver(new Gson())).create());
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "RewardRedemptionConverter")
    @HmlSetNTBPinActivity
    public Converter.Factory MediaMetadataCompat() {
        Gson gson = new Gson();
        return GsonConverterFactory.create(new GsonBuilder().registerTypeAdapter(DeepLinkUri.Builder.ParseResult.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(getFontPath.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(endSection.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(buildDrawingCache.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(LottieAnimationView.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(addLottieOnCompositionLoadedListener.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).create());
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "CardManagementConverter")
    @HmlSetNTBPinActivity
    public Converter.Factory MediaBrowserCompat$CustomActionResultReceiver() {
        Gson gson = new Gson();
        return GsonConverterFactory.create(new GsonBuilder().registerTypeAdapter(query.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(username.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(queryParameterValues.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(DeepLinkUri.Builder.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(schemeDelimiterOffset.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(decodeIpv6.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(containsInvalidHostnameAsciiCodes.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(inet6AddressToAscii.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(domainToAscii.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(effectivePort.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(resolvePath.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(addEncodedPathSegment.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(addEncodedQueryParameter.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(removeAllQueryParameters.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(skipTrailingAsciiWhitespace.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).registerTypeAdapter(removeAllEncodedQueryParameters.class, new resetOverride$MediaBrowserCompat$ItemReceiver(gson)).create());
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "GenSlipConverter")
    @HmlSetNTBPinActivity
    public Converter.Factory MediaBrowserCompat$ItemReceiver() {
        Gson gson = new Gson();
        return GsonConverterFactory.create(new GsonBuilder().registerTypeAdapter(removeLottieOnCompositionLoadedListener.class, new setPageMarginDrawable(gson)).create());
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "TilesConverter")
    @HmlSetNTBPinActivity
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Converter.Factory mo13212x50fd9e4a() {
        return GsonConverterFactory.create(new GsonBuilder().registerTypeAdapter(KeyframeParser.class, new pathInterpolatorCache()).setDateFormat("yyyy-MMM-dd'T'HH:mm:ss.SSSZ").setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).setLenient().create());
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "SimpleXMLConverter")
    @HmlSetNTBPinActivity
    public Converter.Factory MediaSessionCompat$Token() {
        return SimpleXmlConverterFactory.create();
    }

    public CallAdapter.Factory MediaBrowserCompat$MediaItem() {
        return zabr.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
