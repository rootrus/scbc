package com.scb.phone.view.fragment.easycash.creditpower;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import java.util.List;
import p040o.CameraSource;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.doQuickAnalysis;
import p040o.getPreviousExpirable;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.easycash.creditpower.EasycashCreditPowerSummaryFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C5922x874d256c extends CheckEligibilityActivity implements FundActionsSuccessActivity<CustomDialog> {
    final /* synthetic */ EasycashCreditPowerSummaryFragment read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5922x874d256c(EasycashCreditPowerSummaryFragment easycashCreditPowerSummaryFragment) {
        super(0);
        this.read = easycashCreditPowerSummaryFragment;
    }

    public final /* synthetic */ Object invoke() {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(this.read.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.return_to_apply_loan_dialog_title).IconCompatParcelizer((int) R.string.return_to_apply_loan_dialog_description);
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.confirm), new DialogInterface.OnClickListener(this) {
            private /* synthetic */ C5922x874d256c MediaBrowserCompat$CustomActionResultReceiver;

            {
                this.MediaBrowserCompat$CustomActionResultReceiver = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                doQuickAnalysis doquickanalysis = this.MediaBrowserCompat$CustomActionResultReceiver.read.presenter;
                if (doquickanalysis == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                String str = doquickanalysis.read;
                if (str == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("ncbAcceptedFlag");
                }
                if (!TextUtils.isEmpty(str)) {
                    if (doquickanalysis.RatingCompat != null) {
                        doquickanalysis.RatingCompat.AlertController$RecycleListView();
                    }
                    CameraSource.PictureCallback pictureCallback = doquickanalysis.MediaBrowserCompat$ItemReceiver;
                    String str2 = doquickanalysis.read;
                    if (str2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("ncbAcceptedFlag");
                    }
                    pictureCallback.MediaBrowserCompat$CustomActionResultReceiver(new Object("2", (String) null, str2, (List<getPreviousExpirable>) null) {
                        @SerializedName("totalLoanAmount")
                        public String IconCompatParcelizer;
                        @SerializedName("status")
                        private final String MediaBrowserCompat$CustomActionResultReceiver;
                        @SerializedName("ncbAcceptedFlag")
                        public final String MediaBrowserCompat$ItemReceiver;
                        @SerializedName("product")
                        public final List<getPreviousExpirable> write;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C32935)) {
                                return false;
                            }
                            C32935 r3 = (C32935) obj;
                            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write);
                        }

                        public final int hashCode() {
                            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
                            int i = 0;
                            int hashCode = str != null ? str.hashCode() : 0;
                            String str2 = this.IconCompatParcelizer;
                            int hashCode2 = str2 != null ? str2.hashCode() : 0;
                            String str3 = this.MediaBrowserCompat$ItemReceiver;
                            int hashCode3 = str3 != null ? str3.hashCode() : 0;
                            List<getPreviousExpirable> list = this.write;
                            if (list != null) {
                                i = list.hashCode();
                            }
                            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
                        }

                        public final String toString() {
                            StringBuilder sb = new StringBuilder();
                            sb.append("CreditPowerLoanRequest(status=");
                            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                            sb.append(", totalLoanAmount=");
                            sb.append(this.IconCompatParcelizer);
                            sb.append(", ncbAcceptedFlag=");
                            sb.append(this.MediaBrowserCompat$ItemReceiver);
                            sb.append(", product=");
                            sb.append(this.write);
                            sb.append(")");
                            return sb.toString();
                        }

                        {
                            onGetStartedClick.write((Object) r2, "status");
                            onGetStartedClick.write((Object) r4, "ncbAcceptedFlag");
                            this.MediaBrowserCompat$CustomActionResultReceiver = r2;
                            this.IconCompatParcelizer = r3;
                            this.MediaBrowserCompat$ItemReceiver = r4;
                            this.write = r5;
                        }
                    });
                    doquickanalysis.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new doQuickAnalysis.read());
                }
            }
        });
        return IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), C59245.write);
    }
}
