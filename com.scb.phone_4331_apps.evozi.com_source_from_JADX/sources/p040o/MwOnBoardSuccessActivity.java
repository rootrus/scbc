package p040o;

import p040o.MwCreateQrActivity;

/* renamed from: o.MwOnBoardSuccessActivity */
public final class MwOnBoardSuccessActivity {
    /* access modifiers changed from: private */
    public static final EkycOtpActivity IconCompatParcelizer = new EkycOtpActivity("COMPLETING_ALREADY");
    public static final EkycOtpActivity MediaBrowserCompat$CustomActionResultReceiver = new EkycOtpActivity("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */
    public static final MwCreateQrActivity.MwScreenshotDisplay MediaBrowserCompat$ItemReceiver = new MwCreateQrActivity.MwScreenshotDisplay(true);
    /* access modifiers changed from: private */
    public static final EkycOtpActivity MediaBrowserCompat$MediaItem = new EkycOtpActivity("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */
    public static final EkycOtpActivity RatingCompat = new EkycOtpActivity("SEALED");
    /* access modifiers changed from: private */
    public static final EkycOtpActivity read = new EkycOtpActivity("COMPLETING_RETRY");
    /* access modifiers changed from: private */
    public static final MwCreateQrActivity.MwScreenshotDisplay write = new MwCreateQrActivity.MwScreenshotDisplay(false);

    public static final Object write(Object obj) {
        return obj instanceof MwManageReceivingAccountActivity ? new MwManageReceivingAccountActivity_ViewBinding((MwManageReceivingAccountActivity) obj) : obj;
    }

    public static final Object read(Object obj) {
        MwManageReceivingAccountActivity mwManageReceivingAccountActivity;
        MwManageReceivingAccountActivity_ViewBinding mwManageReceivingAccountActivity_ViewBinding = (MwManageReceivingAccountActivity_ViewBinding) (!(obj instanceof MwManageReceivingAccountActivity_ViewBinding) ? null : obj);
        return (mwManageReceivingAccountActivity_ViewBinding == null || (mwManageReceivingAccountActivity = mwManageReceivingAccountActivity_ViewBinding.write) == null) ? obj : mwManageReceivingAccountActivity;
    }
}
