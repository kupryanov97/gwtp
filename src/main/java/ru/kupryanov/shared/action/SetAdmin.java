package ru.kupryanov.shared.action;

import com.gwtplatform.dispatch.annotation.GenDispatch;
import com.gwtplatform.dispatch.annotation.In;
import com.gwtplatform.dispatch.annotation.Out;
import com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl;
import ru.kupryanov.shared.dto.Dto;

@GenDispatch(isSecure = false, serviceName = UnsecuredActionImpl.DEFAULT_SERVICE_NAME)
public class SetAdmin {

    @In(1)
    Long userId;
    @In(2)
    Boolean value;

    @Out(1)
    Dto userDto;

}