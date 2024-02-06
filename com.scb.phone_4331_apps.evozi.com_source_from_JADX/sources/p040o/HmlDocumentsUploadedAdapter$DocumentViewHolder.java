package p040o;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1Exception;

/* renamed from: o.HmlDocumentsUploadedAdapter$DocumentViewHolder */
public final class HmlDocumentsUploadedAdapter$DocumentViewHolder {
    private final int IconCompatParcelizer;
    private final InputStream MediaBrowserCompat$CustomActionResultReceiver;
    private final byte[][] write;

    public HmlDocumentsUploadedAdapter$DocumentViewHolder(InputStream inputStream) {
        this(inputStream, DiscoverTopListItemRecyclerAdapter$FundViewHolder.MediaBrowserCompat$ItemReceiver(inputStream));
    }

    public HmlDocumentsUploadedAdapter$DocumentViewHolder(InputStream inputStream, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = inputStream;
        this.IconCompatParcelizer = i;
        this.write = new byte[11][];
    }

    /* access modifiers changed from: package-private */
    public final C10402xc503e64f write(boolean z, int i) throws IOException {
        if (!z) {
            return new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, i, new C10407x3ea8e030(((DiscoverFundFilterAdapter$SelectListHolder_ViewBinding) this.MediaBrowserCompat$CustomActionResultReceiver).write()));
        }
        CompanyItemViewHolder_ViewBinding write2 = write();
        if (this.MediaBrowserCompat$CustomActionResultReceiver instanceof DiscoverFundFilterListAdapter$SubTitleHolder_ViewBinding) {
            if (write2.write.size() == 1) {
                return new PolicyCardAdapter$PolicyCardViewHolder(true, i, (HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write2.write.elementAt(0));
            }
            return new PolicyCardAdapter$PolicyCardViewHolder(false, i, SimulatorTutorialViewPagerAdapter$TutorialItemHolder.write(write2));
        } else if (write2.write.size() == 1) {
            return new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(true, i, (HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write2.write.elementAt(0));
        } else {
            return new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, i, C10406xd7645b0d.read(write2));
        }
    }

