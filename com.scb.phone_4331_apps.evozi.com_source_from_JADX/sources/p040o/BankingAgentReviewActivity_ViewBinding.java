package p040o;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/* renamed from: o.BankingAgentReviewActivity_ViewBinding */
final class BankingAgentReviewActivity_ViewBinding extends BankingAgentSuccessActivity<RadioGroup.OnCheckedChangeListener, RadioGroup> implements RadioGroup.OnCheckedChangeListener {
    protected BankingAgentReviewActivity_ViewBinding(String str, String str2) {
        super(str, str2);
    }

    public final void read(View view) {
        if (!RadioGroup.class.isAssignableFrom(view.getClass())) {
            MyECouponActivity_ViewBinding.write("View should be a RadioGroup sibling");
        }
        RadioGroup radioGroup = (RadioGroup) view;
        T read = MyQRMenuActivity_ViewBinding.read(radioGroup);
        if (read != this) {
            this.IconCompatParcelizer = read;
            radioGroup.setOnCheckedChangeListener(this);
        }
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (this.IconCompatParcelizer != null) {
            ((RadioGroup.OnCheckedChangeListener) this.IconCompatParcelizer).onCheckedChanged(radioGroup, i);
        }
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
        if (radioButton != null) {
            read(radioButton.getText().toString(), true);
        } else {
            read("", true);
        }
    }
}
