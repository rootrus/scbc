package p040o;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: o.setShowDividers */
public class setShowDividers {
    public static boolean read(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
