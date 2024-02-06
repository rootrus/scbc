package com.scb.phone.view.fragment.hml;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.submission.HmlDocumentSubmissionActivity;
import com.scb.phone.view.adapter.hml.HmlDocumentsUploadedAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.HmlPinActivity;
import p040o.IPassportDeserializer;
import p040o.MyECouponActivity_ViewBinding;
import p040o.convertBytesToHex;
import p040o.convertBytesToHex$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.setPersonalShortCuts;
import p040o.setTapText;
import p040o.writeFatal;
import p040o.writeUInt64NoTag;

public class HmlDocumentUploadGuidelineFragment extends BaseFragment implements IPassportDeserializer {
    public static final C5986x77d984aa IconCompatParcelizer = new C5986x77d984aa((byte) 0);
    @BindView
    public Button nextButton;
    @HmlPinActivity
    public convertBytesToHex presenter;
    @BindView
    public RecyclerView recycler;
    @BindView
    public TextView subtitle;

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r6 == null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
        /*
            r3 = this;
            java.lang.String r6 = "inflater"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r6)
            r6 = 2131494011(0x7f0c047b, float:1.8611518E38)
            r0 = 0
            android.view.View r4 = r4.inflate(r6, r5, r0)
            butterknife.Unbinder r5 = butterknife.ButterKnife.IconCompatParcelizer(r3, r4)
            r3.read = r5
            o.convertBytesToHex r5 = r3.presenter
            java.lang.String r6 = "presenter"
            if (r5 != 0) goto L_0x001c
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x001c:
            r0 = r3
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r0 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r0
            r5.MediaBrowserCompat$ItemReceiver(r0)
            o.convertBytesToHex r5 = r3.presenter
            if (r5 != 0) goto L_0x0029
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0029:
            android.os.Bundle r6 = r3.getArguments()
            r0 = 0
            if (r6 == 0) goto L_0x0045
            r1 = -1
            java.lang.String r2 = "EXTRA_TYPE"
            int r6 = r6.getInt(r2, r1)
            if (r6 < 0) goto L_0x0040
            o.VisibilityAwareImageButton[] r1 = p040o.VisibilityAwareImageButton.values()
            r6 = r1[r6]
            goto L_0x0041
        L_0x0040:
            r6 = r0
        L_0x0041:
            o.VisibilityAwareImageButton r6 = (p040o.VisibilityAwareImageButton) r6
            if (r6 != 0) goto L_0x0047
        L_0x0045:
            o.VisibilityAwareImageButton r6 = p040o.VisibilityAwareImageButton.NORMAL
        L_0x0047:
            android.os.Bundle r1 = r3.getArguments()
            if (r1 == 0) goto L_0x0053
            java.lang.String r0 = "DEEPLINK_ID"
            java.lang.String r0 = r1.getString(r0)
        L_0x0053:
            r5.read(r6, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.HmlDocumentUploadGuidelineFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void MediaBrowserCompat$ItemReceiver(writeFatal writefatal) {
        onGetStartedClick.write((Object) writefatal, "display");
        TextView textView = this.subtitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("subtitle");
        }
        textView.setText(getString(R.string.hml_document_guidelines_subtitle, writefatal.MediaBrowserCompat$ItemReceiver));
        RecyclerView recyclerView = this.recycler;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recycler");
        }
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = this.recycler;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recycler");
        }
        recyclerView2.setAdapter(new HmlDocumentsUploadedAdapter(writefatal.read));
    }

    @OnClick
    public final void onNextClicked() {
        convertBytesToHex convertbytestohex = this.presenter;
        if (convertbytestohex == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = convertBytesToHex$MediaBrowserCompat$CustomActionResultReceiver.write;
        if (convertbytestohex.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(convertbytestohex.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Button button = this.nextButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button.setEnabled(false);
    }

    public void IconCompatParcelizer() {
        HmlDocumentSubmissionActivity.write write = HmlDocumentSubmissionActivity.MediaDescriptionCompat;
        Intent MediaBrowserCompat$ItemReceiver = HmlDocumentSubmissionActivity.write.MediaBrowserCompat$ItemReceiver(requireContext(), setPersonalShortCuts.SUBMISSION);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(MediaBrowserCompat$ItemReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroy() {
        convertBytesToHex convertbytestohex = this.presenter;
        if (convertbytestohex == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        convertbytestohex.onDestroy();
        super.onDestroy();
    }
}
