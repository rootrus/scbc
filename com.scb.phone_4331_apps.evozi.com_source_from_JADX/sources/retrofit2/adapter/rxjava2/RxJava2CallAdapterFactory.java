package retrofit2.adapter.rxjava2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.BankingAgentDeepLinkActivity;
import p040o.DebitCardCoachMarkActivity;
import p040o.DebitCardRequestReviewActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.DebitCardSaleSheetActivity;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

public final class RxJava2CallAdapterFactory extends CallAdapter.Factory {
    private final boolean isAsync;
    private final BankingAgentDeepLinkActivity scheduler;

    public static RxJava2CallAdapterFactory create() {
        return new RxJava2CallAdapterFactory((BankingAgentDeepLinkActivity) null, false);
    }

    public static RxJava2CallAdapterFactory createAsync() {
        return new RxJava2CallAdapterFactory((BankingAgentDeepLinkActivity) null, true);
    }

    public static RxJava2CallAdapterFactory createWithScheduler(BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        if (bankingAgentDeepLinkActivity != null) {
            return new RxJava2CallAdapterFactory(bankingAgentDeepLinkActivity, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    private RxJava2CallAdapterFactory(BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z) {
        this.scheduler = bankingAgentDeepLinkActivity;
        this.isAsync = z;
    }

    public final CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        boolean z;
        boolean z2;
        Type type2;
        Class<?> rawType = getRawType(type);
        if (rawType == DebitCardCoachMarkActivity.class) {
            return new RxJava2CallAdapter(Void.class, this.scheduler, this.isAsync, false, true, false, false, false, true);
        }
        boolean z3 = rawType == DebitCardRequestReviewActivity.class;
        boolean z4 = rawType == BScanCNotificationDeepLinkActivity.class;
        boolean z5 = rawType == DebitCardSaleSheetActivity.class;
        if (rawType != DebitCardResetOtpActivity.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z3 ? !z4 ? z5 ? "Maybe" : "Observable" : "Single" : "Flowable";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" return type must be parameterized as ");
            sb.append(str);
            sb.append("<Foo> or ");
            sb.append(str);
            sb.append("<? extends Foo>");
            throw new IllegalStateException(sb.toString());
        }
        Type parameterUpperBound = getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType2 = getRawType(parameterUpperBound);
        if (rawType2 == Response.class) {
            if (parameterUpperBound instanceof ParameterizedType) {
                type2 = getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                z2 = false;
                z = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (rawType2 != Result.class) {
            type2 = parameterUpperBound;
            z = true;
            z2 = false;
        } else if (parameterUpperBound instanceof ParameterizedType) {
            type2 = getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
            z2 = true;
            z = false;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        return new RxJava2CallAdapter(type2, this.scheduler, this.isAsync, z2, z, z3, z4, z5, false);
    }
}
