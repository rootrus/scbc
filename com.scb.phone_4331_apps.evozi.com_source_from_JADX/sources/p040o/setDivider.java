package p040o;

import android.app.Activity;
import android.util.Log;

/* renamed from: o.setDivider */
public final class setDivider {
    public static void MediaBrowserCompat$CustomActionResultReceiver(setRemainingLimit<String> setremaininglimit) {
        setRecipients.MediaMetadataCompat();
        if (setRecipients.MediaMetadataCompat().AppCompatDelegateImpl$ListMenuDecorView == null || setRecipients.MediaMetadataCompat().AppCompatDelegateImpl$ListMenuDecorView.length <= 0) {
            Log.d("updated photo null", "");
            setRecipients.MediaMetadataCompat().MediaSessionCompat$QueueItem = setremaininglimit;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(setRecipients.MediaMetadataCompat().AppCompatDelegateImpl$ListMenuDecorView);
        Log.d("updated photo not null", sb.toString());
        new CustomRecipientsList_ViewBinding((Activity) setRecipients.MediaMetadataCompat().MediaDescriptionCompat, setRecipients.MediaMetadataCompat().AppCompatDelegateImpl$ListMenuDecorView, setremaininglimit).execute(new Void[0]);
    }
}
