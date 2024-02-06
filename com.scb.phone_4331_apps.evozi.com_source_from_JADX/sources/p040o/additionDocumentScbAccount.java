package p040o;

import android.view.View;

/* renamed from: o.additionDocumentScbAccount */
public final /* synthetic */ class additionDocumentScbAccount implements View.OnClickListener {
    private final /* synthetic */ AutoValue_CrashlyticsReport_Session_User MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ confirmNTBReferral write;

    public /* synthetic */ additionDocumentScbAccount(confirmNTBReferral confirmntbreferral, AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User) {
        this.write = confirmntbreferral;
        this.MediaBrowserCompat$CustomActionResultReceiver = autoValue_CrashlyticsReport_Session_User;
    }

    public final void onClick(View view) {
        confirmNTBReferral confirmntbreferral = this.write;
        confirmntbreferral.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
