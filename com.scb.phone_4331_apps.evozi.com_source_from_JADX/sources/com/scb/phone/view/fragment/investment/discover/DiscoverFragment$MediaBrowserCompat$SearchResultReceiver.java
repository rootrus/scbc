package com.scb.phone.view.fragment.investment.discover;

import com.scb.phone.view.adapter.investment.discover.C5766x23d1bf61;
import p040o.CrashlyticsReportWithSessionId;
import p040o.onGetStartedClick;
import p040o.setRequestPassword;
import p040o.setRequestPassword$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.writeUInt64NoTag;

public final class DiscoverFragment$MediaBrowserCompat$SearchResultReceiver implements C5766x23d1bf61<CrashlyticsReportWithSessionId> {
    private /* synthetic */ DiscoverFragment MediaBrowserCompat$CustomActionResultReceiver;

    DiscoverFragment$MediaBrowserCompat$SearchResultReceiver(DiscoverFragment discoverFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = discoverFragment;
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        onGetStartedClick.write((Object) crashlyticsReportWithSessionId, "display");
        setRequestPassword setrequestpassword = this.MediaBrowserCompat$CustomActionResultReceiver.discoverLandingPresenter;
        if (setrequestpassword == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("discoverLandingPresenter");
        }
        onGetStartedClick.write((Object) crashlyticsReportWithSessionId, "recommend");
        writeUInt64NoTag.IconCompatParcelizer setrequestpassword_mediabrowsercompat_customactionresultreceiver = new setRequestPassword$MediaBrowserCompat$CustomActionResultReceiver(setrequestpassword, crashlyticsReportWithSessionId);
        if (setrequestpassword.RatingCompat != null) {
            setrequestpassword_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(setrequestpassword.RatingCompat);
        }
    }

    public final /* synthetic */ void read(Object obj) {
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        onGetStartedClick.write((Object) crashlyticsReportWithSessionId, "display");
        setRequestPassword setrequestpassword = this.MediaBrowserCompat$CustomActionResultReceiver.discoverLandingPresenter;
        if (setrequestpassword == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("discoverLandingPresenter");
        }
        onGetStartedClick.write((Object) crashlyticsReportWithSessionId, "recommend");
        writeUInt64NoTag.IconCompatParcelizer write = new setRequestPassword.write(setrequestpassword, crashlyticsReportWithSessionId);
        if (setrequestpassword.RatingCompat != null) {
            write.IconCompatParcelizer(setrequestpassword.RatingCompat);
        }
    }
}
