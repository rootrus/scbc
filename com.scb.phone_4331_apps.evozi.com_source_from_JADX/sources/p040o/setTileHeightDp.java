package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.profilemanagement.promptpay.LinkAndUnlinkPromptPayActivity;
import p040o.ImmutableMultimap;

/* renamed from: o.setTileHeightDp */
public final /* synthetic */ class setTileHeightDp implements DialogInterface.OnClickListener {
    private final /* synthetic */ LinkAndUnlinkPromptPayActivity read;

    public /* synthetic */ setTileHeightDp(LinkAndUnlinkPromptPayActivity linkAndUnlinkPromptPayActivity) {
        this.read = linkAndUnlinkPromptPayActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4889kC kCVar = this.read.presenter;
        if (kCVar.RatingCompat != null) {
            kCVar.RatingCompat.AlertController$RecycleListView();
        }
        split split = kCVar.MediaBrowserCompat$SearchResultReceiver;
        ImmutableMultimap.Values.read read2 = ImmutableMultimap.Values.read();
        read2.MediaBrowserCompat$CustomActionResultReceiver = kCVar.write.MediaMetadataCompat;
        read2.write = kCVar.write.read == 0 ? "MOB" : "CID";
        split.read(new ImmutableMultimap.Values(read2, (byte) 0));
        kCVar.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new kC$MediaBrowserCompat$ItemReceiver(kCVar, (byte) 0));
    }
}
