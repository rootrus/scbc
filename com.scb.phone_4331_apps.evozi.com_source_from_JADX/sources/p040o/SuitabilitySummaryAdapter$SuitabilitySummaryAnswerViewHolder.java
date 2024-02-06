package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encoding;

/* renamed from: o.SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder */
public class SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder extends HmlBanksGridAdapter$HmlBankViewHolder {
    private static HmlBusinessInfoAdapter$BankAccountViewHolder ActionMenuItemView = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.8");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder AlertController$RecycleListView = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.7");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder AppCompatActivity = new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.9.2");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder AppCompatDelegateImpl$ListMenuDecorView = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.10");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder AppCompatDialogFragment = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.16");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder AppCompatViewInflater = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.65");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder ExpandedMenuView = new HmlBusinessInfoAdapter$BankAccountViewHolder("0.9.2342.19200300.100.1.1");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder IconCompatParcelizer = new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.9.5");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder Keep = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.43");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder ListMenuItemView = RecommendRecyclerAdapter$RecommendViewHolder.Keep;
    private static HmlBusinessInfoAdapter$BankAccountViewHolder MediaBrowserCompat$CustomActionResultReceiver = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.6");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder MediaBrowserCompat$ItemReceiver = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.15");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder MediaBrowserCompat$MediaItem = new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.9.1");
    private static Hashtable MediaBrowserCompat$SearchResultReceiver = new Hashtable();

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static HmlBusinessInfoAdapter$BankAccountViewHolder f5823x50fd9e4a = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.44");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder MediaDescriptionCompat = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.46");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder MediaMetadataCompat = new HmlBusinessInfoAdapter$BankAccountViewHolder("0.9.2342.19200300.100.1.25");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder MediaSessionCompat$QueueItem = RecommendRecyclerAdapter$RecommendViewHolder.PlaybackStateCompat;
    private static final Boolean MediaSessionCompat$ResultReceiverWrapper = Boolean.FALSE;
    private static HmlBusinessInfoAdapter$BankAccountViewHolder MediaSessionCompat$Token = new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.9.3");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder ParcelableVolumeInfo = MediaSessionCompat$QueueItem;
    private static HmlBusinessInfoAdapter$BankAccountViewHolder PlaybackStateCompat = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.42");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder PlaybackStateCompat$CustomAction = C10430x204d6df4.MediaBrowserCompat$ItemReceiver;
    private static Hashtable RatingCompat = new Hashtable();
    private static HmlBusinessInfoAdapter$BankAccountViewHolder read = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.3");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder setBackgroundResource = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.17");
    private static Hashtable setCheckable = new Hashtable();
    private static Hashtable setChecked = new Hashtable();
    private static HmlBusinessInfoAdapter$BankAccountViewHolder setContentView = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.11");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder setExpandedFormat = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.5");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder setGroupDividerEnabled = RecommendRecyclerAdapter$RecommendViewHolder.setContentView;
    private static HmlBusinessInfoAdapter$BankAccountViewHolder setHasDecor = new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.36.8.3.14");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder setIcon = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.4");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder setItemInvoker = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.12");
    private static final Boolean setPadding = Boolean.TRUE;
    private static HmlBusinessInfoAdapter$BankAccountViewHolder setPopupCallback = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.9");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder setShortcut = C10430x204d6df4.IconCompatParcelizer;
    private static HmlBusinessInfoAdapter$BankAccountViewHolder setTitle = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.45");
    private static HmlBusinessInfoAdapter$BankAccountViewHolder write = new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.9.4");
    private boolean AbsActionBarView;
    private Vector MenuItemImpl = new Vector();
    private int MenuItemWrapperICS$CollapsibleActionViewWrapper;
    private HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder setContentHeight;
    private Vector setForceShowIcon = new Vector();
    private Vector setVisibility = new Vector();

    static {
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.4.54");
        MediaBrowserCompat$SearchResultReceiver.put(MediaBrowserCompat$CustomActionResultReceiver, "C");
        MediaBrowserCompat$SearchResultReceiver.put(AppCompatDelegateImpl$ListMenuDecorView, "O");
        MediaBrowserCompat$SearchResultReceiver.put(setItemInvoker, "T");
        MediaBrowserCompat$SearchResultReceiver.put(setContentView, "OU");
        MediaBrowserCompat$SearchResultReceiver.put(read, "CN");
        MediaBrowserCompat$SearchResultReceiver.put(AlertController$RecycleListView, "L");
        MediaBrowserCompat$SearchResultReceiver.put(ActionMenuItemView, "ST");
        MediaBrowserCompat$SearchResultReceiver.put(setExpandedFormat, "SERIALNUMBER");
        MediaBrowserCompat$SearchResultReceiver.put(MediaSessionCompat$QueueItem, "E");
        MediaBrowserCompat$SearchResultReceiver.put(MediaMetadataCompat, "DC");
        MediaBrowserCompat$SearchResultReceiver.put(ExpandedMenuView, "UID");
        MediaBrowserCompat$SearchResultReceiver.put(setPopupCallback, "STREET");
        MediaBrowserCompat$SearchResultReceiver.put(setIcon, "SURNAME");
        MediaBrowserCompat$SearchResultReceiver.put(PlaybackStateCompat, "GIVENNAME");
        MediaBrowserCompat$SearchResultReceiver.put(Keep, "INITIALS");
        MediaBrowserCompat$SearchResultReceiver.put(f5823x50fd9e4a, "GENERATION");
        MediaBrowserCompat$SearchResultReceiver.put(ListMenuItemView, "unstructuredAddress");
        MediaBrowserCompat$SearchResultReceiver.put(setGroupDividerEnabled, "unstructuredName");
        MediaBrowserCompat$SearchResultReceiver.put(setTitle, "UniqueIdentifier");
        MediaBrowserCompat$SearchResultReceiver.put(MediaDescriptionCompat, "DN");
        MediaBrowserCompat$SearchResultReceiver.put(AppCompatViewInflater, "Pseudonym");
        MediaBrowserCompat$SearchResultReceiver.put(AppCompatDialogFragment, "PostalAddress");
        MediaBrowserCompat$SearchResultReceiver.put(setHasDecor, "NameAtBirth");
        MediaBrowserCompat$SearchResultReceiver.put(write, "CountryOfCitizenship");
        MediaBrowserCompat$SearchResultReceiver.put(IconCompatParcelizer, "CountryOfResidence");
        MediaBrowserCompat$SearchResultReceiver.put(MediaSessionCompat$Token, "Gender");
        MediaBrowserCompat$SearchResultReceiver.put(AppCompatActivity, "PlaceOfBirth");
        MediaBrowserCompat$SearchResultReceiver.put(MediaBrowserCompat$MediaItem, "DateOfBirth");
        MediaBrowserCompat$SearchResultReceiver.put(setBackgroundResource, "PostalCode");
        MediaBrowserCompat$SearchResultReceiver.put(MediaBrowserCompat$ItemReceiver, "BusinessCategory");
        MediaBrowserCompat$SearchResultReceiver.put(setShortcut, "TelephoneNumber");
        MediaBrowserCompat$SearchResultReceiver.put(PlaybackStateCompat$CustomAction, KtaJsonExactionHelper.NAME);
        setChecked.put(MediaBrowserCompat$CustomActionResultReceiver, "C");
        setChecked.put(AppCompatDelegateImpl$ListMenuDecorView, "O");
        setChecked.put(setContentView, "OU");
        setChecked.put(read, "CN");
        setChecked.put(AlertController$RecycleListView, "L");
        setChecked.put(ActionMenuItemView, "ST");
        setChecked.put(setPopupCallback, "STREET");
        setChecked.put(MediaMetadataCompat, "DC");
        setChecked.put(ExpandedMenuView, "UID");
        setCheckable.put(MediaBrowserCompat$CustomActionResultReceiver, "C");
        setCheckable.put(AppCompatDelegateImpl$ListMenuDecorView, "O");
        setCheckable.put(setContentView, "OU");
        setCheckable.put(read, "CN");
        setCheckable.put(AlertController$RecycleListView, "L");
        setCheckable.put(ActionMenuItemView, "ST");
        setCheckable.put(setPopupCallback, "STREET");
        RatingCompat.put("c", MediaBrowserCompat$CustomActionResultReceiver);
        RatingCompat.put("o", AppCompatDelegateImpl$ListMenuDecorView);
        RatingCompat.put("t", setItemInvoker);
        RatingCompat.put("ou", setContentView);
        RatingCompat.put("cn", read);
        RatingCompat.put("l", AlertController$RecycleListView);
        RatingCompat.put("st", ActionMenuItemView);
        RatingCompat.put("sn", setExpandedFormat);
        RatingCompat.put("serialnumber", setExpandedFormat);
        RatingCompat.put("street", setPopupCallback);
        RatingCompat.put("emailaddress", ParcelableVolumeInfo);
        RatingCompat.put("dc", MediaMetadataCompat);
        RatingCompat.put("e", ParcelableVolumeInfo);
        RatingCompat.put("uid", ExpandedMenuView);
        RatingCompat.put("surname", setIcon);
        RatingCompat.put("givenname", PlaybackStateCompat);
        RatingCompat.put("initials", Keep);
        RatingCompat.put("generation", f5823x50fd9e4a);
        RatingCompat.put("unstructuredaddress", ListMenuItemView);
        RatingCompat.put("unstructuredname", setGroupDividerEnabled);
        RatingCompat.put("uniqueidentifier", setTitle);
        RatingCompat.put("dn", MediaDescriptionCompat);
        RatingCompat.put("pseudonym", AppCompatViewInflater);
        RatingCompat.put("postaladdress", AppCompatDialogFragment);
        RatingCompat.put("nameofbirth", setHasDecor);
        RatingCompat.put("countryofcitizenship", write);
        RatingCompat.put("countryofresidence", IconCompatParcelizer);
        RatingCompat.put("gender", MediaSessionCompat$Token);
        RatingCompat.put("placeofbirth", AppCompatActivity);
        RatingCompat.put("dateofbirth", MediaBrowserCompat$MediaItem);
        RatingCompat.put("postalcode", setBackgroundResource);
        RatingCompat.put("businesscategory", MediaBrowserCompat$ItemReceiver);
        RatingCompat.put("telephonenumber", setShortcut);
        RatingCompat.put("name", PlaybackStateCompat$CustomAction);
    }

    public static SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder read(Object obj) {
        if (obj == null || (obj instanceof SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder)) {
            return (SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder) obj;
        }
        if (obj instanceof DividendSummaryAdapter$ParentViewHolder_ViewBinding) {
            return new SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(((DividendSummaryAdapter$ParentViewHolder_ViewBinding) obj).MediaBrowserCompat$MediaItem()));
        }
        if (obj != null) {
            return new SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(obj));
        }
        return null;
    }

    protected SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder() {
    }

    public SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        this.setContentHeight = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder;
        Enumeration write2 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write();
        while (write2.hasMoreElements()) {
            C10403xf0c8ae24 write3 = C10403xf0c8ae24.write((Object) ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write2.nextElement()).MediaBrowserCompat$MediaItem());
            int i = 0;
            while (true) {
                if (i < write3.IconCompatParcelizer.size()) {
                    HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write3.IconCompatParcelizer.elementAt(i)).MediaBrowserCompat$MediaItem());
                    if (MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver() == 2) {
                        this.setVisibility.addElement(HmlBusinessInfoAdapter$BankAccountViewHolder.write((Object) MediaBrowserCompat$CustomActionResultReceiver2.read(0)));
                        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read2 = MediaBrowserCompat$CustomActionResultReceiver2.read(1);
                        if (!(read2 instanceof HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding) || (read2 instanceof DiscoverFundFilterAdapter$CheckListHolder_ViewBinding)) {
                            try {
                                Vector vector = this.MenuItemImpl;
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(MediaBrowserCompat$CustomActionResultReceiver(onSelectType.write(read2.MediaBrowserCompat$MediaItem().write(ASN1Encoding.DER))));
                                vector.addElement(sb.toString());
                            } catch (IOException unused) {
                                throw new IllegalArgumentException("cannot encode value");
                            }
                        } else {
                            String MediaMetadataCompat2 = ((HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding) read2).MediaMetadataCompat();
                            if (MediaMetadataCompat2.length() <= 0 || MediaMetadataCompat2.charAt(0) != '#') {
                                this.MenuItemImpl.addElement(MediaMetadataCompat2);
                            } else {
                                Vector vector2 = this.MenuItemImpl;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("\\");
                                sb2.append(MediaMetadataCompat2);
                                vector2.addElement(sb2.toString());
                            }
                        }
                        this.setForceShowIcon.addElement(i != 0 ? setPadding : MediaSessionCompat$ResultReceiverWrapper);
                        i++;
                    } else {
                        throw new IllegalArgumentException("badly sized pair");
                    }
                }
            }
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        if (this.setContentHeight == null) {
            CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
            CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding2 = new CompanyItemViewHolder_ViewBinding();
            int i = 0;
            C10428x84e7262e suitabilityAssessmentAdapter$SuitabilitySectionViewHolder_ViewBinding = null;
            Object obj = suitabilityAssessmentAdapter$SuitabilitySectionViewHolder_ViewBinding;
            while (i != this.setVisibility.size()) {
                CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding3 = new CompanyItemViewHolder_ViewBinding();
                Object obj2 = (HmlBusinessInfoAdapter$BankAccountViewHolder) this.setVisibility.elementAt(i);
                companyItemViewHolder_ViewBinding3.write.addElement(obj2);
                this.MenuItemImpl.elementAt(i);
                companyItemViewHolder_ViewBinding3.write.addElement(suitabilityAssessmentAdapter$SuitabilitySectionViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver());
                if (obj == null || ((Boolean) this.setForceShowIcon.elementAt(i)).booleanValue()) {
                    companyItemViewHolder_ViewBinding2.write.addElement(new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding3));
                } else {
                    companyItemViewHolder_ViewBinding.write.addElement(new BasicAssetAllocationAdapter$BaaHolder_ViewBinding(companyItemViewHolder_ViewBinding2));
                    companyItemViewHolder_ViewBinding2 = new CompanyItemViewHolder_ViewBinding();
                    companyItemViewHolder_ViewBinding2.write.addElement(new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding3));
                }
                i++;
                obj = obj2;
            }
            companyItemViewHolder_ViewBinding.write.addElement(new BasicAssetAllocationAdapter$BaaHolder_ViewBinding(companyItemViewHolder_ViewBinding2));
            this.setContentHeight = new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
        }
        return this.setContentHeight;
    }

    public int hashCode() {
        if (this.AbsActionBarView) {
            return this.MenuItemWrapperICS$CollapsibleActionViewWrapper;
        }
        this.AbsActionBarView = true;
        for (int i = 0; i != this.setVisibility.size(); i++) {
            String IconCompatParcelizer2 = IconCompatParcelizer(MediaBrowserCompat$ItemReceiver((String) this.MenuItemImpl.elementAt(i)));
            int hashCode = this.MenuItemWrapperICS$CollapsibleActionViewWrapper ^ this.setVisibility.elementAt(i).hashCode();
            this.MenuItemWrapperICS$CollapsibleActionViewWrapper = hashCode;
            this.MenuItemWrapperICS$CollapsibleActionViewWrapper = IconCompatParcelizer2.hashCode() ^ hashCode;
        }
        return this.MenuItemWrapperICS$CollapsibleActionViewWrapper;
    }

    public boolean equals(Object obj) {
        int i;
        int i2;
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder) && !(obj instanceof HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder)) {
            return false;
        }
        if (MediaBrowserCompat$MediaItem().equals(((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) obj).MediaBrowserCompat$MediaItem())) {
            return true;
        }
        try {
            SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder read2 = read(obj);
            int size = this.setVisibility.size();
            if (size != read2.setVisibility.size()) {
                return false;
            }
            boolean[] zArr = new boolean[size];
            int i3 = -1;
            if (this.setVisibility.elementAt(0).equals(read2.setVisibility.elementAt(0))) {
                i = 1;
                i3 = size;
                i2 = 0;
            } else {
                i2 = size - 1;
                i = -1;
            }
            while (i2 != i3) {
                HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) this.setVisibility.elementAt(i2);
                String str = (String) this.MenuItemImpl.elementAt(i2);
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        z = false;
                        break;
                    }
                    if (!zArr[i4] && hmlBusinessInfoAdapter$BankAccountViewHolder.equals((HmlBusinessInfoAdapter$BankAccountViewHolder) read2.setVisibility.elementAt(i4))) {
                        String MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(str);
                        String MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver((String) read2.MenuItemImpl.elementAt(i4));
                        if (MediaBrowserCompat$ItemReceiver2.equals(MediaBrowserCompat$ItemReceiver3) || IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2).equals(IconCompatParcelizer(MediaBrowserCompat$ItemReceiver3))) {
                            zArr[i4] = true;
                            z = true;
                            break;
                        }
                    }
                    i4++;
                }
                if (!z) {
                    return false;
                }
                i2 += i;
            }
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private static String MediaBrowserCompat$ItemReceiver(String str) {
        String write2 = MoneyActionAdapter$CustomViewHolder.write(str.trim());
        if (write2.length() <= 0 || write2.charAt(0) != '#') {
            return write2;
        }
        C10402xc503e64f MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(write2);
        return MediaBrowserCompat$CustomActionResultReceiver2 instanceof HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding ? MoneyActionAdapter$CustomViewHolder.write(((HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding) MediaBrowserCompat$CustomActionResultReceiver2).MediaMetadataCompat().trim()) : write2;
    }

    private static C10402xc503e64f MediaBrowserCompat$CustomActionResultReceiver(String str) {
        try {
            return C10402xc503e64f.read(onSelectType.MediaBrowserCompat$CustomActionResultReceiver(str.substring(1)));
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("unknown encoding in name: ");
            sb.append(e);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static String IconCompatParcelizer(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i = 1;
            while (i < str.length()) {
                char charAt2 = str.charAt(i);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(StringBuffer stringBuffer, Hashtable hashtable, HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder, String str) {
        int i;
        String str2 = (String) hashtable.get(hmlBusinessInfoAdapter$BankAccountViewHolder);
        if (str2 != null) {
            stringBuffer.append(str2);
        } else {
            stringBuffer.append(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
        }
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (i < length2 && stringBuffer.charAt(i) == ' ') {
            stringBuffer.insert(i, "\\");
            length = i + 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 > i && stringBuffer.charAt(length2) == ' ') {
                stringBuffer.insert(length2, '\\');
            }
        }
        while (i <= length2) {
            char charAt = stringBuffer.charAt(i);
            if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        continue;
                }
            }
            stringBuffer.insert(i, "\\");
            i += 2;
            length2++;
        }
    }

    private static String MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public String toString() {
        Hashtable hashtable = MediaBrowserCompat$SearchResultReceiver;
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        for (int i = 0; i < this.setVisibility.size(); i++) {
            if (((Boolean) this.setForceShowIcon.elementAt(i)).booleanValue()) {
                stringBuffer2.append('+');
                MediaBrowserCompat$CustomActionResultReceiver(stringBuffer2, hashtable, (HmlBusinessInfoAdapter$BankAccountViewHolder) this.setVisibility.elementAt(i), (String) this.MenuItemImpl.elementAt(i));
            } else {
                stringBuffer2 = new StringBuffer();
                MediaBrowserCompat$CustomActionResultReceiver(stringBuffer2, hashtable, (HmlBusinessInfoAdapter$BankAccountViewHolder) this.setVisibility.elementAt(i), (String) this.MenuItemImpl.elementAt(i));
                vector.addElement(stringBuffer2);
            }
        }
        boolean z = true;
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            stringBuffer.append(vector.elementAt(i2).toString());
        }
        return stringBuffer.toString();
    }
}
