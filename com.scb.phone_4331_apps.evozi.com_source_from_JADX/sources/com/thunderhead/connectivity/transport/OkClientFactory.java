package com.thunderhead.connectivity.transport;

import com.thunderhead.connectivity.transport.retrofitv2.OneAddMetaInformationInterceptor;
import com.thunderhead.connectivity.transport.retrofitv2.oauth.OAuthSignInterceptor;
import com.thunderhead.connectivity.transport.retrofitv2.oauth.Retrofit2HttpOAuthConsumer;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import p040o.AlertController$RecycleListView;
import p040o.EasycashDFWYNCaseModule;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindStatementChannelLandingFragment;
import p040o.MyECouponActivity_ViewBinding;

public final class OkClientFactory {
    /* access modifiers changed from: private */
    public static volatile OkHttpClient allowedInteractionsApiClient;
    /* access modifiers changed from: private */
    public static volatile OkHttpClient notificationAssetLoadingClient;
    /* access modifiers changed from: private */
    public static volatile OkHttpClient runtimeClient;

    private OkClientFactory() {
    }

    public static OkHttpClient getAllowedInteractionsApiClient() {
        if (allowedInteractionsApiClient == null) {
            synchronized (OkClientFactory.class) {
                if (allowedInteractionsApiClient == null) {
                    HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor($$Lambda$OkClientFactory$WXSS6T96AIZYoNPNLVHBSGUFFrM.INSTANCE);
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    builder.connectTimeout(5, ServiceConstants.TIME_UNIT);
                    builder.readTimeout(20, ServiceConstants.TIME_UNIT);
                    OkHttpClient.Builder IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer(builder);
                    IconCompatParcelizer.addInterceptor(new EasycashDFWYNCaseModule());
                    IconCompatParcelizer.addInterceptor(httpLoggingInterceptor);
                    allowedInteractionsApiClient = IconCompatParcelizer.build();
                }
            }
        }
        return allowedInteractionsApiClient;
    }

    public static OkHttpClient getRuntimeHttpClient(Retrofit2HttpOAuthConsumer retrofit2HttpOAuthConsumer) {
        if (runtimeClient == null) {
            createRuntimeHttpClient(retrofit2HttpOAuthConsumer);
        }
        return runtimeClient;
    }

    public static void createRuntimeHttpClient(Retrofit2HttpOAuthConsumer retrofit2HttpOAuthConsumer) {
        synchronized (OkClientFactory.class) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor($$Lambda$OkClientFactory$eT8Kh5CCVQGhp4K2S1Q28ZeiGOk.INSTANCE);
            httpLoggingInterceptor.setLevel(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver());
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.connectTimeout(5, ServiceConstants.TIME_UNIT);
            builder.readTimeout(5, ServiceConstants.TIME_UNIT);
            builder.addInterceptor(new FragmentBuilder_BindStatementChannelLandingFragment(FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()));
            builder.addInterceptor(new OAuthSignInterceptor(retrofit2HttpOAuthConsumer));
            builder.addInterceptor(new OneAddMetaInformationInterceptor());
            builder.addInterceptor(new EasycashDFWYNCaseModule());
            builder.addInterceptor(httpLoggingInterceptor);
            builder.retryOnConnectionFailure(false);
            runtimeClient = AlertController$RecycleListView.IconCompatParcelizer(builder).build();
        }
    }

    public static OkHttpClient getNotificationResourceLoaderHttpClient() {
        if (notificationAssetLoadingClient == null) {
            synchronized (OkClientFactory.class) {
                if (notificationAssetLoadingClient == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    builder.connectTimeout(5, ServiceConstants.TIME_UNIT);
                    builder.readTimeout(10, ServiceConstants.TIME_UNIT);
                    OkHttpClient.Builder IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer(builder);
                    IconCompatParcelizer.addInterceptor(new EasycashDFWYNCaseModule());
                    notificationAssetLoadingClient = IconCompatParcelizer.build();
                }
            }
        }
        return notificationAssetLoadingClient;
    }

    public static void flushConnectionsPools() {
        synchronized (OkClientFactory.class) {
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        if (OkClientFactory.runtimeClient != null) {
                            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Flushing runtime connection pool.");
                            OkClientFactory.runtimeClient.connectionPool().evictAll();
                        }
                        if (OkClientFactory.notificationAssetLoadingClient != null) {
                            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Flushing notification connection pool.");
                            OkClientFactory.notificationAssetLoadingClient.connectionPool().evictAll();
                        }
                        if (OkClientFactory.allowedInteractionsApiClient != null) {
                            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Flushing allowed interactions api connection pool.");
                            OkClientFactory.allowedInteractionsApiClient.connectionPool().evictAll();
                        }
                        MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Flushing designtime connection pool.");
                        FragmentBuilder_BindHmlIssuerLandingFragment.ParcelableVolumeInfo().connectionPool().evictAll();
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to clean connections pool: ");
                        sb.append(e.getMessage());
                        MyECouponActivity_ViewBinding.write(sb.toString());
                        MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                    }
                }
            }).start();
        }
    }
}
