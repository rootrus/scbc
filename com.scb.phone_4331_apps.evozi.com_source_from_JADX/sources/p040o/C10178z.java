package p040o;

import android.widget.RadioGroup;
import com.scb.phone.R;
import com.scb.phone.view.activity.easycash.EasycashCollateralInformationActivity;
import com.scb.phone.view.activity.easycash.EasycashCreditPowerInputActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import okhttp3.internal.cache.DiskLruCache;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.z */
public final /* synthetic */ class C10178z implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ double read;

    public /* synthetic */ C10178z(double d) {
        this.read = d;
    }

    public final void IconCompatParcelizer(Object obj) {
        getImageOriginalDateTime.write(this.read, (CheckExtractActivity_MembersInjector.setVisibility) obj);
    }

    /* renamed from: o.z$a */
    public final /* synthetic */ class C7545a implements RadioGroup.OnCheckedChangeListener {
        private final /* synthetic */ EasycashCollateralInformationActivity read;

        /* renamed from: o.z$a$a */
        public final /* synthetic */ class C7546a implements AmountEditText.IconCompatParcelizer {
            private final /* synthetic */ EasycashCreditPowerInputActivity IconCompatParcelizer;

            public /* synthetic */ C7546a(EasycashCreditPowerInputActivity easycashCreditPowerInputActivity) {
                this.IconCompatParcelizer = easycashCreditPowerInputActivity;
            }

            public final void IconCompatParcelizer() {
                this.IconCompatParcelizer.mo14318x50fd9e4a();
            }
        }

        public /* synthetic */ C7545a(EasycashCollateralInformationActivity easycashCollateralInformationActivity) {
            this.read = easycashCollateralInformationActivity;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            EasycashCollateralInformationActivity easycashCollateralInformationActivity = this.read;
            switch (i) {
                case R.id.rdb_family:
                    easycashCollateralInformationActivity.presenter.read(DiskLruCache.VERSION_1);
                    return;
                case R.id.rdb_fire_insurance_no:
                    easycashCollateralInformationActivity.presenter.MediaBrowserCompat$CustomActionResultReceiver("N");
                    return;
                case R.id.rdb_fire_insurance_yes:
                    easycashCollateralInformationActivity.presenter.MediaBrowserCompat$CustomActionResultReceiver("Y");
                    return;
                case R.id.rdb_life_insurance_no:
                    easycashCollateralInformationActivity.presenter.write("N");
                    return;
                case R.id.rdb_life_insurance_yes:
                    easycashCollateralInformationActivity.presenter.write("Y");
                    return;
                case R.id.rdb_myself:
                    easycashCollateralInformationActivity.presenter.read("0");
                    return;
                case R.id.rdb_residential_status_no:
                    easycashCollateralInformationActivity.presenter.MediaBrowserCompat$ItemReceiver("N");
                    return;
                case R.id.rdb_residential_status_yes:
                    easycashCollateralInformationActivity.presenter.MediaBrowserCompat$ItemReceiver("Y");
                    return;
                default:
                    return;
            }
        }
    }
}
