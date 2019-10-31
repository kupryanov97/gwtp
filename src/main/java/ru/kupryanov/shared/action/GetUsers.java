package ru.kupryanov.shared.action;

import com.gwtplatform.dispatch.annotation.GenDispatch;
import com.gwtplatform.dispatch.annotation.Out;
import com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl;
import ru.kupryanov.shared.dto.Dto;

import java.util.List;

@GenDispatch(isSecure = false, serviceName = UnsecuredActionImpl.DEFAULT_SERVICE_NAME)
public class GetUsers {

    @Out(1)
    List<Dto> users;

}
