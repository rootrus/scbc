package p040o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Locale;

/* renamed from: o.SelectRecipientFromFavouriteActivity */
public class SelectRecipientFromFavouriteActivity {
    SelectRecipientFromFavouriteActivity() {
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.write(String.format(Locale.US, "%s: Error occurred while opening Uri [%s]: %s", new Object[]{SelectRecipientFromFavouriteActivity.class.getSimpleName(), str, e.getMessage()}));
        }
    }
}
