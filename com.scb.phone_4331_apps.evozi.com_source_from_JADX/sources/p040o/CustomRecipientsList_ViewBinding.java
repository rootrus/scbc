package p040o;

import android.app.Activity;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.common.base.Ascii;
import com.kony.sdk.common.IdentityServiceException;
import com.kony.sdk.common.IntegrationServiceException;
import com.kony.sdk.common.KonyException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.Key;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.CustomRecipientsList_ViewBinding */
public class CustomRecipientsList_ViewBinding extends AsyncTask<Void, Void, Void> {
    /* access modifiers changed from: private */
    public static final String IconCompatParcelizer = CustomCardApplyViewComponent.class.getName();
    private static String MediaBrowserCompat$ItemReceiver = "sha";
    /* access modifiers changed from: private */
    public static final String write = CustomRecipientsList_ViewBinding.class.getName();
    private CustomEffectiveDate_ViewBinding<byte[], String> MediaBrowserCompat$CustomActionResultReceiver = new setEffectiveDate();
    /* access modifiers changed from: private */
    public Activity MediaBrowserCompat$MediaItem;
    private KeyStore MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private Map<String, String> f5807x50fd9e4a = new HashMap();
    /* access modifiers changed from: private */
    public setRemainingLimit<String> MediaDescriptionCompat;
    private ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding MediaMetadataCompat;
    private byte[] MediaSessionCompat$QueueItem;
    private IdExtractorResponse ParcelableVolumeInfo = null;
    private ETBEligibilityAdapter$EligibilityHolder_ViewBinding RatingCompat;
    private setSeparator<byte[], byte[], Key> read = new setSourceName();

    public CustomRecipientsList_ViewBinding(Activity activity, byte[] bArr, setRemainingLimit<String> setremaininglimit) {
        new HashMap();
        this.MediaBrowserCompat$MediaItem = activity;
        this.MediaSessionCompat$QueueItem = bArr;
        this.MediaDescriptionCompat = setremaininglimit;
    }

