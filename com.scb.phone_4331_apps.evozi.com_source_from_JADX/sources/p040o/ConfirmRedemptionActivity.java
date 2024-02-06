package p040o;

import android.app.Activity;
import com.google.gson.Gson;
import com.thunderhead.android.infrastructure.server.responses.InteractionRegionErrorResponse;
import com.thunderhead.connectivity.NetworkOperationError;

/* renamed from: o.ConfirmRedemptionActivity */
public class ConfirmRedemptionActivity {
    public void IconCompatParcelizer(Activity activity, int i, NetworkOperationError networkOperationError, onAccountSummaryClick$MediaBrowserCompat$ItemReceiver onaccountsummaryclick_mediabrowsercompat_itemreceiver) {
    }

    public void read(String str, NetworkOperationError networkOperationError) {
        MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.IconCompatParcelizer, String.format("Request %s failure. Reason: %s", new Object[]{str, networkOperationError.getMessage()}));
    }

    public final void MediaBrowserCompat$ItemReceiver(Activity activity, NetworkOperationError networkOperationError, FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment) {
        String str;
        String str2;
        if (!NetworkOperationError.Kind.HTTP.equals(networkOperationError.getKind()) || networkOperationError.getBody() == null || networkOperationError.getHttpStatusCode() != 400) {
            read(activity, networkOperationError, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment);
            return;
        }
        if (networkOperationError.getBody() != null) {
            str = IconCompatParcelizer(networkOperationError);
        } else {
            str = "";
        }
        if (str == null || str.length() == 0) {
            str2 = FragmentBuilder_BindHmlBusinessOwnerGuidelinesFragment.read(17);
        } else {
            str2 = str;
        }
        MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.IconCompatParcelizer, str2);
        if (fragmentBuilder_BindHmlDocumentUploadGuidelineFragment != null) {
            fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.write(17, str);
            IconCompatParcelizer(activity, 17, networkOperationError, (onAccountSummaryClick$MediaBrowserCompat$ItemReceiver) null);
        }
    }

    private static String IconCompatParcelizer(NetworkOperationError networkOperationError) {
        if ("application/json".equals(networkOperationError.getBody().getMimeType())) {
            try {
                String message = ((InteractionRegionErrorResponse) new Gson().fromJson(networkOperationError.getBody().getRawBody(), InteractionRegionErrorResponse.class)).getMessage();
                if (message != null) {
                    message = message.trim();
                }
                return message == null || message.length() == 0 ? "" : message;
            } catch (RuntimeException e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        }
    }

    public final void read(Activity activity, NetworkOperationError networkOperationError, FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment) {
        if (!NetworkOperationError.Kind.HTTP.equals(networkOperationError.getKind()) || networkOperationError.getBody() == null || networkOperationError.getHttpStatusCode() != 401) {
            IconCompatParcelizer(activity, networkOperationError, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment);
            return;
        }
        MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.IconCompatParcelizer, FragmentBuilder_BindHmlBusinessOwnerGuidelinesFragment.read(3));
        if (fragmentBuilder_BindHmlDocumentUploadGuidelineFragment != null) {
            fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.write(3, "");
            IconCompatParcelizer(activity, 3, networkOperationError, (onAccountSummaryClick$MediaBrowserCompat$ItemReceiver) null);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(Activity activity, NetworkOperationError networkOperationError, FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment, onAccountSummaryClick$MediaBrowserCompat$ItemReceiver onaccountsummaryclick_mediabrowsercompat_itemreceiver) {
        if (!NetworkOperationError.Kind.HTTP.equals(networkOperationError.getKind()) || networkOperationError.getBody() == null || networkOperationError.getHttpStatusCode() != 401) {
            IconCompatParcelizer(activity, networkOperationError, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment);
            return;
        }
        MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.IconCompatParcelizer, FragmentBuilder_BindHmlBusinessOwnerGuidelinesFragment.read(3));
        fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.write(3, "");
        IconCompatParcelizer(activity, 3, networkOperationError, onaccountsummaryclick_mediabrowsercompat_itemreceiver);
    }

    private void IconCompatParcelizer(Activity activity, NetworkOperationError networkOperationError, FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment) {
        int i;
        String str;
        if (NetworkOperationError.Kind.INTERNAL.equals(networkOperationError.getKind())) {
            if (networkOperationError.getException() != null) {
                str = networkOperationError.getException().getMessage();
            } else {
                str = "";
            }
            i = ("java.io.InterruptedIOException: timeout".equals(str) || "timeout".equals(str)) ? write(19, "", (String) null, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment) : write(1, str, "An internal error occurred while attempting to execute a request.", fragmentBuilder_BindHmlDocumentUploadGuidelineFragment);
        } else if (!NetworkOperationError.Kind.HTTP.equals(networkOperationError.getKind())) {
            i = 0;
        } else if (networkOperationError.getHttpStatusCode() == 403) {
            i = write(6, "", (String) null, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment);
        } else if (networkOperationError.getHttpStatusCode() == 400) {
            i = write(17, "", (String) null, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment);
        } else {
            i = networkOperationError.getHttpStatusCode() == 409 ? write(8, "", (String) null, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment) : write(1, "", (String) null, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment);
        }
        IconCompatParcelizer(activity, i, networkOperationError, (onAccountSummaryClick$MediaBrowserCompat$ItemReceiver) null);
    }

    private static int write(int i, String str, String str2, FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment) {
        if (str2 == null) {
            str2 = FragmentBuilder_BindHmlBusinessOwnerGuidelinesFragment.read(i);
        }
        MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.IconCompatParcelizer, str2);
        if (fragmentBuilder_BindHmlDocumentUploadGuidelineFragment == null) {
            return 0;
        }
        fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.write(i, str);
        return i;
    }
}
