package p040o;

import android.view.View;
import java.lang.reflect.Field;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.MyQRCoachMarkActivity_ViewBinding */
public final class MyQRCoachMarkActivity_ViewBinding extends onSaveClick implements View.OnClickListener {
    private final View.OnClickListener read;

    private MyQRCoachMarkActivity_ViewBinding(View.OnClickListener onClickListener, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.read = onClickListener;
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
    }

    public final void onClick(View view) {
        MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
        StringBuilder sb = new StringBuilder();
        sb.append("Intercept click: ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        View.OnClickListener onClickListener = this.read;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static View.OnClickListener read(View view) {
        Object obj;
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                obj = declaredField.get(view);
            } else {
                obj = null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            if (declaredField2 == null || obj == null) {
                return null;
            }
            return (View.OnClickListener) declaredField2.get(obj);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneOnClickListenerV14 - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(View view) throws ClassCastException {
        view.setOnClickListener(this.read);
    }

    static boolean IconCompatParcelizer(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null) {
            return false;
        }
        View.OnClickListener read2 = read(deejungTransferLandingActivity.IconCompatParcelizer);
        if (read2 == null || !(read2 instanceof MyQRCoachMarkActivity_ViewBinding)) {
            MyQRCoachMarkActivity_ViewBinding myQRCoachMarkActivity_ViewBinding = new MyQRCoachMarkActivity_ViewBinding(read2, deejungTransferLandingActivity);
            deejungTransferLandingActivity.IconCompatParcelizer.setOnClickListener(myQRCoachMarkActivity_ViewBinding);
            BankingAgentSuccessActivity_ViewBinding.write(deejungTransferLandingActivity.IconCompatParcelizer, true, myQRCoachMarkActivity_ViewBinding);
            return true;
        }
        ((MyQRCoachMarkActivity_ViewBinding) read2).read(deejungTransferLandingActivity);
        return false;
    }
}
