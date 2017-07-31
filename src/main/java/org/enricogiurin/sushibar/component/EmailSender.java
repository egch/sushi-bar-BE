package org.enricogiurin.sushibar.component;

import org.enricogiurin.sushibar.po.UserDTO;

/**
 * Created by enrico on 7/8/17.
 */
public interface EmailSender {

    void sendEmail(UserDTO user, String url);
}