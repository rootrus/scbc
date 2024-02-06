package p040o;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.custom.mailingaddress.MailingAddressAccountDetailsCustomItem;
import com.scb.phone.view.custom.mailingaddress.MailingAddressAccountHeaderCustomItem;
import com.scb.phone.view.custom.mailingaddress.MailingAddressAccountSelectorCustomItem;
import com.scb.phone.view.custom.mailingaddress.MailingAddressErrorCustomItem;
import com.scb.phone.view.custom.mailingaddress.MailingAddressSelectAccountItem;
import java.util.ArrayList;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.getBusinessOwnerLoanOfferStatus */
public final class getBusinessOwnerLoanOfferStatus extends getRecommendedBiller<IconCompatParcelizer> {
    public C7108xec65684e write;

    public getBusinessOwnerLoanOfferStatus() {
        this((byte) 0);
    }

    public /* synthetic */ getBusinessOwnerLoanOfferStatus(byte b) {
        this((List<? extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder>) new ArrayList());
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        MailingAddressSelectAccountItem mailingAddressSelectAccountItem;
        onGetStartedClick.write((Object) viewGroup, "parent");
        if (i == 1) {
            Context context = viewGroup.getContext();
            onGetStartedClick.IconCompatParcelizer((Object) context, "parent.context");
            mailingAddressSelectAccountItem = new MailingAddressAccountHeaderCustomItem(context);
        } else if (i == 3) {
            Context context2 = viewGroup.getContext();
            onGetStartedClick.IconCompatParcelizer((Object) context2, "parent.context");
            MailingAddressAccountSelectorCustomItem mailingAddressAccountSelectorCustomItem = new MailingAddressAccountSelectorCustomItem(context2);
            mailingAddressAccountSelectorCustomItem.setListener(this.write);
            mailingAddressSelectAccountItem = mailingAddressAccountSelectorCustomItem;
        } else if (i != 7) {
            Context context3 = viewGroup.getContext();
            onGetStartedClick.IconCompatParcelizer((Object) context3, "parent.context");
            MailingAddressAccountDetailsCustomItem mailingAddressAccountDetailsCustomItem = new MailingAddressAccountDetailsCustomItem(context3);
            mailingAddressAccountDetailsCustomItem.setListener(this.write);
            mailingAddressSelectAccountItem = mailingAddressAccountDetailsCustomItem;
        } else {
            Context context4 = viewGroup.getContext();
            onGetStartedClick.IconCompatParcelizer((Object) context4, "parent.context");
            MailingAddressErrorCustomItem mailingAddressErrorCustomItem = new MailingAddressErrorCustomItem(context4);
            mailingAddressErrorCustomItem.setListener(this.write);
            mailingAddressSelectAccountItem = mailingAddressErrorCustomItem;
        }
        return new IconCompatParcelizer(mailingAddressSelectAccountItem);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) setcontentview;
        onGetStartedClick.write((Object) iconCompatParcelizer, "holder");
        AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder = this.read.get(i);
        onGetStartedClick.IconCompatParcelizer((Object) builder, "display.get(position)");
        AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder2 = builder;
        onGetStartedClick.write((Object) builder2, "display");
        iconCompatParcelizer.AlertController$RecycleListView.setDisplay(builder2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private getBusinessOwnerLoanOfferStatus(List<? extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list) {
        super(list);
        onGetStartedClick.write((Object) list, "displayList");
    }

    public final void MediaBrowserCompat$ItemReceiver(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        onGetStartedClick.write((Object) builder, "item");
        int indexOf = this.read.indexOf(builder);
        if (indexOf >= 0 && indexOf < this.read.size()) {
            this.read.set(indexOf, builder);
        }
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(indexOf, 1);
    }

    /* renamed from: o.getBusinessOwnerLoanOfferStatus$IconCompatParcelizer */
    public final class IconCompatParcelizer extends RecyclerView.setContentView {
        MailingAddressSelectAccountItem AlertController$RecycleListView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(MailingAddressSelectAccountItem mailingAddressSelectAccountItem) {
            super(mailingAddressSelectAccountItem);
            onGetStartedClick.write((Object) mailingAddressSelectAccountItem, "item");
            this.AlertController$RecycleListView = mailingAddressSelectAccountItem;
        }
    }
}
