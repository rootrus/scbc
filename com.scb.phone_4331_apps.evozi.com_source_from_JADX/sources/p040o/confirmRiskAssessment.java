package p040o;

import android.view.View;
import com.scb.phone.view.custom.profilemanagement.AddedAccountManagementSuccessItemCustomView;

/* renamed from: o.confirmRiskAssessment */
public final /* synthetic */ class confirmRiskAssessment implements View.OnClickListener {
    private final /* synthetic */ AddedAccountManagementSuccessItemCustomView write;

    public /* synthetic */ confirmRiskAssessment(AddedAccountManagementSuccessItemCustomView addedAccountManagementSuccessItemCustomView) {
        this.write = addedAccountManagementSuccessItemCustomView;
    }

    public final void onClick(View view) {
        this.write.read(true);
    }
}
