package p040o;

import android.util.Base64;
import com.scb.phone.view.activity.registration.C5708x2064d349;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p040o.GoodToKnowActivity;
import scb.yek.GetKey;

/* renamed from: o.addDynamiteErrorToDropBox */
public final /* synthetic */ class addDynamiteErrorToDropBox implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C1185xac757a41 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ addDynamiteErrorToDropBox(C1185xac757a41 fragmentBuilder_BindETBCheckIdentityFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindETBCheckIdentityFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        String str;
        C1185xac757a41 fragmentBuilder_BindETBCheckIdentityFragment$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver;
        C6808xbcae765b fragmentBuilder_BindStatementStatementChannelChooseAddressFragment = (C6808xbcae765b) obj;
        C5708x2064d349 registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver = new C5708x2064d349(fragmentBuilder_BindStatementStatementChannelChooseAddressFragment.phoneNumber, fragmentBuilder_BindStatementStatementChannelChooseAddressFragment.tag);
        fragmentBuilder_BindETBCheckIdentityFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.write = registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        String str2 = "";
        if (registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver.write == null || registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver == null) {
            str = str2;
        } else {
            GetKey getKey = new GetKey();
            String str3 = registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver.write;
            onGetStartedClick.MediaBrowserCompat$CustomActionResultReceiver(str3, "strToEncrypt");
            onGetStartedClick.MediaBrowserCompat$CustomActionResultReceiver("com.scb.phone.data", "appName");
            byte[] bytes = str3.getBytes(GroupFavoriteActivity.IconCompatParcelizer);
            onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] decode = Base64.decode(getKey.keyFromJNI("com.scb.phone.data"), 0);
            onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) decode, "Base64.decode(keyFromJNI(appName), Base64.DEFAULT)");
            SecretKey secretKeySpec = new SecretKeySpec(decode, 0, decode.length, "AES");
            String MediaBrowserCompat$ItemReceiver2 = GetKey.MediaBrowserCompat$ItemReceiver(GetKey.write());
            getKey.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver2;
            if (MediaBrowserCompat$ItemReceiver2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("hexStringRandom");
            }
            Charset charset = GroupFavoriteActivity.IconCompatParcelizer;
            if (MediaBrowserCompat$ItemReceiver2 != null) {
                byte[] bytes2 = MediaBrowserCompat$ItemReceiver2.getBytes(charset);
                onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bytes2, "(this as java.lang.String).getBytes(charset)");
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes2);
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                instance.init(1, secretKeySpec, ivParameterSpec);
                byte[] doFinal = instance.doFinal(bytes);
                StringBuilder sb = new StringBuilder();
                onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) doFinal, "cipherText");
                sb.append(GetKey.MediaBrowserCompat$ItemReceiver(doFinal));
                String str4 = getKey.MediaBrowserCompat$ItemReceiver;
                if (str4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("hexStringRandom");
                }
                CharSequence charSequence = str4;
                onGetStartedClick.write((Object) charSequence, "$this$chunked");
                onGetStartedClick.write((Object) charSequence, "$this$windowed");
                sb.append(HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(GoodToKnowActivity.write(charSequence, 2, 2, true, GoodToKnowActivity.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver), str2, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new GetKey.write(getKey), 30));
                String obj2 = sb.toString();
                str2 = registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                str = obj2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return new C5708x2064d349(str2, str);
    }
}
