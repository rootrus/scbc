package com.scb.phone.view.activity.hml.submission;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.activity.hml.C5621x983ea256;
import com.scb.phone.view.activity.hml.HmlCaptureDocumentActivity;
import com.scb.phone.view.activity.hml.HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.hml.HmlReviewDocumentActivity;
import com.scb.phone.view.activity.hml.submission.HmlCropDocumentActivity;
import com.scb.phone.view.fragment.hml.submission.HmlDocumentCropTutorialFragment;
import com.scb.phone.view.fragment.hml.submission.HmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.hml.submission.HmlDocumentKofaxInstructionFragment;
import com.scb.phone.view.fragment.hml.submission.HmlDocumentKofaxTutorialFragment;
import com.scb.phone.view.fragment.hml.submission.HmlDocumentReviewTutorialFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C1424xf54be1d0;
import p040o.C7385x18ceaefe;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;
import p040o.setTapText;

public class HmlDocumentSubmissionTutorialsActivity extends BaseActivityWithFragment implements C1424xf54be1d0 {
    public static final C5634xbe8cfba3 MediaBrowserCompat$SearchResultReceiver = new C5634xbe8cfba3((byte) 0);

    /* access modifiers changed from: protected */
    public String AppCompatActivity() {
        return "etb";
    }

    public final String av_() {
        return "CURRENT_FRAGMENT_TAG";
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        String stringExtra = getIntent().getStringExtra("STEP_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Constants.STEP_TAG)");
        int hashCode = stringExtra.hashCode();
        if (hashCode == -2035398557 ? !stringExtra.equals("KOFAX_INSTRUCTION_STEP") : hashCode != 343725159 || !stringExtra.equals("KOFAX_TUTORIAL_STEP")) {
            ListMenuItemView();
        } else {
            setTabContainer();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        String stringExtra = getIntent().getStringExtra("STEP_TAG");
        if (stringExtra != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != -2035398557) {
                if (hashCode != -338636898) {
                    if (hashCode == -222557594 && stringExtra.equals("REVIEW_TUTORIAL_STEP")) {
                        HmlDocumentReviewTutorialFragment.write write = HmlDocumentReviewTutorialFragment.IconCompatParcelizer;
                        return new HmlDocumentReviewTutorialFragment();
                    }
                } else if (stringExtra.equals("CROP_TUTORIAL_STEP")) {
                    HmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver hmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver = HmlDocumentCropTutorialFragment.IconCompatParcelizer;
                    boolean booleanExtra = getIntent().getBooleanExtra("ENABLE_NAVIGATION_TAG", true);
                    HmlDocumentCropTutorialFragment hmlDocumentCropTutorialFragment = new HmlDocumentCropTutorialFragment();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("NAVIGATION_ENABLED_TAG", booleanExtra);
                    hmlDocumentCropTutorialFragment.setArguments(bundle);
                    return hmlDocumentCropTutorialFragment;
                }
            } else if (stringExtra.equals("KOFAX_INSTRUCTION_STEP")) {
                HmlDocumentKofaxInstructionFragment.read read = HmlDocumentKofaxInstructionFragment.MediaBrowserCompat$CustomActionResultReceiver;
                return new HmlDocumentKofaxInstructionFragment();
            }
        }
        HmlDocumentKofaxTutorialFragment.IconCompatParcelizer iconCompatParcelizer = HmlDocumentKofaxTutorialFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new HmlDocumentKofaxTutorialFragment();
    }

