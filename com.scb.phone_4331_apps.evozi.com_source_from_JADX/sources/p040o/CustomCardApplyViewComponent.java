package p040o;

import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.security.KeyStore;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: o.CustomCardApplyViewComponent */
public class CustomCardApplyViewComponent extends AsyncTask<Void, Void, Void> {
    private static final String IconCompatParcelizer = CustomCardApplyViewComponent.class.getName();
    private KeyStore MediaBrowserCompat$CustomActionResultReceiver;
    private setRemainingLimit<String> MediaBrowserCompat$ItemReceiver;
    private ETBEligibilityAdapter$EligibilityHolder_ViewBinding read;
    private ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding write;

    public CustomCardApplyViewComponent(setRemainingLimit<String> setremaininglimit) {
        this.MediaBrowserCompat$ItemReceiver = setremaininglimit;
    }

    private byte[] IconCompatParcelizer(byte[] bArr) {
        byte[] bArr2;
        Log.d(IconCompatParcelizer, "encryptRSAData():");
        try {
            Cipher instance = Cipher.getInstance(setRecipients.MediaMetadataCompat().setIcon, setRecipients.MediaMetadataCompat().setItemInvoker);
            instance.init(1, this.MediaBrowserCompat$CustomActionResultReceiver.getCertificate("ca").getPublicKey());
            String str = IconCompatParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append(" keystore public key = ");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.getCertificate("ca").getPublicKey());
            Log.d(str, sb.toString());
            bArr2 = instance.doFinal(bArr);
        } catch (Exception e) {
            Log.d(IconCompatParcelizer, "Exception occurred", e);
            this.MediaBrowserCompat$ItemReceiver.read(e);
            e.printStackTrace();
            bArr2 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(IconCompatParcelizer);
        sb2.append("encryptRSAData(): Done.");
        Log.d(sb2.toString(), bArr2.toString());
        return bArr2;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ Object doInBackground(Object[] objArr) {
        System.out.println("run background");
        System.out.println("call service");
        ETBDescriptionAdapter$DescriptionHolder eTBDescriptionAdapter$DescriptionHolder = new ETBDescriptionAdapter$DescriptionHolder("http://api.web.epid.asia.nec.com/", "requestToken");
        try {
            String str = IconCompatParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append("workstationName: ");
            sb.append(setRecipients.MediaMetadataCompat().setContentHeight);
            Log.e(str, sb.toString());
            this.MediaBrowserCompat$CustomActionResultReceiver = CustomStatementChannelViewComponent.IconCompatParcelizer();
            byte[] encoded = new SecretKeySpec("1234567890123456".getBytes(), "AES").getEncoded();
            byte[] MediaBrowserCompat$ItemReceiver2 = CustomCardApplyViewComponent_ViewBinding.MediaBrowserCompat$ItemReceiver(encoded.length, 4);
            ByteBuffer allocate = ByteBuffer.allocate(MediaBrowserCompat$ItemReceiver2.length + encoded.length);
            allocate.put(MediaBrowserCompat$ItemReceiver2);
            allocate.put(encoded);
            byte[] IconCompatParcelizer2 = IconCompatParcelizer(allocate.array());
            byte[] MediaBrowserCompat$CustomActionResultReceiver2 = setTermsAndConditionsListener.MediaBrowserCompat$CustomActionResultReceiver((byte) 115, "Android Test WorkStation".getBytes());
            byte[] MediaBrowserCompat$CustomActionResultReceiver3 = setTermsAndConditionsListener.MediaBrowserCompat$CustomActionResultReceiver((byte) 122, IconCompatParcelizer2);
            byte[] MediaBrowserCompat$CustomActionResultReceiver4 = setTermsAndConditionsListener.MediaBrowserCompat$CustomActionResultReceiver((byte) 120, "C=SG, O=NECAP, CN=ePID".getBytes());
            byte[] MediaBrowserCompat$CustomActionResultReceiver5 = setTermsAndConditionsListener.MediaBrowserCompat$CustomActionResultReceiver((byte) 121, "55 a4 bf f6".getBytes());
            byte[] MediaBrowserCompat$CustomActionResultReceiver6 = setTermsAndConditionsListener.MediaBrowserCompat$CustomActionResultReceiver((byte) 118, setTermsAndConditionsListener.write().getBytes());
            byte[] MediaBrowserCompat$CustomActionResultReceiver7 = setTermsAndConditionsListener.MediaBrowserCompat$CustomActionResultReceiver((byte) 117, setTermsAndConditionsListener.MediaBrowserCompat$CustomActionResultReceiver().getBytes());
            byte[] MediaBrowserCompat$CustomActionResultReceiver8 = setTermsAndConditionsListener.MediaBrowserCompat$CustomActionResultReceiver((byte) 115, setRecipients.MediaMetadataCompat().setContentHeight.getBytes());
            byte[] MediaBrowserCompat$CustomActionResultReceiver9 = setTermsAndConditionsListener.MediaBrowserCompat$CustomActionResultReceiver((byte) 125, "Once".getBytes());
            ByteBuffer allocate2 = ByteBuffer.allocate(MediaBrowserCompat$CustomActionResultReceiver2.length + MediaBrowserCompat$CustomActionResultReceiver3.length);
            allocate2.put(MediaBrowserCompat$CustomActionResultReceiver2);
            allocate2.put(MediaBrowserCompat$CustomActionResultReceiver3);
            byte[] array = allocate2.array();
            ByteBuffer allocate3 = ByteBuffer.allocate(MediaBrowserCompat$CustomActionResultReceiver4.length + MediaBrowserCompat$CustomActionResultReceiver5.length);
            allocate3.put(MediaBrowserCompat$CustomActionResultReceiver4);
            allocate3.put(MediaBrowserCompat$CustomActionResultReceiver5);
            byte[] array2 = allocate3.array();
            ByteBuffer allocate4 = ByteBuffer.allocate(MediaBrowserCompat$CustomActionResultReceiver6.length + MediaBrowserCompat$CustomActionResultReceiver7.length);
            allocate4.put(MediaBrowserCompat$CustomActionResultReceiver6);
            allocate4.put(MediaBrowserCompat$CustomActionResultReceiver7);
            byte[] array3 = allocate4.array();
            ByteBuffer allocate5 = ByteBuffer.allocate(MediaBrowserCompat$CustomActionResultReceiver8.length + MediaBrowserCompat$CustomActionResultReceiver9.length);
            allocate5.put(MediaBrowserCompat$CustomActionResultReceiver8);
            allocate5.put(MediaBrowserCompat$CustomActionResultReceiver9);
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
            byte[] MediaBrowserCompat$ItemReceiver3 = setTermsAndConditionsListener.MediaBrowserCompat$ItemReceiver(setTermsAndConditionsListener.MediaBrowserCompat$ItemReceiver(array7));
            ByteBuffer allocate9 = ByteBuffer.allocate(MediaBrowserCompat$ItemReceiver3.length + array7.length);
            allocate9.put(MediaBrowserCompat$ItemReceiver3);
            allocate9.put(array7);
            byte[] array8 = allocate9.array();
            Log.i("RequestTokenEncData", Base64.encodeToString(array8, 0));
            eTBDescriptionAdapter$DescriptionHolder.MediaBrowserCompat$CustomActionResultReceiver("clientInfo", (Object) Base64.encodeToString(array8, 0));
            ETBEligibilityAdapter$EligibilityHolder eTBEligibilityAdapter$EligibilityHolder = new ETBEligibilityAdapter$EligibilityHolder();
            eTBEligibilityAdapter$EligibilityHolder.IconCompatParcelizer = eTBDescriptionAdapter$DescriptionHolder;
            setTermsAndConditionsListener.MediaBrowserCompat$ItemReceiver();
            if (setRecipients.MediaMetadataCompat().setChecked) {
                System.out.println("isOpenSSL");
                setRecipients.MediaMetadataCompat();
                String write2 = setRecipients.write();
                setRecipients.MediaMetadataCompat();
                int RatingCompat = setRecipients.RatingCompat();
                setRecipients.MediaMetadataCompat();
                ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding eTBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding = new ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding(write2, RatingCompat, setRecipients.IconCompatParcelizer(), 120000);
                this.write = eTBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding;
                eTBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = true;
                String str2 = IconCompatParcelizer;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("httpsTransportSE ");
                setRecipients.MediaMetadataCompat();
                sb2.append(setRecipients.write());
                setRecipients.MediaMetadataCompat();
                sb2.append(setRecipients.RatingCompat());
                setRecipients.MediaMetadataCompat();
                sb2.append(setRecipients.IconCompatParcelizer());
                Log.d(str2, sb2.toString());
            } else {
                PrintStream printStream = System.out;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("is not OpenSSL");
                sb3.append(setRecipients.MediaMetadataCompat().AbsActionBarView);
                printStream.println(sb3.toString());
                ETBEligibilityAdapter$EligibilityHolder_ViewBinding eTBEligibilityAdapter$EligibilityHolder_ViewBinding = new ETBEligibilityAdapter$EligibilityHolder_ViewBinding(setRecipients.MediaMetadataCompat().AbsActionBarView);
                this.read = eTBEligibilityAdapter$EligibilityHolder_ViewBinding;
                eTBEligibilityAdapter$EligibilityHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = true;
                String str3 = IconCompatParcelizer;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("httpsTransport ");
                sb4.append(setRecipients.MediaMetadataCompat().AbsActionBarView);
                Log.d(str3, sb4.toString());
            }
            try {
                if (setRecipients.MediaMetadataCompat().setChecked) {
                    this.write.read("http://api.web.epid.asia.nec.com/requestToken", eTBEligibilityAdapter$EligibilityHolder, (List) null);
                    String str4 = IconCompatParcelizer;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("httpsTransportSE request");
                    sb5.append(this.write.write);
                    Log.d(str4, sb5.toString());
                } else {
                    this.read.read("http://api.web.epid.asia.nec.com/requestToken", eTBEligibilityAdapter$EligibilityHolder, (List) null);
                    String str5 = IconCompatParcelizer;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("httpsTransport request");
                    sb6.append(this.read.write);
                    Log.d(str5, sb6.toString());
                }
                this.MediaBrowserCompat$ItemReceiver.write(eTBEligibilityAdapter$EligibilityHolder.write().toString());
            } catch (Exception e) {
                this.MediaBrowserCompat$ItemReceiver.read(e);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this.MediaBrowserCompat$ItemReceiver.read(e2);
        }
        return null;
    }
}
