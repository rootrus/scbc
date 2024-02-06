package p040o;

import android.content.DialogInterface;
import android.content.Intent;
import com.scb.phone.view.activity.findus.FindUsActivity;
import com.scb.phone.view.activity.partner.AbstractPartnerLoginActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;

/* renamed from: o.DirectionButton */
public final /* synthetic */ class DirectionButton implements DialogInterface.OnClickListener {
    private final /* synthetic */ AbstractPartnerLoginActivity read;

    public /* synthetic */ DirectionButton(AbstractPartnerLoginActivity abstractPartnerLoginActivity) {
        this.read = abstractPartnerLoginActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractPartnerLoginActivity abstractPartnerLoginActivity = this.read;
        dialogInterface.dismiss();
        Intent intent = new Intent(abstractPartnerLoginActivity, FindUsActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        AbstractPartnerLoginActivity.IconCompatParcelizer(abstractPartnerLoginActivity, intent);
    }
}
