package p040o;

import android.view.View;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;
import p040o.BankingAgentSuccessActivity;

/* renamed from: o.setTapIcon */
public abstract class setTapIcon<T, V> implements ZoomDocumentActivity_ViewBinding {
    protected T IconCompatParcelizer;
    protected String MediaBrowserCompat$ItemReceiver;
    FragmentBuilder_BindHmlBusinessOccupationInfoFragment read;
    protected String write;

    setTapIcon(String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
    }

    public static setTapIcon MediaBrowserCompat$ItemReceiver(View view, String str, String str2, FragmentBuilder_BindHmlBusinessOccupationInfoFragment fragmentBuilder_BindHmlBusinessOccupationInfoFragment) {
        setTapIcon settapicon = null;
        if (view == null) {
            MyECouponActivity_ViewBinding.write("Capture injecting: view shouldn't be null");
            return null;
        }
        if (view instanceof CompoundButton) {
            settapicon = new BankingActionActivity_ViewBinding(str, str2);
        } else if (view instanceof RadioGroup) {
            settapicon = new BankingAgentReviewActivity_ViewBinding(str, str2);
        } else if (!(view instanceof CheckedTextView)) {
            if (view instanceof TextView) {
                settapicon = new BankingAgentSuccessActivity.SlipScreenshot(str, str2);
            } else if (view instanceof DatePicker) {
                settapicon = new onClickTutorial(str, str2);
            } else if (view instanceof TimePicker) {
                settapicon = new BankingAgentSuccessActivity.SlipScreenshot_ViewBinding(str, str2);
            } else if (view instanceof SeekBar) {
                settapicon = new setButtonDivider(str, str2);
            } else if (view instanceof NumberPicker) {
                settapicon = new clickGenerateQR(str, str2);
            } else if (view instanceof RatingBar) {
                settapicon = new clickReturnToAccount(str, str2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown view type ");
                sb.append(view.getClass().getSimpleName());
                sb.append(". Can't inject submit data capture");
                MyECouponActivity_ViewBinding.write(sb.toString());
            }
        }
        if (settapicon != null) {
            settapicon.read = fragmentBuilder_BindHmlBusinessOccupationInfoFragment;
            try {
                settapicon.read(view);
                BankingAgentSuccessActivity_ViewBinding.read(view, true, settapicon);
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error occurred while injecting a capture into ");
                sb2.append(view.getClass().getSimpleName());
                MyECouponActivity_ViewBinding.write(sb2.toString());
                e.printStackTrace();
            }
        }
        return settapicon;
    }

    static void MediaBrowserCompat$ItemReceiver(View view) {
        setTapIcon MediaBrowserCompat$CustomActionResultReceiver;
        if (BankingAgentSuccessActivity_ViewBinding.write(view) && (MediaBrowserCompat$CustomActionResultReceiver = BankingAgentSuccessActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(view)) != null) {
            try {
                MediaBrowserCompat$CustomActionResultReceiver.write(view);
            } catch (ClassCastException unused) {
                MyECouponActivity_ViewBinding.write("Error while ejecting capture from view");
            }
            BankingAgentSuccessActivity_ViewBinding.read(view, false, (setTapIcon) null);
        }
    }
}
