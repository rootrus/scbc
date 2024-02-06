package p040o;

import android.text.format.DateFormat;
import com.thunderhead.android.infrastructure.server.entitys.ReleaseData;
import com.thunderhead.android.infrastructure.server.responses.GetAllReleasesResponse;
import java.util.Date;
import java.util.List;
import kotlin.TypeCastException;
import p040o.HmlVerifyIdentifyActivity;

@HmlSetNTBPinActivity
/* renamed from: o.FragmentBuilder_BindTransferTabFragment */
public final class FragmentBuilder_BindTransferTabFragment {

    /* renamed from: o.FragmentBuilder_BindTransferTabFragment$write */
    public static final class write implements FragmentBuilder_BindHmlDocumentUploadGuidelineFragment<GetAllReleasesResponse> {
        private /* synthetic */ MailingAddressReviewOTPActivity write;

        write(MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity) {
            this.write = mailingAddressReviewOTPActivity;
        }

        public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
            List list;
            ReleaseData[] data;
            GetAllReleasesResponse getAllReleasesResponse = (GetAllReleasesResponse) obj;
            if (this.write.IconCompatParcelizer()) {
                if (getAllReleasesResponse == null || (data = getAllReleasesResponse.getData()) == null || (list = HmlBusinessOwnerReviewSubmissionActivity.write((T[]) data)) == null) {
                    list = HmlNationalIdActivity.IconCompatParcelizer;
                }
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                this.write.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(list));
            }
        }

        public final void read() {
            if (this.write.IconCompatParcelizer()) {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                this.write.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(HmlNationalIdActivity.IconCompatParcelizer));
            }
        }

        public final void write(int i, String str) {
            if (this.write.IconCompatParcelizer()) {
                StringBuilder sb = new StringBuilder();
                sb.append("\n                    Failed to load preview workspace release data.\n                    Type: ");
                sb.append(i);
                sb.append("\n                    Additional Message:\n                    ");
                sb.append(str);
                sb.append("\n                ");
                Throwable runtimeException = new RuntimeException(GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(sb.toString()));
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.write((Object) runtimeException, "exception");
                this.write.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(runtimeException)));
            }
        }
    }

    public static final String read(long j) {
        CharSequence format = DateFormat.format("dd MMMM, ", new Date(j));
        String str = null;
        String obj = format != null ? format.toString() : null;
        CharSequence format2 = DateFormat.format("hh:mm a", new Date(j));
        if (!(format2 instanceof String)) {
            format2 = null;
        }
        String str2 = (String) format2;
        if (str2 != null) {
            if (str2 != null) {
                str = str2.toLowerCase();
                onGetStartedClick.IconCompatParcelizer((Object) str, "(this as java.lang.String).toLowerCase()");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return onGetStartedClick.write(obj, (Object) str);
    }

    public static final FragmentBuilder_BindVerifyIdentityFragment MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindTransferToMeStep1Fragment fragmentBuilder_BindTransferToMeStep1Fragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindTransferToMeStep1Fragment, "$this$getSdkMode");
        int i = fragmentBuilder_BindTransferToMeStep1Fragment.IconCompatParcelizer;
        if (i == 0) {
            return FragmentBuilder_BindVerifyIdentityFragment.PREVIEW_WORKS;
        }
        if (i == 1) {
            return FragmentBuilder_BindVerifyIdentityFragment.PREVIEW_LAUNCHPAD;
        }
        if (i != 2) {
            return null;
        }
        return FragmentBuilder_BindVerifyIdentityFragment.PREVIEW_LIVE;
    }
}
