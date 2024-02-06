package com.kofax.mobile.sdk.p015ak;

import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p040o.AccountRepaymentPlanSelectorViewHolder;
import p040o.BusinessAndMaritalInfoHeaderViewHolder;
import p040o.BusinessAndMaritalInfoInputViewHolder;

/* renamed from: com.kofax.mobile.sdk.ak.d */
public class C8284d {
    /* renamed from: a */
    public static HttpURLConnection m4660a(URL url, CertificateValidatorListener certificateValidatorListener) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        if (url.getProtocol().equalsIgnoreCase("https") && (httpURLConnection instanceof HttpsURLConnection) && certificateValidatorListener != null) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            SSLSocketFactory sSLSocketFactory = certificateValidatorListener.getSSLSocketFactory(url.getHost());
            if (sSLSocketFactory != null) {
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
            }
        }
        return httpURLConnection;
    }

    /* renamed from: a */
    public static AccountRepaymentPlanSelectorViewHolder m4661a(String str, int i, CertificateValidatorListener certificateValidatorListener) throws IOException {
        AccountRepaymentPlanSelectorViewHolder accountRepaymentPlanSelectorViewHolder;
        URL url = new URL(str);
        if (url.getProtocol().equalsIgnoreCase("https")) {
            String host = url.getHost();
            int port = url.getPort();
            String path = url.getPath();
            if (port == -1) {
                port = 443;
            }
            accountRepaymentPlanSelectorViewHolder = new BusinessAndMaritalInfoHeaderViewHolder(host, port, path, i);
            if (certificateValidatorListener != null) {
                BusinessAndMaritalInfoInputViewHolder businessAndMaritalInfoInputViewHolder = (BusinessAndMaritalInfoInputViewHolder) accountRepaymentPlanSelectorViewHolder.read();
                SSLSocketFactory sSLSocketFactory = certificateValidatorListener.getSSLSocketFactory(url.getHost());
                if (sSLSocketFactory != null) {
                    businessAndMaritalInfoInputViewHolder.read.setSSLSocketFactory(sSLSocketFactory);
                }
            }
        } else {
            accountRepaymentPlanSelectorViewHolder = new AccountRepaymentPlanSelectorViewHolder(str, i);
        }
        accountRepaymentPlanSelectorViewHolder.write = true;
        return accountRepaymentPlanSelectorViewHolder;
    }

    /* renamed from: a */
    public static AccountRepaymentPlanSelectorViewHolder m4662a(String str, CertificateValidatorListener certificateValidatorListener) throws IOException {
        return m4661a(str, 20000, certificateValidatorListener);
    }

    /* renamed from: aH */
    public static AccountRepaymentPlanSelectorViewHolder m4663aH(String str) throws IOException {
        return m4661a(str, 20000, (CertificateValidatorListener) null);
    }
}
