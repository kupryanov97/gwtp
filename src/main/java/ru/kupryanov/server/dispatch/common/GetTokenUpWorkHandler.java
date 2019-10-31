package ru.kupryanov.server.dispatch.common;

import ru.kupryanov.domain.AppUser;
import ru.kupryanov.server.ServerUtils;
import ru.kupryanov.server.dao.AppUserDao;
import ru.kupryanov.server.dispatch.MyAbstractActionHandler;
import ru.kupryanov.server.upwork.request.UpworkAuthClient;
import ru.kupryanov.shared.action.GetTokenUpWorkAction;
import ru.kupryanov.shared.action.GetTokenUpWorkResult;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

import java.net.URL;
import java.util.HashMap;

public class GetTokenUpWorkHandler extends MyAbstractActionHandler<GetTokenUpWorkAction, GetTokenUpWorkResult> {



    public static HashMap<String, UpworkAuthClient> hash = new HashMap<String,UpworkAuthClient>();

    @Inject
    public GetTokenUpWorkHandler() {
        super(GetTokenUpWorkAction.class);
    }


    @Override
    public GetTokenUpWorkResult execute(GetTokenUpWorkAction action, ExecutionContext context) throws ActionException {

        String authzUrl = null;
        try {

            UpworkAuthClient upworkClient = new UpworkAuthClient();
            authzUrl = upworkClient.getAuthorizationUrl();

            System.out.println(authzUrl);
            //FIX THIS
            URL test = new URL(authzUrl);
            AppUserDao appUserDao = new AppUserDao();
            AppUser appUser = appUserDao.get(action.getUserId());

            appUser.setOauth_token(test.getQuery().substring(12));

            ServerUtils.createUserDto(true, appUserDao.saveAndReturn(appUser)); //
            hash.put(action.getUserId().toString(),upworkClient); //Fix This



        }catch (Exception e){
            e.printStackTrace();
            return new GetTokenUpWorkResult(null);
        }

        return new GetTokenUpWorkResult(authzUrl);
    }


}

