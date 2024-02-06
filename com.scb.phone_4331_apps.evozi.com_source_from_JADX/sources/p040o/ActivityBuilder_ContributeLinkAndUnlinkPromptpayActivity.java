package p040o;

import com.scb.phone.view.adapter.profilemanagement.ManagePromptpayProxyAdapter;
import p040o.VideoPlayerCameraPlayer;

/* renamed from: o.ActivityBuilder_ContributeLinkAndUnlinkPromptpayActivity */
public final /* synthetic */ class ActivityBuilder_ContributeLinkAndUnlinkPromptpayActivity implements ManagePromptpayProxyAdapter.write {
    private final /* synthetic */ VideoPlayerCameraPlayer.C3947c write;

    public /* synthetic */ ActivityBuilder_ContributeLinkAndUnlinkPromptpayActivity(VideoPlayerCameraPlayer.C3947c cVar) {
        this.write = cVar;
    }

    public final void MediaBrowserCompat$ItemReceiver(setExecution setexecution) {
        VideoPlayerCameraPlayer.C3947c cVar = this.write;
        getNameSuffixFieldName getnamesuffixfieldname = new getNameSuffixFieldName(setexecution);
        if (cVar.RatingCompat != null) {
            getnamesuffixfieldname.IconCompatParcelizer(cVar.RatingCompat);
        }
    }
}
