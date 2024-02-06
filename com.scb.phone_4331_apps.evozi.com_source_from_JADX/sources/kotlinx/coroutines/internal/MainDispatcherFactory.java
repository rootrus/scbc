package kotlinx.coroutines.internal;

import java.util.List;
import p040o.onEditNicknameClick;

public interface MainDispatcherFactory {
    onEditNicknameClick createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