    public final HmlAboutAdapter$HmlAboutViewHolder_ViewBinding IconCompatParcelizer() throws IOException {
        int read = this.MediaBrowserCompat$CustomActionResultReceiver.read();
        if (read == -1) {
            return null;
        }
        InputStream inputStream = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = false;
        if (inputStream instanceof DiscoverFundFilterListAdapter$SubTitleHolder_ViewBinding) {
            ((DiscoverFundFilterListAdapter$SubTitleHolder_ViewBinding) inputStream).MediaBrowserCompat$ItemReceiver(false);
        }
        int MediaBrowserCompat$ItemReceiver = CompanyItemViewHolder.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, read);
        if ((read & 32) != 0) {
            z = true;
        }
        int write2 = CompanyItemViewHolder.write(this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer);
        if (write2 >= 0) {
            DiscoverFundFilterAdapter$SelectListHolder_ViewBinding discoverFundFilterAdapter$SelectListHolder_ViewBinding = new DiscoverFundFilterAdapter$SelectListHolder_ViewBinding(this.MediaBrowserCompat$CustomActionResultReceiver, write2);
            if ((read & 64) != 0) {
                return new InvestmentContextualAdsAdapter$AdViewHolder(z, MediaBrowserCompat$ItemReceiver, discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
            }
            if ((read & 128) != 0) {
                return new FundClientListAdapter$ItemViewHolder_ViewBinding(z, MediaBrowserCompat$ItemReceiver, new HmlDocumentsUploadedAdapter$DocumentViewHolder(discoverFundFilterAdapter$SelectListHolder_ViewBinding));
            }
            if (z) {
                if (MediaBrowserCompat$ItemReceiver == 4) {
                    return new InsurersAdapter$InsurersViewHolder(new HmlDocumentsUploadedAdapter$DocumentViewHolder(discoverFundFilterAdapter$SelectListHolder_ViewBinding));
                }
                if (MediaBrowserCompat$ItemReceiver == 8) {
                    return new C10405x15015106(new HmlDocumentsUploadedAdapter$DocumentViewHolder(discoverFundFilterAdapter$SelectListHolder_ViewBinding));
                }
                if (MediaBrowserCompat$ItemReceiver == 16) {
                    return new C10408xd106c67(new HmlDocumentsUploadedAdapter$DocumentViewHolder(discoverFundFilterAdapter$SelectListHolder_ViewBinding));
                }
                if (MediaBrowserCompat$ItemReceiver == 17) {
                    return new RiskLevelsAdapter$RiskLevelHolder(new HmlDocumentsUploadedAdapter$DocumentViewHolder(discoverFundFilterAdapter$SelectListHolder_ViewBinding));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unknown tag ");
                sb.append(MediaBrowserCompat$ItemReceiver);
                sb.append(" encountered");
                throw new IOException(sb.toString());
            } else if (MediaBrowserCompat$ItemReceiver == 4) {
                return new InvestmentDetailsClientListAdapter$NoFundViewHolder_ViewBinding(discoverFundFilterAdapter$SelectListHolder_ViewBinding);
            } else {
                try {
                    return CompanyItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver, discoverFundFilterAdapter$SelectListHolder_ViewBinding, this.write);
                } catch (IllegalArgumentException e) {
                    throw new ASN1Exception("corrupted stream detected", e);
                }
            }
        } else if (z) {
            HmlDocumentsUploadedAdapter$DocumentViewHolder hmlDocumentsUploadedAdapter$DocumentViewHolder = new HmlDocumentsUploadedAdapter$DocumentViewHolder(new DiscoverFundFilterListAdapter$SubTitleHolder_ViewBinding(this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer), this.IconCompatParcelizer);
            if ((read & 64) != 0) {
                return new HmlOutcomeCounterAdapter$UpsellOfferViewHolder(MediaBrowserCompat$ItemReceiver, hmlDocumentsUploadedAdapter$DocumentViewHolder);
            }
            if ((read & 128) != 0) {
                return new FundClientListAdapter$ItemViewHolder_ViewBinding(true, MediaBrowserCompat$ItemReceiver, hmlDocumentsUploadedAdapter$DocumentViewHolder);
            }
            if (MediaBrowserCompat$ItemReceiver == 4) {
                return new InsurersAdapter$InsurersViewHolder(hmlDocumentsUploadedAdapter$DocumentViewHolder);
            }
            if (MediaBrowserCompat$ItemReceiver == 8) {
                return new C10405x15015106(hmlDocumentsUploadedAdapter$DocumentViewHolder);
            }
            if (MediaBrowserCompat$ItemReceiver == 16) {
                return new HmlMoaAdapter$HmlMoaViewHolder(hmlDocumentsUploadedAdapter$DocumentViewHolder);
            }
            if (MediaBrowserCompat$ItemReceiver == 17) {
                return new HmlMoaAdapter$HmlMoaViewHolder_ViewBinding(hmlDocumentsUploadedAdapter$DocumentViewHolder);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unknown BER object encountered: 0x");
            sb2.append(Integer.toHexString(MediaBrowserCompat$ItemReceiver));
            throw new ASN1Exception(sb2.toString());
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    /* access modifiers changed from: package-private */
    public final CompanyItemViewHolder_ViewBinding write() throws IOException {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        while (true) {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding IconCompatParcelizer2 = IconCompatParcelizer();
            if (IconCompatParcelizer2 == null) {
                return companyItemViewHolder_ViewBinding;
            }
            if (IconCompatParcelizer2 instanceof DiscoverFundFilterAdapter$SubTitleHolder_ViewBinding) {
                companyItemViewHolder_ViewBinding.write.addElement(((DiscoverFundFilterAdapter$SubTitleHolder_ViewBinding) IconCompatParcelizer2).read());
            } else {
                companyItemViewHolder_ViewBinding.write.addElement(IconCompatParcelizer2.MediaBrowserCompat$MediaItem());
            }
        }
    }
}
