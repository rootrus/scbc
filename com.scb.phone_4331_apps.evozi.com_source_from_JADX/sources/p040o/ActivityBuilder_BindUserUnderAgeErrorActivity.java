package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.investment.scbs.open.SuitabilityQuestionsPart2Fragment;

/* renamed from: o.ActivityBuilder_BindUserUnderAgeErrorActivity */
public final /* synthetic */ class ActivityBuilder_BindUserUnderAgeErrorActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ SuitabilityQuestionsPart2Fragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_BindUserUnderAgeErrorActivity(SuitabilityQuestionsPart2Fragment suitabilityQuestionsPart2Fragment) {
        this.IconCompatParcelizer = suitabilityQuestionsPart2Fragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.IconCompatParcelizer.presenter.IconCompatParcelizer();
    }
}
