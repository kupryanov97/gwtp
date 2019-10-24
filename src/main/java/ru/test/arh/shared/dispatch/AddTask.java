package ru.test.arh.shared.dispatch;

import com.gwtplatform.dispatch.annotation.GenDispatch;
import com.gwtplatform.dispatch.annotation.In;
import com.gwtplatform.dispatch.annotation.Out;
import com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl;
import ru.test.arh.shared.dto.TableTestPojo1;

@GenDispatch(isSecure = false, serviceName = UnsecuredActionImpl.DEFAULT_SERVICE_NAME)
public class AddTask {
    @In(1)
    TableTestPojo1 task;

    @Out(1)
    TableTestPojo1 result;
}

