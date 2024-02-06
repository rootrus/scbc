package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.List;

/* renamed from: o.singletonIterator$MediaBrowserCompat$ItemReceiver */
public final /* synthetic */ class singletonIterator$MediaBrowserCompat$ItemReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<List<? extends setJointType>, EventBus> {
    public singletonIterator$MediaBrowserCompat$ItemReceiver(findMinGrandChild findmingrandchild) {
        super(1, findmingrandchild);
    }

    public final String getName() {
        return "transform";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(findMinGrandChild.class);
    }

    public final String getSignature() {
        return "transform(Ljava/util/List;)Lcom/scb/phone/presentation/model/display/csent/SensitiveConsentDisplay;";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str;
        setEndCap setendcap;
        String str2;
        List list = (List) obj;
        onGetStartedClick.write((Object) list, "p1");
        findMinGrandChild findmingrandchild = (findMinGrandChild) this.receiver;
        onGetStartedClick.write((Object) list, "source");
        setJointType setjointtype = (setJointType) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(list);
        setClickable setclickable = setjointtype.write;
        if (setclickable != null) {
            str = setclickable.write;
        } else {
            str = null;
        }
        String c_ = findmingrandchild.mo26549c_(str);
        onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(contentUrl?.originalContent)");
        Integer num = setjointtype.MediaDescriptionCompat;
        if (num != null) {
            int intValue = num.intValue();
            String str3 = setjointtype.MediaBrowserCompat$CustomActionResultReceiver;
            String str4 = setjointtype.IconCompatParcelizer;
            if (str4 != null) {
                String str5 = setjointtype.MediaBrowserCompat$ItemReceiver;
                if (str5 != null) {
                    List<setEndCap> list2 = setjointtype.read;
                    if (list2 != null && (setendcap = (setEndCap) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(list2)) != null && (str2 = setendcap.MediaBrowserCompat$CustomActionResultReceiver) != null) {
                        return new EventBus(c_, intValue, str3, str4, str5, str2);
                    }
                    throw new EntityMappingException("scopes can not null");
                }
                throw new EntityMappingException("consentVersion can not null");
            }
            throw new EntityMappingException("consentSubType can not null");
        }
        throw new EntityMappingException("sequence can not null");
    }
}
