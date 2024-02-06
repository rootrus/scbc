package retrofit2;

import p040o.FundFactSheetActivity;
import p040o.HmlDocumentSubmissionActivity;
import p040o.HmlNTBPromptPayNotFoundActivity;
import p040o.HmlPromptPayVerificationActivity_ViewBinding;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.MailingAddressReviewActivity;
import p040o.MailingAddressReviewOTPActivity;
import p040o.onGetStartedClick;

public final class KotlinExtensions {
    private static final <T> T create(Retrofit retrofit) {
        onGetStartedClick.write();
        return retrofit.create(Object.class);
    }

    public static final <T> Object await(Call<T> call, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        MailingAddressReviewActivity mailingAddressReviewActivity = new MailingAddressReviewActivity(HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(hmlNTBPromptPayNotFoundActivity), 1);
        MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity = mailingAddressReviewActivity;
        mailingAddressReviewOTPActivity.IconCompatParcelizer((FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity>) new C7576x19835f10(call));
        call.enqueue(new KotlinExtensions$await$2$2(mailingAddressReviewOTPActivity));
        Object MediaBrowserCompat$CustomActionResultReceiver = mailingAddressReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
            onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "frame");
        }
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static final <T> Object awaitNullable(Call<T> call, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        MailingAddressReviewActivity mailingAddressReviewActivity = new MailingAddressReviewActivity(HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(hmlNTBPromptPayNotFoundActivity), 1);
        MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity = mailingAddressReviewActivity;
        mailingAddressReviewOTPActivity.IconCompatParcelizer((FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity>) new C7577x19835f11(call));
        call.enqueue(new KotlinExtensions$await$4$2(mailingAddressReviewOTPActivity));
        Object MediaBrowserCompat$CustomActionResultReceiver = mailingAddressReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
            onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "frame");
        }
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static final <T> Object awaitResponse(Call<T> call, HmlNTBPromptPayNotFoundActivity<? super Response<T>> hmlNTBPromptPayNotFoundActivity) {
        MailingAddressReviewActivity mailingAddressReviewActivity = new MailingAddressReviewActivity(HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(hmlNTBPromptPayNotFoundActivity), 1);
        MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity = mailingAddressReviewActivity;
        mailingAddressReviewOTPActivity.IconCompatParcelizer((FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity>) new C7578xc95e9eb1(call));
        call.enqueue(new KotlinExtensions$awaitResponse$2$2(mailingAddressReviewOTPActivity));
        Object MediaBrowserCompat$CustomActionResultReceiver = mailingAddressReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
            onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "frame");
        }
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object yieldAndThrow(java.lang.Exception r7, p040o.HmlNTBPromptPayNotFoundActivity<?> r8) {
        /*
            boolean r0 = r8 instanceof retrofit2.KotlinExtensions$yieldAndThrow$1
            if (r0 == 0) goto L_0x0014
            r0 = r8
            retrofit2.KotlinExtensions$yieldAndThrow$1 r0 = (retrofit2.KotlinExtensions$yieldAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 + r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            retrofit2.KotlinExtensions$yieldAndThrow$1 r0 = new retrofit2.KotlinExtensions$yieldAndThrow$1
            r0.<init>(r8)
        L_0x0019:
            java.lang.Object r8 = r0.result
            o.HmlPromptPayVerificationActivity_ViewBinding r1 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r7 = r0.L$0
            java.lang.Exception r7 = (java.lang.Exception) r7
            boolean r0 = r8 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r0 == 0) goto L_0x00b5
            o.HmlVerifyIdentifyActivity$write r8 = (p040o.HmlVerifyIdentifyActivity.write) r8
            java.lang.Throwable r7 = r8.read
            throw r7
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            boolean r2 = r8 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r2 != 0) goto L_0x00b8
            r0.L$0 = r7
            r0.label = r3
            o.HmlPromptPayVerificationActivity r8 = r0.getContext()
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((p040o.HmlPromptPayVerificationActivity) r8)
            o.HmlNTBPromptPayNotFoundActivity r2 = p040o.HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(r0)
            boolean r4 = r2 instanceof p040o.saveSlipButton
            if (r4 != 0) goto L_0x0051
            r2 = 0
        L_0x0051:
            o.saveSlipButton r2 = (p040o.saveSlipButton) r2
            if (r2 == 0) goto L_0x00a0
            o.MwBusinessDetailsActivity r4 = r2.read
            boolean r4 = r4.write((p040o.HmlPromptPayVerificationActivity) r8)
            java.lang.String r5 = "context"
            if (r4 == 0) goto L_0x0070
            o.HmlVerifyPhoneValidateOtpActivity r4 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r5)
            r2.IconCompatParcelizer = r4
            r2.MediaDescriptionCompat = r3
            o.MwBusinessDetailsActivity r3 = r2.read
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r3.read(r8, r2)
            goto L_0x009d
        L_0x0070:
            o.onDoneClick r4 = new o.onDoneClick
            r4.<init>()
            r6 = r4
            o.HmlPromptPayVerificationActivity r6 = (p040o.HmlPromptPayVerificationActivity) r6
            o.HmlPromptPayVerificationActivity r8 = r8.MediaBrowserCompat$ItemReceiver(r6)
            o.HmlVerifyPhoneValidateOtpActivity r6 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r5)
            r2.IconCompatParcelizer = r6
            r2.MediaDescriptionCompat = r3
            o.MwBusinessDetailsActivity r3 = r2.read
            r5 = r2
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r3.read(r8, r5)
            boolean r8 = r4.MediaBrowserCompat$CustomActionResultReceiver
            if (r8 == 0) goto L_0x009d
            boolean r8 = p040o.onCreateQRCodeButtonClick.MediaBrowserCompat$ItemReceiver(r2)
            if (r8 == 0) goto L_0x009a
            o.HmlPromptPayVerificationActivity_ViewBinding r8 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            goto L_0x00a2
        L_0x009a:
            o.HmlVerifyPhoneValidateOtpActivity r8 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            goto L_0x00a2
        L_0x009d:
            o.HmlPromptPayVerificationActivity_ViewBinding r8 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            goto L_0x00a2
        L_0x00a0:
            o.HmlVerifyPhoneValidateOtpActivity r8 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x00a2:
            o.HmlPromptPayVerificationActivity_ViewBinding r2 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            if (r8 != r2) goto L_0x00ab
            java.lang.String r2 = "frame"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
        L_0x00ab:
            o.HmlPromptPayVerificationActivity_ViewBinding r0 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            if (r8 != r0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            o.HmlVerifyPhoneValidateOtpActivity r8 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x00b2:
            if (r8 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            throw r7
        L_0x00b8:
            o.HmlVerifyIdentifyActivity$write r8 = (p040o.HmlVerifyIdentifyActivity.write) r8
            java.lang.Throwable r7 = r8.read
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.yieldAndThrow(java.lang.Exception, o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }
}
