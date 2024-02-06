package p040o;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encoding;

/* renamed from: o.DividendSummaryAdapter$ChildViewHolder */
public final class DividendSummaryAdapter$ChildViewHolder {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public int MediaDescriptionCompat;
    public String read;
    public String write;

    public DividendSummaryAdapter$ChildViewHolder() {
    }

    private static void MediaBrowserCompat$ItemReceiver(String str, boolean z, C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding, StringBuffer stringBuffer) {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2;
        while (true) {
            String read2 = MoneyActionAdapter$CustomViewHolder.read();
            if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
                Enumeration write2 = ((HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).write();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                String obj = sb.toString();
                stringBuffer.append(str);
                if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InsurersAdapter$InsurersViewHolder_ViewBinding) {
                    stringBuffer.append("BER Sequence");
                } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InvestmentDetailsTransactionAdapter$TransactionHolder) {
                    stringBuffer.append("DER Sequence");
                } else {
                    stringBuffer.append("Sequence");
                }
                stringBuffer.append(read2);
                while (write2.hasMoreElements()) {
                    Object nextElement = write2.nextElement();
                    if (nextElement == null || nextElement.equals(InvestmentDetailsClientListAdapter$NoFundViewHolder.write)) {
                        stringBuffer.append(obj);
                        stringBuffer.append("NULL");
                        stringBuffer.append(read2);
                    } else if (nextElement instanceof C10402xc503e64f) {
                        MediaBrowserCompat$ItemReceiver(obj, z, (C10402xc503e64f) nextElement, stringBuffer);
                    } else {
                        MediaBrowserCompat$ItemReceiver(obj, z, ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) nextElement).MediaBrowserCompat$MediaItem(), stringBuffer);
                    }
                }
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("    ");
                String obj2 = sb2.toString();
                stringBuffer.append(str);
                if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof PolicyCardAdapter$PolicyCardViewHolder) {
                    stringBuffer.append("BER Tagged [");
                } else {
                    stringBuffer.append("Tagged [");
                }
                HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding = (HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
                stringBuffer.append(Integer.toString(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer));
                stringBuffer.append(']');
                if (!hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.read) {
                    stringBuffer.append(" IMPLICIT ");
                }
                stringBuffer.append(read2);
                HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
                if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
                    hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
                } else {
                    hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = null;
                }
                hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2;
                str = obj2;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof C10403xf0c8ae24) {
                Enumeration elements = ((C10403xf0c8ae24) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).IconCompatParcelizer.elements();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append("    ");
                String obj3 = sb3.toString();
                stringBuffer.append(str);
                if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof SimulatorTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
                    stringBuffer.append("BER Set");
                } else {
                    stringBuffer.append("DER Set");
                }
                stringBuffer.append(read2);
                while (elements.hasMoreElements()) {
                    Object nextElement2 = elements.nextElement();
                    if (nextElement2 == null) {
                        stringBuffer.append(obj3);
                        stringBuffer.append("NULL");
                        stringBuffer.append(read2);
                    } else if (nextElement2 instanceof C10402xc503e64f) {
                        MediaBrowserCompat$ItemReceiver(obj3, z, (C10402xc503e64f) nextElement2, stringBuffer);
                    } else {
                        MediaBrowserCompat$ItemReceiver(obj3, z, ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) nextElement2).MediaBrowserCompat$MediaItem(), stringBuffer);
                    }
                }
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof C10905onItemClick) {
                C10905onItemClick onitemclick = (C10905onItemClick) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
                if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlOutcomeCounterAdapter$UpsellOfferViewHolder_ViewBinding) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append("BER Constructed Octet String");
                    sb4.append("[");
                    sb4.append(onitemclick.write().length);
                    sb4.append("] ");
                    stringBuffer.append(sb4.toString());
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str);
                    sb5.append("DER Octet String");
                    sb5.append("[");
                    sb5.append(onitemclick.write().length);
                    sb5.append("] ");
                    stringBuffer.append(sb5.toString());
                }
                if (z) {
                    stringBuffer.append(MediaBrowserCompat$ItemReceiver(str, onitemclick.write()));
                    return;
                } else {
                    stringBuffer.append(read2);
                    return;
                }
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlBusinessInfoAdapter$BankAccountViewHolder) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append("ObjectIdentifier(");
                sb6.append(((HmlBusinessInfoAdapter$BankAccountViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).write);
                sb6.append(")");
                sb6.append(read2);
                stringBuffer.append(sb6.toString());
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append("Boolean(");
                byte[] bArr = ((FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read;
                boolean z2 = false;
                if (bArr[0] != 0) {
                    z2 = true;
                }
                sb7.append(z2);
                sb7.append(")");
                sb7.append(read2);
                stringBuffer.append(sb7.toString());
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append("Integer(");
                sb8.append(new BigInteger(((HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read));
                sb8.append(")");
                sb8.append(read2);
                stringBuffer.append(sb8.toString());
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InvestmentDetailsClientListAdapter$ExpandableChildViewHolder) {
                InvestmentDetailsClientListAdapter$ExpandableChildViewHolder investmentDetailsClientListAdapter$ExpandableChildViewHolder = (InvestmentDetailsClientListAdapter$ExpandableChildViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append("DER Bit String");
                sb9.append("[");
                sb9.append(investmentDetailsClientListAdapter$ExpandableChildViewHolder.read().length);
                sb9.append(", ");
                sb9.append(investmentDetailsClientListAdapter$ExpandableChildViewHolder.write());
                sb9.append("] ");
                stringBuffer.append(sb9.toString());
                if (z) {
                    stringBuffer.append(MediaBrowserCompat$ItemReceiver(str, investmentDetailsClientListAdapter$ExpandableChildViewHolder.read()));
                    return;
                } else {
                    stringBuffer.append(read2);
                    return;
                }
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append("IA5String(");
                sb10.append(((InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).MediaMetadataCompat());
                sb10.append(") ");
                sb10.append(read2);
                stringBuffer.append(sb10.toString());
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof ScbsProductAdapter$ScbsProductViewHolder) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append("UTF8String(");
                sb11.append(((ScbsProductAdapter$ScbsProductViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).MediaMetadataCompat());
                sb11.append(") ");
                sb11.append(read2);
                stringBuffer.append(sb11.toString());
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InvestmentDetailsClientListAdapter$SingleViewHolder) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append("PrintableString(");
                sb12.append(((InvestmentDetailsClientListAdapter$SingleViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).MediaMetadataCompat());
                sb12.append(") ");
                sb12.append(read2);
                stringBuffer.append(sb12.toString());
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof CategoriesAdapter$CategoriesHolder_ViewBinding) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append("VisibleString(");
                sb13.append(((CategoriesAdapter$CategoriesHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).MediaMetadataCompat());
                sb13.append(") ");
                sb13.append(read2);
                stringBuffer.append(sb13.toString());
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof FundClientListAdapter$ItemViewHolder) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append("BMPString(");
                sb14.append(((FundClientListAdapter$ItemViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).MediaMetadataCompat());
                sb14.append(") ");
                sb14.append(read2);
                stringBuffer.append(sb14.toString());
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof BasicAssetAllocationAdapter$BaaHolder) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append("T61String(");
                sb15.append(((BasicAssetAllocationAdapter$BaaHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).MediaMetadataCompat());
                sb15.append(") ");
                sb15.append(read2);
                stringBuffer.append(sb15.toString());
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InvestmentDetailsClientListAdapter$FooterViewHolder_ViewBinding) {
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str);
                sb16.append("GraphicString(");
                sb16.append(((InvestmentDetailsClientListAdapter$FooterViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).MediaMetadataCompat());
                sb16.append(") ");
                sb16.append(read2);
                stringBuffer.append(sb16.toString());
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof CategoriesAdapter$CategoriesHolder) {
                StringBuilder sb17 = new StringBuilder();
                sb17.append(str);
                sb17.append("VideotexString(");
                sb17.append(((CategoriesAdapter$CategoriesHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).MediaMetadataCompat());
                sb17.append(") ");
                sb17.append(read2);
                stringBuffer.append(sb17.toString());
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding) {
                StringBuilder sb18 = new StringBuilder();
                sb18.append(str);
                sb18.append("UTCTime(");
                sb18.append(((HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).write());
                sb18.append(") ");
                sb18.append(read2);
                stringBuffer.append(sb18.toString());
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HelpAdapter$MoreOptionsHolder_ViewBinding) {
                StringBuilder sb19 = new StringBuilder();
                sb19.append(str);
                sb19.append("GeneralizedTime(");
                sb19.append(((HelpAdapter$MoreOptionsHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read());
                sb19.append(") ");
                sb19.append(read2);
                stringBuffer.append(sb19.toString());
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlOutcomeCounterAdapter$CounterOfferViewHolder) {
                stringBuffer.append(read(ASN1Encoding.BER, str, z, hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding, read2));
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InvestmentContextualAdsAdapter$AdViewHolder) {
                stringBuffer.append(read(ASN1Encoding.DER, str, z, hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding, read2));
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlAboutAdapter$HmlAboutViewHolder) {
                StringBuilder sb20 = new StringBuilder();
                sb20.append(str);
                sb20.append("DER Enumerated(");
                sb20.append(new BigInteger(((HmlAboutAdapter$HmlAboutViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read));
                sb20.append(")");
                sb20.append(read2);
                stringBuffer.append(sb20.toString());
                return;
            } else if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InvestmentContextualAdsAdapter$AdViewHolder_ViewBinding) {
                InvestmentContextualAdsAdapter$AdViewHolder_ViewBinding investmentContextualAdsAdapter$AdViewHolder_ViewBinding = (InvestmentContextualAdsAdapter$AdViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
                StringBuilder sb21 = new StringBuilder();
                sb21.append(str);
                sb21.append("External ");
                sb21.append(read2);
                stringBuffer.append(sb21.toString());
                StringBuilder sb22 = new StringBuilder();
                sb22.append(str);
                sb22.append("    ");
                String obj4 = sb22.toString();
                if (investmentContextualAdsAdapter$AdViewHolder_ViewBinding.read != null) {
                    StringBuilder sb23 = new StringBuilder();
                    sb23.append(obj4);
                    sb23.append("Direct Reference: ");
                    sb23.append(investmentContextualAdsAdapter$AdViewHolder_ViewBinding.read.write);
                    sb23.append(read2);
                    stringBuffer.append(sb23.toString());
                }
                if (investmentContextualAdsAdapter$AdViewHolder_ViewBinding.write != null) {
                    StringBuilder sb24 = new StringBuilder();
                    sb24.append(obj4);
                    sb24.append("Indirect Reference: ");
                    sb24.append(investmentContextualAdsAdapter$AdViewHolder_ViewBinding.write.toString());
                    sb24.append(read2);
                    stringBuffer.append(sb24.toString());
                }
                if (investmentContextualAdsAdapter$AdViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    MediaBrowserCompat$ItemReceiver(obj4, z, investmentContextualAdsAdapter$AdViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, stringBuffer);
                }
                StringBuilder sb25 = new StringBuilder();
                sb25.append(obj4);
                sb25.append("Encoding: ");
                sb25.append(investmentContextualAdsAdapter$AdViewHolder_ViewBinding.IconCompatParcelizer);
                sb25.append(read2);
                stringBuffer.append(sb25.toString());
                MediaBrowserCompat$ItemReceiver(obj4, z, investmentContextualAdsAdapter$AdViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver, stringBuffer);
                return;
            } else {
                StringBuilder sb26 = new StringBuilder();
                sb26.append(str);
                sb26.append(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding.toString());
                sb26.append(read2);
                stringBuffer.append(sb26.toString());
                return;
            }
        }
    }

    private static String MediaBrowserCompat$ItemReceiver(String str, byte[] bArr) {
        String read2 = MoneyActionAdapter$CustomViewHolder.read();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String obj = sb.toString();
        stringBuffer.append(read2);
        for (int i = 0; i < bArr.length; i += 32) {
            if (bArr.length - i > 32) {
                stringBuffer.append(obj);
                stringBuffer.append(new String(onSelectType.MediaBrowserCompat$ItemReceiver(bArr, i, 32)));
                stringBuffer.append("    ");
                stringBuffer.append(IconCompatParcelizer(bArr, i, 32));
                stringBuffer.append(read2);
            } else {
                stringBuffer.append(obj);
                stringBuffer.append(new String(onSelectType.MediaBrowserCompat$ItemReceiver(bArr, i, bArr.length - i)));
                for (int length = bArr.length - i; length != 32; length++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append("    ");
                stringBuffer.append(IconCompatParcelizer(bArr, i, bArr.length - i));
                stringBuffer.append(read2);
            }
        }
        return stringBuffer.toString();
    }

    private static String IconCompatParcelizer(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 != i + i2; i3++) {
            if (bArr[i3] >= 32 && bArr[i3] <= 126) {
                stringBuffer.append((char) bArr[i3]);
            }
        }
        return stringBuffer.toString();
    }

    public static String read(Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        if (obj instanceof C10402xc503e64f) {
            MediaBrowserCompat$ItemReceiver("", false, (C10402xc503e64f) obj, stringBuffer);
        } else if (obj instanceof HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
            MediaBrowserCompat$ItemReceiver("", false, ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) obj).MediaBrowserCompat$MediaItem(), stringBuffer);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("unknown object type ");
            sb.append(obj.toString());
            return sb.toString();
        }
        return stringBuffer.toString();
    }

    private static String read(String str, String str2, boolean z, C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding, String str3) {
        if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding == null || (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HelpAdapter$MoreOptionsHolder)) {
            HelpAdapter$MoreOptionsHolder helpAdapter$MoreOptionsHolder = (HelpAdapter$MoreOptionsHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
            StringBuffer stringBuffer = new StringBuffer();
            if (helpAdapter$MoreOptionsHolder.IconCompatParcelizer()) {
                try {
                    HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(helpAdapter$MoreOptionsHolder.MediaBrowserCompat$ItemReceiver());
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    sb.append(" ApplicationSpecific[");
                    sb.append(helpAdapter$MoreOptionsHolder.read());
                    sb.append("]");
                    sb.append(str3);
                    stringBuffer.append(sb.toString());
                    Enumeration write2 = MediaBrowserCompat$CustomActionResultReceiver2.write();
                    while (write2.hasMoreElements()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append("    ");
                        MediaBrowserCompat$ItemReceiver(sb2.toString(), z, (C10402xc503e64f) write2.nextElement(), stringBuffer);
                    }
                } catch (IOException e) {
                    stringBuffer.append(e);
                }
                return stringBuffer.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(str);
            sb3.append(" ApplicationSpecific[");
            sb3.append(helpAdapter$MoreOptionsHolder.read());
            sb3.append("] (");
            sb3.append(new String(onSelectType.write(helpAdapter$MoreOptionsHolder.write())));
            sb3.append(")");
            sb3.append(str3);
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("unknown object in getInstance: ");
        sb4.append(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding.getClass().getName());
        throw new IllegalArgumentException(sb4.toString());
    }

    public DividendSummaryAdapter$ChildViewHolder(int i, String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "accountType");
        onGetStartedClick.write((Object) str2, "name");
        onGetStartedClick.write((Object) str4, "desc");
        onGetStartedClick.write((Object) str5, "imageURL");
        this.MediaDescriptionCompat = i;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.read = str4;
        this.write = str5;
    }
}
