package p040o;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: o.CreditCardDetailsAdapter$ItemViewHolder_ViewBinding */
public final class CreditCardDetailsAdapter$ItemViewHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder {
    public Hashtable MediaBrowserCompat$ItemReceiver = new Hashtable();
    public Vector read = new Vector();

    CreditCardDetailsAdapter$ItemViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        Enumeration write = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write();
        while (write.hasMoreElements()) {
            SelectableChoiceAdapter$ChoiceHolder_ViewBinding MediaBrowserCompat$ItemReceiver2 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(write.nextElement());
            this.MediaBrowserCompat$ItemReceiver.put(MediaBrowserCompat$ItemReceiver2.AlertController$RecycleListView, MediaBrowserCompat$ItemReceiver2);
            this.read.addElement(MediaBrowserCompat$ItemReceiver2.AlertController$RecycleListView);
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        Enumeration elements = this.read.elements();
        while (elements.hasMoreElements()) {
            Hashtable hashtable = this.MediaBrowserCompat$ItemReceiver;
            companyItemViewHolder_ViewBinding.write.addElement((SelectableChoiceAdapter$ChoiceHolder_ViewBinding) hashtable.get((HmlBusinessInfoAdapter$BankAccountViewHolder) elements.nextElement()));
        }
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }
}
