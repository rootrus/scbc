package p040o;

import android.view.View;
import android.widget.RadioGroup;
import java.lang.reflect.Field;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.MyQRMenuActivity_ViewBinding */
public final class MyQRMenuActivity_ViewBinding extends onSaveClick implements RadioGroup.OnCheckedChangeListener {
    private final RadioGroup.OnCheckedChangeListener MediaBrowserCompat$ItemReceiver;

    private MyQRMenuActivity_ViewBinding(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.MediaBrowserCompat$ItemReceiver = onCheckedChangeListener;
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
        StringBuilder sb = new StringBuilder();
        sb.append("Intercept click on radio group: ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.MediaBrowserCompat$ItemReceiver;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(radioGroup, i);
        }
    }

    public static RadioGroup.OnCheckedChangeListener read(View view) {
        try {
            Field declaredField = Class.forName("android.widget.RadioGroup").getDeclaredField("mOnCheckedChangeListener");
            if (declaredField == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (RadioGroup.OnCheckedChangeListener) declaredField.get(view);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneOnCheckedChangeListener - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(View view) {
        ((RadioGroup) view).setOnCheckedChangeListener(this.MediaBrowserCompat$ItemReceiver);
    }

    public static boolean write(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null) {
            return false;
        }
        RadioGroup.OnCheckedChangeListener read = read(deejungTransferLandingActivity.IconCompatParcelizer);
        if (read == null || !(read instanceof MyQRMenuActivity_ViewBinding)) {
            MyQRMenuActivity_ViewBinding myQRMenuActivity_ViewBinding = new MyQRMenuActivity_ViewBinding(read, deejungTransferLandingActivity);
            ((RadioGroup) deejungTransferLandingActivity.IconCompatParcelizer).setOnCheckedChangeListener(myQRMenuActivity_ViewBinding);
            BankingAgentSuccessActivity_ViewBinding.write(deejungTransferLandingActivity.IconCompatParcelizer, true, myQRMenuActivity_ViewBinding);
            return true;
        }
        ((MyQRMenuActivity_ViewBinding) read).read(deejungTransferLandingActivity);
        return false;
    }
}
