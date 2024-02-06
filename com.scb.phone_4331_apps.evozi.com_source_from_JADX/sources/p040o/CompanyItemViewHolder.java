package p040o;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1Exception;

/* renamed from: o.CompanyItemViewHolder */
public final class CompanyItemViewHolder extends FilterInputStream {
    private final byte[][] MediaBrowserCompat$ItemReceiver;
    final int read;
    private final boolean write;

    public CompanyItemViewHolder(InputStream inputStream) {
        this(inputStream, DiscoverTopListItemRecyclerAdapter$FundViewHolder.MediaBrowserCompat$ItemReceiver(inputStream));
    }

    public CompanyItemViewHolder(byte[] bArr) {
        this((InputStream) new ByteArrayInputStream(bArr), bArr.length);
    }

    public CompanyItemViewHolder(byte[] bArr, byte b) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    private CompanyItemViewHolder(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public CompanyItemViewHolder(InputStream inputStream, byte b) {
        this(inputStream, DiscoverTopListItemRecyclerAdapter$FundViewHolder.MediaBrowserCompat$ItemReceiver(inputStream), true);
    }

    private CompanyItemViewHolder(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.read = i;
        this.write = z;
        this.MediaBrowserCompat$ItemReceiver = new byte[11][];
    }

    private int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        return write(this, this.read);
    }

