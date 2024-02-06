package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.SignInButton;

/* renamed from: o.LoggingConstants */
public final /* synthetic */ class LoggingConstants implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindDeejungTransferMinMaxReviewFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ LoggingConstants(FragmentBuilder_BindDeejungTransferMinMaxReviewFragment fragmentBuilder_BindDeejungTransferMinMaxReviewFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindDeejungTransferMinMaxReviewFragment;
    }

    public final Object write(Object obj) {
        List list;
        FragmentBuilder_BindDeejungTransferMinMaxReviewFragment fragmentBuilder_BindDeejungTransferMinMaxReviewFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        RepeaterParser repeaterParser = (RepeaterParser) obj;
        fragmentBuilder_BindDeejungTransferMinMaxReviewFragment.read.MediaBrowserCompat$CustomActionResultReceiver = repeaterParser;
        SignInButton.ButtonSize buttonSize = fragmentBuilder_BindDeejungTransferMinMaxReviewFragment.MediaBrowserCompat$ItemReceiver;
        zzvf zzvf = fragmentBuilder_BindDeejungTransferMinMaxReviewFragment.write.MediaBrowserCompat$ItemReceiver.write;
        if (zzvf != null) {
            list = zzvf.MediaBrowserCompat$MediaItem;
        } else {
            list = new ArrayList();
        }
        return DebitCardResetOtpActivity.just(buttonSize.MediaBrowserCompat$CustomActionResultReceiver(repeaterParser, list));
    }
}
