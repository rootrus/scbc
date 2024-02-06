package p040o;

import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.KeyStore;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: o.setCkbCardName */
public class setCkbCardName extends AsyncTask<Void, Void, Void> {
    private static SecretKeySpec IconCompatParcelizer;
    private static final String MediaBrowserCompat$CustomActionResultReceiver = setCkbCardName.class.getName();
    private ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding MediaBrowserCompat$ItemReceiver;
    private KeyStore MediaBrowserCompat$SearchResultReceiver;
    private String MediaMetadataCompat;
    private setRemainingLimit<String> RatingCompat;
    private setSeparator<byte[], byte[], Key> read = new setSourceName();
    private ETBEligibilityAdapter$EligibilityHolder_ViewBinding write;

    public setCkbCardName(String str, setRemainingLimit<String> setremaininglimit) {
        this.MediaMetadataCompat = str;
        this.RatingCompat = setremaininglimit;
    }

    private String write() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("<ClientInfo><Workstation_Name>system-workstation</Workstation_Name><MAC_Address>aa:bb:cc:dd</MAC_Address><IP_Address>12.32.2.2</IP_Address><Token_Name>Once</Token_Name><ACL_SID></ACL_SID><Officer_ID>ADMINISTRATOR</Officer_ID><Officer_Domain></Officer_Domain><Subject_ID>");
            sb.append(this.MediaMetadataCompat);
            sb.append("</Subject_ID><Subject_Domain></Subject_Domain><Operation_Type>aa:bb:cc:dd</Operation_Type><IV_Base64></IV_Base64><Crypto_Algorithm>0</Crypto_Algorithm><Encrypt_Session_Key>");
            this.MediaBrowserCompat$SearchResultReceiver = CustomStatementChannelViewComponent.IconCompatParcelizer();
            SecretKeySpec secretKeySpec = new SecretKeySpec("1234567890123456".getBytes(), "AES");
            IconCompatParcelizer = secretKeySpec;
            byte[] encoded = secretKeySpec.getEncoded();
            byte[] MediaBrowserCompat$ItemReceiver2 = CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$ItemReceiver(encoded.length, 4);
            ByteBuffer allocate = ByteBuffer.allocate(MediaBrowserCompat$ItemReceiver2.length + encoded.length);
            allocate.put(MediaBrowserCompat$ItemReceiver2);
            allocate.put(encoded);
            byte[] IconCompatParcelizer2 = IconCompatParcelizer(allocate.array());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Base64.encodeToString(IconCompatParcelizer2, 0));
            sb2.append(" ");
            sb2.append(IconCompatParcelizer2);
            Log.i("sessionkey", sb2.toString());
            sb.append(Base64.encodeToString(IconCompatParcelizer2, 0));
            sb.append("</Encrypt_Session_Key><EPID_Cert_Issuer></EPID_Cert_Issuer><EPID_Cert_SerialNo>[ePID Cert Serial No or Key Name]</EPID_Cert_SerialNo></ClientInfo>");
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private byte[] IconCompatParcelizer(byte[] bArr) {
        Log.d(MediaBrowserCompat$CustomActionResultReceiver, "encryptRSAData():");
        byte[] bArr2 = null;
        try {
            Cipher instance = Cipher.getInstance(setRecipients.MediaMetadataCompat().setIcon, setRecipients.MediaMetadataCompat().setItemInvoker);
            instance.init(1, this.MediaBrowserCompat$SearchResultReceiver.getCertificate("ca").getPublicKey());
            String str = MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append("public key https = ");
            setRecipients.MediaMetadataCompat();
            sb.append((Object) null);
            Log.d(str, sb.toString());
            String str2 = MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("public key http = ");
            sb2.append(this.MediaBrowserCompat$SearchResultReceiver.getCertificate("ca").getPublicKey());
            Log.d(str2, sb2.toString());
            bArr2 = instance.doFinal(bArr);
        } catch (Exception e) {
            Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred", e);
            e.printStackTrace();
        }
        Log.d(MediaBrowserCompat$CustomActionResultReceiver, "encryptRSAData(): Done.");
        return bArr2;
    }

    private String IconCompatParcelizer(String str) {
        byte[] bArr;
        byte[] MediaBrowserCompat$ItemReceiver2 = SetupQuickTopUpActivity.MediaBrowserCompat$ItemReceiver(str.getBytes());
        try {
            bArr = this.read.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2, new SecretKeySpec("1234567890123456".getBytes(), "AES"));
        } catch (Exception unused) {
            bArr = null;
        }
        return new String(bArr);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ Object doInBackground(Object[] objArr) {
        ETBDescriptionAdapter$DescriptionHolder eTBDescriptionAdapter$DescriptionHolder = new ETBDescriptionAdapter$DescriptionHolder("http://api.web.epid.asia.nec.com/", "retrieveBiometric");
        try {
            eTBDescriptionAdapter$DescriptionHolder.MediaBrowserCompat$CustomActionResultReceiver("xmlClientInfo", (Object) write());
            eTBDescriptionAdapter$DescriptionHolder.MediaBrowserCompat$CustomActionResultReceiver("dataOption", (Object) 0);
            eTBDescriptionAdapter$DescriptionHolder.MediaBrowserCompat$CustomActionResultReceiver("biometricOption", (Object) "<BiometricOption><Required_Biometric>FR</Required_Biometric><Required_Generations>0</Required_Generations></BiometricOption>");
        } catch (Exception e) {
            e.printStackTrace();
        }
        ETBEligibilityAdapter$EligibilityHolder eTBEligibilityAdapter$EligibilityHolder = new ETBEligibilityAdapter$EligibilityHolder();
        eTBEligibilityAdapter$EligibilityHolder.IconCompatParcelizer = eTBDescriptionAdapter$DescriptionHolder;
        setTermsAndConditionsListener.MediaBrowserCompat$ItemReceiver();
        if (setRecipients.MediaMetadataCompat().setChecked) {
            ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding eTBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding = new ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding("gis.nec.com.sg", 443, "/bdo/epid-webservices/api/epidService?wsdl", 30000);
            this.MediaBrowserCompat$ItemReceiver = eTBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding;
            eTBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = true;
        } else {
            ETBEligibilityAdapter$EligibilityHolder_ViewBinding eTBEligibilityAdapter$EligibilityHolder_ViewBinding = new ETBEligibilityAdapter$EligibilityHolder_ViewBinding(setRecipients.MediaMetadataCompat().AbsActionBarView);
            this.write = eTBEligibilityAdapter$EligibilityHolder_ViewBinding;
            eTBEligibilityAdapter$EligibilityHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = true;
        }
        try {
            if (setRecipients.MediaMetadataCompat().setChecked) {
                this.MediaBrowserCompat$ItemReceiver.read("", eTBEligibilityAdapter$EligibilityHolder, (List) null);
            } else {
                this.write.read("", eTBEligibilityAdapter$EligibilityHolder, (List) null);
            }
            String str = MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append("Secret key");
            sb.append(IconCompatParcelizer);
            Log.d(str, sb.toString());
            Object write2 = eTBEligibilityAdapter$EligibilityHolder.write();
            String str2 = MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Retrieve2 Impl");
            sb2.append(write2.toString());
            Log.d(str2, sb2.toString());
            setHeader MediaBrowserCompat$ItemReceiver2 = new setTvTitle(write2.toString()).MediaBrowserCompat$ItemReceiver();
            String str3 = MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Retrieve Bio Data ");
            sb3.append(MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver);
            Log.d(str3, sb3.toString());
            String str4 = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver;
            Log.i("decrypted data ", IconCompatParcelizer(str4));
            this.RatingCompat.write(IconCompatParcelizer(str4));
        } catch (Exception e2) {
            Log.d(MediaBrowserCompat$CustomActionResultReceiver, e2.toString());
            this.RatingCompat.read(e2);
        }
        return null;
    }
}
