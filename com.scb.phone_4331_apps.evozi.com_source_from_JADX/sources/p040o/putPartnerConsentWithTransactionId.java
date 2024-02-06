package p040o;

import android.view.View;
import android.widget.NumberPicker;
import com.scb.phone.view.fragment.bond.BondInputFragment;
import p040o.PlaybackStateCompat;

/* renamed from: o.putPartnerConsentWithTransactionId */
public final /* synthetic */ class putPartnerConsentWithTransactionId implements View.OnClickListener {
    private final /* synthetic */ PlaybackStateCompat.CustomAction IconCompatParcelizer;
    private final /* synthetic */ NumberPicker MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ BondInputFragment read;

    public /* synthetic */ putPartnerConsentWithTransactionId(BondInputFragment bondInputFragment, NumberPicker numberPicker, PlaybackStateCompat.CustomAction customAction) {
        this.read = bondInputFragment;
        this.MediaBrowserCompat$ItemReceiver = numberPicker;
        this.IconCompatParcelizer = customAction;
    }

    public final void onClick(View view) {
        BondInputFragment bondInputFragment = this.read;
        NumberPicker numberPicker = this.MediaBrowserCompat$ItemReceiver;
        PlaybackStateCompat.CustomAction customAction = this.IconCompatParcelizer;
        DefaultHeartBeatInfo defaultHeartBeatInfo = bondInputFragment.presenter;
        int value = numberPicker.getValue();
        defaultHeartBeatInfo.MediaMetadataCompat = value;
        boolean z = true;
        defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = asWriter.MediaBrowserCompat$CustomActionResultReceiver(defaultHeartBeatInfo.MediaBrowserCompat$SearchResultReceiver.get(value).write, true);
        defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = true;
        defaultHeartBeatInfo.IconCompatParcelizer(defaultHeartBeatInfo.MediaBrowserCompat$SearchResultReceiver.get(value).write);
        ObjectEncoder objectEncoder = new ObjectEncoder(defaultHeartBeatInfo, value);
        if (defaultHeartBeatInfo.RatingCompat == null) {
            z = false;
        }
        if (z) {
            objectEncoder.IconCompatParcelizer(defaultHeartBeatInfo.RatingCompat);
        }
        customAction.dismiss();
    }
}
