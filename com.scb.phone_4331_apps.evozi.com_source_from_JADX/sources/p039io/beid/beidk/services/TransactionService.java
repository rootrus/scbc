package p039io.beid.beidk.services;

import android.util.Log;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import okhttp3.Call;
import p039io.beid.beidk.BEIDConfigurationFactory;
import p039io.beid.beidk.definitions.BeIDParams;
import p039io.beid.beidk.definitions.LivenessStatus;
import p039io.beid.beidk.definitions.SCBHeader;
import p039io.beid.beidk.definitions.TransactionUploadFileType;
import p039io.beid.beidk.messages.transaction.MatchingForm;
import p039io.beid.beidk.messages.transaction.MatchingResult;
import p039io.beid.beidk.messages.transaction.PassportVerifyForm;
import p039io.beid.beidk.messages.transaction.PassportVerifyResult;
import p039io.beid.beidk.messages.transaction.TransactionBeginForm;
import p039io.beid.beidk.messages.transaction.TransactionBeginResult;
import p039io.beid.beidk.p085a.C9605b;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.C6372x3d677cbb;
import p040o.GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder;
import p040o.ProductDetailActivity_ViewBinding;
import p040o.QuantitySelectionActivity;
import p040o.ReviewRedemptionActivity;
import p040o.RewardSearchActivity;
import p040o.RewardSearchActivity_ViewBinding;
import p040o.RewardSearchResultActivity;
import p040o.onButtonClearClick;
import p040o.onFilterButtonClick;

/* renamed from: io.beid.beidk.services.TransactionService */
public class TransactionService {
    private BEIDConfigurationFactory MediaBrowserCompat$CustomActionResultReceiver;
    private final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder MediaBrowserCompat$ItemReceiver;
    private final String read;

    public TransactionService(BEIDConfigurationFactory.Builder builder) {
        this(builder.Build());
    }

    public TransactionService(BEIDConfigurationFactory bEIDConfigurationFactory) {
        this(bEIDConfigurationFactory.getBaseUrl());
        this.MediaBrowserCompat$CustomActionResultReceiver = bEIDConfigurationFactory;
    }

    public TransactionService(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new BEIDConfigurationFactory("http://api.beid.io", "", "", Boolean.FALSE, 30, (InputStream) null, "");
        this.read = (str == null ? "" : str).replaceAll("/*$", "");
        this.MediaBrowserCompat$ItemReceiver = GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ofPattern("yyyy-MM-dd HH:mm:ss.S");
    }

