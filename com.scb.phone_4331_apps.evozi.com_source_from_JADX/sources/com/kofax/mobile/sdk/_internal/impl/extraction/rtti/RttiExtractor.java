package com.kofax.mobile.sdk._internal.impl.extraction.rtti;

import android.text.TextUtils;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.extraction.C7899a;
import com.kofax.mobile.sdk._internal.extraction.C7905h;
import com.kofax.mobile.sdk._internal.extraction.DataUnit;
import com.kofax.mobile.sdk._internal.impl.extraction.C7982a;
import com.kofax.mobile.sdk._internal.impl.extraction.C7992j;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.p015ak.C8284d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p040o.BankingServiceAdapter$CustomViewHolder;
import p040o.C9698x5b61c61d;
import p040o.C9699x9b8f7d27;
import p040o.DebitWithdrawalLimitAdapter$LimitCustomViewHolder;
import p040o.DebitWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding;
import p040o.HmlPinActivity;
import p040o.PurchaseWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding;

public class RttiExtractor extends C7982a {
    private static final String TAG = RttiExtractor.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: JH */
    public final IImageToByteArray f4205JH;

    /* renamed from: JI */
    private CertificateValidatorListener f4206JI;

    /* renamed from: SI */
    private ExtractionParameters f4207SI;

    /* access modifiers changed from: protected */
    public void updateRttiRequest(RttiRequest rttiRequest) {
    }

    @HmlPinActivity
    public RttiExtractor(IImageToByteArray iImageToByteArray) {
        this.f4205JH = iImageToByteArray;
    }

    public void extractInBackground(DataUnit dataUnit) {
        try {
            URL url = new URL(this.f4207SI.serverUrl);
            RttiRequest rttiRequest = new RttiRequest();
            for (Image addImage : dataUnit.images) {
                rttiRequest.addImage(addImage);
            }
            updateRttiRequest(rttiRequest);
            HttpURLConnection a = C8284d.m4660a(url, this.f4206JI);
            a.setRequestMethod("POST");
            a.setConnectTimeout(60000);
            a.setUseCaches(false);
            a.setDoInput(true);
            a.setDoOutput(true);
            DebitWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding a2 = rttiRequest.f4208SJ;
            if (a2.MediaBrowserCompat$ItemReceiver == null) {
                a2.MediaBrowserCompat$ItemReceiver = a2.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            }
            C9698x5b61c61d creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding = a2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            a.setRequestProperty("Connection", "Keep-Alive");
            StringBuilder sb = new StringBuilder();
            DebitWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding a3 = rttiRequest.f4208SJ;
            if (a3.MediaBrowserCompat$ItemReceiver == null) {
                a3.MediaBrowserCompat$ItemReceiver = a3.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            }
            sb.append(a3.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
            a.addRequestProperty("Content-length", sb.toString());
            a.setRequestProperty(creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer(), creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding.write());
            OutputStream outputStream = a.getOutputStream();
            DebitWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding a4 = rttiRequest.f4208SJ;
            OutputStream outputStream2 = a.getOutputStream();
            if (a4.MediaBrowserCompat$ItemReceiver == null) {
                a4.MediaBrowserCompat$ItemReceiver = a4.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            }
            a4.MediaBrowserCompat$ItemReceiver.write.IconCompatParcelizer(outputStream2, true);
            outputStream.flush();
            outputStream.close();
            a.connect();
            int responseCode = a.getResponseCode();
            if (responseCode == 200) {
                String convertStreamToString = convertStreamToString(a.getInputStream());
                dataUnit.success = true;
                dataUnit.returnData = new C7905h(responseCode, convertStreamToString);
                return;
            }
            throw new C7899a(new C7905h(responseCode, convertStreamToString(a.getErrorStream())));
        } catch (C7899a e) {
            C0767k.m1802b(TAG, "Error while executing request", (Throwable) e);
            dataUnit.success = false;
            dataUnit.returnData = e.f3660vK;
        } catch (IOException e2) {
            C0767k.m1802b(TAG, "Error while executing request", (Throwable) e2);
            dataUnit.success = false;
            dataUnit.returnData = C8183f.m4445d(e2);
        }
    }

    public void setCertificateValidatorListener(CertificateValidatorListener certificateValidatorListener) {
        this.f4206JI = certificateValidatorListener;
    }

    public void setParameters(ExtractionParameters extractionParameters) {
        this.f4207SI = extractionParameters;
    }

    public class RttiRequest {
        /* access modifiers changed from: private */

        /* renamed from: SJ */
        public final DebitWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding f4208SJ = new DebitWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding();

        /* renamed from: SK */
        private int f4209SK = 0;

        public RttiRequest() {
        }

        public void addImage(Image image) {
            byte[] convert = RttiExtractor.this.f4205JH.convert(image);
            String C = C7992j.m3942C(image);
            String D = C7992j.m3943D(image);
            StringBuilder sb = new StringBuilder();
            sb.append("file");
            sb.append(this.f4209SK);
            sb.append(D);
            BankingServiceAdapter$CustomViewHolder bankingServiceAdapter$CustomViewHolder = new BankingServiceAdapter$CustomViewHolder(convert, C, sb.toString());
            DebitWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding debitWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding = this.f4208SJ;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("image");
            sb2.append(this.f4209SK);
            C9699x9b8f7d27 creditCardDetailViewPagerAdapter$CreditCardItemViewHolder_ViewBinding = new C9699x9b8f7d27(sb2.toString(), bankingServiceAdapter$CustomViewHolder);
            DebitWithdrawalLimitAdapter$LimitCustomViewHolder debitWithdrawalLimitAdapter$LimitCustomViewHolder = debitWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            if (debitWithdrawalLimitAdapter$LimitCustomViewHolder.read == null) {
                debitWithdrawalLimitAdapter$LimitCustomViewHolder.read = new ArrayList();
            }
            debitWithdrawalLimitAdapter$LimitCustomViewHolder.read.add(creditCardDetailViewPagerAdapter$CreditCardItemViewHolder_ViewBinding);
            debitWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver = null;
            this.f4209SK++;
        }

        public void addStringPart(String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    Charset forName = Charset.forName("UTF-8");
                    DebitWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding debitWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding = this.f4208SJ;
                    C9699x9b8f7d27 creditCardDetailViewPagerAdapter$CreditCardItemViewHolder_ViewBinding = new C9699x9b8f7d27(str, new PurchaseWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding(str2, forName));
                    DebitWithdrawalLimitAdapter$LimitCustomViewHolder debitWithdrawalLimitAdapter$LimitCustomViewHolder = debitWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    if (debitWithdrawalLimitAdapter$LimitCustomViewHolder.read == null) {
                        debitWithdrawalLimitAdapter$LimitCustomViewHolder.read = new ArrayList();
                    }
                    debitWithdrawalLimitAdapter$LimitCustomViewHolder.read.add(creditCardDetailViewPagerAdapter$CreditCardItemViewHolder_ViewBinding);
                    debitWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver = null;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static String convertStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }
}
