package p040o;

import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.RewardsHomeActivity */
public final class RewardsHomeActivity {
    private static final char[] IconCompatParcelizer = {'D', '1', '3', Matrix.MATRIX_TYPE_RANDOM_UT, '2', 'T', 'd', 'b', 'r', 'V', 'C', 'e', 'v', 's', Matrix.MATRIX_TYPE_RANDOM_UT, 'B', '5', 'q', 'u', 'C'};
    private static final char[] MediaBrowserCompat$CustomActionResultReceiver = {'P', 'B', 'E', 'W', 'i', 't', 'h', 'M', 'D', '5', 'A', 'n', 'd', 'D', 'E', 'S'};

    public static String MediaBrowserCompat$ItemReceiver(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        setRootView MediaBrowserCompat$MediaItem = FragmentBuilder_BindHmlIssuerLandingFragment.MediaBrowserCompat$MediaItem();
        if (MediaBrowserCompat$MediaItem == null) {
            return "";
        }
        MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver();
        try {
            return MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(str);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMailingAddressLandingFragment.ERROR_ENCRYPTING_VALUE);
            return write(context, str);
        }
    }

    private static String write(Context context, String str) {
        try {
            byte[] bytes = str.getBytes("utf-8");
            SecretKey generateSecret = SecretKeyFactory.getInstance(new String(MediaBrowserCompat$CustomActionResultReceiver)).generateSecret(new PBEKeySpec(IconCompatParcelizer));
            Cipher instance = Cipher.getInstance(new String(MediaBrowserCompat$CustomActionResultReceiver));
            instance.init(1, generateSecret, new PBEParameterSpec(Settings.Secure.getString(context.getContentResolver(), "android_id").getBytes("utf-8"), 20));
            return new String(Base64.encode(instance.doFinal(bytes), 2), "utf-8");
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
            StringBuilder sb = new StringBuilder();
            sb.append("EncryptionHelper encrypt - ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            return "";
        }
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        setRootView MediaBrowserCompat$MediaItem = FragmentBuilder_BindHmlIssuerLandingFragment.MediaBrowserCompat$MediaItem();
        if (MediaBrowserCompat$MediaItem == null) {
            return "";
        }
        MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver();
        try {
            return MediaBrowserCompat$MediaItem.read(str);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMailingAddressLandingFragment.ERROR_DECRYPTING_VALUE);
            return IconCompatParcelizer(context, str);
        }
    }

    private static String IconCompatParcelizer(Context context, String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            SecretKey generateSecret = SecretKeyFactory.getInstance(new String(MediaBrowserCompat$CustomActionResultReceiver)).generateSecret(new PBEKeySpec(IconCompatParcelizer));
            Cipher instance = Cipher.getInstance(new String(MediaBrowserCompat$CustomActionResultReceiver));
            instance.init(2, generateSecret, new PBEParameterSpec(Settings.Secure.getString(context.getContentResolver(), "android_id").getBytes("utf-8"), 20));
            return new String(instance.doFinal(decode), "utf-8");
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
            StringBuilder sb = new StringBuilder();
            sb.append("EncryptionHelper decrypt - ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            return "";
        }
    }
}
