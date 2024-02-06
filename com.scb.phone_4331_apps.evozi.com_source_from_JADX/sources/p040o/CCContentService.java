package p040o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.adapter.hml.CompanyItemViewHolder;
import java.util.List;
import kotlin.TypeCastException;

/* renamed from: o.CCContentService */
public final class CCContentService extends RecyclerView.IconCompatParcelizer<changeCardBlockStatus> {
    public List<? extends listSessionPartFilesFor> MediaBrowserCompat$ItemReceiver = HmlNationalIdActivity.IconCompatParcelizer;
    private final FundFactSheetActivity<firebaseCrashExists, HmlVerifyPhoneValidateOtpActivity> read;
    private final FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> write;

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        changeCardBlockStatus changecardblockstatus;
        onGetStartedClick.write((Object) viewGroup, "parent");
        if (i == getCurrentSessionId.ITEM.viewType) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83482131493574, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…ccupation, parent, false)");
            changecardblockstatus = new CompanyItemViewHolder(inflate, this.read, this.write);
        } else if (i == getCurrentSessionId.HEADER.viewType) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f81392131493365, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate2, "LayoutInflater.from(pare…ny_header, parent, false)");
            changecardblockstatus = new CardManagementService(inflate2);
        } else if (i == getCurrentSessionId.FOOTER.viewType) {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f81382131493364, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate3, "LayoutInflater.from(pare…ny_footer, parent, false)");
            changecardblockstatus = new CardManagementService(inflate3);
        } else {
            View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f92032131494430, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate4, "LayoutInflater.from(pare…ding_item, parent, false)");
            changecardblockstatus = new CardManagementService(inflate4);
        }
        return changecardblockstatus;
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        changeCardBlockStatus changecardblockstatus = (changeCardBlockStatus) setcontentview;
        onGetStartedClick.write((Object) changecardblockstatus, "holder");
        listSessionPartFilesFor listsessionpartfilesfor = (listSessionPartFilesFor) this.MediaBrowserCompat$ItemReceiver.get(i);
        if (changecardblockstatus instanceof CompanyItemViewHolder) {
            CompanyItemViewHolder companyItemViewHolder = (CompanyItemViewHolder) changecardblockstatus;
            if (listsessionpartfilesfor != null) {
                firebaseCrashExists firebasecrashexists = (firebaseCrashExists) listsessionpartfilesfor;
                onGetStartedClick.write((Object) firebasecrashexists, "display");
                companyItemViewHolder.write.setOnClickListener(new CompanyItemViewHolder.write(companyItemViewHolder, firebasecrashexists));
                if (firebasecrashexists.MediaBrowserCompat$ItemReceiver) {
                    firebasecrashexists.MediaBrowserCompat$ItemReceiver = false;
                    companyItemViewHolder.AlertController$RecycleListView.invoke();
                }
                TextView textView = companyItemViewHolder.tvName;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvName");
                }
                textView.setText(firebasecrashexists.write);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.hml.CompanyItemDisplay");
        }
    }

    public CCContentService(FundFactSheetActivity<? super firebaseCrashExists, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "onCompanyClicked");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "onTriggerReached");
        this.read = fundFactSheetActivity;
        this.write = fundActionsSuccessActivity;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return ((listSessionPartFilesFor) this.MediaBrowserCompat$ItemReceiver.get(i)).MediaBrowserCompat$ItemReceiver();
    }
}
