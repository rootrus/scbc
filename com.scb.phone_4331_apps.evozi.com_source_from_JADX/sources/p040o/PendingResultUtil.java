package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.PendingResultUtil */
public final /* synthetic */ class PendingResultUtil implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindScbsMaritalStatusFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ PendingResultUtil(FragmentBuilder_BindScbsMaritalStatusFragment fragmentBuilder_BindScbsMaritalStatusFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindScbsMaritalStatusFragment;
    }

    /* renamed from: o.PendingResultUtil$zaa */
    public final /* synthetic */ class zaa implements DirectDebitDeepLinkActivity {
        public /* synthetic */ zaa(FragmentBuilder_BindThirdPartySlipFragment fragmentBuilder_BindThirdPartySlipFragment) {
        }

        public final Object write(Object obj) {
            getAnimatedValueAbsolute getanimatedvalueabsolute = (getAnimatedValueAbsolute) obj;
            setOnCameraIdleListener setoncameraidlelistener = new setOnCameraIdleListener();
            setoncameraidlelistener.MediaBrowserCompat$CustomActionResultReceiver = getanimatedvalueabsolute.IconCompatParcelizer;
            setoncameraidlelistener.MediaBrowserCompat$ItemReceiver = getanimatedvalueabsolute.MediaBrowserCompat$CustomActionResultReceiver.write;
            setoncameraidlelistener.write = getanimatedvalueabsolute.read;
            return setoncameraidlelistener;
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read = (SingleDataEntity) obj;
    }

    /* renamed from: o.PendingResultUtil$ResultConverter */
    public final /* synthetic */ class ResultConverter implements DirectDebitDeepLinkActivity {
        public /* synthetic */ ResultConverter(setCredentialHintPickerConfig setcredentialhintpickerconfig) {
        }

        public final Object write(Object obj) {
            notifySuccessListeners notifysuccesslisteners = (notifySuccessListeners) obj;
            onGetStartedClick.write((Object) notifysuccesslisteners, "easycashReferralLandingEntity");
            Iterable<LottieTask> iterable = notifysuccesslisteners.write;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (LottieTask lottieTask : iterable) {
                if (lottieTask.write == null) {
                    throw new EntityMappingException("EasycashConsentDocumentEntity: data.consentDocuments.content is null", (Throwable) null);
                } else if (lottieTask.read != null) {
                    arrayList.add(new BillerAdapter$ItemViewHolder(lottieTask.write, lottieTask.read, lottieTask.IconCompatParcelizer));
                } else {
                    throw new EntityMappingException("EasycashConsentDocumentEntity: data.consentDocuments.consentType is null", (Throwable) null);
                }
            }
            return (List) arrayList;
        }
    }
}