    private C10402xc503e64f MediaBrowserCompat$ItemReceiver(int i, int i2, int i3) throws IOException {
        boolean z = (i & 32) != 0;
        DiscoverFundFilterAdapter$SelectListHolder_ViewBinding discoverFundFilterAdapter$SelectListHolder_ViewBinding = new DiscoverFundFilterAdapter$SelectListHolder_ViewBinding(this, i3);
        if ((i & 64) != 0) {
            return new InvestmentContextualAdsAdapter$AdViewHolder(z, i2, discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
        }
        if ((i & 128) != 0) {
            return new HmlDocumentsUploadedAdapter$DocumentViewHolder(discoverFundFilterAdapter$SelectListHolder_ViewBinding).write(z, i2);
        }
        if (!z) {
            return MediaBrowserCompat$CustomActionResultReceiver(i2, discoverFundFilterAdapter$SelectListHolder_ViewBinding, this.MediaBrowserCompat$ItemReceiver);
        }
        if (i2 == 4) {
            CompanyItemViewHolder_ViewBinding read2 = read(discoverFundFilterAdapter$SelectListHolder_ViewBinding);
            int size = read2.write.size();
            C10905onItemClick[] onitemclickArr = new C10905onItemClick[size];
            for (int i4 = 0; i4 != size; i4++) {
                onitemclickArr[i4] = (C10905onItemClick) ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) read2.write.elementAt(i4));
            }
            return new HmlOutcomeCounterAdapter$UpsellOfferViewHolder_ViewBinding(onitemclickArr);
        } else if (i2 == 8) {
            return new InvestmentContextualAdsAdapter$AdViewHolder_ViewBinding(read(discoverFundFilterAdapter$SelectListHolder_ViewBinding));
        } else {
            if (i2 != 16) {
                if (i2 == 17) {
                    return C10406xd7645b0d.write(read(discoverFundFilterAdapter$SelectListHolder_ViewBinding));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unknown tag ");
                sb.append(i2);
                sb.append(" encountered");
                throw new IOException(sb.toString());
            } else if (this.write) {
                return new DiscoverFundsListAdapter$SuggestedFundHolder_ViewBinding(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
            } else {
                return C10406xd7645b0d.read(read(discoverFundFilterAdapter$SelectListHolder_ViewBinding));
            }
        }
    }

    private static CompanyItemViewHolder_ViewBinding read(DiscoverFundFilterAdapter$SelectListHolder_ViewBinding discoverFundFilterAdapter$SelectListHolder_ViewBinding) throws IOException {
        CompanyItemViewHolder companyItemViewHolder = new CompanyItemViewHolder((InputStream) discoverFundFilterAdapter$SelectListHolder_ViewBinding);
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        while (true) {
            C10402xc503e64f MediaBrowserCompat$ItemReceiver2 = companyItemViewHolder.MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver2 == null) {
                return companyItemViewHolder_ViewBinding;
            }
            companyItemViewHolder_ViewBinding.write.addElement(MediaBrowserCompat$ItemReceiver2);
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$ItemReceiver() throws IOException {
        int read2 = read();
        if (read2 > 0) {
            int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver((InputStream) this, read2);
            boolean z = (read2 & 32) != 0;
            int MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver >= 0) {
                try {
                    return MediaBrowserCompat$ItemReceiver(read2, MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$CustomActionResultReceiver);
                } catch (IllegalArgumentException e) {
                    throw new ASN1Exception("corrupted stream detected", e);
                }
            } else if (z) {
                HmlDocumentsUploadedAdapter$DocumentViewHolder hmlDocumentsUploadedAdapter$DocumentViewHolder = new HmlDocumentsUploadedAdapter$DocumentViewHolder(new DiscoverFundFilterListAdapter$SubTitleHolder_ViewBinding(this, this.read), this.read);
                if ((read2 & 64) != 0) {
                    return new HmlOutcomeCounterAdapter$UpsellOfferViewHolder(MediaBrowserCompat$ItemReceiver2, hmlDocumentsUploadedAdapter$DocumentViewHolder).read();
                }
                if ((read2 & 128) != 0) {
                    return new FundClientListAdapter$ItemViewHolder_ViewBinding(true, MediaBrowserCompat$ItemReceiver2, hmlDocumentsUploadedAdapter$DocumentViewHolder).read();
                }
                if (MediaBrowserCompat$ItemReceiver2 == 4) {
                    return new InsurersAdapter$InsurersViewHolder(hmlDocumentsUploadedAdapter$DocumentViewHolder).read();
                }
                if (MediaBrowserCompat$ItemReceiver2 == 8) {
                    return new C10405x15015106(hmlDocumentsUploadedAdapter$DocumentViewHolder).read();
                }
                if (MediaBrowserCompat$ItemReceiver2 == 16) {
                    return new HmlMoaAdapter$HmlMoaViewHolder(hmlDocumentsUploadedAdapter$DocumentViewHolder).read();
                }
                if (MediaBrowserCompat$ItemReceiver2 == 17) {
                    return new HmlMoaAdapter$HmlMoaViewHolder_ViewBinding(hmlDocumentsUploadedAdapter$DocumentViewHolder).read();
                }
                throw new IOException("unknown BER object encountered");
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else if (read2 != 0) {
            return null;
        } else {
            throw new IOException("unexpected end-of-contents marker");
        }
    }

    static int MediaBrowserCompat$ItemReceiver(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = 0;
        int read2 = inputStream.read();
        if ((read2 & 127) != 0) {
            while (read2 >= 0 && (read2 & 128) != 0) {
                i3 = (i3 | (read2 & 127)) << 7;
                read2 = inputStream.read();
            }
            if (read2 >= 0) {
                return i3 | (read2 & 127);
            }
            throw new EOFException("EOF found inside tag value.");
        }
        throw new IOException("corrupted stream - invalid high tag number found");
    }

    static int write(InputStream inputStream, int i) throws IOException {
        int read2 = inputStream.read();
        if (read2 < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (read2 == 128) {
            return -1;
        } else {
            if (read2 <= 127) {
                return read2;
            }
            int i2 = read2 & 127;
            if (i2 <= 4) {
                int i3 = 0;
                int i4 = 0;
                while (i4 < i2) {
                    int read3 = inputStream.read();
                    if (read3 >= 0) {
                        i3 = (i3 << 8) + read3;
                        i4++;
                    } else {
                        throw new EOFException("EOF found reading length");
                    }
                }
                if (i3 < 0) {
                    throw new IOException("corrupted stream - negative length found");
                } else if (i3 < i) {
                    return i3;
                } else {
                    throw new IOException("corrupted stream - out of bounds length found");
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("DER length more than 4 bytes: ");
                sb.append(i2);
                throw new IOException(sb.toString());
            }
        }
    }

    static C10402xc503e64f MediaBrowserCompat$CustomActionResultReceiver(int i, DiscoverFundFilterAdapter$SelectListHolder_ViewBinding discoverFundFilterAdapter$SelectListHolder_ViewBinding, byte[][] bArr) throws IOException {
        if (i == 10) {
            return HmlAboutAdapter$HmlAboutViewHolder.write(MediaBrowserCompat$ItemReceiver(discoverFundFilterAdapter$SelectListHolder_ViewBinding, bArr));
        }
        if (i == 12) {
            return new ScbsProductAdapter$ScbsProductViewHolder(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
        }
        if (i == 30) {
            return new FundClientListAdapter$ItemViewHolder(MediaBrowserCompat$ItemReceiver(discoverFundFilterAdapter$SelectListHolder_ViewBinding));
        }
        switch (i) {
            case 1:
                return FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver(discoverFundFilterAdapter$SelectListHolder_ViewBinding, bArr));
            case 2:
                return new HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write(), false);
            case 3:
                return C10399x149eb6a1.write(discoverFundFilterAdapter$SelectListHolder_ViewBinding.IconCompatParcelizer, (InputStream) discoverFundFilterAdapter$SelectListHolder_ViewBinding);
            case 4:
                return new C10407x3ea8e030(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
            case 5:
                return InvestmentDetailsClientListAdapter$NoFundViewHolder.write;
            case 6:
                return HmlBusinessInfoAdapter$BankAccountViewHolder.write(MediaBrowserCompat$ItemReceiver(discoverFundFilterAdapter$SelectListHolder_ViewBinding, bArr));
            default:
                switch (i) {
                    case 18:
                        return new InvestmentDetailsClientListAdapter$FooterViewHolder(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
                    case 19:
                        return new InvestmentDetailsClientListAdapter$SingleViewHolder(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
                    case 20:
                        return new BasicAssetAllocationAdapter$BaaHolder(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
                    case 21:
                        return new CategoriesAdapter$CategoriesHolder(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
                    case 22:
                        return new InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
                    case 23:
                        return new HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
                    case 24:
                        return new HelpAdapter$MoreOptionsHolder_ViewBinding(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
                    case 25:
                        return new InvestmentDetailsClientListAdapter$FooterViewHolder_ViewBinding(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
                    case 26:
                        return new CategoriesAdapter$CategoriesHolder_ViewBinding(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
                    case 27:
                        return new InvestmentDetailsAssetGroupListAdapter$AssetGroupView(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
                    case 28:
                        return new DiscoverFundFilterAdapter$CheckListHolder_ViewBinding(discoverFundFilterAdapter$SelectListHolder_ViewBinding.write());
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unknown tag ");
                        sb.append(i);
                        sb.append(" encountered");
                        throw new IOException(sb.toString());
                }
        }
    }

    private static char[] MediaBrowserCompat$ItemReceiver(DiscoverFundFilterAdapter$SelectListHolder_ViewBinding discoverFundFilterAdapter$SelectListHolder_ViewBinding) throws IOException {
        int read2;
        int i = discoverFundFilterAdapter$SelectListHolder_ViewBinding.IconCompatParcelizer / 2;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            int read3 = discoverFundFilterAdapter$SelectListHolder_ViewBinding.read();
            if (read3 < 0 || (read2 = discoverFundFilterAdapter$SelectListHolder_ViewBinding.read()) < 0) {
                break;
            }
            cArr[i2] = (char) ((read3 << 8) | (read2 & 255));
        }
        return cArr;
    }

    private static byte[] MediaBrowserCompat$ItemReceiver(DiscoverFundFilterAdapter$SelectListHolder_ViewBinding discoverFundFilterAdapter$SelectListHolder_ViewBinding, byte[][] bArr) throws IOException {
        int i = discoverFundFilterAdapter$SelectListHolder_ViewBinding.IconCompatParcelizer;
        if (discoverFundFilterAdapter$SelectListHolder_ViewBinding.IconCompatParcelizer >= bArr.length) {
            return discoverFundFilterAdapter$SelectListHolder_ViewBinding.write();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        C6961xbba4702b.MediaBrowserCompat$ItemReceiver(discoverFundFilterAdapter$SelectListHolder_ViewBinding, bArr2, bArr2.length);
        return bArr2;
    }
}