    public final void write() {
        try {
            String str = write;
            StringBuilder sb = new StringBuilder();
            sb.append("Integration Service ");
            setRecipients.MediaMetadataCompat();
            sb.append(setRecipients.MediaBrowserCompat$MediaItem());
            Log.e(str, sb.toString());
            setRecipients.MediaMetadataCompat();
            this.ParcelableVolumeInfo = new CHPR2(setRecipients.MediaBrowserCompat$MediaItem());
            try {
                String str2 = write;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" workstation Name");
                sb2.append(setRecipients.MediaMetadataCompat().setContentHeight);
                Log.e(str2, sb2.toString());
                this.MediaBrowserCompat$SearchResultReceiver = CustomStatementChannelViewComponent.IconCompatParcelizer();
                byte[] encoded = new SecretKeySpec("1234567890123456".getBytes(), "AES").getEncoded();
                byte[] MediaBrowserCompat$ItemReceiver2 = CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$ItemReceiver(encoded.length, 4);
                ByteBuffer allocate = ByteBuffer.allocate(MediaBrowserCompat$ItemReceiver2.length + encoded.length);
                allocate.put(MediaBrowserCompat$ItemReceiver2);
                allocate.put(encoded);
                byte[] MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(allocate.array());
                byte[] write2 = write((byte) 115, "Android Test WorkStation".getBytes());
                byte[] write3 = write((byte) 122, MediaBrowserCompat$CustomActionResultReceiver2);
                byte[] write4 = write((byte) 120, "C=SG, O=NECAP, CN=ePID".getBytes());
                byte[] write5 = write((byte) 121, "55 a4 bf f6".getBytes());
                byte[] write6 = write((byte) 118, setTermsAndConditionsListener.write().getBytes());
                byte[] write7 = write((byte) 117, setTermsAndConditionsListener.MediaBrowserCompat$CustomActionResultReceiver().getBytes());
                byte[] write8 = write((byte) 115, setRecipients.MediaMetadataCompat().setContentHeight.getBytes());
                byte[] write9 = write((byte) 125, "Once".getBytes());
                ByteBuffer allocate2 = ByteBuffer.allocate(write2.length + write3.length);
                allocate2.put(write2);
                allocate2.put(write3);
                byte[] array = allocate2.array();
                ByteBuffer allocate3 = ByteBuffer.allocate(write4.length + write5.length);
                allocate3.put(write4);
                allocate3.put(write5);
                byte[] array2 = allocate3.array();
                ByteBuffer allocate4 = ByteBuffer.allocate(write6.length + write7.length);
                allocate4.put(write6);
                allocate4.put(write7);
                byte[] array3 = allocate4.array();
                ByteBuffer allocate5 = ByteBuffer.allocate(write8.length + write9.length);
                allocate5.put(write8);
                allocate5.put(write9);
                byte[] array4 = allocate5.array();
                ByteBuffer allocate6 = ByteBuffer.allocate(array.length + array2.length);
                allocate6.put(array);
                allocate6.put(array2);
                byte[] array5 = allocate6.array();
                ByteBuffer allocate7 = ByteBuffer.allocate(array3.length + array4.length);
                allocate7.put(array3);
                allocate7.put(array4);
                byte[] array6 = allocate7.array();
                ByteBuffer allocate8 = ByteBuffer.allocate(array5.length + array6.length);
                allocate8.put(array5);
                allocate8.put(array6);
                byte[] array7 = allocate8.array();
                byte[] MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(read(array7));
                ByteBuffer allocate9 = ByteBuffer.allocate(MediaBrowserCompat$ItemReceiver3.length + array7.length);
                allocate9.put(MediaBrowserCompat$ItemReceiver3);
                allocate9.put(array7);
                byte[] array8 = allocate9.array();
                Log.i("RequestTokenEncData", Base64.encodeToString(array8, 0));
                String encodeToString = Base64.encodeToString(array8, 0);
                String str3 = write;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Client Info Body ");
                sb3.append(encodeToString);
                Log.e(str3, sb3.toString());
                this.f5807x50fd9e4a.put("clientInfo", encodeToString);
                this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver(setRecipients.MediaMetadataCompat().MediaBrowserCompat$CustomActionResultReceiver, this.f5807x50fd9e4a, new IdCaptureModule_GetIIdDeserializerOnDeviceFactory() {
                    public final void MediaBrowserCompat$ItemReceiver(JSONObject jSONObject) {
                        String MediaBrowserCompat$ItemReceiver = CustomRecipientsList_ViewBinding.write;
                        StringBuilder sb = new StringBuilder();
                        sb.append(" Kony RequestToken Response=");
                        sb.append(jSONObject);
                        Log.d(MediaBrowserCompat$ItemReceiver, sb.toString());
                        try {
                            String obj = jSONObject.get("return").toString();
                            if (obj != null) {
                                try {
                                    if (!new setTvTitle(obj).MediaBrowserCompat$ItemReceiver().read.equals("0")) {
                                        CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.write(obj.toString());
                                        Log.d(CustomRecipientsList_ViewBinding.IconCompatParcelizer, "Request Error");
                                        return;
                                    }
                                    CustomRecipientsList_ViewBinding.this.read();
                                    Log.d(CustomRecipientsList_ViewBinding.IconCompatParcelizer, "Request Token Successfully");
                                } catch (Exception e) {
                                    CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.read(e);
                                }
                            } else {
                                CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.write("Request Token Error!!!");
                                Log.d(CustomRecipientsList_ViewBinding.IconCompatParcelizer, "Request Error");
                            }
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                            CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.read(e2);
                        }
                    }

                    public final void MediaBrowserCompat$CustomActionResultReceiver(IntegrationServiceException integrationServiceException) {
                        Log.e(CustomRecipientsList_ViewBinding.write, " Kony RequestToken Failed");
                        integrationServiceException.printStackTrace();
                        CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.read(integrationServiceException);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                this.MediaDescriptionCompat.read(e);
            }
        } catch (KonyException e2) {
            e2.printStackTrace();
            this.MediaDescriptionCompat.read(e2);
        }
    }

    private byte[] MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr) {
        byte[] bArr2;
        Log.d(write, "encryptRSAData():");
        try {
            Cipher instance = Cipher.getInstance(setRecipients.MediaMetadataCompat().setIcon, setRecipients.MediaMetadataCompat().setItemInvoker);
            instance.init(1, this.MediaBrowserCompat$SearchResultReceiver.getCertificate("ca").getPublicKey());
            String str = write;
            StringBuilder sb = new StringBuilder();
            sb.append(" keystore public key = ");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver.getCertificate("ca").getPublicKey());
            Log.d(str, sb.toString());
            bArr2 = instance.doFinal(bArr);
        } catch (Exception e) {
            Log.d(write, "Exception occurred", e);
            this.MediaDescriptionCompat.read(e);
            e.printStackTrace();
            bArr2 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(write);
        sb2.append("encryptRSAData(): Done.");
        Log.d(sb2.toString(), bArr2.toString());
        return bArr2;
    }

    public final void read() {
        if (setRecipients.MediaMetadataCompat().setExpandedFormat) {
            String str = write;
            StringBuilder sb = new StringBuilder();
            sb.append("Integration Service ");
            Log.e(str, sb.toString());
            try {
                setRecipients.MediaMetadataCompat();
                this.ParcelableVolumeInfo = new CHPR2(setRecipients.MediaBrowserCompat$MediaItem());
                try {
                    SecretKeySpec secretKeySpec = new SecretKeySpec("1234567890123456".getBytes(), "AES");
                    byte[] MediaBrowserCompat$CustomActionResultReceiver2 = this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setRecipients.MediaMetadataCompat().MediaBrowserCompat$MediaItem), secretKeySpec);
                    String read2 = read(this.read, this.MediaBrowserCompat$CustomActionResultReceiver, setRecipients.MediaMetadataCompat().setTitle, new SecretKeySpec(Arrays.copyOfRange(MediaBrowserCompat$CustomActionResultReceiver2, 4, MediaBrowserCompat$CustomActionResultReceiver2.length), this.read.MediaBrowserCompat$CustomActionResultReceiver()), MediaBrowserCompat$ItemReceiver(this.MediaSessionCompat$QueueItem, setRecipients.MediaMetadataCompat().setShortcut));
                    this.f5807x50fd9e4a.put("tokenID", setRecipients.MediaMetadataCompat().setTitle);
                    this.f5807x50fd9e4a.put("encBioData", read2);
                    this.f5807x50fd9e4a.put("dataOption", "0");
                    Map<String, String> map = this.f5807x50fd9e4a;
                    setRecipients.MediaMetadataCompat();
                    map.put("clientId", setRecipients.MediaBrowserCompat$ItemReceiver());
                    Map<String, String> map2 = this.f5807x50fd9e4a;
                    setRecipients.MediaMetadataCompat();
                    map2.put("loginId", setRecipients.MediaDescriptionCompat());
                    Map<String, String> map3 = this.f5807x50fd9e4a;
                    setRecipients.MediaMetadataCompat();
                    map3.put("sessionId", setRecipients.MediaSessionCompat$Token());
                    this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver(setRecipients.MediaMetadataCompat().MediaBrowserCompat$ItemReceiver, this.f5807x50fd9e4a, new IdCaptureModule_GetIIdDeserializerOnDeviceFactory() {
                        public final void MediaBrowserCompat$ItemReceiver(JSONObject jSONObject) {
                            String MediaBrowserCompat$ItemReceiver = CustomRecipientsList_ViewBinding.write;
                            StringBuilder sb = new StringBuilder();
                            sb.append(" Kony SubmitBiometrics Response=");
                            sb.append(jSONObject);
                            Log.d(MediaBrowserCompat$ItemReceiver, sb.toString());
                            try {
                                String obj = jSONObject.get("return").toString();
                                if (obj != null) {
                                    CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.write(obj);
                                    return;
                                }
                                CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.write("SubmitBiometric Error!!!");
                                Log.d(CustomRecipientsList_ViewBinding.IconCompatParcelizer, "Submit Biometric Error");
                            } catch (JSONException e) {
                                e.printStackTrace();
                                CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.read(e);
                            }
                        }

                        public final void MediaBrowserCompat$CustomActionResultReceiver(IntegrationServiceException integrationServiceException) {
                            Log.e(CustomRecipientsList_ViewBinding.write, " Kony SubmitBiometric Failed");
                            integrationServiceException.printStackTrace();
                            CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.read(integrationServiceException);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    this.MediaDescriptionCompat.read(e);
                }
            } catch (KonyException e2) {
                e2.printStackTrace();
                this.MediaDescriptionCompat.read(e2);
            }
        } else {
            ETBDescriptionAdapter$DescriptionHolder eTBDescriptionAdapter$DescriptionHolder = new ETBDescriptionAdapter$DescriptionHolder("http://api.web.epid.asia.nec.com/", "submitBiometric");
            try {
                SecretKeySpec secretKeySpec2 = new SecretKeySpec("1234567890123456".getBytes(), "AES");
                byte[] MediaBrowserCompat$CustomActionResultReceiver3 = this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setRecipients.MediaMetadataCompat().MediaBrowserCompat$MediaItem), secretKeySpec2);
                String read3 = read(this.read, this.MediaBrowserCompat$CustomActionResultReceiver, setRecipients.MediaMetadataCompat().setTitle, new SecretKeySpec(Arrays.copyOfRange(MediaBrowserCompat$CustomActionResultReceiver3, 4, MediaBrowserCompat$CustomActionResultReceiver3.length), this.read.MediaBrowserCompat$CustomActionResultReceiver()), MediaBrowserCompat$ItemReceiver(this.MediaSessionCompat$QueueItem, setRecipients.MediaMetadataCompat().setShortcut));
                Log.e(write, "encrypted biodata done");
                eTBDescriptionAdapter$DescriptionHolder.MediaBrowserCompat$CustomActionResultReceiver("tokenID", (Object) setRecipients.MediaMetadataCompat().setTitle);
                eTBDescriptionAdapter$DescriptionHolder.MediaBrowserCompat$CustomActionResultReceiver("encBioData", (Object) read3);
                eTBDescriptionAdapter$DescriptionHolder.MediaBrowserCompat$CustomActionResultReceiver("dataOption", (Object) 0);
            } catch (Exception e3) {
                this.MediaDescriptionCompat.read(e3);
                e3.printStackTrace();
            }
            ETBEligibilityAdapter$EligibilityHolder eTBEligibilityAdapter$EligibilityHolder = new ETBEligibilityAdapter$EligibilityHolder();
            eTBEligibilityAdapter$EligibilityHolder.IconCompatParcelizer = eTBDescriptionAdapter$DescriptionHolder;
            Log.d("submit bio request", eTBDescriptionAdapter$DescriptionHolder.toString());
            setTermsAndConditionsListener.MediaBrowserCompat$ItemReceiver();
            if (setRecipients.MediaMetadataCompat().setChecked) {
                setRecipients.MediaMetadataCompat();
                String write2 = setRecipients.write();
                setRecipients.MediaMetadataCompat();
                int RatingCompat2 = setRecipients.RatingCompat();
                setRecipients.MediaMetadataCompat();
                ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding eTBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding = new ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding(write2, RatingCompat2, setRecipients.IconCompatParcelizer(), 120000);
                this.MediaMetadataCompat = eTBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding;
                eTBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = true;
            } else {
                ETBEligibilityAdapter$EligibilityHolder_ViewBinding eTBEligibilityAdapter$EligibilityHolder_ViewBinding = new ETBEligibilityAdapter$EligibilityHolder_ViewBinding(setRecipients.MediaMetadataCompat().AbsActionBarView);
                this.RatingCompat = eTBEligibilityAdapter$EligibilityHolder_ViewBinding;
                eTBEligibilityAdapter$EligibilityHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = true;
            }
            try {
                if (setRecipients.MediaMetadataCompat().setChecked) {
                    this.MediaMetadataCompat.read("http://api.web.epid.asia.nec.com/submitBiometric", eTBEligibilityAdapter$EligibilityHolder, (List) null);
                    String str2 = write;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("httpsTransportSE request");
                    sb2.append(this.MediaMetadataCompat.write);
                    Log.d(str2, sb2.toString());
                } else {
                    this.RatingCompat.read("http://api.web.epid.asia.nec.com/submitBiometric", eTBEligibilityAdapter$EligibilityHolder, (List) null);
                    String str3 = write;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("httpTransport request");
                    sb3.append(this.RatingCompat.write);
                    Log.d(str3, sb3.toString());
                }
                Object write3 = eTBEligibilityAdapter$EligibilityHolder.write();
                String str4 = write;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("submit response ");
                sb4.append(write3.toString());
                Log.d(str4, sb4.toString());
                this.MediaDescriptionCompat.write(write3.toString());
            } catch (Exception e4) {
                Log.d(write, e4.toString());
                this.MediaDescriptionCompat.read(e4);
            }
        }
    }

