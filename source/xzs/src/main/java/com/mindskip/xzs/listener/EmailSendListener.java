package com.mindskip.xzs.listener;

import com.mindskip.xzs.domain.User;
import com.mindskip.xzs.event.OnRegistrationCompleteEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;


/**
 * @author 边佳慧
 */
@Component
public class EmailSendListener implements ApplicationListener<OnRegistrationCompleteEvent> {

    @Override
    @NonNull
    public void onApplicationEvent(OnRegistrationCompleteEvent event) {
        User user = event.getUser();
        System.out.println("User register Email sender :" + user.getUserName());
    }
}
