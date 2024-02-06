package p039io.beid.beidk;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;

/* renamed from: io.beid.beidk.BEIDConfigurationFactory */
public class BEIDConfigurationFactory implements Parcelable {
    public static final Parcelable.Creator<BEIDConfigurationFactory> CREATOR = new Parcelable.Creator<BEIDConfigurationFactory>() {
        public final BEIDConfigurationFactory createFromParcel(Parcel parcel) {
            return new BEIDConfigurationFactory(parcel);
        }

        public final BEIDConfigurationFactory[] newArray(int i) {
            return new BEIDConfigurationFactory[i];
        }
    };
    private String IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private Integer MediaBrowserCompat$ItemReceiver;
    private InputStream MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    private OkHttpClient RatingCompat;
    private Boolean read;
    private String write;

    /* renamed from: io.beid.beidk.BEIDConfigurationFactory$Builder */
    public static class Builder {
        private String IconCompatParcelizer;
        private Integer MediaBrowserCompat$CustomActionResultReceiver = 30;
        private String MediaBrowserCompat$ItemReceiver = "";
        private String MediaDescriptionCompat = "Swagger-Codegen/1.0.0/java";
        private InputStream RatingCompat;
        private Boolean read = Boolean.FALSE;
        private String write = "";

        public BEIDConfigurationFactory Build() {
            return new BEIDConfigurationFactory(this.IconCompatParcelizer, this.write, this.MediaBrowserCompat$ItemReceiver, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.RatingCompat, this.MediaDescriptionCompat);
        }

        public Builder setApiTimeOut(Integer num) {
            this.MediaBrowserCompat$CustomActionResultReceiver = num;
            return this;
        }

        public Builder setBaseUrl(String str) throws URISyntaxException {
            URI uri = new URI(str);
            this.IconCompatParcelizer = str;
            this.write = uri.getHost();
            return this;
        }

        public Builder setCertificate(InputStream inputStream) {
            this.RatingCompat = inputStream;
            return this;
        }

        public Builder setHostname(String str) {
            this.write = str;
            return this;
        }

        public Builder setSSLPublicKey(String str) {
            this.MediaBrowserCompat$ItemReceiver = str;
            return this;
        }

        public Builder setUseSSL(Boolean bool) {
            this.read = bool;
            return this;
        }

        public Builder setUserAgent(String str) {
            this.MediaDescriptionCompat = str;
            return this;
        }
    }

    /* renamed from: io.beid.beidk.BEIDConfigurationFactory$MissingParameterException */
    public static class MissingParameterException extends Exception {
        public MissingParameterException(String str) {
            super(str);
        }
    }

    protected BEIDConfigurationFactory(Parcel parcel) {
        boolean z = true;
        new TrustManager[1][0] = new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
        this.IconCompatParcelizer = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = Boolean.valueOf(parcel.readInt() != 1 ? false : z);
        this.MediaBrowserCompat$ItemReceiver = Integer.valueOf(parcel.readInt());
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        int readInt = parcel.readInt();
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        if (readInt > 0) {
            this.MediaBrowserCompat$MediaItem = new ByteArrayInputStream(bArr);
        }
    }

    public BEIDConfigurationFactory(String str, String str2, String str3, Boolean bool, Integer num, InputStream inputStream, String str4) {
        new TrustManager[1][0] = new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.read = bool;
        this.MediaBrowserCompat$ItemReceiver = num;
        this.MediaBrowserCompat$MediaItem = inputStream;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
    }

    public static Builder Builder() {
        return new Builder();
    }

    public int describeContents() {
        return 0;
    }

    public Integer getApiTimeOut() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public String getBaseUrl() {
        return this.IconCompatParcelizer;
    }

    public String getHostname() {
        return this.write;
    }

    public OkHttpClient getHttpClient() throws MissingParameterException, NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException, KeyManagementException {
        if (this.RatingCompat == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            if (getUseSSL().booleanValue() && Build.VERSION.SDK_INT <= 24) {
                if ("".equals(getSslPublicKey()) || getSslPublicKey() == null) {
                    throw new MissingParameterException("sslPublicKey is required when useSSl is true");
                }
                if (this.MediaBrowserCompat$MediaItem != null) {
                    Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(this.MediaBrowserCompat$MediaItem);
                    if (generateCertificate != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("ca=");
                        sb.append(generateCertificate.getType());
                        Log.i("ContentValues", sb.toString());
                    }
                    KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
                    instance.load((InputStream) null, (char[]) null);
                    instance.setCertificateEntry("ca", generateCertificate);
                    TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    instance2.init(instance);
                    SSLContext instance3 = SSLContext.getInstance("TLS");
                    instance3.init((KeyManager[]) null, instance2.getTrustManagers(), (SecureRandom) null);
                    builder.sslSocketFactory(instance3.getSocketFactory());
                }
                builder.hostnameVerifier(new HostnameVerifier() {
                    public boolean verify(String str, SSLSession sSLSession) {
                        return HttpsURLConnection.getDefaultHostnameVerifier().verify(BEIDConfigurationFactory.this.getHostname(), sSLSession);
                    }
                });
                builder.certificatePinner(new CertificatePinner.Builder().add(getHostname(), getSslPublicKey()).build());
            }
            builder.connectTimeout((long) getApiTimeOut().intValue(), TimeUnit.SECONDS).readTimeout((long) getApiTimeOut().intValue(), TimeUnit.SECONDS).writeTimeout((long) getApiTimeOut().intValue(), TimeUnit.SECONDS);
            this.RatingCompat = builder.build();
        }
        return this.RatingCompat;
    }

    public String getSslPublicKey() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public Boolean getUseSSL() {
        return this.read;
    }

    public String getUserAgent() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public void setBaseUrl(String str) {
        this.IconCompatParcelizer = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        try {
            if (this.MediaBrowserCompat$MediaItem != null) {
                this.MediaBrowserCompat$MediaItem.reset();
                bArr = new byte[this.MediaBrowserCompat$MediaItem.available()];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[4096];
                while (this.MediaBrowserCompat$MediaItem.read(bArr2) != -1) {
                    byteArrayOutputStream.write(bArr2);
                }
                byteArrayOutputStream.write(bArr);
            } else {
                bArr = null;
            }
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.write);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeInt(this.read.booleanValue() ? 1 : 0);
            parcel.writeInt(this.MediaBrowserCompat$ItemReceiver.intValue());
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(bArr);
                return;
            }
            parcel.writeInt(0);
            parcel.writeByteArray(new byte[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
