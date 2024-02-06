package p040o;

import java.util.List;
import java.util.Map;

/* renamed from: o.onClickTrade */
public interface onClickTrade<R> extends SCBSProductDetailActivity {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    List<Object> getParameters();

    ScbsOnboardingLaserIdActivity getReturnType();

    List<Object> getTypeParameters();

    ScbsOnboardingConsentActivity getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
