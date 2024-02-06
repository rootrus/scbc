package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import org.threeten.p041bp.OffsetDateTime;
import p040o.C1251R;
import p040o.OnItemSelected;
import p040o.OnTextChanged;
import p040o.zaaw;
import p040o.zzxc;

/* renamed from: o.zzgb */
public final class zzgb implements IIdExtractor {
    final getKernelIDSrc MediaBrowserCompat$CustomActionResultReceiver;
    final onActivityResumed MediaBrowserCompat$ItemReceiver;
    private final zaaw write;

    /* renamed from: o.zzgb$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object write(Object obj) {
            List list = (List) obj;
            onGetStartedClick.write((Object) list, "it");
            Iterable<OnItemSelected.Callback> iterable = list;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (OnItemSelected.Callback callback : iterable) {
                arrayList.add(new zzxc.zzb(callback.write, callback.MediaBrowserCompat$ItemReceiver, callback.MediaBrowserCompat$CustomActionResultReceiver, callback.IconCompatParcelizer, Double.parseDouble(callback.MediaBrowserCompat$MediaItem), Double.parseDouble(callback.MediaBrowserCompat$SearchResultReceiver), Double.parseDouble(callback.read), Integer.parseInt(callback.MediaDescriptionCompat)));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: o.zzgb$read */
    static final class read<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final read write = new read();

