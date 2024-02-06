package p040o;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Locale;
import p040o.ScbMapActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindPdfViewerFragment */
public final class FragmentBuilder_BindPdfViewerFragment {
    public final String MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.FragmentBuilder_BindPdfViewerFragment$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<ScbMapActivity_ViewBinding<OnBoardingTutorialActivity, HmlVerifyEmailSuccessfulActivity<? extends Boolean, ? extends Activity>>, HmlVerifyPhoneValidateOtpActivity> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final ScbMapActivity_ViewBinding scbMapActivity_ViewBinding = (ScbMapActivity_ViewBinding) obj;
            onGetStartedClick.write((Object) scbMapActivity_ViewBinding, "$receiver");
            FundFactSheetActivity fundFactSheetActivity = C66354.write;
            onGetStartedClick.write((Object) fundFactSheetActivity, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            scbMapActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = (String) fundFactSheetActivity.invoke(scbMapActivity_ViewBinding);
            ScbMapActivity_ViewBinding.write(scbMapActivity_ViewBinding, new BaseDiscoverDisclaimerActivity<ScbMapActivity_ViewBinding<OnBoardingTutorialActivity, HmlVerifyEmailSuccessfulActivity<? extends Boolean, ? extends Activity>>.write, CaptureDocumentActivity<OnBoardingTutorialActivity>, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity>, Object>((HmlNTBPromptPayNotFoundActivity) null) {
                private ScbMapActivity_ViewBinding.write MediaBrowserCompat$ItemReceiver;
                private CaptureDocumentActivity read;

                public final Object write(Object obj, Object obj2, Object obj3) {
                    ScbMapActivity_ViewBinding.write write = (ScbMapActivity_ViewBinding.write) obj;
                    CaptureDocumentActivity captureDocumentActivity = (CaptureDocumentActivity) obj2;
                    HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity = (HmlNTBPromptPayNotFoundActivity) obj3;
                    onGetStartedClick.write((Object) write, "$this$create");
                    onGetStartedClick.write((Object) captureDocumentActivity, "<name for destructuring parameter 0>");
                    onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "continuation");
                    C66342 r0 = 

                    public static final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver() {
                        onFlashLightClicked[] onflashlightclickedArr = {FragmentBuilder_BindHmlIssuerLandingFragment.AlertController$RecycleListView(), FragmentBuilder_BindHmlIssuerLandingFragment.setForceShowIcon(), FragmentBuilder_BindHmlIssuerLandingFragment.MenuItemWrapperICS$CollapsibleActionViewWrapper(), FragmentBuilder_BindHmlIssuerLandingFragment.ListMenuItemView()};
                        onGetStartedClick.write((Object) onflashlightclickedArr, "elements");
                        onGetStartedClick.write((Object) onflashlightclickedArr, "$this$asList");
                        List asList = Arrays.asList(onflashlightclickedArr);
                        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
                        return asList;
                    }

                    FragmentBuilder_BindPdfViewerFragment() {
                    }

                    public static int write(Context context, float f) {
                        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        try {
                            return (int) (f * displayMetrics.density);
                        } catch (NoSuchFieldError unused) {
                            return (int) TypedValue.applyDimension(1, f, displayMetrics);
                        }
                    }

                    public FragmentBuilder_BindPdfViewerFragment(String str) {
                        int myUid = Process.myUid();
                        int myPid = Process.myPid();
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("UID: [");
                        sb.append(myUid);
                        sb.append("]  PID: [");
                        sb.append(myPid);
                        sb.append("] ");
                        String valueOf = String.valueOf(sb.toString());
                        String valueOf2 = String.valueOf(str);
                        this.MediaBrowserCompat$CustomActionResultReceiver = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                    }

                    public static String read(String str, String str2, Object... objArr) {
                        if (objArr != null && objArr.length > 0) {
                            try {
                                str2 = String.format(Locale.US, str2, objArr);
                            } catch (IllegalFormatException e) {
                                String valueOf = String.valueOf(str2);
                                Log.e("PlayCore", valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e);
                                String join = TextUtils.join(", ", objArr);
                                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                                sb.append(str2);
                                sb.append(" [");
                                sb.append(join);
                                sb.append("]");
                                str2 = sb.toString();
                            }
                        }
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
                        sb2.append(str);
                        sb2.append(" : ");
                        sb2.append(str2);
                        return sb2.toString();
                    }

                    public final int MediaBrowserCompat$ItemReceiver(String str, Object... objArr) {
                        if (Log.isLoggable("PlayCore", 4)) {
                            return Log.i("PlayCore", read(this.MediaBrowserCompat$CustomActionResultReceiver, str, objArr));
                        }
                        return 0;
                    }

                    public final int MediaBrowserCompat$CustomActionResultReceiver(String str, Object... objArr) {
                        if (Log.isLoggable("PlayCore", 3)) {
                            return Log.i("PlayCore", read(this.MediaBrowserCompat$CustomActionResultReceiver, str, objArr));
                        }
                        return 0;
                    }
                }