    private static String read(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest instance = MessageDigest.getInstance(MediaBrowserCompat$ItemReceiver);
        instance.reset();
        instance.update(bArr);
        byte[] digest = instance.digest();
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : digest) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("0");
                sb.append(hexString);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append(hexString);
            }
        }
        return stringBuffer.toString().toUpperCase();
    }

    private static byte[] MediaBrowserCompat$ItemReceiver(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    private static byte[] write(byte b, byte[] bArr) {
        byte[] bArr2 = new byte[(bArr.length + 4)];
        bArr2[0] = b;
        System.arraycopy(CustomCardApplyViewComponent_ViewBinding.IconCompatParcelizer(bArr.length, 3, ByteOrder.BIG_ENDIAN), 0, bArr2, 1, 3);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        return bArr2;
    }

    private String read(setSeparator<byte[], byte[], Key> setseparator, CustomEffectiveDate_ViewBinding<byte[], String> customEffectiveDate_ViewBinding, String str, Key key, CustomEffectiveDate customEffectiveDate) throws Exception {
        byte[] bArr;
        int i;
        CustomEffectiveDate customEffectiveDate2 = customEffectiveDate;
        Log.e(write, "encrypted biodata start");
        String str2 = customEffectiveDate2.MediaBrowserCompat$SearchResultReceiver;
        String str3 = customEffectiveDate2.MediaSessionCompat$QueueItem;
        byte b = customEffectiveDate2.RatingCompat;
        String str4 = customEffectiveDate2.IconCompatParcelizer;
        String str5 = customEffectiveDate2.MediaSessionCompat$Token;
        String str6 = customEffectiveDate2.MediaBrowserCompat$CustomActionResultReceiver;
        byte[] bArr2 = customEffectiveDate2.write;
        char c = 0;
        byte[] write2 = write(Ascii.DEL, new byte[]{b});
        byte[] write3 = TextUtils.isEmpty(str4) ? null : write((byte) -109, str4.getBytes());
        byte[] write4 = TextUtils.isEmpty(str5) ? null : write((byte) 115, str5.getBytes());
        byte[] write5 = write((byte) 123, str.getBytes());
        int i2 = 4;
        byte[] write6 = write((byte) 124, CustomCardApplyViewComponent_ViewBinding.IconCompatParcelizer(Integer.parseInt(setRecipients.MediaMetadataCompat().setGroupDividerEnabled), 4, ByteOrder.BIG_ENDIAN));
        byte[] write7 = TextUtils.isEmpty(str2) ? null : write(ISO7816.INS_MANAGE_CHANNEL, write((byte) 113, str2.getBytes()));
        byte[] write8 = write(ISOFileInfo.FCP_BYTE, str3.getBytes());
        if (bArr2 == null) {
            bArr = null;
        } else {
            byte[][] bArr3 = {bArr2};
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            int i4 = 0;
            while (i4 <= 0) {
                byte[] bArr4 = bArr3[c];
                byte[] write9 = write((byte) -126, CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$ItemReceiver(1, 1));
                byte[] write10 = write((byte) -120, CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$ItemReceiver(i2, 1));
                byte[] write11 = write(ISOFileInfo.DATA_BYTES1, bArr4);
                byte[] bArr5 = new byte[(write9.length + write10.length + write11.length)];
                CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(new byte[][]{write9, write10, write11}, bArr5);
                byte[] write12 = write(ISOFileInfo.FMD_BYTE, bArr5);
                i3 = write12.length + 0;
                arrayList.add(write12);
                i4++;
                bArr3 = bArr3;
                c = 0;
                i2 = 4;
            }
            byte[][] bArr6 = new byte[arrayList.size()][];
            arrayList.toArray(bArr6);
            bArr = new byte[i3];
            CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(bArr6, bArr);
        }
        byte[] read2 = read((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        if (bArr == null) {
            i = 0;
        } else {
            i = bArr.length;
        }
        int length = i + 0 + read2.length;
        byte[] write13 = write((byte) 110, str6.getBytes());
        ArrayList arrayList2 = new ArrayList();
        if (bArr != null) {
            arrayList2.add(bArr);
        }
        arrayList2.add(read2);
        byte[][] bArr7 = new byte[arrayList2.size()][];
        arrayList2.toArray(bArr7);
        byte[] bArr8 = new byte[length];
        CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(bArr7, bArr8);
        byte[] bArr9 = new byte[(write8.length + length + write13.length)];
        CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(new byte[][]{write8, bArr8, write13}, bArr9);
        byte[][] bArr10 = {write2, write3, write4, write5, write6, write7, write((byte) 97, bArr9)};
        ArrayList arrayList3 = new ArrayList();
        int i5 = 0;
        for (int i6 = 0; i6 < 7; i6++) {
            byte[] bArr11 = bArr10[i6];
            if (bArr11 != null) {
                arrayList3.add(bArr11);
                i5 += bArr11.length;
            }
        }
        byte[] bArr12 = new byte[i5];
        byte[][] bArr13 = new byte[arrayList3.size()][];
        arrayList3.toArray(bArr13);
        CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(bArr13, bArr12);
        byte[] MediaBrowserCompat$ItemReceiver2 = CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$ItemReceiver(i5, 4);
        ByteBuffer allocate = ByteBuffer.allocate(MediaBrowserCompat$ItemReceiver2.length + i5);
        allocate.put(MediaBrowserCompat$ItemReceiver2);
        allocate.put(bArr12);
        byte[] IconCompatParcelizer2 = setseparator.IconCompatParcelizer(allocate.array(), key);
        byte[] MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(read(IconCompatParcelizer2));
        ByteBuffer allocate2 = ByteBuffer.allocate(MediaBrowserCompat$ItemReceiver3.length + IconCompatParcelizer2.length);
        allocate2.put(MediaBrowserCompat$ItemReceiver3);
        allocate2.put(IconCompatParcelizer2);
        return customEffectiveDate_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(allocate2.array());
    }

    private static byte[] read(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte b;
        byte b2;
        byte[][] bArr5 = {null, null};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            b = ISOFileInfo.DATA_BYTES1;
            b2 = -120;
            if (i >= 2) {
                break;
            }
            byte[] bArr6 = bArr5[i];
            if (bArr6 != null) {
                i2++;
                byte[] write2 = write((byte) -126, CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$ItemReceiver(i2, 1));
                byte[] write3 = write((byte) -120, CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$ItemReceiver(4, 1));
                byte[] write4 = write(ISOFileInfo.DATA_BYTES1, bArr6);
                byte[] bArr7 = new byte[(write2.length + write3.length + write4.length)];
                CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(new byte[][]{write2, write3, write4}, bArr7);
                byte[] write5 = write((byte) 101, bArr7);
                i3 += write5.length;
                arrayList.add(write5);
            }
            i++;
        }
        byte[][] bArr8 = {null, null};
        int i4 = 0;
        int i5 = 0;
        while (i4 < 2) {
            byte[] bArr9 = bArr8[i4];
            if (bArr9 != null) {
                i5++;
                byte[] write6 = write((byte) -126, CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$ItemReceiver(i5, 1));
                byte[] write7 = write(b2, CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$ItemReceiver(12, 1));
                byte[] write8 = write(b, bArr9);
                byte[] bArr10 = new byte[(write6.length + write7.length + write8.length)];
                CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(new byte[][]{write6, write7, write8}, bArr10);
                byte[] write9 = write((byte) 101, bArr10);
                i3 += write9.length;
                arrayList.add(write9);
            }
            i4++;
            b = ISOFileInfo.DATA_BYTES1;
            b2 = -120;
        }
        byte[][] bArr11 = new byte[arrayList.size()][];
        arrayList.toArray(bArr11);
        byte[] bArr12 = new byte[i3];
        CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(bArr11, bArr12);
        return bArr12;
    }

    private static CustomEffectiveDate MediaBrowserCompat$ItemReceiver(byte[] bArr, byte b) {
        String str = write;
        StringBuilder sb = new StringBuilder();
        sb.append("Operation = ");
        sb.append(b);
        Log.d(str, sb.toString());
        CustomEffectiveDate customEffectiveDate = new CustomEffectiveDate();
        customEffectiveDate.RatingCompat = b;
        setRecipients.MediaMetadataCompat();
        customEffectiveDate.read = setRecipients.MediaMetadataCompat().MediaSessionCompat$ResultReceiverWrapper;
        customEffectiveDate.MediaDescriptionCompat = setRecipients.MediaMetadataCompat().AppCompatViewInflater;
        customEffectiveDate.MediaMetadataCompat = setRecipients.MediaMetadataCompat().setPadding;
        customEffectiveDate.MediaBrowserCompat$ItemReceiver = setRecipients.MediaMetadataCompat().MediaSessionCompat$Token;
        customEffectiveDate.MediaSessionCompat$ResultReceiverWrapper = setRecipients.MediaMetadataCompat().ListMenuItemView;
        customEffectiveDate.write = bArr;
        customEffectiveDate.MediaBrowserCompat$SearchResultReceiver = "administrator";
        customEffectiveDate.IconCompatParcelizer = "MOBILE-ANDROID";
        customEffectiveDate.MediaSessionCompat$Token = setRecipients.MediaMetadataCompat().setContentHeight;
        customEffectiveDate.MediaBrowserCompat$MediaItem = setRecipients.MediaMetadataCompat().setHasDecor;
        if (b == 1) {
            Log.d(write, "Operation enroll 1");
            customEffectiveDate.MediaSessionCompat$QueueItem = setRecipients.MediaMetadataCompat().setForceShowIcon;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"entryPoint\":\"ADD\",\"tokenId\":\"\",\"tokenCounter\":\"\",\"transactionType\":\"ENROLMENT\",\"transactionStatus\":\"PENDING_DEDUP\",\"transactionStage\":\"DATA_CAPTURE\",\"externalId\":\"MB-");
            sb2.append(customEffectiveDate.MediaSessionCompat$QueueItem);
            sb2.append("\",\"institution\":\"");
            sb2.append(customEffectiveDate.MediaBrowserCompat$MediaItem);
            sb2.append("\",\"firstName\":\"");
            sb2.append(customEffectiveDate.read);
            sb2.append("\",\"lastName\":\"");
            sb2.append(customEffectiveDate.MediaDescriptionCompat);
            sb2.append("\",\"middleName\":\"");
            sb2.append(customEffectiveDate.MediaMetadataCompat);
            sb2.append("\",\"dob\":\"");
            sb2.append(customEffectiveDate.MediaBrowserCompat$ItemReceiver);
            sb2.append("\",\"cif\":\"");
            sb2.append(customEffectiveDate.MediaSessionCompat$QueueItem);
            sb2.append("\",\"suffixOrComplement\":\"");
            sb2.append(customEffectiveDate.MediaSessionCompat$ResultReceiverWrapper);
            sb2.append("\",\"vipTag\":\"\",\"status\":\"\",\"directRegistration\":\"\",\"bioTypeFR\":\"FACIAL\",\"fpNo\":\"\",\"systemId\":\"M-AND\",\"_s_token\":\"1U1C2V2Y1KMQVHHLSVTXUFFDM-CTKKYKJSCZAC_C1479708858890\"}");
            customEffectiveDate.MediaBrowserCompat$CustomActionResultReceiver = sb2.toString();
        } else if (b == 6) {
            Log.d(write, "Operation update 6");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("{\"entryPoint\":\"UPD\",\"tokenId\":\"\",\"tokenCounter\":\"\",\"transactionType\":\"UPDATE\",\"transactionStatus\":\"PENDING_DEDUP\",\"transactionStage\":\"DATA_CAPTURE\",\"externalId\":\"MB-");
            sb3.append(customEffectiveDate.MediaSessionCompat$QueueItem);
            sb3.append("\",\"institution\":\"MB\",\"cif\":\"");
            sb3.append(customEffectiveDate.MediaSessionCompat$QueueItem);
            sb3.append("\",\"bioTypeFR\":\"FACIAL\",\"fpNo\":\"FINGERPRINT\",\"_s_token\":\"1U1C2V2Y1KMQVHHLSVTXUFFDM-CTKKYKJSCZAC_C1479708858890\"}");
            customEffectiveDate.MediaBrowserCompat$CustomActionResultReceiver = sb3.toString();
        } else if (b == 2) {
            Log.d(write, "Operation delete 2");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("{\"entryPoint\":\"DEL\",\"tokenId\":\"\",\"tokenCounter\":\"\",\"transactionType\":\"DELETE\",\"transactionStatus\":\"PENDING_BMS_DELETE\",\"transactionStage\":\"BMS_DELETE\",\"institution\":\"MB\",\"cif\":\"");
            sb4.append(customEffectiveDate.MediaSessionCompat$QueueItem);
            sb4.append("\",\"bioTypeFR\":\"FACIAL\",\"bioTypeFP\":\"\",\"workstationID\":\"MIS151100004-A\",\"systemId\":\"UNAT\",\"_s_token\":\"1U1C2V2Y1KMQVHHLSVTXUFFDM-CTKKYKJSCZAC_C1479708858890\"}");
            customEffectiveDate.MediaBrowserCompat$CustomActionResultReceiver = sb4.toString();
        } else if (b == 0) {
            Log.d(write, "Operation verification 0");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(setRecipients.MediaMetadataCompat().setHasDecor);
            sb5.append("-");
            sb5.append(setRecipients.MediaMetadataCompat().setForceShowIcon);
            customEffectiveDate.MediaSessionCompat$QueueItem = sb5.toString();
            String str2 = write;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(" subjectId = ");
            sb6.append(customEffectiveDate.MediaSessionCompat$QueueItem);
            Log.d(str2, sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append("{\"institution\":\"");
            sb7.append(customEffectiveDate.MediaBrowserCompat$MediaItem);
            sb7.append("\",\"cif\":\"");
            sb7.append(customEffectiveDate.MediaSessionCompat$QueueItem);
            sb7.append("\",\"systemId\":\"MOBILE\",\"branchCodeAndDesc\":\"HQ\"}");
            customEffectiveDate.MediaBrowserCompat$CustomActionResultReceiver = sb7.toString();
        }
        String str3 = write;
        StringBuilder sb8 = new StringBuilder();
        sb8.append("Operation1 = ");
        sb8.append(b);
        Log.d(str3, sb8.toString());
        String str4 = write;
        StringBuilder sb9 = new StringBuilder();
        sb9.append("Operation2 = ");
        sb9.append(b);
        Log.d(str4, sb9.toString());
        setRecipients.MediaMetadataCompat();
        setRecipients.m6256x50fd9e4a();
        String str5 = write;
        StringBuilder sb10 = new StringBuilder();
        sb10.append(" BiographicData ");
        sb10.append(customEffectiveDate.MediaBrowserCompat$CustomActionResultReceiver);
        Log.e(str5, sb10.toString());
        return customEffectiveDate;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ Object doInBackground(Object[] objArr) {
        if (setRecipients.MediaMetadataCompat().setExpandedFormat) {
            new Thread() {
                public final void run() {
                    CustomRecipientsList_ViewBinding.this.MediaBrowserCompat$MediaItem.runOnUiThread(new Runnable() {
                        public final void run() {
                            try {
                                CSYR2K csyr2k = new CSYR2K();
                                Activity read2 = CustomRecipientsList_ViewBinding.this.MediaBrowserCompat$MediaItem;
                                setRecipients.MediaMetadataCompat();
                                String MediaBrowserCompat$CustomActionResultReceiver = setRecipients.MediaBrowserCompat$CustomActionResultReceiver();
                                setRecipients.MediaMetadataCompat();
                                String read3 = setRecipients.read();
                                setRecipients.MediaMetadataCompat();
                                csyr2k.MediaBrowserCompat$ItemReceiver(read2, MediaBrowserCompat$CustomActionResultReceiver, read3, setRecipients.MediaBrowserCompat$SearchResultReceiver(), new Object(csyr2k) {
                                    public final void MediaBrowserCompat$ItemReceiver(JSONObject jSONObject) {
                                        Log.e(CustomRecipientsList_ViewBinding.write, "Kony Initialize success");
                                        if (setRecipients.MediaMetadataCompat().setBackgroundResource) {
                                            try {
                                                setListLayout.IconCompatParcelizer = new CSYRK(setRecipients.MediaMetadataCompat().setCheckable);
                                                setListLayout.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(setRecipients.MediaMetadataCompat().setPopupCallback, setRecipients.MediaMetadataCompat().ActionMenuItemView, this);
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                                CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.read(e);
                                            }
                                        } else {
                                            CustomRecipientsList_ViewBinding.this.write();
                                        }
                                    }

                                    public final void read(KonyException konyException) {
                                        Log.e(CustomRecipientsList_ViewBinding.write, "Kony Initialize fail");
                                        konyException.printStackTrace();
                                        CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.read(konyException);
                                    }

                                    public final void read(IdentityServiceException identityServiceException) {
                                        Log.e(CustomRecipientsList_ViewBinding.write, "login fail");
                                        CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.write(identityServiceException.toString());
                                    }

                                    public final void IconCompatParcelizer() {
                                        Log.e(CustomRecipientsList_ViewBinding.write, "login success");
                                        CustomRecipientsList_ViewBinding.this.write();
                                    }
                                });
                            } catch (KonyException e) {
                                e.printStackTrace();
                                CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.read(e);
                            }
                        }
                    });
                }
            }.start();
            return null;
        }
        new CustomCardApplyViewComponent(new setRemainingLimit<String>() {
            public final /* synthetic */ void write(Object obj) {
                String str = (String) obj;
                String IconCompatParcelizer2 = CustomRecipientsList_ViewBinding.IconCompatParcelizer;
                StringBuilder sb = new StringBuilder();
                sb.append("1 ==== ");
                sb.append(str.toString());
                Log.d(IconCompatParcelizer2, sb.toString());
                if (str != null) {
                    try {
                        if (!new setTvTitle(str).MediaBrowserCompat$ItemReceiver().read.equals("0")) {
                            CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.write(str.toString());
                            Log.d(CustomRecipientsList_ViewBinding.IconCompatParcelizer, "Request Error");
                            return;
                        }
                        CustomRecipientsList_ViewBinding.this.read();
                        Log.d(CustomRecipientsList_ViewBinding.IconCompatParcelizer, "Request Token Successfully");
                    } catch (Exception e) {
                        CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.read(e);
                    }
                } else {
                    CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.write("Request Token Error!!!");
                    Log.d(CustomRecipientsList_ViewBinding.IconCompatParcelizer, "Request Error");
                }
            }

            public final void read(Exception exc) {
                CustomRecipientsList_ViewBinding.this.MediaDescriptionCompat.read(exc);
                Log.d(CustomRecipientsList_ViewBinding.IconCompatParcelizer, exc.toString());
            }
        }).execute(new Void[0]);
        return null;
    }
}