        read() {
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            OnTextChanged.Callback callback = (OnTextChanged.Callback) singleDataEntity.getData();
            return new zzxe(Integer.parseInt(callback.MediaBrowserCompat$ItemReceiver), onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) callback.read, (Object) DiskLruCache.VERSION_1));
        }
    }

    /* renamed from: o.zzgb$write */
    static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzgb write;

        write(zzgb zzgb) {
            this.write = zzgb;
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            onActivityResumed onactivityresumed = this.write.MediaBrowserCompat$ItemReceiver;
            Object data = singleDataEntity.getData();
            onGetStartedClick.IconCompatParcelizer(data, "it.data");
            C1251R.attr attr = (C1251R.attr) data;
            onGetStartedClick.write((Object) attr, "entity");
            return new zzxc.zzc(FragmentBuilder_BindSummaryFragment.write(attr.read, (OffsetDateTime) null), Integer.parseInt(attr.MediaBrowserCompat$ItemReceiver), attr.write, attr.IconCompatParcelizer);
        }
    }

    public zzgb(zaaw zaaw, onActivityResumed onactivityresumed, getKernelIDSrc getkernelidsrc) {
        onGetStartedClick.write((Object) zaaw, "api");
        onGetStartedClick.write((Object) onactivityresumed, "qrBarcodeEntityMapper");
        onGetStartedClick.write((Object) getkernelidsrc, "cache");
        this.write = zaaw;
        this.MediaBrowserCompat$ItemReceiver = onactivityresumed;
        this.MediaBrowserCompat$CustomActionResultReceiver = getkernelidsrc;
    }

    public final BScanCNotificationDeepLinkActivity<List<zzxc.zzb>> write(String str) {
        onGetStartedClick.write((Object) str, "postingType");
        if (this.MediaBrowserCompat$CustomActionResultReceiver.write.isEmpty()) {
            zaaw zaaw = this.write;
            onGetStartedClick.write((Object) str, "postingType");
            BScanCNotificationDeepLinkActivity<SingleDataEntity<OnTouch>> agents = zaaw.write.getAgents(str);
            DirectDebitDeepLinkActivity directDebitDeepLinkActivity = zaaw.read.MediaBrowserCompat$CustomActionResultReceiver;
            HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
            onCopy oncopy = new onCopy(agents, directDebitDeepLinkActivity);
            onGetStartedClick.IconCompatParcelizer((Object) oncopy, "bankingAgentService.getA…map { it.data.agentList }");
            DirectDebitDeepLinkActivity directDebitDeepLinkActivity2 = IconCompatParcelizer.read;
            HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity2, "mapper is null");
            onCopy oncopy2 = new onCopy(oncopy, directDebitDeepLinkActivity2);
            DebitCardMarketConductDeepLinkActivity zzgb_mediabrowsercompat_customactionresultreceiver = new zzgb$MediaBrowserCompat$CustomActionResultReceiver(this);
            HmlLatestPersonalInformationDeepLinkActivity.write(zzgb_mediabrowsercompat_customactionresultreceiver, "onSuccess is null");
            ReviewDeviceActivity_ViewBinding reviewDeviceActivity_ViewBinding = new ReviewDeviceActivity_ViewBinding(oncopy2, zzgb_mediabrowsercompat_customactionresultreceiver);
            onGetStartedClick.IconCompatParcelizer((Object) reviewDeviceActivity_ViewBinding, "api.getAgents(postingTyp…ess { cache.agents = it }");
            return reviewDeviceActivity_ViewBinding;
        }
        BScanCNotificationDeepLinkActivity<List<zzxc.zzb>> read2 = BScanCNotificationDeepLinkActivity.read(this.MediaBrowserCompat$CustomActionResultReceiver.write);
        onGetStartedClick.IconCompatParcelizer((Object) read2, "Single.just(cache.agents)");
        return read2;
    }

    public final BScanCNotificationDeepLinkActivity<zzxe> MediaBrowserCompat$ItemReceiver() {
        BScanCNotificationDeepLinkActivity<SingleDataEntity<OnTextChanged.Callback>> tcVersion = this.write.write.getTcVersion();
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = read.write;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(tcVersion, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "api.getTcVersion().map {… it.data.toDomain()\n    }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<zzxc.zzc> read(ComputingConcurrentHashMap computingConcurrentHashMap) {
        onGetStartedClick.write((Object) computingConcurrentHashMap, "generateQRRequest");
        zaaw zaaw = this.write;
        onGetStartedClick.write((Object) computingConcurrentHashMap, "generateQRRequest");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<C1251R.attr>> generateQRBarcode = zaaw.write.generateQRBarcode(computingConcurrentHashMap);
        DirectDebitDeepLinkActivity write2 = new write(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(write2, "mapper is null");
        onCopy oncopy = new onCopy(generateQRBarcode, write2);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "api.generateQRBarcode(ge…rm(it.data)\n            }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<zzxb> IconCompatParcelizer(String str, String str2, String str3, String str4, String str5, String str6) {
        onGetStartedClick.write((Object) str, "accountFromNo");
        onGetStartedClick.write((Object) str2, "agentCode");
        onGetStartedClick.write((Object) str3, "agentName");
        onGetStartedClick.write((Object) str4, "transactionType");
        onGetStartedClick.write((Object) str5, "amount");
        onGetStartedClick.write((Object) str6, "postingType");
        zaaw zaaw = this.write;
        onGetStartedClick.write((Object) str, "accountFromNo");
        onGetStartedClick.write((Object) str2, "agentCode");
        onGetStartedClick.write((Object) str3, "agentName");
        onGetStartedClick.write((Object) str4, "transactionType");
        onGetStartedClick.write((Object) str5, "amount");
        onGetStartedClick.write((Object) str6, "postingType");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<Optional>> validateBankingAgent = zaaw.write.validateBankingAgent(new ComparisonChain(str, str2, str3, str4, str5, str6));
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = zzgb$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(validateBankingAgent, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "api.validateBankingAgent…ap { it.data.toDomain() }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<Boolean> MediaBrowserCompat$ItemReceiver(classify classify) {
        onGetStartedClick.write((Object) classify, "request");
        zaaw zaaw = this.write;
        onGetStartedClick.write((Object) classify, "request");
        BScanCNotificationDeepLinkActivity<setCurrentItemInternal> acceptTc = zaaw.write.acceptTc(classify);
        DirectDebitDeepLinkActivity zzgb_mediabrowsercompat_itemreceiver = new zzgb$MediaBrowserCompat$ItemReceiver(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(zzgb_mediabrowsercompat_itemreceiver, "mapper is null");
        onCopy oncopy = new onCopy(acceptTc, zzgb_mediabrowsercompat_itemreceiver);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "api.acceptTc(request).ma…ityMapper.transform(it) }");
        return oncopy;
    }

    public final void read() {
        this.MediaBrowserCompat$CustomActionResultReceiver.write = HmlNationalIdActivity.IconCompatParcelizer;
    }
}
