package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.hml.HmlOccupationInfoFragment;
import p040o.setWscClientIp;
import p040o.writeUInt64NoTag;

/* renamed from: o.ActivityBuilder_BindCreditCardBilledDetailActivity */
public final /* synthetic */ class ActivityBuilder_BindCreditCardBilledDetailActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ HmlOccupationInfoFragment read;

    public /* synthetic */ ActivityBuilder_BindCreditCardBilledDetailActivity(HmlOccupationInfoFragment hmlOccupationInfoFragment) {
        this.read = hmlOccupationInfoFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        setWscClientIp setwscclientip = this.read.presenter;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setWscClientIp.write.MediaBrowserCompat$CustomActionResultReceiver;
        if (setwscclientip.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(setwscclientip.RatingCompat);
        }
    }
}
