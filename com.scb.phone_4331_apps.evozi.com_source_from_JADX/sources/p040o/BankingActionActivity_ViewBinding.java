package p040o;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import java.lang.reflect.Field;

/* renamed from: o.BankingActionActivity_ViewBinding */
public final class BankingActionActivity_ViewBinding extends BankingAgentSuccessActivity<CompoundButton.OnCheckedChangeListener, CompoundButton> implements CompoundButton.OnCheckedChangeListener {
    protected BankingActionActivity_ViewBinding(String str, String str2) {
        super(str, str2);
    }

    public final void read(View view) {
        if (!CompoundButton.class.isAssignableFrom(view.getClass())) {
            MyECouponActivity_ViewBinding.write("View should be a CheckBox sibling");
            return;
        }
        CompoundButton compoundButton = (CompoundButton) view;
        T IconCompatParcelizer = IconCompatParcelizer(compoundButton);
        if (IconCompatParcelizer != this) {
            this.IconCompatParcelizer = IconCompatParcelizer;
            compoundButton.setOnCheckedChangeListener(this);
        }
    }

    public final void write(View view) throws ClassCastException {
        super.write(view);
        ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this.IconCompatParcelizer);
    }

    private static CompoundButton.OnCheckedChangeListener IconCompatParcelizer(CompoundButton compoundButton) {
        try {
            Class cls = compoundButton.getClass();
            while (cls != CompoundButton.class) {
                cls = cls.getSuperclass();
            }
            Field declaredField = cls.getDeclaredField("mOnCheckedChangeListener");
            declaredField.setAccessible(true);
            return (CompoundButton.OnCheckedChangeListener) declaredField.get(compoundButton);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.IconCompatParcelizer != null) {
            ((CompoundButton.OnCheckedChangeListener) this.IconCompatParcelizer).onCheckedChanged(compoundButton, z);
        }
        String str = "ON";
        if (!z || !(compoundButton instanceof RadioButton)) {
            if (!z) {
                str = "OFF";
            }
            read(str, false);
            return;
        }
        if (!z) {
            str = "OFF";
        }
        read(str, true);
    }
}
