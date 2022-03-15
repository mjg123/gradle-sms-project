package com.company;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class Main {

    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static void main(String[] args) {

    // Didn't need the first argument here
    //        Twilio.init("myUserName", ACCOUNT_SID, AUTH_TOKEN);

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new com.twilio.type.PhoneNumber("MY_CELL_NUMBER"),
            new com.twilio.type.PhoneNumber("MY_TWILIO_NUMBER"),
            "We're in quite a kerfuffle").create();

        System.out.println(message.getSid());

    }
}