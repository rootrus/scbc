package p040o;

import android.content.DialogInterface;
import android.content.Intent;
import com.scb.phone.view.activity.scheduledtransaction.ScheduleLandingActivity;

/* renamed from: o.onRangeSelected */
public final /* synthetic */ class onRangeSelected implements DialogInterface.OnClickListener {
    private final /* synthetic */ Intent IconCompatParcelizer;
    private final /* synthetic */ ScheduleLandingActivity write;

    public /* synthetic */ onRangeSelected(ScheduleLandingActivity scheduleLandingActivity, Intent intent) {
        this.write = scheduleLandingActivity;
        this.IconCompatParcelizer = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ScheduleLandingActivity scheduleLandingActivity = this.write;
        scheduleLandingActivity.setResult(-1, this.IconCompatParcelizer);
        scheduleLandingActivity.finish();
    }
}
