package p040o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.scb.phone.view.activity.easycash.introduction.EasycashBaseIntroductionActivity;

/* renamed from: o.pQ */
public final /* synthetic */ class C7355pQ implements Runnable {
    private final /* synthetic */ EasycashBaseIntroductionActivity IconCompatParcelizer;

    public /* synthetic */ C7355pQ(EasycashBaseIntroductionActivity easycashBaseIntroductionActivity) {
        this.IconCompatParcelizer = easycashBaseIntroductionActivity;
    }

    public final void run() {
        EasycashBaseIntroductionActivity easycashBaseIntroductionActivity = this.IconCompatParcelizer;
        ViewGroup.LayoutParams layoutParams = easycashBaseIntroductionActivity.imagePlaceholder.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams.height = (int) (((double) easycashBaseIntroductionActivity.getResources().getDisplayMetrics().widthPixels) * 0.3875d);
        }
        easycashBaseIntroductionActivity.imagePlaceholder.setLayoutParams(layoutParams);
    }
}
