package p040o;

import java.util.Random;

/* renamed from: o.RoboAdvisorLandingActivity */
public abstract class RoboAdvisorLandingActivity extends AddAccountInfoActivity {
    public abstract Random read();

    public final int IconCompatParcelizer(int i) {
        return ((-i) >> 31) & (read().nextInt() >>> (32 - i));
    }

    public final int write() {
        return read().nextInt();
    }
}
