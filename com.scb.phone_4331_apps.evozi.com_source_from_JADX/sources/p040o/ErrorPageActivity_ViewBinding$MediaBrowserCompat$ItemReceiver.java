package p040o;

import android.content.ContentValues;
import android.database.Cursor;
import com.thunderhead.android.infrastructure.server.requests.BaseRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p040o.FragmentBuilder_BindIssuerInputFragment;
import p040o.JuristicResetPinLandingActivity;

/* renamed from: o.ErrorPageActivity_ViewBinding$MediaBrowserCompat$ItemReceiver */
final class ErrorPageActivity_ViewBinding$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<Map<Integer, ? extends ContentValues>> {
    final /* synthetic */ String IconCompatParcelizer;
    private /* synthetic */ Cursor MediaBrowserCompat$ItemReceiver;
    final /* synthetic */ String read;
    final /* synthetic */ ErrorPageActivity_ViewBinding write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ErrorPageActivity_ViewBinding$MediaBrowserCompat$ItemReceiver(ErrorPageActivity_ViewBinding errorPageActivity_ViewBinding, Cursor cursor, String str, String str2) {
        super(0);
        this.write = errorPageActivity_ViewBinding;
        this.MediaBrowserCompat$ItemReceiver = cursor;
        this.IconCompatParcelizer = str;
        this.read = str2;
    }

    public final /* synthetic */ Object invoke() {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor cursor = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) cursor, "$this$toSequence");
        FundActionsSuccessActivity closetutorial_mediabrowsercompat_itemreceiver = new closeTutorial$MediaBrowserCompat$ItemReceiver(cursor);
        onGetStartedClick.write((Object) closetutorial_mediabrowsercompat_itemreceiver, "nextFunction");
        BaseJuristicPinActivity_ViewBinding selectInvestmentActivity = new SelectInvestmentActivity(closetutorial_mediabrowsercompat_itemreceiver, new JuristicResetPinLandingActivity.IconCompatParcelizer(closetutorial_mediabrowsercompat_itemreceiver));
        onGetStartedClick.write((Object) selectInvestmentActivity, "$this$constrainOnce");
        BaseJuristicPinActivity_ViewBinding scbsOnboardingTcActivity = new ScbsOnboardingTcActivity(selectInvestmentActivity);
        FundFactSheetActivity r2 = new FundFactSheetActivity<Cursor, HmlVerifyEmailSuccessfulActivity<? extends Integer, ? extends BaseRequest>>(this) {
            private /* synthetic */ ErrorPageActivity_ViewBinding$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                BaseRequest baseRequest;
                Cursor cursor = (Cursor) obj;
                onGetStartedClick.write((Object) cursor, "it");
                int i = cursor.getInt(cursor.getColumnIndex("_id"));
                FragmentBuilder_BindIssuerInputFragment MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(new ErrorPageActivity_ViewBinding$MediaBrowserCompat$MediaItem(this.IconCompatParcelizer.write, cursor));
                if (MediaBrowserCompat$CustomActionResultReceiver instanceof FragmentBuilder_BindIssuerInputFragment.write) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver((Exception) ((FragmentBuilder_BindIssuerInputFragment.write) MediaBrowserCompat$CustomActionResultReceiver).write);
                    baseRequest = null;
                } else if (MediaBrowserCompat$CustomActionResultReceiver instanceof FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) {
                    baseRequest = (BaseRequest) ((FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$ItemReceiver;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return new HmlVerifyEmailSuccessfulActivity(Integer.valueOf(i), baseRequest);
            }
        };
        onGetStartedClick.write((Object) scbsOnboardingTcActivity, "$this$map");
        onGetStartedClick.write((Object) r2, "transform");
        BaseJuristicPinActivity_ViewBinding juristicSetupNewPinActivity = new JuristicSetupNewPinActivity(scbsOnboardingTcActivity, r2);
        FundFactSheetActivity fundFactSheetActivity = C64702.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) juristicSetupNewPinActivity, "$this$filter");
        onGetStartedClick.write((Object) fundFactSheetActivity, "predicate");
        BaseJuristicPinActivity_ViewBinding setupScheduleActivity = new SetupScheduleActivity(juristicSetupNewPinActivity, true, fundFactSheetActivity);
        final Long valueOf = Long.valueOf(currentTimeMillis);
        FundFactSheetActivity r22 = new FundFactSheetActivity<HmlVerifyEmailSuccessfulActivity<? extends Integer, ? extends BaseRequest>, HmlVerifyEmailSuccessfulActivity<? extends Integer, ? extends ContentValues>>(this) {
            private /* synthetic */ ErrorPageActivity_ViewBinding$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Long l;
                HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity = (HmlVerifyEmailSuccessfulActivity) obj;
                onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity, "<name for destructuring parameter 0>");
                int intValue = ((Number) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver).intValue();
                BaseRequest baseRequest = (BaseRequest) hmlVerifyEmailSuccessfulActivity.write;
                if (baseRequest == null || (l = baseRequest.getTimestamp()) == null) {
                    l = valueOf;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("request_type", "offline_interactions");
                contentValues.put("site_key", this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
                contentValues.put("host_uri", this.MediaBrowserCompat$ItemReceiver.read);
                contentValues.put("timestamp", l);
                return new HmlVerifyEmailSuccessfulActivity(Integer.valueOf(intValue), contentValues);
            }
        };
        onGetStartedClick.write((Object) setupScheduleActivity, "$this$map");
        onGetStartedClick.write((Object) r22, "transform");
        BaseJuristicPinActivity_ViewBinding juristicSetupNewPinActivity2 = new JuristicSetupNewPinActivity(setupScheduleActivity, r22);
        onGetStartedClick.write((Object) juristicSetupNewPinActivity2, "$this$toMap");
        return HmlNdidSelectIdpActivity.read(HmlNdidSelectIdpActivity.write(juristicSetupNewPinActivity2, new LinkedHashMap()));
    }
}
