package p040o;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: o.DiscoverSearchActivity */
public abstract class DiscoverSearchActivity implements onClickTrade, Serializable {
    public static final Object NO_RECEIVER = DiscoverSearchActivity$MediaBrowserCompat$ItemReceiver.read;
    public final Object receiver;
    private transient onClickTrade reflected;

    /* access modifiers changed from: protected */
    public abstract onClickTrade computeReflected();

    public DiscoverSearchActivity() {
        this(NO_RECEIVER);
    }

    protected DiscoverSearchActivity(Object obj) {
        this.receiver = obj;
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public onClickTrade compute() {
        onClickTrade onclicktrade = this.reflected;
        if (onclicktrade != null) {
            return onclicktrade;
        }
        onClickTrade computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public onClickTrade getReflected() {
        onClickTrade compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new InvestmentDetailsActivity();
    }

    public CheckSCBSEligibilityActivity getOwner() {
        throw new AbstractMethodError();
    }

    public String getName() {
        throw new AbstractMethodError();
    }

    public String getSignature() {
        throw new AbstractMethodError();
    }

    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public ScbsOnboardingLaserIdActivity getReturnType() {
        return getReflected().getReturnType();
    }

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public ScbsOnboardingConsentActivity getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
