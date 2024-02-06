package p040o;

import android.view.View;

/* renamed from: o.ActivationSuccessfulActivity */
public final /* synthetic */ class ActivationSuccessfulActivity implements onAccountSummaryClick$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ onClickNextAction IconCompatParcelizer;
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ View MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String MediaDescriptionCompat;
    private final /* synthetic */ boolean RatingCompat;
    private final /* synthetic */ String read;
    private final /* synthetic */ DeejungTransferLandingActivity write;

    public /* synthetic */ ActivationSuccessfulActivity(onClickNextAction onclicknextaction, View view, boolean z, DeejungTransferLandingActivity deejungTransferLandingActivity, String str, boolean z2, String str2) {
        this.IconCompatParcelizer = onclicknextaction;
        this.MediaBrowserCompat$ItemReceiver = view;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.write = deejungTransferLandingActivity;
        this.read = str;
        this.RatingCompat = z2;
        this.MediaDescriptionCompat = str2;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.IconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.write, this.read, this.RatingCompat, this.MediaDescriptionCompat);
    }
}
