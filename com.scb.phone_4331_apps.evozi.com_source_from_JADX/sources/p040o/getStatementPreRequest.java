package p040o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.adapter.profile_management.manage_account_inbound.ManageAccountInboundViewHolder;
import kotlin.TypeCastException;

/* renamed from: o.getStatementPreRequest */
public final class getStatementPreRequest extends setEmptyVisibility<getUiOrientation, RecyclerView.setContentView> {
    public FundFactSheetActivity<? super getUiOrientation, HmlVerifyPhoneValidateOtpActivity> read;
    private final boolean write;

    public getStatementPreRequest(boolean z) {
        super(new C7125xb9aa3dd2());
        this.write = z;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90452131494272, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new ManageAccountInboundViewHolder(inflate);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        onGetStartedClick.write((Object) setcontentview, "holder");
        if (setcontentview instanceof ManageAccountInboundViewHolder) {
            T t = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.get(i);
            if (t != null) {
                getUiOrientation getuiorientation = (getUiOrientation) t;
                ManageAccountInboundViewHolder manageAccountInboundViewHolder = (ManageAccountInboundViewHolder) setcontentview;
                FundFactSheetActivity<? super getUiOrientation, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity = this.read;
                boolean z = this.write;
                onGetStartedClick.write((Object) getuiorientation, "item");
                TextView textView = manageAccountInboundViewHolder.tvAccountNo;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAccountNo");
                }
                textView.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(getuiorientation.write, z));
                TextView textView2 = manageAccountInboundViewHolder.tvAccountType;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAccountType");
                }
                textView2.setText(getuiorientation.read);
                TextView textView3 = manageAccountInboundViewHolder.tvNickName;
                if (textView3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNickName");
                }
                textView3.setText(getuiorientation.MediaBrowserCompat$CustomActionResultReceiver);
                CheckBox checkBox = manageAccountInboundViewHolder.toggleView;
                if (checkBox == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("toggleView");
                }
                checkBox.setChecked(getuiorientation.MediaBrowserCompat$ItemReceiver);
                CheckBox checkBox2 = manageAccountInboundViewHolder.toggleView;
                if (checkBox2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("toggleView");
                }
                checkBox2.setOnClickListener(new ManageAccountInboundViewHolder.read(fundFactSheetActivity, getuiorientation));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.profile_management.manageaccountinbound.AccountInboundDisplay");
        }
    }
}
