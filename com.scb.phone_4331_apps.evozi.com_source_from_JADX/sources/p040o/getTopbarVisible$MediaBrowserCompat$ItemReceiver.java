package p040o;

import android.view.View;

/* renamed from: o.getTopbarVisible$MediaBrowserCompat$ItemReceiver */
final class getTopbarVisible$MediaBrowserCompat$ItemReceiver implements View.OnClickListener {
    private /* synthetic */ getTopbarVisible MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ int read;

    getTopbarVisible$MediaBrowserCompat$ItemReceiver(getTopbarVisible gettopbarvisible, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gettopbarvisible;
        this.read = i;
    }

    public final void onClick(View view) {
        getTopbarVisible$MediaBrowserCompat$CustomActionResultReceiver gettopbarvisible_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$CustomActionResultReceiver.write;
        AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.get(this.read);
        onGetStartedClick.IconCompatParcelizer((Object) autoValue_CrashlyticsReport_Session_Event_Application, "currencies[position]");
        gettopbarvisible_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(autoValue_CrashlyticsReport_Session_Event_Application);
    }
}