    public BScanCNotificationDeepLinkActivity<TransactionBeginResult> begin(final TransactionBeginForm transactionBeginForm, final Map<String, String> map) {
        return BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new Callable<TransactionBeginResult>() {
            public final /* synthetic */ Object call() throws Exception {
                return TransactionService.this.beginSync(transactionBeginForm, map);
            }
        });
    }

    public BScanCNotificationDeepLinkActivity<MatchingResult> match(final MatchingForm matchingForm, final Map<String, String> map) {
        return BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new Callable<MatchingResult>() {
            public final /* synthetic */ Object call() throws Exception {
                return TransactionService.this.matchSync(matchingForm, map);
            }
        });
    }

    public BScanCNotificationDeepLinkActivity<Boolean> uploadDocument(String str, TransactionUploadFileType transactionUploadFileType, InputStream inputStream, String str2, Map<String, String> map) {
        final String str3 = str;
        final TransactionUploadFileType transactionUploadFileType2 = transactionUploadFileType;
        final InputStream inputStream2 = inputStream;
        final String str4 = str2;
        final Map<String, String> map2 = map;
        return BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new Callable<Boolean>() {
            public final /* synthetic */ Object call() throws Exception {
                return Boolean.valueOf(TransactionService.this.uploadDocumentSync(str3, transactionUploadFileType2, inputStream2, str4, map2));
            }
        });
    }

    public BScanCNotificationDeepLinkActivity<PassportVerifyResult> verifyPassport(final PassportVerifyForm passportVerifyForm, final Map<String, String> map) {
        return BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new Callable<PassportVerifyResult>() {
            public final /* synthetic */ Object call() throws Exception {
                return TransactionService.this.verifyPassportSync(passportVerifyForm, map);
            }
        });
    }

    private RewardSearchActivity MediaBrowserCompat$ItemReceiver(BEIDConfigurationFactory bEIDConfigurationFactory, Map<String, String> map) throws BEIDConfigurationFactory.MissingParameterException, NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException, KeyManagementException {
        onFilterButtonClick onfilterbuttonclick = new onFilterButtonClick();
        onfilterbuttonclick.read = bEIDConfigurationFactory.getHttpClient();
        onfilterbuttonclick.MediaBrowserCompat$CustomActionResultReceiver.put("User-Agent", bEIDConfigurationFactory.getUserAgent());
        return MediaBrowserCompat$CustomActionResultReceiver(onfilterbuttonclick, map);
    }

    private RewardSearchActivity MediaBrowserCompat$CustomActionResultReceiver(onFilterButtonClick onfilterbuttonclick, Map<String, String> map) {
        try {
            onfilterbuttonclick.write = this.read;
            onfilterbuttonclick.MediaBrowserCompat$CustomActionResultReceiver.put(SCBHeader.SCB_REQ_HEADER_REQUEST_ID, UUID.randomUUID().toString());
            for (String next : map.keySet()) {
                onfilterbuttonclick.MediaBrowserCompat$CustomActionResultReceiver.put(next, map.get(next));
            }
            RewardSearchActivity rewardSearchActivity = new RewardSearchActivity();
            rewardSearchActivity.MediaBrowserCompat$ItemReceiver = onfilterbuttonclick;
            return rewardSearchActivity;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static PassportVerifyResult write(ReviewRedemptionActivity reviewRedemptionActivity) {
        String str;
        PassportVerifyResult passportVerifyResult = new PassportVerifyResult();
        passportVerifyResult.result = reviewRedemptionActivity.MediaBrowserCompat$CustomActionResultReceiver;
        ReviewRedemptionActivity.write write = reviewRedemptionActivity.MediaBrowserCompat$ItemReceiver;
        String str2 = "";
        if (write == null) {
            str = str2;
        } else {
            str = write.f5527h.toString();
        }
        passportVerifyResult.errorCode = str;
        String str3 = reviewRedemptionActivity.read;
        if (str3 != null) {
            str2 = str3;
        }
        passportVerifyResult.error = str2;
        return passportVerifyResult;
    }

    private TransactionBeginResult IconCompatParcelizer(RewardSearchResultActivity rewardSearchResultActivity) {
        TransactionBeginResult transactionBeginResult = new TransactionBeginResult();
        transactionBeginResult.transactionId = rewardSearchResultActivity.write;
        List<BigDecimal> list = rewardSearchResultActivity.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        for (BigDecimal intValueExact : list) {
            arrayList.add(Integer.valueOf(intValueExact.intValueExact()));
        }
        transactionBeginResult.livenessActivity = arrayList;
        transactionBeginResult.livenessAcceptance = rewardSearchResultActivity.MediaBrowserCompat$CustomActionResultReceiver;
        transactionBeginResult.serverTimestamp = rewardSearchResultActivity.read.format(this.MediaBrowserCompat$ItemReceiver);
        transactionBeginResult.timeout = rewardSearchResultActivity.MediaBrowserCompat$ItemReceiver.format(this.MediaBrowserCompat$ItemReceiver);
        return transactionBeginResult;
    }

    public TransactionBeginResult beginSync(TransactionBeginForm transactionBeginForm, Map<String, String> map) throws IOException, BEIDConfigurationFactory.MissingParameterException, NoSuchAlgorithmException, KeyStoreException, CertificateException, KeyManagementException {
        try {
            RewardSearchActivity MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, map);
            RewardSearchActivity_ViewBinding rewardSearchActivity_ViewBinding = new RewardSearchActivity_ViewBinding();
            rewardSearchActivity_ViewBinding.write = transactionBeginForm.applicationName;
            rewardSearchActivity_ViewBinding.read = transactionBeginForm.deviceId;
            rewardSearchActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = transactionBeginForm.platformId;
            rewardSearchActivity_ViewBinding.IconCompatParcelizer = "c0436fa";
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap.put("Content-Type", onFilterButtonClick.MediaBrowserCompat$ItemReceiver(new String[]{"application/json"}));
            return IconCompatParcelizer((RewardSearchResultActivity) MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver.write(MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver.write("/transaction/begin", "POST", arrayList, arrayList2, rewardSearchActivity_ViewBinding, hashMap, hashMap2, new String[0], (C6372x3d677cbb) null), new TypeToken<RewardSearchResultActivity>() {
            }.getType()).MediaBrowserCompat$ItemReceiver);
        } catch (C9605b e) {
            TransactionBeginResult transactionBeginResult = new TransactionBeginResult();
            transactionBeginResult.transactionId = "-1";
            transactionBeginResult.error = e.getMessage();
            return transactionBeginResult;
        }
    }

    public MatchingResult matchSync(MatchingForm matchingForm, Map<String, String> map) throws IOException, BEIDConfigurationFactory.MissingParameterException, NoSuchAlgorithmException, KeyStoreException, CertificateException, KeyManagementException {
        RewardSearchActivity MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, map);
        QuantitySelectionActivity quantitySelectionActivity = new QuantitySelectionActivity();
        quantitySelectionActivity.MediaBrowserCompat$CustomActionResultReceiver = matchingForm.transactionId;
        quantitySelectionActivity.MediaBrowserCompat$ItemReceiver = matchingForm.faceSelfie;
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap.put("Content-Type", onFilterButtonClick.MediaBrowserCompat$ItemReceiver(new String[0]));
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver.write(MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver.write("/transaction/matching", "POST", arrayList, arrayList2, quantitySelectionActivity, hashMap, hashMap2, new String[0], (C6372x3d677cbb) null), new TypeToken<Object>() {
            }.getType());
            return new MatchingResult();
        } catch (C9605b e) {
            MatchingResult matchingResult = new MatchingResult();
            matchingResult.error = e.read == 403 ? LivenessStatus.ERROR_MATCHING_FAIL : e.getMessage();
            return matchingResult;
        }
    }

    public boolean uploadDocumentSync(String str, TransactionUploadFileType transactionUploadFileType, InputStream inputStream, String str2, Map<String, String> map) throws IOException, BEIDConfigurationFactory.MissingParameterException, NoSuchAlgorithmException, KeyStoreException, CertificateException, KeyManagementException {
        File file;
        String str3 = str;
        String str4 = str2;
        RewardSearchActivity MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, map);
        try {
            String obj = transactionUploadFileType.getValue().toString();
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            StringBuilder sb = new StringBuilder();
            sb.append("upload_");
            sb.append(UUID.randomUUID());
            String obj2 = sb.toString();
            if (ProductDetailActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver == null) {
                file = null;
            } else {
                file = ProductDetailActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.getCacheDir();
            }
            File createTempFile = File.createTempFile(obj2, (String) null, file);
            new FileOutputStream(createTempFile).write(bArr);
            if (str3 == null) {
                throw new C9605b("Missing the required parameter 'transactionId' when calling upload(Async)");
            } else if (obj == null) {
                throw new C9605b("Missing the required parameter 'fileType' when calling upload(Async)");
            } else if (str4 == null) {
                throw new C9605b("Missing the required parameter 'meta' when calling upload(Async)");
            } else if (createTempFile != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                if (str3 != null) {
                    hashMap2.put(BeIDParams.BEID_TRANSACTION_ID, str3);
                }
                if (obj != null) {
                    hashMap2.put("fileType", obj);
                }
                if (str4 != null) {
                    hashMap2.put("meta", str4);
                }
                if (createTempFile != null) {
                    hashMap2.put("file", createTempFile);
                }
                hashMap.put("Content-Type", onFilterButtonClick.MediaBrowserCompat$ItemReceiver(new String[]{"multipart/form-data"}));
                Call write = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver.write("/transaction/upload", "POST", arrayList, arrayList2, (Object) null, hashMap, hashMap2, new String[0], (C6372x3d677cbb) null);
                Type type = new TypeToken<String>() {
                }.getType();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("prepareUploadResponse: ");
                sb2.append((String) MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver.write(write, type).MediaBrowserCompat$ItemReceiver);
                Log.i("transactionService", sb2.toString());
                return true;
            } else {
                throw new C9605b("Missing the required parameter 'file' when calling upload(Async)");
            }
        } catch (C9605b e) {
            Log.e(getClass().getName(), "uploadDocumentSync: ", e);
            return false;
        }
    }

    public PassportVerifyResult verifyPassportSync(PassportVerifyForm passportVerifyForm, Map<String, String> map) throws IOException, BEIDConfigurationFactory.MissingParameterException, NoSuchAlgorithmException, KeyStoreException, CertificateException, KeyManagementException {
        RewardSearchActivity MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, map);
        onButtonClearClick onbuttonclearclick = new onButtonClearClick();
        onbuttonclearclick.write = passportVerifyForm.transactionId;
        onbuttonclearclick.IconCompatParcelizer = passportVerifyForm.DG1;
        onbuttonclearclick.MediaBrowserCompat$ItemReceiver = passportVerifyForm.DG2;
        onbuttonclearclick.read = passportVerifyForm.DG13;
        onbuttonclearclick.MediaBrowserCompat$CustomActionResultReceiver = passportVerifyForm.SOD;
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap.put("Content-Type", onFilterButtonClick.MediaBrowserCompat$ItemReceiver(new String[0]));
            return write((ReviewRedemptionActivity) MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver.write(MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver.write("/transaction/passport/verify", "POST", arrayList, arrayList2, onbuttonclearclick, hashMap, hashMap2, new String[0], (C6372x3d677cbb) null), new TypeToken<ReviewRedemptionActivity>() {
            }.getType()).MediaBrowserCompat$ItemReceiver);
        } catch (C9605b unused) {
            ReviewRedemptionActivity reviewRedemptionActivity = new ReviewRedemptionActivity();
            reviewRedemptionActivity.MediaBrowserCompat$CustomActionResultReceiver = "fail";
            reviewRedemptionActivity.read = "invalid payload";
            reviewRedemptionActivity.MediaBrowserCompat$ItemReceiver = ReviewRedemptionActivity.write._400;
            return write(reviewRedemptionActivity);
        }
    }
}