    public final String au_() {
        int i;
        String stringExtra = getIntent().getStringExtra("STEP_TAG");
        if (stringExtra != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != -2035398557) {
                if (hashCode != -338636898) {
                    if (hashCode == -222557594 && stringExtra.equals("REVIEW_TUTORIAL_STEP")) {
                        i = R.string.auto_kofax_verify_tutorial_title;
                        String string = getString(i);
                        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(when (intent.g…rial_title\n            })");
                        return string;
                    }
                } else if (stringExtra.equals("CROP_TUTORIAL_STEP")) {
                    i = R.string.auto_kofax_crop_tutorial_title;
                    String string2 = getString(i);
                    onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(when (intent.g…rial_title\n            })");
                    return string2;
                }
            } else if (stringExtra.equals("KOFAX_INSTRUCTION_STEP")) {
                i = R.string.auto_kofax_instruction_title;
                String string22 = getString(i);
                onGetStartedClick.IconCompatParcelizer((Object) string22, "getString(when (intent.g…rial_title\n            })");
                return string22;
            }
        }
        i = R.string.auto_kofax_camera_tutorial_title;
        String string222 = getString(i);
        onGetStartedClick.IconCompatParcelizer((Object) string222, "getString(when (intent.g…rial_title\n            })");
        return string222;
    }

    public void onBackPressed() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("CURRENT_FRAGMENT_TAG");
        if (findFragmentByTag instanceof C7385x18ceaefe) {
            ((C7385x18ceaefe) findFragmentByTag).IconCompatParcelizer();
        } else {
            super.onBackPressed();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        onGetStartedClick.write((Object) menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void read() {
        HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver hmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver = HmlCaptureDocumentActivity.MediaMetadataCompat;
        String stringExtra = getIntent().getStringExtra("APPLICATION_ID_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Co…tants.APPLICATION_ID_TAG)");
        String stringExtra2 = getIntent().getStringExtra("DOCUMENT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(Constants.DOCUMENT_TYPE_TAG)");
        String stringExtra3 = getIntent().getStringExtra("PRODUCT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "intent.getStringExtra(Constants.PRODUCT_TYPE_TAG)");
        String stringExtra4 = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra4, "intent.getStringExtra(Constants.FLOW_TAG)");
        Intent IconCompatParcelizer = HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this, stringExtra, stringExtra2, stringExtra3, stringExtra4);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void MediaBrowserCompat$ItemReceiver() {
        HmlCropDocumentActivity.write write = HmlCropDocumentActivity.MediaBrowserCompat$SearchResultReceiver;
        String stringExtra = getIntent().getStringExtra("APPLICATION_ID_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Co…tants.APPLICATION_ID_TAG)");
        String stringExtra2 = getIntent().getStringExtra("IMAGE_PATH_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(Constants.IMAGE_PATH_TAG)");
        String stringExtra3 = getIntent().getStringExtra("DOCUMENT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "intent.getStringExtra(Constants.DOCUMENT_TYPE_TAG)");
        String stringExtra4 = getIntent().getStringExtra("PRODUCT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra4, "intent.getStringExtra(Constants.PRODUCT_TYPE_TAG)");
        String stringExtra5 = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra5, "intent.getStringExtra(Constants.FLOW_TAG)");
        Intent write2 = HmlCropDocumentActivity.write.write(this, stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, getIntent().getBooleanExtra("FROM_GALLERY_TAG", false));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, write2).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void IconCompatParcelizer() {
        C5621x983ea256 hmlReviewDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlReviewDocumentActivity.MediaMetadataCompat;
        String stringExtra = getIntent().getStringExtra("APPLICATION_ID_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Co…tants.APPLICATION_ID_TAG)");
        String stringExtra2 = getIntent().getStringExtra("IMAGE_PATH_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(Constants.IMAGE_PATH_TAG)");
        String stringExtra3 = getIntent().getStringExtra("DOCUMENT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "intent.getStringExtra(Constants.DOCUMENT_TYPE_TAG)");
        String stringExtra4 = getIntent().getStringExtra("PRODUCT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra4, "intent.getStringExtra(Constants.PRODUCT_TYPE_TAG)");
        String stringExtra5 = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra5, "intent.getStringExtra(Constants.FLOW_TAG)");
        Intent IconCompatParcelizer = C5621x983ea256.IconCompatParcelizer(this, stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, getIntent().getBooleanExtra("FROM_GALLERY_TAG", false));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void write() {
        String stringExtra = getIntent().getStringExtra("APPLICATION_ID_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Co…tants.APPLICATION_ID_TAG)");
        String stringExtra2 = getIntent().getStringExtra("DOCUMENT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(Constants.DOCUMENT_TYPE_TAG)");
        String stringExtra3 = getIntent().getStringExtra("PRODUCT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "intent.getStringExtra(Constants.PRODUCT_TYPE_TAG)");
        String stringExtra4 = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra4, "intent.getStringExtra(Constants.FLOW_TAG)");
        Intent write = C5634xbe8cfba3.write(this, stringExtra, stringExtra2, stringExtra3, stringExtra4);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, write).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "event");
        this.scbAnalytics.write(str, new ZSYR2K("user_type", AppCompatActivity()), new ZSYR2K("loan_type", "consumer"));
    }
}
